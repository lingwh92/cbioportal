package org.cbioportal.persistence.mybatis;

import org.cbioportal.model.Patient;
import org.cbioportal.model.meta.BaseMeta;

import java.util.List;

public interface PatientMapper {

    List<Patient> getPatients(List<String> studyIds, List<String> patientIds, String projection, Integer limit, 
                              Integer offset, String sortBy, String direction);

    BaseMeta getMetaPatients(List<String> studyIds, List<String> patientIds);

    Patient getPatient(String studyId, String patientId, String projection);
}
