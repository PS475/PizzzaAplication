package pl.piotrek.pizza.domain.mapper;

import org.springframework.stereotype.Component;
import pl.piotrek.pizza.data.entity.pizza.PizzaEntity;
import pl.piotrek.pizza.remote.rest.dto.request.AddPizzaDto;

@Component
public class PizzaMapper {
    public PizzaEntity mapToPizzaEntity(AddPizzaDto addPizzaDto){
        PizzaEntity pizzaEntity = new PizzaEntity();
        pizzaEntity.setName(addPizzaDto.getName());
        return pizzaEntity;
    }
}
