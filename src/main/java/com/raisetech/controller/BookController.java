package com.raisetech.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.raisetech.entity.Book;
import com.raisetech.mapper.BookMapper;

@Controller
public class BookController {
	
	@Autowired
	BookMapper bookMapper;
	
	 @GetMapping("/books")
	public String bookList(Model model) {
		List<Book> bookList = bookMapper.findAll();
		model.addAttribute("bookList", bookList);
		return "index";
	}
	
}
