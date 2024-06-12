package ru.wstrug.kataPP.dao;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.PersistenceContextType;
import jakarta.persistence.Query;
import org.springframework.stereotype.Repository;
import ru.wstrug.kataPP.model.User;

import java.util.List;

@Repository
public class UserDaoImp implements UserDao {
   @PersistenceContext(type= PersistenceContextType.TRANSACTION)
   private EntityManager em;

   @Override
   public void add(User user) {
      em.persist(user);
   }

   @Override
   public void deleteUserById(int id) {
      //User user = em.find(User.class, id);
      //em.remove(user);
      Query query = em.createQuery("Delete  from User u where u.id = :id");
      query.setParameter("id", id);
      query.executeUpdate();
   }

   @Override
   @SuppressWarnings("unchecked")
   public List<User> listUsers() {
      return em.createQuery("select u from User u", User.class).getResultList();
   }

   @Override
   public User getUserById(int id) {
      return em.find(User.class, id);

   }

   @Override
   public void updateUserById(User user, int id) {
      em.merge(user);
   }


   @Override
   public int clean(){
      String hql = "delete from User";
      return em.createQuery(hql).executeUpdate();
   }

}
