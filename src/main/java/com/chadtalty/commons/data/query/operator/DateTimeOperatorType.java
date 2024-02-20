package com.chadtalty.commons.data.query.operator;

import com.fasterxml.jackson.annotation.JsonValue;

public enum DateTimeOperatorType {
    AFTER("after"), AFTER_OR_EQUAL("after_or_equal"), BEFORE("before"), BEFORE_OR_EQUAL("before_or_equal"),
    EQUAL("equal"), NOT_EQUAL("not_equal");

    private final String value;

    private DateTimeOperatorType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}