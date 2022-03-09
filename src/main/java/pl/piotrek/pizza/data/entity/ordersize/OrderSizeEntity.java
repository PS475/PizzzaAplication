package pl.piotrek.pizza.data.entity.ordersize;


import pl.piotrek.pizza.data.entity.order.OrderEntity;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class OrderSizeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "order_id")
    private  Integer orderId;

    @Column(name = "size_id")
    private Integer sizeId;

    @Column(name = "sizeCount")
    private Integer sizeCount;

    @ManyToOne
    @JoinColumn(name = "order_id", insertable = false, updatable = false )
    private OrderEntity order;

    @ManyToOne
    @JoinColumn(name = "size_id", insertable = false, updatable = false)
    private OrderEntity size;


}
