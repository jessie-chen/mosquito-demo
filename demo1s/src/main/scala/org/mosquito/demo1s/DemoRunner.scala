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
  }

}
