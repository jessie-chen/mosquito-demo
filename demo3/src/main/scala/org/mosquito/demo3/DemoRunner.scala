package org.mosquito.demo3

import org.mosquito.demo3.dto.{OrderDto, OrderExtDto}
import org.mosquito.demo3.service.IOrderService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

@Component
class DemoRunner extends CommandLineRunner {

  @Autowired
  private val orderService: IOrderService = null

  override def run(args: String*): Unit = {
    listAllOrders()
    listAllOrderWithItems()
    listAllOrderWithItems2()
  }

  def listAllOrders(): Unit = {
    println(orderService.selectAll2(new OrderDto))
  }

  def listAllOrderWithItems(): Unit = {
    println(orderService.findListExt(new OrderDto))
  }

  def listAllOrderWithItems2(): Unit = {
    println(orderService.findListExt2(new OrderDto))
  }
}
