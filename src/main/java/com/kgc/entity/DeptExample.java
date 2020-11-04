package com.kgc.entity;

import java.util.ArrayList;
import java.util.List;

public class DeptExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DeptExample() {
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

        public Criteria andDeptidIsNull() {
            addCriterion("deptId is null");
            return (Criteria) this;
        }

        public Criteria andDeptidIsNotNull() {
            addCriterion("deptId is not null");
            return (Criteria) this;
        }

        public Criteria andDeptidEqualTo(Integer value) {
            addCriterion("deptId =", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotEqualTo(Integer value) {
            addCriterion("deptId <>", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThan(Integer value) {
            addCriterion("deptId >", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidGreaterThanOrEqualTo(Integer value) {
            addCriterion("deptId >=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThan(Integer value) {
            addCriterion("deptId <", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidLessThanOrEqualTo(Integer value) {
            addCriterion("deptId <=", value, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidIn(List<Integer> values) {
            addCriterion("deptId in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotIn(List<Integer> values) {
            addCriterion("deptId not in", values, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidBetween(Integer value1, Integer value2) {
            addCriterion("deptId between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptidNotBetween(Integer value1, Integer value2) {
            addCriterion("deptId not between", value1, value2, "deptid");
            return (Criteria) this;
        }

        public Criteria andDeptnameIsNull() {
            addCriterion("deptName is null");
            return (Criteria) this;
        }

        public Criteria andDeptnameIsNotNull() {
            addCriterion("deptName is not null");
            return (Criteria) this;
        }

        public Criteria andDeptnameEqualTo(String value) {
            addCriterion("deptName =", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotEqualTo(String value) {
            addCriterion("deptName <>", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThan(String value) {
            addCriterion("deptName >", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameGreaterThanOrEqualTo(String value) {
            addCriterion("deptName >=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThan(String value) {
            addCriterion("deptName <", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLessThanOrEqualTo(String value) {
            addCriterion("deptName <=", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameLike(String value) {
            addCriterion("deptName like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotLike(String value) {
            addCriterion("deptName not like", value, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameIn(List<String> values) {
            addCriterion("deptName in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotIn(List<String> values) {
            addCriterion("deptName not in", values, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameBetween(String value1, String value2) {
            addCriterion("deptName between", value1, value2, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptnameNotBetween(String value1, String value2) {
            addCriterion("deptName not between", value1, value2, "deptname");
            return (Criteria) this;
        }

        public Criteria andDeptlocationIsNull() {
            addCriterion("deptLocation is null");
            return (Criteria) this;
        }

        public Criteria andDeptlocationIsNotNull() {
            addCriterion("deptLocation is not null");
            return (Criteria) this;
        }

        public Criteria andDeptlocationEqualTo(String value) {
            addCriterion("deptLocation =", value, "deptlocation");
            return (Criteria) this;
        }

        public Criteria andDeptlocationNotEqualTo(String value) {
            addCriterion("deptLocation <>", value, "deptlocation");
            return (Criteria) this;
        }

        public Criteria andDeptlocationGreaterThan(String value) {
            addCriterion("deptLocation >", value, "deptlocation");
            return (Criteria) this;
        }

        public Criteria andDeptlocationGreaterThanOrEqualTo(String value) {
            addCriterion("deptLocation >=", value, "deptlocation");
            return (Criteria) this;
        }

        public Criteria andDeptlocationLessThan(String value) {
            addCriterion("deptLocation <", value, "deptlocation");
            return (Criteria) this;
        }

        public Criteria andDeptlocationLessThanOrEqualTo(String value) {
            addCriterion("deptLocation <=", value, "deptlocation");
            return (Criteria) this;
        }

        public Criteria andDeptlocationLike(String value) {
            addCriterion("deptLocation like", value, "deptlocation");
            return (Criteria) this;
        }

        public Criteria andDeptlocationNotLike(String value) {
            addCriterion("deptLocation not like", value, "deptlocation");
            return (Criteria) this;
        }

        public Criteria andDeptlocationIn(List<String> values) {
            addCriterion("deptLocation in", values, "deptlocation");
            return (Criteria) this;
        }

        public Criteria andDeptlocationNotIn(List<String> values) {
            addCriterion("deptLocation not in", values, "deptlocation");
            return (Criteria) this;
        }

        public Criteria andDeptlocationBetween(String value1, String value2) {
            addCriterion("deptLocation between", value1, value2, "deptlocation");
            return (Criteria) this;
        }

        public Criteria andDeptlocationNotBetween(String value1, String value2) {
            addCriterion("deptLocation not between", value1, value2, "deptlocation");
            return (Criteria) this;
        }

        public Criteria andPdeptidIsNull() {
            addCriterion("pdeptId is null");
            return (Criteria) this;
        }

        public Criteria andPdeptidIsNotNull() {
            addCriterion("pdeptId is not null");
            return (Criteria) this;
        }

        public Criteria andPdeptidEqualTo(Integer value) {
            addCriterion("pdeptId =", value, "pdeptid");
            return (Criteria) this;
        }

        public Criteria andPdeptidNotEqualTo(Integer value) {
            addCriterion("pdeptId <>", value, "pdeptid");
            return (Criteria) this;
        }

        public Criteria andPdeptidGreaterThan(Integer value) {
            addCriterion("pdeptId >", value, "pdeptid");
            return (Criteria) this;
        }

        public Criteria andPdeptidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pdeptId >=", value, "pdeptid");
            return (Criteria) this;
        }

        public Criteria andPdeptidLessThan(Integer value) {
            addCriterion("pdeptId <", value, "pdeptid");
            return (Criteria) this;
        }

        public Criteria andPdeptidLessThanOrEqualTo(Integer value) {
            addCriterion("pdeptId <=", value, "pdeptid");
            return (Criteria) this;
        }

        public Criteria andPdeptidIn(List<Integer> values) {
            addCriterion("pdeptId in", values, "pdeptid");
            return (Criteria) this;
        }

        public Criteria andPdeptidNotIn(List<Integer> values) {
            addCriterion("pdeptId not in", values, "pdeptid");
            return (Criteria) this;
        }

        public Criteria andPdeptidBetween(Integer value1, Integer value2) {
            addCriterion("pdeptId between", value1, value2, "pdeptid");
            return (Criteria) this;
        }

        public Criteria andPdeptidNotBetween(Integer value1, Integer value2) {
            addCriterion("pdeptId not between", value1, value2, "pdeptid");
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