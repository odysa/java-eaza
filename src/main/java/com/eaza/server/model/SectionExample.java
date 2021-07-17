package com.eaza.server.model;

import java.util.ArrayList;
import java.util.List;

public class SectionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SectionExample() {
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

        public Criteria andUuidIsNull() {
            addCriterion("uuid is null");
            return (Criteria) this;
        }

        public Criteria andUuidIsNotNull() {
            addCriterion("uuid is not null");
            return (Criteria) this;
        }

        public Criteria andUuidEqualTo(String value) {
            addCriterion("uuid =", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotEqualTo(String value) {
            addCriterion("uuid <>", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThan(String value) {
            addCriterion("uuid >", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidGreaterThanOrEqualTo(String value) {
            addCriterion("uuid >=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThan(String value) {
            addCriterion("uuid <", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLessThanOrEqualTo(String value) {
            addCriterion("uuid <=", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidLike(String value) {
            addCriterion("uuid like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotLike(String value) {
            addCriterion("uuid not like", value, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidIn(List<String> values) {
            addCriterion("uuid in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotIn(List<String> values) {
            addCriterion("uuid not in", values, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidBetween(String value1, String value2) {
            addCriterion("uuid between", value1, value2, "uuid");
            return (Criteria) this;
        }

        public Criteria andUuidNotBetween(String value1, String value2) {
            addCriterion("uuid not between", value1, value2, "uuid");
            return (Criteria) this;
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

        public Criteria andSectionTypeIsNull() {
            addCriterion("section_type is null");
            return (Criteria) this;
        }

        public Criteria andSectionTypeIsNotNull() {
            addCriterion("section_type is not null");
            return (Criteria) this;
        }

        public Criteria andSectionTypeEqualTo(String value) {
            addCriterion("section_type =", value, "sectionType");
            return (Criteria) this;
        }

        public Criteria andSectionTypeNotEqualTo(String value) {
            addCriterion("section_type <>", value, "sectionType");
            return (Criteria) this;
        }

        public Criteria andSectionTypeGreaterThan(String value) {
            addCriterion("section_type >", value, "sectionType");
            return (Criteria) this;
        }

        public Criteria andSectionTypeGreaterThanOrEqualTo(String value) {
            addCriterion("section_type >=", value, "sectionType");
            return (Criteria) this;
        }

        public Criteria andSectionTypeLessThan(String value) {
            addCriterion("section_type <", value, "sectionType");
            return (Criteria) this;
        }

        public Criteria andSectionTypeLessThanOrEqualTo(String value) {
            addCriterion("section_type <=", value, "sectionType");
            return (Criteria) this;
        }

        public Criteria andSectionTypeLike(String value) {
            addCriterion("section_type like", value, "sectionType");
            return (Criteria) this;
        }

        public Criteria andSectionTypeNotLike(String value) {
            addCriterion("section_type not like", value, "sectionType");
            return (Criteria) this;
        }

        public Criteria andSectionTypeIn(List<String> values) {
            addCriterion("section_type in", values, "sectionType");
            return (Criteria) this;
        }

        public Criteria andSectionTypeNotIn(List<String> values) {
            addCriterion("section_type not in", values, "sectionType");
            return (Criteria) this;
        }

        public Criteria andSectionTypeBetween(String value1, String value2) {
            addCriterion("section_type between", value1, value2, "sectionType");
            return (Criteria) this;
        }

        public Criteria andSectionTypeNotBetween(String value1, String value2) {
            addCriterion("section_type not between", value1, value2, "sectionType");
            return (Criteria) this;
        }

        public Criteria andNumberIsNull() {
            addCriterion("`number` is null");
            return (Criteria) this;
        }

        public Criteria andNumberIsNotNull() {
            addCriterion("`number` is not null");
            return (Criteria) this;
        }

        public Criteria andNumberEqualTo(Integer value) {
            addCriterion("`number` =", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotEqualTo(Integer value) {
            addCriterion("`number` <>", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThan(Integer value) {
            addCriterion("`number` >", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberGreaterThanOrEqualTo(Integer value) {
            addCriterion("`number` >=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThan(Integer value) {
            addCriterion("`number` <", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberLessThanOrEqualTo(Integer value) {
            addCriterion("`number` <=", value, "number");
            return (Criteria) this;
        }

        public Criteria andNumberIn(List<Integer> values) {
            addCriterion("`number` in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotIn(List<Integer> values) {
            addCriterion("`number` not in", values, "number");
            return (Criteria) this;
        }

        public Criteria andNumberBetween(Integer value1, Integer value2) {
            addCriterion("`number` between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andNumberNotBetween(Integer value1, Integer value2) {
            addCriterion("`number` not between", value1, value2, "number");
            return (Criteria) this;
        }

        public Criteria andRoomUuidIsNull() {
            addCriterion("room_uuid is null");
            return (Criteria) this;
        }

        public Criteria andRoomUuidIsNotNull() {
            addCriterion("room_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andRoomUuidEqualTo(String value) {
            addCriterion("room_uuid =", value, "roomUuid");
            return (Criteria) this;
        }

        public Criteria andRoomUuidNotEqualTo(String value) {
            addCriterion("room_uuid <>", value, "roomUuid");
            return (Criteria) this;
        }

        public Criteria andRoomUuidGreaterThan(String value) {
            addCriterion("room_uuid >", value, "roomUuid");
            return (Criteria) this;
        }

        public Criteria andRoomUuidGreaterThanOrEqualTo(String value) {
            addCriterion("room_uuid >=", value, "roomUuid");
            return (Criteria) this;
        }

        public Criteria andRoomUuidLessThan(String value) {
            addCriterion("room_uuid <", value, "roomUuid");
            return (Criteria) this;
        }

        public Criteria andRoomUuidLessThanOrEqualTo(String value) {
            addCriterion("room_uuid <=", value, "roomUuid");
            return (Criteria) this;
        }

        public Criteria andRoomUuidLike(String value) {
            addCriterion("room_uuid like", value, "roomUuid");
            return (Criteria) this;
        }

        public Criteria andRoomUuidNotLike(String value) {
            addCriterion("room_uuid not like", value, "roomUuid");
            return (Criteria) this;
        }

        public Criteria andRoomUuidIn(List<String> values) {
            addCriterion("room_uuid in", values, "roomUuid");
            return (Criteria) this;
        }

        public Criteria andRoomUuidNotIn(List<String> values) {
            addCriterion("room_uuid not in", values, "roomUuid");
            return (Criteria) this;
        }

        public Criteria andRoomUuidBetween(String value1, String value2) {
            addCriterion("room_uuid between", value1, value2, "roomUuid");
            return (Criteria) this;
        }

        public Criteria andRoomUuidNotBetween(String value1, String value2) {
            addCriterion("room_uuid not between", value1, value2, "roomUuid");
            return (Criteria) this;
        }

        public Criteria andScheduleUuidIsNull() {
            addCriterion("schedule_uuid is null");
            return (Criteria) this;
        }

        public Criteria andScheduleUuidIsNotNull() {
            addCriterion("schedule_uuid is not null");
            return (Criteria) this;
        }

        public Criteria andScheduleUuidEqualTo(String value) {
            addCriterion("schedule_uuid =", value, "scheduleUuid");
            return (Criteria) this;
        }

        public Criteria andScheduleUuidNotEqualTo(String value) {
            addCriterion("schedule_uuid <>", value, "scheduleUuid");
            return (Criteria) this;
        }

        public Criteria andScheduleUuidGreaterThan(String value) {
            addCriterion("schedule_uuid >", value, "scheduleUuid");
            return (Criteria) this;
        }

        public Criteria andScheduleUuidGreaterThanOrEqualTo(String value) {
            addCriterion("schedule_uuid >=", value, "scheduleUuid");
            return (Criteria) this;
        }

        public Criteria andScheduleUuidLessThan(String value) {
            addCriterion("schedule_uuid <", value, "scheduleUuid");
            return (Criteria) this;
        }

        public Criteria andScheduleUuidLessThanOrEqualTo(String value) {
            addCriterion("schedule_uuid <=", value, "scheduleUuid");
            return (Criteria) this;
        }

        public Criteria andScheduleUuidLike(String value) {
            addCriterion("schedule_uuid like", value, "scheduleUuid");
            return (Criteria) this;
        }

        public Criteria andScheduleUuidNotLike(String value) {
            addCriterion("schedule_uuid not like", value, "scheduleUuid");
            return (Criteria) this;
        }

        public Criteria andScheduleUuidIn(List<String> values) {
            addCriterion("schedule_uuid in", values, "scheduleUuid");
            return (Criteria) this;
        }

        public Criteria andScheduleUuidNotIn(List<String> values) {
            addCriterion("schedule_uuid not in", values, "scheduleUuid");
            return (Criteria) this;
        }

        public Criteria andScheduleUuidBetween(String value1, String value2) {
            addCriterion("schedule_uuid between", value1, value2, "scheduleUuid");
            return (Criteria) this;
        }

        public Criteria andScheduleUuidNotBetween(String value1, String value2) {
            addCriterion("schedule_uuid not between", value1, value2, "scheduleUuid");
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