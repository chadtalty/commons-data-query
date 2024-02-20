package com.chadtalty.commons.data.query;

import com.chadtalty.commons.data.query.filter.BasicFilter;
import com.chadtalty.commons.data.query.filter.BetweenFilter;
import com.chadtalty.commons.data.query.filter.ContainsFilter;
import com.chadtalty.commons.data.query.filter.DateTimeFilter;
import com.chadtalty.commons.data.query.filter.FilterType;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo.As;

import lombok.Data;
import lombok.NoArgsConstructor;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = As.PROPERTY, property = "type")
@JsonSubTypes({
    @JsonSubTypes.Type(value = BasicFilter.class, name = "basic"),
    @JsonSubTypes.Type(value = BetweenFilter.class, name = "between"),
    @JsonSubTypes.Type(value = ContainsFilter.class, name = "contains"),
    @JsonSubTypes.Type(value = DateTimeFilter.class, name = "datetime")
})
@Data
@NoArgsConstructor
public abstract class Filter {
  public abstract FilterType getFilterType();
  public abstract String getField();
}
