package org.mosquito.demo2.query;

import org.mosquito.framework.core.model.BaseQuery;

import lombok.Getter;
import lombok.Setter;


/**
 * 分页查询参数实体
 *
 * @author jcchen
 * @Date 2018-5-27
 * 
 */
@Getter
@Setter
public class OrderItemQuery extends BaseQuery {

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
