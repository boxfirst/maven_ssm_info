package com.daisy.mapper;

import com.daisy.entity.InFor;
import com.daisy.entity.InForExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface InForMapper {
    long countByExample(InForExample example);

    int deleteByExample(InForExample example);

    int deleteByPrimaryKey(Long inforid);

    int insert(InFor record);

    int insertSelective(InFor record);

    List<InFor> selectByExample(InForExample example);

    InFor selectByPrimaryKey(Long inforid);

    List<InFor> selectByExampleWithJob(InForExample example);

    InFor selectByPrimaryKeyWithJob(Long inforid);

    int updateByExampleSelective(@Param("record") InFor record, @Param("example") InForExample example);

    int updateByExample(@Param("record") InFor record, @Param("example") InForExample example);

    int updateByPrimaryKeySelective(InFor record);

    int updateByPrimaryKey(InFor record);
}