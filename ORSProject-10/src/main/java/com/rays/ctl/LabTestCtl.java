package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.LabTestDTO;
import com.rays.form.LabTestForm;
import com.rays.service.LabTestServiceInt;

@RestController
@RequestMapping(value = "LabTest")
public class LabTestCtl extends BaseCtl<LabTestForm, LabTestDTO, LabTestServiceInt>{

}


