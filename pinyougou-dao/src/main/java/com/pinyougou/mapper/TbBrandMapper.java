package com.pinyougou.mapper;

import com.pinyougou.pojo.TbBrand;

import java.util.List;

public interface TbBrandMapper {

    List<TbBrand> findAll(TbBrand brand);
}