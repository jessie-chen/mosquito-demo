package org.mosquito.demo1s.implictis

import org.mosquito.framework.core.utils.CopyHelper
import org.mosquito.demo1s.model.User
import org.mosquito.demo1s.dto.UserDto

import collection.JavaConverters._

/**
 * 隐式转换类
 *
 * @author jcchen
 * @Date 2018-5-28
 * 
 */
trait UserImplicits extends CopyHelper {
	implicit def m2d(model: User) = fastCopyAndNew(model, classOf[UserDto])
    implicit def ml2dl(list: java.util.List[User]) = fastCopyAndNewList(list, classOf[UserDto])
    implicit def ml2ds(list: java.util.List[User]): Seq[UserDto] = ml2dl(list).asScala
    implicit def d2m(dto: UserDto) = fastCopyAndNew(dto, classOf[User])
    implicit def dl2ml(list: java.util.List[UserDto]) = fastCopyAndNewList(list, classOf[User])
}
