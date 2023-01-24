package org.fi.restjpa.RestJPA.repository;

import org.fi.restjpa.RestJPA.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, String> {

}
