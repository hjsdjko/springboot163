package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.SushexinxiEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.SushexinxiView;


/**
 * 宿舍信息
 *
 * @author 
 * @email 
 * @date 2024-03-16 23:47:29
 */
public interface SushexinxiService extends IService<SushexinxiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<SushexinxiView> selectListView(Wrapper<SushexinxiEntity> wrapper);
   	
   	SushexinxiView selectView(@Param("ew") Wrapper<SushexinxiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<SushexinxiEntity> wrapper);
   	

}

