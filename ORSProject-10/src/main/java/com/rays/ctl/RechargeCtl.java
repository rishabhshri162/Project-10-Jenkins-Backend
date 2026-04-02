package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.RechargeDTO;
import com.rays.form.RechargeForm;
import com.rays.service.RechargeServiceInt;

@RestController
@RequestMapping(value = "Recharge")
public class RechargeCtl extends BaseCtl<RechargeForm, RechargeDTO, RechargeServiceInt>{

}
