package com.chixing.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class NoteExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public NoteExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andNoteIdIsNull() {
            addCriterion("note.note_id is null");
            return (Criteria) this;
        }

        public Criteria andNoteIdIsNotNull() {
            addCriterion("note.note_id is not null");
            return (Criteria) this;
        }

        public Criteria andNoteIdEqualTo(Integer value) {
            addCriterion("note.note_id =", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotEqualTo(Integer value) {
            addCriterion("note.note_id <>", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdGreaterThan(Integer value) {
            addCriterion("note.note_id >", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("note.note_id >=", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdLessThan(Integer value) {
            addCriterion("note.note_id <", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdLessThanOrEqualTo(Integer value) {
            addCriterion("note.note_id <=", value, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdIn(List<Integer> values) {
            addCriterion("note.note_id in", values, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotIn(List<Integer> values) {
            addCriterion("note.note_id not in", values, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdBetween(Integer value1, Integer value2) {
            addCriterion("note.note_id between", value1, value2, "noteId");
            return (Criteria) this;
        }

        public Criteria andNoteIdNotBetween(Integer value1, Integer value2) {
            addCriterion("note.note_id not between", value1, value2, "noteId");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNull() {
            addCriterion("note.cust_id is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("note.cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(Integer value) {
            addCriterion("note.cust_id =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(Integer value) {
            addCriterion("note.cust_id <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(Integer value) {
            addCriterion("note.cust_id >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("note.cust_id >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(Integer value) {
            addCriterion("note.cust_id <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(Integer value) {
            addCriterion("note.cust_id <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<Integer> values) {
            addCriterion("note.cust_id in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<Integer> values) {
            addCriterion("note.cust_id not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(Integer value1, Integer value2) {
            addCriterion("note.cust_id between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(Integer value1, Integer value2) {
            addCriterion("note.cust_id not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andNoteTitleIsNull() {
            addCriterion("note.note_title is null");
            return (Criteria) this;
        }

        public Criteria andNoteTitleIsNotNull() {
            addCriterion("note.note_title is not null");
            return (Criteria) this;
        }

        public Criteria andNoteTitleEqualTo(String value) {
            addCriterion("note.note_title =", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleNotEqualTo(String value) {
            addCriterion("note.note_title <>", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleGreaterThan(String value) {
            addCriterion("note.note_title >", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleGreaterThanOrEqualTo(String value) {
            addCriterion("note.note_title >=", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleLessThan(String value) {
            addCriterion("note.note_title <", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleLessThanOrEqualTo(String value) {
            addCriterion("note.note_title <=", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleLike(String value) {
            addCriterion("note.note_title like", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleNotLike(String value) {
            addCriterion("note.note_title not like", value, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleIn(List<String> values) {
            addCriterion("note.note_title in", values, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleNotIn(List<String> values) {
            addCriterion("note.note_title not in", values, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleBetween(String value1, String value2) {
            addCriterion("note.note_title between", value1, value2, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteTitleNotBetween(String value1, String value2) {
            addCriterion("note.note_title not between", value1, value2, "noteTitle");
            return (Criteria) this;
        }

        public Criteria andNoteHeadImgIsNull() {
            addCriterion("note.note_head_img is null");
            return (Criteria) this;
        }

        public Criteria andNoteHeadImgIsNotNull() {
            addCriterion("note.note_head_img is not null");
            return (Criteria) this;
        }

        public Criteria andNoteHeadImgEqualTo(String value) {
            addCriterion("note.note_head_img =", value, "noteHeadImg");
            return (Criteria) this;
        }

        public Criteria andNoteHeadImgNotEqualTo(String value) {
            addCriterion("note.note_head_img <>", value, "noteHeadImg");
            return (Criteria) this;
        }

        public Criteria andNoteHeadImgGreaterThan(String value) {
            addCriterion("note.note_head_img >", value, "noteHeadImg");
            return (Criteria) this;
        }

        public Criteria andNoteHeadImgGreaterThanOrEqualTo(String value) {
            addCriterion("note.note_head_img >=", value, "noteHeadImg");
            return (Criteria) this;
        }

        public Criteria andNoteHeadImgLessThan(String value) {
            addCriterion("note.note_head_img <", value, "noteHeadImg");
            return (Criteria) this;
        }

        public Criteria andNoteHeadImgLessThanOrEqualTo(String value) {
            addCriterion("note.note_head_img <=", value, "noteHeadImg");
            return (Criteria) this;
        }

        public Criteria andNoteHeadImgLike(String value) {
            addCriterion("note.note_head_img like", value, "noteHeadImg");
            return (Criteria) this;
        }

        public Criteria andNoteHeadImgNotLike(String value) {
            addCriterion("note.note_head_img not like", value, "noteHeadImg");
            return (Criteria) this;
        }

        public Criteria andNoteHeadImgIn(List<String> values) {
            addCriterion("note.note_head_img in", values, "noteHeadImg");
            return (Criteria) this;
        }

        public Criteria andNoteHeadImgNotIn(List<String> values) {
            addCriterion("note.note_head_img not in", values, "noteHeadImg");
            return (Criteria) this;
        }

        public Criteria andNoteHeadImgBetween(String value1, String value2) {
            addCriterion("note.note_head_img between", value1, value2, "noteHeadImg");
            return (Criteria) this;
        }

        public Criteria andNoteHeadImgNotBetween(String value1, String value2) {
            addCriterion("note.note_head_img not between", value1, value2, "noteHeadImg");
            return (Criteria) this;
        }

        public Criteria andNoteCreateTimeIsNull() {
            addCriterion("note.note_create_time is null");
            return (Criteria) this;
        }

        public Criteria andNoteCreateTimeIsNotNull() {
            addCriterion("note.note_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andNoteCreateTimeEqualTo(Date value) {
            addCriterion("note.note_create_time =", value, "noteCreateTime");
            return (Criteria) this;
        }

        public Criteria andNoteCreateTimeNotEqualTo(Date value) {
            addCriterion("note.note_create_time <>", value, "noteCreateTime");
            return (Criteria) this;
        }

        public Criteria andNoteCreateTimeGreaterThan(Date value) {
            addCriterion("note.note_create_time >", value, "noteCreateTime");
            return (Criteria) this;
        }

        public Criteria andNoteCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("note.note_create_time >=", value, "noteCreateTime");
            return (Criteria) this;
        }

        public Criteria andNoteCreateTimeLessThan(Date value) {
            addCriterion("note.note_create_time <", value, "noteCreateTime");
            return (Criteria) this;
        }

        public Criteria andNoteCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("note.note_create_time <=", value, "noteCreateTime");
            return (Criteria) this;
        }

        public Criteria andNoteCreateTimeIn(List<Date> values) {
            addCriterion("note.note_create_time in", values, "noteCreateTime");
            return (Criteria) this;
        }

        public Criteria andNoteCreateTimeNotIn(List<Date> values) {
            addCriterion("note.note_create_time not in", values, "noteCreateTime");
            return (Criteria) this;
        }

        public Criteria andNoteCreateTimeBetween(Date value1, Date value2) {
            addCriterion("note.note_create_time between", value1, value2, "noteCreateTime");
            return (Criteria) this;
        }

        public Criteria andNoteCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("note.note_create_time not between", value1, value2, "noteCreateTime");
            return (Criteria) this;
        }

        public Criteria andNoteUpdateTimeIsNull() {
            addCriterion("note.note_update_time is null");
            return (Criteria) this;
        }

        public Criteria andNoteUpdateTimeIsNotNull() {
            addCriterion("note.note_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andNoteUpdateTimeEqualTo(Date value) {
            addCriterion("note.note_update_time =", value, "noteUpdateTime");
            return (Criteria) this;
        }

        public Criteria andNoteUpdateTimeNotEqualTo(Date value) {
            addCriterion("note.note_update_time <>", value, "noteUpdateTime");
            return (Criteria) this;
        }

        public Criteria andNoteUpdateTimeGreaterThan(Date value) {
            addCriterion("note.note_update_time >", value, "noteUpdateTime");
            return (Criteria) this;
        }

        public Criteria andNoteUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("note.note_update_time >=", value, "noteUpdateTime");
            return (Criteria) this;
        }

        public Criteria andNoteUpdateTimeLessThan(Date value) {
            addCriterion("note.note_update_time <", value, "noteUpdateTime");
            return (Criteria) this;
        }

        public Criteria andNoteUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("note.note_update_time <=", value, "noteUpdateTime");
            return (Criteria) this;
        }

        public Criteria andNoteUpdateTimeIn(List<Date> values) {
            addCriterion("note.note_update_time in", values, "noteUpdateTime");
            return (Criteria) this;
        }

        public Criteria andNoteUpdateTimeNotIn(List<Date> values) {
            addCriterion("note.note_update_time not in", values, "noteUpdateTime");
            return (Criteria) this;
        }

        public Criteria andNoteUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("note.note_update_time between", value1, value2, "noteUpdateTime");
            return (Criteria) this;
        }

        public Criteria andNoteUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("note.note_update_time not between", value1, value2, "noteUpdateTime");
            return (Criteria) this;
        }

        public Criteria andNoteCountryIsNull() {
            addCriterion("note.note_country is null");
            return (Criteria) this;
        }

        public Criteria andNoteCountryIsNotNull() {
            addCriterion("note.note_country is not null");
            return (Criteria) this;
        }

        public Criteria andNoteCountryEqualTo(String value) {
            addCriterion("note.note_country =", value, "noteCountry");
            return (Criteria) this;
        }

        public Criteria andNoteCountryNotEqualTo(String value) {
            addCriterion("note.note_country <>", value, "noteCountry");
            return (Criteria) this;
        }

        public Criteria andNoteCountryGreaterThan(String value) {
            addCriterion("note.note_country >", value, "noteCountry");
            return (Criteria) this;
        }

        public Criteria andNoteCountryGreaterThanOrEqualTo(String value) {
            addCriterion("note.note_country >=", value, "noteCountry");
            return (Criteria) this;
        }

        public Criteria andNoteCountryLessThan(String value) {
            addCriterion("note.note_country <", value, "noteCountry");
            return (Criteria) this;
        }

        public Criteria andNoteCountryLessThanOrEqualTo(String value) {
            addCriterion("note.note_country <=", value, "noteCountry");
            return (Criteria) this;
        }

        public Criteria andNoteCountryLike(String value) {
            addCriterion("note.note_country like", value, "noteCountry");
            return (Criteria) this;
        }

        public Criteria andNoteCountryNotLike(String value) {
            addCriterion("note.note_country not like", value, "noteCountry");
            return (Criteria) this;
        }

        public Criteria andNoteCountryIn(List<String> values) {
            addCriterion("note.note_country in", values, "noteCountry");
            return (Criteria) this;
        }

        public Criteria andNoteCountryNotIn(List<String> values) {
            addCriterion("note.note_country not in", values, "noteCountry");
            return (Criteria) this;
        }

        public Criteria andNoteCountryBetween(String value1, String value2) {
            addCriterion("note.note_country between", value1, value2, "noteCountry");
            return (Criteria) this;
        }

        public Criteria andNoteCountryNotBetween(String value1, String value2) {
            addCriterion("note.note_country not between", value1, value2, "noteCountry");
            return (Criteria) this;
        }

        public Criteria andNoteCityIsNull() {
            addCriterion("note.note_city is null");
            return (Criteria) this;
        }

        public Criteria andNoteCityIsNotNull() {
            addCriterion("note.note_city is not null");
            return (Criteria) this;
        }

        public Criteria andNoteCityEqualTo(String value) {
            addCriterion("note.note_city =", value, "noteCity");
            return (Criteria) this;
        }

        public Criteria andNoteCityNotEqualTo(String value) {
            addCriterion("note.note_city <>", value, "noteCity");
            return (Criteria) this;
        }

        public Criteria andNoteCityGreaterThan(String value) {
            addCriterion("note.note_city >", value, "noteCity");
            return (Criteria) this;
        }

        public Criteria andNoteCityGreaterThanOrEqualTo(String value) {
            addCriterion("note.note_city >=", value, "noteCity");
            return (Criteria) this;
        }

        public Criteria andNoteCityLessThan(String value) {
            addCriterion("note.note_city <", value, "noteCity");
            return (Criteria) this;
        }

        public Criteria andNoteCityLessThanOrEqualTo(String value) {
            addCriterion("note.note_city <=", value, "noteCity");
            return (Criteria) this;
        }

        public Criteria andNoteCityLike(String value) {
            addCriterion("note.note_city like", value, "noteCity");
            return (Criteria) this;
        }

        public Criteria andNoteCityNotLike(String value) {
            addCriterion("note.note_city not like", value, "noteCity");
            return (Criteria) this;
        }

        public Criteria andNoteCityIn(List<String> values) {
            addCriterion("note.note_city in", values, "noteCity");
            return (Criteria) this;
        }

        public Criteria andNoteCityNotIn(List<String> values) {
            addCriterion("note.note_city not in", values, "noteCity");
            return (Criteria) this;
        }

        public Criteria andNoteCityBetween(String value1, String value2) {
            addCriterion("note.note_city between", value1, value2, "noteCity");
            return (Criteria) this;
        }

        public Criteria andNoteCityNotBetween(String value1, String value2) {
            addCriterion("note.note_city not between", value1, value2, "noteCity");
            return (Criteria) this;
        }

        public Criteria andNoteAreaIsNull() {
            addCriterion("note.note_area is null");
            return (Criteria) this;
        }

        public Criteria andNoteAreaIsNotNull() {
            addCriterion("note.note_area is not null");
            return (Criteria) this;
        }

        public Criteria andNoteAreaEqualTo(String value) {
            addCriterion("note.note_area =", value, "noteArea");
            return (Criteria) this;
        }

        public Criteria andNoteAreaNotEqualTo(String value) {
            addCriterion("note.note_area <>", value, "noteArea");
            return (Criteria) this;
        }

        public Criteria andNoteAreaGreaterThan(String value) {
            addCriterion("note.note_area >", value, "noteArea");
            return (Criteria) this;
        }

        public Criteria andNoteAreaGreaterThanOrEqualTo(String value) {
            addCriterion("note.note_area >=", value, "noteArea");
            return (Criteria) this;
        }

        public Criteria andNoteAreaLessThan(String value) {
            addCriterion("note.note_area <", value, "noteArea");
            return (Criteria) this;
        }

        public Criteria andNoteAreaLessThanOrEqualTo(String value) {
            addCriterion("note.note_area <=", value, "noteArea");
            return (Criteria) this;
        }

        public Criteria andNoteAreaLike(String value) {
            addCriterion("note.note_area like", value, "noteArea");
            return (Criteria) this;
        }

        public Criteria andNoteAreaNotLike(String value) {
            addCriterion("note.note_area not like", value, "noteArea");
            return (Criteria) this;
        }

        public Criteria andNoteAreaIn(List<String> values) {
            addCriterion("note.note_area in", values, "noteArea");
            return (Criteria) this;
        }

        public Criteria andNoteAreaNotIn(List<String> values) {
            addCriterion("note.note_area not in", values, "noteArea");
            return (Criteria) this;
        }

        public Criteria andNoteAreaBetween(String value1, String value2) {
            addCriterion("note.note_area between", value1, value2, "noteArea");
            return (Criteria) this;
        }

        public Criteria andNoteAreaNotBetween(String value1, String value2) {
            addCriterion("note.note_area not between", value1, value2, "noteArea");
            return (Criteria) this;
        }

        public Criteria andNoteTypeIsNull() {
            addCriterion("note.note_type is null");
            return (Criteria) this;
        }

        public Criteria andNoteTypeIsNotNull() {
            addCriterion("note.note_type is not null");
            return (Criteria) this;
        }

        public Criteria andNoteTypeEqualTo(Integer value) {
            addCriterion("note.note_type =", value, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeNotEqualTo(Integer value) {
            addCriterion("note.note_type <>", value, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeGreaterThan(Integer value) {
            addCriterion("note.note_type >", value, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("note.note_type >=", value, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeLessThan(Integer value) {
            addCriterion("note.note_type <", value, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeLessThanOrEqualTo(Integer value) {
            addCriterion("note.note_type <=", value, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeIn(List<Integer> values) {
            addCriterion("note.note_type in", values, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeNotIn(List<Integer> values) {
            addCriterion("note.note_type not in", values, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeBetween(Integer value1, Integer value2) {
            addCriterion("note.note_type between", value1, value2, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("note.note_type not between", value1, value2, "noteType");
            return (Criteria) this;
        }

        public Criteria andNoteCharCountIsNull() {
            addCriterion("note.note_char_count is null");
            return (Criteria) this;
        }

        public Criteria andNoteCharCountIsNotNull() {
            addCriterion("note.note_char_count is not null");
            return (Criteria) this;
        }

        public Criteria andNoteCharCountEqualTo(Integer value) {
            addCriterion("note.note_char_count =", value, "noteCharCount");
            return (Criteria) this;
        }

        public Criteria andNoteCharCountNotEqualTo(Integer value) {
            addCriterion("note.note_char_count <>", value, "noteCharCount");
            return (Criteria) this;
        }

        public Criteria andNoteCharCountGreaterThan(Integer value) {
            addCriterion("note.note_char_count >", value, "noteCharCount");
            return (Criteria) this;
        }

        public Criteria andNoteCharCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("note.note_char_count >=", value, "noteCharCount");
            return (Criteria) this;
        }

        public Criteria andNoteCharCountLessThan(Integer value) {
            addCriterion("note.note_char_count <", value, "noteCharCount");
            return (Criteria) this;
        }

        public Criteria andNoteCharCountLessThanOrEqualTo(Integer value) {
            addCriterion("note.note_char_count <=", value, "noteCharCount");
            return (Criteria) this;
        }

        public Criteria andNoteCharCountIn(List<Integer> values) {
            addCriterion("note.note_char_count in", values, "noteCharCount");
            return (Criteria) this;
        }

        public Criteria andNoteCharCountNotIn(List<Integer> values) {
            addCriterion("note.note_char_count not in", values, "noteCharCount");
            return (Criteria) this;
        }

        public Criteria andNoteCharCountBetween(Integer value1, Integer value2) {
            addCriterion("note.note_char_count between", value1, value2, "noteCharCount");
            return (Criteria) this;
        }

        public Criteria andNoteCharCountNotBetween(Integer value1, Integer value2) {
            addCriterion("note.note_char_count not between", value1, value2, "noteCharCount");
            return (Criteria) this;
        }

        public Criteria andNoteImgCountIsNull() {
            addCriterion("note.note_img_count is null");
            return (Criteria) this;
        }

        public Criteria andNoteImgCountIsNotNull() {
            addCriterion("note.note_img_count is not null");
            return (Criteria) this;
        }

        public Criteria andNoteImgCountEqualTo(Integer value) {
            addCriterion("note.note_img_count =", value, "noteImgCount");
            return (Criteria) this;
        }

        public Criteria andNoteImgCountNotEqualTo(Integer value) {
            addCriterion("note.note_img_count <>", value, "noteImgCount");
            return (Criteria) this;
        }

        public Criteria andNoteImgCountGreaterThan(Integer value) {
            addCriterion("note.note_img_count >", value, "noteImgCount");
            return (Criteria) this;
        }

        public Criteria andNoteImgCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("note.note_img_count >=", value, "noteImgCount");
            return (Criteria) this;
        }

        public Criteria andNoteImgCountLessThan(Integer value) {
            addCriterion("note.note_img_count <", value, "noteImgCount");
            return (Criteria) this;
        }

        public Criteria andNoteImgCountLessThanOrEqualTo(Integer value) {
            addCriterion("note.note_img_count <=", value, "noteImgCount");
            return (Criteria) this;
        }

        public Criteria andNoteImgCountIn(List<Integer> values) {
            addCriterion("note.note_img_count in", values, "noteImgCount");
            return (Criteria) this;
        }

        public Criteria andNoteImgCountNotIn(List<Integer> values) {
            addCriterion("note.note_img_count not in", values, "noteImgCount");
            return (Criteria) this;
        }

        public Criteria andNoteImgCountBetween(Integer value1, Integer value2) {
            addCriterion("note.note_img_count between", value1, value2, "noteImgCount");
            return (Criteria) this;
        }

        public Criteria andNoteImgCountNotBetween(Integer value1, Integer value2) {
            addCriterion("note.note_img_count not between", value1, value2, "noteImgCount");
            return (Criteria) this;
        }

        public Criteria andNoteTripDateIsNull() {
            addCriterion("note.note_trip_date is null");
            return (Criteria) this;
        }

        public Criteria andNoteTripDateIsNotNull() {
            addCriterion("note.note_trip_date is not null");
            return (Criteria) this;
        }

        public Criteria andNoteTripDateEqualTo(Date value) {
            addCriterion("note.note_trip_date =", value, "noteTripDate");
            return (Criteria) this;
        }

        public Criteria andNoteTripDateNotEqualTo(Date value) {
            addCriterion("note.note_trip_date <>", value, "noteTripDate");
            return (Criteria) this;
        }

        public Criteria andNoteTripDateGreaterThan(Date value) {
            addCriterion("note.note_trip_date >", value, "noteTripDate");
            return (Criteria) this;
        }

        public Criteria andNoteTripDateGreaterThanOrEqualTo(Date value) {
            addCriterion("note.note_trip_date >=", value, "noteTripDate");
            return (Criteria) this;
        }

        public Criteria andNoteTripDateLessThan(Date value) {
            addCriterion("note.note_trip_date <", value, "noteTripDate");
            return (Criteria) this;
        }

        public Criteria andNoteTripDateLessThanOrEqualTo(Date value) {
            addCriterion("note.note_trip_date <=", value, "noteTripDate");
            return (Criteria) this;
        }

        public Criteria andNoteTripDateIn(List<Date> values) {
            addCriterion("note.note_trip_date in", values, "noteTripDate");
            return (Criteria) this;
        }

        public Criteria andNoteTripDateNotIn(List<Date> values) {
            addCriterion("note.note_trip_date not in", values, "noteTripDate");
            return (Criteria) this;
        }

        public Criteria andNoteTripDateBetween(Date value1, Date value2) {
            addCriterion("note.note_trip_date between", value1, value2, "noteTripDate");
            return (Criteria) this;
        }

        public Criteria andNoteTripDateNotBetween(Date value1, Date value2) {
            addCriterion("note.note_trip_date not between", value1, value2, "noteTripDate");
            return (Criteria) this;
        }

        public Criteria andNotePeopleCountIsNull() {
            addCriterion("note.note_people_count is null");
            return (Criteria) this;
        }

        public Criteria andNotePeopleCountIsNotNull() {
            addCriterion("note.note_people_count is not null");
            return (Criteria) this;
        }

        public Criteria andNotePeopleCountEqualTo(Integer value) {
            addCriterion("note.note_people_count =", value, "notePeopleCount");
            return (Criteria) this;
        }

        public Criteria andNotePeopleCountNotEqualTo(Integer value) {
            addCriterion("note.note_people_count <>", value, "notePeopleCount");
            return (Criteria) this;
        }

        public Criteria andNotePeopleCountGreaterThan(Integer value) {
            addCriterion("note.note_people_count >", value, "notePeopleCount");
            return (Criteria) this;
        }

        public Criteria andNotePeopleCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("note.note_people_count >=", value, "notePeopleCount");
            return (Criteria) this;
        }

        public Criteria andNotePeopleCountLessThan(Integer value) {
            addCriterion("note.note_people_count <", value, "notePeopleCount");
            return (Criteria) this;
        }

        public Criteria andNotePeopleCountLessThanOrEqualTo(Integer value) {
            addCriterion("note.note_people_count <=", value, "notePeopleCount");
            return (Criteria) this;
        }

        public Criteria andNotePeopleCountIn(List<Integer> values) {
            addCriterion("note.note_people_count in", values, "notePeopleCount");
            return (Criteria) this;
        }

        public Criteria andNotePeopleCountNotIn(List<Integer> values) {
            addCriterion("note.note_people_count not in", values, "notePeopleCount");
            return (Criteria) this;
        }

        public Criteria andNotePeopleCountBetween(Integer value1, Integer value2) {
            addCriterion("note.note_people_count between", value1, value2, "notePeopleCount");
            return (Criteria) this;
        }

        public Criteria andNotePeopleCountNotBetween(Integer value1, Integer value2) {
            addCriterion("note.note_people_count not between", value1, value2, "notePeopleCount");
            return (Criteria) this;
        }

        public Criteria andNoteTripFeePerPeopleIsNull() {
            addCriterion("note.note_trip_fee_per_people is null");
            return (Criteria) this;
        }

        public Criteria andNoteTripFeePerPeopleIsNotNull() {
            addCriterion("note.note_trip_fee_per_people is not null");
            return (Criteria) this;
        }

        public Criteria andNoteTripFeePerPeopleEqualTo(Integer value) {
            addCriterion("note.note_trip_fee_per_people =", value, "noteTripFeePerPeople");
            return (Criteria) this;
        }

        public Criteria andNoteTripFeePerPeopleNotEqualTo(Integer value) {
            addCriterion("note.note_trip_fee_per_people <>", value, "noteTripFeePerPeople");
            return (Criteria) this;
        }

        public Criteria andNoteTripFeePerPeopleGreaterThan(Integer value) {
            addCriterion("note.note_trip_fee_per_people >", value, "noteTripFeePerPeople");
            return (Criteria) this;
        }

        public Criteria andNoteTripFeePerPeopleGreaterThanOrEqualTo(Integer value) {
            addCriterion("note.note_trip_fee_per_people >=", value, "noteTripFeePerPeople");
            return (Criteria) this;
        }

        public Criteria andNoteTripFeePerPeopleLessThan(Integer value) {
            addCriterion("note.note_trip_fee_per_people <", value, "noteTripFeePerPeople");
            return (Criteria) this;
        }

        public Criteria andNoteTripFeePerPeopleLessThanOrEqualTo(Integer value) {
            addCriterion("note.note_trip_fee_per_people <=", value, "noteTripFeePerPeople");
            return (Criteria) this;
        }

        public Criteria andNoteTripFeePerPeopleIn(List<Integer> values) {
            addCriterion("note.note_trip_fee_per_people in", values, "noteTripFeePerPeople");
            return (Criteria) this;
        }

        public Criteria andNoteTripFeePerPeopleNotIn(List<Integer> values) {
            addCriterion("note.note_trip_fee_per_people not in", values, "noteTripFeePerPeople");
            return (Criteria) this;
        }

        public Criteria andNoteTripFeePerPeopleBetween(Integer value1, Integer value2) {
            addCriterion("note.note_trip_fee_per_people between", value1, value2, "noteTripFeePerPeople");
            return (Criteria) this;
        }

        public Criteria andNoteTripFeePerPeopleNotBetween(Integer value1, Integer value2) {
            addCriterion("note.note_trip_fee_per_people not between", value1, value2, "noteTripFeePerPeople");
            return (Criteria) this;
        }

        public Criteria andNoteTripDaysIsNull() {
            addCriterion("note.note_trip_days is null");
            return (Criteria) this;
        }

        public Criteria andNoteTripDaysIsNotNull() {
            addCriterion("note.note_trip_days is not null");
            return (Criteria) this;
        }

        public Criteria andNoteTripDaysEqualTo(Integer value) {
            addCriterion("note.note_trip_days =", value, "noteTripDays");
            return (Criteria) this;
        }

        public Criteria andNoteTripDaysNotEqualTo(Integer value) {
            addCriterion("note.note_trip_days <>", value, "noteTripDays");
            return (Criteria) this;
        }

        public Criteria andNoteTripDaysGreaterThan(Integer value) {
            addCriterion("note.note_trip_days >", value, "noteTripDays");
            return (Criteria) this;
        }

        public Criteria andNoteTripDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("note.note_trip_days >=", value, "noteTripDays");
            return (Criteria) this;
        }

        public Criteria andNoteTripDaysLessThan(Integer value) {
            addCriterion("note.note_trip_days <", value, "noteTripDays");
            return (Criteria) this;
        }

        public Criteria andNoteTripDaysLessThanOrEqualTo(Integer value) {
            addCriterion("note.note_trip_days <=", value, "noteTripDays");
            return (Criteria) this;
        }

        public Criteria andNoteTripDaysIn(List<Integer> values) {
            addCriterion("note.note_trip_days in", values, "noteTripDays");
            return (Criteria) this;
        }

        public Criteria andNoteTripDaysNotIn(List<Integer> values) {
            addCriterion("note.note_trip_days not in", values, "noteTripDays");
            return (Criteria) this;
        }

        public Criteria andNoteTripDaysBetween(Integer value1, Integer value2) {
            addCriterion("note.note_trip_days between", value1, value2, "noteTripDays");
            return (Criteria) this;
        }

        public Criteria andNoteTripDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("note.note_trip_days not between", value1, value2, "noteTripDays");
            return (Criteria) this;
        }

        public Criteria andNoteTripPartnerIsNull() {
            addCriterion("note.note_trip_partner is null");
            return (Criteria) this;
        }

        public Criteria andNoteTripPartnerIsNotNull() {
            addCriterion("note.note_trip_partner is not null");
            return (Criteria) this;
        }

        public Criteria andNoteTripPartnerEqualTo(Integer value) {
            addCriterion("note.note_trip_partner =", value, "noteTripPartner");
            return (Criteria) this;
        }

        public Criteria andNoteTripPartnerNotEqualTo(Integer value) {
            addCriterion("note.note_trip_partner <>", value, "noteTripPartner");
            return (Criteria) this;
        }

        public Criteria andNoteTripPartnerGreaterThan(Integer value) {
            addCriterion("note.note_trip_partner >", value, "noteTripPartner");
            return (Criteria) this;
        }

        public Criteria andNoteTripPartnerGreaterThanOrEqualTo(Integer value) {
            addCriterion("note.note_trip_partner >=", value, "noteTripPartner");
            return (Criteria) this;
        }

        public Criteria andNoteTripPartnerLessThan(Integer value) {
            addCriterion("note.note_trip_partner <", value, "noteTripPartner");
            return (Criteria) this;
        }

        public Criteria andNoteTripPartnerLessThanOrEqualTo(Integer value) {
            addCriterion("note.note_trip_partner <=", value, "noteTripPartner");
            return (Criteria) this;
        }

        public Criteria andNoteTripPartnerIn(List<Integer> values) {
            addCriterion("note.note_trip_partner in", values, "noteTripPartner");
            return (Criteria) this;
        }

        public Criteria andNoteTripPartnerNotIn(List<Integer> values) {
            addCriterion("note.note_trip_partner not in", values, "noteTripPartner");
            return (Criteria) this;
        }

        public Criteria andNoteTripPartnerBetween(Integer value1, Integer value2) {
            addCriterion("note.note_trip_partner between", value1, value2, "noteTripPartner");
            return (Criteria) this;
        }

        public Criteria andNoteTripPartnerNotBetween(Integer value1, Integer value2) {
            addCriterion("note.note_trip_partner not between", value1, value2, "noteTripPartner");
            return (Criteria) this;
        }

        public Criteria andNoteReadCountIsNull() {
            addCriterion("note.note_read_count is null");
            return (Criteria) this;
        }

        public Criteria andNoteReadCountIsNotNull() {
            addCriterion("note.note_read_count is not null");
            return (Criteria) this;
        }

        public Criteria andNoteReadCountEqualTo(Integer value) {
            addCriterion("note.note_read_count =", value, "noteReadCount");
            return (Criteria) this;
        }

        public Criteria andNoteReadCountNotEqualTo(Integer value) {
            addCriterion("note.note_read_count <>", value, "noteReadCount");
            return (Criteria) this;
        }

        public Criteria andNoteReadCountGreaterThan(Integer value) {
            addCriterion("note.note_read_count >", value, "noteReadCount");
            return (Criteria) this;
        }

        public Criteria andNoteReadCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("note.note_read_count >=", value, "noteReadCount");
            return (Criteria) this;
        }

        public Criteria andNoteReadCountLessThan(Integer value) {
            addCriterion("note.note_read_count <", value, "noteReadCount");
            return (Criteria) this;
        }

        public Criteria andNoteReadCountLessThanOrEqualTo(Integer value) {
            addCriterion("note.note_read_count <=", value, "noteReadCount");
            return (Criteria) this;
        }

        public Criteria andNoteReadCountIn(List<Integer> values) {
            addCriterion("note.note_read_count in", values, "noteReadCount");
            return (Criteria) this;
        }

        public Criteria andNoteReadCountNotIn(List<Integer> values) {
            addCriterion("note.note_read_count not in", values, "noteReadCount");
            return (Criteria) this;
        }

        public Criteria andNoteReadCountBetween(Integer value1, Integer value2) {
            addCriterion("note.note_read_count between", value1, value2, "noteReadCount");
            return (Criteria) this;
        }

        public Criteria andNoteReadCountNotBetween(Integer value1, Integer value2) {
            addCriterion("note.note_read_count not between", value1, value2, "noteReadCount");
            return (Criteria) this;
        }

        public Criteria andNoteCollectCountIsNull() {
            addCriterion("note.note_collect_count is null");
            return (Criteria) this;
        }

        public Criteria andNoteCollectCountIsNotNull() {
            addCriterion("note.note_collect_count is not null");
            return (Criteria) this;
        }

        public Criteria andNoteCollectCountEqualTo(Integer value) {
            addCriterion("note.note_collect_count =", value, "noteCollectCount");
            return (Criteria) this;
        }

        public Criteria andNoteCollectCountNotEqualTo(Integer value) {
            addCriterion("note.note_collect_count <>", value, "noteCollectCount");
            return (Criteria) this;
        }

        public Criteria andNoteCollectCountGreaterThan(Integer value) {
            addCriterion("note.note_collect_count >", value, "noteCollectCount");
            return (Criteria) this;
        }

        public Criteria andNoteCollectCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("note.note_collect_count >=", value, "noteCollectCount");
            return (Criteria) this;
        }

        public Criteria andNoteCollectCountLessThan(Integer value) {
            addCriterion("note.note_collect_count <", value, "noteCollectCount");
            return (Criteria) this;
        }

        public Criteria andNoteCollectCountLessThanOrEqualTo(Integer value) {
            addCriterion("note.note_collect_count <=", value, "noteCollectCount");
            return (Criteria) this;
        }

        public Criteria andNoteCollectCountIn(List<Integer> values) {
            addCriterion("note.note_collect_count in", values, "noteCollectCount");
            return (Criteria) this;
        }

        public Criteria andNoteCollectCountNotIn(List<Integer> values) {
            addCriterion("note.note_collect_count not in", values, "noteCollectCount");
            return (Criteria) this;
        }

        public Criteria andNoteCollectCountBetween(Integer value1, Integer value2) {
            addCriterion("note.note_collect_count between", value1, value2, "noteCollectCount");
            return (Criteria) this;
        }

        public Criteria andNoteCollectCountNotBetween(Integer value1, Integer value2) {
            addCriterion("note.note_collect_count not between", value1, value2, "noteCollectCount");
            return (Criteria) this;
        }

        public Criteria andNoteLikeCountIsNull() {
            addCriterion("note.note_like_count is null");
            return (Criteria) this;
        }

        public Criteria andNoteLikeCountIsNotNull() {
            addCriterion("note.note_like_count is not null");
            return (Criteria) this;
        }

        public Criteria andNoteLikeCountEqualTo(Integer value) {
            addCriterion("note.note_like_count =", value, "noteLikeCount");
            return (Criteria) this;
        }

        public Criteria andNoteLikeCountNotEqualTo(Integer value) {
            addCriterion("note.note_like_count <>", value, "noteLikeCount");
            return (Criteria) this;
        }

        public Criteria andNoteLikeCountGreaterThan(Integer value) {
            addCriterion("note.note_like_count >", value, "noteLikeCount");
            return (Criteria) this;
        }

        public Criteria andNoteLikeCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("note.note_like_count >=", value, "noteLikeCount");
            return (Criteria) this;
        }

        public Criteria andNoteLikeCountLessThan(Integer value) {
            addCriterion("note.note_like_count <", value, "noteLikeCount");
            return (Criteria) this;
        }

        public Criteria andNoteLikeCountLessThanOrEqualTo(Integer value) {
            addCriterion("note.note_like_count <=", value, "noteLikeCount");
            return (Criteria) this;
        }

        public Criteria andNoteLikeCountIn(List<Integer> values) {
            addCriterion("note.note_like_count in", values, "noteLikeCount");
            return (Criteria) this;
        }

        public Criteria andNoteLikeCountNotIn(List<Integer> values) {
            addCriterion("note.note_like_count not in", values, "noteLikeCount");
            return (Criteria) this;
        }

        public Criteria andNoteLikeCountBetween(Integer value1, Integer value2) {
            addCriterion("note.note_like_count between", value1, value2, "noteLikeCount");
            return (Criteria) this;
        }

        public Criteria andNoteLikeCountNotBetween(Integer value1, Integer value2) {
            addCriterion("note.note_like_count not between", value1, value2, "noteLikeCount");
            return (Criteria) this;
        }

        public Criteria andNoteCommentCountIsNull() {
            addCriterion("note.note_comment_count is null");
            return (Criteria) this;
        }

        public Criteria andNoteCommentCountIsNotNull() {
            addCriterion("note.note_comment_count is not null");
            return (Criteria) this;
        }

        public Criteria andNoteCommentCountEqualTo(Integer value) {
            addCriterion("note.note_comment_count =", value, "noteCommentCount");
            return (Criteria) this;
        }

        public Criteria andNoteCommentCountNotEqualTo(Integer value) {
            addCriterion("note.note_comment_count <>", value, "noteCommentCount");
            return (Criteria) this;
        }

        public Criteria andNoteCommentCountGreaterThan(Integer value) {
            addCriterion("note.note_comment_count >", value, "noteCommentCount");
            return (Criteria) this;
        }

        public Criteria andNoteCommentCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("note.note_comment_count >=", value, "noteCommentCount");
            return (Criteria) this;
        }

        public Criteria andNoteCommentCountLessThan(Integer value) {
            addCriterion("note.note_comment_count <", value, "noteCommentCount");
            return (Criteria) this;
        }

        public Criteria andNoteCommentCountLessThanOrEqualTo(Integer value) {
            addCriterion("note.note_comment_count <=", value, "noteCommentCount");
            return (Criteria) this;
        }

        public Criteria andNoteCommentCountIn(List<Integer> values) {
            addCriterion("note.note_comment_count in", values, "noteCommentCount");
            return (Criteria) this;
        }

        public Criteria andNoteCommentCountNotIn(List<Integer> values) {
            addCriterion("note.note_comment_count not in", values, "noteCommentCount");
            return (Criteria) this;
        }

        public Criteria andNoteCommentCountBetween(Integer value1, Integer value2) {
            addCriterion("note.note_comment_count between", value1, value2, "noteCommentCount");
            return (Criteria) this;
        }

        public Criteria andNoteCommentCountNotBetween(Integer value1, Integer value2) {
            addCriterion("note.note_comment_count not between", value1, value2, "noteCommentCount");
            return (Criteria) this;
        }

        public Criteria andNoteSearchKeywordIsNull() {
            addCriterion("note.note_search_keyword is null");
            return (Criteria) this;
        }

        public Criteria andNoteSearchKeywordIsNotNull() {
            addCriterion("note.note_search_keyword is not null");
            return (Criteria) this;
        }

        public Criteria andNoteSearchKeywordEqualTo(String value) {
            addCriterion("note.note_search_keyword =", value, "noteSearchKeyword");
            return (Criteria) this;
        }

        public Criteria andNoteSearchKeywordNotEqualTo(String value) {
            addCriterion("note.note_search_keyword <>", value, "noteSearchKeyword");
            return (Criteria) this;
        }

        public Criteria andNoteSearchKeywordGreaterThan(String value) {
            addCriterion("note.note_search_keyword >", value, "noteSearchKeyword");
            return (Criteria) this;
        }

        public Criteria andNoteSearchKeywordGreaterThanOrEqualTo(String value) {
            addCriterion("note.note_search_keyword >=", value, "noteSearchKeyword");
            return (Criteria) this;
        }

        public Criteria andNoteSearchKeywordLessThan(String value) {
            addCriterion("note.note_search_keyword <", value, "noteSearchKeyword");
            return (Criteria) this;
        }

        public Criteria andNoteSearchKeywordLessThanOrEqualTo(String value) {
            addCriterion("note.note_search_keyword <=", value, "noteSearchKeyword");
            return (Criteria) this;
        }

        public Criteria andNoteSearchKeywordLike(String value) {
            addCriterion("note.note_search_keyword like", value, "noteSearchKeyword");
            return (Criteria) this;
        }

        public Criteria andNoteSearchKeywordNotLike(String value) {
            addCriterion("note.note_search_keyword not like", value, "noteSearchKeyword");
            return (Criteria) this;
        }

        public Criteria andNoteSearchKeywordIn(List<String> values) {
            addCriterion("note.note_search_keyword in", values, "noteSearchKeyword");
            return (Criteria) this;
        }

        public Criteria andNoteSearchKeywordNotIn(List<String> values) {
            addCriterion("note.note_search_keyword not in", values, "noteSearchKeyword");
            return (Criteria) this;
        }

        public Criteria andNoteSearchKeywordBetween(String value1, String value2) {
            addCriterion("note.note_search_keyword between", value1, value2, "noteSearchKeyword");
            return (Criteria) this;
        }

        public Criteria andNoteSearchKeywordNotBetween(String value1, String value2) {
            addCriterion("note.note_search_keyword not between", value1, value2, "noteSearchKeyword");
            return (Criteria) this;
        }

        public Criteria andNoteStatusIsNull() {
            addCriterion("note.note_status is null");
            return (Criteria) this;
        }

        public Criteria andNoteStatusIsNotNull() {
            addCriterion("note.note_status is not null");
            return (Criteria) this;
        }

        public Criteria andNoteStatusEqualTo(Integer value) {
            addCriterion("note.note_status =", value, "noteStatus");
            return (Criteria) this;
        }

        public Criteria andNoteStatusNotEqualTo(Integer value) {
            addCriterion("note.note_status <>", value, "noteStatus");
            return (Criteria) this;
        }

        public Criteria andNoteStatusGreaterThan(Integer value) {
            addCriterion("note.note_status >", value, "noteStatus");
            return (Criteria) this;
        }

        public Criteria andNoteStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("note.note_status >=", value, "noteStatus");
            return (Criteria) this;
        }

        public Criteria andNoteStatusLessThan(Integer value) {
            addCriterion("note.note_status <", value, "noteStatus");
            return (Criteria) this;
        }

        public Criteria andNoteStatusLessThanOrEqualTo(Integer value) {
            addCriterion("note.note_status <=", value, "noteStatus");
            return (Criteria) this;
        }

        public Criteria andNoteStatusIn(List<Integer> values) {
            addCriterion("note.note_status in", values, "noteStatus");
            return (Criteria) this;
        }

        public Criteria andNoteStatusNotIn(List<Integer> values) {
            addCriterion("note.note_status not in", values, "noteStatus");
            return (Criteria) this;
        }

        public Criteria andNoteStatusBetween(Integer value1, Integer value2) {
            addCriterion("note.note_status between", value1, value2, "noteStatus");
            return (Criteria) this;
        }

        public Criteria andNoteStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("note.note_status not between", value1, value2, "noteStatus");
            return (Criteria) this;
        }

        public Criteria andOthers1IsNull() {
            addCriterion("note.others1 is null");
            return (Criteria) this;
        }

        public Criteria andOthers1IsNotNull() {
            addCriterion("note.others1 is not null");
            return (Criteria) this;
        }

        public Criteria andOthers1EqualTo(String value) {
            addCriterion("note.others1 =", value, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers1NotEqualTo(String value) {
            addCriterion("note.others1 <>", value, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers1GreaterThan(String value) {
            addCriterion("note.others1 >", value, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers1GreaterThanOrEqualTo(String value) {
            addCriterion("note.others1 >=", value, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers1LessThan(String value) {
            addCriterion("note.others1 <", value, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers1LessThanOrEqualTo(String value) {
            addCriterion("note.others1 <=", value, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers1Like(String value) {
            addCriterion("note.others1 like", value, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers1NotLike(String value) {
            addCriterion("note.others1 not like", value, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers1In(List<String> values) {
            addCriterion("note.others1 in", values, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers1NotIn(List<String> values) {
            addCriterion("note.others1 not in", values, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers1Between(String value1, String value2) {
            addCriterion("note.others1 between", value1, value2, "others1");
            return (Criteria) this;
        }

        public Criteria andOthers1NotBetween(String value1, String value2) {
            addCriterion("note.others1 not between", value1, value2, "others1");
            return (Criteria) this;
        }

        public Criteria andOthsrs2IsNull() {
            addCriterion("note.othsrs2 is null");
            return (Criteria) this;
        }

        public Criteria andOthsrs2IsNotNull() {
            addCriterion("note.othsrs2 is not null");
            return (Criteria) this;
        }

        public Criteria andOthsrs2EqualTo(String value) {
            addCriterion("note.othsrs2 =", value, "othsrs2");
            return (Criteria) this;
        }

        public Criteria andOthsrs2NotEqualTo(String value) {
            addCriterion("note.othsrs2 <>", value, "othsrs2");
            return (Criteria) this;
        }

        public Criteria andOthsrs2GreaterThan(String value) {
            addCriterion("note.othsrs2 >", value, "othsrs2");
            return (Criteria) this;
        }

        public Criteria andOthsrs2GreaterThanOrEqualTo(String value) {
            addCriterion("note.othsrs2 >=", value, "othsrs2");
            return (Criteria) this;
        }

        public Criteria andOthsrs2LessThan(String value) {
            addCriterion("note.othsrs2 <", value, "othsrs2");
            return (Criteria) this;
        }

        public Criteria andOthsrs2LessThanOrEqualTo(String value) {
            addCriterion("note.othsrs2 <=", value, "othsrs2");
            return (Criteria) this;
        }

        public Criteria andOthsrs2Like(String value) {
            addCriterion("note.othsrs2 like", value, "othsrs2");
            return (Criteria) this;
        }

        public Criteria andOthsrs2NotLike(String value) {
            addCriterion("note.othsrs2 not like", value, "othsrs2");
            return (Criteria) this;
        }

        public Criteria andOthsrs2In(List<String> values) {
            addCriterion("note.othsrs2 in", values, "othsrs2");
            return (Criteria) this;
        }

        public Criteria andOthsrs2NotIn(List<String> values) {
            addCriterion("note.othsrs2 not in", values, "othsrs2");
            return (Criteria) this;
        }

        public Criteria andOthsrs2Between(String value1, String value2) {
            addCriterion("note.othsrs2 between", value1, value2, "othsrs2");
            return (Criteria) this;
        }

        public Criteria andOthsrs2NotBetween(String value1, String value2) {
            addCriterion("note.othsrs2 not between", value1, value2, "othsrs2");
            return (Criteria) this;
        }
    }

    /**
     */
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