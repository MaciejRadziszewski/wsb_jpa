package com.capgemini.wsb.mapper;

import com.capgemini.wsb.dto.PatientNoVisitsTO;
import com.capgemini.wsb.persistence.entity.PatientEntity;

public class PatientNoVisitsMapper {
    public static PatientNoVisitsTO mapToTO(final PatientEntity patientEntity) {
        if (patientEntity == null) {
            return null;
        }
        final PatientNoVisitsTO patientTO = new PatientNoVisitsTO();
        patientTO.setId(patientEntity.getId());
        patientTO.setPatientNumber(patientEntity.getPatientNumber());
        patientTO.setAddress(AddressMapper.mapToTO(patientEntity.getAddress()));
        return patientTO;
    }
}
