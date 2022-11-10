package ua.edu.ucu.apps.demo.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table
@NoArgsConstructor
@Setter
@Getter

public class User {
    @Id
    @GeneratedValue
    private int id;

    private String email;

    @Transient
    private int age;

    /**
     * Date of birth
     */
    private LocalDate dob;

    public int getAge(){
        return Period.between(dob, LocalDate.now()).getYears();
    }
}

