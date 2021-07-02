package santos.karolina.filmes.entities;


import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Entity
public class Filme implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotEmpty(message = "Titulo é obrigatório")
    private String titulo;

    @NotEmpty(message = "Link da foto é obrigatório")
    private String linkFoto;

    @Min(value = 1000, message = "Ano não pode ser menor que 1000")
    @Max(value = 2050, message = "Ano não pode ser maior que 2050")
    private Integer dataLancamento;

    @NotEmpty(message = "Descrição é obrigatório")
    @Size(min = 10, max = 250, message = "Descrição deve ter entre 10 e 250 caracteres")
    private String descricao;
    private Double nota;

    @NotEmpty(message = "Link do ImDb é obrigatório")
    private String linkIMDB;

    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Categoria categoria;

    @ManyToOne
    @JoinColumn(name = "classificacao_id")
    private Classificacao classificacao;


    public Filme(){}

    public Filme(Integer id, String titulo,String linkFoto, Integer dataLancamento, String descricao, Double nota,
                 String linkIMDB, Categoria categoria, Classificacao classificacao) {
        this.id = id;
        this.titulo = titulo;
        this.linkFoto = linkFoto;
        this.dataLancamento = dataLancamento;
        this.descricao = descricao;
        this.nota = nota;
        this.linkIMDB = linkIMDB;
        this.categoria = categoria;
        this.classificacao = classificacao;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getNota() {
        return nota;
    }

    public void setNota(Double nota) {
        this.nota = nota;
    }

    public String getLinkIMDB() {
        return linkIMDB;
    }

    public void setLinkIMDB(String linkIMDB) {
        this.linkIMDB = linkIMDB;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Classificacao getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Classificacao classificacao) {
        this.classificacao = classificacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Filme)) return false;
        Filme filme = (Filme) o;
        return getId().equals(filme.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
