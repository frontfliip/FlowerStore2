package ua.edu.ucu.apps.demo.user;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;

@Entity
@Table(name = "users")
@NoArgsConstructor
@Setter
@Getter

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "user_jpa_sequence_generator")
    @SequenceGenerator(name = "user_jpa_sequence_generator", sequenceName = "user_id_sequence")
    private int id;

    @Column(name = "email", unique = true)
    private String email;

    @Transient
    private int age;

    private LocalDate dob;
    public int getAge(){
        return Period.between(dob, LocalDate.now()).getYears();
    }
}

