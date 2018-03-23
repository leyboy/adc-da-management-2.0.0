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

    private String pkStaff;
    private String titleName;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    private Integer state1;
    private String details1;
    private String pictures1;
    private String view1;
    private Integer delFlag;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkStaff -> pk_staff</li>
     * <li>titleName -> title_name</li>
     * <li>updateTime -> update_time</li>
     * <li>createTime -> create_time</li>
     * <li>state1 -> state1</li>
     * <li>details1 -> details1</li>
     * <li>pictures1 -> pictures1</li>
     * <li>view1 -> view1</li>
     * <li>delFlag -> del_flag</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "pkStaff": return "pk_staff";
            case "titleName": return "title_name";
            case "updateTime": return "update_time";
            case "createTime": return "create_time";
            case "state1": return "state1";
            case "details1": return "details1";
            case "pictures1": return "pictures1";
            case "view1": return "view1";
            case "delFlag": return "del_flag";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pk_staff -> pkStaff</li>
     * <li>title_name -> titleName</li>
     * <li>update_time -> updateTime</li>
     * <li>create_time -> createTime</li>
     * <li>state1 -> state1</li>
     * <li>details1 -> details1</li>
     * <li>pictures1 -> pictures1</li>
     * <li>view1 -> view1</li>
     * <li>del_flag -> delFlag</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "pk_staff": return "pkStaff";
            case "title_name": return "titleName";
            case "update_time": return "updateTime";
            case "create_time": return "createTime";
            case "state1": return "state1";
            case "details1": return "details1";
            case "pictures1": return "pictures1";
            case "view1": return "view1";
            case "del_flag": return "delFlag";
            default: return null;
        }
    }
    
    /**  **/
    public String getPkStaff() {
        return this.pkStaff;
    }

    /**  **/
    public void setPkStaff(String pkStaff) {
        this.pkStaff = pkStaff;
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
    public Integer getState1() {
        return this.state1;
    }

    /**  **/
    public void setState1(Integer state1) {
        this.state1 = state1;
    }

    public void setDetails1(String details1) {
        this.details1 = details1;
    }

    public String getDetails1() {
        return details1;
    }

    public void setPictures1(String pictures1) {
        this.pictures1 = pictures1;
    }

    public String getPictures1() {
        return pictures1;
    }

    public void setView1(String view1) {
        this.view1 = view1;
    }

    public String getView1() {
        return view1;
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
