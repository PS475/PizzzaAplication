package pl.piotrek.pizza.remote.rest.api;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.piotrek.pizza.domain.service.PizzaService;
import pl.piotrek.pizza.remote.rest.dto.request.AddPizzaDto;
import pl.piotrek.pizza.remote.rest.dto.request.UpdatePizzaDto;
import pl.piotrek.pizza.remote.rest.dto.response.PizzaDto;

import javax.persistence.Access;

@RequestMapping(value = "/api/v1/pizza/", produces = APPLICATION_JSON_VALUE)
@RestController
public class PizzaControler {

    private final PizzaService pizzaService;

    public PizzaControler(PizzaService pizzaService) {
        this.pizzaService = pizzaService;
    }

    @PostMapping
    public ResponseEntity<PizzaDto> addPizza(@RequestBody AddPizzaDto addPizzaDto,
                                             @RequestHeader("Access-Token") String token){
        PizzaDto pizzaDto = pizzaService.addPizza(addPizzaDto, token);
        return ResponseEntity.ok(null);
    }

    @GetMapping
    public ResponseEntity<PizzaDto> updatePizza(@RequestBody UpdatePizzaDto updatePizzaDto,
                                                @RequestHeader("Access-Token") String token,
                                                @PathVariable("id") Integer pizzaId){

        return ResponseEntity.ok(null);
    }
    @DeleteMapping
    public ResponseEntity<PizzaDto> deletePizza(@PathVariable("id") Integer pizzaId,
                                                @RequestHeader("Access-Token") String token){
        return ResponseEntity.ok(null);
    }
}
