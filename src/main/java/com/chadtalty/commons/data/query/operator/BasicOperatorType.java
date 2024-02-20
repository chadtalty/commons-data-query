package com.chadtalty.commons.data.query.operator;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BasicOperatorType {
    EQUAL("equal"), NOT_EQUAL("not_equal"), GREATER_THAN("greater_than"), LESS_THAN("less_than"),
    GREATER_THAN_OR_EQUAL("greater_than_or_equal"), LESS_THAN_OR_EQUAL("less_than_or_equal");

    private final String value;

    private BasicOperatorType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}