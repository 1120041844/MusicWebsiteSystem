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


import com.dao.YinlexiazaiDao;
import com.entity.YinlexiazaiEntity;
import com.service.YinlexiazaiService;
import com.entity.vo.YinlexiazaiVO;
import com.entity.view.YinlexiazaiView;

@Service("yinlexiazaiService")
public class YinlexiazaiServiceImpl extends ServiceImpl<YinlexiazaiDao, YinlexiazaiEntity> implements YinlexiazaiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<YinlexiazaiEntity> page = this.selectPage(
                new Query<YinlexiazaiEntity>(params).getPage(),
                new EntityWrapper<YinlexiazaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<YinlexiazaiEntity> wrapper) {
		  Page<YinlexiazaiView> page =new Query<YinlexiazaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<YinlexiazaiVO> selectListVO(Wrapper<YinlexiazaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public YinlexiazaiVO selectVO(Wrapper<YinlexiazaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<YinlexiazaiView> selectListView(Wrapper<YinlexiazaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public YinlexiazaiView selectView(Wrapper<YinlexiazaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
