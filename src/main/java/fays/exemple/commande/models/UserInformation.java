package fays.exemple.commande.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "UserInformations")
public class UserInformation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idInformations;
    private String adresse;
    private String city;
    private String email;
    private String phoneNumber;

    @OneToOne(mappedBy = "userInformation")
    private User user;
}
