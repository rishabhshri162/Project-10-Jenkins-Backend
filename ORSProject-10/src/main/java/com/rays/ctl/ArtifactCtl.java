package com.rays.ctl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rays.common.BaseCtl;
import com.rays.dto.ArtifactDTO;
import com.rays.form.ArtifactForm;
import com.rays.service.ArtifactServiceInt;

@RestController
@RequestMapping(value = "artifact")
public class ArtifactCtl extends BaseCtl<ArtifactForm, ArtifactDTO, ArtifactServiceInt> {

}
