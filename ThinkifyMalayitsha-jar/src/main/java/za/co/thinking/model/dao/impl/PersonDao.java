package za.co.thinking.model.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.co.thinking.model.security.Person;

/**
 * File Name : PersonDao.java Project Name : MainThinkify-jar
 *
 * @since Dec 20, 2016, 10:25:08 AM
 * @author Abel Chavanga <achavanga@fnb.co.za>
 *
 */
public class PersonDao extends AbstractDao<Person>  {

    @PersistenceContext(unitName = "malayitsha-pu")
    private EntityManager em;

    public PersonDao(Class<Person> entityClass) {
        super(entityClass);
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
}
