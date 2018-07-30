package com.recon.community.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.recon.community.entity.Annex;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import java.util.List;

/**
 * @author daniel.xue
 * @create 2018/7/28
 **/
public interface AnnexMapper extends BaseMapper<Annex> {

    @Select("SELECT id,\n" +
            "        relation_no AS relationNo,\n" +
            "        file_upload_path fileUploadPath,\n" +
            "        title,\n" +
            "        filename,\n" +
            "        update_time updateTime\n" +
            "FROM community_upload_file c\n" +
            "WHERE del_flag = '0'\n" +
            "        AND relation_no = #{id}")
    List<Annex> listAnnex(String id);

    @Update("UPDATE community_upload_file SET filename = null, file_upload_path = null,update_time = null\n" +
            "WHERE del_flag = '0'\n" +
            "        AND id = #{id}")
    void deleteAnnex(String id);
}
