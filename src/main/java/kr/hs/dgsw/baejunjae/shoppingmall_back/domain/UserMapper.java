package kr.hs.dgsw.baejunjae.shoppingmall_back.domain;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    int deleteById(Long id);

    Long add(User user);

    int modify(User user);

    User findById(Long id);

    User findByAccount(String account);
}
