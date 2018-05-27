package org.mosquito.demo3;

import org.mosquito.demo3.dto.OrderDto;
import org.mosquito.demo3.dto.OrderExtDto;
import org.mosquito.demo3.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import scala.collection.Seq;
import scala.collection.JavaConverters;

import java.util.List;


@Component
public class DemoRunner2 implements CommandLineRunner {

    @Autowired
    private IOrderService orderService;

    @Override
    public void run(String... args) throws Exception {
        System.out.println("------ java demo runner2 begin ------");

        listAllOrders();
        workingOnScalaSeq();
        test();

        System.out.println("------ java demo runner2 end ------");
    }

    private void listAllOrders() {
        OrderDto dto = new OrderDto();
        List<OrderDto> list = orderService.selectAll(dto);
        System.out.println(list);
    }

    private void workingOnScalaSeq() {
        OrderDto dto = new OrderDto();
        Seq<OrderExtDto> list2 = orderService.findListExt2(dto);
        List<OrderExtDto> list3 = JavaConverters.seqAsJavaList(list2);
        // 从scala转过来的List是不可变的. 因此,不可以在list3上进行add,remove操作.
        // 会抛出"java.lang.UnsupportedOperationException".
        // 如果想修改list,可以用guava新建一个list.
        System.out.println(list3);
    }

    private void test() {
        OrderDto dto = new OrderDto();
        Seq<OrderDto> seq = orderService.selectAlls(dto);
        System.out.println(seq);
    }
}
