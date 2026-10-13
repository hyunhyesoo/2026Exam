package kr.ac.kopo.hhs._026exam.repository;

import kr.ac.kopo.hhs._026exam.domain.Product2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Product2Repository extends JpaRepository<Product2, Integer> {
}
