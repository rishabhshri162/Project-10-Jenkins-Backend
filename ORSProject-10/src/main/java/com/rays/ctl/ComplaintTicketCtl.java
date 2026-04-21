package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.ComplaintTicketDTO;
import com.rays.form.ComplaintTicketForm;
import com.rays.service.ComplaintTicketServiceInt;

@RestController
@RequestMapping(value = "complaintticket")
public class ComplaintTicketCtl extends BaseCtl<ComplaintTicketForm, ComplaintTicketDTO, ComplaintTicketServiceInt>{

}
