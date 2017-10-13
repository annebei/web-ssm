package ssm.service;

import ssm.model.User;

public interface UserService {

     User findByUserId(Integer id) throws Exception;

}
