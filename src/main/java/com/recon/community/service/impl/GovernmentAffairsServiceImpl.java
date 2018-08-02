package com.recon.community.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.recon.community.entity.GovernmentAffairs;
import com.recon.community.entity.GuideConfiguration;
import com.recon.community.entity.GuideTitleItem;
import com.recon.community.entity.Residents;
import com.recon.community.mapper.GovernmentAffairsMapper;
import com.recon.community.service.GovernmentAffairsService;
import com.recon.community.service.ResidentsService;
import com.recon.community.util.UuidUtil;
import com.recon.community.vo.ApplyStatusVO;
import com.recon.community.vo.ApplyVO;
import com.recon.community.vo.GovernmentAffairsVO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(rollbackFor = Throwable.class)
public class GovernmentAffairsServiceImpl extends ServiceImpl<GovernmentAffairsMapper, GovernmentAffairs> implements GovernmentAffairsService {

    @Autowired
    private ResidentsService residentsService;

    @Override
    public List<GovernmentAffairsVO> getGovernmentAffairsList(GovernmentAffairsVO governmentAffairsVO) {

        List<GovernmentAffairs> governmentAffairsList = baseMapper.getGovernmentAffairsList(governmentAffairsVO);

        List<GovernmentAffairsVO> governmentAffairsResultList = new ArrayList<GovernmentAffairsVO>();

        for (int i = 0; i < governmentAffairsList.size(); i++) {

            GovernmentAffairsVO governmentAffairsResult = new GovernmentAffairsVO();
            governmentAffairsResult.setBusinessName("社会保障");
            governmentAffairsResult.setBusinessType("40、50人员社会救济金申请");
            governmentAffairsResult.setId(governmentAffairsList.get(i).getId());
            governmentAffairsResult.setResidentId(governmentAffairsList.get(i).getResidentId());
            governmentAffairsResult.setName(governmentAffairsList.get(i).getName());
            governmentAffairsResult.setCreateTime(governmentAffairsList.get(i).getCreateTime());
            governmentAffairsResult.setBusinessStatus(governmentAffairsList.get(i).getStatus());

            governmentAffairsResultList.add(governmentAffairsResult);

        }

        return governmentAffairsResultList;
    }

    @Override
    public GovernmentAffairs getGovernmentAffairsInfoById(String id) {

        return baseMapper.getGovernmentAffairsInfoById(id);
    }

    @Override
    public List<GuideConfiguration> getGuideConfigurationList(String id) {

        List<GuideConfiguration> guideConfigurationList = baseMapper.getGuideConfigurationList(id);
        for (int i = 0; i < guideConfigurationList.size(); i++) {

            List<GuideTitleItem> guideTitleItemList = baseMapper.getGuideTitleItemList(guideConfigurationList.get(i).getId());
            guideConfigurationList.get(i).setGuideTitleItemList(guideTitleItemList);
        }

        return guideConfigurationList;
    }

    @Override
    public void addGuideConfiguration(ApplyVO applyVO) {
        Residents residents = new Residents();
        GovernmentAffairs governmentAffairs = new GovernmentAffairs();
        if(StringUtils.isNotBlank(applyVO.getResidentId())){
            BeanUtils.copyProperties(applyVO, residents);
            residents.setId(applyVO.getResidentId());
            residentsService.updateById(residents);
        }
        if (StringUtils.isBlank(applyVO.getResidentId())) {
            String uuid = UuidUtil.getUuid();
            applyVO.setResidentId(uuid);
            BeanUtils.copyProperties(applyVO, residents);
            residents.setId(applyVO.getResidentId());
            residents.setDelFlag("0");
            if(StringUtils.isBlank(residents.getHouseCode())){
                // 创建新的家庭
                // todo
                residents.setHouseCode("8462b31e930e425598a437ffd7f26e38");
            }
            residentsService.insert(residents);
        }
        BeanUtils.copyProperties(applyVO, governmentAffairs);
        governmentAffairs.setId(UuidUtil.getUuid());
        governmentAffairs.setStatus("0");
        baseMapper.insert(governmentAffairs);

    }

    @Override
    public void updateApplyStatus(ApplyStatusVO applyStatusVO) {
        GovernmentAffairs governmentAffairs = baseMapper.selectById(applyStatusVO.getId());
        governmentAffairs.setStatus(applyStatusVO.getStatus());
        baseMapper.updateById(governmentAffairs);
    }
}
