package org.mosquito.demo4.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.mosquito.framework.core.model.Identity;


/**
 * 数据传输对象实体
 *
 * @author jcchen
 * @Date 2018-6-6
 * 
 */
@Getter
@Setter
@ToString
public class UserDto extends Identity {

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
