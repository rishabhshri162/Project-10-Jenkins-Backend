package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.InvoiceItemDTO;
import com.rays.form.InvoiceItemForm;
import com.rays.service.InvoiceItemServiceInt;

@RestController
@RequestMapping(value = "invoice")
public class InvoiceItemCtl extends BaseCtl<InvoiceItemForm, InvoiceItemDTO, InvoiceItemServiceInt> {

}
