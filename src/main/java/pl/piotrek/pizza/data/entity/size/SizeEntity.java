package pl.piotrek.pizza.data.entity.size;


import pl.piotrek.pizza.data.entity.ordersize.OrderSizeEntity;
import pl.piotrek.pizza.data.entity.pizza.PizzaEntity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "sizes")
public class SizeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "size_type")
    private  String size_type;

    @Column(name = "price_base")
    private BigDecimal priceBase;

    @Column(name = "pizza_id")
    private Integer pizzaId;

    @OneToMany(mappedBy = "size")
    private Set<OrderSizeEntity> orderSizes;

    @OneToMany
    @JoinColumn(name = "pizza_id", insertable = false, updatable = false)
    private PizzaEntity pizza;
}
