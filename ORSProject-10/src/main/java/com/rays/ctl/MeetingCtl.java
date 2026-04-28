package com.rays.ctl;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.MeetingDTO;
import com.rays.dto.RoleDTO;
import com.rays.form.MeetingForm;
import com.rays.service.MeetingServiceInt;

@RestController
@RequestMapping(value = "meeting")
public class MeetingCtl extends BaseCtl<MeetingForm, MeetingDTO, MeetingServiceInt> {

	@GetMapping("preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		MeetingDTO dto = new MeetingDTO();
		List<DropdownList> list = baseService.search(dto, userContext);
		res.addResult("meetingList", list);
		return res;
	}
	
	
	
	@GetMapping("name/{name}")
	public ORSResponse get(@PathVariable String name) {
		ORSResponse res = new ORSResponse(true);
		MeetingDTO dto = baseService.findByName(name, userContext);
		if (dto != null) {
			res.addData(dto);
		} else {
			res.setSuccess(false);
			res.addMessage("Record not found");
		}
		return res;
	}
}


