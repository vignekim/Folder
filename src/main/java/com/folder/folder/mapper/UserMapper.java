package com.folder.folder.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface UserMapper {

	@Select("select no, name, IFNULL(email, '') as email, regDate from user2")
	public List<Map<String, Object>> findAll();
	
}
