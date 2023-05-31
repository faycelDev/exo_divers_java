package fays.exemple.commande.models;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.util.Date;
@Entity
@PrimaryKeyJoinColumn( name = "idPayment" )
public class PaypalPayment  extends Payment{

    private String accountNumber;
    public PaypalPayment(Integer idPayment, Float amount, Date paymentDate, Command command, String accountNumber) {
        super(idPayment, amount, paymentDate, command);
        this.accountNumber = accountNumber;
    }
}
