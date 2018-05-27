package org.mosquito.demo3.model

import org.mosquito.framework.core.model.BaseModel

import scala.beans.BeanProperty

class Order extends BaseModel {

  /**
    * 字段名称：用户ID
    *
    */
  @BeanProperty var userId: Integer = _

  /**
    * 字段名称：订单总额
    *
    */
  @BeanProperty var payment: Integer = _

  /**
    * 字段名称：订单状态: 0-待支付,1-已支付.
    *
    */
  @BeanProperty var status: Integer = _

  /**
    * 字段名称：配送地址
    *
    */
  @BeanProperty var address: String = _

}
