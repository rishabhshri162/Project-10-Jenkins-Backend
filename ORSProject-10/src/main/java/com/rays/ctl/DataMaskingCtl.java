package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.DataMaskingDTO;
import com.rays.form.DataMaskingForm;
import com.rays.service.DataMaskingServiceInt;

@RestController
@RequestMapping(value = "datamasking")
public class DataMaskingCtl extends BaseCtl<DataMaskingForm, DataMaskingDTO, DataMaskingServiceInt> {

}
