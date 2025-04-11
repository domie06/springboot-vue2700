package com.entity.view;

import com.entity.XinwenEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 新闻信息
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("xinwen")
public class XinwenView extends XinwenEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 新闻类别的值
		*/
		private String xinwenValue;



	public XinwenView() {

	}

	public XinwenView(XinwenEntity xinwenEntity) {
		try {
			BeanUtils.copyProperties(this, xinwenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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










}
