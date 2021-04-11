package model;

import adjuncts.BloodGroup;

import javax.persistence.*;
import java.util.List;

@Entity
public class Recipient {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int recipientId;

    private String nationalId;
    private String firstName;
    private String lastName;
    private BloodGroup bloodGroup;

    @OneToMany(mappedBy = "recipient")
    private List<Transfusion> listTransfusion;

    public int getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(int recipientId) {
        this.recipientId = recipientId;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public List<Transfusion> getListTransfusion() {
        return listTransfusion;
    }

    public void setListTransfusion(List<Transfusion> listTransfusion) {
        this.listTransfusion = listTransfusion;
    }

}
