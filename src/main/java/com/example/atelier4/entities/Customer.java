package com.example.atelier4.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;

    @OneToMany(mappedBy = "customer") //comme si je suis en train de dire dans la classe bankaccount ya un attribut qui sappelle customer
                    //qui utilise une relation manytoone et il sagit de la meme relation
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY) //pour ne pas acceder au compte lorsquon veut afficher un customer(si on le fait pas on recervera beaucoup de donnee)
    private List<BankAccount> bankAccounts;
}
