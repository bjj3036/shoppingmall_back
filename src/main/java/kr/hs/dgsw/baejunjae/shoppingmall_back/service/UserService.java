package kr.hs.dgsw.baejunjae.shoppingmall_back.service;

import kr.hs.dgsw.baejunjae.shoppingmall_back.domain.User;

public interface UserService {

    Long register(User user);

    User login(User user);
}
