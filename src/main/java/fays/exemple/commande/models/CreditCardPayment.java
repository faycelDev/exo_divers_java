package fays.exemple.commande.models;

import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;

import java.util.Date;
@Entity
@PrimaryKeyJoinColumn( name = "idPayment" )
public class CreditCardPayment extends Payment{

    private String cardNumber;
    private String expirationDate;
    public CreditCardPayment(Integer idPayment, Float amount, Date paymentDate, Command command, String cardNumber, String expirationDate) {
        super(idPayment, amount, paymentDate, command);
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
    }
}
