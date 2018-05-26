package org.mosquito.demo2.model;

import org.mosquito.framework.core.model.BaseModel;

import lombok.Getter;
import lombok.Setter;


/**
 * 实体类 数据库表名称：order_item 
 *
 * @author jcchen
 * @Date 2018-5-27
 * 
 */
@Getter
@Setter
public class OrderItem extends BaseModel {

    private static final long serialVersionUID = 1L;

    /**
     * 
     * 
     * 数据库字段信息:order_id INT(10)
     */
    private Integer orderId;

    /**
     * 
     * 
     * 数据库字段信息:product_id INT(10)
     */
    private Integer productId;

    /**
     * 
     * 
     * 数据库字段信息:amount INT(10)
     */
    private Integer amount;

    public OrderItem() {
    }	
	
}
