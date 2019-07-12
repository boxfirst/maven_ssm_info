package com.daisy.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InForExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InForExample() {
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

        public Criteria andInforidIsNull() {
            addCriterion("inforid is null");
            return (Criteria) this;
        }

        public Criteria andInforidIsNotNull() {
            addCriterion("inforid is not null");
            return (Criteria) this;
        }

        public Criteria andInforidEqualTo(Long value) {
            addCriterion("inforid =", value, "inforid");
            return (Criteria) this;
        }

        public Criteria andInforidNotEqualTo(Long value) {
            addCriterion("inforid <>", value, "inforid");
            return (Criteria) this;
        }

        public Criteria andInforidGreaterThan(Long value) {
            addCriterion("inforid >", value, "inforid");
            return (Criteria) this;
        }

        public Criteria andInforidGreaterThanOrEqualTo(Long value) {
            addCriterion("inforid >=", value, "inforid");
            return (Criteria) this;
        }

        public Criteria andInforidLessThan(Long value) {
            addCriterion("inforid <", value, "inforid");
            return (Criteria) this;
        }

        public Criteria andInforidLessThanOrEqualTo(Long value) {
            addCriterion("inforid <=", value, "inforid");
            return (Criteria) this;
        }

        public Criteria andInforidIn(List<Long> values) {
            addCriterion("inforid in", values, "inforid");
            return (Criteria) this;
        }

        public Criteria andInforidNotIn(List<Long> values) {
            addCriterion("inforid not in", values, "inforid");
            return (Criteria) this;
        }

        public Criteria andInforidBetween(Long value1, Long value2) {
            addCriterion("inforid between", value1, value2, "inforid");
            return (Criteria) this;
        }

        public Criteria andInforidNotBetween(Long value1, Long value2) {
            addCriterion("inforid not between", value1, value2, "inforid");
            return (Criteria) this;
        }

        public Criteria andInfornumberIsNull() {
            addCriterion("infornumber is null");
            return (Criteria) this;
        }

        public Criteria andInfornumberIsNotNull() {
            addCriterion("infornumber is not null");
            return (Criteria) this;
        }

        public Criteria andInfornumberEqualTo(String value) {
            addCriterion("infornumber =", value, "infornumber");
            return (Criteria) this;
        }

        public Criteria andInfornumberNotEqualTo(String value) {
            addCriterion("infornumber <>", value, "infornumber");
            return (Criteria) this;
        }

        public Criteria andInfornumberGreaterThan(String value) {
            addCriterion("infornumber >", value, "infornumber");
            return (Criteria) this;
        }

        public Criteria andInfornumberGreaterThanOrEqualTo(String value) {
            addCriterion("infornumber >=", value, "infornumber");
            return (Criteria) this;
        }

        public Criteria andInfornumberLessThan(String value) {
            addCriterion("infornumber <", value, "infornumber");
            return (Criteria) this;
        }

        public Criteria andInfornumberLessThanOrEqualTo(String value) {
            addCriterion("infornumber <=", value, "infornumber");
            return (Criteria) this;
        }

        public Criteria andInfornumberLike(String value) {
            addCriterion("infornumber like", value, "infornumber");
            return (Criteria) this;
        }

        public Criteria andInfornumberNotLike(String value) {
            addCriterion("infornumber not like", value, "infornumber");
            return (Criteria) this;
        }

        public Criteria andInfornumberIn(List<String> values) {
            addCriterion("infornumber in", values, "infornumber");
            return (Criteria) this;
        }

        public Criteria andInfornumberNotIn(List<String> values) {
            addCriterion("infornumber not in", values, "infornumber");
            return (Criteria) this;
        }

        public Criteria andInfornumberBetween(String value1, String value2) {
            addCriterion("infornumber between", value1, value2, "infornumber");
            return (Criteria) this;
        }

        public Criteria andInfornumberNotBetween(String value1, String value2) {
            addCriterion("infornumber not between", value1, value2, "infornumber");
            return (Criteria) this;
        }

        public Criteria andInfornameIsNull() {
            addCriterion("inforname is null");
            return (Criteria) this;
        }

        public Criteria andInfornameIsNotNull() {
            addCriterion("inforname is not null");
            return (Criteria) this;
        }

        public Criteria andInfornameEqualTo(String value) {
            addCriterion("inforname =", value, "inforname");
            return (Criteria) this;
        }

        public Criteria andInfornameNotEqualTo(String value) {
            addCriterion("inforname <>", value, "inforname");
            return (Criteria) this;
        }

        public Criteria andInfornameGreaterThan(String value) {
            addCriterion("inforname >", value, "inforname");
            return (Criteria) this;
        }

        public Criteria andInfornameGreaterThanOrEqualTo(String value) {
            addCriterion("inforname >=", value, "inforname");
            return (Criteria) this;
        }

        public Criteria andInfornameLessThan(String value) {
            addCriterion("inforname <", value, "inforname");
            return (Criteria) this;
        }

        public Criteria andInfornameLessThanOrEqualTo(String value) {
            addCriterion("inforname <=", value, "inforname");
            return (Criteria) this;
        }

        public Criteria andInfornameLike(String value) {
            addCriterion("inforname like", value, "inforname");
            return (Criteria) this;
        }

        public Criteria andInfornameNotLike(String value) {
            addCriterion("inforname not like", value, "inforname");
            return (Criteria) this;
        }

        public Criteria andInfornameIn(List<String> values) {
            addCriterion("inforname in", values, "inforname");
            return (Criteria) this;
        }

        public Criteria andInfornameNotIn(List<String> values) {
            addCriterion("inforname not in", values, "inforname");
            return (Criteria) this;
        }

        public Criteria andInfornameBetween(String value1, String value2) {
            addCriterion("inforname between", value1, value2, "inforname");
            return (Criteria) this;
        }

        public Criteria andInfornameNotBetween(String value1, String value2) {
            addCriterion("inforname not between", value1, value2, "inforname");
            return (Criteria) this;
        }

        public Criteria andSexIsNull() {
            addCriterion("sex is null");
            return (Criteria) this;
        }

        public Criteria andSexIsNotNull() {
            addCriterion("sex is not null");
            return (Criteria) this;
        }

        public Criteria andSexEqualTo(String value) {
            addCriterion("sex =", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotEqualTo(String value) {
            addCriterion("sex <>", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThan(String value) {
            addCriterion("sex >", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexGreaterThanOrEqualTo(String value) {
            addCriterion("sex >=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThan(String value) {
            addCriterion("sex <", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLessThanOrEqualTo(String value) {
            addCriterion("sex <=", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexLike(String value) {
            addCriterion("sex like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotLike(String value) {
            addCriterion("sex not like", value, "sex");
            return (Criteria) this;
        }

        public Criteria andSexIn(List<String> values) {
            addCriterion("sex in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotIn(List<String> values) {
            addCriterion("sex not in", values, "sex");
            return (Criteria) this;
        }

        public Criteria andSexBetween(String value1, String value2) {
            addCriterion("sex between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andSexNotBetween(String value1, String value2) {
            addCriterion("sex not between", value1, value2, "sex");
            return (Criteria) this;
        }

        public Criteria andInforageIsNull() {
            addCriterion("inforage is null");
            return (Criteria) this;
        }

        public Criteria andInforageIsNotNull() {
            addCriterion("inforage is not null");
            return (Criteria) this;
        }

        public Criteria andInforageEqualTo(Integer value) {
            addCriterion("inforage =", value, "inforage");
            return (Criteria) this;
        }

        public Criteria andInforageNotEqualTo(Integer value) {
            addCriterion("inforage <>", value, "inforage");
            return (Criteria) this;
        }

        public Criteria andInforageGreaterThan(Integer value) {
            addCriterion("inforage >", value, "inforage");
            return (Criteria) this;
        }

        public Criteria andInforageGreaterThanOrEqualTo(Integer value) {
            addCriterion("inforage >=", value, "inforage");
            return (Criteria) this;
        }

        public Criteria andInforageLessThan(Integer value) {
            addCriterion("inforage <", value, "inforage");
            return (Criteria) this;
        }

        public Criteria andInforageLessThanOrEqualTo(Integer value) {
            addCriterion("inforage <=", value, "inforage");
            return (Criteria) this;
        }

        public Criteria andInforageIn(List<Integer> values) {
            addCriterion("inforage in", values, "inforage");
            return (Criteria) this;
        }

        public Criteria andInforageNotIn(List<Integer> values) {
            addCriterion("inforage not in", values, "inforage");
            return (Criteria) this;
        }

        public Criteria andInforageBetween(Integer value1, Integer value2) {
            addCriterion("inforage between", value1, value2, "inforage");
            return (Criteria) this;
        }

        public Criteria andInforageNotBetween(Integer value1, Integer value2) {
            addCriterion("inforage not between", value1, value2, "inforage");
            return (Criteria) this;
        }

        public Criteria andInforpasswordIsNull() {
            addCriterion("inforpassword is null");
            return (Criteria) this;
        }

        public Criteria andInforpasswordIsNotNull() {
            addCriterion("inforpassword is not null");
            return (Criteria) this;
        }

        public Criteria andInforpasswordEqualTo(String value) {
            addCriterion("inforpassword =", value, "inforpassword");
            return (Criteria) this;
        }

        public Criteria andInforpasswordNotEqualTo(String value) {
            addCriterion("inforpassword <>", value, "inforpassword");
            return (Criteria) this;
        }

        public Criteria andInforpasswordGreaterThan(String value) {
            addCriterion("inforpassword >", value, "inforpassword");
            return (Criteria) this;
        }

        public Criteria andInforpasswordGreaterThanOrEqualTo(String value) {
            addCriterion("inforpassword >=", value, "inforpassword");
            return (Criteria) this;
        }

        public Criteria andInforpasswordLessThan(String value) {
            addCriterion("inforpassword <", value, "inforpassword");
            return (Criteria) this;
        }

        public Criteria andInforpasswordLessThanOrEqualTo(String value) {
            addCriterion("inforpassword <=", value, "inforpassword");
            return (Criteria) this;
        }

        public Criteria andInforpasswordLike(String value) {
            addCriterion("inforpassword like", value, "inforpassword");
            return (Criteria) this;
        }

        public Criteria andInforpasswordNotLike(String value) {
            addCriterion("inforpassword not like", value, "inforpassword");
            return (Criteria) this;
        }

        public Criteria andInforpasswordIn(List<String> values) {
            addCriterion("inforpassword in", values, "inforpassword");
            return (Criteria) this;
        }

        public Criteria andInforpasswordNotIn(List<String> values) {
            addCriterion("inforpassword not in", values, "inforpassword");
            return (Criteria) this;
        }

        public Criteria andInforpasswordBetween(String value1, String value2) {
            addCriterion("inforpassword between", value1, value2, "inforpassword");
            return (Criteria) this;
        }

        public Criteria andInforpasswordNotBetween(String value1, String value2) {
            addCriterion("inforpassword not between", value1, value2, "inforpassword");
            return (Criteria) this;
        }

        public Criteria andInforphoneIsNull() {
            addCriterion("inforphone is null");
            return (Criteria) this;
        }

        public Criteria andInforphoneIsNotNull() {
            addCriterion("inforphone is not null");
            return (Criteria) this;
        }

        public Criteria andInforphoneEqualTo(String value) {
            addCriterion("inforphone =", value, "inforphone");
            return (Criteria) this;
        }

        public Criteria andInforphoneNotEqualTo(String value) {
            addCriterion("inforphone <>", value, "inforphone");
            return (Criteria) this;
        }

        public Criteria andInforphoneGreaterThan(String value) {
            addCriterion("inforphone >", value, "inforphone");
            return (Criteria) this;
        }

        public Criteria andInforphoneGreaterThanOrEqualTo(String value) {
            addCriterion("inforphone >=", value, "inforphone");
            return (Criteria) this;
        }

        public Criteria andInforphoneLessThan(String value) {
            addCriterion("inforphone <", value, "inforphone");
            return (Criteria) this;
        }

        public Criteria andInforphoneLessThanOrEqualTo(String value) {
            addCriterion("inforphone <=", value, "inforphone");
            return (Criteria) this;
        }

        public Criteria andInforphoneLike(String value) {
            addCriterion("inforphone like", value, "inforphone");
            return (Criteria) this;
        }

        public Criteria andInforphoneNotLike(String value) {
            addCriterion("inforphone not like", value, "inforphone");
            return (Criteria) this;
        }

        public Criteria andInforphoneIn(List<String> values) {
            addCriterion("inforphone in", values, "inforphone");
            return (Criteria) this;
        }

        public Criteria andInforphoneNotIn(List<String> values) {
            addCriterion("inforphone not in", values, "inforphone");
            return (Criteria) this;
        }

        public Criteria andInforphoneBetween(String value1, String value2) {
            addCriterion("inforphone between", value1, value2, "inforphone");
            return (Criteria) this;
        }

        public Criteria andInforphoneNotBetween(String value1, String value2) {
            addCriterion("inforphone not between", value1, value2, "inforphone");
            return (Criteria) this;
        }

        public Criteria andJobidIsNull() {
            addCriterion("jobid is null");
            return (Criteria) this;
        }

        public Criteria andJobidIsNotNull() {
            addCriterion("jobid is not null");
            return (Criteria) this;
        }

        public Criteria andJobidEqualTo(Integer value) {
            addCriterion("jobid =", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotEqualTo(Integer value) {
            addCriterion("jobid <>", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThan(Integer value) {
            addCriterion("jobid >", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidGreaterThanOrEqualTo(Integer value) {
            addCriterion("jobid >=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThan(Integer value) {
            addCriterion("jobid <", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidLessThanOrEqualTo(Integer value) {
            addCriterion("jobid <=", value, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidIn(List<Integer> values) {
            addCriterion("jobid in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotIn(List<Integer> values) {
            addCriterion("jobid not in", values, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidBetween(Integer value1, Integer value2) {
            addCriterion("jobid between", value1, value2, "jobid");
            return (Criteria) this;
        }

        public Criteria andJobidNotBetween(Integer value1, Integer value2) {
            addCriterion("jobid not between", value1, value2, "jobid");
            return (Criteria) this;
        }

        public Criteria andRegistdateIsNull() {
            addCriterion("registdate is null");
            return (Criteria) this;
        }

        public Criteria andRegistdateIsNotNull() {
            addCriterion("registdate is not null");
            return (Criteria) this;
        }

        public Criteria andRegistdateEqualTo(Date value) {
            addCriterion("registdate =", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateNotEqualTo(Date value) {
            addCriterion("registdate <>", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateGreaterThan(Date value) {
            addCriterion("registdate >", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateGreaterThanOrEqualTo(Date value) {
            addCriterion("registdate >=", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateLessThan(Date value) {
            addCriterion("registdate <", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateLessThanOrEqualTo(Date value) {
            addCriterion("registdate <=", value, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateIn(List<Date> values) {
            addCriterion("registdate in", values, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateNotIn(List<Date> values) {
            addCriterion("registdate not in", values, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateBetween(Date value1, Date value2) {
            addCriterion("registdate between", value1, value2, "registdate");
            return (Criteria) this;
        }

        public Criteria andRegistdateNotBetween(Date value1, Date value2) {
            addCriterion("registdate not between", value1, value2, "registdate");
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