package main;

import adjuncts.BloodGroup;
import model.Donor;
import persistence.RepositoryDonor;

public class Main {

    public static void main(String[] args) {

        System.out.println("Hello!");

        Donor donor = new Donor();
        donor.setNationalId("34512122121");
        donor.setFirstName("Firsty");
        donor.setLastName("Lasty");
        donor.setBloodGroup(BloodGroup.A_POS);

        RepositoryDonor repositoryDonor = new RepositoryDonor();
        repositoryDonor.saveDonor(donor);

        System.out.println("Good bye!");
    }

}
