package org.mosquito.demo2.dto;

import lombok.Data;

import java.util.List;

@Data
public class OrderExtDto extends OrderDto {

    private List<OrderItemDto> items;
}
