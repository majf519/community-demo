package com.recon.community.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.recon.community.entity.Annex;
import com.recon.community.mapper.AnnexMapper;
import com.recon.community.service.AnnexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author daniel.xue
 * @create 2018/7/28
 **/
@Service
@Transactional(rollbackFor = Throwable.class)
public class AnnexServiceImpl extends ServiceImpl<AnnexMapper,Annex> implements AnnexService{

    @Autowired
    private AnnexMapper annexMapper;

    @Override
    public List<Annex> listAnnex(String id) {
        return annexMapper.listAnnex(id);
    }

    @Override
    public void updateAnnex(Annex annex) {
        annexMapper.updateById(annex);
    }

    @Override
    public void deleteAnnex(String id) {
        annexMapper.deleteAnnex(id);
    }
}
