package org.mosquito.demo4.service;

import org.mosquito.framework.jdbc.service.IBaseService;
import org.mosquito.demo4.model.User;
import org.mosquito.demo4.dto.UserDto;

/**
 * 业务类接口
 *
 * @author jcchen
 * @Date 2018-6-6
 * 
 */
public interface IUserService extends IBaseService<UserDto, User>{
	
}
