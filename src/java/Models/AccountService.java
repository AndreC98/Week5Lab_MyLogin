/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;


/**
 *
 * @author Andre
 */
public class AccountService {
    String username;
    String password;
    User user;
    
    public User login(String username, String password){
        this.username = username;
        this.password = password;
        
        if(username == "abe" || username == "barb"){
            User user = new User(this.username, null);
        }
        return user;
    }
    
}
