package ma.projet.grpc.repository;

import ma.projet.grpc.Entity.Compte;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompteRepository extends JpaRepository<Compte, Long> {
}