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


import com.dao.GequfenleiDao;
import com.entity.GequfenleiEntity;
import com.service.GequfenleiService;
import com.entity.vo.GequfenleiVO;
import com.entity.view.GequfenleiView;

@Service("gequfenleiService")
public class GequfenleiServiceImpl extends ServiceImpl<GequfenleiDao, GequfenleiEntity> implements GequfenleiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<GequfenleiEntity> page = this.selectPage(
                new Query<GequfenleiEntity>(params).getPage(),
                new EntityWrapper<GequfenleiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<GequfenleiEntity> wrapper) {
		  Page<GequfenleiView> page =new Query<GequfenleiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<GequfenleiVO> selectListVO(Wrapper<GequfenleiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public GequfenleiVO selectVO(Wrapper<GequfenleiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<GequfenleiView> selectListView(Wrapper<GequfenleiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public GequfenleiView selectView(Wrapper<GequfenleiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
