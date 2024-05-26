package com.capgemini.wsb.persistence.dao;

import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.enums.Sex;

import java.util.List;

public interface PatientDao extends Dao<PatientEntity, Long> {

    List<PatientEntity> findByLastName(String lastName);

    List<PatientEntity> findPatientsByVisitNumber(long visits);

    List<PatientEntity> findPatientsBySex(Sex s);
}
