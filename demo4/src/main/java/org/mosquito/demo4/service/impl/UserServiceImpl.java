package org.mosquito.demo4.service.impl;

import org.springframework.stereotype.Service;

import org.mosquito.framework.jdbc.service.BaseServiceAdapterImpl;
import org.mosquito.demo4.model.User;
import org.mosquito.demo4.dto.UserDto;
import org.mosquito.demo4.mapper.UserMapper;
import org.mosquito.demo4.service.IUserService;

/**
 * 业务类
 *
 * @author jcchen
 * @Date 2018-6-6
 * 
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceAdapterImpl<UserDto, User, UserMapper> implements IUserService {
	
}
