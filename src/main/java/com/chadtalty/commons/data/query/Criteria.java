package com.chadtalty.commons.data.query;

import java.util.List;

import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Criteria {

    @NotNull(message = "page must not be null")
    private Integer page;

    @NotNull(message = "size must not be null")
    private Integer size;

    private List<JoinColumn> joins;

    private List<Filter> filters;

    private Order order;
}
