package org.java.app.repo;

import org.java.app.pojo.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzaRepo  extends JpaRepository<Pizza, Integer>{

}
