package com.jiang.entity;

import java.util.Date;
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
@TableName("user_request")
public class UserRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    @TableField("send_user_id")
    private String sendUserId;
    @TableField("accept_user_id")
    private String acceptUserId;
    @TableField("request_date_time")
    private Date requestDateTime;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSendUserId() {
        return sendUserId;
    }

    public void setSendUserId(String sendUserId) {
        this.sendUserId = sendUserId;
    }

    public String getAcceptUserId() {
        return acceptUserId;
    }

    public void setAcceptUserId(String acceptUserId) {
        this.acceptUserId = acceptUserId;
    }

    public Date getRequestDateTime() {
        return requestDateTime;
    }

    public void setRequestDateTime(Date requestDateTime) {
        this.requestDateTime = requestDateTime;
    }

    @Override
    public String toString() {
        return "UserRequest{" +
        ", id=" + id +
        ", sendUserId=" + sendUserId +
        ", acceptUserId=" + acceptUserId +
        ", requestDateTime=" + requestDateTime +
        "}";
    }
}
