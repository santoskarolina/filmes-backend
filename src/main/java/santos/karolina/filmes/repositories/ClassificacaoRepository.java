package santos.karolina.filmes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import santos.karolina.filmes.entities.Classificacao;

@Repository
public interface ClassificacaoRepository extends JpaRepository<Classificacao, Integer> {
}
