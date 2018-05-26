package org.mosquito.demo2.service.impl;

import org.springframework.stereotype.Service;

import org.mosquito.framework.jdbc.service.BaseServiceAdapterImpl;
import org.mosquito.demo2.model.OrderItem;
import org.mosquito.demo2.dto.OrderItemDto;
import org.mosquito.demo2.mapper.OrderItemMapper;
import org.mosquito.demo2.service.IOrderItemService;

/**
 * 业务类
 *
 * @author jcchen
 * @Date 2018-5-27
 * 
 */
@Service("orderItemService")
public class OrderItemServiceImpl extends BaseServiceAdapterImpl<OrderItemDto, OrderItem, OrderItemMapper> implements IOrderItemService {
	
}
