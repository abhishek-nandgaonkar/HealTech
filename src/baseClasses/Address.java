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

import baseClasses.enterprise.CityEnterprise;
import baseClasses.enterprise.CountryEnterprise;
import baseClasses.enterprise.StateEnterprise;

/**
 *
 * @author Abhishek
 */
public class Address
{
    private String street;
    private String apartmentName;
    private String apartmentNo;
    private CityEnterprise city;
    private StateEnterprise state;
    private CountryEnterprise country;
    private String zipcode;    

    public CityEnterprise getCity() {
        return city;
    }

    public void setCity(CityEnterprise city) {
        this.city = city;
    }

    public StateEnterprise getState() {
        return state;
    }

    public void setState(StateEnterprise state) {
        this.state = state;
    }

    public CountryEnterprise getCountry() {
        return country;
    }

    public void setCountry(CountryEnterprise country) {
        this.country = country;
    }
    
    public Address()
    {
        
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street)
    {
        this.street = street;
    }

    public String getApartmentName()
    {
        return apartmentName;
    }

    public void setApartmentName(String apartmentName)
    {
        this.apartmentName = apartmentName;
    }

    public String getApartmentNo()
    {
        return apartmentNo;
    }

    public void setApartmentNo(String apartmentNo)
    {
        this.apartmentNo = apartmentNo;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    

    
    
}
