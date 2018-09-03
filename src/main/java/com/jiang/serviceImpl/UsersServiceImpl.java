package com.jiang.serviceImpl;

import com.jiang.entity.ChatMsg;
import com.jiang.entity.Users;
import com.jiang.mapper.UsersMapper;
import com.jiang.service.UsersService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * InnoDB free: 4096 kB 服务实现类
 * </p>
 *
 * @author jiang123
 * @since 2018-08-14
 */
@Service
public class UsersServiceImpl extends ServiceImpl<UsersMapper, Users> implements UsersService {

    @Autowired
    private UsersMapper usersMapper;
    @Autowired
    private Sid sid;

    @Override
    public boolean queryUsernameIsExist(Users user) {
        user = usersMapper.selectOne(user);
        return user != null;
    }

    @Override
    public Users queryUserForLogin(Users user) {
        user = usersMapper.selectOne(user);
        return user;
    }

    @Override
    public Users saveUser(Users user) {
        user.setId(sid.nextShort());
        usersMapper.insert(user);
        return user;
    }

    @Override
    public Users updateUserInfo(Users user) {
        return null;
    }

    @Override
    public Integer preconditionSearchFriends(String myUserId, String friendUsername) {
        return null;
    }

    @Override
    public Users queryUserInfoByUsername(String username) {
        return null;
    }

    @Override
    public void sendFriendRequest(String myUserId, String friendUsername) {

    }

    @Override
    public void deleteFriendRequest(String sendUserId, String acceptUserId) {

    }

    @Override
    public void passFriendRequest(String sendUserId, String acceptUserId) {

    }

    @Override
    public String saveMsg(ChatMsg chatMsg) {
        return null;
    }

    @Override
    public void updateMsgSigned(List<String> msgIdList) {

    }

    @Override
    public List<ChatMsg> getUnReadMsgList(String acceptUserId) {
        return null;
    }

    @Override
    public String test() {
        Users user = usersMapper.selectById(1);
        return user.getNickname();
    }
}
