package ru.wstrug.kataPP.dao;

import ru.wstrug.kataPP.model.User;

import java.util.List;

public interface UserDao {
   void add(User user);
   void deleteUserById(int id);
   void updateUserById(User user, int id);
   List<User> listUsers();
   User getUserById(int id);
   int clean();
}
