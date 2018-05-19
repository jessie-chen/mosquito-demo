package org.mosquito.demo.dto;

import org.mosquito.framework.core.model.BaseDto;

import lombok.Getter;
import lombok.Setter;

import java.sql.Timestamp;

/**
 * 数据传输对象实体
 *
 * @author jcchen
 * @Date 2018-5-20
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

    /**
     * 
     * 
     */
    private Timestamp createTime;

    /**
     * 
     * 
     */
    private Timestamp updateTime;
	
}
