package com.cos.photogramstart.domain.user;

import org.springframework.data.jpa.repository.JpaRepository;


//어노테이션 없어도 IOC 등록이 자동으로 된다
public interface UserRepository extends JpaRepository<User, Integer>{

	
	//jpa method names query creation
	User findByUsername(String username);

}
