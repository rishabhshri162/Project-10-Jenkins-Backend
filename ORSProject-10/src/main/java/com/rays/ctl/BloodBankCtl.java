package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.BloodBankDTO;
import com.rays.form.BloodBankForm;
import com.rays.service.BloodBankServiceInt;

@RestController
@RequestMapping(value = "bloodbank")
public class BloodBankCtl extends BaseCtl<BloodBankForm, BloodBankDTO, BloodBankServiceInt>{

}
