package org.mosquito.demo;

import org.mosquito.demo.dto.UserDto;
import org.mosquito.demo.query.UserQuery;
import org.mosquito.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.mosquito.framework.jdbc.page.Paging;

/**
 * Application
 *
 * @author 01372461
 */
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Autowired
    private IUserService userService;

    @Bean
    public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
        return args -> {
            System.out.println("fuck..");

            /*
            UserQuery query = new UserQuery();
            query.setStart(1);
            query.setPageSize(5);
            Paging<UserDto> page = userService.search(query);
            System.out.println(page);
            */

            /*
            UserDto cond = new UserDto();
            List<UserDto> list = userService.selectAll(cond);
            System.out.println(list);
            */

            UserDto dto = new UserDto();
            dto.setName("hello");
            dto.setMobile("18100001111");
            dto.setPassword("1111");
            dto.setSalt("0000");
            Long ret = userService.insert(dto);
            System.out.println(ret);

            System.out.println(userService.get(ret));
        };
    }

}
