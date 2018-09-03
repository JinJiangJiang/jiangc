package com.jiang.entity;

import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import java.io.Serializable;

/**
 * <p>
 * InnoDB free: 4096 kB
 * </p>
 *
 * @author jiang123
 * @since 2018-08-14
 */
@TableName("friends_request")
public class FriendsRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    @TableField("my_user_id")
    private String myUserId;
    @TableField("my_friend_user_id")
    private String myFriendUserId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMyUserId() {
        return myUserId;
    }

    public void setMyUserId(String myUserId) {
        this.myUserId = myUserId;
    }

    public String getMyFriendUserId() {
        return myFriendUserId;
    }

    public void setMyFriendUserId(String myFriendUserId) {
        this.myFriendUserId = myFriendUserId;
    }

    @Override
    public String toString() {
        return "FriendsRequest{" +
        ", id=" + id +
        ", myUserId=" + myUserId +
        ", myFriendUserId=" + myFriendUserId +
        "}";
    }
}
