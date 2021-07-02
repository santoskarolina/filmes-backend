package santos.karolina.filmes.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import santos.karolina.filmes.entities.Classificacao;
import santos.karolina.filmes.services.ClassificacaoService;

import java.util.List;

@RestController
@RequestMapping(value = "/api/classificacoes")
public class ClasssificacaoResource {

    @Autowired
    private ClassificacaoService classificacaoService;

    @GetMapping
    public ResponseEntity<List<Classificacao>> findAll(){
        List<Classificacao> classificacaoList = classificacaoService.findAll();
        return ResponseEntity.ok().body(classificacaoList);
    }
}
