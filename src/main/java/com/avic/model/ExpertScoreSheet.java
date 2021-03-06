package com.avic.model;

/**
 * @author sconglee
 * @date 2019/10/17
 */
public class ExpertScoreSheet {
    private Integer id;
    private String projectName;
    private String projectNumber;
    private String companyName;
    private String expertName;
    private String lowItemWeight;
    private String itemWeight;
    private String totalItems;
    private String itemCount;
    private String sequenceNumber;
    private Integer status;
    private String point;
    private String createTime;
    private String updateTime;

    private String evaluIndexDesc;
    private String description ;
    /**
     * @Description 标识某些特殊字段：0是默认值，1是满足要求的特殊值
     **/
    private String dataLimitFlag;

    public String getItemCount() {
        return itemCount;
    }

    public void setItemCount(String itemCount) {
        this.itemCount = itemCount;
    }

    public String getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(String totalItems) {
        this.totalItems = totalItems;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectNumber() {
        return projectNumber;
    }

    public void setProjectNumber(String projectNumber) {
        this.projectNumber = projectNumber;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getExpertName() {
        return expertName;
    }

    public void setExpertName(String expertName) {
        this.expertName = expertName;
    }

    public String getItemWeight() {
        return itemWeight;
    }

    public void setItemWeight(String itemWeight) {
        this.itemWeight = itemWeight;
    }

    public String getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getEvaluIndexDesc() {
        return evaluIndexDesc;
    }

    public void setEvaluIndexDesc(String evaluIndexDesc) {
        this.evaluIndexDesc = evaluIndexDesc;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLowItemWeight() {
        return lowItemWeight;
    }

    public void setLowItemWeight(String lowItemWeight) {
        this.lowItemWeight = lowItemWeight;
    }

    public String getDataLimitFlag() {
        return dataLimitFlag;
    }

    public void setDataLimitFlag(String dataLimitFlag) {
        this.dataLimitFlag = dataLimitFlag;
    }

    @Override
    public String toString() {
        return "ExpertScoreSheet{" +
                "id=" + id +
                ", projectName='" + projectName + '\'' +
                ", projectNumber='" + projectNumber + '\'' +
                ", companyName='" + companyName + '\'' +
                ", expertName='" + expertName + '\'' +
                ", lowItemWeight='" + lowItemWeight + '\'' +
                ", itemWeight='" + itemWeight + '\'' +
                ", totalItems='" + totalItems + '\'' +
                ", itemCount='" + itemCount + '\'' +
                ", sequenceNumber='" + sequenceNumber + '\'' +
                ", status=" + status +
                ", point='" + point + '\'' +
                ", createTime='" + createTime + '\'' +
                ", updateTime='" + updateTime + '\'' +
                ", evaluIndexDesc='" + evaluIndexDesc + '\'' +
                ", description='" + description + '\'' +
                ", dataLimitFlag='" + dataLimitFlag + '\'' +
                '}';
    }
}
