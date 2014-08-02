package com.kfcms.dao;

import java.util.Date;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.kfcms.model.Game;

public interface GameDao {
	public List<Game> queryList(@Param("num") Integer num, @Param("startTime") Date startTime);
}