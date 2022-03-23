package pl.piotrek.pizza.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.piotrek.pizza.data.entity.pizza.PizzaEntity;

public interface PizzaRepository extends JpaRepository<PizzaEntity, Integer> {

}
