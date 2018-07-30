package com.recon.community.service;

import com.baomidou.mybatisplus.service.IService;
import com.recon.community.entity.Annex;

import java.util.List;

/**
 * @author daniel.xue
 * @create 2018/7/28
 **/
public interface AnnexService extends IService<Annex> {
    
    List<Annex> listAnnex(String id);

    void updateAnnex(Annex annex);

    void deleteAnnex(String id);
}
