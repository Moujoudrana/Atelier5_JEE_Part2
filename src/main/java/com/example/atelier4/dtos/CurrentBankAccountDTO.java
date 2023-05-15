package com.example.atelier4.dtos;


import com.example.atelier4.enums.AccountStatus;
import lombok.Data;

import java.util.Date;

@Data


//@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS) //pour la strategie de table dheritage (chaque classe a une table separement)

//@Inheritance(strategy = InheritanceType.JOINED) //pour la strategie de table dheritage (chaque classe a une table qui ne contient que les attributs ajouter (daft/rate) + la table backaccount
        //dans les 2tables C et S il contiennent draft et rate + id du compte foreign key dans bankaccount

public class CurrentBankAccountDTO extends BankAccountDTO{
    private String id;
    private double balance;
    private Date createdAt;
    private AccountStatus status;
    private CustomerDTO customerDTO;
    private double overDraft;
}
