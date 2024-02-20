package com.chadtalty.commons.data.query.filter;
import com.fasterxml.jackson.annotation.JsonValue;

public enum FilterType {

  BASIC("basic"), BETWEEN("between"), CONTAINS("contains"), DATE_TIME("datetime");

  private final String value;

  private FilterType(String value) {
    this.value = value;
  }

  @JsonValue
  public String getValue() {
    return this.value;
  }

}