package com.me.coba;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.me.dao.LatDao;
import com.me.model.Lat;


@Controller
public class LatController {
	
	@Autowired
	private LatDao latDao;
	
	@RequestMapping(value = "/lat/index", method = RequestMethod.GET)
	public String index(Model model) {
		List<Lat> lats = latDao.findAll();
		model.addAttribute("lats", lats);
		return "lat/index";
	}
}
