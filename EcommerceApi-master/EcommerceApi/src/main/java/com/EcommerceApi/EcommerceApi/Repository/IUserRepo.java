package com.EcommerceApi.EcommerceApi.Repository;

import com.EcommerceApi.EcommerceApi.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepo extends JpaRepository<User,Long> {
}
