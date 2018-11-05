package com.clw.ssm1.pojo;

import java.util.Date;

public class WmsNoteTransferExt {
    private Integer id;

    private Integer transferMainId;

    private String transferMainNo;

    private String transferExtNo;

    private String packNo;

    private String brandName;

    private String texture;

    private String specification;

    private Integer originAmount;

    private Integer amount;

    private Double originWeight;

    private Double weight;

    private Integer warehouseId;

    private Integer creator;

    private String creatorName;

    private Date createTime;

    private Integer modifier;

    private String modifierName;

    private Date modifyTime;

    private Boolean deleteFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTransferMainId() {
        return transferMainId;
    }

    public void setTransferMainId(Integer transferMainId) {
        this.transferMainId = transferMainId;
    }

    public String getTransferMainNo() {
        return transferMainNo;
    }

    public void setTransferMainNo(String transferMainNo) {
        this.transferMainNo = transferMainNo == null ? null : transferMainNo.trim();
    }

    public String getTransferExtNo() {
        return transferExtNo;
    }

    public void setTransferExtNo(String transferExtNo) {
        this.transferExtNo = transferExtNo == null ? null : transferExtNo.trim();
    }

    public String getPackNo() {
        return packNo;
    }

    public void setPackNo(String packNo) {
        this.packNo = packNo == null ? null : packNo.trim();
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName == null ? null : brandName.trim();
    }

    public String getTexture() {
        return texture;
    }

    public void setTexture(String texture) {
        this.texture = texture == null ? null : texture.trim();
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public Integer getOriginAmount() {
        return originAmount;
    }

    public void setOriginAmount(Integer originAmount) {
        this.originAmount = originAmount;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getOriginWeight() {
        return originWeight;
    }

    public void setOriginWeight(Double originWeight) {
        this.originWeight = originWeight;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
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