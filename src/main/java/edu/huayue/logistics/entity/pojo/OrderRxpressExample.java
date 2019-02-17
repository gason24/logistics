package edu.huayue.logistics.entity.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderRxpressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderRxpressExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andErpOrderIdIsNull() {
            addCriterion("erp_order_id is null");
            return (Criteria) this;
        }

        public Criteria andErpOrderIdIsNotNull() {
            addCriterion("erp_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andErpOrderIdEqualTo(Long value) {
            addCriterion("erp_order_id =", value, "erpOrderId");
            return (Criteria) this;
        }

        public Criteria andErpOrderIdNotEqualTo(Long value) {
            addCriterion("erp_order_id <>", value, "erpOrderId");
            return (Criteria) this;
        }

        public Criteria andErpOrderIdGreaterThan(Long value) {
            addCriterion("erp_order_id >", value, "erpOrderId");
            return (Criteria) this;
        }

        public Criteria andErpOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("erp_order_id >=", value, "erpOrderId");
            return (Criteria) this;
        }

        public Criteria andErpOrderIdLessThan(Long value) {
            addCriterion("erp_order_id <", value, "erpOrderId");
            return (Criteria) this;
        }

        public Criteria andErpOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("erp_order_id <=", value, "erpOrderId");
            return (Criteria) this;
        }

        public Criteria andErpOrderIdIn(List<Long> values) {
            addCriterion("erp_order_id in", values, "erpOrderId");
            return (Criteria) this;
        }

        public Criteria andErpOrderIdNotIn(List<Long> values) {
            addCriterion("erp_order_id not in", values, "erpOrderId");
            return (Criteria) this;
        }

        public Criteria andErpOrderIdBetween(Long value1, Long value2) {
            addCriterion("erp_order_id between", value1, value2, "erpOrderId");
            return (Criteria) this;
        }

        public Criteria andErpOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("erp_order_id not between", value1, value2, "erpOrderId");
            return (Criteria) this;
        }

        public Criteria andExpressKindIdIsNull() {
            addCriterion("express_kind_id is null");
            return (Criteria) this;
        }

        public Criteria andExpressKindIdIsNotNull() {
            addCriterion("express_kind_id is not null");
            return (Criteria) this;
        }

        public Criteria andExpressKindIdEqualTo(Integer value) {
            addCriterion("express_kind_id =", value, "expressKindId");
            return (Criteria) this;
        }

        public Criteria andExpressKindIdNotEqualTo(Integer value) {
            addCriterion("express_kind_id <>", value, "expressKindId");
            return (Criteria) this;
        }

        public Criteria andExpressKindIdGreaterThan(Integer value) {
            addCriterion("express_kind_id >", value, "expressKindId");
            return (Criteria) this;
        }

        public Criteria andExpressKindIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("express_kind_id >=", value, "expressKindId");
            return (Criteria) this;
        }

        public Criteria andExpressKindIdLessThan(Integer value) {
            addCriterion("express_kind_id <", value, "expressKindId");
            return (Criteria) this;
        }

        public Criteria andExpressKindIdLessThanOrEqualTo(Integer value) {
            addCriterion("express_kind_id <=", value, "expressKindId");
            return (Criteria) this;
        }

        public Criteria andExpressKindIdIn(List<Integer> values) {
            addCriterion("express_kind_id in", values, "expressKindId");
            return (Criteria) this;
        }

        public Criteria andExpressKindIdNotIn(List<Integer> values) {
            addCriterion("express_kind_id not in", values, "expressKindId");
            return (Criteria) this;
        }

        public Criteria andExpressKindIdBetween(Integer value1, Integer value2) {
            addCriterion("express_kind_id between", value1, value2, "expressKindId");
            return (Criteria) this;
        }

        public Criteria andExpressKindIdNotBetween(Integer value1, Integer value2) {
            addCriterion("express_kind_id not between", value1, value2, "expressKindId");
            return (Criteria) this;
        }

        public Criteria andExpNumIsNull() {
            addCriterion("exp_num is null");
            return (Criteria) this;
        }

        public Criteria andExpNumIsNotNull() {
            addCriterion("exp_num is not null");
            return (Criteria) this;
        }

        public Criteria andExpNumEqualTo(String value) {
            addCriterion("exp_num =", value, "expNum");
            return (Criteria) this;
        }

        public Criteria andExpNumNotEqualTo(String value) {
            addCriterion("exp_num <>", value, "expNum");
            return (Criteria) this;
        }

        public Criteria andExpNumGreaterThan(String value) {
            addCriterion("exp_num >", value, "expNum");
            return (Criteria) this;
        }

        public Criteria andExpNumGreaterThanOrEqualTo(String value) {
            addCriterion("exp_num >=", value, "expNum");
            return (Criteria) this;
        }

        public Criteria andExpNumLessThan(String value) {
            addCriterion("exp_num <", value, "expNum");
            return (Criteria) this;
        }

        public Criteria andExpNumLessThanOrEqualTo(String value) {
            addCriterion("exp_num <=", value, "expNum");
            return (Criteria) this;
        }

        public Criteria andExpNumLike(String value) {
            addCriterion("exp_num like", value, "expNum");
            return (Criteria) this;
        }

        public Criteria andExpNumNotLike(String value) {
            addCriterion("exp_num not like", value, "expNum");
            return (Criteria) this;
        }

        public Criteria andExpNumIn(List<String> values) {
            addCriterion("exp_num in", values, "expNum");
            return (Criteria) this;
        }

        public Criteria andExpNumNotIn(List<String> values) {
            addCriterion("exp_num not in", values, "expNum");
            return (Criteria) this;
        }

        public Criteria andExpNumBetween(String value1, String value2) {
            addCriterion("exp_num between", value1, value2, "expNum");
            return (Criteria) this;
        }

        public Criteria andExpNumNotBetween(String value1, String value2) {
            addCriterion("exp_num not between", value1, value2, "expNum");
            return (Criteria) this;
        }

        public Criteria andUnshippedGradesIsNull() {
            addCriterion("unshipped_grades is null");
            return (Criteria) this;
        }

        public Criteria andUnshippedGradesIsNotNull() {
            addCriterion("unshipped_grades is not null");
            return (Criteria) this;
        }

        public Criteria andUnshippedGradesEqualTo(String value) {
            addCriterion("unshipped_grades =", value, "unshippedGrades");
            return (Criteria) this;
        }

        public Criteria andUnshippedGradesNotEqualTo(String value) {
            addCriterion("unshipped_grades <>", value, "unshippedGrades");
            return (Criteria) this;
        }

        public Criteria andUnshippedGradesGreaterThan(String value) {
            addCriterion("unshipped_grades >", value, "unshippedGrades");
            return (Criteria) this;
        }

        public Criteria andUnshippedGradesGreaterThanOrEqualTo(String value) {
            addCriterion("unshipped_grades >=", value, "unshippedGrades");
            return (Criteria) this;
        }

        public Criteria andUnshippedGradesLessThan(String value) {
            addCriterion("unshipped_grades <", value, "unshippedGrades");
            return (Criteria) this;
        }

        public Criteria andUnshippedGradesLessThanOrEqualTo(String value) {
            addCriterion("unshipped_grades <=", value, "unshippedGrades");
            return (Criteria) this;
        }

        public Criteria andUnshippedGradesLike(String value) {
            addCriterion("unshipped_grades like", value, "unshippedGrades");
            return (Criteria) this;
        }

        public Criteria andUnshippedGradesNotLike(String value) {
            addCriterion("unshipped_grades not like", value, "unshippedGrades");
            return (Criteria) this;
        }

        public Criteria andUnshippedGradesIn(List<String> values) {
            addCriterion("unshipped_grades in", values, "unshippedGrades");
            return (Criteria) this;
        }

        public Criteria andUnshippedGradesNotIn(List<String> values) {
            addCriterion("unshipped_grades not in", values, "unshippedGrades");
            return (Criteria) this;
        }

        public Criteria andUnshippedGradesBetween(String value1, String value2) {
            addCriterion("unshipped_grades between", value1, value2, "unshippedGrades");
            return (Criteria) this;
        }

        public Criteria andUnshippedGradesNotBetween(String value1, String value2) {
            addCriterion("unshipped_grades not between", value1, value2, "unshippedGrades");
            return (Criteria) this;
        }

        public Criteria andExpCountIsNull() {
            addCriterion("exp_count is null");
            return (Criteria) this;
        }

        public Criteria andExpCountIsNotNull() {
            addCriterion("exp_count is not null");
            return (Criteria) this;
        }

        public Criteria andExpCountEqualTo(Integer value) {
            addCriterion("exp_count =", value, "expCount");
            return (Criteria) this;
        }

        public Criteria andExpCountNotEqualTo(Integer value) {
            addCriterion("exp_count <>", value, "expCount");
            return (Criteria) this;
        }

        public Criteria andExpCountGreaterThan(Integer value) {
            addCriterion("exp_count >", value, "expCount");
            return (Criteria) this;
        }

        public Criteria andExpCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("exp_count >=", value, "expCount");
            return (Criteria) this;
        }

        public Criteria andExpCountLessThan(Integer value) {
            addCriterion("exp_count <", value, "expCount");
            return (Criteria) this;
        }

        public Criteria andExpCountLessThanOrEqualTo(Integer value) {
            addCriterion("exp_count <=", value, "expCount");
            return (Criteria) this;
        }

        public Criteria andExpCountIn(List<Integer> values) {
            addCriterion("exp_count in", values, "expCount");
            return (Criteria) this;
        }

        public Criteria andExpCountNotIn(List<Integer> values) {
            addCriterion("exp_count not in", values, "expCount");
            return (Criteria) this;
        }

        public Criteria andExpCountBetween(Integer value1, Integer value2) {
            addCriterion("exp_count between", value1, value2, "expCount");
            return (Criteria) this;
        }

        public Criteria andExpCountNotBetween(Integer value1, Integer value2) {
            addCriterion("exp_count not between", value1, value2, "expCount");
            return (Criteria) this;
        }

        public Criteria andLogisticsStateIsNull() {
            addCriterion("logistics_state is null");
            return (Criteria) this;
        }

        public Criteria andLogisticsStateIsNotNull() {
            addCriterion("logistics_state is not null");
            return (Criteria) this;
        }

        public Criteria andLogisticsStateEqualTo(Integer value) {
            addCriterion("logistics_state =", value, "logisticsState");
            return (Criteria) this;
        }

        public Criteria andLogisticsStateNotEqualTo(Integer value) {
            addCriterion("logistics_state <>", value, "logisticsState");
            return (Criteria) this;
        }

        public Criteria andLogisticsStateGreaterThan(Integer value) {
            addCriterion("logistics_state >", value, "logisticsState");
            return (Criteria) this;
        }

        public Criteria andLogisticsStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("logistics_state >=", value, "logisticsState");
            return (Criteria) this;
        }

        public Criteria andLogisticsStateLessThan(Integer value) {
            addCriterion("logistics_state <", value, "logisticsState");
            return (Criteria) this;
        }

        public Criteria andLogisticsStateLessThanOrEqualTo(Integer value) {
            addCriterion("logistics_state <=", value, "logisticsState");
            return (Criteria) this;
        }

        public Criteria andLogisticsStateIn(List<Integer> values) {
            addCriterion("logistics_state in", values, "logisticsState");
            return (Criteria) this;
        }

        public Criteria andLogisticsStateNotIn(List<Integer> values) {
            addCriterion("logistics_state not in", values, "logisticsState");
            return (Criteria) this;
        }

        public Criteria andLogisticsStateBetween(Integer value1, Integer value2) {
            addCriterion("logistics_state between", value1, value2, "logisticsState");
            return (Criteria) this;
        }

        public Criteria andLogisticsStateNotBetween(Integer value1, Integer value2) {
            addCriterion("logistics_state not between", value1, value2, "logisticsState");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNull() {
            addCriterion("send_time is null");
            return (Criteria) this;
        }

        public Criteria andSendTimeIsNotNull() {
            addCriterion("send_time is not null");
            return (Criteria) this;
        }

        public Criteria andSendTimeEqualTo(Date value) {
            addCriterion("send_time =", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotEqualTo(Date value) {
            addCriterion("send_time <>", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThan(Date value) {
            addCriterion("send_time >", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("send_time >=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThan(Date value) {
            addCriterion("send_time <", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeLessThanOrEqualTo(Date value) {
            addCriterion("send_time <=", value, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeIn(List<Date> values) {
            addCriterion("send_time in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotIn(List<Date> values) {
            addCriterion("send_time not in", values, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeBetween(Date value1, Date value2) {
            addCriterion("send_time between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSendTimeNotBetween(Date value1, Date value2) {
            addCriterion("send_time not between", value1, value2, "sendTime");
            return (Criteria) this;
        }

        public Criteria andSigningTimeIsNull() {
            addCriterion("signing_time is null");
            return (Criteria) this;
        }

        public Criteria andSigningTimeIsNotNull() {
            addCriterion("signing_time is not null");
            return (Criteria) this;
        }

        public Criteria andSigningTimeEqualTo(Date value) {
            addCriterion("signing_time =", value, "signingTime");
            return (Criteria) this;
        }

        public Criteria andSigningTimeNotEqualTo(Date value) {
            addCriterion("signing_time <>", value, "signingTime");
            return (Criteria) this;
        }

        public Criteria andSigningTimeGreaterThan(Date value) {
            addCriterion("signing_time >", value, "signingTime");
            return (Criteria) this;
        }

        public Criteria andSigningTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("signing_time >=", value, "signingTime");
            return (Criteria) this;
        }

        public Criteria andSigningTimeLessThan(Date value) {
            addCriterion("signing_time <", value, "signingTime");
            return (Criteria) this;
        }

        public Criteria andSigningTimeLessThanOrEqualTo(Date value) {
            addCriterion("signing_time <=", value, "signingTime");
            return (Criteria) this;
        }

        public Criteria andSigningTimeIn(List<Date> values) {
            addCriterion("signing_time in", values, "signingTime");
            return (Criteria) this;
        }

        public Criteria andSigningTimeNotIn(List<Date> values) {
            addCriterion("signing_time not in", values, "signingTime");
            return (Criteria) this;
        }

        public Criteria andSigningTimeBetween(Date value1, Date value2) {
            addCriterion("signing_time between", value1, value2, "signingTime");
            return (Criteria) this;
        }

        public Criteria andSigningTimeNotBetween(Date value1, Date value2) {
            addCriterion("signing_time not between", value1, value2, "signingTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedArriveTimeIsNull() {
            addCriterion("estimated_arrive_time is null");
            return (Criteria) this;
        }

        public Criteria andEstimatedArriveTimeIsNotNull() {
            addCriterion("estimated_arrive_time is not null");
            return (Criteria) this;
        }

        public Criteria andEstimatedArriveTimeEqualTo(Date value) {
            addCriterion("estimated_arrive_time =", value, "estimatedArriveTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedArriveTimeNotEqualTo(Date value) {
            addCriterion("estimated_arrive_time <>", value, "estimatedArriveTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedArriveTimeGreaterThan(Date value) {
            addCriterion("estimated_arrive_time >", value, "estimatedArriveTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedArriveTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("estimated_arrive_time >=", value, "estimatedArriveTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedArriveTimeLessThan(Date value) {
            addCriterion("estimated_arrive_time <", value, "estimatedArriveTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedArriveTimeLessThanOrEqualTo(Date value) {
            addCriterion("estimated_arrive_time <=", value, "estimatedArriveTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedArriveTimeIn(List<Date> values) {
            addCriterion("estimated_arrive_time in", values, "estimatedArriveTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedArriveTimeNotIn(List<Date> values) {
            addCriterion("estimated_arrive_time not in", values, "estimatedArriveTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedArriveTimeBetween(Date value1, Date value2) {
            addCriterion("estimated_arrive_time between", value1, value2, "estimatedArriveTime");
            return (Criteria) this;
        }

        public Criteria andEstimatedArriveTimeNotBetween(Date value1, Date value2) {
            addCriterion("estimated_arrive_time not between", value1, value2, "estimatedArriveTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andAgencyNameIsNull() {
            addCriterion("agency_name is null");
            return (Criteria) this;
        }

        public Criteria andAgencyNameIsNotNull() {
            addCriterion("agency_name is not null");
            return (Criteria) this;
        }

        public Criteria andAgencyNameEqualTo(String value) {
            addCriterion("agency_name =", value, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameNotEqualTo(String value) {
            addCriterion("agency_name <>", value, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameGreaterThan(String value) {
            addCriterion("agency_name >", value, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameGreaterThanOrEqualTo(String value) {
            addCriterion("agency_name >=", value, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameLessThan(String value) {
            addCriterion("agency_name <", value, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameLessThanOrEqualTo(String value) {
            addCriterion("agency_name <=", value, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameLike(String value) {
            addCriterion("agency_name like", value, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameNotLike(String value) {
            addCriterion("agency_name not like", value, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameIn(List<String> values) {
            addCriterion("agency_name in", values, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameNotIn(List<String> values) {
            addCriterion("agency_name not in", values, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameBetween(String value1, String value2) {
            addCriterion("agency_name between", value1, value2, "agencyName");
            return (Criteria) this;
        }

        public Criteria andAgencyNameNotBetween(String value1, String value2) {
            addCriterion("agency_name not between", value1, value2, "agencyName");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}