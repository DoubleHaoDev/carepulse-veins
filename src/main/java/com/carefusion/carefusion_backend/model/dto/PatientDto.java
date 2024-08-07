package com.carefusion.carefusion_backend.model.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.annotation.Nullable;
import java.time.ZonedDateTime;
import java.util.UUID;
import org.inferred.freebuilder.FreeBuilder;


@FreeBuilder
@JsonDeserialize(builder = PatientDto.Builder.class)
public interface PatientDto {

  static Builder builder() {
    return new Builder();
  }

  @Nullable
  Long getId();

  @Nullable
  UUID getUuid();

  @Nullable
  Long getPersonId();

  @Nullable
  ZonedDateTime getUpdatedAt();

  @Nullable
  ZonedDateTime getCreatedAt();

  @Nullable
  ZonedDateTime getDeletedAt();

  class Builder extends PatientDto_Builder {

  }

}
