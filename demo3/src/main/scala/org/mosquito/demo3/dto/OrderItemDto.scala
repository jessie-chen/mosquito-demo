package org.mosquito.demo3.dto

import org.mosquito.framework.core.model.BaseDto

import scala.beans.BeanProperty

class OrderItemDto extends BaseDto {

  @BeanProperty var orderId: Integer = _

  @BeanProperty var productId: Integer = _

  @BeanProperty var amount: Integer = _
}
