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
package baseClasses.patient;

import baseClasses.doctor.Doctor;
import baseClasses.enterprise.CountryEnterprise;
import baseClasses.enterprise.HospitalEnterprise;
import baseClasses.vitalSigns.*;
import baseClasses.person.Person;

import java.util.ArrayList;
import java.util.Date;
import workQueue.WorkQueue;

/**
 *
 * @author Abhishek
 */
public class Patient extends Person
{
    private int UID;
    private CountryEnterprise countryEnterprise;
    
    // Variable Declaration
    private static int patientID = 0;
    private float weight;
    private Height height;
    private Date surveyLastTaken;
    private PatientProfile patientProfile;
    private Doctor primaryDoctor;
    private ArrayList<HospitalEnterprise> hospitalsVisited;
    private ArrayList<Doctor> doctorsVisited;
    private ArrayList<Encounter> encounters;
    private WorkQueue workQueue;
    

    public ArrayList<HospitalEnterprise> getHospitalsVisited() {
        return hospitalsVisited;
    }

    public void setHospitalsVisited(ArrayList<HospitalEnterprise> hospitalsVisited) {
        this.hospitalsVisited = hospitalsVisited;
    }

    public ArrayList<Doctor> getDoctorsVisited() {
        return doctorsVisited;
    }

    public void setDoctorsVisited(ArrayList<Doctor> doctorsVisited) {
        this.doctorsVisited = doctorsVisited;
    }

    public ArrayList<Encounter> getEncounters() {
        return encounters;
    }

    public void setEncounters(ArrayList<Encounter> encounters) {
        this.encounters = encounters;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    public Doctor getPrimaryDoctor() {
        return primaryDoctor;
    }

    public void setPrimaryDoctor(Doctor primaryDoctor) {
        this.primaryDoctor = primaryDoctor;
    }

    public CountryEnterprise getCountryEnterprise() {
        return countryEnterprise;
    }

    public void setCountryEnterprise(CountryEnterprise countryEnterprise) {
        this.countryEnterprise = countryEnterprise;
    }

    
    
    public int getUID() {
        return UID;
    }

    public void setUID(int UID) {
        this.UID = UID;
    }

    
    
    public PatientProfile getPatientProfile() {
        return patientProfile;
    }

    public void setPatientProfile(PatientProfile patientProfile) {
        this.patientProfile = patientProfile;
    }

    public static int getPatientID() {
        return patientID;
    }

    public static void setPatientID(int patientID) {
        Patient.patientID = patientID;
    }



    //Constructor
    public Patient()
    {
        ++patientID;
        weight = 0;
        height = new Height(0,0);
        surveyLastTaken = new Date();
        patientProfile = new PatientProfile();
        hospitalsVisited = new ArrayList();
        doctorsVisited = new ArrayList();
        encounters = new ArrayList();
        workQueue = new WorkQueue();
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public Height getHeight() {
        return height;
    }

    public void setHeight(Height height) {
        this.height = height;
    }

    public Date getSurveyLastTaken() {
        return surveyLastTaken;
    }

    public void setSurveyLastTaken(Date surveyLastTaken) {
        this.surveyLastTaken = surveyLastTaken;
    }

    @Override
    public String toString() {
        return Integer.toString(UID); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
    
}
