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
package baseClasses.userAccount;

import baseClasses.person.Person;
import baseClasses.roles.Role;
import java.util.ArrayList;

/**
 *
 * @author Abhishek
 */
public class UserAccountDirectory
{
    private ArrayList<UserAccount> userAccountList;
    
    public UserAccountDirectory()
    {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public void setUserAccountList(ArrayList<UserAccount> userAccountList)
    {
        this.userAccountList = userAccountList;
    }

    public UserAccount createUserAccount(String username, String password, Role role, String status)
    {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setRole(role);
        userAccount.setStatus(status);
        userAccountList.add(userAccount);
        
        System.out.println(userAccount);
        return userAccount;
        
    }
    
    public UserAccount createUserAccount(String username, String password, Role role, String status, Person person)
    {
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setRole(role);
        userAccount.setStatus(status);
        userAccount.setPerson(person);
        userAccountList.add(userAccount);
        System.out.println(userAccount);
        return userAccount;
        
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
        {
            System.out.println("Printing from UserAccountDirectory authenticatUser: " + username + ua.getUsername() + password + ua.getPassword());
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password))
            {
                System.out.println("Authenticated:" + ua);
                return ua;
            }
        }
        return null;
    }
    
    
    public boolean checkIfUserNameIsUnique(String username)
    {
        for(UserAccount ua: userAccountList)
        {
            if(ua.getUsername().equals(username))
                return false;
                        
        }
        return true;
    }
    
    
}
