package com.cl.dao;

import com.cl.entity.RuzhuxinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.RuzhuxinxiView;


/**
 * 入住信息
 * 
 * @author 
 * @email 
 * @date 2024-03-16 23:47:29
 */
public interface RuzhuxinxiDao extends BaseMapper<RuzhuxinxiEntity> {
	
	List<RuzhuxinxiView> selectListView(@Param("ew") Wrapper<RuzhuxinxiEntity> wrapper);

	List<RuzhuxinxiView> selectListView(Pagination page,@Param("ew") Wrapper<RuzhuxinxiEntity> wrapper);
	
	RuzhuxinxiView selectView(@Param("ew") Wrapper<RuzhuxinxiEntity> wrapper);
	

}
