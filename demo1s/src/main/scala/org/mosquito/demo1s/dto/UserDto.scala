package org.mosquito.demo1s.dto

import org.mosquito.framework.core.model.BaseDto

import scala.beans.BeanProperty


/**
 * 数据传输对象实体
 *
 * @author jcchen
 * @Date 2018-5-28
 * 
 */
class UserDto extends BaseDto {


    /**
     * 
     * 
     */
    @BeanProperty var name: String = _

    /**
     * 
     * 
     */
    @BeanProperty var password: String = _

    /**
     * 
     * 
     */
    @BeanProperty var salt: String = _

    /**
     * 
     * 
     */
    @BeanProperty var mobile: String = _
	
}
