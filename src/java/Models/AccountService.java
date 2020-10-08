/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.io.Serializable;


/**
 *
 * @author Andre
 */
public class AccountService implements Serializable{
    String username;
    String password;
    User user;
    
    public User login(String username, String password){
        this.username = username;
        this.password = password;
        
        if("abe".equals(username) || "barb".equals(username)){
            if("password".equals(password)){
                user = new User(this.username, null);
                return user;
            }
        }
        return user;
    }
    
}
