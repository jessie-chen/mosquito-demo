package org.mosquito.demo.mapper;

import org.mosquito.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.mosquito.framework.jdbc.mapper.BaseMapper;

/**
 * 数据访问接口
 *
 * @author jcchen
 * @Date 2018-5-18
 * 
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}