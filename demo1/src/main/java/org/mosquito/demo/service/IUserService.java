package org.mosquito.demo.service;

import org.mosquito.framework.jdbc.service.IBaseService;
import org.mosquito.demo.model.User;
import org.mosquito.demo.dto.UserDto;

/**
 * 业务类接口
 *
 * @author jcchen
 * @Date 2018-5-26
 * 
 */
public interface IUserService extends IBaseService<UserDto, User>{
	
}
