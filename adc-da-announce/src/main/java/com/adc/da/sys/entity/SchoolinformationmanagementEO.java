package com.adc.da.sys.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>TS_SCHOOLINFORMATIONMANAGEMENT SchoolinformationmanagementEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-23 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class SchoolinformationmanagementEO extends BaseEntity {

    private String pkSchoolinformation;
    private String schoolname;
    private String schooladdress;
    private String pkregion;
    private Integer enabled;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date applicationtime;
    private String pkcity;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkSchoolinformation -> pk_schoolinformation</li>
     * <li>schoolname -> schoolname</li>
     * <li>schooladdress -> schooladdress</li>
     * <li>pkregion -> pkregion</li>
     * <li>enabled -> enabled</li>
     * <li>applicationtime -> applicationtime</li>
     * <li>pkcity -> pkcity</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "pkSchoolinformation": return "pk_schoolinformation";
            case "schoolname": return "schoolname";
            case "schooladdress": return "schooladdress";
            case "pkregion": return "pkregion";
            case "enabled": return "enabled";
            case "applicationtime": return "applicationtime";
            case "pkcity": return "pkcity";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pk_schoolinformation -> pkSchoolinformation</li>
     * <li>schoolname -> schoolname</li>
     * <li>schooladdress -> schooladdress</li>
     * <li>pkregion -> pkregion</li>
     * <li>enabled -> enabled</li>
     * <li>applicationtime -> applicationtime</li>
     * <li>pkcity -> pkcity</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "pk_schoolinformation": return "pkSchoolinformation";
            case "schoolname": return "schoolname";
            case "schooladdress": return "schooladdress";
            case "pkregion": return "pkregion";
            case "enabled": return "enabled";
            case "applicationtime": return "applicationtime";
            case "pkcity": return "pkcity";
            default: return null;
        }
    }
    
    /**  **/
    public String getPkSchoolinformation() {
        return this.pkSchoolinformation;
    }

    /**  **/
    public void setPkSchoolinformation(String pkSchoolinformation) {
        this.pkSchoolinformation = pkSchoolinformation;
    }

    /**  **/
    public String getSchoolname() {
        return this.schoolname;
    }

    /**  **/
    public void setSchoolname(String schoolname) {
        this.schoolname = schoolname;
    }

    /**  **/
    public String getSchooladdress() {
        return this.schooladdress;
    }

    /**  **/
    public void setSchooladdress(String schooladdress) {
        this.schooladdress = schooladdress;
    }

    /**  **/
    public String getPkregion() {
        return this.pkregion;
    }

    /**  **/
    public void setPkregion(String pkregion) {
        this.pkregion = pkregion;
    }

    /**  **/
    public Integer getEnabled() {
        return this.enabled;
    }

    /**  **/
    public void setEnabled(Integer enabled) {
        this.enabled = enabled;
    }

    /**  **/
    public Date getApplicationtime() {
        return this.applicationtime;
    }

    /**  **/
    public void setApplicationtime(Date applicationtime) {
        this.applicationtime = applicationtime;
    }

    /**  **/
    public String getPkcity() {
        return this.pkcity;
    }

    /**  **/
    public void setPkcity(String pkcity) {
        this.pkcity = pkcity;
    }

}
