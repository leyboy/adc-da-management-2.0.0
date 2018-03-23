package com.adc.da.sys.entity;

import com.adc.da.base.entity.BaseEntity;

import java.sql.Clob;
import java.util.Date;

/**
 * <b>功能：</b>TS_STAFFSTYLE StaffstyleEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-23 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class StaffstyleEO extends BaseEntity {

    private String pkstaff;
    private String titleName;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    private Integer state;
    private Clob details;
    private String pictures;
    private Clob view;
    private Integer delFlag;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkstaff -> pkstaff</li>
     * <li>titleName -> title_name</li>
     * <li>updateTime -> update_time</li>
     * <li>createTime -> create_time</li>
     * <li>state -> state</li>
     * <li>details -> details</li>
     * <li>pictures -> pictures</li>
     * <li>view -> view</li>
     * <li>delFlag -> del_flag</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "pkstaff": return "pkstaff";
            case "titleName": return "title_name";
            case "updateTime": return "update_time";
            case "createTime": return "create_time";
            case "state": return "state";
            case "details": return "details";
            case "pictures": return "pictures";
            case "view": return "view";
            case "delFlag": return "del_flag";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkstaff -> pkstaff</li>
     * <li>title_name -> titleName</li>
     * <li>update_time -> updateTime</li>
     * <li>create_time -> createTime</li>
     * <li>state -> state</li>
     * <li>details -> details</li>
     * <li>pictures -> pictures</li>
     * <li>view -> view</li>
     * <li>del_flag -> delFlag</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "pkstaff": return "pkstaff";
            case "title_name": return "titleName";
            case "update_time": return "updateTime";
            case "create_time": return "createTime";
            case "state": return "state";
            case "details": return "details";
            case "pictures": return "pictures";
            case "view": return "view";
            case "del_flag": return "delFlag";
            default: return null;
        }
    }
    
    /**  **/
    public String getPkstaff() {
        return this.pkstaff;
    }

    /**  **/
    public void setPkstaff(String pkstaff) {
        this.pkstaff = pkstaff;
    }

    /**  **/
    public String getTitleName() {
        return this.titleName;
    }

    /**  **/
    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    /**  **/
    public Date getUpdateTime() {
        return this.updateTime;
    }

    /**  **/
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**  **/
    public Date getCreateTime() {
        return this.createTime;
    }

    /**  **/
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**  **/
    public Integer getState() {
        return this.state;
    }

    /**  **/
    public void setState(Integer state) {
        this.state = state;
    }

    /**  **/
    public Clob getDetails() {
        return this.details;
    }

    /**  **/
    public void setDetails(Clob details) {
        this.details = details;
    }

    /**  **/
    public String getPictures() {
        return this.pictures;
    }

    /**  **/
    public void setPictures(String pictures) {
        this.pictures = pictures;
    }

    /**  **/
    public Clob getView() {
        return this.view;
    }

    /**  **/
    public void setView(Clob view) {
        this.view = view;
    }

    /**  **/
    public Integer getDelFlag() {
        return this.delFlag;
    }

    /**  **/
    public void setDelFlag(Integer delFlag) {
        this.delFlag = delFlag;
    }

}
