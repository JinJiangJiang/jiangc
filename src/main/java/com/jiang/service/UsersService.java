package com.jiang.service;

import com.jiang.entity.ChatMsg;
import com.jiang.entity.Users;
import com.baomidou.mybatisplus.service.IService;

import java.util.List;

/**
 * <p>
 * InnoDB free: 4096 kB 服务类
 * </p>
 *
 * @author jiang123
 * @since 2018-08-14
 */
public interface UsersService extends IService<Users> {
    public String test();

    /**
     * @Description: 判断用户名是否存在
     */
    public boolean queryUsernameIsExist(Users users);

    /**
     * @Description: 查询用户是否存在
     */
    public Users queryUserForLogin(Users users);

    /**
     * @Description: 用户注册
     */
    public Users saveUser(Users user);

    /**
     * @Description: 修改用户记录
     */
    public Users updateUserInfo(Users user);

    /**
     * @Description: 搜索朋友的前置条件
     */
    public Integer preconditionSearchFriends(String myUserId, String friendUsername);

    /**
     * @Description: 根据用户名查询用户对象
     */
    public Users queryUserInfoByUsername(String username);

    /**
     * @Description: 添加好友请求记录，保存到数据库
     */
    public void sendFriendRequest(String myUserId, String friendUsername);

    /**
     * @Description: 查询好友请求
     */
    //public List<FriendRequestVO> queryFriendRequestList(String acceptUserId);

    /**
     * @Description: 删除好友请求记录
     */
    public void deleteFriendRequest(String sendUserId, String acceptUserId);

    /**
     * @Description: 通过好友请求
     * 				1. 保存好友
     * 				2. 逆向保存好友
     * 				3. 删除好友请求记录
     */
    public void passFriendRequest(String sendUserId, String acceptUserId);

    /**
     * @Description: 查询好友列表
     */
    //public List<MyFriendsVO> queryMyFriends(String userId);

    /**
     * @Description: 保存聊天消息到数据库
     */
    public String saveMsg(ChatMsg chatMsg);

    /**
     * @Description: 批量签收消息
     */
    public void updateMsgSigned(List<String> msgIdList);

    /**
     * @Description: 获取未签收消息列表
     */
    public List<ChatMsg> getUnReadMsgList(String acceptUserId);
}
