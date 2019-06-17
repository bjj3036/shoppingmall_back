package kr.hs.dgsw.baejunjae.shoppingmall_back.domain;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface ProductMapper {
    List findAll();

    int deleteById(Long id);

    Long add(Product post);

    int modify(Product post);

    HashMap<String, Object> findById(Long id);

}
