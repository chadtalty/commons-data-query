package com.chadtalty.commons.data.query.filter;

import com.chadtalty.commons.data.query.operator.BasicOperatorType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonTypeName("basic")
@JsonPropertyOrder({ "field", "operator", "value" })
public class BasicFilter extends Filter {

    @JsonIgnore
    private final FilterType filterType = FilterType.BASIC;

    @NotBlank(message = "basic filter field must not be blank")
    private String field;

    @NotNull(message = "basic filter operator must not be null")
    private BasicOperatorType operator;

    @NotBlank(message = "basic filter value must not be blank")
    private String value;

}