package com.example.bookoreilly.service;
import com.example.bookoreilly.entity.Z1;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MyDBJpa extends CommonRepository<Z1 , Integer> {
    @Query(" from Z1 t where t.id=:id ")
    Z1 findAOnlyDataID(@Param("id") Integer id);

    @Query(" from Z1 t ")
    List<Z1> findAllData();

    @Query(" delete from Z1  where id=:id")
    void deleteOneByName(@Param("id") int id);
}
