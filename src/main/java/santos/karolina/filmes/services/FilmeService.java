package santos.karolina.filmes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import santos.karolina.filmes.entities.Categoria;
import santos.karolina.filmes.entities.Classificacao;
import santos.karolina.filmes.entities.Filme;
import santos.karolina.filmes.entities.dto.FilmeNewDTO;
import santos.karolina.filmes.repositories.FilmeRepository;
import santos.karolina.filmes.services.exceptions.DataBaseException;
import santos.karolina.filmes.services.exceptions.ObjectNotFound;

import java.util.List;
import java.util.Optional;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository filmeRepository;

    public List<Filme> findAll(){
        return filmeRepository.findAll();
    }

    public Filme findById(Integer id){
        Optional<Filme> filme = filmeRepository.findById(id);
        return filme.orElseThrow(() -> new ObjectNotFound("Filme não encontrado"));
    }

    public List<Filme> findByCategoria(Integer categoriaId){
        return filmeRepository.findFilmeByCategoria(categoriaId);
    }

    public Filme create(Filme filme){
        return filmeRepository.save(filme);
    }

    public Filme fromDTO(FilmeNewDTO filmeNewDTO){
        Classificacao classificacao = new Classificacao(filmeNewDTO.getClassificacao(), null);
        Categoria categoria = new Categoria(filmeNewDTO.getCategoria(), null);
        Filme filme = new Filme(null,filmeNewDTO.getTitulo() ,filmeNewDTO.getLinkFoto(), filmeNewDTO.getDataLancamento(), filmeNewDTO.getDescricao(),
                filmeNewDTO.getNota(),filmeNewDTO.getLinkIMDB(), categoria, classificacao);

       categoria.getFilmes().add(filme);
       classificacao.getFilmes().add(filme);
       return filme;
    }

    public void delete(Integer id){
        try{
            filmeRepository.deleteById(id);
        }catch (Exception exception){
            throw new DataBaseException("Filme não pode ser excluído");
        }
    }

    public Filme update(Integer id, Filme obj){
        Filme oldFilme = filmeRepository.getById(id);
        updateDate(oldFilme, obj);
        return filmeRepository.save(oldFilme);
    }

    public Filme updateDate(Filme oldFilme, Filme newFilme){
        oldFilme.setTitulo(newFilme.getTitulo());
        oldFilme.setLinkFoto(newFilme.getLinkFoto());
        oldFilme.setDescricao(newFilme.getDescricao());
        oldFilme.setNota(newFilme.getNota());
        oldFilme.setLinkIMDB(newFilme.getLinkIMDB());
        return oldFilme;
    }
}
