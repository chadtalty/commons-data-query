package com.chadtalty.commons.data.query.operator;

import com.fasterxml.jackson.annotation.JsonValue;

public enum ContainsOperatorType {
    IN("in");

    private final String value;

    private ContainsOperatorType(String value) {
        this.value = value;
    }

    @JsonValue
    public String getValue() {
        return value;
    }
}
