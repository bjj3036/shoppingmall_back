package kr.hs.dgsw.baejunjae.shoppingmall_back.service;

import kr.hs.dgsw.baejunjae.shoppingmall_back.domain.User;
import kr.hs.dgsw.baejunjae.shoppingmall_back.domain.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public Long register(User user) {
        return this.userMapper.add(user);
    }

    @Override
    public User login(User user) {
        User foundUser = this.userMapper.findByAccount(user.getAccount());
        if (foundUser == null)
            return null;
        if (foundUser.getPassword().equals(user.getPassword()))
            return foundUser;
        return null;
    }
}
