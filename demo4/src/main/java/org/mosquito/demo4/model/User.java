package org.mosquito.demo4.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.mosquito.framework.core.model.Identity;


/**
 * 实体类 数据库表名称：user 
 *
 * @author jcchen
 * @Date 2018-6-6
 * 
 */
@Getter
@Setter
@ToString
public class User extends Identity {

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
