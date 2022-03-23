package pl.piotrek.pizza.domain.service;


import org.springframework.stereotype.Service;
import pl.piotrek.pizza.data.entity.pizza.PizzaEntity;
import pl.piotrek.pizza.data.repository.PizzaRepository;
import pl.piotrek.pizza.domain.exception.UnauthorizedException;
import pl.piotrek.pizza.domain.mapper.PizzaMapper;
import pl.piotrek.pizza.remote.rest.dto.request.AddPizzaDto;
import pl.piotrek.pizza.remote.rest.dto.response.PizzaDto;

@Service
public class PizzaService {

    private final PizzaRepository pizzaRepository;
    private final PizzaMapper pizzaMapper;

    public PizzaService(PizzaRepository pizzaRepository, PizzaMapper pizzaMapper) {
        this.pizzaRepository = pizzaRepository;
        this.pizzaMapper = pizzaMapper;
    }

    public PizzaDto addPizza(AddPizzaDto addPizzaDto, String token){
        AuthorizationService.checkToken(token);
        if(token == null || !token.equals("xyz")){
            throw new UnauthorizedException("Bledny token");
        }

        pizzaRepository.save(pizzaMapper.mapToPizzaEntity(addPizzaDto));


    }
}
