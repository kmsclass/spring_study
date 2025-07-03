package kr.gdu.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import kr.gdu.entity.BoardEntity;

public interface BoardRepository extends JpaRepository<BoardEntity,Integer>,
                    JpaSpecificationExecutor<BoardEntity>{
	
}