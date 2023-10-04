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


import com.dao.DiscussgequxinxiDao;
import com.entity.DiscussgequxinxiEntity;
import com.service.DiscussgequxinxiService;
import com.entity.vo.DiscussgequxinxiVO;
import com.entity.view.DiscussgequxinxiView;

@Service("discussgequxinxiService")
public class DiscussgequxinxiServiceImpl extends ServiceImpl<DiscussgequxinxiDao, DiscussgequxinxiEntity> implements DiscussgequxinxiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussgequxinxiEntity> page = this.selectPage(
                new Query<DiscussgequxinxiEntity>(params).getPage(),
                new EntityWrapper<DiscussgequxinxiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussgequxinxiEntity> wrapper) {
		  Page<DiscussgequxinxiView> page =new Query<DiscussgequxinxiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussgequxinxiVO> selectListVO(Wrapper<DiscussgequxinxiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussgequxinxiVO selectVO(Wrapper<DiscussgequxinxiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussgequxinxiView> selectListView(Wrapper<DiscussgequxinxiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussgequxinxiView selectView(Wrapper<DiscussgequxinxiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
