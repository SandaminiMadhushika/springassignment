package com.example.mySecond;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Collection;

@Repository
public interface Systemrepository extends CrudRepository <Employee,Long>{

}
