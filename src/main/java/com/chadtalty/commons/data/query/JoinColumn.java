package com.chadtalty.commons.data.query;



import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JoinColumn {

    @NotBlank(message = "JoinColumn join must not be blank")
    private String join;

    @NotNull(message = "JoinColumn filter must not be null")
    private Filter filter;
}
