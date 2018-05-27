package org.mosquito.demo3.service.impl

import org.mosquito.demo3.dto.OrderItemDto
import org.mosquito.demo3.mapper.OrderItemMapper
import org.mosquito.demo3.model.OrderItem
import org.mosquito.demo3.service.IOrderItemService
import org.mosquito.framework.jdbc.service.BaseServiceAdapterImpl
import org.springframework.stereotype.Service

@Service
class OrderItemServiceImpl extends BaseServiceAdapterImpl[OrderItemDto, OrderItem, OrderItemMapper] with IOrderItemService {

}
