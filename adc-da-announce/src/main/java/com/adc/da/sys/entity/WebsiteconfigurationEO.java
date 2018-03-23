package com.adc.da.sys.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>TS_WEBSITECONFIGURATION WebsiteconfigurationEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-23 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class WebsiteconfigurationEO extends BaseEntity {

    private String pkWebsiteconfiguration;
    private Integer configurationtype1;
    private String title1;
    private String imageurl1;
    private String content1;
    private Long processsequencenumber1;
    private Long explicitstate1;
    private Long limitquantity1;
    private Long effective1;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createTime1;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updatetime1;
    private Integer deleteflag1;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkWebsiteconfiguration -> pk_websiteconfiguration</li>
     * <li>configurationtype1 -> configurationtype1</li>
     * <li>title1 -> title1</li>
     * <li>imageurl1 -> imageurl1</li>
     * <li>content1 -> content1</li>
     * <li>processsequencenumber1 -> processsequencenumber1</li>
     * <li>explicitstate1 -> explicitstate1</li>
     * <li>limitquantity1 -> limitquantity1</li>
     * <li>effective1 -> effective1</li>
     * <li>createTime1 -> create_time1</li>
     * <li>updatetime1 -> updatetime1</li>
     * <li>deleteflag1 -> deleteflag1</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "pkWebsiteconfiguration": return "pk_websiteconfiguration";
            case "configurationtype1": return "configurationtype1";
            case "title1": return "title1";
            case "imageurl1": return "imageurl1";
            case "content1": return "content1";
            case "processsequencenumber1": return "processsequencenumber1";
            case "explicitstate1": return "explicitstate1";
            case "limitquantity1": return "limitquantity1";
            case "effective1": return "effective1";
            case "createTime1": return "create_time1";
            case "updatetime1": return "updatetime1";
            case "deleteflag1": return "deleteflag1";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pk_websiteconfiguration -> pkWebsiteconfiguration</li>
     * <li>configurationtype1 -> configurationtype1</li>
     * <li>title1 -> title1</li>
     * <li>imageurl1 -> imageurl1</li>
     * <li>content1 -> content1</li>
     * <li>processsequencenumber1 -> processsequencenumber1</li>
     * <li>explicitstate1 -> explicitstate1</li>
     * <li>limitquantity1 -> limitquantity1</li>
     * <li>effective1 -> effective1</li>
     * <li>create_time1 -> createTime1</li>
     * <li>updatetime1 -> updatetime1</li>
     * <li>deleteflag1 -> deleteflag1</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "pk_websiteconfiguration": return "pkWebsiteconfiguration";
            case "configurationtype1": return "configurationtype1";
            case "title1": return "title1";
            case "imageurl1": return "imageurl1";
            case "content1": return "content1";
            case "processsequencenumber1": return "processsequencenumber1";
            case "explicitstate1": return "explicitstate1";
            case "limitquantity1": return "limitquantity1";
            case "effective1": return "effective1";
            case "create_time1": return "createTime1";
            case "updatetime1": return "updatetime1";
            case "deleteflag1": return "deleteflag1";
            default: return null;
        }
    }
    
    /**  **/
    public String getPkWebsiteconfiguration() {
        return this.pkWebsiteconfiguration;
    }

    /**  **/
    public void setPkWebsiteconfiguration(String pkWebsiteconfiguration) {
        this.pkWebsiteconfiguration = pkWebsiteconfiguration;
    }

    /**  **/
    public Integer getConfigurationtype1() {
        return this.configurationtype1;
    }

    /**  **/
    public void setConfigurationtype1(Integer configurationtype1) {
        this.configurationtype1 = configurationtype1;
    }

    /**  **/
    public String getTitle1() {
        return this.title1;
    }

    /**  **/
    public void setTitle1(String title1) {
        this.title1 = title1;
    }

    /**  **/
    public String getImageurl1() {
        return this.imageurl1;
    }

    /**  **/
    public void setImageurl1(String imageurl1) {
        this.imageurl1 = imageurl1;
    }

    /**  **/
    public String getContent1() {
        return this.content1;
    }

    /**  **/
    public void setContent1(String content1) {
        this.content1 = content1;
    }

    /**  **/
    public Long getProcesssequencenumber1() {
        return this.processsequencenumber1;
    }

    /**  **/
    public void setProcesssequencenumber1(Long processsequencenumber1) {
        this.processsequencenumber1 = processsequencenumber1;
    }

    /**  **/
    public Long getExplicitstate1() {
        return this.explicitstate1;
    }

    /**  **/
    public void setExplicitstate1(Long explicitstate1) {
        this.explicitstate1 = explicitstate1;
    }

    /**  **/
    public Long getLimitquantity1() {
        return this.limitquantity1;
    }

    /**  **/
    public void setLimitquantity1(Long limitquantity1) {
        this.limitquantity1 = limitquantity1;
    }

    /**  **/
    public Long getEffective1() {
        return this.effective1;
    }

    /**  **/
    public void setEffective1(Long effective1) {
        this.effective1 = effective1;
    }

    /**  **/
    public Date getCreateTime1() {
        return this.createTime1;
    }

    /**  **/
    public void setCreateTime1(Date createTime1) {
        this.createTime1 = createTime1;
    }

    /**  **/
    public Date getUpdatetime1() {
        return this.updatetime1;
    }

    /**  **/
    public void setUpdatetime1(Date updatetime1) {
        this.updatetime1 = updatetime1;
    }

    /**  **/
    public Integer getDeleteflag1() {
        return this.deleteflag1;
    }

    /**  **/
    public void setDeleteflag1(Integer deleteflag1) {
        this.deleteflag1 = deleteflag1;
    }

}
