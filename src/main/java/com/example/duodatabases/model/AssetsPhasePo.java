package com.example.duodatabases.model;

import java.math.BigDecimal;
import java.util.Date;

public class AssetsPhasePo {
    private Long id;

    private Long loanId;

    private BigDecimal plannedTermAmount;

    private BigDecimal plannedTermInterest;

    private BigDecimal plannedTermPrinciple;

    private BigDecimal cushionInterest;

    private BigDecimal transactionFee;

    private Boolean feeModel;

    private BigDecimal remainingPrincipal;

    private Date dueDate;

    private Date accountDate;

    private Short phaseNumber;

    private Boolean isRepaid;

    private Date repayDate;

    private BigDecimal repaidAmount;

    private BigDecimal repaidPrinciple;

    private BigDecimal repaidInterest;

    private Short overdueDays;

    private BigDecimal overdueFee;

    private BigDecimal overdueInterest;

    private Date createTime;

    private Date updateTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLoanId() {
        return loanId;
    }

    public void setLoanId(Long loanId) {
        this.loanId = loanId;
    }

    public BigDecimal getPlannedTermAmount() {
        return plannedTermAmount;
    }

    public void setPlannedTermAmount(BigDecimal plannedTermAmount) {
        this.plannedTermAmount = plannedTermAmount;
    }

    public BigDecimal getPlannedTermInterest() {
        return plannedTermInterest;
    }

    public void setPlannedTermInterest(BigDecimal plannedTermInterest) {
        this.plannedTermInterest = plannedTermInterest;
    }

    public BigDecimal getPlannedTermPrinciple() {
        return plannedTermPrinciple;
    }

    public void setPlannedTermPrinciple(BigDecimal plannedTermPrinciple) {
        this.plannedTermPrinciple = plannedTermPrinciple;
    }

    public BigDecimal getCushionInterest() {
        return cushionInterest;
    }

    public void setCushionInterest(BigDecimal cushionInterest) {
        this.cushionInterest = cushionInterest;
    }

    public BigDecimal getTransactionFee() {
        return transactionFee;
    }

    public void setTransactionFee(BigDecimal transactionFee) {
        this.transactionFee = transactionFee;
    }

    public Boolean getFeeModel() {
        return feeModel;
    }

    public void setFeeModel(Boolean feeModel) {
        this.feeModel = feeModel;
    }

    public BigDecimal getRemainingPrincipal() {
        return remainingPrincipal;
    }

    public void setRemainingPrincipal(BigDecimal remainingPrincipal) {
        this.remainingPrincipal = remainingPrincipal;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getAccountDate() {
        return accountDate;
    }

    public void setAccountDate(Date accountDate) {
        this.accountDate = accountDate;
    }

    public Short getPhaseNumber() {
        return phaseNumber;
    }

    public void setPhaseNumber(Short phaseNumber) {
        this.phaseNumber = phaseNumber;
    }

    public Boolean getIsRepaid() {
        return isRepaid;
    }

    public void setIsRepaid(Boolean isRepaid) {
        this.isRepaid = isRepaid;
    }

    public Date getRepayDate() {
        return repayDate;
    }

    public void setRepayDate(Date repayDate) {
        this.repayDate = repayDate;
    }

    public BigDecimal getRepaidAmount() {
        return repaidAmount;
    }

    public void setRepaidAmount(BigDecimal repaidAmount) {
        this.repaidAmount = repaidAmount;
    }

    public BigDecimal getRepaidPrinciple() {
        return repaidPrinciple;
    }

    public void setRepaidPrinciple(BigDecimal repaidPrinciple) {
        this.repaidPrinciple = repaidPrinciple;
    }

    public BigDecimal getRepaidInterest() {
        return repaidInterest;
    }

    public void setRepaidInterest(BigDecimal repaidInterest) {
        this.repaidInterest = repaidInterest;
    }

    public Short getOverdueDays() {
        return overdueDays;
    }

    public void setOverdueDays(Short overdueDays) {
        this.overdueDays = overdueDays;
    }

    public BigDecimal getOverdueFee() {
        return overdueFee;
    }

    public void setOverdueFee(BigDecimal overdueFee) {
        this.overdueFee = overdueFee;
    }

    public BigDecimal getOverdueInterest() {
        return overdueInterest;
    }

    public void setOverdueInterest(BigDecimal overdueInterest) {
        this.overdueInterest = overdueInterest;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}