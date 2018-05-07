package com.spring.shop.controller;

import java.util.ArrayList;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.shop.dto.NoticeDto;
import com.spring.shop.service.NoticeService;

@Controller
@RequestMapping("notice")
public class NoticeController {

	private static final Logger logger = LoggerFactory.getLogger(NoticeController.class);
	
	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("noticeListForm")
	public String noticeListForm(Locale locale, Model model) {
		logger.info("[System] noticeListForm method ", locale);
		
		ArrayList<NoticeDto> list = noticeService.getListAll();
		
		model.addAttribute("list", list);
		return "notice/noticeListForm";
	}
	
	@RequestMapping("noticeWriteForm")
	public String noticeWriteForm(Locale locale, Model model) {
		logger.info("[System] noticeWriteForm method ", locale);
		
		return "notice/noticeWriteForm";
	}
	
	@RequestMapping(value="noticeWritePro", method=RequestMethod.POST)
	public String noticeWritePro(Locale locale, NoticeDto noticeDto, Model model) {
		logger.info("[System] noticeWritePro method ", locale);
		
		boolean isInsert = noticeService.isInsert(noticeDto);
		model.addAttribute("isInsert", isInsert);
		return "forward:noticeListForm";
	}
	
	@RequestMapping("noticeModifyForm")
	public String noticeModifyForm(Locale locale, Model model) {
		logger.info("[System] noticeModifyForm method ", locale);
		
		return "notice/noticeModifyForm";
	}
	
	@RequestMapping(value="noticeModifyPro", method=RequestMethod.POST)
	public String noticeModifyPro(Locale locale, NoticeDto noticeDto, Model model) {
		logger.info("[System] noticeModifyPro method ", locale);
		
		boolean isUpdate = noticeService.isUpdate(noticeDto);
		model.addAttribute("isUpdate", isUpdate);
		return "forward:noticeListForm";
	}
	
	@RequestMapping(value="noticeDelete", method=RequestMethod.POST)
	public String noticeDelete(Locale locale, Model model, NoticeDto noticeDto) {
		logger.info("[System] noticeDelete method ", locale);
		
		boolean isDelete = noticeService.isDelete(noticeDto);
		model.addAttribute("isDelete", isDelete);
		return "forward:noticeListForm";
	}
}
