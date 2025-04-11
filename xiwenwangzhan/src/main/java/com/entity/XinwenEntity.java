package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 新闻信息
 *
 * @author 
 * @email
 */
@TableName("xinwen")
public class XinwenEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XinwenEntity() {

	}

	public XinwenEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 新闻标题
     */
    @TableField(value = "xinwen_name")

    private String xinwenName;


    /**
     * 新闻类别
     */
    @TableField(value = "xinwen_types")

    private Integer xinwenTypes;


    /**
     * 新闻地区
     */
    @TableField(value = "xinwen_address")

    private String xinwenAddress;


    /**
     * 新闻图片
     */
    @TableField(value = "xinwen_photo")

    private String xinwenPhoto;


    /**
     * 新闻视频
     */
    @TableField(value = "xinwen_video")

    private String xinwenVideo;


    /**
     * 赞
     */
    @TableField(value = "zan_number")

    private Integer zanNumber;


    /**
     * 踩
     */
    @TableField(value = "cai_number")

    private Integer caiNumber;


    /**
     * 点击次数
     */
    @TableField(value = "xinwen_clicknum")

    private Integer xinwenClicknum;


    /**
     * 发布日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 新闻详情
     */
    @TableField(value = "xinwen_content")

    private String xinwenContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：新闻标题
	 */
    public String getXinwenName() {
        return xinwenName;
    }


    /**
	 * 获取：新闻标题
	 */

    public void setXinwenName(String xinwenName) {
        this.xinwenName = xinwenName;
    }
    /**
	 * 设置：新闻类别
	 */
    public Integer getXinwenTypes() {
        return xinwenTypes;
    }


    /**
	 * 获取：新闻类别
	 */

    public void setXinwenTypes(Integer xinwenTypes) {
        this.xinwenTypes = xinwenTypes;
    }
    /**
	 * 设置：新闻地区
	 */
    public String getXinwenAddress() {
        return xinwenAddress;
    }


    /**
	 * 获取：新闻地区
	 */

    public void setXinwenAddress(String xinwenAddress) {
        this.xinwenAddress = xinwenAddress;
    }
    /**
	 * 设置：新闻图片
	 */
    public String getXinwenPhoto() {
        return xinwenPhoto;
    }


    /**
	 * 获取：新闻图片
	 */

    public void setXinwenPhoto(String xinwenPhoto) {
        this.xinwenPhoto = xinwenPhoto;
    }
    /**
	 * 设置：新闻视频
	 */
    public String getXinwenVideo() {
        return xinwenVideo;
    }


    /**
	 * 获取：新闻视频
	 */

    public void setXinwenVideo(String xinwenVideo) {
        this.xinwenVideo = xinwenVideo;
    }
    /**
	 * 设置：赞
	 */
    public Integer getZanNumber() {
        return zanNumber;
    }


    /**
	 * 获取：赞
	 */

    public void setZanNumber(Integer zanNumber) {
        this.zanNumber = zanNumber;
    }
    /**
	 * 设置：踩
	 */
    public Integer getCaiNumber() {
        return caiNumber;
    }


    /**
	 * 获取：踩
	 */

    public void setCaiNumber(Integer caiNumber) {
        this.caiNumber = caiNumber;
    }
    /**
	 * 设置：点击次数
	 */
    public Integer getXinwenClicknum() {
        return xinwenClicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setXinwenClicknum(Integer xinwenClicknum) {
        this.xinwenClicknum = xinwenClicknum;
    }
    /**
	 * 设置：发布日期
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：发布日期
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：新闻详情
	 */
    public String getXinwenContent() {
        return xinwenContent;
    }


    /**
	 * 获取：新闻详情
	 */

    public void setXinwenContent(String xinwenContent) {
        this.xinwenContent = xinwenContent;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Xinwen{" +
            "id=" + id +
            ", xinwenName=" + xinwenName +
            ", xinwenTypes=" + xinwenTypes +
            ", xinwenAddress=" + xinwenAddress +
            ", xinwenPhoto=" + xinwenPhoto +
            ", xinwenVideo=" + xinwenVideo +
            ", zanNumber=" + zanNumber +
            ", caiNumber=" + caiNumber +
            ", xinwenClicknum=" + xinwenClicknum +
            ", insertTime=" + insertTime +
            ", xinwenContent=" + xinwenContent +
            ", createTime=" + createTime +
        "}";
    }
}
