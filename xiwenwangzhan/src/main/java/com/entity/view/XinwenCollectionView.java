package com.entity.view;

import com.entity.XinwenCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 新闻收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xinwen_collection")
public class XinwenCollectionView extends XinwenCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String xinwenCollectionValue;



		//级联表 xinwen
			/**
			* 新闻标题
			*/
			private String xinwenName;
			/**
			* 新闻类别
			*/
			private Integer xinwenTypes;
				/**
				* 新闻类别的值
				*/
				private String xinwenValue;
			/**
			* 新闻地区
			*/
			private String xinwenAddress;
			/**
			* 新闻图片
			*/
			private String xinwenPhoto;
			/**
			* 新闻视频
			*/
			private String xinwenVideo;
			/**
			* 赞
			*/
			private Integer zanNumber;
			/**
			* 踩
			*/
			private Integer caiNumber;
			/**
			* 点击次数
			*/
			private Integer xinwenClicknum;
			/**
			* 新闻详情
			*/
			private String xinwenContent;

		//级联表 yonghu
			/**
			* 用户姓名
			*/
			private String yonghuName;
			/**
			* 头像
			*/
			private String yonghuPhoto;
			/**
			* 联系方式
			*/
			private String yonghuPhone;
			/**
			* 用户身份证号
			*/
			private String yonghuIdNumber;
			/**
			* 邮箱
			*/
			private String yonghuEmail;
			/**
			* 薪资
			*/
			private Double yonghuNewMoney;
			/**
			* 假删
			*/
			private Integer yonghuDelete;

	public XinwenCollectionView() {

	}

	public XinwenCollectionView(XinwenCollectionEntity xinwenCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, xinwenCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getXinwenCollectionValue() {
				return xinwenCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setXinwenCollectionValue(String xinwenCollectionValue) {
				this.xinwenCollectionValue = xinwenCollectionValue;
			}










				//级联表的get和set xinwen
					/**
					* 获取： 新闻标题
					*/
					public String getXinwenName() {
						return xinwenName;
					}
					/**
					* 设置： 新闻标题
					*/
					public void setXinwenName(String xinwenName) {
						this.xinwenName = xinwenName;
					}
					/**
					* 获取： 新闻类别
					*/
					public Integer getXinwenTypes() {
						return xinwenTypes;
					}
					/**
					* 设置： 新闻类别
					*/
					public void setXinwenTypes(Integer xinwenTypes) {
						this.xinwenTypes = xinwenTypes;
					}


						/**
						* 获取： 新闻类别的值
						*/
						public String getXinwenValue() {
							return xinwenValue;
						}
						/**
						* 设置： 新闻类别的值
						*/
						public void setXinwenValue(String xinwenValue) {
							this.xinwenValue = xinwenValue;
						}
					/**
					* 获取： 新闻地区
					*/
					public String getXinwenAddress() {
						return xinwenAddress;
					}
					/**
					* 设置： 新闻地区
					*/
					public void setXinwenAddress(String xinwenAddress) {
						this.xinwenAddress = xinwenAddress;
					}
					/**
					* 获取： 新闻图片
					*/
					public String getXinwenPhoto() {
						return xinwenPhoto;
					}
					/**
					* 设置： 新闻图片
					*/
					public void setXinwenPhoto(String xinwenPhoto) {
						this.xinwenPhoto = xinwenPhoto;
					}
					/**
					* 获取： 新闻视频
					*/
					public String getXinwenVideo() {
						return xinwenVideo;
					}
					/**
					* 设置： 新闻视频
					*/
					public void setXinwenVideo(String xinwenVideo) {
						this.xinwenVideo = xinwenVideo;
					}
					/**
					* 获取： 赞
					*/
					public Integer getZanNumber() {
						return zanNumber;
					}
					/**
					* 设置： 赞
					*/
					public void setZanNumber(Integer zanNumber) {
						this.zanNumber = zanNumber;
					}
					/**
					* 获取： 踩
					*/
					public Integer getCaiNumber() {
						return caiNumber;
					}
					/**
					* 设置： 踩
					*/
					public void setCaiNumber(Integer caiNumber) {
						this.caiNumber = caiNumber;
					}
					/**
					* 获取： 点击次数
					*/
					public Integer getXinwenClicknum() {
						return xinwenClicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setXinwenClicknum(Integer xinwenClicknum) {
						this.xinwenClicknum = xinwenClicknum;
					}
					/**
					* 获取： 新闻详情
					*/
					public String getXinwenContent() {
						return xinwenContent;
					}
					/**
					* 设置： 新闻详情
					*/
					public void setXinwenContent(String xinwenContent) {
						this.xinwenContent = xinwenContent;
					}







				//级联表的get和set yonghu
					/**
					* 获取： 用户姓名
					*/
					public String getYonghuName() {
						return yonghuName;
					}
					/**
					* 设置： 用户姓名
					*/
					public void setYonghuName(String yonghuName) {
						this.yonghuName = yonghuName;
					}
					/**
					* 获取： 头像
					*/
					public String getYonghuPhoto() {
						return yonghuPhoto;
					}
					/**
					* 设置： 头像
					*/
					public void setYonghuPhoto(String yonghuPhoto) {
						this.yonghuPhoto = yonghuPhoto;
					}
					/**
					* 获取： 联系方式
					*/
					public String getYonghuPhone() {
						return yonghuPhone;
					}
					/**
					* 设置： 联系方式
					*/
					public void setYonghuPhone(String yonghuPhone) {
						this.yonghuPhone = yonghuPhone;
					}
					/**
					* 获取： 用户身份证号
					*/
					public String getYonghuIdNumber() {
						return yonghuIdNumber;
					}
					/**
					* 设置： 用户身份证号
					*/
					public void setYonghuIdNumber(String yonghuIdNumber) {
						this.yonghuIdNumber = yonghuIdNumber;
					}
					/**
					* 获取： 邮箱
					*/
					public String getYonghuEmail() {
						return yonghuEmail;
					}
					/**
					* 设置： 邮箱
					*/
					public void setYonghuEmail(String yonghuEmail) {
						this.yonghuEmail = yonghuEmail;
					}
					/**
					* 获取： 薪资
					*/
					public Double getYonghuNewMoney() {
						return yonghuNewMoney;
					}
					/**
					* 设置： 薪资
					*/
					public void setYonghuNewMoney(Double yonghuNewMoney) {
						this.yonghuNewMoney = yonghuNewMoney;
					}
					/**
					* 获取： 假删
					*/
					public Integer getYonghuDelete() {
						return yonghuDelete;
					}
					/**
					* 设置： 假删
					*/
					public void setYonghuDelete(Integer yonghuDelete) {
						this.yonghuDelete = yonghuDelete;
					}









}
