package com.cl.dao;

import com.cl.entity.SushexinxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.SushexinxiView;


/**
 * 宿舍信息
 * 
 * @author 
 * @email 
 * @date 2024-03-16 23:47:29
 */
public interface SushexinxiDao extends BaseMapper<SushexinxiEntity> {
	
	List<SushexinxiView> selectListView(@Param("ew") Wrapper<SushexinxiEntity> wrapper);

	List<SushexinxiView> selectListView(Pagination page,@Param("ew") Wrapper<SushexinxiEntity> wrapper);
	
	SushexinxiView selectView(@Param("ew") Wrapper<SushexinxiEntity> wrapper);
	

}
