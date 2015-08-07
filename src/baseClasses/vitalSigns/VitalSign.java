/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baseClasses.vitalSigns;

import java.sql.Timestamp;

/**
 * 
 *
 * @author Abhishek
 */
public class VitalSign {

     int respiratoryRate;
    int heartRate;
    float bloodPressure;
    float weight;
    String timestamp;
    boolean normalcy;

    public boolean isNormalcy() {
        return normalcy;
    }

    public void setNormalcy(boolean normalcy) {
        this.normalcy = normalcy;
    }


    
    
    public int getRespiratoryRate() {
        return respiratoryRate;
    }

    public void setRespiratoryRate(int respiratoryRate) {
        this.respiratoryRate = respiratoryRate;
    }

    public int getHeartRate() {
        return heartRate;
    }

    public void setHeartRate(int heartRate) {
        this.heartRate = heartRate;
    }

    public float getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(float bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return  timestamp ;
    }
    

    
}
