package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.PurchaseDTO;
import com.rays.form.PurchaseForm;
import com.rays.service.PurchaseServiceInt;

@RestController
@RequestMapping(value = "purchase")
public class PurchaseCtl extends BaseCtl<PurchaseForm, PurchaseDTO, PurchaseServiceInt> {

}
