package com.adc.da.sys.entity;

import com.adc.da.base.entity.BaseEntity;

import java.util.Date;

import javax.validation.constraints.NotNull;

/**
 * <b>功能:</b>TS_ANNOUCNE(公告通知表) entity class
 * 
 * @author LiuEnYuan
 * @author SunYiChuan
 * @version 2.0.0
 **/
public class AnnounceEO extends BaseEntity {

	// 通告记录是否删除标志
	private Integer deleteflag;

	// 通告记录更新时间
	@org.springframework.format.annotation.DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Date updatetime;

	@org.springframework.format.annotation.DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	@NotNull(message = "创建时间不能为空")
	private Date createtime;

	@NotNull(message = "通告创建者不能为空")
	private String announcecreator;

	@NotNull(message = "发布状态不能为空")
	private Integer state;

	@NotNull(message = "到期时间不能为空")
	@org.springframework.format.annotation.DateTimeFormat(pattern = "yyyy-MM-dd HH:mm")
	private Date expriytime;

	@NotNull(message = "通告内容不能为空")
	private String content;

	@NotNull(message = "通告标题不能为空")
	private String title;

	@NotNull(message = "通告主键不能为空")
	private String pkannounce;

	public AnnounceEO() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * java字段名转换为原始数据库列名。<b>如果不存在则返回null</b><br>
	 * <p>
	 * 字段列表：
	 * </p>
	 * <li>deleteflag -> deleteflag</li>
	 * <li>updatetime -> updatetime</li>
	 * <li>createtime -> createtime</li>
	 * <li>announcecreator -> announcecreator</li>
	 * <li>state -> state</li>
	 * <li>expriytime -> expriytime</li>
	 * <li>content -> content</li>
	 * <li>title -> title</li>
	 * <li>pkannounce -> pkannounce</li>
	 */
	public static String fieldToColumn(String fieldName) {
		if (fieldName == null)
			return null;
		switch (fieldName) {
		case "deleteflag":
			return "deleteflag";
		case "updatetime":
			return "updatetime";
		case "createtime":
			return "createtime";
		case "announcecreator":
			return "announcecreator";
		case "state":
			return "state";
		case "expriytime":
			return "expriytime";
		case "content":
			return "content";
		case "title":
			return "title";
		case "pkannounce":
			return "pkannounce";
		default:
			return null;
		}
	}

	/**
	 * 原始数据库列名转换为java字段名。<b>如果不存在则返回null</b><br>
	 * <p>
	 * 字段列表：
	 * </p>
	 * <li>deleteflag -> deleteflag</li>
	 * <li>updatetime -> updatetime</li>
	 * <li>createtime -> createtime</li>
	 * <li>announcecreator -> announcecreator</li>
	 * <li>state -> state</li>
	 * <li>expriytime -> expriytime</li>
	 * <li>content -> content</li>
	 * <li>title -> title</li>
	 * <li>pkannounce -> pkannounce</li>
	 */
	public static String columnToField(String columnName) {
		if (columnName == null)
			return null;
		switch (columnName) {
		case "deleteflag":
			return "deleteflag";
		case "updatetime":
			return "updatetime";
		case "createtime":
			return "createtime";
		case "announcecreator":
			return "announcecreator";
		case "state":
			return "state";
		case "expriytime":
			return "expriytime";
		case "content":
			return "content";
		case "title":
			return "title";
		case "pkannounce":
			return "pkannounce";
		default:
			return null;
		}
	}

	/**  **/
	public Integer getDeleteflag() {
		return this.deleteflag;
	}

	/**  **/
	public void setDeleteflag(Integer deleteflag) {
		this.deleteflag = deleteflag;
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
	public Date getCreatetime() {
		return this.createtime;
	}

	/**  **/
	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	/**  **/
	public String getAnnouncecreator() {
		return this.announcecreator;
	}

	/**  **/
	public void setAnnouncecreator(String announcecreator) {
		this.announcecreator = announcecreator;
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
	public Date getExpriytime() {
		return this.expriytime;
	}

	/**  **/
	public void setExpriytime(Date expriytime) {
		this.expriytime = expriytime;
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
	public String getTitle() {
		return this.title;
	}

	/**  **/
	public void setTitle(String title) {
		this.title = title;
	}

	/**  **/
	public String getPkannounce() {
		return this.pkannounce;
	}

	/**  **/
	public void setPkannounce(String pkannounce) {
		this.pkannounce = pkannounce;
	}

	@Override
	public String toString() {
		super.toString();
		return "AnnounceEO [deleteflag=" + deleteflag + ", updatetime=" + updatetime + ", createtime=" + createtime
				+ ", announcecreator=" + announcecreator + ", state=" + state + ", expriytime=" + expriytime
				+ ", content=" + content + ", title=" + title + ", pkannounce=" + pkannounce + "]";
	}

}
