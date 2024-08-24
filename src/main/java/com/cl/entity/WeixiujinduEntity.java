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
 * 维修进度
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2024-03-16 23:47:29
 */
@TableName("weixiujindu")
public class WeixiujinduEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public WeixiujinduEntity() {
		
	}
	
	public WeixiujinduEntity(T t) {
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
	 * 维修项目
	 */
					
	private String weixiuxiangmu;
	
	/**
	 * 维修进度
	 */
					
	private String weixiujindu;
	
	/**
	 * 维修师傅
	 */
					
	private String weixiushifu;
	
	/**
	 * 维修师傅电话
	 */
					
	private String weixiushifudianhua;
	
	/**
	 * 维修详情
	 */
					
	private String weixiuxiangqing;
	
	/**
	 * 发布时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date fabushijian;
	
	/**
	 * 学号
	 */
					
	private String xuehao;
	
	/**
	 * 学生姓名
	 */
					
	private String xueshengxingming;
	
	
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
	 * 设置：维修项目
	 */
	public void setWeixiuxiangmu(String weixiuxiangmu) {
		this.weixiuxiangmu = weixiuxiangmu;
	}
	/**
	 * 获取：维修项目
	 */
	public String getWeixiuxiangmu() {
		return weixiuxiangmu;
	}
	/**
	 * 设置：维修进度
	 */
	public void setWeixiujindu(String weixiujindu) {
		this.weixiujindu = weixiujindu;
	}
	/**
	 * 获取：维修进度
	 */
	public String getWeixiujindu() {
		return weixiujindu;
	}
	/**
	 * 设置：维修师傅
	 */
	public void setWeixiushifu(String weixiushifu) {
		this.weixiushifu = weixiushifu;
	}
	/**
	 * 获取：维修师傅
	 */
	public String getWeixiushifu() {
		return weixiushifu;
	}
	/**
	 * 设置：维修师傅电话
	 */
	public void setWeixiushifudianhua(String weixiushifudianhua) {
		this.weixiushifudianhua = weixiushifudianhua;
	}
	/**
	 * 获取：维修师傅电话
	 */
	public String getWeixiushifudianhua() {
		return weixiushifudianhua;
	}
	/**
	 * 设置：维修详情
	 */
	public void setWeixiuxiangqing(String weixiuxiangqing) {
		this.weixiuxiangqing = weixiuxiangqing;
	}
	/**
	 * 获取：维修详情
	 */
	public String getWeixiuxiangqing() {
		return weixiuxiangqing;
	}
	/**
	 * 设置：发布时间
	 */
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
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

}
