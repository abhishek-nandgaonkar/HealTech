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
package baseClasses.organization;

import baseClasses.medicine.Medicine;
import baseClasses.roles.ManufacturingRole;
import baseClasses.roles.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class ManufacturingOrganization extends Organization
{
    ArrayList<Medicine> medicineList;

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

    public void setMedicineList(ArrayList<Medicine> medicineList) {
        this.medicineList = medicineList;
    }
    
    
    
        public ManufacturingOrganization(String name)
        {
            super(name);
            //super(Organization.Type.Manufacturing.getValue());
            medicineList = new ArrayList();
        }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ManufacturingRole());
        return roles;
    }
    
}
