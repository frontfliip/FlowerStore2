package ua.edu.ucu.apps.demo.user;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
@NoArgsConstructor
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> getAllUsers() {return userRepository.findAll();}

    public void addUser(User user){
        if (userRepository.findUserByEmail(user.getEmail()).isEmpty()){
            userRepository.save(user);
        } else {
            throw new IllegalArgumentException("Duplicate email");
        }
    }
}




