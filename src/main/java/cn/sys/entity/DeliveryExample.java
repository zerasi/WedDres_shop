package cn.sys.entity;

import java.util.ArrayList;
import java.util.List;

public class DeliveryExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeliveryExample() {
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
     * InnoDB free: 9216 kB
     * 
     * @author wcyong
     * 
     * @date 2019-03-02
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

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * InnoDB free: 9216 kB
     * 
     * @author wcyong
     * 
     * @date 2019-03-02
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