package com.adc.da.sys.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>TS_ANNOUNCE AnnounceEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-23 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class AnnounceEO extends BaseEntity {

    private String pkAnnounce;
    private String title;
    private String content;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date expriyTime;
    private Integer state;
    private String announCecreator;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createTime;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updateTime1;
    private Integer deleteFlag;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkAnnounce -> pk_announce</li>
     * <li>title -> title</li>
     * <li>content -> content</li>
     * <li>expriyTime -> expriy_time</li>
     * <li>state -> state</li>
     * <li>announCecreator -> announ_cecreator</li>
     * <li>createTime -> create_time</li>
     * <li>updateTime1 -> update_time1</li>
     * <li>deleteFlag -> delete_flag</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "pkAnnounce": return "pk_announce";
            case "title": return "title";
            case "content": return "content";
            case "expriyTime": return "expriy_time";
            case "state": return "state";
            case "announCecreator": return "announ_cecreator";
            case "createTime": return "create_time";
            case "updateTime1": return "update_time1";
            case "deleteFlag": return "delete_flag";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pk_announce -> pkAnnounce</li>
     * <li>title -> title</li>
     * <li>content -> content</li>
     * <li>expriy_time -> expriyTime</li>
     * <li>state -> state</li>
     * <li>announ_cecreator -> announCecreator</li>
     * <li>create_time -> createTime</li>
     * <li>update_time1 -> updateTime1</li>
     * <li>delete_flag -> deleteFlag</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "pk_announce": return "pkAnnounce";
            case "title": return "title";
            case "content": return "content";
            case "expriy_time": return "expriyTime";
            case "state": return "state";
            case "announ_cecreator": return "announCecreator";
            case "create_time": return "createTime";
            case "update_time1": return "updateTime1";
            case "delete_flag": return "deleteFlag";
            default: return null;
        }
    }
    
    /**  **/
    public String getPkAnnounce() {
        return this.pkAnnounce;
    }

    /**  **/
    public void setPkAnnounce(String pkAnnounce) {
        this.pkAnnounce = pkAnnounce;
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
    public String getContent() {
        return this.content;
    }

    /**  **/
    public void setContent(String content) {
        this.content = content;
    }

    /**  **/
    public Date getExpriyTime() {
        return this.expriyTime;
    }

    /**  **/
    public void setExpriyTime(Date expriyTime) {
        this.expriyTime = expriyTime;
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
    public String getAnnounCecreator() {
        return this.announCecreator;
    }

    /**  **/
    public void setAnnounCecreator(String announCecreator) {
        this.announCecreator = announCecreator;
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
    public Date getUpdateTime1() {
        return this.updateTime1;
    }

    /**  **/
    public void setUpdateTime1(Date updateTime1) {
        this.updateTime1 = updateTime1;
    }

    /**  **/
    public Integer getDeleteFlag() {
        return this.deleteFlag;
    }

    /**  **/
    public void setDeleteFlag(Integer deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

}
