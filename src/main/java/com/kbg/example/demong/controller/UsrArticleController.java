package com.kbg.example.demong.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.kbg.example.demong.vo.Article;

@Controller
public class UsrArticleController {
	int articlesLastId;
	private List <Article> articles;
	
	public UsrArticleController() {
		articlesLastId = 0;
		articles = new ArrayList<>();
		
	}
	
	@RequestMapping("/usr/Article/doAdd")
	@ResponseBody
	public Article doAdd(String title, String body) {
		int id =articlesLastId + 1;
		Article article = new Article(id, title, body);
		
		articles.add(article);
		articlesLastId =  id;
		
		return article;
	}
	
	@RequestMapping("/usr/Article/getArticles")
	@ResponseBody
	public List<Article> getArticles() {
		return articles;
	}
	
	
}
