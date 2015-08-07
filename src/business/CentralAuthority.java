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
import baseClasses.certification.Certification;
import baseClasses.certification.CertificationDirectory;
import baseClasses.enterprise.CountryEnterprise;
import baseClasses.enterprise.Enterprise;
import baseClasses.enterprise.FDAEnterprise;
import baseClasses.enterprise.StateEnterprise;
import baseClasses.network.Network;
import baseClasses.roles.AdminRole;

import baseClasses.roles.CountryRole;
import baseClasses.roles.FDARole;
import baseClasses.userAccount.UserAccountDirectory;
import java.util.Date;

/**
 *
 * @author Abhishek
 */
public class CentralAuthority {

    private String name;
    private Address headquarters;
    //private ArrayList<CertificationDirectory> certificationList;
    private CertificationDirectory certificationDirectory;
    // private CountryDirectory countryDirectory;
    private UserAccountDirectory userAccountDirectory;
    //private ArrayList<Network> networkList;
    private Network internationalNetwork;
    private static CentralAuthority centralAuthority;

    private static String[] countryList = {"Select One", "United States of America", "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua&Deps", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "BosniaHerzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina", "Burma", "Burundi", "Cambodia", "Cameroon", "Canada", "CapeVerde", "CentralAfricanRep", "Chad", "Chile", "People'sRepublicofChina", "Republic of China", "Colombia", "Comoros", "DemocraticRepublicoftheCongo", "RepublicoftheCongo", "CostaRica", "Croatia", "Cuba", "Cyprus", "CzechRepublic", "Danzig", "Denmark", "Djibouti", "Dominica", "DominicanRepublic", "EastTimor", "Ecuador", "Egypt", "ElSalvador", "EquatorialGuinea", "Eritrea", "Estonia", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "GazaStrip", "TheGambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "HolyRomanEmpire", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "RepublicofIreland", "Israel", "Italy", "IvoryCoast", "Jamaica", "Japan", "Jonathanland", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "NorthKorea", "SouthKorea", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "MarshallIslands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "MountAthos", "Mozambique", "Namibia", "Nauru", "Nepal", "Newfoundland", "Netherlands", "NewZealand", "Nicaragua", "Niger", "Nigeria", "Norway", "Oman", "OttomanEmpire", "Pakistan", "Palau", "Panama", "PapuaNewGuinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Prussia", "Qatar", "Romania", "Rome", "RussianFederation", "Rwanda", "StKitts&Nevis", "StLucia", "SaintVincent&the", "Grenadines", "Samoa", "SanMarino", "SaoTome&Principe", "SaudiArabia", "Senegal", "Serbia", "Seychelles", "SierraLeone", "Singapore", "Slovakia", "Slovenia", "SolomonIslands", "Somalia", "SouthAfrica", "Spain", "SriLanka", "Sudan", "Suriname", "Swaziland", "Sweden", "Switzerland", "Syria", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga", "Trinidad&Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "UnitedArabEmirates", "UnitedKingdom", "Uruguay", "Uzbekistan", "Vanuatu", "VaticanCity", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe"};
    
       private static String[] USAstateList = {"Select One", "Alabama",
        "Alaska",
        "Arizona",
        "Arkansas",
        "California",
        "Colorado",
        "Connecticut",
        "Delaware",
        "DistrictOfColumbia",
        "Florida",
        "Georgia",
        "Hawaii",
        "Idaho",
        "Illinois",
        "Indiana",
        "Iowa",
        "Kansas",
        "Kentucky",
        "Louisiana",
        "Maine",
        "Maryland",
        "Massachusetts",
        "Michigan",
        "Minnesota",
        "Mississippi",
        "Missouri",
        "Montana",
        "Nebraska",
        "Nevada",
        "NewHampshire",
        "NewJersey",
        "NewMexico",
        "NewYork",
        "NorthCarolina",
        "NorthDakota",
        "Ohio",
        "Oklahoma",
        "Oregon",
        "Pennsylvania",
        "RhodeIsland",
        "SouthCarolina",
        "SouthDakota",
        "Tennessee",
        "Texas",
        "Utah",
        "Vermont",
        "Virginia",
        "Washington",
        "WestVirginia",
        "Wisconsin",
        "Wyoming"};

    private static String[] chinaStateList = {"Select One", "Anhui", "Fujian", "Gansu", "Guangdong", "Guizhou", "Hainan", "Hebei", "Heilongjiang", "Henan", "Hubei", "Hunan", "Jiangsu", "Jiangxi", "Jilin", "Liaoning", "Qinghai", "Shaanxi", "Shandong", "Shanxi", "Sichuan", "Yunnan", "Zhejiang", "Guangxi Zhuang", "Inner Mongolia", "Ningxia Hui", "Xinjiang Uighur", "Tibet"};

    private static String[] indiaStateList = {"Select One", "Andra Pradesh",
        "Arunachal Pradesh",
        "Assam",
        "Bihar",
        "Chhattisgarh",
        "Goa",
        "Gujarat",
        "Haryana",
        "Himachal Pradesh",
        "Jammu and Kashmir",
        "Jharkhand",
        "Karnataka",
        "Kerala",
        "Madya Pradesh",
        "Maharashtra",
        "Manipur",
        "Meghalaya",
        "Mizoram",
        "Nagaland",
        "Orissa",
        "Punjab",
        "Rajasthan",
        "Sikkim",
        "Tamil Nadu",
        "Tripura",
        "Uttaranchal",
        "Uttar Pradesh",
        "West Bengal",
        "Andaman and Nicobar Islands",
        "Chandigarh",
        "Dadra and Nagar Haveli",
        "Daman and Diu",
        "Delhi",
        "Lakshadeep",
        "Pondicherry"
    };

    public CentralAuthority() {
        System.out.println("Printing from the central authority constructor");
        //certificationList = new ArrayList();
        certificationDirectory = new CertificationDirectory();
        //countryDirectory = new CountryDirectory();
        userAccountDirectory = new UserAccountDirectory();
        internationalNetwork = new Network();
        System.out.println(internationalNetwork);
        //networkList = new ArrayList();
        configureCountries();
        configureStates();

        for (Enterprise country : internationalNetwork.getEnterpriseDirectory().getEnterpriseList()) {

        }

    }

    public Network getInternationalNetwork() {
        return internationalNetwork;
    }

    public void setInternationalNetwork(Network internationalNetwork) {
        this.internationalNetwork = internationalNetwork;
    }

    public void configureCountries() {
        CountryEnterprise countryEnterprise = new CountryEnterprise(null);
        FDAEnterprise fdaEnterprise = null;
        for (String country : countryList) {
            // if(!(country.equals("Select One")))
            {
                country.replaceAll("\\s+", "");
                countryEnterprise = new CountryEnterprise(country);
                String fdaName = countryEnterprise.getName() + "FDA";
                System.out.println("Printing from configure Countries"+fdaName);
                //fdaEnterprise = new FDAEnterprise(fdaName);
                countryEnterprise = (CountryEnterprise) internationalNetwork.getEnterpriseDirectory().
                        createAndAddEnterprise(country, Enterprise.EnterpriseType.Country, country, country, new CountryRole(), "Active", null);
                //countryEnterprise.getUserAccountDirectory().createUserAccount(fdaName, fdaName, new AdminRole(),"Active");
                //fdaEnterprise = (FDAEnterprise) internationalNetwork.getEnterpriseDirectory().createAndAddEnterprise(fdaName, Enterprise.EnterpriseType.FDA, fdaName, fdaName, new FDARole(), "Active");
                fdaEnterprise = (FDAEnterprise) countryEnterprise.getCountryNetwork().getEnterpriseDirectory().
                        createAndAddEnterprise(fdaName, Enterprise.EnterpriseType.FDA, fdaName, fdaName, new FDARole(), "Active", null);
            }

        }

    }

    private void configureStates() {
        CountryEnterprise countryEnterprise;
        for (Enterprise country : internationalNetwork.getEnterpriseDirectory().getEnterpriseList()) {
            if (country.getClass() == CountryEnterprise.class) {
                countryEnterprise = (CountryEnterprise) country;
                if (countryEnterprise.getName().equalsIgnoreCase("United States of America")) {
                    Network countryNetwork = countryEnterprise.getCountryNetwork();
                    StateEnterprise stateEnterprise;
                    for (String state : USAstateList) {
                        stateEnterprise = new StateEnterprise(state);

                        countryNetwork.getEnterpriseDirectory().getEnterpriseList().add(stateEnterprise);

                    }
                }

                if (countryEnterprise.getName().equalsIgnoreCase("India")) {
                    Network countryNetwork = countryEnterprise.getCountryNetwork();
                    StateEnterprise stateEnterprise;
                    for (String state : indiaStateList) {
                        stateEnterprise = new StateEnterprise(state);
                        countryNetwork.getEnterpriseDirectory().getEnterpriseList().add(stateEnterprise);
                    }
                }

                if (countryEnterprise.getName().equals("Republic of China")) {
                    Network countryNetwork = countryEnterprise.getCountryNetwork();
                    StateEnterprise stateEnterprise;
                    for (String state : chinaStateList) {
                        stateEnterprise = new StateEnterprise(state);
                        countryNetwork.getEnterpriseDirectory().getEnterpriseList().add(stateEnterprise);
                    }
                }
            }
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getHeadquarters() {
        return headquarters;
    }

    public void setHeadquarters(Address headquarters) {
        this.headquarters = headquarters;
    }

    public CertificationDirectory getCertificationDirectory() {
        return certificationDirectory;
    }

    public void setCertificationDirectory(CertificationDirectory certificationDirectory) {
        this.certificationDirectory = certificationDirectory;
    }

    public static CentralAuthority getCentralAuthority() {
        return centralAuthority;
    }

    public static void setCentralAuthority(CentralAuthority centralAuthority) {
        CentralAuthority.centralAuthority = centralAuthority;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public void authorizeCertification(String certificateName, String certifier, Date validity) {
        Certification certification = certificationDirectory.createAndAddCertification();
        certification.setCertificate(certificateName);
        certification.setCertificationAuthority(certifier);
        certification.setDateOfCertification(new Date());
        certification.setValidity(validity);

    }

    public static CentralAuthority getInstance() {
        if (centralAuthority == null) {
            centralAuthority = new CentralAuthority();
            System.out.println("Printing from Central Authority: " + centralAuthority + centralAuthority.getInternationalNetwork());
        }

        return centralAuthority;
    }

}
