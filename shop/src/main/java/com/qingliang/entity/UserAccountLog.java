package com.qingliang.entity;

import java.math.BigDecimal;
import java.util.Date;

public class UserAccountLog {
    private String accountLogId;

    private String userId;

    private Date actionTime;

    private String actionDesc;

    private Integer actionType;

    private BigDecimal baseIn;

    private BigDecimal baseOut;

    private BigDecimal baseBalance;

    private BigDecimal repeatIn;

    private BigDecimal repeatOut;

    private BigDecimal repeatBalance;

    public String getAccountLogId() {
        return accountLogId;
    }

    public void setAccountLogId(String accountLogId) {
        this.accountLogId = accountLogId == null ? null : accountLogId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Date getActionTime() {
        return actionTime;
    }

    public void setActionTime(Date actionTime) {
        this.actionTime = actionTime;
    }

    public String getActionDesc() {
        return actionDesc;
    }

    public void setActionDesc(String actionDesc) {
        this.actionDesc = actionDesc == null ? null : actionDesc.trim();
    }

    public Integer getActionType() {
        return actionType;
    }

    public void setActionType(Integer actionType) {
        this.actionType = actionType;
    }

    public BigDecimal getBaseIn() {
        return baseIn;
    }

    public void setBaseIn(BigDecimal baseIn) {
        this.baseIn = baseIn;
    }

    public BigDecimal getBaseOut() {
        return baseOut;
    }

    public void setBaseOut(BigDecimal baseOut) {
        this.baseOut = baseOut;
    }

    public BigDecimal getBaseBalance() {
        return baseBalance;
    }

    public void setBaseBalance(BigDecimal baseBalance) {
        this.baseBalance = baseBalance;
    }

    public BigDecimal getRepeatIn() {
        return repeatIn;
    }

    public void setRepeatIn(BigDecimal repeatIn) {
        this.repeatIn = repeatIn;
    }

    public BigDecimal getRepeatOut() {
        return repeatOut;
    }

    public void setRepeatOut(BigDecimal repeatOut) {
        this.repeatOut = repeatOut;
    }

    public BigDecimal getRepeatBalance() {
        return repeatBalance;
    }

    public void setRepeatBalance(BigDecimal repeatBalance) {
        this.repeatBalance = repeatBalance;
    }
}