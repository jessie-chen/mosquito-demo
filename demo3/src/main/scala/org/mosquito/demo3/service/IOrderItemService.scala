package org.mosquito.demo3.service

import org.mosquito.demo3.dto.OrderItemDto
import org.mosquito.demo3.model.OrderItem
import org.mosquito.framework.jdbc.service.IBaseService

trait IOrderItemService extends IBaseService[OrderItemDto, OrderItem] {

}
