package model;

import adjuncts.BloodGroup;

import javax.persistence.*;
import java.util.List;

@Entity
public class Donor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int donorId;

    private String nationalId;
    private String firstName;
    private String lastName;
    private BloodGroup bloodGroup;

    @OneToMany(mappedBy = "donor")
    private List<Transfusion> listTransfusions;

    public int getDonorId() {
        return donorId;
    }

    public void setDonorId(int donorId) {
        this.donorId = donorId;
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

    public List<Transfusion> getListDonations() {
        return listTransfusions;
    }

    public void setListDonations(List<Transfusion> listTransfusions) {
        this.listTransfusions = listTransfusions;
    }

}
