package com.raisetech.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.raisetech.entity.Book;

@Mapper
public interface BookMapper {

	public List<Book> findAll();
	
	public List<Book>findName(String name);
}
