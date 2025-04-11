package com.dao;

import com.entity.YonghufenxiangEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YonghufenxiangView;

/**
 * 用户分享 Dao 接口
 *
 * @author 
 */
public interface YonghufenxiangDao extends BaseMapper<YonghufenxiangEntity> {

   List<YonghufenxiangView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
