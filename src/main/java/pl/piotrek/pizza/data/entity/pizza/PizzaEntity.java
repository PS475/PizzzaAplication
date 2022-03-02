package pl.piotrek.pizza.data.entity.pizza;


import javax.persistence.*;

@Entity
@Table(name = "pizzas")
public class PizzaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @Column(name = "name")
    private  String name;

    //jedna pizza ma wiele rozmiarów
    @OneToMany(mappedBy = "pizza", orhanRemoval = true)
    private Set<SizeEntity> sizes;

}
