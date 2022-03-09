package pl.piotrek.pizza.remote.rest.api;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.piotrek.pizza.remote.rest.dto.request.AddPizzaDto;
import pl.piotrek.pizza.remote.rest.dto.response.PizzaDto;

@RequestMapping(value = "/api/v1/pizza/", produces = APPLICATION_JSON_VALUE)
@RestController
public class PizzaControler {

    private final PizzaService pizzaService
    @PostMapping
    public ResponseEntity<PizzaDto> addPizza(@RequestBody AddPizzaDto addPizzaDto){
        return ResponseEntity.ok(null);
    }

    @GetMapping
    public ResponseEntity<PizzaDto> getPizza(@RequestBody("pizza-id")PizzaDto pizzaDto){
        return ResponseEntity.ok(null);
    }
    @DeleteMapping
    public ResponseEntity<PizzaDto> deletePizza(@PathVariable("pizza-id") Integer orderId){
        return ResponseEntity.ok(null);
    }
}
