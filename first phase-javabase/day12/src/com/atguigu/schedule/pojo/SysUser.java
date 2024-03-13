package com.atguigu.schedule.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

/**
 * Description:
 *
 * @Author QiQi Luo
 * @Create 2024/3/12 10:23
 * @Version 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class SysUser implements Serializable {
    private Integer uid;
    private String username;
    private String userPwd;

//    public SysUser() {
//    }
//
//    public SysUser(Integer uid, String username, String userpwd) {
//        this.uid = uid;
//        this.username = username;
//        this.userpwd = userpwd;
//    }
//
//    public Integer getUid() {
//        return uid;
//    }
//
//    public void setUid(Integer uid) {
//        this.uid = uid;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getUserpwd() {
//        return userpwd;
//    }
//
//    public void setUserpwd(String userpwd) {
//        this.userpwd = userpwd;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        SysUser sysUser = (SysUser) o;
//        return Objects.equals(uid, sysUser.uid) && Objects.equals(username, sysUser.username) && Objects.equals(userpwd, sysUser.userpwd);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(uid, username, userpwd);
//    }
}
