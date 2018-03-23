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
    private Integer configurationtype;
    private String title;
    private String imageurl;
    private String content;
    private Long processsequencenumber;
    private Long explicitstate;
    private Long limitquantity;
    private Long effective;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createtime;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updatetime;
    private Integer deleteflag;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkWebsiteconfiguration -> pk_websiteconfiguration</li>
     * <li>configurationtype -> configurationtype</li>
     * <li>title -> title</li>
     * <li>imageurl -> imageurl</li>
     * <li>content -> content</li>
     * <li>processsequencenumber -> processsequencenumber</li>
     * <li>explicitstate -> explicitstate</li>
     * <li>limitquantity -> limitquantity</li>
     * <li>effective -> effective</li>
     * <li>createtime -> createtime</li>
     * <li>updatetime -> updatetime</li>
     * <li>deleteflag -> deleteflag</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "pkWebsiteconfiguration": return "pk_websiteconfiguration";
            case "configurationtype": return "configurationtype";
            case "title": return "title";
            case "imageurl": return "imageurl";
            case "content": return "content";
            case "processsequencenumber": return "processsequencenumber";
            case "explicitstate": return "explicitstate";
            case "limitquantity": return "limitquantity";
            case "effective": return "effective";
            case "createtime": return "createtime";
            case "updatetime": return "updatetime";
            case "deleteflag": return "deleteflag";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pk_websiteconfiguration -> pkWebsiteconfiguration</li>
     * <li>configurationtype -> configurationtype</li>
     * <li>title -> title</li>
     * <li>imageurl -> imageurl</li>
     * <li>content -> content</li>
     * <li>processsequencenumber -> processsequencenumber</li>
     * <li>explicitstate -> explicitstate</li>
     * <li>limitquantity -> limitquantity</li>
     * <li>effective -> effective</li>
     * <li>createtime -> createtime</li>
     * <li>updatetime -> updatetime</li>
     * <li>deleteflag -> deleteflag</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "pk_websiteconfiguration": return "pkWebsiteconfiguration";
            case "configurationtype": return "configurationtype";
            case "title": return "title";
            case "imageurl": return "imageurl";
            case "content": return "content";
            case "processsequencenumber": return "processsequencenumber";
            case "explicitstate": return "explicitstate";
            case "limitquantity": return "limitquantity";
            case "effective": return "effective";
            case "createtime": return "createtime";
            case "updatetime": return "updatetime";
            case "deleteflag": return "deleteflag";
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
    public Integer getConfigurationtype() {
        return this.configurationtype;
    }

    /**  **/
    public void setConfigurationtype(Integer configurationtype) {
        this.configurationtype = configurationtype;
    }

    /**  **/
    public String getTitle() {
        return this.title;
    }

    /**  **/
    public void setTitle(String title) {
        this.title = title;
    }

    /**  **/
    public String getImageurl() {
        return this.imageurl;
    }

    /**  **/
    public void setImageurl(String imageurl) {
        this.imageurl = imageurl;
    }

    /**  **/
    public String getContent() {
        return this.content;
    }

    /**  **/
    public void setContent(String content) {
        this.content = content;
    }

    /**  **/
    public Long getProcesssequencenumber() {
        return this.processsequencenumber;
    }

    /**  **/
    public void setProcesssequencenumber(Long processsequencenumber) {
        this.processsequencenumber = processsequencenumber;
    }

    /**  **/
    public Long getExplicitstate() {
        return this.explicitstate;
    }

    /**  **/
    public void setExplicitstate(Long explicitstate) {
        this.explicitstate = explicitstate;
    }

    /**  **/
    public Long getLimitquantity() {
        return this.limitquantity;
    }

    /**  **/
    public void setLimitquantity(Long limitquantity) {
        this.limitquantity = limitquantity;
    }

    /**  **/
    public Long getEffective() {
        return this.effective;
    }

    /**  **/
    public void setEffective(Long effective) {
        this.effective = effective;
    }

    /**  **/
    public Date getCreatetime() {
        return this.createtime;
    }

    /**  **/
    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    /**  **/
    public Date getUpdatetime() {
        return this.updatetime;
    }

    /**  **/
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    /**  **/
    public Integer getDeleteflag() {
        return this.deleteflag;
    }

    /**  **/
    public void setDeleteflag(Integer deleteflag) {
        this.deleteflag = deleteflag;
    }

}
