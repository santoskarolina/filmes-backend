package santos.karolina.filmes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import santos.karolina.filmes.entities.Categoria;
import santos.karolina.filmes.repositories.CategoriaRepository;

import java.util.Collections;
import java.util.List;

@Service
public class CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> findAll(){
        List<Categoria> list = categoriaRepository.findAll();
        Collections.sort(list);
        return list;
    }
}
