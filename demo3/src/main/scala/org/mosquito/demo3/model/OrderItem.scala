package org.mosquito.demo3.model

import org.mosquito.framework.core.model.BaseModel

import scala.beans.BeanProperty

class OrderItem extends BaseModel {

  @BeanProperty var orderId: Integer = _

  @BeanProperty var productId: Integer = _

  @BeanProperty var amount: Integer = _
}
