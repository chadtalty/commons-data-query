package com.chadtalty.commons.data.query.filter;
import java.util.List;

import com.chadtalty.commons.data.query.Filter;
import com.chadtalty.commons.data.query.operator.ContainsOperatorType;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.databind.PropertyNamingStrategies;
import com.fasterxml.jackson.databind.annotation.JsonNaming;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
@Builder
@JsonTypeName("contains")
@JsonPropertyOrder({ "field", "operator", "values" })
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class ContainsFilter extends Filter {

    @JsonIgnore
    private final FilterType filterType = FilterType.CONTAINS;

    @NotNull(message = "contains filter operator must not be null")
    private final ContainsOperatorType operator = ContainsOperatorType.IN;

    @NotBlank(message = "contains filter field must not be blank")
    private String field;

    @NotEmpty(message = "contains filter values must not be empty")
    private List<String> values;

}
