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
package baseClasses.location;

import baseClasses.network.CountryNetwork;
import baseClasses.network.Network;
import baseClasses.person.PersonDirectory;

/**
 *
 * @author Abhishek
 */
public class Country
{
    private String name;
    //private ArrayList<Person> personList;
    private PersonDirectory personDirectory;

    public Network getCountryNetwork() {
        return countryNetwork;
    }

    public void setCountryNetwork(Network countryNetwork) {
        this.countryNetwork = countryNetwork;
    }


    private StateDirectory stateDirectory;
    private Network countryNetwork;
    
    public Country()
    {
        
        personDirectory = new PersonDirectory();
        stateDirectory = new StateDirectory();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public void setPersonDirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public StateDirectory getStateDirectory() {
        return stateDirectory;
    }

    public void setStateDirectory(StateDirectory stateDirectory) {
        this.stateDirectory = stateDirectory;
    }

    
    
}
