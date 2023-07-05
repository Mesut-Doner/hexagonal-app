package com.mdoner.projects.data;


import com.mdoner.projects.base.dto.BaseDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookDTO extends BaseDTO {

    private String title;

    private String description;

    private BigDecimal price;
}
