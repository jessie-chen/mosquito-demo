package org.mosquito.demo.query;

import org.mosquito.framework.core.model.BaseQuery;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

/**
 * 分页查询参数实体
 *
 * @author jcchen
 * @Date 2018-5-20
 * 
 */
@Getter
@Setter
public class UserQuery extends BaseQuery {

    private static final long serialVersionUID = 1L;

    /**
     * 
     * 
     */
    private String name;

    /**
     * 
     * 
     */
    private String password;

    /**
     * 
     * 
     */
    private String salt;

    /**
     * 
     * 
     */
    private String mobile;

	
}
