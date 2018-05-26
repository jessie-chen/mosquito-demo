package org.mosquito.demo2;

import org.mosquito.demo2.dto.OrderDto;
import org.mosquito.demo2.dto.OrderExtDto;
import org.mosquito.demo2.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DemoRunner implements CommandLineRunner {

    @Autowired
    private IOrderService orderService;

    @Override
    public void run(String... args) throws Exception {
        listAllOrderWithItems();
    }

    private void listAllOrders() {
        OrderDto cond = new OrderDto();
        List<OrderDto> list = orderService.selectAll(cond);
        System.out.println(list);
    }

    private void listAllOrderWithItems() {
        OrderDto dto = new OrderDto();
        List<OrderExtDto> list = orderService.findListExt(dto);
        System.out.println(list);
    }

}
