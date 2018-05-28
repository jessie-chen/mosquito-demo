package org.mosquito.demo1s.service

import org.mosquito.framework.jdbc.service.{IBaseService, ScalaSupport}
import org.mosquito.demo1s.model.User
import org.mosquito.demo1s.dto.UserDto

/**
 * 业务类接口
 *
 * @author jcchen
 * @Date 2018-5-28
 * 
 */
trait IUserService extends IBaseService[UserDto, User] with ScalaSupport[UserDto, User] {
	
}
