package org.mosquito.demo3.dto

import org.mosquito.framework.core.model.BaseDto

import scala.beans.BeanProperty

class OrderDto extends BaseDto {

  /**
    * 字段名称：用户ID
    *
    */
  @BeanProperty var userId: Integer = null

  /**
    * 字段名称：订单总额
    *
    */
  @BeanProperty var payment: Integer = null

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
