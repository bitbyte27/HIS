package com.neu.his.cloud.zuul.dto.dms;

import com.neu.his.cloud.zuul.model.DmsCaseHistory;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@ToString
public class DmsCaseHistoryResult  implements Serializable {
    @ApiModelProperty(value = "历史病历列表")
    List<DmsCaseHistory> dmsCaseHistoryList;
}
