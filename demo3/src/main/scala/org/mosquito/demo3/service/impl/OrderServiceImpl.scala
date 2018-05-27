package org.mosquito.demo3.service.impl

import java.util

import org.mosquito.demo3.dto.{OrderDto, OrderExtDto}
import org.mosquito.demo3.implicits.OrderImplicits
import org.mosquito.demo3.mapper.OrderMapper
import org.mosquito.demo3.model.Order
import org.mosquito.demo3.service.IOrderService
import org.mosquito.framework.jdbc.service.{BaseServiceAdapterImpl, ScalaSupport}
import org.springframework.stereotype.Service

import collection.JavaConverters._

@Service
class OrderServiceImpl extends BaseServiceAdapterImpl[OrderDto, Order, OrderMapper] with IOrderService with OrderImplicits {

  override def findListExt(dto: OrderDto): util.List[OrderExtDto] = {
    mapper.findListExt(dto)
  }

  override def selectAll2(dto: OrderDto): util.List[OrderDto] = mapper.selectAll(dto)

  override def findListExt2(dto: OrderDto): Seq[OrderExtDto] =
    modelExtList2DtoExtList(mapper.findListExt(dto)).asScala

  override def findListScala(dto: OrderDto): Seq[OrderDto] = {
//    println("=====-----=====")
//    println(mapper.findListScala(dto))
//    Seq.empty

//    modelList2DtoList(mapper.findListScala(dto)).asScala
    mapper.findListScala(dto)
  }

}
