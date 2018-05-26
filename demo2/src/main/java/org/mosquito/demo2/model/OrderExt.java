package org.mosquito.demo2.model;

import lombok.Data;

import java.util.List;

@Data
public class OrderExt extends Order {

    private List<OrderItem> items;

}
