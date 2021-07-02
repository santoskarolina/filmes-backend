package santos.karolina.filmes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import santos.karolina.filmes.entities.Classificacao;
import santos.karolina.filmes.repositories.ClassificacaoRepository;

import java.util.List;

@Service
public class ClassificacaoService {

    @Autowired
    private ClassificacaoRepository repository;

    public List<Classificacao> findAll(){
        return  repository.findAll();
    }
}
