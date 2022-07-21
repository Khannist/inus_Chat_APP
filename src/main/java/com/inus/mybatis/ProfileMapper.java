package com.inus.mybatis;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ProfileMapper {
	@Insert("INSERT INTO user_dt VALUES(#{profile.userId},#{profile.userPw})")
	int insert(@Param("profile") Profile profile);
}
