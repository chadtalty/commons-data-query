package com.chadtalty.commons.data.query.filter;

import java.time.Instant;

import com.chadtalty.commons.data.query.Filter;
import com.chadtalty.commons.data.query.operator.BetweenOperatorType;
import com.fasterxml.jackson.annotation.JsonFormat;
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

@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Builder
@JsonTypeName("between")
@JsonPropertyOrder({ "field", "operator", "startDateTime", "endDateTime" })
@JsonNaming(PropertyNamingStrategies.SnakeCaseStrategy.class)
public class BetweenFilter extends Filter {

        @JsonIgnore
        private final FilterType filterType = FilterType.BETWEEN;

        @NotNull(message = "between_filter operator must not be null")
        private final BetweenOperatorType operator = BetweenOperatorType.BETWEEN;

        @NotBlank(message = "between_filter field must not be blank")
        private String field;

        @NotNull(message = "between_filter start_date_time must not be null")
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS", timezone = "UTC")
        private Instant startDateTime;

        @NotNull(message = "between_filter end_date_time must not be null")
        @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSS", timezone = "UTC")
        private Instant endDateTime;
}
