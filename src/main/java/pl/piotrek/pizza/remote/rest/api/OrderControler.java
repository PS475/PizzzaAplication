package pl.piotrek.pizza.remote.rest.api;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.piotrek.pizza.domain.model.OrderStatusType;
import pl.piotrek.pizza.remote.rest.dto.request.AddOrderDto;
import pl.piotrek.pizza.remote.rest.dto.request.UpdateOrderDto;
import pl.piotrek.pizza.remote.rest.dto.response.OrderCollectionDto;
import pl.piotrek.pizza.remote.rest.dto.response.OrderDto;
import pl.piotrek.pizza.remote.rest.dto.response.OrdersStatusDto;
import pl.piotrek.pizza.remote.rest.dto.response.TokenDto;

@RequestMapping(value = "/api/v1/orders/", produces = APPLICATION_JSON_VALUE)
@RestController
public class OrderControler {


    @PostMapping
    public ResponseEntity<TokenDto> addOrder(@RequestBody AddOrderDto addOrderDto){
        return ResponseEntity.ok(null);
    }
    @GetMapping("/status/{token}")
    public ResponseEntity<OrdersStatusDto> getStatus(@PathVariable("token")String token){
        return ResponseEntity.ok(null);

    }
    @GetMapping
    public ResponseEntity<OrderCollectionDto> getOrders(@RequestParam("status")OrderStatusType orderStatusType,
                                                        @RequestHeader("Access-Token")String token){

        return ResponseEntity.ok(null);
    }
    @DeleteMapping("/{order-id}")
    public ResponseEntity<Void> deleteOrder(@PathVariable("order-id") Integer orderId,
                                            @RequestHeader("Access-Token") String token){
        return ResponseEntity.ok(null);
    }
    @PutMapping("/{order-id}")
    public ResponseEntity<OrderDto> upgradeOrder(@RequestHeader("Access-Token")String token,
                                                 @PathVariable("order-id") Integer orderId,
                                                 @RequestBody UpdateOrderDto updateOrderDto){
        return ResponseEntity.ok(null);
    }

}
