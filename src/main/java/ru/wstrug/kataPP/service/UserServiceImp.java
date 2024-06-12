package ru.wstrug.kataPP.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.wstrug.kataPP.dao.UserDao;
import ru.wstrug.kataPP.model.User;

import java.util.List;

@Service
public class UserServiceImp implements UserService {

   @Autowired
   private UserDao userDao;

   @Transactional
   @Override
   public void add(User user) {
      userDao.add(user);
   }

   @Transactional
   @Override
   public void deleteUserById(int id) { userDao.deleteUserById(id); }

   @Transactional(readOnly = true)
   @Override
   public List<User> listUsers() {
      return userDao.listUsers();
   }

   @Transactional
   @Override
   public void updateUserById(User user, int id) { userDao.updateUserById(user, id); }

   @Transactional
   @Override
   public User getUserById(int id) { return userDao.getUserById(id); }

   @Transactional
   @Override
   public int clean() { return userDao.clean(); }

}
