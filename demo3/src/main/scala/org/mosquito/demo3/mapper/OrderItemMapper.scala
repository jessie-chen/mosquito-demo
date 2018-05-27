package org.mosquito.demo3.mapper

import org.apache.ibatis.annotations.Mapper
import org.mosquito.demo3.model.OrderItem
import org.mosquito.framework.jdbc.mapper.BaseMapper

@Mapper
trait OrderItemMapper extends BaseMapper[OrderItem]{

}
