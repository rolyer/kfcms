package com.kfcms.model;
// default package
// Generated Jul 25, 2014 10:39:42 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;

/**
 * Game generated by hbm2java
 */
public class Game implements java.io.Serializable {
	private static final long serialVersionUID = 1L;
	
	private Integer gamgeId;
	private String gameName;
	private Date gameStartTime;
	private String gameServerName;
	private String gameServerUrl;
	private String gameCategory;
	private String gameGiftName;
	private String gamePlatform;
	private Date gmtCreated;
	private Date gmtModified;

	public Game() {
	}

	public Game(String gameName, Date gameStartTime, String gameServerName,
			String gameServerUrl, String gameCategory, String gameGiftName,
			String gamePlatform, Date gmtCreated, Date gmtModified) {
		this.gameName = gameName;
		this.gameStartTime = gameStartTime;
		this.gameServerName = gameServerName;
		this.gameServerUrl = gameServerUrl;
		this.gameCategory = gameCategory;
		this.gameGiftName = gameGiftName;
		this.gamePlatform = gamePlatform;
		this.gmtCreated = gmtCreated;
		this.gmtModified = gmtModified;
	}

	public Integer getGamgeId() {
		return this.gamgeId;
	}

	public void setGamgeId(Integer gamgeId) {
		this.gamgeId = gamgeId;
	}

	public String getGameName() {
		return this.gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public Date getGameStartTime() {
		return this.gameStartTime;
	}

	public void setGameStartTime(Date gameStartTime) {
		this.gameStartTime = gameStartTime;
	}

	public String getGameServerName() {
		return this.gameServerName;
	}

	public void setGameServerName(String gameServerName) {
		this.gameServerName = gameServerName;
	}

	public String getGameServerUrl() {
		return this.gameServerUrl;
	}

	public void setGameServerUrl(String gameServerUrl) {
		this.gameServerUrl = gameServerUrl;
	}

	public String getGameCategory() {
		return this.gameCategory;
	}

	public void setGameCategory(String gameCategory) {
		this.gameCategory = gameCategory;
	}

	public String getGameGiftName() {
		return this.gameGiftName;
	}

	public void setGameGiftName(String gameGiftName) {
		this.gameGiftName = gameGiftName;
	}

	public String getGamePlatform() {
		return this.gamePlatform;
	}

	public void setGamePlatform(String gamePlatform) {
		this.gamePlatform = gamePlatform;
	}

	public Date getGmtCreated() {
		return this.gmtCreated;
	}

	public void setGmtCreated(Date gmtCreated) {
		this.gmtCreated = gmtCreated;
	}

	public Date getGmtModified() {
		return this.gmtModified;
	}

	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}

}