package org.mosquito.demo1s

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
  * Application
  *
  * @author 01372461
  */
@SpringBootApplication
class Application {

}

object Application {
  def main(args: Array[String]): Unit = {
    SpringApplication.run(classOf[Application], args:_*)
  }
}
