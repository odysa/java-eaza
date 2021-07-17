package com.eaza.server.model;

import java.util.ArrayList;
import java.util.List;

public class GradeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GradeExample() {
        oredCriteria = new ArrayList<>();
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
            criteria = new ArrayList<>();
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

        public Criteria andCourseOfferingUuidIsNull() {
            addCriterion("course_offering_uuid is null");
            return (Criteria) this;
        }

        public Criteria andCourseOfferingUuidIsNotNull() {
            addCriterion("course_offering_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andCourseOfferingUuidEqualTo(String value) {
            addCriterion("course_offering_uuid =", value, "courseOfferingUuid");
            return (Criteria) this;
        }

        public Criteria andCourseOfferingUuidNotEqualTo(String value) {
            addCriterion("course_offering_uuid <>", value, "courseOfferingUuid");
            return (Criteria) this;
        }

        public Criteria andCourseOfferingUuidGreaterThan(String value) {
            addCriterion("course_offering_uuid >", value, "courseOfferingUuid");
            return (Criteria) this;
        }

        public Criteria andCourseOfferingUuidGreaterThanOrEqualTo(String value) {
            addCriterion("course_offering_uuid >=", value, "courseOfferingUuid");
            return (Criteria) this;
        }

        public Criteria andCourseOfferingUuidLessThan(String value) {
            addCriterion("course_offering_uuid <", value, "courseOfferingUuid");
            return (Criteria) this;
        }

        public Criteria andCourseOfferingUuidLessThanOrEqualTo(String value) {
            addCriterion("course_offering_uuid <=", value, "courseOfferingUuid");
            return (Criteria) this;
        }

        public Criteria andCourseOfferingUuidLike(String value) {
            addCriterion("course_offering_uuid like", value, "courseOfferingUuid");
            return (Criteria) this;
        }

        public Criteria andCourseOfferingUuidNotLike(String value) {
            addCriterion("course_offering_uuid not like", value, "courseOfferingUuid");
            return (Criteria) this;
        }

        public Criteria andCourseOfferingUuidIn(List<String> values) {
            addCriterion("course_offering_uuid in", values, "courseOfferingUuid");
            return (Criteria) this;
        }

        public Criteria andCourseOfferingUuidNotIn(List<String> values) {
            addCriterion("course_offering_uuid not in", values, "courseOfferingUuid");
            return (Criteria) this;
        }

        public Criteria andCourseOfferingUuidBetween(String value1, String value2) {
            addCriterion("course_offering_uuid between", value1, value2, "courseOfferingUuid");
            return (Criteria) this;
        }

        public Criteria andCourseOfferingUuidNotBetween(String value1, String value2) {
            addCriterion("course_offering_uuid not between", value1, value2, "courseOfferingUuid");
            return (Criteria) this;
        }

        public Criteria andSectionNumberIsNull() {
            addCriterion("section_number is null");
            return (Criteria) this;
        }

        public Criteria andSectionNumberIsNotNull() {
            addCriterion("section_number is not null");
            return (Criteria) this;
        }

        public Criteria andSectionNumberEqualTo(Integer value) {
            addCriterion("section_number =", value, "sectionNumber");
            return (Criteria) this;
        }

        public Criteria andSectionNumberNotEqualTo(Integer value) {
            addCriterion("section_number <>", value, "sectionNumber");
            return (Criteria) this;
        }

        public Criteria andSectionNumberGreaterThan(Integer value) {
            addCriterion("section_number >", value, "sectionNumber");
            return (Criteria) this;
        }

        public Criteria andSectionNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("section_number >=", value, "sectionNumber");
            return (Criteria) this;
        }

        public Criteria andSectionNumberLessThan(Integer value) {
            addCriterion("section_number <", value, "sectionNumber");
            return (Criteria) this;
        }

        public Criteria andSectionNumberLessThanOrEqualTo(Integer value) {
            addCriterion("section_number <=", value, "sectionNumber");
            return (Criteria) this;
        }

        public Criteria andSectionNumberIn(List<Integer> values) {
            addCriterion("section_number in", values, "sectionNumber");
            return (Criteria) this;
        }

        public Criteria andSectionNumberNotIn(List<Integer> values) {
            addCriterion("section_number not in", values, "sectionNumber");
            return (Criteria) this;
        }

        public Criteria andSectionNumberBetween(Integer value1, Integer value2) {
            addCriterion("section_number between", value1, value2, "sectionNumber");
            return (Criteria) this;
        }

        public Criteria andSectionNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("section_number not between", value1, value2, "sectionNumber");
            return (Criteria) this;
        }

        public Criteria andGpaIsNull() {
            addCriterion("gpa is null");
            return (Criteria) this;
        }

        public Criteria andGpaIsNotNull() {
            addCriterion("gpa is not null");
            return (Criteria) this;
        }

        public Criteria andGpaEqualTo(Double value) {
            addCriterion("gpa =", value, "gpa");
            return (Criteria) this;
        }

        public Criteria andGpaNotEqualTo(Double value) {
            addCriterion("gpa <>", value, "gpa");
            return (Criteria) this;
        }

        public Criteria andGpaGreaterThan(Double value) {
            addCriterion("gpa >", value, "gpa");
            return (Criteria) this;
        }

        public Criteria andGpaGreaterThanOrEqualTo(Double value) {
            addCriterion("gpa >=", value, "gpa");
            return (Criteria) this;
        }

        public Criteria andGpaLessThan(Double value) {
            addCriterion("gpa <", value, "gpa");
            return (Criteria) this;
        }

        public Criteria andGpaLessThanOrEqualTo(Double value) {
            addCriterion("gpa <=", value, "gpa");
            return (Criteria) this;
        }

        public Criteria andGpaIn(List<Double> values) {
            addCriterion("gpa in", values, "gpa");
            return (Criteria) this;
        }

        public Criteria andGpaNotIn(List<Double> values) {
            addCriterion("gpa not in", values, "gpa");
            return (Criteria) this;
        }

        public Criteria andGpaBetween(Double value1, Double value2) {
            addCriterion("gpa between", value1, value2, "gpa");
            return (Criteria) this;
        }

        public Criteria andGpaNotBetween(Double value1, Double value2) {
            addCriterion("gpa not between", value1, value2, "gpa");
            return (Criteria) this;
        }

        public Criteria andACountIsNull() {
            addCriterion("a_count is null");
            return (Criteria) this;
        }

        public Criteria andACountIsNotNull() {
            addCriterion("a_count is not null");
            return (Criteria) this;
        }

        public Criteria andACountEqualTo(Integer value) {
            addCriterion("a_count =", value, "aCount");
            return (Criteria) this;
        }

        public Criteria andACountNotEqualTo(Integer value) {
            addCriterion("a_count <>", value, "aCount");
            return (Criteria) this;
        }

        public Criteria andACountGreaterThan(Integer value) {
            addCriterion("a_count >", value, "aCount");
            return (Criteria) this;
        }

        public Criteria andACountGreaterThanOrEqualTo(Integer value) {
            addCriterion("a_count >=", value, "aCount");
            return (Criteria) this;
        }

        public Criteria andACountLessThan(Integer value) {
            addCriterion("a_count <", value, "aCount");
            return (Criteria) this;
        }

        public Criteria andACountLessThanOrEqualTo(Integer value) {
            addCriterion("a_count <=", value, "aCount");
            return (Criteria) this;
        }

        public Criteria andACountIn(List<Integer> values) {
            addCriterion("a_count in", values, "aCount");
            return (Criteria) this;
        }

        public Criteria andACountNotIn(List<Integer> values) {
            addCriterion("a_count not in", values, "aCount");
            return (Criteria) this;
        }

        public Criteria andACountBetween(Integer value1, Integer value2) {
            addCriterion("a_count between", value1, value2, "aCount");
            return (Criteria) this;
        }

        public Criteria andACountNotBetween(Integer value1, Integer value2) {
            addCriterion("a_count not between", value1, value2, "aCount");
            return (Criteria) this;
        }

        public Criteria andAbCountIsNull() {
            addCriterion("ab_count is null");
            return (Criteria) this;
        }

        public Criteria andAbCountIsNotNull() {
            addCriterion("ab_count is not null");
            return (Criteria) this;
        }

        public Criteria andAbCountEqualTo(Integer value) {
            addCriterion("ab_count =", value, "abCount");
            return (Criteria) this;
        }

        public Criteria andAbCountNotEqualTo(Integer value) {
            addCriterion("ab_count <>", value, "abCount");
            return (Criteria) this;
        }

        public Criteria andAbCountGreaterThan(Integer value) {
            addCriterion("ab_count >", value, "abCount");
            return (Criteria) this;
        }

        public Criteria andAbCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("ab_count >=", value, "abCount");
            return (Criteria) this;
        }

        public Criteria andAbCountLessThan(Integer value) {
            addCriterion("ab_count <", value, "abCount");
            return (Criteria) this;
        }

        public Criteria andAbCountLessThanOrEqualTo(Integer value) {
            addCriterion("ab_count <=", value, "abCount");
            return (Criteria) this;
        }

        public Criteria andAbCountIn(List<Integer> values) {
            addCriterion("ab_count in", values, "abCount");
            return (Criteria) this;
        }

        public Criteria andAbCountNotIn(List<Integer> values) {
            addCriterion("ab_count not in", values, "abCount");
            return (Criteria) this;
        }

        public Criteria andAbCountBetween(Integer value1, Integer value2) {
            addCriterion("ab_count between", value1, value2, "abCount");
            return (Criteria) this;
        }

        public Criteria andAbCountNotBetween(Integer value1, Integer value2) {
            addCriterion("ab_count not between", value1, value2, "abCount");
            return (Criteria) this;
        }

        public Criteria andBCountIsNull() {
            addCriterion("b_count is null");
            return (Criteria) this;
        }

        public Criteria andBCountIsNotNull() {
            addCriterion("b_count is not null");
            return (Criteria) this;
        }

        public Criteria andBCountEqualTo(Integer value) {
            addCriterion("b_count =", value, "bCount");
            return (Criteria) this;
        }

        public Criteria andBCountNotEqualTo(Integer value) {
            addCriterion("b_count <>", value, "bCount");
            return (Criteria) this;
        }

        public Criteria andBCountGreaterThan(Integer value) {
            addCriterion("b_count >", value, "bCount");
            return (Criteria) this;
        }

        public Criteria andBCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("b_count >=", value, "bCount");
            return (Criteria) this;
        }

        public Criteria andBCountLessThan(Integer value) {
            addCriterion("b_count <", value, "bCount");
            return (Criteria) this;
        }

        public Criteria andBCountLessThanOrEqualTo(Integer value) {
            addCriterion("b_count <=", value, "bCount");
            return (Criteria) this;
        }

        public Criteria andBCountIn(List<Integer> values) {
            addCriterion("b_count in", values, "bCount");
            return (Criteria) this;
        }

        public Criteria andBCountNotIn(List<Integer> values) {
            addCriterion("b_count not in", values, "bCount");
            return (Criteria) this;
        }

        public Criteria andBCountBetween(Integer value1, Integer value2) {
            addCriterion("b_count between", value1, value2, "bCount");
            return (Criteria) this;
        }

        public Criteria andBCountNotBetween(Integer value1, Integer value2) {
            addCriterion("b_count not between", value1, value2, "bCount");
            return (Criteria) this;
        }

        public Criteria andBcCountIsNull() {
            addCriterion("bc_count is null");
            return (Criteria) this;
        }

        public Criteria andBcCountIsNotNull() {
            addCriterion("bc_count is not null");
            return (Criteria) this;
        }

        public Criteria andBcCountEqualTo(Integer value) {
            addCriterion("bc_count =", value, "bcCount");
            return (Criteria) this;
        }

        public Criteria andBcCountNotEqualTo(Integer value) {
            addCriterion("bc_count <>", value, "bcCount");
            return (Criteria) this;
        }

        public Criteria andBcCountGreaterThan(Integer value) {
            addCriterion("bc_count >", value, "bcCount");
            return (Criteria) this;
        }

        public Criteria andBcCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("bc_count >=", value, "bcCount");
            return (Criteria) this;
        }

        public Criteria andBcCountLessThan(Integer value) {
            addCriterion("bc_count <", value, "bcCount");
            return (Criteria) this;
        }

        public Criteria andBcCountLessThanOrEqualTo(Integer value) {
            addCriterion("bc_count <=", value, "bcCount");
            return (Criteria) this;
        }

        public Criteria andBcCountIn(List<Integer> values) {
            addCriterion("bc_count in", values, "bcCount");
            return (Criteria) this;
        }

        public Criteria andBcCountNotIn(List<Integer> values) {
            addCriterion("bc_count not in", values, "bcCount");
            return (Criteria) this;
        }

        public Criteria andBcCountBetween(Integer value1, Integer value2) {
            addCriterion("bc_count between", value1, value2, "bcCount");
            return (Criteria) this;
        }

        public Criteria andBcCountNotBetween(Integer value1, Integer value2) {
            addCriterion("bc_count not between", value1, value2, "bcCount");
            return (Criteria) this;
        }

        public Criteria andCCountIsNull() {
            addCriterion("c_count is null");
            return (Criteria) this;
        }

        public Criteria andCCountIsNotNull() {
            addCriterion("c_count is not null");
            return (Criteria) this;
        }

        public Criteria andCCountEqualTo(Integer value) {
            addCriterion("c_count =", value, "cCount");
            return (Criteria) this;
        }

        public Criteria andCCountNotEqualTo(Integer value) {
            addCriterion("c_count <>", value, "cCount");
            return (Criteria) this;
        }

        public Criteria andCCountGreaterThan(Integer value) {
            addCriterion("c_count >", value, "cCount");
            return (Criteria) this;
        }

        public Criteria andCCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("c_count >=", value, "cCount");
            return (Criteria) this;
        }

        public Criteria andCCountLessThan(Integer value) {
            addCriterion("c_count <", value, "cCount");
            return (Criteria) this;
        }

        public Criteria andCCountLessThanOrEqualTo(Integer value) {
            addCriterion("c_count <=", value, "cCount");
            return (Criteria) this;
        }

        public Criteria andCCountIn(List<Integer> values) {
            addCriterion("c_count in", values, "cCount");
            return (Criteria) this;
        }

        public Criteria andCCountNotIn(List<Integer> values) {
            addCriterion("c_count not in", values, "cCount");
            return (Criteria) this;
        }

        public Criteria andCCountBetween(Integer value1, Integer value2) {
            addCriterion("c_count between", value1, value2, "cCount");
            return (Criteria) this;
        }

        public Criteria andCCountNotBetween(Integer value1, Integer value2) {
            addCriterion("c_count not between", value1, value2, "cCount");
            return (Criteria) this;
        }

        public Criteria andDCountIsNull() {
            addCriterion("d_count is null");
            return (Criteria) this;
        }

        public Criteria andDCountIsNotNull() {
            addCriterion("d_count is not null");
            return (Criteria) this;
        }

        public Criteria andDCountEqualTo(Integer value) {
            addCriterion("d_count =", value, "dCount");
            return (Criteria) this;
        }

        public Criteria andDCountNotEqualTo(Integer value) {
            addCriterion("d_count <>", value, "dCount");
            return (Criteria) this;
        }

        public Criteria andDCountGreaterThan(Integer value) {
            addCriterion("d_count >", value, "dCount");
            return (Criteria) this;
        }

        public Criteria andDCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_count >=", value, "dCount");
            return (Criteria) this;
        }

        public Criteria andDCountLessThan(Integer value) {
            addCriterion("d_count <", value, "dCount");
            return (Criteria) this;
        }

        public Criteria andDCountLessThanOrEqualTo(Integer value) {
            addCriterion("d_count <=", value, "dCount");
            return (Criteria) this;
        }

        public Criteria andDCountIn(List<Integer> values) {
            addCriterion("d_count in", values, "dCount");
            return (Criteria) this;
        }

        public Criteria andDCountNotIn(List<Integer> values) {
            addCriterion("d_count not in", values, "dCount");
            return (Criteria) this;
        }

        public Criteria andDCountBetween(Integer value1, Integer value2) {
            addCriterion("d_count between", value1, value2, "dCount");
            return (Criteria) this;
        }

        public Criteria andDCountNotBetween(Integer value1, Integer value2) {
            addCriterion("d_count not between", value1, value2, "dCount");
            return (Criteria) this;
        }

        public Criteria andFCountIsNull() {
            addCriterion("f_count is null");
            return (Criteria) this;
        }

        public Criteria andFCountIsNotNull() {
            addCriterion("f_count is not null");
            return (Criteria) this;
        }

        public Criteria andFCountEqualTo(Integer value) {
            addCriterion("f_count =", value, "fCount");
            return (Criteria) this;
        }

        public Criteria andFCountNotEqualTo(Integer value) {
            addCriterion("f_count <>", value, "fCount");
            return (Criteria) this;
        }

        public Criteria andFCountGreaterThan(Integer value) {
            addCriterion("f_count >", value, "fCount");
            return (Criteria) this;
        }

        public Criteria andFCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("f_count >=", value, "fCount");
            return (Criteria) this;
        }

        public Criteria andFCountLessThan(Integer value) {
            addCriterion("f_count <", value, "fCount");
            return (Criteria) this;
        }

        public Criteria andFCountLessThanOrEqualTo(Integer value) {
            addCriterion("f_count <=", value, "fCount");
            return (Criteria) this;
        }

        public Criteria andFCountIn(List<Integer> values) {
            addCriterion("f_count in", values, "fCount");
            return (Criteria) this;
        }

        public Criteria andFCountNotIn(List<Integer> values) {
            addCriterion("f_count not in", values, "fCount");
            return (Criteria) this;
        }

        public Criteria andFCountBetween(Integer value1, Integer value2) {
            addCriterion("f_count between", value1, value2, "fCount");
            return (Criteria) this;
        }

        public Criteria andFCountNotBetween(Integer value1, Integer value2) {
            addCriterion("f_count not between", value1, value2, "fCount");
            return (Criteria) this;
        }

        public Criteria andSCountIsNull() {
            addCriterion("s_count is null");
            return (Criteria) this;
        }

        public Criteria andSCountIsNotNull() {
            addCriterion("s_count is not null");
            return (Criteria) this;
        }

        public Criteria andSCountEqualTo(Integer value) {
            addCriterion("s_count =", value, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountNotEqualTo(Integer value) {
            addCriterion("s_count <>", value, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountGreaterThan(Integer value) {
            addCriterion("s_count >", value, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("s_count >=", value, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountLessThan(Integer value) {
            addCriterion("s_count <", value, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountLessThanOrEqualTo(Integer value) {
            addCriterion("s_count <=", value, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountIn(List<Integer> values) {
            addCriterion("s_count in", values, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountNotIn(List<Integer> values) {
            addCriterion("s_count not in", values, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountBetween(Integer value1, Integer value2) {
            addCriterion("s_count between", value1, value2, "sCount");
            return (Criteria) this;
        }

        public Criteria andSCountNotBetween(Integer value1, Integer value2) {
            addCriterion("s_count not between", value1, value2, "sCount");
            return (Criteria) this;
        }

        public Criteria andUCountIsNull() {
            addCriterion("u_count is null");
            return (Criteria) this;
        }

        public Criteria andUCountIsNotNull() {
            addCriterion("u_count is not null");
            return (Criteria) this;
        }

        public Criteria andUCountEqualTo(Integer value) {
            addCriterion("u_count =", value, "uCount");
            return (Criteria) this;
        }

        public Criteria andUCountNotEqualTo(Integer value) {
            addCriterion("u_count <>", value, "uCount");
            return (Criteria) this;
        }

        public Criteria andUCountGreaterThan(Integer value) {
            addCriterion("u_count >", value, "uCount");
            return (Criteria) this;
        }

        public Criteria andUCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("u_count >=", value, "uCount");
            return (Criteria) this;
        }

        public Criteria andUCountLessThan(Integer value) {
            addCriterion("u_count <", value, "uCount");
            return (Criteria) this;
        }

        public Criteria andUCountLessThanOrEqualTo(Integer value) {
            addCriterion("u_count <=", value, "uCount");
            return (Criteria) this;
        }

        public Criteria andUCountIn(List<Integer> values) {
            addCriterion("u_count in", values, "uCount");
            return (Criteria) this;
        }

        public Criteria andUCountNotIn(List<Integer> values) {
            addCriterion("u_count not in", values, "uCount");
            return (Criteria) this;
        }

        public Criteria andUCountBetween(Integer value1, Integer value2) {
            addCriterion("u_count between", value1, value2, "uCount");
            return (Criteria) this;
        }

        public Criteria andUCountNotBetween(Integer value1, Integer value2) {
            addCriterion("u_count not between", value1, value2, "uCount");
            return (Criteria) this;
        }

        public Criteria andCrCountIsNull() {
            addCriterion("cr_count is null");
            return (Criteria) this;
        }

        public Criteria andCrCountIsNotNull() {
            addCriterion("cr_count is not null");
            return (Criteria) this;
        }

        public Criteria andCrCountEqualTo(Integer value) {
            addCriterion("cr_count =", value, "crCount");
            return (Criteria) this;
        }

        public Criteria andCrCountNotEqualTo(Integer value) {
            addCriterion("cr_count <>", value, "crCount");
            return (Criteria) this;
        }

        public Criteria andCrCountGreaterThan(Integer value) {
            addCriterion("cr_count >", value, "crCount");
            return (Criteria) this;
        }

        public Criteria andCrCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("cr_count >=", value, "crCount");
            return (Criteria) this;
        }

        public Criteria andCrCountLessThan(Integer value) {
            addCriterion("cr_count <", value, "crCount");
            return (Criteria) this;
        }

        public Criteria andCrCountLessThanOrEqualTo(Integer value) {
            addCriterion("cr_count <=", value, "crCount");
            return (Criteria) this;
        }

        public Criteria andCrCountIn(List<Integer> values) {
            addCriterion("cr_count in", values, "crCount");
            return (Criteria) this;
        }

        public Criteria andCrCountNotIn(List<Integer> values) {
            addCriterion("cr_count not in", values, "crCount");
            return (Criteria) this;
        }

        public Criteria andCrCountBetween(Integer value1, Integer value2) {
            addCriterion("cr_count between", value1, value2, "crCount");
            return (Criteria) this;
        }

        public Criteria andCrCountNotBetween(Integer value1, Integer value2) {
            addCriterion("cr_count not between", value1, value2, "crCount");
            return (Criteria) this;
        }

        public Criteria andNCountIsNull() {
            addCriterion("n_count is null");
            return (Criteria) this;
        }

        public Criteria andNCountIsNotNull() {
            addCriterion("n_count is not null");
            return (Criteria) this;
        }

        public Criteria andNCountEqualTo(Integer value) {
            addCriterion("n_count =", value, "nCount");
            return (Criteria) this;
        }

        public Criteria andNCountNotEqualTo(Integer value) {
            addCriterion("n_count <>", value, "nCount");
            return (Criteria) this;
        }

        public Criteria andNCountGreaterThan(Integer value) {
            addCriterion("n_count >", value, "nCount");
            return (Criteria) this;
        }

        public Criteria andNCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("n_count >=", value, "nCount");
            return (Criteria) this;
        }

        public Criteria andNCountLessThan(Integer value) {
            addCriterion("n_count <", value, "nCount");
            return (Criteria) this;
        }

        public Criteria andNCountLessThanOrEqualTo(Integer value) {
            addCriterion("n_count <=", value, "nCount");
            return (Criteria) this;
        }

        public Criteria andNCountIn(List<Integer> values) {
            addCriterion("n_count in", values, "nCount");
            return (Criteria) this;
        }

        public Criteria andNCountNotIn(List<Integer> values) {
            addCriterion("n_count not in", values, "nCount");
            return (Criteria) this;
        }

        public Criteria andNCountBetween(Integer value1, Integer value2) {
            addCriterion("n_count between", value1, value2, "nCount");
            return (Criteria) this;
        }

        public Criteria andNCountNotBetween(Integer value1, Integer value2) {
            addCriterion("n_count not between", value1, value2, "nCount");
            return (Criteria) this;
        }

        public Criteria andPCountIsNull() {
            addCriterion("p_count is null");
            return (Criteria) this;
        }

        public Criteria andPCountIsNotNull() {
            addCriterion("p_count is not null");
            return (Criteria) this;
        }

        public Criteria andPCountEqualTo(Integer value) {
            addCriterion("p_count =", value, "pCount");
            return (Criteria) this;
        }

        public Criteria andPCountNotEqualTo(Integer value) {
            addCriterion("p_count <>", value, "pCount");
            return (Criteria) this;
        }

        public Criteria andPCountGreaterThan(Integer value) {
            addCriterion("p_count >", value, "pCount");
            return (Criteria) this;
        }

        public Criteria andPCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("p_count >=", value, "pCount");
            return (Criteria) this;
        }

        public Criteria andPCountLessThan(Integer value) {
            addCriterion("p_count <", value, "pCount");
            return (Criteria) this;
        }

        public Criteria andPCountLessThanOrEqualTo(Integer value) {
            addCriterion("p_count <=", value, "pCount");
            return (Criteria) this;
        }

        public Criteria andPCountIn(List<Integer> values) {
            addCriterion("p_count in", values, "pCount");
            return (Criteria) this;
        }

        public Criteria andPCountNotIn(List<Integer> values) {
            addCriterion("p_count not in", values, "pCount");
            return (Criteria) this;
        }

        public Criteria andPCountBetween(Integer value1, Integer value2) {
            addCriterion("p_count between", value1, value2, "pCount");
            return (Criteria) this;
        }

        public Criteria andPCountNotBetween(Integer value1, Integer value2) {
            addCriterion("p_count not between", value1, value2, "pCount");
            return (Criteria) this;
        }

        public Criteria andICountIsNull() {
            addCriterion("i_count is null");
            return (Criteria) this;
        }

        public Criteria andICountIsNotNull() {
            addCriterion("i_count is not null");
            return (Criteria) this;
        }

        public Criteria andICountEqualTo(Integer value) {
            addCriterion("i_count =", value, "iCount");
            return (Criteria) this;
        }

        public Criteria andICountNotEqualTo(Integer value) {
            addCriterion("i_count <>", value, "iCount");
            return (Criteria) this;
        }

        public Criteria andICountGreaterThan(Integer value) {
            addCriterion("i_count >", value, "iCount");
            return (Criteria) this;
        }

        public Criteria andICountGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_count >=", value, "iCount");
            return (Criteria) this;
        }

        public Criteria andICountLessThan(Integer value) {
            addCriterion("i_count <", value, "iCount");
            return (Criteria) this;
        }

        public Criteria andICountLessThanOrEqualTo(Integer value) {
            addCriterion("i_count <=", value, "iCount");
            return (Criteria) this;
        }

        public Criteria andICountIn(List<Integer> values) {
            addCriterion("i_count in", values, "iCount");
            return (Criteria) this;
        }

        public Criteria andICountNotIn(List<Integer> values) {
            addCriterion("i_count not in", values, "iCount");
            return (Criteria) this;
        }

        public Criteria andICountBetween(Integer value1, Integer value2) {
            addCriterion("i_count between", value1, value2, "iCount");
            return (Criteria) this;
        }

        public Criteria andICountNotBetween(Integer value1, Integer value2) {
            addCriterion("i_count not between", value1, value2, "iCount");
            return (Criteria) this;
        }

        public Criteria andNwCountIsNull() {
            addCriterion("nw_count is null");
            return (Criteria) this;
        }

        public Criteria andNwCountIsNotNull() {
            addCriterion("nw_count is not null");
            return (Criteria) this;
        }

        public Criteria andNwCountEqualTo(Integer value) {
            addCriterion("nw_count =", value, "nwCount");
            return (Criteria) this;
        }

        public Criteria andNwCountNotEqualTo(Integer value) {
            addCriterion("nw_count <>", value, "nwCount");
            return (Criteria) this;
        }

        public Criteria andNwCountGreaterThan(Integer value) {
            addCriterion("nw_count >", value, "nwCount");
            return (Criteria) this;
        }

        public Criteria andNwCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("nw_count >=", value, "nwCount");
            return (Criteria) this;
        }

        public Criteria andNwCountLessThan(Integer value) {
            addCriterion("nw_count <", value, "nwCount");
            return (Criteria) this;
        }

        public Criteria andNwCountLessThanOrEqualTo(Integer value) {
            addCriterion("nw_count <=", value, "nwCount");
            return (Criteria) this;
        }

        public Criteria andNwCountIn(List<Integer> values) {
            addCriterion("nw_count in", values, "nwCount");
            return (Criteria) this;
        }

        public Criteria andNwCountNotIn(List<Integer> values) {
            addCriterion("nw_count not in", values, "nwCount");
            return (Criteria) this;
        }

        public Criteria andNwCountBetween(Integer value1, Integer value2) {
            addCriterion("nw_count between", value1, value2, "nwCount");
            return (Criteria) this;
        }

        public Criteria andNwCountNotBetween(Integer value1, Integer value2) {
            addCriterion("nw_count not between", value1, value2, "nwCount");
            return (Criteria) this;
        }

        public Criteria andNrCountIsNull() {
            addCriterion("nr_count is null");
            return (Criteria) this;
        }

        public Criteria andNrCountIsNotNull() {
            addCriterion("nr_count is not null");
            return (Criteria) this;
        }

        public Criteria andNrCountEqualTo(Integer value) {
            addCriterion("nr_count =", value, "nrCount");
            return (Criteria) this;
        }

        public Criteria andNrCountNotEqualTo(Integer value) {
            addCriterion("nr_count <>", value, "nrCount");
            return (Criteria) this;
        }

        public Criteria andNrCountGreaterThan(Integer value) {
            addCriterion("nr_count >", value, "nrCount");
            return (Criteria) this;
        }

        public Criteria andNrCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("nr_count >=", value, "nrCount");
            return (Criteria) this;
        }

        public Criteria andNrCountLessThan(Integer value) {
            addCriterion("nr_count <", value, "nrCount");
            return (Criteria) this;
        }

        public Criteria andNrCountLessThanOrEqualTo(Integer value) {
            addCriterion("nr_count <=", value, "nrCount");
            return (Criteria) this;
        }

        public Criteria andNrCountIn(List<Integer> values) {
            addCriterion("nr_count in", values, "nrCount");
            return (Criteria) this;
        }

        public Criteria andNrCountNotIn(List<Integer> values) {
            addCriterion("nr_count not in", values, "nrCount");
            return (Criteria) this;
        }

        public Criteria andNrCountBetween(Integer value1, Integer value2) {
            addCriterion("nr_count between", value1, value2, "nrCount");
            return (Criteria) this;
        }

        public Criteria andNrCountNotBetween(Integer value1, Integer value2) {
            addCriterion("nr_count not between", value1, value2, "nrCount");
            return (Criteria) this;
        }

        public Criteria andOtherCountIsNull() {
            addCriterion("other_count is null");
            return (Criteria) this;
        }

        public Criteria andOtherCountIsNotNull() {
            addCriterion("other_count is not null");
            return (Criteria) this;
        }

        public Criteria andOtherCountEqualTo(Integer value) {
            addCriterion("other_count =", value, "otherCount");
            return (Criteria) this;
        }

        public Criteria andOtherCountNotEqualTo(Integer value) {
            addCriterion("other_count <>", value, "otherCount");
            return (Criteria) this;
        }

        public Criteria andOtherCountGreaterThan(Integer value) {
            addCriterion("other_count >", value, "otherCount");
            return (Criteria) this;
        }

        public Criteria andOtherCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("other_count >=", value, "otherCount");
            return (Criteria) this;
        }

        public Criteria andOtherCountLessThan(Integer value) {
            addCriterion("other_count <", value, "otherCount");
            return (Criteria) this;
        }

        public Criteria andOtherCountLessThanOrEqualTo(Integer value) {
            addCriterion("other_count <=", value, "otherCount");
            return (Criteria) this;
        }

        public Criteria andOtherCountIn(List<Integer> values) {
            addCriterion("other_count in", values, "otherCount");
            return (Criteria) this;
        }

        public Criteria andOtherCountNotIn(List<Integer> values) {
            addCriterion("other_count not in", values, "otherCount");
            return (Criteria) this;
        }

        public Criteria andOtherCountBetween(Integer value1, Integer value2) {
            addCriterion("other_count between", value1, value2, "otherCount");
            return (Criteria) this;
        }

        public Criteria andOtherCountNotBetween(Integer value1, Integer value2) {
            addCriterion("other_count not between", value1, value2, "otherCount");
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