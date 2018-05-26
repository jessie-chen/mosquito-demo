package org.mosquito.demo2.service;

import org.mosquito.framework.jdbc.service.IBaseService;
import org.mosquito.demo2.model.OrderItem;
import org.mosquito.demo2.dto.OrderItemDto;

/**
 * 业务类接口
 *
 * @author jcchen
 * @Date 2018-5-27
 * 
 */
public interface IOrderItemService extends IBaseService<OrderItemDto, OrderItem>{
	
}
