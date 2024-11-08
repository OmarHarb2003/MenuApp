package com.example.menuapp;

import java.util.ArrayList;
import java.util.List;

public class UserDA {


    private List<User> users ;

    public UserDA(){
        users = new ArrayList<>();
        users.add(new User("omar","1210692"));
        users.add(new User("name","123"));
        users.add(new User("username", "password"));

    }

    public Boolean userNameFound(String username,String password){


        for(User d:users){
            if (d.getName().equals(username) && d.getPass().equals(password)){
              return true;
            }
        }
        return  false;
    }

    public List<User> getUsersByName(String username){

        List<User> result = new ArrayList<>();

        for(User d:users){
            if (d.getName().equals(username)){
                result.add(d);
            }
        }
        return  result;
    }

    public boolean usernameExists(String username) {
        for (User user : users) {
            if (user.getName().equals(username)) {
                return true;
            }
        }
        return false;
    }

    // Method to add a new user
    public void addUser(String username, String password) {
        if (!usernameExists(username)) {
            users.add(new User(username, password));
        }
    }
    public void addUser(String username,String password){


        users.add(new User(username,password));

    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
