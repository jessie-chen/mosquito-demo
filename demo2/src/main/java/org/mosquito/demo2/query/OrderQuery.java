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
public class OrderQuery extends BaseQuery {

    private static final long serialVersionUID = 1L;

    /**
     * 字段名称：用户ID
     * 
     */
    private Integer userId;

    /**
     * 字段名称：订单总额
     * 
     */
    private Integer payment;

    /**
     * 字段名称：订单状态: 0-待支付,1-已支付.
     * 
     */
    private Integer status;

    /**
     * 字段名称：配送地址
     * 
     */
    private String address;
	
}
