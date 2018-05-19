package org.mosquito.demo.service;

import org.mosquito.demo.dto.UserDto;
import org.mosquito.demo.model.User;
import org.mosquito.framework.jdbc.service.IBaseService;

/**
 * 业务类接口
 *
 * @author jcchen
 * @Date 2018-5-18
 * 
 */
public interface IUserService extends IBaseService<UserDto, User> {
	
}