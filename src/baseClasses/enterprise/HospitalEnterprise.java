/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseClasses.enterprise;

import baseClasses.organization.DoctorOrganization;
import baseClasses.organization.LabOrganization;
import baseClasses.organization.PatientOrganization;
import baseClasses.roles.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class HospitalEnterprise extends Enterprise
{
    private DoctorOrganization doctorOrganization;
    private PatientOrganization patientOrganization;
    private LabOrganization labOrganization;

    @Override
    public ArrayList<Role> getSupportedRole()
    {
        return null;
    
    }
    
    public HospitalEnterprise(String name)
    {
        super(name, EnterpriseType.Hospital);
        doctorOrganization = new DoctorOrganization();
        patientOrganization = new PatientOrganization();
        labOrganization = new LabOrganization();
        this.getOrganizationDirectory().getOrganizationList().add(doctorOrganization);
        this.getOrganizationDirectory().getOrganizationList().add(patientOrganization);
        this.getOrganizationDirectory().getOrganizationList().add(labOrganization);
    }

    @Override
    public String toString() {
        return super.getName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
