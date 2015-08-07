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
package baseClasses.person;

import baseClasses.citizen.Citizen;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class PersonDirectory
{
    ArrayList<Person> personList;

    public PersonDirectory()
    {
        personList = new ArrayList<>();
    }
    
    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public void setPersonList(ArrayList<Person> personList) {
        this.personList = personList;
    }
    
    public Person createAndAddPerson(Citizen citizen)
    {
        Person person = new Person();
        person =  citizen;
        System.out.println("Printing from Person Directory class: " + citizen.getName().getFirstName());
        System.out.println("Printing from Person Directory class: " + citizen);
       //person = citizen;
        personList.add(person);
        return person;
    }

    public Citizen getCitizenByID(int ID)
    {
        Citizen citizen = null;
        
        for(Person person: personList)
        {
            if(person.getClass() == Citizen.class)
            {
                citizen = (Citizen)  person;
                if(citizen.getUID() == ID)
                {
                    return citizen;
                }
            }
        }
        return null;
    }
    
    
}
