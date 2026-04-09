package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.SmartHomeDeviceDTO;
import com.rays.form.SmartHomeDeviceForm;
import com.rays.service.SmartHomeDeviceServiceInt;

@RestController
@RequestMapping(value = "smart")
public class SmartHomeDeviceCtl extends BaseCtl<SmartHomeDeviceForm, SmartHomeDeviceDTO, SmartHomeDeviceServiceInt>{

}
