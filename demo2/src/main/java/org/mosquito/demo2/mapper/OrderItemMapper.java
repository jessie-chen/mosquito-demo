package org.mosquito.demo2.mapper;

import org.apache.ibatis.annotations.Mapper;

import org.mosquito.framework.jdbc.mapper.BaseMapper;
import org.mosquito.demo2.model.OrderItem;

/**
 * 数据访问接口
 *
 * @author jcchen
 * @Date 2018-5-27
 * 
 */
@Mapper
public interface OrderItemMapper extends BaseMapper<OrderItem> {

}
