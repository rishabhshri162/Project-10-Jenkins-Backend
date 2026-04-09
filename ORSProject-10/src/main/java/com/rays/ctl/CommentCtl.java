package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.CommentDTO;
import com.rays.dto.RoleDTO;
import com.rays.form.CommentForm;
import com.rays.service.CommentServiceInt;

@RestController
@RequestMapping(value = "Comment")
public class CommentCtl extends BaseCtl<CommentForm, CommentDTO, CommentServiceInt>{
	
	@Autowired
	private CommentServiceInt commentService;
	
//	@GetMapping("preload")
//	public ORSResponse preload() {
//		ORSResponse res = new ORSResponse(true);
//		CommentDTO dto = new CommentDTO();
//		List<DropdownList> list = commentService.search(dto, userContext);
//		res.addResult("status", list);
//		return res;
//	}

}
