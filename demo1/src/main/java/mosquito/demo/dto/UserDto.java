package mosquito.demo.dto;

import lombok.Getter;
import lombok.Setter;
import tk.chandsir.mosquito.framework.core.model.BaseDto;

import java.sql.Timestamp;

/**
 * 数据传输对象实体
 *
 * @author jcchen
 * @Date 2018-5-18
 * 
 */
@Getter
@Setter
//@ToString
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