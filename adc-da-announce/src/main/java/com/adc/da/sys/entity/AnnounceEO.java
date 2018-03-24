package com.adc.da.sys.entity;

import com.adc.da.base.entity.BaseEntity;

import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * <b>功能：</b>TS_ANNOUNCE AnnounceEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-23 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class AnnounceEO extends BaseEntity {

    /**
     * please use UUID#randomUUID to create primary key
     * **/
    private String pkAnnounce;

    @NotNull(message = "通告标题不能为空")
    private String title1;

    @NotNull(message = "通告内容不能为空")
    private String content1;

    @NotNull(message = "通告到期时间不能为空")
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd 24HH:mm")
    private Date expriyTime;

    @NotNull(message = "通告发布状态不能为空")
    private Integer state1;

    @NotNull(message = "通告创建者不能为空")
    private String announCecreator;

    @NotNull(message = "通告创建时间不能为空")
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd 24HH:mm:ss")
    private Date createTime;

    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd 24HH:mm:ss")
    private Date updateTime1;
    private Integer deleteFlag;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkAnnounce -> pk_announce</li>
     * <li>title1 -> title1</li>
     * <li>content1 -> content1</li>
     * <li>expriyTime -> expriy_time</li>
     * <li>state1 -> state1</li>
     * <li>announCecreator -> announ_cecreator</li>
     * <li>createTime -> create_time</li>
     * <li>updateTime1 -> update_time1</li>
     * <li>deleteFlag -> delete_flag</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "pkAnnounce": return "pk_announce";
            case "title1": return "title1";
            case "content1": return "content1";
            case "expriyTime": return "expriy_time";
            case "state1": return "state1";
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
     * <li>title1 -> title1</li>
     * <li>content1 -> content1</li>
     * <li>expriy_time -> expriyTime</li>
     * <li>state1 -> state1</li>
     * <li>announ_cecreator -> announCecreator</li>
     * <li>create_time -> createTime</li>
     * <li>update_time1 -> updateTime1</li>
     * <li>delete_flag -> deleteFlag</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "pk_announce": return "pkAnnounce";
            case "title1": return "title1";
            case "content1": return "content1";
            case "expriy_time": return "expriyTime";
            case "state1": return "state1";
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
    public String getTitle1() {
        return this.title1;
    }

    /**  **/
    public void setTitle1(String title1) {
        this.title1 = title1;
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
    public Date getExpriyTime() {
        return this.expriyTime;
    }

    /**  **/
    public void setExpriyTime(Date expriyTime) {
        this.expriyTime = expriyTime;
    }

    /**  **/
    public Integer getState1() {
        return this.state1;
    }

    /**  **/
    public void setState1(Integer state1) {
        this.state1 = state1;
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

    /**
     * toString method and please alt+insert,find toString() method and add JSON templates.
     * href link https://www.cnblogs.com/zipon/p/6208346.html
     * **/
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{");
        sb.append("\"pkAnnounce\":\"")
                .append(pkAnnounce).append('\"');
        sb.append(",\"title1\":\"")
                .append(title1).append('\"');
        sb.append(",\"content1\":\"")
                .append(content1).append('\"');
        sb.append(",\"expriyTime\":\"")
                .append(expriyTime).append('\"');
        sb.append(",\"state1\":")
                .append(state1);
        sb.append(",\"announCecreator\":\"")
                .append(announCecreator).append('\"');
        sb.append(",\"createTime\":\"")
                .append(createTime).append('\"');
        sb.append(",\"updateTime1\":\"")
                .append(updateTime1).append('\"');
        sb.append(",\"deleteFlag\":")
                .append(deleteFlag);
        sb.append('}');
        return sb.toString();
    }
}
