package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.TimeZoneDTO;
import com.rays.form.TimeZoneForm;
import com.rays.service.TimeZoneServiceInt;

@RestController
@RequestMapping(value = "timezone")
public class TimeZoneCtl extends BaseCtl<TimeZoneForm, TimeZoneDTO, TimeZoneServiceInt>{

}
