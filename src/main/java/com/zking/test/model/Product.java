package com.zking.test.model;

public class Product {
    private Long proId;

    private String proName;

    private Float proMoney;

    private Integer proPeriods;

    private String proContent;

    private String proPhoto;

    private Integer proLevel;

    public Product(Long proId, String proName, Float proMoney, Integer proPeriods, String proContent, String proPhoto, Integer proLevel) {
        this.proId = proId;
        this.proName = proName;
        this.proMoney = proMoney;
        this.proPeriods = proPeriods;
        this.proContent = proContent;
        this.proPhoto = proPhoto;
        this.proLevel = proLevel;
    }

    public Product() {
        super();
    }

    public Long getProId() {
        return proId;
    }

    public void setProId(Long proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName;
    }

    public Float getProMoney() {
        return proMoney;
    }

    public void setProMoney(Float proMoney) {
        this.proMoney = proMoney;
    }

    public Integer getProPeriods() {
        return proPeriods;
    }

    public void setProPeriods(Integer proPeriods) {
        this.proPeriods = proPeriods;
    }

    public String getProContent() {
        return proContent;
    }

    public void setProContent(String proContent) {
        this.proContent = proContent;
    }

    public String getProPhoto() {
        return proPhoto;
    }

    public void setProPhoto(String proPhoto) {
        this.proPhoto = proPhoto;
    }

    public Integer getProLevel() {
        return proLevel;
    }

    public void setProLevel(Integer proLevel) {
        this.proLevel = proLevel;
    }
}