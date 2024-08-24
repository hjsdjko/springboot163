package com.cl.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.cl.utils.PageUtils;
import com.cl.utils.Query;


import com.cl.dao.RuzhuxinxiDao;
import com.cl.entity.RuzhuxinxiEntity;
import com.cl.service.RuzhuxinxiService;
import com.cl.entity.view.RuzhuxinxiView;

@Service("ruzhuxinxiService")
public class RuzhuxinxiServiceImpl extends ServiceImpl<RuzhuxinxiDao, RuzhuxinxiEntity> implements RuzhuxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RuzhuxinxiEntity> page = this.selectPage(
                new Query<RuzhuxinxiEntity>(params).getPage(),
                new EntityWrapper<RuzhuxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RuzhuxinxiEntity> wrapper) {
		  Page<RuzhuxinxiView> page =new Query<RuzhuxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<RuzhuxinxiView> selectListView(Wrapper<RuzhuxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RuzhuxinxiView selectView(Wrapper<RuzhuxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
