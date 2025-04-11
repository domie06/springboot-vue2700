package com.entity.view;

import com.entity.YonghufenxiangEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 用户分享
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yonghufenxiang")
public class YonghufenxiangView extends YonghufenxiangEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 分享类型的值
		*/
		private String yonghufenxiangValue;
		/**
		* 审核状态的值
		*/
		private String yonghufenxiangYesnoValue;



	public YonghufenxiangView() {

	}

	public YonghufenxiangView(YonghufenxiangEntity yonghufenxiangEntity) {
		try {
			BeanUtils.copyProperties(this, yonghufenxiangEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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










}
