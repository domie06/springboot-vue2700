
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 新闻信息
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/xinwen")
public class XinwenController {
    private static final Logger logger = LoggerFactory.getLogger(XinwenController.class);

    @Autowired
    private XinwenService xinwenService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service

    @Autowired
    private YonghuService yonghuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("用户".equals(role))
            params.put("yonghuId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = xinwenService.queryPage(params);

        //字典表数据转换
        List<XinwenView> list =(List<XinwenView>)page.getList();
        for(XinwenView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        XinwenEntity xinwen = xinwenService.selectById(id);
        if(xinwen !=null){
            //entity转view
            XinwenView view = new XinwenView();
            BeanUtils.copyProperties( xinwen , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody XinwenEntity xinwen, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,xinwen:{}",this.getClass().getName(),xinwen.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<XinwenEntity> queryWrapper = new EntityWrapper<XinwenEntity>()
            .eq("xinwen_name", xinwen.getXinwenName())
            .eq("xinwen_types", xinwen.getXinwenTypes())
            .eq("xinwen_address", xinwen.getXinwenAddress())
            .eq("xinwen_video", xinwen.getXinwenVideo())
            .eq("zan_number", xinwen.getZanNumber())
            .eq("cai_number", xinwen.getCaiNumber())
            .eq("xinwen_clicknum", xinwen.getXinwenClicknum())
            .eq("insert_time", new SimpleDateFormat("yyyy-MM-dd").format(new Date()))
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        XinwenEntity xinwenEntity = xinwenService.selectOne(queryWrapper);
        if(xinwenEntity==null){
            xinwen.setXinwenClicknum(1);
            xinwen.setInsertTime(new Date());
            xinwen.setCreateTime(new Date());
            xinwenService.insert(xinwen);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody XinwenEntity xinwen, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,xinwen:{}",this.getClass().getName(),xinwen.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        //根据字段查询是否有相同数据
        Wrapper<XinwenEntity> queryWrapper = new EntityWrapper<XinwenEntity>()
            .notIn("id",xinwen.getId())
            .andNew()
            .eq("xinwen_name", xinwen.getXinwenName())
            .eq("xinwen_types", xinwen.getXinwenTypes())
            .eq("xinwen_address", xinwen.getXinwenAddress())
            .eq("xinwen_video", xinwen.getXinwenVideo())
            .eq("zan_number", xinwen.getZanNumber())
            .eq("cai_number", xinwen.getCaiNumber())
            .eq("xinwen_clicknum", xinwen.getXinwenClicknum())
            .eq("insert_time", new SimpleDateFormat("yyyy-MM-dd").format(xinwen.getInsertTime()))
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        XinwenEntity xinwenEntity = xinwenService.selectOne(queryWrapper);
        if("".equals(xinwen.getXinwenPhoto()) || "null".equals(xinwen.getXinwenPhoto())){
                xinwen.setXinwenPhoto(null);
        }
        if("".equals(xinwen.getXinwenVideo()) || "null".equals(xinwen.getXinwenVideo())){
                xinwen.setXinwenVideo(null);
        }
        if(xinwenEntity==null){
            xinwenService.updateById(xinwen);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        xinwenService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        try {
            List<XinwenEntity> xinwenList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            XinwenEntity xinwenEntity = new XinwenEntity();
//                            xinwenEntity.setXinwenName(data.get(0));                    //新闻标题 要改的
//                            xinwenEntity.setXinwenTypes(Integer.valueOf(data.get(0)));   //新闻类别 要改的
//                            xinwenEntity.setXinwenAddress(data.get(0));                    //新闻地区 要改的
//                            xinwenEntity.setXinwenPhoto("");//照片
//                            xinwenEntity.setXinwenVideo(data.get(0));                    //新闻视频 要改的
//                            xinwenEntity.setZanNumber(Integer.valueOf(data.get(0)));   //赞 要改的
//                            xinwenEntity.setCaiNumber(Integer.valueOf(data.get(0)));   //踩 要改的
//                            xinwenEntity.setXinwenClicknum(Integer.valueOf(data.get(0)));   //点击次数 要改的
//                            xinwenEntity.setInsertTime(date);//时间
//                            xinwenEntity.setXinwenContent("");//照片
//                            xinwenEntity.setCreateTime(date);//时间
                            xinwenList.add(xinwenEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        xinwenService.insertBatch(xinwenList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }





    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        // 没有指定排序字段就默认id倒序
        if(StringUtil.isEmpty(String.valueOf(params.get("orderBy")))){
            params.put("orderBy","id");
        }
        PageUtils page = xinwenService.queryPage(params);

        //字典表数据转换
        List<XinwenView> list =(List<XinwenView>)page.getList();
        for(XinwenView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段
        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        XinwenEntity xinwen = xinwenService.selectById(id);
            if(xinwen !=null){

                //点击数量加1
                xinwen.setXinwenClicknum(xinwen.getXinwenClicknum()+1);
                xinwenService.updateById(xinwen);

                //entity转view
                XinwenView view = new XinwenView();
                BeanUtils.copyProperties( xinwen , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody XinwenEntity xinwen, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,xinwen:{}",this.getClass().getName(),xinwen.toString());
        Wrapper<XinwenEntity> queryWrapper = new EntityWrapper<XinwenEntity>()
            .eq("xinwen_name", xinwen.getXinwenName())
            .eq("xinwen_types", xinwen.getXinwenTypes())
            .eq("xinwen_address", xinwen.getXinwenAddress())
            .eq("xinwen_video", xinwen.getXinwenVideo())
            .eq("zan_number", xinwen.getZanNumber())
            .eq("cai_number", xinwen.getCaiNumber())
            .eq("xinwen_clicknum", xinwen.getXinwenClicknum())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        XinwenEntity xinwenEntity = xinwenService.selectOne(queryWrapper);
        if(xinwenEntity==null){
            xinwen.setInsertTime(new Date());
            xinwen.setCreateTime(new Date());
        xinwenService.insert(xinwen);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }


}
