package kr.ac.kopo.hhs._026exam.repository;

import kr.ac.kopo.hhs._026exam.domain.Player;
import kr.ac.kopo.hhs._026exam.domain.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer> {
}
