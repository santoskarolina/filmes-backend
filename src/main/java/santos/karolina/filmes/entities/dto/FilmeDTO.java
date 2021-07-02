package santos.karolina.filmes.entities.dto;

import santos.karolina.filmes.entities.Filme;

import java.io.Serializable;

public class FilmeDTO implements Serializable {

    private Integer id;
    private String titulo;
    private String linkFoto;
    private Integer dataLancamento;
    private String categoria;

    public FilmeDTO(){}

    public FilmeDTO(Filme filme) {
        id = filme.getId();
        titulo = filme.getTitulo();
        linkFoto = filme.getLinkFoto();
        dataLancamento = filme.getDataLancamento();
        categoria = filme.getCategoria().getNome();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getLinkFoto() {
        return linkFoto;
    }

    public void setLinkFoto(String linkFoto) {
        this.linkFoto = linkFoto;
    }

    public Integer getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Integer dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
