package com.clw.ssm1.mapper;

import com.clw.ssm1.pojo.WmsNoteTransferExt;

public interface WmsNoteTransferExtMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(WmsNoteTransferExt record);

    int insertSelective(WmsNoteTransferExt record);

    WmsNoteTransferExt selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(WmsNoteTransferExt record);

    int updateByPrimaryKey(WmsNoteTransferExt record);
}