package ua.edu.ucu.apps.demo.user;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Sender implements UserInterface{
    private User user;

    @Override
    public void update(String status){
        System.out.println("Sender with email: " + user.getEmail() + ". Message: " + status);

    }
}
