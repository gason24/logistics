package edu.huayue.logistics.entity.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "order_express")
public class OrderRxpress implements Serializable {
    /**
     * 主键ID
     */
    private Long id;

    /**
     * erp_order主键
     */
    @Column(name = "erp_order_id")
    private Long erpOrderId;

    /**
     * 快递/物流种类
     */
    @Column(name = "express_kind_id")
    private Integer expressKindId;

    /**
     * 快递单号或者物流单号
     */
    @Column(name = "exp_num")
    private String expNum;

    /**
     * 未发货年级
     */
    @Column(name = "unshipped_grades")
    private String unshippedGrades;

    /**
     * 发货件数
     */
    @Column(name = "exp_count")
    private Integer expCount;

    /**
     * 1.已发货 2. 已签收    物流/快递的状态
     */
    @Column(name = "logistics_state")
    private Integer logisticsState;

    /**
     * 发货时间
     */
    @Column(name = "send_time")
    private Date sendTime;

    /**
     * 签收时间
     */
    @Column(name = "signing_time")
    private Date signingTime;

    /**
     * 预计到货时间
     */
    @Column(name = "estimated_arrive_time")
    private Date estimatedArriveTime;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "agency_name")
    private String agencyName;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键ID
     *
     * @return id - 主键ID
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键ID
     *
     * @param id 主键ID
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取erp_order主键
     *
     * @return erp_order_id - erp_order主键
     */
    public Long getErpOrderId() {
        return erpOrderId;
    }

    /**
     * 设置erp_order主键
     *
     * @param erpOrderId erp_order主键
     */
    public void setErpOrderId(Long erpOrderId) {
        this.erpOrderId = erpOrderId;
    }

    /**
     * 获取快递/物流种类
     *
     * @return express_kind_id - 快递/物流种类
     */
    public Integer getExpressKindId() {
        return expressKindId;
    }

    /**
     * 设置快递/物流种类
     *
     * @param expressKindId 快递/物流种类
     */
    public void setExpressKindId(Integer expressKindId) {
        this.expressKindId = expressKindId;
    }

    /**
     * 获取快递单号或者物流单号
     *
     * @return exp_num - 快递单号或者物流单号
     */
    public String getExpNum() {
        return expNum;
    }

    /**
     * 设置快递单号或者物流单号
     *
     * @param expNum 快递单号或者物流单号
     */
    public void setExpNum(String expNum) {
        this.expNum = expNum == null ? null : expNum.trim();
    }

    /**
     * 获取未发货年级
     *
     * @return unshipped_grades - 未发货年级
     */
    public String getUnshippedGrades() {
        return unshippedGrades;
    }

    /**
     * 设置未发货年级
     *
     * @param unshippedGrades 未发货年级
     */
    public void setUnshippedGrades(String unshippedGrades) {
        this.unshippedGrades = unshippedGrades == null ? null : unshippedGrades.trim();
    }

    /**
     * 获取发货件数
     *
     * @return exp_count - 发货件数
     */
    public Integer getExpCount() {
        return expCount;
    }

    /**
     * 设置发货件数
     *
     * @param expCount 发货件数
     */
    public void setExpCount(Integer expCount) {
        this.expCount = expCount;
    }

    /**
     * 获取1.已发货 2. 已签收    物流/快递的状态
     *
     * @return logistics_state - 1.已发货 2. 已签收    物流/快递的状态
     */
    public Integer getLogisticsState() {
        return logisticsState;
    }

    /**
     * 设置1.已发货 2. 已签收    物流/快递的状态
     *
     * @param logisticsState 1.已发货 2. 已签收    物流/快递的状态
     */
    public void setLogisticsState(Integer logisticsState) {
        this.logisticsState = logisticsState;
    }

    /**
     * 获取发货时间
     *
     * @return send_time - 发货时间
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * 设置发货时间
     *
     * @param sendTime 发货时间
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * 获取签收时间
     *
     * @return signing_time - 签收时间
     */
    public Date getSigningTime() {
        return signingTime;
    }

    /**
     * 设置签收时间
     *
     * @param signingTime 签收时间
     */
    public void setSigningTime(Date signingTime) {
        this.signingTime = signingTime;
    }

    /**
     * 获取预计到货时间
     *
     * @return estimated_arrive_time - 预计到货时间
     */
    public Date getEstimatedArriveTime() {
        return estimatedArriveTime;
    }

    /**
     * 设置预计到货时间
     *
     * @param estimatedArriveTime 预计到货时间
     */
    public void setEstimatedArriveTime(Date estimatedArriveTime) {
        this.estimatedArriveTime = estimatedArriveTime;
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return agency_name
     */
    public String getAgencyName() {
        return agencyName;
    }

    /**
     * @param agencyName
     */
    public void setAgencyName(String agencyName) {
        this.agencyName = agencyName == null ? null : agencyName.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", erpOrderId=").append(erpOrderId);
        sb.append(", expressKindId=").append(expressKindId);
        sb.append(", expNum=").append(expNum);
        sb.append(", unshippedGrades=").append(unshippedGrades);
        sb.append(", expCount=").append(expCount);
        sb.append(", logisticsState=").append(logisticsState);
        sb.append(", sendTime=").append(sendTime);
        sb.append(", signingTime=").append(signingTime);
        sb.append(", estimatedArriveTime=").append(estimatedArriveTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", agencyName=").append(agencyName);
        sb.append("]");
        return sb.toString();
    }
}