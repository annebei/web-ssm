package ssm.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ssm.dao.UserMapper;
import ssm.model.User;
import ssm.service.UserService;


@Service
public class UserServiceImpl implements UserService {

   @Autowired
   private UserMapper userMapper;


    public User findByUserId(Integer id) throws Exception {
        User user = userMapper.selectByPrimaryKey(id);
        return  user;
    }
}
