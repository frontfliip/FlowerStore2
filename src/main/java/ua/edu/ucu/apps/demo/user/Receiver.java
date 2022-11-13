package ua.edu.ucu.apps.demo.user;

import lombok.Setter;

@Setter
public class Receiver implements UserInterface{
    private User user;

    @Override
    public void update(String status){
        System.out.println("Receiver with email: " + user.getEmail() + ". Message: " + status);
    }
}
