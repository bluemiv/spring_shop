package com.spring.shop.controller;

import java.util.ArrayList;

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

	@Autowired
	private NoticeService noticeService;
	
	@RequestMapping("noticeListForm")
	public String noticeListForm(Model model) {
		ArrayList<NoticeDto> list = noticeService.getListAll();
		
		model.addAttribute("list", list);
		return "notice/noticeListForm";
	}
	
	@RequestMapping("noticeWriteForm")
	public String noticeWriteForm(Model model) {
		
		return "notice/noticeWriteForm";
	}
	
	@RequestMapping(value="noticeWritePro", method=RequestMethod.POST)
	public String noticeWritePro(NoticeDto noticeDto, Model model) {
		boolean isInsert = noticeService.isInsert(noticeDto);
		model.addAttribute("isInsert", isInsert);
		return "forward:noticeListForm";
	}
	
	@RequestMapping("noticeModifyForm")
	public String noticeModifyForm(Model model) {
		
		return "notice/noticeModifyForm";
	}
	
	@RequestMapping(value="noticeModifyPro", method=RequestMethod.POST)
	public String noticeModifyPro(NoticeDto noticeDto, Model model) {
		boolean isUpdate = noticeService.isUpdate(noticeDto);
		model.addAttribute("isUpdate", isUpdate);
		return "forward:noticeListForm";
	}
	
	@RequestMapping(value="noticeDelete", method=RequestMethod.POST)
	public String noticeDelete(Model model, NoticeDto noticeDto) {
		boolean isDelete = noticeService.isDelete(noticeDto);
		model.addAttribute("isDelete", isDelete);
		return "forward:noticeListForm";
	}
}
