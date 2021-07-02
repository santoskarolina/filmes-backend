package santos.karolina.filmes.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import santos.karolina.filmes.entities.Categoria;
import santos.karolina.filmes.entities.Filme;
import santos.karolina.filmes.services.CategoriaService;
import santos.karolina.filmes.services.FilmeService;

import java.util.List;

@RestController
@RequestMapping(value = "/api/categorias")
public class CategoriaResource {

    @Autowired
    private CategoriaService categoriaService;

    @Autowired
    private FilmeService filmeService;

    @GetMapping
    public ResponseEntity<List<Categoria>> findAll(){
        List<Categoria> categoriaList = categoriaService.findAll();
        return ResponseEntity.ok().body(categoriaList);
    }

    @GetMapping(value = "/{categoriaId}/filmes")
    public ResponseEntity<List<Filme>> findAllFilmes(@PathVariable Integer categoriaId){
        List<Filme> filmeList = filmeService.findByCategoria(categoriaId);
        return ResponseEntity.ok().body(filmeList);
    }
}
