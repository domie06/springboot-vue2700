package com.entity.vo;

import com.entity.YonghufenxiangEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 用户分享
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("yonghufenxiang")
public class YonghufenxiangVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 分享标题
     */

    @TableField(value = "yonghufenxiang_name")
    private String yonghufenxiangName;


    /**
     * 分享类型
     */

    @TableField(value = "yonghufenxiang_types")
    private Integer yonghufenxiangTypes;


    /**
     * 分享图片
     */

    @TableField(value = "yonghufenxiang_photo")
    private String yonghufenxiangPhoto;


    /**
     * 分享视频
     */

    @TableField(value = "yonghufenxiang_video")
    private String yonghufenxiangVideo;


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

    @TableField(value = "clicknum")
    private Integer clicknum;


    /**
     * 发布日期
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 审核状态
     */

    @TableField(value = "yonghufenxiang_yesno_types")
    private Integer yonghufenxiangYesnoTypes;


    /**
     * 审核原因
     */

    @TableField(value = "yonghufenxiang_yesno_text")
    private String yonghufenxiangYesnoText;


    /**
     * 分享内容
     */

    @TableField(value = "yonghufenxiang_content")
    private String yonghufenxiangContent;


    /**
     * 创建时间 show1 show2 photoShow
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：分享标题
	 */
    public String getYonghufenxiangName() {
        return yonghufenxiangName;
    }


    /**
	 * 获取：分享标题
	 */

    public void setYonghufenxiangName(String yonghufenxiangName) {
        this.yonghufenxiangName = yonghufenxiangName;
    }
    /**
	 * 设置：分享类型
	 */
    public Integer getYonghufenxiangTypes() {
        return yonghufenxiangTypes;
    }


    /**
	 * 获取：分享类型
	 */

    public void setYonghufenxiangTypes(Integer yonghufenxiangTypes) {
        this.yonghufenxiangTypes = yonghufenxiangTypes;
    }
    /**
	 * 设置：分享图片
	 */
    public String getYonghufenxiangPhoto() {
        return yonghufenxiangPhoto;
    }


    /**
	 * 获取：分享图片
	 */

    public void setYonghufenxiangPhoto(String yonghufenxiangPhoto) {
        this.yonghufenxiangPhoto = yonghufenxiangPhoto;
    }
    /**
	 * 设置：分享视频
	 */
    public String getYonghufenxiangVideo() {
        return yonghufenxiangVideo;
    }


    /**
	 * 获取：分享视频
	 */

    public void setYonghufenxiangVideo(String yonghufenxiangVideo) {
        this.yonghufenxiangVideo = yonghufenxiangVideo;
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
    public Integer getClicknum() {
        return clicknum;
    }


    /**
	 * 获取：点击次数
	 */

    public void setClicknum(Integer clicknum) {
        this.clicknum = clicknum;
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
	 * 设置：审核状态
	 */
    public Integer getYonghufenxiangYesnoTypes() {
        return yonghufenxiangYesnoTypes;
    }


    /**
	 * 获取：审核状态
	 */

    public void setYonghufenxiangYesnoTypes(Integer yonghufenxiangYesnoTypes) {
        this.yonghufenxiangYesnoTypes = yonghufenxiangYesnoTypes;
    }
    /**
	 * 设置：审核原因
	 */
    public String getYonghufenxiangYesnoText() {
        return yonghufenxiangYesnoText;
    }


    /**
	 * 获取：审核原因
	 */

    public void setYonghufenxiangYesnoText(String yonghufenxiangYesnoText) {
        this.yonghufenxiangYesnoText = yonghufenxiangYesnoText;
    }
    /**
	 * 设置：分享内容
	 */
    public String getYonghufenxiangContent() {
        return yonghufenxiangContent;
    }


    /**
	 * 获取：分享内容
	 */

    public void setYonghufenxiangContent(String yonghufenxiangContent) {
        this.yonghufenxiangContent = yonghufenxiangContent;
    }
    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}
