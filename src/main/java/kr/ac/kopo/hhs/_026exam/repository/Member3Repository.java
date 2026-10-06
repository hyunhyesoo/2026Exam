package kr.ac.kopo.hhs._026exam.repository;

import kr.ac.kopo.hhs._026exam.domain.Member3;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Member3Repository extends JpaRepository<Member3, Integer> {
}
