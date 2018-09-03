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
@TableName("users")
public class Users implements Serializable {

    private static final long serialVersionUID = 1L;

    private String id;
    private String username;
    private String password;
    @TableField("face_image")
    private String faceImage;
    @TableField("face_image_big")
    private String faceImageBig;
    private String nickname;
    private String qrcode;
    private String cid;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFaceImage() {
        return faceImage;
    }

    public void setFaceImage(String faceImage) {
        this.faceImage = faceImage;
    }

    public String getFaceImageBig() {
        return faceImageBig;
    }

    public void setFaceImageBig(String faceImageBig) {
        this.faceImageBig = faceImageBig;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getQrcode() {
        return qrcode;
    }

    public void setQrcode(String qrcode) {
        this.qrcode = qrcode;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Users{" +
        ", id=" + id +
        ", username=" + username +
        ", password=" + password +
        ", faceImage=" + faceImage +
        ", faceImageBig=" + faceImageBig +
        ", nickname=" + nickname +
        ", qrcode=" + qrcode +
        ", cid=" + cid +
        "}";
    }
}
