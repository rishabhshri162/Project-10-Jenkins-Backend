package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.PurgeDTO;
import com.rays.form.PurgeForm;
import com.rays.service.PurgeServiceInt;

@RestController
@RequestMapping(value = "purge")
public class PurgeCtl extends BaseCtl<PurgeForm, PurgeDTO, PurgeServiceInt> {

}
