package ru.wstrug.kataPP.dao;

import ru.wstrug.kataPP.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   void deleteUserById(Long id);
   void updateUserById(User user, Long id);
   List<User> listUsers();
   User getUserById(Long id);
   int clean();
}
