package com.example.demo.JPA;

import com.example.demo.Models.BankBranch;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface Repo extends CrudRepository<BankBranch,String> {
    List<BankBranch> findByIfsc(String ifsc);
    List<BankBranch> findByCityAndBankName(String city,String bank_name);
}
