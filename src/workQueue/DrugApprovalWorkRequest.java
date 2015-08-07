/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package workQueue;

import baseClasses.Drug;

/**
 *
 * @author raunak
 */
public class DrugApprovalWorkRequest extends WorkRequest{
    
    private String testResult;
    private Drug drug;

    public Drug getDrug() {
        return drug;
    }

    public void setDrug(Drug drug) {
        this.drug = drug;
    }
    
    
    
    public DrugApprovalWorkRequest(Drug drug)
    {
        this.drug = drug;
    }

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    @Override
    public String toString() {
        return drug.getName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
