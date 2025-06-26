package kr.gdu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.gdu.domain.Sale;

public interface SaleRepository extends JpaRepository<Sale, Integer>{

}
