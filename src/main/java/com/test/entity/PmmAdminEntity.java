package com.test.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Copyright (C) 2019
 * PmmAdminEntity.java
 * 创建人:刘钊
 * 日期:2019-03-26 10:52
 * 描述:
 * 历史:
 */
@Entity
@Table(name = "pmm_admin", schema = "pmmdb", catalog = "")
public class PmmAdminEntity {
    private long id;
    private Timestamp createDate;
    private Timestamp modifyDate;
    private String username;
    private String password;
    private String email;
    private String name;
    private String organizeId;
    private boolean isEnabled;
    private Boolean isDeleted;
    private boolean isLocked;
    private int loginFailureCount;
    private Timestamp lockedDate;
    private Timestamp loginDate;
    private String loginIp;
    private String lockKey;
    private String createBy;
    private String modifyBy;
    private String tel;
    private String qq;
    private String sex;
    private String organizeCode;
    private String userId;
    private String phone;
    private String openId;
    private String authorDepart;
    private String dingUserId;
    private String dingOpenId;
    private String listAuthor;

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "create_date")
    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Basic
    @Column(name = "modify_date")
    public Timestamp getModifyDate() {
        return modifyDate;
    }

    public void setModifyDate(Timestamp modifyDate) {
        this.modifyDate = modifyDate;
    }

    @Basic
    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "organize_id")
    public String getOrganizeId() {
        return organizeId;
    }

    public void setOrganizeId(String organizeId) {
        this.organizeId = organizeId;
    }

    @Basic
    @Column(name = "is_enabled")
    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    @Basic
    @Column(name = "is_deleted")
    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    @Basic
    @Column(name = "is_locked")
    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    @Basic
    @Column(name = "login_failure_count")
    public int getLoginFailureCount() {
        return loginFailureCount;
    }

    public void setLoginFailureCount(int loginFailureCount) {
        this.loginFailureCount = loginFailureCount;
    }

    @Basic
    @Column(name = "locked_date")
    public Timestamp getLockedDate() {
        return lockedDate;
    }

    public void setLockedDate(Timestamp lockedDate) {
        this.lockedDate = lockedDate;
    }

    @Basic
    @Column(name = "login_date")
    public Timestamp getLoginDate() {
        return loginDate;
    }

    public void setLoginDate(Timestamp loginDate) {
        this.loginDate = loginDate;
    }

    @Basic
    @Column(name = "login_ip")
    public String getLoginIp() {
        return loginIp;
    }

    public void setLoginIp(String loginIp) {
        this.loginIp = loginIp;
    }

    @Basic
    @Column(name = "lock_key")
    public String getLockKey() {
        return lockKey;
    }

    public void setLockKey(String lockKey) {
        this.lockKey = lockKey;
    }

    @Basic
    @Column(name = "create_by")
    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    @Basic
    @Column(name = "modify_by")
    public String getModifyBy() {
        return modifyBy;
    }

    public void setModifyBy(String modifyBy) {
        this.modifyBy = modifyBy;
    }

    @Basic
    @Column(name = "tel")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Basic
    @Column(name = "qq")
    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq;
    }

    @Basic
    @Column(name = "sex")
    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    @Basic
    @Column(name = "organize_code")
    public String getOrganizeCode() {
        return organizeCode;
    }

    public void setOrganizeCode(String organizeCode) {
        this.organizeCode = organizeCode;
    }

    @Basic
    @Column(name = "user_id")
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Basic
    @Column(name = "open_id")
    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    @Basic
    @Column(name = "author_depart")
    public String getAuthorDepart() {
        return authorDepart;
    }

    public void setAuthorDepart(String authorDepart) {
        this.authorDepart = authorDepart;
    }

    @Basic
    @Column(name = "ding_user_id")
    public String getDingUserId() {
        return dingUserId;
    }

    public void setDingUserId(String dingUserId) {
        this.dingUserId = dingUserId;
    }

    @Basic
    @Column(name = "ding_open_id")
    public String getDingOpenId() {
        return dingOpenId;
    }

    public void setDingOpenId(String dingOpenId) {
        this.dingOpenId = dingOpenId;
    }

    @Basic
    @Column(name = "list_author")
    public String getListAuthor() {
        return listAuthor;
    }

    public void setListAuthor(String listAuthor) {
        this.listAuthor = listAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PmmAdminEntity that = (PmmAdminEntity) o;

        if (id != that.id) return false;
        if (isEnabled != that.isEnabled) return false;
        if (isLocked != that.isLocked) return false;
        if (loginFailureCount != that.loginFailureCount) return false;
        if (createDate != null ? !createDate.equals(that.createDate) : that.createDate != null) return false;
        if (modifyDate != null ? !modifyDate.equals(that.modifyDate) : that.modifyDate != null) return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (email != null ? !email.equals(that.email) : that.email != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (organizeId != null ? !organizeId.equals(that.organizeId) : that.organizeId != null) return false;
        if (isDeleted != null ? !isDeleted.equals(that.isDeleted) : that.isDeleted != null) return false;
        if (lockedDate != null ? !lockedDate.equals(that.lockedDate) : that.lockedDate != null) return false;
        if (loginDate != null ? !loginDate.equals(that.loginDate) : that.loginDate != null) return false;
        if (loginIp != null ? !loginIp.equals(that.loginIp) : that.loginIp != null) return false;
        if (lockKey != null ? !lockKey.equals(that.lockKey) : that.lockKey != null) return false;
        if (createBy != null ? !createBy.equals(that.createBy) : that.createBy != null) return false;
        if (modifyBy != null ? !modifyBy.equals(that.modifyBy) : that.modifyBy != null) return false;
        if (tel != null ? !tel.equals(that.tel) : that.tel != null) return false;
        if (qq != null ? !qq.equals(that.qq) : that.qq != null) return false;
        if (sex != null ? !sex.equals(that.sex) : that.sex != null) return false;
        if (organizeCode != null ? !organizeCode.equals(that.organizeCode) : that.organizeCode != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;
        if (openId != null ? !openId.equals(that.openId) : that.openId != null) return false;
        if (authorDepart != null ? !authorDepart.equals(that.authorDepart) : that.authorDepart != null) return false;
        if (dingUserId != null ? !dingUserId.equals(that.dingUserId) : that.dingUserId != null) return false;
        if (dingOpenId != null ? !dingOpenId.equals(that.dingOpenId) : that.dingOpenId != null) return false;
        if (listAuthor != null ? !listAuthor.equals(that.listAuthor) : that.listAuthor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (createDate != null ? createDate.hashCode() : 0);
        result = 31 * result + (modifyDate != null ? modifyDate.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (organizeId != null ? organizeId.hashCode() : 0);
        result = 31 * result + (isEnabled ? 1 : 0);
        result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
        result = 31 * result + (isLocked ? 1 : 0);
        result = 31 * result + loginFailureCount;
        result = 31 * result + (lockedDate != null ? lockedDate.hashCode() : 0);
        result = 31 * result + (loginDate != null ? loginDate.hashCode() : 0);
        result = 31 * result + (loginIp != null ? loginIp.hashCode() : 0);
        result = 31 * result + (lockKey != null ? lockKey.hashCode() : 0);
        result = 31 * result + (createBy != null ? createBy.hashCode() : 0);
        result = 31 * result + (modifyBy != null ? modifyBy.hashCode() : 0);
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        result = 31 * result + (qq != null ? qq.hashCode() : 0);
        result = 31 * result + (sex != null ? sex.hashCode() : 0);
        result = 31 * result + (organizeCode != null ? organizeCode.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (openId != null ? openId.hashCode() : 0);
        result = 31 * result + (authorDepart != null ? authorDepart.hashCode() : 0);
        result = 31 * result + (dingUserId != null ? dingUserId.hashCode() : 0);
        result = 31 * result + (dingOpenId != null ? dingOpenId.hashCode() : 0);
        result = 31 * result + (listAuthor != null ? listAuthor.hashCode() : 0);
        return result;
    }
}