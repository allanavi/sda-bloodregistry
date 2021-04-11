package model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Hospital {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private int hospitalId;

    private String name;
    private String city;

    @OneToMany(mappedBy = "hospital")
    private List<Transfusion> transfusionlist;

    public int getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(int hospitalId) {
        this.hospitalId = hospitalId;
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

    public List<Transfusion> getTransfusionlist() {
        return transfusionlist;
    }

    public void setTransfusionlist(List<Transfusion> transfusionlist) {
        this.transfusionlist = transfusionlist;
    }
}
