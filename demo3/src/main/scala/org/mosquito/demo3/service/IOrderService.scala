package org.mosquito.demo3.service

import java.util

import org.mosquito.demo3.dto.{OrderDto, OrderExtDto}
import org.mosquito.demo3.model.Order
import org.mosquito.framework.jdbc.service.IBaseService

trait IOrderService extends IBaseService[OrderDto, Order] {
  def findListExt(dto: OrderDto): util.List[OrderExtDto]
  def findListExt2(dto: OrderDto): Seq[OrderExtDto]
  def selectAll2(dto: OrderDto): util.List[OrderDto]
}
