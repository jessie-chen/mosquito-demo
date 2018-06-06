package org.mosquito.demo4.query;

import org.mosquito.framework.core.model.BaseQuery;

import lombok.Getter;
import lombok.Setter;


/**
 * 分页查询参数实体
 *
 * @author jcchen
 * @Date 2018-6-6
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
