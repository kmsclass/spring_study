package kr.gdu.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import kr.gdu.domain.SaleItem;
import kr.gdu.domain.SaleItemId;

public interface SaleItemRepository 
                 extends JpaRepository<SaleItem, SaleItemId>{

}
