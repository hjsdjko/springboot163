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


import com.cl.dao.SushexinxiDao;
import com.cl.entity.SushexinxiEntity;
import com.cl.service.SushexinxiService;
import com.cl.entity.view.SushexinxiView;

@Service("sushexinxiService")
public class SushexinxiServiceImpl extends ServiceImpl<SushexinxiDao, SushexinxiEntity> implements SushexinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<SushexinxiEntity> page = this.selectPage(
                new Query<SushexinxiEntity>(params).getPage(),
                new EntityWrapper<SushexinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<SushexinxiEntity> wrapper) {
		  Page<SushexinxiView> page =new Query<SushexinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
	@Override
	public List<SushexinxiView> selectListView(Wrapper<SushexinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public SushexinxiView selectView(Wrapper<SushexinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
