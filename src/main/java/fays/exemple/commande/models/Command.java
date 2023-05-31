package fays.exemple.commande.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "Command")
public class Command {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCommand;
    private Date commandDate;


    @ManyToOne(cascade = CascadeType.ALL)
    private User user;

    @OneToMany(mappedBy = "command")
    private Set<CommandLine> commandLine;

    @OneToOne(cascade = CascadeType.ALL)
    private Payment payment;
}
