package com.nt.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nt.moder.Contract;
import com.nt.moder.Vendor;

public interface ContractRepository extends JpaRepository<Contract,Integer>{

}
