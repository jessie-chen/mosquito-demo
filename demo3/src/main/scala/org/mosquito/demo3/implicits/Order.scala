package org.mosquito.demo3.implicits

import org.mosquito.demo3.dto.{OrderDto, OrderExtDto, OrderItemDto}
import org.mosquito.demo3.{model => m}
import org.mosquito.framework.core.utils.ObjectUtils
import collection.JavaConverters._

trait Order {

  implicit def model2Dto(model: m.Order) = ObjectUtils.fastCopyAndNew(model, classOf[OrderDto])
  implicit def modelList2DtoList(list: java.util.List[m.Order]) = ObjectUtils.fastCopyAndNewList(list, classOf[OrderDto])

  implicit def dto2Model(dto: OrderDto) = ObjectUtils.fastCopyAndNew(dto, classOf[m.Order])
  implicit def dtoList2ModelList(list: java.util.List[OrderDto]) = ObjectUtils.fastCopyAndNewList(list, classOf[m.Order])

  implicit def modelExt2DtoExt(model: m.OrderExt) = {
    val dto = ObjectUtils.fastCopyAndNew(model, classOf[OrderExtDto])
    if (!ObjectUtils.isNullOrEmpty(model.items)) {
      dto.items = ObjectUtils.fastCopyAndNewList(model.items, classOf[OrderItemDto])
    }
    dto
  }
  implicit def modelExtList2DtoExtList(list: java.util.List[m.OrderExt]): java.util.List[OrderExtDto] =
    list.asScala.map(m => modelExt2DtoExt(m)).asJava
}

object Order extends Order