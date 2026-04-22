package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.DietPlanDTO;
import com.rays.form.DietPlanForm;
import com.rays.service.DietPlanServiceInt;

@RestController
@RequestMapping(value = "dietplan")
public class DietPlanCtl extends BaseCtl<DietPlanForm, DietPlanDTO, DietPlanServiceInt>{

}
