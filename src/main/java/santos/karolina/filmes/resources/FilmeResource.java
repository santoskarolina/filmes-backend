package santos.karolina.filmes.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
import santos.karolina.filmes.entities.Filme;
import santos.karolina.filmes.entities.dto.FilmeDTO;
import santos.karolina.filmes.entities.dto.FilmeNewDTO;
import santos.karolina.filmes.services.FilmeService;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/api/filmes")
public class FilmeResource {

    @Autowired
    private FilmeService filmeService;



    @GetMapping
    public ResponseEntity<List<FilmeDTO>> findAll(){
        List<Filme> filmeList = filmeService.findAll();
        List<FilmeDTO> filmeDTOList = filmeList.stream().map(x -> new FilmeDTO(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(filmeDTOList);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Filme> findById(@PathVariable Integer id){
        Filme filme = filmeService.findById(id);
        return ResponseEntity.ok().body(filme);
    }

    @PostMapping
    public ResponseEntity<Filme> create(@Valid  @RequestBody FilmeNewDTO filmeNewDTO){
        Filme filme = filmeService.fromDTO(filmeNewDTO);
        filme = filmeService.create(filme);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(filme.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }


    @DeleteMapping(value = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Integer id){
        filmeService.delete(id);
        return ResponseEntity.noContent().build();
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Filme> update(@PathVariable Integer id, @RequestBody FilmeNewDTO filmeNewDTO){
        Filme filme = filmeService.fromDTO(filmeNewDTO);
        filme = filmeService.update(id , filme);
        return ResponseEntity.noContent().build();
    }
}
