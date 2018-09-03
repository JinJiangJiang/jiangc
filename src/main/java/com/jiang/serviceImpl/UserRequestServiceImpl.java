package com.jiang.serviceImpl;

import com.jiang.entity.UserRequest;
import com.jiang.mapper.UserRequestMapper;
import com.jiang.service.UserRequestService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * InnoDB free: 4096 kB 服务实现类
 * </p>
 *
 * @author jiang123
 * @since 2018-08-14
 */
@Service
public class UserRequestServiceImpl extends ServiceImpl<UserRequestMapper, UserRequest> implements UserRequestService {

}
