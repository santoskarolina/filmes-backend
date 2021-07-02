package santos.karolina.filmes.entities.dto;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.io.Serializable;

public class FilmeNewDTO implements Serializable {

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
    private Integer categoria;
    private Integer classificacao;

    public FilmeNewDTO(){}

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

    public Integer getCategoria() {
        return categoria;
    }

    public void setCategoria(Integer categoria) {
        this.categoria = categoria;
    }

    public Integer getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(Integer classificacao) {
        this.classificacao = classificacao;
    }
}
