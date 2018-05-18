package mosquito.demo;

import mosquito.demo.dto.UserDto;
import mosquito.demo.query.UserQuery;
import mosquito.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import tk.chandsir.mosquito.framework.jdbc.page.Paging;

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
            System.out.println("fuck..");

            UserQuery query = new UserQuery();
            query.setStart(1);
            query.setPageSize(5);
            Paging<UserDto> page = userService.search(query);
            System.out.println(page);

            /*
            UserDto cond = new UserDto();
            List<UserDto> list = userService.selectAll(cond);
            System.out.println(list);
            */
        };
    }

}
