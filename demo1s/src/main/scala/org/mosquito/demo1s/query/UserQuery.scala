package org.mosquito.demo1s.query

import org.mosquito.framework.core.model.BaseQuery

import scala.beans.BeanProperty


/**
 * 分页查询参数实体
 *
 * @author jcchen
 * @Date 2018-5-28
 * 
 */
class UserQuery extends BaseQuery {


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
