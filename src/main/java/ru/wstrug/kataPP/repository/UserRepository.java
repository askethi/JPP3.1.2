package ru.wstrug.kataPP.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.wstrug.kataPP.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
