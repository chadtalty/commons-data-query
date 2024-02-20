package com.chadtalty.commons.data.query.filter;


import com.chadtalty.commons.data.query.Filter;
import com.chadtalty.commons.data.query.operator.DateTimeOperatorType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * Properties to reduce results from the FindAll method.
 */
@Data
@EqualsAndHashCode(callSuper=false)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonTypeName("datetime")
@JsonPropertyOrder({ "field", "operator", "value"})
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class DateTimeFilter extends Filter {

    @JsonIgnore
    private final FilterType filterType = FilterType.DATE_TIME;

    @NotBlank(message = "date-time filter field must not be blank")
    private String field;

    @NotNull(message = "date-time filter operator must not be null")
    private DateTimeOperatorType operator;

     @NotBlank(message = "date-time filter value must not be blank")
    private String value;

}
