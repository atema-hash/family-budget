package com.github.atema_hash.family_budget.repository;

import com.github.atema_hash.family_budget.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long>{
}
