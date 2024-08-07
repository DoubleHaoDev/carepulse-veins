package com.carefusion.carefusion_backend.rest;

import com.carefusion.carefusion_backend.model.dto.PatientDto;
import java.util.UUID;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;


@RequestMapping(value = "/v1/patient", produces = "application/json")
public interface PatientApiV1 {

  @GetMapping(value = "/uuid/{uuid}")
  ResponseEntity<PatientDto> getPatients(@PathVariable UUID uuid);
}
