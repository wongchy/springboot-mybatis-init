package com.aus.system.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 * @author WongChy
 * @since 2020-10-25
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="AuditItem对象", description="")
public class AuditItem implements Serializable {

    private static final long serialVersionUID = 1L;

    private String belongXiaquCode;

    private String operateUsername;

    private LocalDateTime operateDate;

    private Integer rowId;

    private String yearFlag;

    private String rowGuid;

    private String taskName;

    private String catalogCode;

    private String taskType;

    private String byLaw;

    private String taskCode;

    @ApiModelProperty(value = "行使层级")
    private String useLevel;

    private String taskState;

    private Integer taskVersion;

    private String entrustName;

    private Integer anticipateDay;

    private String anticipateType;

    private Integer promiseDay;

    private String promiseType;

    private String acceptCondition;

    private String flowChart;

    private String isFee;

    private String chargeByLaw;

    private String projectType;

    @ApiModelProperty(value = "监督投诉方式")
    private String superviseWay;

    private String transactAddr;

    private String transactTime;

    @ApiModelProperty(value = "咨询方式")
    private String linkWay;

    private String deptType;

    private String deptCode;

    private String handleGuid;

    private String serveType;

    private String handleType;

    private String transactWebUrl;

    private String transactAppUrl;

    private String isNeedEntry;

    private String loginUrl;

    private String deptName;

    private LocalDateTime effectPlan;

    private LocalDateTime cancelPlan;

    private String isLevywaiver;

    private String levyKind;

    private String feebasis;

    private String parentId;

    private String auditState;

    private LocalDateTime versionDate;

    private LocalDateTime createDate;

    private String partitionGuid;

    private LocalDateTime year;

    private String ouGuid;

    private String isHistory;

    private String itemId;

    private String lobbyGuid;

    private String catalogId;

    private String factdegreeExplain;

    @ApiModelProperty(value = "权力来源")
    private String itemSource;

    private Integer limitSceneNum;

    @ApiModelProperty(value = "特别程序")
    private String specialProgram;

    @ApiModelProperty(value = "移动端是否对接单点登录")
    private String isMobileEntry;

    private String flowDesc;

    private String pviGuid;

    @ApiModelProperty(value = "发布时间")
    private String publishstatus;

    @ApiModelProperty(value = "发布时间")
    private LocalDateTime publishdate;

    private Integer reportSign;

    private String promiseDayExplain;

    private String anticipateDayExplain;

    private String ywCode;

    private String isDown;

    private String parTaskCode;

    private String parOuguid;

    private String areaCode;

    private String oldCode;

    private String oldName;

    private String newYwcode;

    private String fyouguid;

    private String fyouname;

    private String fytaskguid;

    private String fytaskname;

    private String byLawSupplement;

    private String isCity;

    private String changchuncode;

    @ApiModelProperty(value = "复用业务编码")
    private String fyywcode;

    private String fyFlag;

    @ApiModelProperty(value = "审核人")
    private String centralOperateUsername;

    @ApiModelProperty(value = "操作时间")
    private LocalDateTime centralOperateDate;

    @ApiModelProperty(value = "操作部门")
    private String centralOuName;

    @ApiModelProperty(value = "操作部门UUID")
    private String centralOuGuid;


}
