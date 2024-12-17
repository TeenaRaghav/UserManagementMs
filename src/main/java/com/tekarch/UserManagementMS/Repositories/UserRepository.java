package com.tekarch.UserManagementMS.Repositories;

import com.tekarch.UserManagementMS.Models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
