package org.mosquito.demo4;

import org.mosquito.demo4.dto.UserDto;
import org.mosquito.demo4.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.List;

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
            UserDto dto = new UserDto();
            List<UserDto> list = userService.selectAll(dto);
            System.out.println(list);

            UserDto entity = new UserDto();
            entity.setName("Lily");
            entity.setMobile("13312345678");
            entity.setPassword("0000");
            entity.setSalt("1111");
            Long id = userService.insert(entity);
            UserDto retrieveDto = userService.get(id);
            System.out.println(retrieveDto);
        };
    }
}
