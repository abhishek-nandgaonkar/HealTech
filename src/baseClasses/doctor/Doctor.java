/*
 * Copyright (C) 2014 Abhishek
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */
package baseClasses.doctor;

import baseClasses.enterprise.HospitalEnterprise;
import baseClasses.patient.Patient;
import baseClasses.person.Person;

import java.util.ArrayList;
import workQueue.WorkQueue;

/**
 *
 * @author Abhishek
 */
public class Doctor extends Person
{
    private int UID;
    private ArrayList<Patient> patientList;
    private String highestDegree;
    //private ArrayList<String> honors;
    private ArrayList<HospitalEnterprise> hospitalsWorkingAt;
    private HospitalEnterprise primaryHospital;
    private String specialization;
    private ArrayList<Integer> interactionNumber;
    private WorkQueue workQueue;

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    public ArrayList<Patient> getPatientList() {
        return patientList;
    }

    public void setPatientList(ArrayList<Patient> patientList) {
        this.patientList = patientList;
    }
    
    public Doctor()
    {
        patientList = new ArrayList();
        hospitalsWorkingAt = new ArrayList();
        interactionNumber = new ArrayList();
        workQueue = new WorkQueue();
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public int getUID() {
        return UID;
    }

    public void setUID(int UID) {
        this.UID = UID;
    }
    public String getHighestDegree() {
        return highestDegree;
    }

    public void setHighestDegree(String highestDegree) {
        this.highestDegree = highestDegree;
    }



    public ArrayList<HospitalEnterprise> getHospitalsWorkingAt() {
        return hospitalsWorkingAt;
    }

    public void setHospitalsWorkingAt(ArrayList<HospitalEnterprise> hospitalsWorkingAt) {
        this.hospitalsWorkingAt = hospitalsWorkingAt;
    }

    public HospitalEnterprise getPrimartyHospital() {
        return primaryHospital;
    }

    public void setPrimartyHospital(HospitalEnterprise primartyHospital) {
        this.primaryHospital = primartyHospital;
    }

    public HospitalEnterprise getPrimaryHospital() {
        return primaryHospital;
    }

    public void setPrimaryHospital(HospitalEnterprise primaryHospital) {
        this.primaryHospital = primaryHospital;
    }

    public ArrayList<Integer> getInteractionNumber() {
        return interactionNumber;
    }

    public void setInteractionNumber(ArrayList<Integer> interactionNumber) {
        this.interactionNumber = interactionNumber;
    }

    @Override
    public String toString() {
        return Integer.toString(UID); //To change body of generated methods, choose Tools | Templates.
    }

    

    
}
