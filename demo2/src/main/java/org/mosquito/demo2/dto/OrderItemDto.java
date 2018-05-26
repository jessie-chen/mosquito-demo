package org.mosquito.demo2.dto;

import org.mosquito.framework.core.model.BaseDto;

import lombok.Getter;
import lombok.Setter;


/**
 * 数据传输对象实体
 *
 * @author jcchen
 * @Date 2018-5-27
 * 
 */
@Getter
@Setter
public class OrderItemDto extends BaseDto {

    private static final long serialVersionUID = 1L;

    /**
     * 
     * 
     */
    private Integer orderId;

    /**
     * 
     * 
     */
    private Integer productId;

    /**
     * 
     * 
     */
    private Integer amount;
	
}
