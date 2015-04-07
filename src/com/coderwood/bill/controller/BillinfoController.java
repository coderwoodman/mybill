package com.coderwood.bill.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.coderwood.bill.entity.Billinfo;
import com.coderwood.bill.service.BillinfoService;

import java.util.List;

@Controller
@RequestMapping("/billinfo")
public class BillinfoController {
	private BillinfoService billinfoService;

	@RequestMapping("/list")
	public ModelAndView list() {
		billinfoService=new BillinfoService();
		ModelAndView modelAndView = new ModelAndView("/billinfo/list");
		List<Billinfo> billinfos = billinfoService.selectAll();
		modelAndView.addObject("billinfos",billinfos);
		return modelAndView;
	}
}
