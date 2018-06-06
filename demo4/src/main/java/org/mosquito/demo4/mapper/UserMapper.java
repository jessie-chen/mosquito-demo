package org.mosquito.demo4.mapper;

import org.apache.ibatis.annotations.Mapper;

import org.mosquito.framework.jdbc.mapper.BaseMapper;
import org.mosquito.demo4.model.User;

/**
 * 数据访问接口
 *
 * @author jcchen
 * @Date 2018-6-6
 * 
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
