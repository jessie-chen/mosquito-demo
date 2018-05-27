package org.mosquito.demo3.query

import org.mosquito.framework.core.model.BaseQuery

import scala.beans.BeanProperty

class OrderItemQuery extends BaseQuery {

  @BeanProperty var orderId: Integer = _

  @BeanProperty var productId: Integer = _

  @BeanProperty var amount: Integer = _
}
