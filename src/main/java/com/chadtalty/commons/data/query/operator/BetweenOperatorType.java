package com.chadtalty.commons.data.query.operator;

import com.fasterxml.jackson.annotation.JsonValue;

public enum BetweenOperatorType {
    BETWEEN("between");

    private final String value;

    private BetweenOperatorType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}