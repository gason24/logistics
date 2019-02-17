package edu.huayue.logistics.entity.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "erp_order")
public class ErpOrder implements Serializable {
    /**
     * 主键
     */
    private Long id;

    /**
     * 订单号
     */
    private String ordershtno;

    /**
     * 清单号
     */
    private String sheetno;

    /**
     * 收货地址
     */
    private String address;

    /**
     * 1:发货/2:取消发货
     */
    private Byte status;

    /**
     * 年级，以逗号隔开
     */
    private String grades;

    /**
     * 制单时间
     */
    private Date sheetdt;

    /**
     * 所需天数
     */
    @Column(name = "need_time")
    private String needTime;

    /**
     * 最小时间
     */
    @Column(name = "min_time")
    private Date minTime;

    /**
     * 最大时间
     */
    @Column(name = "max_time")
    private Date maxTime;

    /**
     * 电话
     */
    private String phone;

    /**
     * 收货地
     */
    private String comname;

    /**
     * 联系人
     */
    private String connector;

    @Column(name = "agency_name")
    private String agencyName;

    /**
     * 插入时间
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
     * 获取订单号
     *
     * @return ordershtno - 订单号
     */
    public String getOrdershtno() {
        return ordershtno;
    }

    /**
     * 设置订单号
     *
     * @param ordershtno 订单号
     */
    public void setOrdershtno(String ordershtno) {
        this.ordershtno = ordershtno == null ? null : ordershtno.trim();
    }

    /**
     * 获取清单号
     *
     * @return sheetno - 清单号
     */
    public String getSheetno() {
        return sheetno;
    }

    /**
     * 设置清单号
     *
     * @param sheetno 清单号
     */
    public void setSheetno(String sheetno) {
        this.sheetno = sheetno == null ? null : sheetno.trim();
    }

    /**
     * 获取收货地址
     *
     * @return address - 收货地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置收货地址
     *
     * @param address 收货地址
     */
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    /**
     * 获取1:发货/2:取消发货
     *
     * @return status - 1:发货/2:取消发货
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置1:发货/2:取消发货
     *
     * @param status 1:发货/2:取消发货
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取年级，以逗号隔开
     *
     * @return grades - 年级，以逗号隔开
     */
    public String getGrades() {
        return grades;
    }

    /**
     * 设置年级，以逗号隔开
     *
     * @param grades 年级，以逗号隔开
     */
    public void setGrades(String grades) {
        this.grades = grades == null ? null : grades.trim();
    }

    /**
     * 获取制单时间
     *
     * @return sheetdt - 制单时间
     */
    public Date getSheetdt() {
        return sheetdt;
    }

    /**
     * 设置制单时间
     *
     * @param sheetdt 制单时间
     */
    public void setSheetdt(Date sheetdt) {
        this.sheetdt = sheetdt;
    }

    /**
     * 获取所需天数
     *
     * @return need_time - 所需天数
     */
    public String getNeedTime() {
        return needTime;
    }

    /**
     * 设置所需天数
     *
     * @param needTime 所需天数
     */
    public void setNeedTime(String needTime) {
        this.needTime = needTime == null ? null : needTime.trim();
    }

    /**
     * 获取最小时间
     *
     * @return min_time - 最小时间
     */
    public Date getMinTime() {
        return minTime;
    }

    /**
     * 设置最小时间
     *
     * @param minTime 最小时间
     */
    public void setMinTime(Date minTime) {
        this.minTime = minTime;
    }

    /**
     * 获取最大时间
     *
     * @return max_time - 最大时间
     */
    public Date getMaxTime() {
        return maxTime;
    }

    /**
     * 设置最大时间
     *
     * @param maxTime 最大时间
     */
    public void setMaxTime(Date maxTime) {
        this.maxTime = maxTime;
    }

    /**
     * 获取电话
     *
     * @return phone - 电话
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置电话
     *
     * @param phone 电话
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * 获取收货地
     *
     * @return comname - 收货地
     */
    public String getComname() {
        return comname;
    }

    /**
     * 设置收货地
     *
     * @param comname 收货地
     */
    public void setComname(String comname) {
        this.comname = comname == null ? null : comname.trim();
    }

    /**
     * 获取联系人
     *
     * @return connector - 联系人
     */
    public String getConnector() {
        return connector;
    }

    /**
     * 设置联系人
     *
     * @param connector 联系人
     */
    public void setConnector(String connector) {
        this.connector = connector == null ? null : connector.trim();
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

    /**
     * 获取插入时间
     *
     * @return create_time - 插入时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置插入时间
     *
     * @param createTime 插入时间
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
        sb.append(", ordershtno=").append(ordershtno);
        sb.append(", sheetno=").append(sheetno);
        sb.append(", address=").append(address);
        sb.append(", status=").append(status);
        sb.append(", grades=").append(grades);
        sb.append(", sheetdt=").append(sheetdt);
        sb.append(", needTime=").append(needTime);
        sb.append(", minTime=").append(minTime);
        sb.append(", maxTime=").append(maxTime);
        sb.append(", phone=").append(phone);
        sb.append(", comname=").append(comname);
        sb.append(", connector=").append(connector);
        sb.append(", agencyName=").append(agencyName);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}