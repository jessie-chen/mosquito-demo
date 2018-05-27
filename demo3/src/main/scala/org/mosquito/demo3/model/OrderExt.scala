package org.mosquito.demo3.model

import scala.beans.BeanProperty

class OrderExt extends Order {

  @BeanProperty var items: java.util.List[OrderItem] = _
}
