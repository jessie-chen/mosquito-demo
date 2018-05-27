package org.mosquito.demo3.service.impl

import java.util

import org.mosquito.demo3.dto.{OrderDto, OrderExtDto}
import org.mosquito.demo3.implicits.Order._
import org.mosquito.demo3.mapper.OrderMapper
import org.mosquito.demo3.model.Order
import org.mosquito.demo3.service.IOrderService
import org.mosquito.framework.jdbc.service.BaseServiceAdapterImpl
import org.springframework.stereotype.Service

import collection.JavaConverters._

@Service
class OrderServiceImpl extends BaseServiceAdapterImpl[OrderDto, Order, OrderMapper] with IOrderService {

  override def findListExt(dto: OrderDto): util.List[OrderExtDto] = {
    mapper.findListExt(dto)
  }

  override def selectAll2(dto: OrderDto): util.List[OrderDto] = mapper.selectAll(dto)

  override def findListExt2(dto: OrderDto): Seq[OrderExtDto] =
    modelExtList2DtoExtList(mapper.findListExt(dto)).asScala

}
