package cn.sys.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustorderExample() {
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

    /**
     * 
     * 
     * @author wcyong
     * 
     * @date 2020-03-23
     */
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNull() {
            addCriterion("payment is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNotNull() {
            addCriterion("payment is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentEqualTo(BigDecimal value) {
            addCriterion("payment =", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotEqualTo(BigDecimal value) {
            addCriterion("payment <>", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThan(BigDecimal value) {
            addCriterion("payment >", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payment >=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThan(BigDecimal value) {
            addCriterion("payment <", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payment <=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentIn(List<BigDecimal> values) {
            addCriterion("payment in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotIn(List<BigDecimal> values) {
            addCriterion("payment not in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payment between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payment not between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andBuyer_nameIsNull() {
            addCriterion("buyer_name is null");
            return (Criteria) this;
        }

        public Criteria andBuyer_nameIsNotNull() {
            addCriterion("buyer_name is not null");
            return (Criteria) this;
        }

        public Criteria andBuyer_nameEqualTo(String value) {
            addCriterion("buyer_name =", value, "buyer_name");
            return (Criteria) this;
        }

        public Criteria andBuyer_nameNotEqualTo(String value) {
            addCriterion("buyer_name <>", value, "buyer_name");
            return (Criteria) this;
        }

        public Criteria andBuyer_nameGreaterThan(String value) {
            addCriterion("buyer_name >", value, "buyer_name");
            return (Criteria) this;
        }

        public Criteria andBuyer_nameGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_name >=", value, "buyer_name");
            return (Criteria) this;
        }

        public Criteria andBuyer_nameLessThan(String value) {
            addCriterion("buyer_name <", value, "buyer_name");
            return (Criteria) this;
        }

        public Criteria andBuyer_nameLessThanOrEqualTo(String value) {
            addCriterion("buyer_name <=", value, "buyer_name");
            return (Criteria) this;
        }

        public Criteria andBuyer_nameLike(String value) {
            addCriterion("buyer_name like", value, "buyer_name");
            return (Criteria) this;
        }

        public Criteria andBuyer_nameNotLike(String value) {
            addCriterion("buyer_name not like", value, "buyer_name");
            return (Criteria) this;
        }

        public Criteria andBuyer_nameIn(List<String> values) {
            addCriterion("buyer_name in", values, "buyer_name");
            return (Criteria) this;
        }

        public Criteria andBuyer_nameNotIn(List<String> values) {
            addCriterion("buyer_name not in", values, "buyer_name");
            return (Criteria) this;
        }

        public Criteria andBuyer_nameBetween(String value1, String value2) {
            addCriterion("buyer_name between", value1, value2, "buyer_name");
            return (Criteria) this;
        }

        public Criteria andBuyer_nameNotBetween(String value1, String value2) {
            addCriterion("buyer_name not between", value1, value2, "buyer_name");
            return (Criteria) this;
        }

        public Criteria andBuyer_postalIsNull() {
            addCriterion("buyer_postal is null");
            return (Criteria) this;
        }

        public Criteria andBuyer_postalIsNotNull() {
            addCriterion("buyer_postal is not null");
            return (Criteria) this;
        }

        public Criteria andBuyer_postalEqualTo(String value) {
            addCriterion("buyer_postal =", value, "buyer_postal");
            return (Criteria) this;
        }

        public Criteria andBuyer_postalNotEqualTo(String value) {
            addCriterion("buyer_postal <>", value, "buyer_postal");
            return (Criteria) this;
        }

        public Criteria andBuyer_postalGreaterThan(String value) {
            addCriterion("buyer_postal >", value, "buyer_postal");
            return (Criteria) this;
        }

        public Criteria andBuyer_postalGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_postal >=", value, "buyer_postal");
            return (Criteria) this;
        }

        public Criteria andBuyer_postalLessThan(String value) {
            addCriterion("buyer_postal <", value, "buyer_postal");
            return (Criteria) this;
        }

        public Criteria andBuyer_postalLessThanOrEqualTo(String value) {
            addCriterion("buyer_postal <=", value, "buyer_postal");
            return (Criteria) this;
        }

        public Criteria andBuyer_postalLike(String value) {
            addCriterion("buyer_postal like", value, "buyer_postal");
            return (Criteria) this;
        }

        public Criteria andBuyer_postalNotLike(String value) {
            addCriterion("buyer_postal not like", value, "buyer_postal");
            return (Criteria) this;
        }

        public Criteria andBuyer_postalIn(List<String> values) {
            addCriterion("buyer_postal in", values, "buyer_postal");
            return (Criteria) this;
        }

        public Criteria andBuyer_postalNotIn(List<String> values) {
            addCriterion("buyer_postal not in", values, "buyer_postal");
            return (Criteria) this;
        }

        public Criteria andBuyer_postalBetween(String value1, String value2) {
            addCriterion("buyer_postal between", value1, value2, "buyer_postal");
            return (Criteria) this;
        }

        public Criteria andBuyer_postalNotBetween(String value1, String value2) {
            addCriterion("buyer_postal not between", value1, value2, "buyer_postal");
            return (Criteria) this;
        }

        public Criteria andBuyer_emailIsNull() {
            addCriterion("buyer_email is null");
            return (Criteria) this;
        }

        public Criteria andBuyer_emailIsNotNull() {
            addCriterion("buyer_email is not null");
            return (Criteria) this;
        }

        public Criteria andBuyer_emailEqualTo(String value) {
            addCriterion("buyer_email =", value, "buyer_email");
            return (Criteria) this;
        }

        public Criteria andBuyer_emailNotEqualTo(String value) {
            addCriterion("buyer_email <>", value, "buyer_email");
            return (Criteria) this;
        }

        public Criteria andBuyer_emailGreaterThan(String value) {
            addCriterion("buyer_email >", value, "buyer_email");
            return (Criteria) this;
        }

        public Criteria andBuyer_emailGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_email >=", value, "buyer_email");
            return (Criteria) this;
        }

        public Criteria andBuyer_emailLessThan(String value) {
            addCriterion("buyer_email <", value, "buyer_email");
            return (Criteria) this;
        }

        public Criteria andBuyer_emailLessThanOrEqualTo(String value) {
            addCriterion("buyer_email <=", value, "buyer_email");
            return (Criteria) this;
        }

        public Criteria andBuyer_emailLike(String value) {
            addCriterion("buyer_email like", value, "buyer_email");
            return (Criteria) this;
        }

        public Criteria andBuyer_emailNotLike(String value) {
            addCriterion("buyer_email not like", value, "buyer_email");
            return (Criteria) this;
        }

        public Criteria andBuyer_emailIn(List<String> values) {
            addCriterion("buyer_email in", values, "buyer_email");
            return (Criteria) this;
        }

        public Criteria andBuyer_emailNotIn(List<String> values) {
            addCriterion("buyer_email not in", values, "buyer_email");
            return (Criteria) this;
        }

        public Criteria andBuyer_emailBetween(String value1, String value2) {
            addCriterion("buyer_email between", value1, value2, "buyer_email");
            return (Criteria) this;
        }

        public Criteria andBuyer_emailNotBetween(String value1, String value2) {
            addCriterion("buyer_email not between", value1, value2, "buyer_email");
            return (Criteria) this;
        }

        public Criteria andBuyer_phoneIsNull() {
            addCriterion("buyer_phone is null");
            return (Criteria) this;
        }

        public Criteria andBuyer_phoneIsNotNull() {
            addCriterion("buyer_phone is not null");
            return (Criteria) this;
        }

        public Criteria andBuyer_phoneEqualTo(String value) {
            addCriterion("buyer_phone =", value, "buyer_phone");
            return (Criteria) this;
        }

        public Criteria andBuyer_phoneNotEqualTo(String value) {
            addCriterion("buyer_phone <>", value, "buyer_phone");
            return (Criteria) this;
        }

        public Criteria andBuyer_phoneGreaterThan(String value) {
            addCriterion("buyer_phone >", value, "buyer_phone");
            return (Criteria) this;
        }

        public Criteria andBuyer_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_phone >=", value, "buyer_phone");
            return (Criteria) this;
        }

        public Criteria andBuyer_phoneLessThan(String value) {
            addCriterion("buyer_phone <", value, "buyer_phone");
            return (Criteria) this;
        }

        public Criteria andBuyer_phoneLessThanOrEqualTo(String value) {
            addCriterion("buyer_phone <=", value, "buyer_phone");
            return (Criteria) this;
        }

        public Criteria andBuyer_phoneLike(String value) {
            addCriterion("buyer_phone like", value, "buyer_phone");
            return (Criteria) this;
        }

        public Criteria andBuyer_phoneNotLike(String value) {
            addCriterion("buyer_phone not like", value, "buyer_phone");
            return (Criteria) this;
        }

        public Criteria andBuyer_phoneIn(List<String> values) {
            addCriterion("buyer_phone in", values, "buyer_phone");
            return (Criteria) this;
        }

        public Criteria andBuyer_phoneNotIn(List<String> values) {
            addCriterion("buyer_phone not in", values, "buyer_phone");
            return (Criteria) this;
        }

        public Criteria andBuyer_phoneBetween(String value1, String value2) {
            addCriterion("buyer_phone between", value1, value2, "buyer_phone");
            return (Criteria) this;
        }

        public Criteria andBuyer_phoneNotBetween(String value1, String value2) {
            addCriterion("buyer_phone not between", value1, value2, "buyer_phone");
            return (Criteria) this;
        }

        public Criteria andBuyer_adsIsNull() {
            addCriterion("buyer_ads is null");
            return (Criteria) this;
        }

        public Criteria andBuyer_adsIsNotNull() {
            addCriterion("buyer_ads is not null");
            return (Criteria) this;
        }

        public Criteria andBuyer_adsEqualTo(String value) {
            addCriterion("buyer_ads =", value, "buyer_ads");
            return (Criteria) this;
        }

        public Criteria andBuyer_adsNotEqualTo(String value) {
            addCriterion("buyer_ads <>", value, "buyer_ads");
            return (Criteria) this;
        }

        public Criteria andBuyer_adsGreaterThan(String value) {
            addCriterion("buyer_ads >", value, "buyer_ads");
            return (Criteria) this;
        }

        public Criteria andBuyer_adsGreaterThanOrEqualTo(String value) {
            addCriterion("buyer_ads >=", value, "buyer_ads");
            return (Criteria) this;
        }

        public Criteria andBuyer_adsLessThan(String value) {
            addCriterion("buyer_ads <", value, "buyer_ads");
            return (Criteria) this;
        }

        public Criteria andBuyer_adsLessThanOrEqualTo(String value) {
            addCriterion("buyer_ads <=", value, "buyer_ads");
            return (Criteria) this;
        }

        public Criteria andBuyer_adsLike(String value) {
            addCriterion("buyer_ads like", value, "buyer_ads");
            return (Criteria) this;
        }

        public Criteria andBuyer_adsNotLike(String value) {
            addCriterion("buyer_ads not like", value, "buyer_ads");
            return (Criteria) this;
        }

        public Criteria andBuyer_adsIn(List<String> values) {
            addCriterion("buyer_ads in", values, "buyer_ads");
            return (Criteria) this;
        }

        public Criteria andBuyer_adsNotIn(List<String> values) {
            addCriterion("buyer_ads not in", values, "buyer_ads");
            return (Criteria) this;
        }

        public Criteria andBuyer_adsBetween(String value1, String value2) {
            addCriterion("buyer_ads between", value1, value2, "buyer_ads");
            return (Criteria) this;
        }

        public Criteria andBuyer_adsNotBetween(String value1, String value2) {
            addCriterion("buyer_ads not between", value1, value2, "buyer_ads");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreate_timeEqualTo(Date value) {
            addCriterion("create_time =", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThan(Date value) {
            addCriterion("create_time >", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThan(Date value) {
            addCriterion("create_time <", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeIn(List<Date> values) {
            addCriterion("create_time in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andCreate_timeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "create_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPay_timeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPay_timeEqualTo(Date value) {
            addCriterion("pay_time =", value, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeNotEqualTo(Date value) {
            addCriterion("pay_time <>", value, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeGreaterThan(Date value) {
            addCriterion("pay_time >", value, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_time >=", value, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeLessThan(Date value) {
            addCriterion("pay_time <", value, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeLessThanOrEqualTo(Date value) {
            addCriterion("pay_time <=", value, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeIn(List<Date> values) {
            addCriterion("pay_time in", values, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeNotIn(List<Date> values) {
            addCriterion("pay_time not in", values, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeBetween(Date value1, Date value2) {
            addCriterion("pay_time between", value1, value2, "pay_time");
            return (Criteria) this;
        }

        public Criteria andPay_timeNotBetween(Date value1, Date value2) {
            addCriterion("pay_time not between", value1, value2, "pay_time");
            return (Criteria) this;
        }

        public Criteria andCosign_timeIsNull() {
            addCriterion("cosign_time is null");
            return (Criteria) this;
        }

        public Criteria andCosign_timeIsNotNull() {
            addCriterion("cosign_time is not null");
            return (Criteria) this;
        }

        public Criteria andCosign_timeEqualTo(Date value) {
            addCriterion("cosign_time =", value, "cosign_time");
            return (Criteria) this;
        }

        public Criteria andCosign_timeNotEqualTo(Date value) {
            addCriterion("cosign_time <>", value, "cosign_time");
            return (Criteria) this;
        }

        public Criteria andCosign_timeGreaterThan(Date value) {
            addCriterion("cosign_time >", value, "cosign_time");
            return (Criteria) this;
        }

        public Criteria andCosign_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("cosign_time >=", value, "cosign_time");
            return (Criteria) this;
        }

        public Criteria andCosign_timeLessThan(Date value) {
            addCriterion("cosign_time <", value, "cosign_time");
            return (Criteria) this;
        }

        public Criteria andCosign_timeLessThanOrEqualTo(Date value) {
            addCriterion("cosign_time <=", value, "cosign_time");
            return (Criteria) this;
        }

        public Criteria andCosign_timeIn(List<Date> values) {
            addCriterion("cosign_time in", values, "cosign_time");
            return (Criteria) this;
        }

        public Criteria andCosign_timeNotIn(List<Date> values) {
            addCriterion("cosign_time not in", values, "cosign_time");
            return (Criteria) this;
        }

        public Criteria andCosign_timeBetween(Date value1, Date value2) {
            addCriterion("cosign_time between", value1, value2, "cosign_time");
            return (Criteria) this;
        }

        public Criteria andCosign_timeNotBetween(Date value1, Date value2) {
            addCriterion("cosign_time not between", value1, value2, "cosign_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEnd_timeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEnd_timeEqualTo(Date value) {
            addCriterion("end_time =", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeNotEqualTo(Date value) {
            addCriterion("end_time <>", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeGreaterThan(Date value) {
            addCriterion("end_time >", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeGreaterThanOrEqualTo(Date value) {
            addCriterion("end_time >=", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeLessThan(Date value) {
            addCriterion("end_time <", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeLessThanOrEqualTo(Date value) {
            addCriterion("end_time <=", value, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeIn(List<Date> values) {
            addCriterion("end_time in", values, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeNotIn(List<Date> values) {
            addCriterion("end_time not in", values, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeBetween(Date value1, Date value2) {
            addCriterion("end_time between", value1, value2, "end_time");
            return (Criteria) this;
        }

        public Criteria andEnd_timeNotBetween(Date value1, Date value2) {
            addCriterion("end_time not between", value1, value2, "end_time");
            return (Criteria) this;
        }

        public Criteria andShop_nameIsNull() {
            addCriterion("shop_name is null");
            return (Criteria) this;
        }

        public Criteria andShop_nameIsNotNull() {
            addCriterion("shop_name is not null");
            return (Criteria) this;
        }

        public Criteria andShop_nameEqualTo(String value) {
            addCriterion("shop_name =", value, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_nameNotEqualTo(String value) {
            addCriterion("shop_name <>", value, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_nameGreaterThan(String value) {
            addCriterion("shop_name >", value, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_nameGreaterThanOrEqualTo(String value) {
            addCriterion("shop_name >=", value, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_nameLessThan(String value) {
            addCriterion("shop_name <", value, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_nameLessThanOrEqualTo(String value) {
            addCriterion("shop_name <=", value, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_nameLike(String value) {
            addCriterion("shop_name like", value, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_nameNotLike(String value) {
            addCriterion("shop_name not like", value, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_nameIn(List<String> values) {
            addCriterion("shop_name in", values, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_nameNotIn(List<String> values) {
            addCriterion("shop_name not in", values, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_nameBetween(String value1, String value2) {
            addCriterion("shop_name between", value1, value2, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_nameNotBetween(String value1, String value2) {
            addCriterion("shop_name not between", value1, value2, "shop_name");
            return (Criteria) this;
        }

        public Criteria andShop_codeIsNull() {
            addCriterion("shop_code is null");
            return (Criteria) this;
        }

        public Criteria andShop_codeIsNotNull() {
            addCriterion("shop_code is not null");
            return (Criteria) this;
        }

        public Criteria andShop_codeEqualTo(String value) {
            addCriterion("shop_code =", value, "shop_code");
            return (Criteria) this;
        }

        public Criteria andShop_codeNotEqualTo(String value) {
            addCriterion("shop_code <>", value, "shop_code");
            return (Criteria) this;
        }

        public Criteria andShop_codeGreaterThan(String value) {
            addCriterion("shop_code >", value, "shop_code");
            return (Criteria) this;
        }

        public Criteria andShop_codeGreaterThanOrEqualTo(String value) {
            addCriterion("shop_code >=", value, "shop_code");
            return (Criteria) this;
        }

        public Criteria andShop_codeLessThan(String value) {
            addCriterion("shop_code <", value, "shop_code");
            return (Criteria) this;
        }

        public Criteria andShop_codeLessThanOrEqualTo(String value) {
            addCriterion("shop_code <=", value, "shop_code");
            return (Criteria) this;
        }

        public Criteria andShop_codeLike(String value) {
            addCriterion("shop_code like", value, "shop_code");
            return (Criteria) this;
        }

        public Criteria andShop_codeNotLike(String value) {
            addCriterion("shop_code not like", value, "shop_code");
            return (Criteria) this;
        }

        public Criteria andShop_codeIn(List<String> values) {
            addCriterion("shop_code in", values, "shop_code");
            return (Criteria) this;
        }

        public Criteria andShop_codeNotIn(List<String> values) {
            addCriterion("shop_code not in", values, "shop_code");
            return (Criteria) this;
        }

        public Criteria andShop_codeBetween(String value1, String value2) {
            addCriterion("shop_code between", value1, value2, "shop_code");
            return (Criteria) this;
        }

        public Criteria andShop_codeNotBetween(String value1, String value2) {
            addCriterion("shop_code not between", value1, value2, "shop_code");
            return (Criteria) this;
        }

        public Criteria andUidIsNull() {
            addCriterion("uid is null");
            return (Criteria) this;
        }

        public Criteria andUidIsNotNull() {
            addCriterion("uid is not null");
            return (Criteria) this;
        }

        public Criteria andUidEqualTo(Integer value) {
            addCriterion("uid =", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotEqualTo(Integer value) {
            addCriterion("uid <>", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThan(Integer value) {
            addCriterion("uid >", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidGreaterThanOrEqualTo(Integer value) {
            addCriterion("uid >=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThan(Integer value) {
            addCriterion("uid <", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidLessThanOrEqualTo(Integer value) {
            addCriterion("uid <=", value, "uid");
            return (Criteria) this;
        }

        public Criteria andUidIn(List<Integer> values) {
            addCriterion("uid in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotIn(List<Integer> values) {
            addCriterion("uid not in", values, "uid");
            return (Criteria) this;
        }

        public Criteria andUidBetween(Integer value1, Integer value2) {
            addCriterion("uid between", value1, value2, "uid");
            return (Criteria) this;
        }

        public Criteria andUidNotBetween(Integer value1, Integer value2) {
            addCriterion("uid not between", value1, value2, "uid");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * 
     * 
     * @author wcyong
     * 
     * @date 2020-03-23
     */
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