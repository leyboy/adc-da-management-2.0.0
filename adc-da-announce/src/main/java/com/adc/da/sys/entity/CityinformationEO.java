package com.adc.da.sys.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

/**
 * <b>功能：</b>TS_CITYINFORMATION CityinformationEOEntity<br>
 * <b>作者：</b>code generator<br>
 * <b>日期：</b> 2018-03-23 <br>
 * <b>版权所有：<b>版权归北京卡达克数据技术中心所有。<br>
 */
public class CityinformationEO extends BaseEntity {

    private String pkCity;
    private String cityname1;
    private Integer enabled1;
    @org.springframework.format.annotation.DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date applicationtime1;
    private String cityintroduction1;
    private String citycoordinates1;
    private Integer delflag1;

    /**
     * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pkCity -> pk_city</li>
     * <li>cityname1 -> cityname1</li>
     * <li>enabled1 -> enabled1</li>
     * <li>applicationtime1 -> applicationtime1</li>
     * <li>cityintroduction1 -> cityintroduction1</li>
     * <li>citycoordinates1 -> citycoordinates1</li>
     * <li>delflag1 -> delflag1</li>
     */
    public static String fieldToColumn(String fieldName) {
        if (fieldName == null) return null;
        switch (fieldName) {
            case "pkCity": return "pk_city";
            case "cityname1": return "cityname1";
            case "enabled1": return "enabled1";
            case "applicationtime1": return "applicationtime1";
            case "cityintroduction1": return "cityintroduction1";
            case "citycoordinates1": return "citycoordinates1";
            case "delflag1": return "delflag1";
            default: return null;
        }
    }

    /**
     * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
     * <p>字段列表：</p>
     * <li>pk_city -> pkCity</li>
     * <li>cityname1 -> cityname1</li>
     * <li>enabled1 -> enabled1</li>
     * <li>applicationtime1 -> applicationtime1</li>
     * <li>cityintroduction1 -> cityintroduction1</li>
     * <li>citycoordinates1 -> citycoordinates1</li>
     * <li>delflag1 -> delflag1</li>
     */
    public static String columnToField(String columnName) {
        if (columnName == null) return null;
        switch (columnName) {
            case "pk_city": return "pkCity";
            case "cityname1": return "cityname1";
            case "enabled1": return "enabled1";
            case "applicationtime1": return "applicationtime1";
            case "cityintroduction1": return "cityintroduction1";
            case "citycoordinates1": return "citycoordinates1";
            case "delflag1": return "delflag1";
            default: return null;
        }
    }
    
    /**  **/
    public String getPkCity() {
        return this.pkCity;
    }

    /**  **/
    public void setPkCity(String pkCity) {
        this.pkCity = pkCity;
    }

    /**  **/
    public String getCityname1() {
        return this.cityname1;
    }

    /**  **/
    public void setCityname1(String cityname1) {
        this.cityname1 = cityname1;
    }

    /**  **/
    public Integer getEnabled1() {
        return this.enabled1;
    }

    /**  **/
    public void setEnabled1(Integer enabled1) {
        this.enabled1 = enabled1;
    }

    /**  **/
    public Date getApplicationtime1() {
        return this.applicationtime1;
    }

    /**  **/
    public void setApplicationtime1(Date applicationtime1) {
        this.applicationtime1 = applicationtime1;
    }

    /**  **/
    public String getCityintroduction1() {
        return this.cityintroduction1;
    }

    /**  **/
    public void setCityintroduction1(String cityintroduction1) {
        this.cityintroduction1 = cityintroduction1;
    }

    /**  **/
    public String getCitycoordinates1() {
        return this.citycoordinates1;
    }

    /**  **/
    public void setCitycoordinates1(String citycoordinates1) {
        this.citycoordinates1 = citycoordinates1;
    }

    /**  **/
    public Integer getDelflag1() {
        return this.delflag1;
    }

    /**  **/
    public void setDelflag1(Integer delflag1) {
        this.delflag1 = delflag1;
    }

}
