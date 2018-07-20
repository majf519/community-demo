package com.recon.community.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.recon.community.entity.GovernmentAffairs;
import com.recon.community.entity.GuideConfiguration;
import com.recon.community.entity.GuideTitleItem;
import com.recon.community.vo.GovernmentAffairsVO;

import java.util.List;

public interface GovernmentAffairsMapper extends BaseMapper<GovernmentAffairs>{

    List<GovernmentAffairs> getGovernmentAffairsList(GovernmentAffairsVO businessVO);

    List<GuideConfiguration> getGuideConfigurationList(String id);

    List<GuideTitleItem> getGuideTitleItemList(String guideConfigurationNo);
}
