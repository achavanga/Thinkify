package za.co.thinking.model.dao.impl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import za.co.thinking.model.security.User;

/**
 * File Name : UserDao.java Project Name : MainThinkify-jar
 *
 * @since Dec 20, 2016, 10:22:58 AM
 * @author Abel Chavanga <achavanga@fnb.co.za>
 *
 */
@Stateless
public class UserDao extends AbstractDao<User> {
    
    private final Logger LOG = LoggerFactory.getLogger(UserDao.class);
    @PersistenceContext(unitName = "malayitsha-pu")
    private EntityManager em;
    
    public UserDao() {
        super(User.class);
    }
    
    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
    public User findByEmail(String email) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<User> criteria = cb.createQuery(User.class);
        Root<User> member = criteria.from(User.class);
        // Swap criteria statements if you would like to try out type-safe criteria queries, a new
        // feature in JPA 2.0
        // criteria.select(member).where(cb.equal(member.get(Member_.name), email));
        criteria.select(member).where(cb.equal(member.get("emailAddress"), email));
        return em.createQuery(criteria).getSingleResult();
    }
    
    public User findById(Long id) {
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<User> criteria = cb.createQuery(User.class);
        Root<User> member = criteria.from(User.class);
        // Swap criteria statements if you would like to try out type-safe criteria queries, a new
        // feature in JPA 2.0
        // criteria.select(member).where(cb.equal(member.get(Member_.name), email));
        criteria.select(member).where(cb.equal(member.get("id"), id));
        return em.createQuery(criteria).getSingleResult();
    }
    
    public User findByUserName(String userName) {
//        CriteriaBuilder cb = em.getCriteriaBuilder();
//        CriteriaQuery<User> criteria = cb.createQuery(User.class);
//        Root<User> member = criteria.from(User.class);
//        // Swap criteria statements if you would like to try out type-safe criteria queries, a new
//        // feature in JPA 2.0
//        // criteria.select(member).where(cb.equal(member.get(Member_.name), email));
//        criteria.select(member).where(cb.equal(member.get("userName"), userName));
//        return em.createQuery(criteria).getSingleResult();
        User user = null;
        try {
            user = (User) em.createQuery(
                    "SELECT u FROM User u WHERE u.userName = :userName")
                    .setParameter("userName", userName)
                    .getSingleResult();
        } catch (NoResultException ex) {
            LOG.error("No results found for user");
        }
        return user;
    }
}
