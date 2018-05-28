package org.mosquito.demo1s.service.impl

import org.springframework.stereotype.Service

import org.mosquito.framework.jdbc.service.BaseServiceAdapterImpl
import org.mosquito.demo1s.model.User
import org.mosquito.demo1s.dto.UserDto
import org.mosquito.demo1s.mapper.UserMapper
import org.mosquito.demo1s.implictis.UserImplicits
import org.mosquito.demo1s.service.IUserService

/**
 * 业务类
 *
 * @author jcchen
 * @date 2018-5-28
 * 
 */
@Service("userService")
class UserServiceImpl extends BaseServiceAdapterImpl[UserDto, User, UserMapper] with IUserService with UserImplicits {
	
}
