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
@TableName("chat_msg")
public class ChatMsg implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    @TableField("send_user_id")
    private String sendUserId;
    @TableField("accept_user_id")
    private String acceptUserId;
    private String msg;
    @TableField("sign_flag")
    private Integer signFlag;
    @TableField("create_time")
    private Date createTime;


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

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Integer getSignFlag() {
        return signFlag;
    }

    public void setSignFlag(Integer signFlag) {
        this.signFlag = signFlag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "ChatMsg{" +
        ", id=" + id +
        ", sendUserId=" + sendUserId +
        ", acceptUserId=" + acceptUserId +
        ", msg=" + msg +
        ", signFlag=" + signFlag +
        ", createTime=" + createTime +
        "}";
    }
}
