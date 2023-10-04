package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.GequxinxiDao;
import com.entity.GequxinxiEntity;
import com.service.GequxinxiService;
import com.entity.vo.GequxinxiVO;
import com.entity.view.GequxinxiView;

@Service("gequxinxiService")
public class GequxinxiServiceImpl extends ServiceImpl<GequxinxiDao, GequxinxiEntity> implements GequxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GequxinxiEntity> page = this.selectPage(
                new Query<GequxinxiEntity>(params).getPage(),
                new EntityWrapper<GequxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GequxinxiEntity> wrapper) {
		  Page<GequxinxiView> page =new Query<GequxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GequxinxiVO> selectListVO(Wrapper<GequxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GequxinxiVO selectVO(Wrapper<GequxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GequxinxiView> selectListView(Wrapper<GequxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GequxinxiView selectView(Wrapper<GequxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
