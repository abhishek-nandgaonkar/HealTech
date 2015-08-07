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
package baseClasses.medicine;

import baseClasses.allergy.Disease;
import baseClasses.doctor.Doctor;
import baseClasses.patient.Patient;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Abhishek
 */
public class Prescription
{
    private Patient patient;
    private Doctor doctor;
    private Date firstPrescription;
    private Date latestPrescription;
    private ArrayList<Medicine> medicinesPrescribed;
    private ArrayList<String> dosage;
    private Disease disease;

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }

    public ArrayList<String> getDosage() {
        return dosage;
    }

    public void setDosage(ArrayList<String> dosage) {
        this.dosage = dosage;
    }
    
    public Prescription()
    {
        medicinesPrescribed = new ArrayList();
        dosage = new ArrayList();
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public ArrayList<Medicine> getMedicinesPrescribed() {
        return medicinesPrescribed;
    }

    public void setMedicinesPrescribed(ArrayList<Medicine> medicinesPrescribed) {
        this.medicinesPrescribed = medicinesPrescribed;
    }



    public Date getFirstPrescription() {
        return firstPrescription;
    }

    public void setFirstPrescription(Date firstPrescription) {
        this.firstPrescription = firstPrescription;
    }

    public Date getLatestPrescription() {
        return latestPrescription;
    }

    public void setLatestPrescription(Date latestPrescription) {
        this.latestPrescription = latestPrescription;
    }

    @Override
    public String toString() {
        return String.valueOf(latestPrescription); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
