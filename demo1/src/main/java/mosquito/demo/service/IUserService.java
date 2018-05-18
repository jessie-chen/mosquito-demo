package mosquito.demo.service;

import mosquito.demo.dto.UserDto;
import mosquito.demo.model.User;
import tk.chandsir.mosquito.framework.jdbc.service.IBaseService;

/**
 * 业务类接口
 *
 * @author jcchen
 * @Date 2018-5-18
 * 
 */
public interface IUserService extends IBaseService<UserDto, User> {
	
}