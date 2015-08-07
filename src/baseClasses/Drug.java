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
package baseClasses;

import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class Drug
{
    private String name;
    private ArrayList<String> componentsInvolved;
    private String approvalStatus;

    public Drug()
    {
        componentsInvolved = new ArrayList();
    }
    
    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public ArrayList<String> getComponentsInvolved() {
        return componentsInvolved;
    }

    public void setComponentsInvolved(ArrayList<String> componentsInvolved) {
        this.componentsInvolved = componentsInvolved;
    }

    public void addComponent(String component)
    {
        componentsInvolved.add(component);
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
}
