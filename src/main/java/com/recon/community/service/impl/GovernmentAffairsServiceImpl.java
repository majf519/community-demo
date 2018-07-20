package com.recon.community.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.recon.community.entity.GovernmentAffairs;
import com.recon.community.entity.GuideConfiguration;
import com.recon.community.entity.GuideTitleItem;
import com.recon.community.mapper.GovernmentAffairsMapper;
import com.recon.community.service.GovernmentAffairsService;
import com.recon.community.vo.GovernmentAffairsVO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(rollbackFor = Throwable.class)
public class GovernmentAffairsServiceImpl extends ServiceImpl<GovernmentAffairsMapper, GovernmentAffairs> implements GovernmentAffairsService {

    @Override
    public List<GovernmentAffairs> getGovernmentAffairsList(GovernmentAffairsVO governmentAffairsVO){

        return baseMapper.getGovernmentAffairsList(governmentAffairsVO);
    }

    @Override
    public List<GuideConfiguration> getGuideConfigurationList(String id){

        List<GuideConfiguration> guideConfigurationList = baseMapper.getGuideConfigurationList(id);
        for(int i=0; i< guideConfigurationList.size(); i++){

            List<GuideTitleItem> guideTitleItemList = baseMapper.getGuideTitleItemList(guideConfigurationList.get(i).getId());
            guideConfigurationList.get(i).setGuideTitleItemList(guideTitleItemList);
        }

        return guideConfigurationList;
    }
}