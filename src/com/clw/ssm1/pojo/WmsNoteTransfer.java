package com.clw.ssm1.pojo;

import java.util.Date;

public class WmsNoteTransfer {
    private Long id;

    private String transferNo;

    private Integer oldShipperId;

    private Integer newShipperId;

    private Integer settlementUnitId;

    private Integer warehouseId;

    private Integer status;

    private Integer settlementStatus;

    private String memo;

    private Integer creator;

    private String creatorName;

    private Date createTime;

    private Integer modifier;

    private String modifierName;

    private Date modifyTime;

    private Boolean deleteFlag;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTransferNo() {
        return transferNo;
    }

    public void setTransferNo(String transferNo) {
        this.transferNo = transferNo == null ? null : transferNo.trim();
    }

    public Integer getOldShipperId() {
        return oldShipperId;
    }

    public void setOldShipperId(Integer oldShipperId) {
        this.oldShipperId = oldShipperId;
    }

    public Integer getNewShipperId() {
        return newShipperId;
    }

    public void setNewShipperId(Integer newShipperId) {
        this.newShipperId = newShipperId;
    }

    public Integer getSettlementUnitId() {
        return settlementUnitId;
    }

    public void setSettlementUnitId(Integer settlementUnitId) {
        this.settlementUnitId = settlementUnitId;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSettlementStatus() {
        return settlementStatus;
    }

    public void setSettlementStatus(Integer settlementStatus) {
        this.settlementStatus = settlementStatus;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Integer getCreator() {
        return creator;
    }

    public void setCreator(Integer creator) {
        this.creator = creator;
    }

    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName == null ? null : creatorName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getModifier() {
        return modifier;
    }

    public void setModifier(Integer modifier) {
        this.modifier = modifier;
    }

    public String getModifierName() {
        return modifierName;
    }

    public void setModifierName(String modifierName) {
        this.modifierName = modifierName == null ? null : modifierName.trim();
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public Boolean getDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(Boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }
}