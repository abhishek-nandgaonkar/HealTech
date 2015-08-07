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
package business;

import baseClasses.Address;
import baseClasses.Name;
import baseClasses.citizen.Citizen;
import baseClasses.enterprise.CityEnterprise;
import baseClasses.enterprise.CountryEnterprise;
import baseClasses.enterprise.Enterprise;
import baseClasses.enterprise.HealTechLocalEnterprise;
import baseClasses.enterprise.HospitalEnterprise;
import baseClasses.enterprise.ManufacturingEnterprise;
import baseClasses.enterprise.PharmaceuticalCompanyEnterprise;
import baseClasses.enterprise.PharmacyEnterprise;
import baseClasses.enterprise.StateEnterprise;
import baseClasses.organization.CitizenOrganization;
import baseClasses.organization.Organization;
import baseClasses.person.Person;
import baseClasses.roles.AdminRole;
import baseClasses.roles.SystemAdminRole;
import baseClasses.userAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Abhishek
 */
public class ConfigureCentralAuthority {

    public static CentralAuthority initialize() {
        CentralAuthority centralAuthority = CentralAuthority.getInstance();
        HospitalEnterprise hospitalEnterprise = null;

        if (centralAuthority.getInternationalNetwork().getEnterpriseDirectory().getEnterpriseList().isEmpty()) {
            centralAuthority.configureCountries();
        }
        UserAccount userAccount = centralAuthority.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", new SystemAdminRole(), "Active");

        Address address = new Address();
        address.setCountry(new CountryEnterprise("United States of America"));
        address.setState(new StateEnterprise("Massachusetts"));
        address.setCity(new CityEnterprise("Boston"));
        address.setStreet("Tremont");
        address.setZipcode("02120");
        CityEnterprise cityEnterprise;
        StateEnterprise stateEnterprise;
        CountryEnterprise countryEnterprise, countryEnt;

        for (Enterprise country : centralAuthority.getInternationalNetwork().getEnterpriseDirectory().getEnterpriseList()) {
            if (country.getClass() == CountryEnterprise.class) {
                countryEnt = (CountryEnterprise) country;

                if (countryEnt.getName().equals("United States of America")) {
                    countryEnterprise = countryEnt;
                    for (Enterprise state : countryEnterprise.getCountryNetwork().getEnterpriseDirectory().getEnterpriseList()) {
                        if (state.getClass() == StateEnterprise.class) {
                            stateEnterprise = (StateEnterprise) state;
                            if (stateEnterprise.getName().equals("Massachusetts")) {
                                stateEnterprise.getStateNetwork().getEnterpriseDirectory().createAndAddEnterprise("Boston", Enterprise.EnterpriseType.City, null, null, null, null, null);
                                for (Enterprise city : stateEnterprise.getStateNetwork().getEnterpriseDirectory().getEnterpriseList()) {
                                    cityEnterprise = (CityEnterprise) city;

                                    hospitalEnterprise = (HospitalEnterprise) cityEnterprise.getCityNetwork().getEnterpriseDirectory().
                                            createAndAddEnterprise("BMC", Enterprise.EnterpriseType.Hospital, "bmc", "bmc", new AdminRole(), "Active", address);

                                    hospitalEnterprise = (HospitalEnterprise) cityEnterprise.getCityNetwork().getEnterpriseDirectory().
                                            createAndAddEnterprise("YMCA", Enterprise.EnterpriseType.Hospital, "ymca", "ymca", new AdminRole(), "Active", address);
                                    System.out.println("Enterprise created for bmc");
                                    hospitalEnterprise.setAddress(address);
                                    break;
                                }
                            }
                        }
                        if (hospitalEnterprise != null) {
                            break;
                        }
                    }

                    if (hospitalEnterprise != null) {
                        break;
                    }
                }
            }
        }
//
        address = new Address();
        address.setCountry(new CountryEnterprise("United States of America"));
        address.setState(new StateEnterprise("Massachusetts"));
        address.setCity(new CityEnterprise("New Hampshire"));
        address.setStreet("Tremont");
        address.setZipcode("02120");
        for (Enterprise country : centralAuthority.getInternationalNetwork().getEnterpriseDirectory().getEnterpriseList()) {
            if (country.getClass() == CountryEnterprise.class) {
                countryEnt = (CountryEnterprise) country;

                if (countryEnt.getName().equals("United States of America")) {
                    countryEnterprise = countryEnt;
                    for (Enterprise state : countryEnterprise.getCountryNetwork().getEnterpriseDirectory().getEnterpriseList()) {
                        if (state.getClass() == StateEnterprise.class) {
                            stateEnterprise = (StateEnterprise) state;
                            if (stateEnterprise.getName().equals("Massachusetts")) {
                                stateEnterprise.getStateNetwork().getEnterpriseDirectory().createAndAddEnterprise("New Hampshire", Enterprise.EnterpriseType.City, null, null, null, null, null);
                                for (Enterprise city : stateEnterprise.getStateNetwork().getEnterpriseDirectory().getEnterpriseList()) {
                                    cityEnterprise = (CityEnterprise) city;
                                    if (cityEnterprise.getName().equals("New Hampshire")) {
                                        PharmaceuticalCompanyEnterprise pharmaceuticalCompanyEnterprise = (PharmaceuticalCompanyEnterprise) cityEnterprise.getCityNetwork().
                                                getEnterpriseDirectory().createAndAddEnterprise("JNJ", Enterprise.EnterpriseType.PharmaceuticalCompany, "jnj", "jnj", new AdminRole(), "Active", address);
                                        pharmaceuticalCompanyEnterprise.setAddress(address);
                                        
//                                        pharmaceuticalCompanyEnterprise = (PharmaceuticalCompanyEnterprise) cityEnterprise.getCityNetwork().
//                                                getEnterpriseDirectory().createAndAddEnterprise("GSK", Enterprise.EnterpriseType.PharmaceuticalCompany, "gsk", "gsk", new AdminRole(), "Active");
//                                        pharmaceuticalCompanyEnterprise.setAddress(address);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
//
        address = new Address();
        address.setCountry(new CountryEnterprise("United States of America"));
        address.setState(new StateEnterprise("Massachusetts"));
        address.setCity(new CityEnterprise("Worcester"));
        address.setStreet("Tremont");
        address.setZipcode("02120");
        for (Enterprise country : centralAuthority.getInternationalNetwork().getEnterpriseDirectory().getEnterpriseList()) {
            if (country.getClass() == CountryEnterprise.class) {
                countryEnt = (CountryEnterprise) country;

                if (countryEnt.getName().equals("United States of America")) {
                    countryEnterprise = countryEnt;
                    for (Enterprise state : countryEnterprise.getCountryNetwork().getEnterpriseDirectory().getEnterpriseList()) {
                        if (state.getClass() == StateEnterprise.class) {
                            stateEnterprise = (StateEnterprise) state;
                            if (stateEnterprise.getName().equals("Massachusetts")) {
                                stateEnterprise.getStateNetwork().getEnterpriseDirectory().createAndAddEnterprise("Worcester", Enterprise.EnterpriseType.City, null, null, null, null, null);

                                for (Enterprise city : stateEnterprise.getStateNetwork().getEnterpriseDirectory().getEnterpriseList()) {
                                    cityEnterprise = (CityEnterprise) city;

                                    if (cityEnterprise.getName().equals("Worcester")) {
                                        PharmacyEnterprise pharmacyEnterprise = (PharmacyEnterprise) cityEnterprise.getCityNetwork().getEnterpriseDirectory().
                                                createAndAddEnterprise("Apollo", Enterprise.EnterpriseType.Pharmacy, "apollo", "apollo", new AdminRole(), "Active", address);

                                        pharmacyEnterprise = (PharmacyEnterprise) cityEnterprise.getCityNetwork().getEnterpriseDirectory().
                                                createAndAddEnterprise("Med", Enterprise.EnterpriseType.Pharmacy, "med", "med", new AdminRole(), "Active", address);
                                        pharmacyEnterprise.setAddress(address);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

        address = new Address();
        address.setCountry(new CountryEnterprise("United States of America"));
        address.setState(new StateEnterprise("Massachusetts"));
        address.setCity(new CityEnterprise("Boston"));
        address.setStreet("Tremont");
        address.setZipcode("02120");
        for (Enterprise country : centralAuthority.getInternationalNetwork().getEnterpriseDirectory().getEnterpriseList()) {
            if (country.getClass() == CountryEnterprise.class) {
                countryEnt = (CountryEnterprise) country;

                if (countryEnt.getName().equals("United States of America")) {
                    countryEnterprise = countryEnt;
                    for (Enterprise state : countryEnterprise.getCountryNetwork().getEnterpriseDirectory().getEnterpriseList()) {
                        if (state.getClass() == StateEnterprise.class) {
                            stateEnterprise = (StateEnterprise) state;

                            for (Enterprise city : stateEnterprise.getStateNetwork().getEnterpriseDirectory().getEnterpriseList()) {
                                cityEnterprise = (CityEnterprise) city;

                                if (cityEnterprise.getName().equals("Boston")) {
                                    HealTechLocalEnterprise healTechLocalEnterprise = (HealTechLocalEnterprise) cityEnterprise.getCityNetwork().getEnterpriseDirectory().
                                            createAndAddEnterprise("Boston", Enterprise.EnterpriseType.HealTechLocal, "boston", "boston", new AdminRole(), "Active", address);
                                    healTechLocalEnterprise.setAddress(address);
                                }
                            }
                        }
                    }
                }
            }
        }

        address = new Address();
        address.setCountry(new CountryEnterprise("United States of America"));
        address.setState(new StateEnterprise("Massachusetts"));
        address.setCity(new CityEnterprise("Salem"));
        address.setStreet("Tremont");
        address.setZipcode("02120");

        for (Enterprise country : centralAuthority.getInternationalNetwork().getEnterpriseDirectory().getEnterpriseList()) {
            if (country.getClass() == CountryEnterprise.class) {
                countryEnt = (CountryEnterprise) country;

                if (countryEnt.getName().equals("United States of America")) {
                    countryEnterprise = countryEnt;
                    for (Enterprise state : countryEnterprise.getCountryNetwork().getEnterpriseDirectory().getEnterpriseList()) {
                        if (state.getClass() == StateEnterprise.class) {
                            stateEnterprise = (StateEnterprise) state;
                            for (Enterprise city : stateEnterprise.getStateNetwork().getEnterpriseDirectory().getEnterpriseList()) {
                                cityEnterprise = (CityEnterprise) city;

                                if (cityEnterprise.getName().equals("Boston")) {
                                    ManufacturingEnterprise manufacturingEnterprise = (ManufacturingEnterprise) cityEnterprise.getCityNetwork().getEnterpriseDirectory().
                                            createAndAddEnterprise("Infinity", Enterprise.EnterpriseType.Manufacturing, "infinity", "infinity", new AdminRole(), "Active", address);
                                    manufacturingEnterprise.setAddress(address);
                                }
                            }
                        }
                    }
                }
            }
        }
        // Code for adding new Citizen

        Citizen citizen = new Citizen();
        citizen.setUID(Citizen.getCitizenUID());
        address = new Address();
        address.setCountry(new CountryEnterprise("United States of America"));
        address.setState(new StateEnterprise("Massachusetts"));
        address.setCity(new CityEnterprise("Boston"));
        CitizenOrganization citizenOrganization;
        address.setStreet("Tremont Street");
        address.setZipcode(("02120"));
        address.setApartmentName("Cityview");
        address.setApartmentNo(("1604"));
        Name name = new Name();
        name.setFirstName("Abhishek");
        name.setLastName("Nandgaonkar");
        name.setMiddleName("S");
        citizen.setName(name);
        citizen.setAddress(address);
        citizen.setNationality("United States of America");
        citizen.setDateOfBirth(null);
        boolean flag = false;

        Citizen citizen1 = new Citizen();
        System.out.println("citizen 1" + citizen1);
        citizen1.setUID(Citizen.getCitizenUID());
        System.out.println("Citizen printing: " + citizen + citizen1);
        Address address1 = new Address();
        address1.setCountry(new CountryEnterprise("United States of America"));
        address1.setState(new StateEnterprise("Massachusetts"));
        address1.setCity(new CityEnterprise("Boston"));
        CitizenOrganization citizenOrganization1;
        address1.setStreet("Tremont Street");
        address1.setZipcode(("02120"));
        address1.setApartmentName("Cityview");
        address1.setApartmentNo(("308"));
        Name name1 = new Name();
        name1.setFirstName("Punita");
        name1.setLastName("Dharod");
        name1.setMiddleName("S");
        citizen1.setName(name1);
        citizen1.setAddress(address1);
        citizen1.setNationality("United States of America");
        citizen1.setDateOfBirth(null);
        System.out.println("citizen " + citizen);
        System.out.println("Citizen printing: " + citizen + citizen1);

        for (Enterprise country : centralAuthority.getInternationalNetwork().getEnterpriseDirectory().getEnterpriseList()) {
            if (country.getClass() == CountryEnterprise.class) {
                countryEnt = (CountryEnterprise) country;

                if (countryEnt.getName().equals("United States of America")) {
                    countryEnterprise = countryEnt;
                    for (Enterprise state : countryEnterprise.getCountryNetwork().getEnterpriseDirectory().getEnterpriseList()) {
                        if (state.getClass() == StateEnterprise.class) {
                            stateEnterprise = (StateEnterprise) state;
                            if (stateEnterprise.getName().equals("Massachusetts")) {
                                for (Enterprise city : stateEnterprise.getStateNetwork().getEnterpriseDirectory().getEnterpriseList()) {
                                    cityEnterprise = (CityEnterprise) city;
                                    if (cityEnterprise.getName().equals("Boston")) {
                                        for (Organization organization : cityEnterprise.getOrganizationDirectory().getOrganizationList()) {

                                            if (organization.getClass() == CitizenOrganization.class) {
                                                citizenOrganization = (CitizenOrganization) organization;
                                                System.out.println(citizenOrganization.getPersonDirectory().getPersonList());
                                                Person person = citizenOrganization.getPersonDirectory().createAndAddPerson(citizen);
                                                System.out.println(citizenOrganization.getPersonDirectory().getPersonList());
                                                Person person1 = citizenOrganization.getPersonDirectory().createAndAddPerson(citizen1);
                                                System.out.println(citizenOrganization.getPersonDirectory().getPersonList());
                                                flag = true;
                                                System.out.println("Length of citizens in the list" + citizenOrganization.getPersonDirectory().getPersonList().size());
                                            }

                                        }
//                                        if (flag == false) {
//                                            citizenOrganization = new CitizenOrganization();
//                                            cityEnterprise.getOrganizationDirectory().getOrganizationList().add(citizenOrganization);
//                                            Person person = citizenOrganization.getPersonDirectory().createAndAddPerson(citizen);
//                                            person = citizen;
//                                        }
                                    }
                                }
                            }

                        }
                    }
                }
            }
        }

        return centralAuthority;

    }

} //end of class

