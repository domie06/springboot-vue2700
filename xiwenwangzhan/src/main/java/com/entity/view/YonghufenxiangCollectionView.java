package com.entity.view;

import com.entity.YonghufenxiangCollectionEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户分享收藏
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yonghufenxiang_collection")
public class YonghufenxiangCollectionView extends YonghufenxiangCollectionEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 类型的值
		*/
		private String yonghufenxiangCollectionValue;



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

		//级联表 yonghufenxiang
			/**
			* 分享标题
			*/
			private String yonghufenxiangName;
			/**
			* 分享类型
			*/
			private Integer yonghufenxiangTypes;
				/**
				* 分享类型的值
				*/
				private String yonghufenxiangValue;
			/**
			* 分享图片
			*/
			private String yonghufenxiangPhoto;
			/**
			* 分享视频
			*/
			private String yonghufenxiangVideo;
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
			private Integer clicknum;
			/**
			* 审核状态
			*/
			private Integer yonghufenxiangYesnoTypes;
				/**
				* 审核状态的值
				*/
				private String yonghufenxiangYesnoValue;
			/**
			* 审核原因
			*/
			private String yonghufenxiangYesnoText;
			/**
			* 分享内容
			*/
			private String yonghufenxiangContent;

	public YonghufenxiangCollectionView() {

	}

	public YonghufenxiangCollectionView(YonghufenxiangCollectionEntity yonghufenxiangCollectionEntity) {
		try {
			BeanUtils.copyProperties(this, yonghufenxiangCollectionEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 类型的值
			*/
			public String getYonghufenxiangCollectionValue() {
				return yonghufenxiangCollectionValue;
			}
			/**
			* 设置： 类型的值
			*/
			public void setYonghufenxiangCollectionValue(String yonghufenxiangCollectionValue) {
				this.yonghufenxiangCollectionValue = yonghufenxiangCollectionValue;
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


				//级联表的get和set yonghufenxiang
					/**
					* 获取： 分享标题
					*/
					public String getYonghufenxiangName() {
						return yonghufenxiangName;
					}
					/**
					* 设置： 分享标题
					*/
					public void setYonghufenxiangName(String yonghufenxiangName) {
						this.yonghufenxiangName = yonghufenxiangName;
					}
					/**
					* 获取： 分享类型
					*/
					public Integer getYonghufenxiangTypes() {
						return yonghufenxiangTypes;
					}
					/**
					* 设置： 分享类型
					*/
					public void setYonghufenxiangTypes(Integer yonghufenxiangTypes) {
						this.yonghufenxiangTypes = yonghufenxiangTypes;
					}


						/**
						* 获取： 分享类型的值
						*/
						public String getYonghufenxiangValue() {
							return yonghufenxiangValue;
						}
						/**
						* 设置： 分享类型的值
						*/
						public void setYonghufenxiangValue(String yonghufenxiangValue) {
							this.yonghufenxiangValue = yonghufenxiangValue;
						}
					/**
					* 获取： 分享图片
					*/
					public String getYonghufenxiangPhoto() {
						return yonghufenxiangPhoto;
					}
					/**
					* 设置： 分享图片
					*/
					public void setYonghufenxiangPhoto(String yonghufenxiangPhoto) {
						this.yonghufenxiangPhoto = yonghufenxiangPhoto;
					}
					/**
					* 获取： 分享视频
					*/
					public String getYonghufenxiangVideo() {
						return yonghufenxiangVideo;
					}
					/**
					* 设置： 分享视频
					*/
					public void setYonghufenxiangVideo(String yonghufenxiangVideo) {
						this.yonghufenxiangVideo = yonghufenxiangVideo;
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
					public Integer getClicknum() {
						return clicknum;
					}
					/**
					* 设置： 点击次数
					*/
					public void setClicknum(Integer clicknum) {
						this.clicknum = clicknum;
					}
					/**
					* 获取： 审核状态
					*/
					public Integer getYonghufenxiangYesnoTypes() {
						return yonghufenxiangYesnoTypes;
					}
					/**
					* 设置： 审核状态
					*/
					public void setYonghufenxiangYesnoTypes(Integer yonghufenxiangYesnoTypes) {
						this.yonghufenxiangYesnoTypes = yonghufenxiangYesnoTypes;
					}


						/**
						* 获取： 审核状态的值
						*/
						public String getYonghufenxiangYesnoValue() {
							return yonghufenxiangYesnoValue;
						}
						/**
						* 设置： 审核状态的值
						*/
						public void setYonghufenxiangYesnoValue(String yonghufenxiangYesnoValue) {
							this.yonghufenxiangYesnoValue = yonghufenxiangYesnoValue;
						}
					/**
					* 获取： 审核原因
					*/
					public String getYonghufenxiangYesnoText() {
						return yonghufenxiangYesnoText;
					}
					/**
					* 设置： 审核原因
					*/
					public void setYonghufenxiangYesnoText(String yonghufenxiangYesnoText) {
						this.yonghufenxiangYesnoText = yonghufenxiangYesnoText;
					}
					/**
					* 获取： 分享内容
					*/
					public String getYonghufenxiangContent() {
						return yonghufenxiangContent;
					}
					/**
					* 设置： 分享内容
					*/
					public void setYonghufenxiangContent(String yonghufenxiangContent) {
						this.yonghufenxiangContent = yonghufenxiangContent;
					}







}
