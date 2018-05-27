package org.mosquito.demo3.mapper

import java.util

import org.apache.ibatis.annotations.Mapper
import org.mosquito.demo3.model.{Order, OrderExt}
import org.mosquito.framework.jdbc.mapper.BaseMapper

@Mapper
trait OrderMapper extends BaseMapper[Order] {

  def findListExt(order: Order): util.List[OrderExt]

  def findListScala(order: Order): util.List[Order]
}
