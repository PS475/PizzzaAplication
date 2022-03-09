package pl.piotrek.pizza.remote.rest.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.piotrek.pizza.remote.rest.dto.response.MenuDto;

@RequestMapping(value = "/api/v1/menu/", produces =  APPLICATION_JSON_VALUE)
@RestController
public class MenuControler {
    @GetMapping()
    public ResponseEntity<MenuDto> getMenu{
        return ResponseEntity.ok(null);
    }
}
