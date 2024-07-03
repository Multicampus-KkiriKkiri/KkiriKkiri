package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import chat.ChatRoomRepository;
import dto.GroupDTO;
import service.GroupService;


@Controller
@RequestMapping("/groupdetail")
public class GroupChatController {
	
	@Autowired
	GroupService groupService;

	@RequestMapping("/chat")
	ModelAndView groupDetail(int groupId) {
		
		ModelAndView mv = new ModelAndView();
		mv.addObject("groupId", groupId);
		mv.setViewName("groupchat/groupChat");
		
		return mv;
		
	}
	
}
