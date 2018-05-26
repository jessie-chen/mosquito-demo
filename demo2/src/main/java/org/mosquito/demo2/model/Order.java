package org.mosquito.demo2.model;

import org.mosquito.framework.core.model.BaseModel;

import lombok.Getter;
import lombok.Setter;


/**
 * 实体类 数据库表名称：order 
 *
 * @author jcchen
 * @Date 2018-5-27
 * 
 */
@Getter
@Setter
public class Order extends BaseModel {

    private static final long serialVersionUID = 1L;

    /**
     * 字段名称：用户ID
     * 
     * 数据库字段信息:user_id INT(10)
     */
    private Integer userId;

    /**
     * 字段名称：订单总额
     * 
     * 数据库字段信息:payment INT(10)
     */
    private Integer payment;

    /**
     * 字段名称：订单状态: 0-待支付,1-已支付.
     * 
     * 数据库字段信息:status INT(10)
     */
    private Integer status;

    /**
     * 字段名称：配送地址
     * 
     * 数据库字段信息:address VARCHAR(50)
     */
    private String address;

    public Order() {
    }	
	
}
