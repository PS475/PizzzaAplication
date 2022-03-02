package pl.piotrek.pizza.data.entity.order;


import org.hibernate.mapping.Set;
import pl.piotrek.pizza.data.entity.ordersize.OrderSizeEntity;

import javax.persistence.*;

@Entity
@Table(name = "orders")
public class OrderEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "client_name")
    private  String client_name;

    @Column(name = "client_address")
    private  BigDecimal client_address;

    @Column(name = "floor")
    private Integer floor;

    @Column(name = "status")
    private Integer status;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "created_at")
    private Date createdat;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "u[dated_at")
    private Date updatedat;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "expacted_at")
    private Date expected_at;

    @Column(name = "token")
    private String token;
    @OneToMany(mappedBy = "order")
    private Set<OrderSizeEntity> orderSizes;
}
