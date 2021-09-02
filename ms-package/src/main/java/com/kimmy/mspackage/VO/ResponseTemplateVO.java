package com.kimmy.mspackage.VO;

import com.kimmy.mspackage.entity.InternetPackage;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseTemplateVO {

    private InternetPackage internetPackage;
    private Tier tier;
}
