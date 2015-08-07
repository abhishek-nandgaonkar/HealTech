/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package baseClasses.vitalSigns;

import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class VitalSignHistory {
    
        ArrayList<VitalSign> vitalSignHistory;

    public VitalSignHistory() {
        vitalSignHistory = new ArrayList<VitalSign>();
        
    }
    
    
    
    public ArrayList<VitalSign> getVitalSignHistory() {
        return vitalSignHistory;
        
    }

    public void setVitalSignHistory(ArrayList<VitalSign> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    public void addVitalSign(VitalSign vitalSign)
    {
        vitalSignHistory.add(vitalSign);
    }
    
    public void removeVitalSign(VitalSign vitalSign)
    {
        vitalSignHistory.remove(vitalSign);
    }
}
