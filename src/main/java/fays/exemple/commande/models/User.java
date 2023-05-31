package fays.exemple.commande.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUser;

    private String login;
    private String password;
    private Integer connectionNumber;


    @OneToMany(mappedBy = "user")
    private Set<Command> command;

    @OneToOne(cascade = CascadeType.ALL)
    private UserInformation userInformation;

    @ManyToMany
    private Set<Role> role;


}
