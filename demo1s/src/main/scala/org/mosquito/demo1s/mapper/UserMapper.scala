package org.mosquito.demo1s.mapper

import org.apache.ibatis.annotations.Mapper

import org.mosquito.framework.jdbc.mapper.BaseMapper
import org.mosquito.demo1s.model.User

/**
 * 数据访问接口
 *
 * @author jcchen
 * @Date 2018-5-28
 * 
 */
@Mapper
trait UserMapper extends BaseMapper[User] {

}
