package model;

import adjuncts.BloodProductType;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Transfusion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int transfusionId;

    private Date donationDate;
    private Date receptionDate;
    private BloodProductType bloodProductType;

    @ManyToOne
    @JoinColumn(name = "donorId")
    private Donor donor;

    @ManyToOne
    @JoinColumn(name = "bloodBankId")
    private BloodBank bloodBank;

    @ManyToOne
    @JoinColumn(name = "recipient")
    private Recipient recipient;

    @ManyToOne
    @JoinColumn(name = "hospital")
    private Hospital hospital;

    public int getTransfusionId() {
        return transfusionId;
    }

    public void setDonationId(int transfusionId) {
        this.transfusionId = transfusionId;
    }

    public Date getDonationDate() {
        return donationDate;
    }

    public void setDonationDate(Date donationDate) {
        this.donationDate = donationDate;
    }

    public Date getReceptionDate() {
        return receptionDate;
    }

    public void setReceptionDate(Date receptionDate) {
        this.receptionDate = receptionDate;
    }

    public BloodProductType getBloodProductType() {
        return bloodProductType;
    }

    public void setBloodProductType(BloodProductType bloodProductType) {
        this.bloodProductType = bloodProductType;
    }

    public Donor getDonor() {
        return donor;
    }

    public void setDonor(Donor donor) {
        this.donor = donor;
    }

    public BloodBank getBloodBank() {
        return bloodBank;
    }

    public void setBloodBank(BloodBank bloodBank) {
        this.bloodBank = bloodBank;
    }

    public Recipient getRecipient() {
        return recipient;
    }

    public void setRecipient(Recipient recipient) {
        this.recipient = recipient;
    }

    public Hospital getHospital() {
        return hospital;
    }

    public void setHospital(Hospital hospital) {
        this.hospital = hospital;
    }
}
