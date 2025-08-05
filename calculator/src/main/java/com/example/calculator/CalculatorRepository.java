package com.example.calculator;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CalculatorRepository extends JpaRepository<Calculator, Long> {

}
