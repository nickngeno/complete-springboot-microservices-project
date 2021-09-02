package com.kimmy.mspackage.VO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Tier {

    private Integer id;
    private String tierCode;
    private String name;
    private Integer cost;
    private String addOns;
}

