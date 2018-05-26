package org.mosquito.demo.model;

import org.mosquito.framework.core.model.BaseModel;

import lombok.Getter;
import lombok.Setter;


/**
 * 实体类 数据库表名称：user 
 *
 * @author jcchen
 * @Date 2018-5-26
 * 
 */
@Getter
@Setter
public class User extends BaseModel {

    private static final long serialVersionUID = 1L;

    /**
     * 
     * 
     * 数据库字段信息:name VARCHAR(50)
     */
    private String name;

    /**
     * 
     * 
     * 数据库字段信息:password VARCHAR(128)
     */
    private String password;

    /**
     * 
     * 
     * 数据库字段信息:salt VARCHAR(128)
     */
    private String salt;

    /**
     * 
     * 
     * 数据库字段信息:mobile VARCHAR(20)
     */
    private String mobile;

    public User() {
    }	
	
}
