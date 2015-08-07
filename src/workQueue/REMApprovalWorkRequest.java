/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package workQueue;

import baseClasses.Drug;
import baseClasses.medicine.Medicine;

/**
 *
 * @author raunak
 */
public class REMApprovalWorkRequest extends WorkRequest{
    
    private String testResult;
    private Medicine medicine;

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }
    
    public REMApprovalWorkRequest(Medicine medicine)
    {
        this.medicine = medicine;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }
    
    @Override
    public String toString() {
        return medicine.getName(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
