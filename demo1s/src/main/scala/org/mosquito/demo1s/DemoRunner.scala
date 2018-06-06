package org.mosquito.demo1s

import org.mosquito.demo1s.dto.UserDto
import org.mosquito.demo1s.service.IUserService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

/**
  * DemoRunner
  *
  * @author 01372461
  */
@Component
class DemoRunner extends CommandLineRunner {

  @Autowired
  val userService: IUserService = null

  override def run(strings: String*): Unit = {
    println(userService.selectAlls(new UserDto))

    val u1 = new UserDto
    u1.name = "lily"
    u1.mobile = "13312341111"
    u1.password = "0000"
    u1.salt = "1111"
    val id = userService.insert(u1)
    println(userService.get(id))
  }

}
