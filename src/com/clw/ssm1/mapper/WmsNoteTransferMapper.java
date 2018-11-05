package com.clw.ssm1.mapper;

import com.clw.ssm1.pojo.WmsNoteTransfer;

public interface WmsNoteTransferMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WmsNoteTransfer record);

    int insertSelective(WmsNoteTransfer record);

    WmsNoteTransfer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsNoteTransfer record);

    int updateByPrimaryKey(WmsNoteTransfer record);
}