package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.SlaDTO;
import com.rays.form.SlaForm;
import com.rays.service.SlaServiceInt;

@RestController
@RequestMapping(value = "sla")
public class SlaCtl extends BaseCtl<SlaForm, SlaDTO, SlaServiceInt>{

}
