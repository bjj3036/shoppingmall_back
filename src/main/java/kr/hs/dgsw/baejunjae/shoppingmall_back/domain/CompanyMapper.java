package kr.hs.dgsw.baejunjae.shoppingmall_back.domain;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface CompanyMapper {

    int deleteById(Long id);

    Long add(Company post);

    int modify(Company post);

    Company findById(Long id);
}
