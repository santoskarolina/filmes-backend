package santos.karolina.filmes.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import santos.karolina.filmes.entities.Filme;

import java.util.List;

@Repository
public interface FilmeRepository extends JpaRepository<Filme, Integer> {

    @Transactional(readOnly = true)
    @Query("SELECT obj FROM Filme obj WHERE obj.categoria.id = :categoriaId ORDER BY obj.titulo")
    public List<Filme> findFilmeByCategoria(@Param("categoriaId") Integer categoriaId);
}


