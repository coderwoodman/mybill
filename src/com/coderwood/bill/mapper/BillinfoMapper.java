package com.coderwood.bill.mapper;

import java.util.List;

import com.coderwood.bill.entity.Billinfo;

public interface BillinfoMapper {
    int deleteByPrimaryKey(Long infoid);

    int insert(Billinfo record);

    int insertSelective(Billinfo record);

    Billinfo selectByPrimaryKey(Long infoid);
    
    List<Billinfo> selectAll();

    int updateByPrimaryKeySelective(Billinfo record);

    int updateByPrimaryKey(Billinfo record);
}