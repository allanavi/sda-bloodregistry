package model;

import javax.persistence.*;
import java.util.List;

@Entity
public class BloodBank {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bloodBankId;

    private String name;
    private String city;

    @OneToMany(mappedBy = "bloodBank")
    private List<Transfusion> listTransfusions;

    public int getBloodBankId() {
        return bloodBankId;
    }

    public void setBloodBankId(int bloodBankId) {
        this.bloodBankId = bloodBankId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Transfusion> getListDonations() {
        return listTransfusions;
    }

    public void setListDonations(List<Transfusion> listTransfusions) {
        this.listTransfusions = listTransfusions;
    }

}
