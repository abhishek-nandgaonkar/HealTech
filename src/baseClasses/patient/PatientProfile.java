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

import baseClasses.allergy.Allergy;
import baseClasses.allergy.Disease;

import baseClasses.allergy.MedicinalAllergy;
import baseClasses.medicine.Prescription;
import baseClasses.vitalSigns.VitalSign;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class PatientProfile {

    //private ArrayList<Hospital> hospitalsVisited;
    //private Doctor doctor;
    private Disease disease;

    public Disease getDisease() {
        return disease;
    }

    public void setDisease(Disease disease) {
        this.disease = disease;
    }
    private ArrayList<Allergy> allergiesList;
    private ArrayList<MedicinalAllergy> medicinalAllergyList;
    //private ArrayList<Notes> doctorNotes;
    //private ArrayList<Notes> notesBySelf;
    //private ArrayList<Article> articlesBySelf;
    //private ArrayList<Article> savedArticles;
    private Prescription lastPrescription;
    private ArrayList<Prescription> prescriptionHistory;
    private ArrayList<VitalSign> vitalSignHistory;
    private VitalSign lastVitalSigns;
    private ArrayList<Encounter> encounterList;

    public ArrayList<Encounter> getEncounterList() {
        return encounterList;
    }

    public void setEncounterList(ArrayList<Encounter> encounterList) {
        this.encounterList = encounterList;
    }


    
    

    public Prescription getLastPrescription() {
        return lastPrescription;
    }

    public void setLastPrescription(Prescription lastPrescription) {
        this.lastPrescription = lastPrescription;
    }

    public ArrayList<VitalSign> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSign> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }

    public VitalSign getLastVitalSigns() {
        return lastVitalSigns;
    }

    public void setLastVitalSigns(VitalSign lastVitalSigns) {
        this.lastVitalSigns = lastVitalSigns;
    }
    
    

    public PatientProfile() {
        allergiesList = new ArrayList<Allergy>();
        medicinalAllergyList = new ArrayList<MedicinalAllergy>();
        vitalSignHistory = new ArrayList();
        encounterList = new ArrayList();
        prescriptionHistory = new ArrayList();
//        doctorNotes = new ArrayList<Notes>();
//        notesBySelf = new ArrayList<Notes>();
//        articlesBySelf = new ArrayList<Article>();
//        savedArticles = new ArrayList<Article>();
    }

    public ArrayList<Allergy> getAllergiesList() {
        return allergiesList;
    }

    public void setAllergiesList(ArrayList<Allergy> allergiesList) {
        this.allergiesList = allergiesList;
    }

    public ArrayList<MedicinalAllergy> getMedicinalAllergyList() {
        return medicinalAllergyList;
    }

    public void setMedicinalAllergyList(ArrayList<MedicinalAllergy> medicinalAllergyList) {
        this.medicinalAllergyList = medicinalAllergyList;
    }

    
    public ArrayList<Prescription> getPrescriptionHistory() {
        return prescriptionHistory;
    }

    public void setPrescriptionHistory(ArrayList<Prescription> prescriptionHistory) {
        this.prescriptionHistory = prescriptionHistory;
    }

}
