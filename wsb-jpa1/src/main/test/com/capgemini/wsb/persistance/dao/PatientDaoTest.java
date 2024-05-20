package com.capgemini.wsb.persistance.dao;

import com.capgemini.wsb.persistence.dao.PatientDao;
import com.capgemini.wsb.persistence.enums.Sex;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PatientDaoTest {

    @Autowired
    private PatientDao patientDao;

    @Transactional
    @Test
    public void testFindPatientsByLastName() {
        //given
        final String lastName = "Johnson";

        //when
        var patients = patientDao.findByLastName(lastName);

        //then
        for (var patient : patients) {
            assertThat(patient).isNotNull();
            assertThat(patient.getLastName()).isEqualTo(lastName);
        }
    }

    @Transactional
    @Test
    public void testReturnPatientsWhoHaveMoreVisitsThan() {
        //given
        final long visitsCount = 1L;

        //when
        var patients = patientDao.findPatientsHavingMoreThanXVisits(visitsCount);

        //then
        for (var patient : patients) {
            assertThat(patientDao.findOne(patient.getId()).getVisits().stream().count()).isGreaterThan(visitsCount);
        }
    }

    @Transactional
    @Test
    public void testReturnFemalePatients() {
        //given
        final Sex sex = Sex.FEMALE;

        //when
        var patients = patientDao.findPatientsBySex(sex);

        //then
        for (var patient : patients) {
            assertThat(patientDao.findOne(patient.getId()).getSex()).isEqualTo(sex);
        }
    }
}
