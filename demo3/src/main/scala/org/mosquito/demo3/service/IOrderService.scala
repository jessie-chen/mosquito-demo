package org.mosquito.demo3.service

import java.util

import org.mosquito.demo3.dto.{OrderDto, OrderExtDto}
import org.mosquito.demo3.model.Order
import org.mosquito.framework.jdbc.service.{IBaseService, ScalaSupport}

trait IOrderService extends IBaseService[OrderDto, Order] with ScalaSupport[OrderDto, Order] {
  def findListExt(dto: OrderDto): util.List[OrderExtDto]
  def findListExt2(dto: OrderDto): Seq[OrderExtDto]
  def selectAll2(dto: OrderDto): util.List[OrderDto]

  def findListScala(dto: OrderDto): Seq[OrderDto]
}
