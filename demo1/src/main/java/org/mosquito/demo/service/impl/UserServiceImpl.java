package org.mosquito.demo.service.impl;

import org.mosquito.demo.dto.UserDto;
import org.mosquito.demo.mapper.UserMapper;
import org.mosquito.demo.model.User;
import org.mosquito.demo.service.IUserService;
import org.springframework.stereotype.Service;
import org.mosquito.framework.jdbc.service.BaseServiceAdapterImpl;

/**
 * 业务类
 *
 * @author jcchen
 * @Date 2018-5-18
 * 
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceAdapterImpl<UserDto, User, UserMapper> implements IUserService {
	
}