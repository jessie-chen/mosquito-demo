package org.mosquito.demo3.implicits

import org.mosquito.demo3.dto.{OrderDto, OrderExtDto, OrderItemDto}
import org.mosquito.demo3.{model => m}
import org.mosquito.framework.core.utils.CopyHelper

import collection.JavaConverters._

trait OrderImplicits extends CopyHelper {

  implicit def m2d(model: m.Order) = fastCopyAndNew(model, classOf[OrderDto])
  implicit def ml2dl(list: java.util.List[m.Order]) = fastCopyAndNewList(list, classOf[OrderDto])
  implicit def ml2ds(list: java.util.List[m.Order]): Seq[OrderDto] = ml2dl(list).asScala

  implicit def d2m(dto: OrderDto) = fastCopyAndNew(dto, classOf[m.Order])
  implicit def dl2ml(list: java.util.List[OrderDto]) = fastCopyAndNewList(list, classOf[m.Order])

  implicit def modelExt2DtoExt(model: m.OrderExt) = {
    val dto = fastCopyAndNew(model, classOf[OrderExtDto])
    dto.items = fastCopyAndNewList(model.items, classOf[OrderItemDto])
    dto
  }
  implicit def modelExtList2DtoExtList(list: java.util.List[m.OrderExt]): java.util.List[OrderExtDto] =
    list.asScala.map(m => modelExt2DtoExt(m)).asJava
}

object OrderImplicits extends OrderImplicits