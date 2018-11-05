package com.clw.ssm1.mapper;

import com.clw.ssm1.pojo.WmsNoteWhsmoveExt;

public interface WmsNoteWhsmoveExtMapper {
    int deleteByPrimaryKey(Long id);

    int insert(WmsNoteWhsmoveExt record);

    int insertSelective(WmsNoteWhsmoveExt record);

    WmsNoteWhsmoveExt selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(WmsNoteWhsmoveExt record);

    int updateByPrimaryKey(WmsNoteWhsmoveExt record);
}