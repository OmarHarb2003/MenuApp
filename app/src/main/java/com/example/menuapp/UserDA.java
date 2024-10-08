package com.example.menuapp;

import java.util.ArrayList;
import java.util.List;

public class UserDA {


    private List<User> users ;

    public UserDA(){
        users = new ArrayList<>();
        users.add(new User("OHarb","o1234"));
        users.add(new User("harb", "h1234"));
        users.add(new User("nameless","name1234"));
        users.add(new User("jojo","j101"));
        users.add(new User("night","n2020"));

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
    public List<User> getUsersByPass(String password){

        List<User> result = new ArrayList<>();

        for(User d:users){
            if (d.getPass().equals(password)){
                result.add(d);
            }
        }
        return  result;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }
}
