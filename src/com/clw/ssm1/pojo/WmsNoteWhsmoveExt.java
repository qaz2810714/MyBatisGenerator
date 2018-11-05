package com.clw.ssm1.pojo;

import java.util.Date;

public class WmsNoteWhsmoveExt {
    private Long id;

    private Long moveMainId;

    private String moveNo;

    private String moveExtNo;

    private String packNo;

    private String brandName;

    private Integer amount;

    private Double weight;

    private String texture;

    private String specification;

    private Integer whsHouseId;

    private Integer originRoomId;

    private Integer originAreaId;

    private Integer originStackId;

    private Integer originLayerId;

    private Integer targetRoomId;

    private Integer targetAreaId;

    private Integer targetStackId;

    private Integer targetLayerId;

    private String remark;

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

    public Long getMoveMainId() {
        return moveMainId;
    }

    public void setMoveMainId(Long moveMainId) {
        this.moveMainId = moveMainId;
    }

    public String getMoveNo() {
        return moveNo;
    }

    public void setMoveNo(String moveNo) {
        this.moveNo = moveNo == null ? null : moveNo.trim();
    }

    public String getMoveExtNo() {
        return moveExtNo;
    }

    public void setMoveExtNo(String moveExtNo) {
        this.moveExtNo = moveExtNo == null ? null : moveExtNo.trim();
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

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
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

    public Integer getWhsHouseId() {
        return whsHouseId;
    }

    public void setWhsHouseId(Integer whsHouseId) {
        this.whsHouseId = whsHouseId;
    }

    public Integer getOriginRoomId() {
        return originRoomId;
    }

    public void setOriginRoomId(Integer originRoomId) {
        this.originRoomId = originRoomId;
    }

    public Integer getOriginAreaId() {
        return originAreaId;
    }

    public void setOriginAreaId(Integer originAreaId) {
        this.originAreaId = originAreaId;
    }

    public Integer getOriginStackId() {
        return originStackId;
    }

    public void setOriginStackId(Integer originStackId) {
        this.originStackId = originStackId;
    }

    public Integer getOriginLayerId() {
        return originLayerId;
    }

    public void setOriginLayerId(Integer originLayerId) {
        this.originLayerId = originLayerId;
    }

    public Integer getTargetRoomId() {
        return targetRoomId;
    }

    public void setTargetRoomId(Integer targetRoomId) {
        this.targetRoomId = targetRoomId;
    }

    public Integer getTargetAreaId() {
        return targetAreaId;
    }

    public void setTargetAreaId(Integer targetAreaId) {
        this.targetAreaId = targetAreaId;
    }

    public Integer getTargetStackId() {
        return targetStackId;
    }

    public void setTargetStackId(Integer targetStackId) {
        this.targetStackId = targetStackId;
    }

    public Integer getTargetLayerId() {
        return targetLayerId;
    }

    public void setTargetLayerId(Integer targetLayerId) {
        this.targetLayerId = targetLayerId;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
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