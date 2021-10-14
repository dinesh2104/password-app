package com.example.demo.Service;

import java.util.List;
import java.util.Map;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.example.demo.Model.PasswordDetails;

public interface Repository extends CrudRepository<PasswordDetails, Long> {
	@Query(value = "select url,password from password_table where customerid=:id", nativeQuery = true)
	List<Map<String, String>> findAllBycustomerid(@Param("id") long customerid);

	@Query(value = "select * from password_table where url=:url", nativeQuery = true)
	PasswordDetails findByUrl(@Param("url") String url);

	PasswordDetails findById(long id);
}
