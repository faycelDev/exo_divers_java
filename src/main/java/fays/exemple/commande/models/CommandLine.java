package fays.exemple.commande.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@Table(name = "CommandLine")
public class CommandLine {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCommandLine;
    private Integer quantity;

    @ManyToOne
    private Command command;

    @ManyToOne
    private Article article;
}
