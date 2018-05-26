package org.mosquito.demo2.service.impl;

import org.mosquito.demo2.dto.OrderExtDto;
import org.mosquito.demo2.dto.OrderItemDto;
import org.mosquito.demo2.model.OrderExt;
import org.mosquito.demo2.model.OrderItem;
import org.mosquito.framework.core.utils.ObjectUtils;
import org.springframework.stereotype.Service;

import org.mosquito.framework.jdbc.service.BaseServiceAdapterImpl;
import org.mosquito.demo2.model.Order;
import org.mosquito.demo2.dto.OrderDto;
import org.mosquito.demo2.mapper.OrderMapper;
import org.mosquito.demo2.service.IOrderService;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 业务类
 *
 * @author jcchen
 * @Date 2018-5-27
 * 
 */
@Service("orderService")
public class OrderServiceImpl extends BaseServiceAdapterImpl<OrderDto, Order, OrderMapper> implements IOrderService {

    @Override
    public List<OrderExtDto> findListExt(OrderDto dto) {
        Order model = ObjectUtils.fastCopyAndNew(dto, Order.class);
        List<OrderExt> list = mapper.findListExt(model);
        return list.stream().map(m -> {
            OrderExtDto extDto = ObjectUtils.fastCopyAndNew(m, OrderExtDto.class);
            List<OrderItem> items = m.getItems();
            if (!ObjectUtils.isNullOrEmpty(items)) {
                extDto.setItems(ObjectUtils.fastCopyAndNewList(items, OrderItemDto.class));
            }
            return extDto;
        }).collect(Collectors.toList());
    }
}
