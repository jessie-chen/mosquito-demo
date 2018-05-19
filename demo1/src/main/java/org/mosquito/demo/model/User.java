package org.mosquito.demo.model;

import lombok.Getter;
import lombok.Setter;
import org.mosquito.framework.core.model.BaseModel;

import java.sql.Timestamp;

/**
 * 实体类 数据库表名称：user 
 *
 * @author jcchen
 * @Date 2018-5-18
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
     * 数据库字段信息:salt VARCHAR(128)
     */
    private String salt;

    /**
     * 
     * 
     * 数据库字段信息:mobile VARCHAR(20)
     */
    private String mobile;

    /**
     * 
     * 
     * 数据库字段信息:create_time TIMESTAMP(19)
     */
    private Timestamp createTime;

    /**
     * 
     * 
     * 数据库字段信息:update_time TIMESTAMP(19)
     */
    private Timestamp updateTime;

    public User() {
    }	
	
}