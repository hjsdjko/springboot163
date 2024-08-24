package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.RuzhuxinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.RuzhuxinxiView;


/**
 * 入住信息
 *
 * @author 
 * @email 
 * @date 2024-03-16 23:47:29
 */
public interface RuzhuxinxiService extends IService<RuzhuxinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RuzhuxinxiView> selectListView(Wrapper<RuzhuxinxiEntity> wrapper);
   	
   	RuzhuxinxiView selectView(@Param("ew") Wrapper<RuzhuxinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RuzhuxinxiEntity> wrapper);
   	

}

