package org.mosquito.demo2.service;

import org.mosquito.demo2.dto.OrderExtDto;
import org.mosquito.framework.jdbc.service.IBaseService;
import org.mosquito.demo2.model.Order;
import org.mosquito.demo2.dto.OrderDto;

import java.util.List;

/**
 * 业务类接口
 *
 * @author jcchen
 * @Date 2018-5-27
 * 
 */
public interface IOrderService extends IBaseService<OrderDto, Order>{

    List<OrderExtDto> findListExt(OrderDto dto);

}
