/*
package model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Reception {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int receptionId;

    private Date date;

    @ManyToOne
    @JoinColumn(name = "recipient")
    private Recipient recipient;

    @ManyToOne
    @JoinColumn(name = "hospital")
    private Hospital hospital;

    @OneToOne(mappedBy = "reception")
    private Transfusion transfusion;

    public int getReceptionId() {
        return receptionId;
    }

    public void setReceptionId(int receptionId) {
        this.receptionId = receptionId;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
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

    public Transfusion getDonation() {
        return transfusion;
    }

    public void setDonation(Transfusion transfusion) {
        this.transfusion = transfusion;
    }

}
*/
