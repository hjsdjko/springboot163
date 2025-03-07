package com.cl.entity.view;

import com.cl.entity.RuzhushenqingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 入住申请
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-16 23:47:29
 */
@TableName("ruzhushenqing")
public class RuzhushenqingView  extends RuzhushenqingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RuzhushenqingView(){
	}
 
 	public RuzhushenqingView(RuzhushenqingEntity ruzhushenqingEntity){
 	try {
			BeanUtils.copyProperties(this, ruzhushenqingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
