package com.hongao.ac.ums.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hongao.ac.ums.model.User;

/**
 * User DAO
 * @author iTeller_zc
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
