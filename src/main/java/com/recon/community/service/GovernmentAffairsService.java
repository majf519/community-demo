package com.recon.community.service;

import com.baomidou.mybatisplus.service.IService;
import com.recon.community.entity.GovernmentAffairs;
import com.recon.community.entity.GuideConfiguration;
import com.recon.community.vo.GovernmentAffairsVO;

import java.util.List;

public interface GovernmentAffairsService extends IService<GovernmentAffairs> {

    List<GovernmentAffairsVO> getGovernmentAffairsList(GovernmentAffairsVO governmentAffairsVO);

    GovernmentAffairs getGovernmentAffairsInfoById(String id);

    List<GuideConfiguration> getGuideConfigurationList(String id);
}
