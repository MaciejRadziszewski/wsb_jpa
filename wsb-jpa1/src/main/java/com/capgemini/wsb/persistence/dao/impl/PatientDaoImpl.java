package com.capgemini.wsb.persistence.dao.impl;

import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.entity.PatientEntity;
import com.capgemini.wsb.persistence.enums.Sex;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PatientDaoImpl extends AbstractDao<PatientEntity, Long> implements PatientDao {
    @Override
    public List<PatientEntity> findByLastName(String lastName) {
        return entityManager.createQuery("select patient from PatientEntity patient where patient.lastName like :param1", PatientEntity.class)
                .setParameter("param1", "%" + lastName + "%")
                .getResultList();
    }

    @Override
    public List<PatientEntity> findPatientsByVisitNumber(long visit) {
        return entityManager.createQuery("select patient from PatientEntity patient join patient.visits visit group by visit having count(visit) > :param1", PatientEntity.class)
                .setParameter("param1", visit)
                .getResultList();
    }

    @Override
    public List<PatientEntity> findPatientsBySex(Sex s) {
        return entityManager.createQuery("select patient from PatientEntity patient where patient.sex = :param1", PatientEntity.class)
                .setParameter("param1", s)
                .getResultList();
    }


}
