package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.RuzhuxinxiEntity;
import com.cl.entity.view.RuzhuxinxiView;

import com.cl.service.RuzhuxinxiService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 入住信息
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-16 23:47:29
 */
@RestController
@RequestMapping("/ruzhuxinxi")
public class RuzhuxinxiController {
    @Autowired
    private RuzhuxinxiService ruzhuxinxiService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,RuzhuxinxiEntity ruzhuxinxi,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date ruzhuriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date ruzhuriqiend,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("xuesheng")) {
			ruzhuxinxi.setXuehao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<RuzhuxinxiEntity> ew = new EntityWrapper<RuzhuxinxiEntity>();
                if(ruzhuriqistart!=null) ew.ge("ruzhuriqi", ruzhuriqistart);
                if(ruzhuriqiend!=null) ew.le("ruzhuriqi", ruzhuriqiend);

		PageUtils page = ruzhuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ruzhuxinxi), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,RuzhuxinxiEntity ruzhuxinxi, 
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date ruzhuriqistart,
                @RequestParam(required = false) @DateTimeFormat(pattern="yyyy-MM-dd") Date ruzhuriqiend,
		HttpServletRequest request){
        EntityWrapper<RuzhuxinxiEntity> ew = new EntityWrapper<RuzhuxinxiEntity>();
                if(ruzhuriqistart!=null) ew.ge("ruzhuriqi", ruzhuriqistart);
                if(ruzhuriqiend!=null) ew.le("ruzhuriqi", ruzhuriqiend);

		PageUtils page = ruzhuxinxiService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, ruzhuxinxi), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( RuzhuxinxiEntity ruzhuxinxi){
       	EntityWrapper<RuzhuxinxiEntity> ew = new EntityWrapper<RuzhuxinxiEntity>();
      	ew.allEq(MPUtil.allEQMapPre( ruzhuxinxi, "ruzhuxinxi")); 
        return R.ok().put("data", ruzhuxinxiService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(RuzhuxinxiEntity ruzhuxinxi){
        EntityWrapper< RuzhuxinxiEntity> ew = new EntityWrapper< RuzhuxinxiEntity>();
 		ew.allEq(MPUtil.allEQMapPre( ruzhuxinxi, "ruzhuxinxi")); 
		RuzhuxinxiView ruzhuxinxiView =  ruzhuxinxiService.selectView(ew);
		return R.ok("查询入住信息成功").put("data", ruzhuxinxiView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        RuzhuxinxiEntity ruzhuxinxi = ruzhuxinxiService.selectById(id);
		ruzhuxinxi = ruzhuxinxiService.selectView(new EntityWrapper<RuzhuxinxiEntity>().eq("id", id));
        return R.ok().put("data", ruzhuxinxi);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        RuzhuxinxiEntity ruzhuxinxi = ruzhuxinxiService.selectById(id);
		ruzhuxinxi = ruzhuxinxiService.selectView(new EntityWrapper<RuzhuxinxiEntity>().eq("id", id));
        return R.ok().put("data", ruzhuxinxi);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody RuzhuxinxiEntity ruzhuxinxi, HttpServletRequest request){
    	ruzhuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(ruzhuxinxi);
        ruzhuxinxiService.insert(ruzhuxinxi);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody RuzhuxinxiEntity ruzhuxinxi, HttpServletRequest request){
    	ruzhuxinxi.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(ruzhuxinxi);
        ruzhuxinxiService.insert(ruzhuxinxi);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody RuzhuxinxiEntity ruzhuxinxi, HttpServletRequest request){
        //ValidatorUtils.validateEntity(ruzhuxinxi);
        ruzhuxinxiService.updateById(ruzhuxinxi);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        ruzhuxinxiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}