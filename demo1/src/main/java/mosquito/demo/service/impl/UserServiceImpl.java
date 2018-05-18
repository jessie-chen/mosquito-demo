package mosquito.demo.service.impl;

import mosquito.demo.dto.UserDto;
import mosquito.demo.mapper.UserMapper;
import mosquito.demo.model.User;
import mosquito.demo.service.IUserService;
import org.springframework.stereotype.Service;
import tk.chandsir.mosquito.framework.jdbc.service.BaseServiceAdapterImpl;

/**
 * 业务类
 *
 * @author jcchen
 * @Date 2018-5-18
 * 
 */
@Service("userService")
public class UserServiceImpl extends BaseServiceAdapterImpl<UserDto, User, UserMapper> implements IUserService {
	
}