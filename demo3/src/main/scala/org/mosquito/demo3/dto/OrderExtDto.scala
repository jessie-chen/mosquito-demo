package org.mosquito.demo3.dto

import scala.beans.BeanProperty


class OrderExtDto extends OrderDto {

  @BeanProperty var items: java.util.List[OrderItemDto] = _

}
