package org.mosquito.demo1s.model

import org.mosquito.framework.core.model.BaseModel

import scala.beans.BeanProperty


/**
 * 实体类 数据库表名称：user 
 *
 * @author jcchen
 * @Date 2018-5-28
 * 
 */
class User extends BaseModel {


    /**
     * 
     * 
     * 数据库字段信息:name VARCHAR(50)
     */
    @BeanProperty var name: String = _

    /**
     * 
     * 
     * 数据库字段信息:password VARCHAR(128)
     */
    @BeanProperty var password: String = _

    /**
     * 
     * 
     * 数据库字段信息:salt VARCHAR(128)
     */
    @BeanProperty var salt: String = _

    /**
     * 
     * 
     * 数据库字段信息:mobile VARCHAR(20)
     */
    @BeanProperty var mobile: String = _
	
}
