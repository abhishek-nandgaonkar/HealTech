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
package baseClasses.pharmaceuticalCompany;

import baseClasses.certification.Certification;
import baseClasses.enterprise.CountryEnterprise;
import baseClasses.person.Person;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class PharmaceuticalCompany extends Person
{
    
    private Certification certifications;
    private ArrayList<String> standardsImplemented;
    private CountryEnterprise countryEnterprise;

    
    
    
    
    public PharmaceuticalCompany()
    {
        standardsImplemented = new ArrayList<String>();
        
    }

    public Certification getCertifications() {
        return certifications;
    }

    public void setCertifications(Certification certifications) {
        this.certifications = certifications;
    }

    public ArrayList<String> getStandardsImplemented() {
        return standardsImplemented;
    }

    public void setStandardsImplemented(ArrayList<String> standardsImplemented) {
        this.standardsImplemented = standardsImplemented;
    }
    
    
    
}
