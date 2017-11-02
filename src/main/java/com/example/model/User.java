package com.example.model;

public class User {
    //    用户ID
    private Integer uid;
    //    用户姓名
    private String username;
    //    用户性别
    private String sex;
    //    用户身份
    private String note;
    //    用户等级
    private Integer usergroupid;
    //    用户账户
    private String account;
    //    用户密码
    private String password;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Integer getUsergroupid() {
        return usergroupid;
    }

    public void setUsergroupid(Integer usergroupid) {
        this.usergroupid = usergroupid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", note='" + note + '\'' +
                ", usergroupid=" + usergroupid +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}