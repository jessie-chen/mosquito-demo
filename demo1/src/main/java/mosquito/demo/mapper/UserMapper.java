package mosquito.demo.mapper;

import mosquito.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import tk.chandsir.mosquito.framework.jdbc.mapper.BaseMapper;

/**
 * 数据访问接口
 *
 * @author jcchen
 * @Date 2018-5-18
 * 
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}