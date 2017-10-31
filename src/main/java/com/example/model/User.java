package com.example.model;

public class User {
    /***/
    private Integer uid;

    /***/
    private String username;

    /***/
    private String sex;

    /***/
    private String note;

    /***/
    private Integer usergroupId;

    /***/
    public Integer getUid() {
        return uid;
    }

    /***/
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /***/
    public String getUsername() {
        return username;
    }

    /***/
    public void setUsername(String username) {
        this.username = username;
    }

    /***/
    public String getSex() {
        return sex;
    }

    /***/
    public void setSex(String sex) {
        this.sex = sex;
    }

    /***/
    public String getNote() {
        return note;
    }

    /***/
    public void setNote(String note) {
        this.note = note;
    }

    /***/
    public Integer getUsergroupId() {
        return usergroupId;
    }

    /***/
    public void setUsergroupId(Integer usergroupId) {
        this.usergroupId = usergroupId;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", note='" + note + '\'' +
                ", usergroupId=" + usergroupId +
                '}';
    }
}