package edu.huayue.logistics.entity.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "express_state")
public class ExpressState implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 单号
     */
    @Column(name = "exp_num")
    private String expNum;

    /**
     * 跟踪信息
     */
    private String context;

    /**
     * 状态更新时间
     */
    @Column(name = "exp_time")
    private Date expTime;

    /**
     * 快递标识
     */
    @Column(name = "exp_brand")
    private String expBrand;

    /**
     * 快递单当前签收状态，包括0在途中、1已揽收、2疑难、3已签收、4退签、5同城派送中、6退回、7转单
     */
    private Byte state;

    /**
     * 数据入库时间
     */
    @Column(name = "create_time")
    private Date createTime;

    private static final long serialVersionUID = 1L;

    /**
     * 获取主键
     *
     * @return id - 主键
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置主键
     *
     * @param id 主键
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取单号
     *
     * @return exp_num - 单号
     */
    public String getExpNum() {
        return expNum;
    }

    /**
     * 设置单号
     *
     * @param expNum 单号
     */
    public void setExpNum(String expNum) {
        this.expNum = expNum == null ? null : expNum.trim();
    }

    /**
     * 获取跟踪信息
     *
     * @return context - 跟踪信息
     */
    public String getContext() {
        return context;
    }

    /**
     * 设置跟踪信息
     *
     * @param context 跟踪信息
     */
    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    /**
     * 获取状态更新时间
     *
     * @return exp_time - 状态更新时间
     */
    public Date getExpTime() {
        return expTime;
    }

    /**
     * 设置状态更新时间
     *
     * @param expTime 状态更新时间
     */
    public void setExpTime(Date expTime) {
        this.expTime = expTime;
    }

    /**
     * 获取快递标识
     *
     * @return exp_brand - 快递标识
     */
    public String getExpBrand() {
        return expBrand;
    }

    /**
     * 设置快递标识
     *
     * @param expBrand 快递标识
     */
    public void setExpBrand(String expBrand) {
        this.expBrand = expBrand == null ? null : expBrand.trim();
    }

    /**
     * 获取快递单当前签收状态，包括0在途中、1已揽收、2疑难、3已签收、4退签、5同城派送中、6退回、7转单
     *
     * @return state - 快递单当前签收状态，包括0在途中、1已揽收、2疑难、3已签收、4退签、5同城派送中、6退回、7转单
     */
    public Byte getState() {
        return state;
    }

    /**
     * 设置快递单当前签收状态，包括0在途中、1已揽收、2疑难、3已签收、4退签、5同城派送中、6退回、7转单
     *
     * @param state 快递单当前签收状态，包括0在途中、1已揽收、2疑难、3已签收、4退签、5同城派送中、6退回、7转单
     */
    public void setState(Byte state) {
        this.state = state;
    }

    /**
     * 获取数据入库时间
     *
     * @return create_time - 数据入库时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置数据入库时间
     *
     * @param createTime 数据入库时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", expNum=").append(expNum);
        sb.append(", context=").append(context);
        sb.append(", expTime=").append(expTime);
        sb.append(", expBrand=").append(expBrand);
        sb.append(", state=").append(state);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}