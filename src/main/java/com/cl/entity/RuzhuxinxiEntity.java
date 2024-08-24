package com.cl.entity;

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
 * 入住信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-16 23:47:29
 */
@TableName("ruzhuxinxi")
public class RuzhuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public RuzhuxinxiEntity() {
		
	}
	
	public RuzhuxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 宿舍号
	 */
					
	private String sushehao;
	
	/**
	 * 宿舍位置
	 */
					
	private String susheweizhi;
	
	/**
	 * 床位号
	 */
					
	private String chuangweihao;
	
	/**
	 * 入住日期
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date ruzhuriqi;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 学生姓名
	 */
					
	private String xueshengxingming;
	
	/**
	 * 入住状态
	 */
					
	private String ruzhuzhuangtai;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：宿舍号
	 */
	public void setSushehao(String sushehao) {
		this.sushehao = sushehao;
	}
	/**
	 * 获取：宿舍号
	 */
	public String getSushehao() {
		return sushehao;
	}
	/**
	 * 设置：宿舍位置
	 */
	public void setSusheweizhi(String susheweizhi) {
		this.susheweizhi = susheweizhi;
	}
	/**
	 * 获取：宿舍位置
	 */
	public String getSusheweizhi() {
		return susheweizhi;
	}
	/**
	 * 设置：床位号
	 */
	public void setChuangweihao(String chuangweihao) {
		this.chuangweihao = chuangweihao;
	}
	/**
	 * 获取：床位号
	 */
	public String getChuangweihao() {
		return chuangweihao;
	}
	/**
	 * 设置：入住日期
	 */
	public void setRuzhuriqi(Date ruzhuriqi) {
		this.ruzhuriqi = ruzhuriqi;
	}
	/**
	 * 获取：入住日期
	 */
	public Date getRuzhuriqi() {
		return ruzhuriqi;
	}
	/**
	 * 设置：学号
	 */
	public void setXuehao(String xuehao) {
		this.xuehao = xuehao;
	}
	/**
	 * 获取：学号
	 */
	public String getXuehao() {
		return xuehao;
	}
	/**
	 * 设置：学生姓名
	 */
	public void setXueshengxingming(String xueshengxingming) {
		this.xueshengxingming = xueshengxingming;
	}
	/**
	 * 获取：学生姓名
	 */
	public String getXueshengxingming() {
		return xueshengxingming;
	}
	/**
	 * 设置：入住状态
	 */
	public void setRuzhuzhuangtai(String ruzhuzhuangtai) {
		this.ruzhuzhuangtai = ruzhuzhuangtai;
	}
	/**
	 * 获取：入住状态
	 */
	public String getRuzhuzhuangtai() {
		return ruzhuzhuangtai;
	}

}
