package za.co.thinking.model.dao.impl;

import za.co.thinking.model.base.BaseEntity;

//@Stateless
//@TransactionAttribute(TransactionAttributeType.REQUIRED)
public class BaseDao<T extends BaseEntity> {
//
//    private Logger log = LoggerFactory.getLogger(BaseDao.class);
//
//    @PersistenceContext(name = "malaicha-pu")
//    protected EntityManager entityManager;
//
//    @Resource
//    private UserTransaction utx;
//
//    public T findByPrimaryKey(Class<T> clazz, Object id) {
//
//        return entityManager.find(clazz, id);
//    }
//
//    public void add(T entity) {
//        try {
//            utx.begin();
//            entityManager.persist(entity);
//            utx.commit();
//        } catch (Exception ex) {
//            //utx.rollback();
//            java.util.logging.Logger.getLogger(BaseDao.class.getName()).log(Level.SEVERE, null, ex);
//        }
//
//    }
//
//    public void update(T entity) {
//
//        entityManager.merge(entity);
//    }
//
//    @SuppressWarnings("unchecked")
//    public List<T> findAll(String queryName) {
//
//        Query query = entityManager.createNamedQuery(queryName);
//        return query.getResultList();
//
//    }
//
//    public void remove(T entity) {
//
//        entityManager.remove(entity);
//    }
//
//    public void removeAll(List<T> entities) {
//
//        for (T entity : entities) {
//            entityManager.remove(entity);
//        }
//    }
//
//    @SuppressWarnings("unchecked")
//    public T findByNamedQuery(String queryName, Object[] parameters) {
//
//        Query query = entityManager.createNamedQuery(queryName);
//
//        for (int i = 0; i < parameters.length; i++) {
//            query.setParameter(i + 1, parameters[i]);
//        }
//        T entity = null;
//        try {
//            entity = (T) query.getSingleResult();
//
//        } catch (NoResultException nre) {
//
//            // Do nothing the result will be null;
//            log.debug("Attempt to find a single that does not exist, null value returned to caller");
//        }
//        return entity;
//    }
//
//    @SuppressWarnings("unchecked")
//    public List<T> findManyByNamedQuery(String queryName, Object[] parameters) {
//
//        Query query = entityManager.createNamedQuery(queryName);
//
//        for (int i = 0; i < parameters.length; i++) {
//            query.setParameter(i + 1, parameters[i]);
//        }
//
//        return query.getResultList();
//
//    }
//
//    public EntityManager getEntityManager() {
//        return entityManager;
//    }
//
//    public void setEntityManager(EntityManager entityManager) {
//        this.entityManager = entityManager;
//    }

}
