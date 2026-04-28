package com.rays.ctl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.common.DropdownList;
import com.rays.common.ORSResponse;
import com.rays.dto.CustomerDTO;
import com.rays.dto.MeetingDTO;
import com.rays.dto.RoleDTO;
import com.rays.form.CustomerForm;
import com.rays.service.CustomerServiceInt;
import com.rays.service.MeetingServiceInt;
import com.rays.service.RoleServiceInt;

@RestController
@RequestMapping(value = "customer")
public class CustomerCtl extends BaseCtl<CustomerForm, CustomerDTO, CustomerServiceInt> {

	@Autowired
	MeetingServiceInt meetingService;

	@GetMapping("preload")
	public ORSResponse preload() {
		ORSResponse res = new ORSResponse(true);
		MeetingDTO dto = new MeetingDTO();
		List<DropdownList> list = meetingService.search(dto, userContext);
		res.addResult("meetingList", list);
		return res;
	}

}
