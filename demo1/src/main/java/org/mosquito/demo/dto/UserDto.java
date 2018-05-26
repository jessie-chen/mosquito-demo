package org.mosquito.demo.dto;

import org.mosquito.framework.core.model.BaseDto;

import lombok.Getter;
import lombok.Setter;


/**
 * 数据传输对象实体
 *
 * @author jcchen
 * @Date 2018-5-26
 * 
 */
@Getter
@Setter
public class UserDto extends BaseDto {

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
