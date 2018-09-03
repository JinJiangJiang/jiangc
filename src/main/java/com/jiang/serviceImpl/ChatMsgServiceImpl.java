package com.jiang.serviceImpl;

import com.jiang.entity.ChatMsg;
import com.jiang.mapper.ChatMsgMapper;
import com.jiang.service.ChatMsgService;
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
public class ChatMsgServiceImpl extends ServiceImpl<ChatMsgMapper, ChatMsg> implements ChatMsgService {

}
