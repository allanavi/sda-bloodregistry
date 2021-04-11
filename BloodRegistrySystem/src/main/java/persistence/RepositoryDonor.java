package persistence;

import model.Donor;
import util.DbUtil;

import javax.persistence.EntityManager;

public class RepositoryDonor {

    private EntityManager em;

    public RepositoryDonor() {
        this.em = DbUtil.getEntityManager();
    }

    public void saveDonor(Donor donor) {
        try {
            this.em.getTransaction().begin();
            this.em.persist(donor);
            this.em.getTransaction().commit();
        } catch (Exception e) {
            this.em.getTransaction().rollback();
        }
    }

}
