package com.entity.view;

import com.entity.TimuleixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 题目类型
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-30 16:23:54
 */
@TableName("timuleixing")
public class TimuleixingView  extends TimuleixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public TimuleixingView(){
	}
 
 	public TimuleixingView(TimuleixingEntity timuleixingEntity){
 	try {
			BeanUtils.copyProperties(this, timuleixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
