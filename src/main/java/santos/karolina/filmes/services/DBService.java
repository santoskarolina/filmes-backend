package santos.karolina.filmes.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import santos.karolina.filmes.entities.Categoria;
import santos.karolina.filmes.entities.Classificacao;
import santos.karolina.filmes.entities.Filme;
import santos.karolina.filmes.repositories.CategoriaRepository;
import santos.karolina.filmes.repositories.ClassificacaoRepository;
import santos.karolina.filmes.repositories.FilmeRepository;

import java.text.ParseException;
import java.util.Arrays;

@Service
public class DBService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Autowired
    private FilmeRepository filmeRepository;

    @Autowired
    private ClassificacaoRepository classificacaoRepository;

    public void criarbanco() throws ParseException {

        Categoria categoria1 = new Categoria(null, "Ação");
        Categoria categoria2 = new Categoria(null, "Terror");
        Categoria categoria3 = new Categoria(null, "Comedia");
        Categoria categoria4 = new Categoria(null, "Romance");
        Categoria categoria5 = new Categoria(null, "Anime");
        Categoria categoria6 = new Categoria(null, "Animação");
        Categoria categoria7 = new Categoria(null, "Musical");
        Categoria categoria8 = new Categoria(null, "Documentário");
        Categoria categoria9 = new Categoria(null, "Drama");
        Categoria categoria10 = new Categoria(null, "Ficção cientifica");
        Categoria categoria11 = new Categoria(null, "Suspense");
        categoriaRepository.saveAll(Arrays.asList(categoria1,categoria2,categoria3,categoria4,categoria5,categoria6,
                categoria7,categoria8,categoria9,categoria10,categoria11));

        Classificacao classificacao1 = new Classificacao(null, "Livre");
        Classificacao classificacao2 = new Classificacao(null, "10 anos");
        Classificacao classificacao3 = new Classificacao(null, "12 anos");
        Classificacao classificacao4 = new Classificacao(null, "16 anos");
        Classificacao classificacao5 = new Classificacao(null, "18 anos");
        classificacaoRepository.saveAll(Arrays.asList(classificacao1,classificacao2,classificacao3
        ,classificacao4, classificacao5));

        Filme filme1 = new Filme(null, "Viuva negra",
                "https://lumiere-a.akamaihd.net/v1/images/image_a2514f6d.jpeg?region=0,0,540,810",
                2021, "Natsha conta sua historia até virar a viuva negra",
                10.00, "https://www.imdb.com/title/tt3480822/?ref_=nv_sr_srsg_3", categoria1, classificacao3);
        Filme filme2 = new Filme(null, "Os Vingadores",
                "https://br.web.img2.acsta.net/medias/nmedia/18/89/43/82/20052140.jpg",
                2019, "Loki, o irmão de Thor, ganha acesso ao poder ilimitado do cubo " +
                "cósmico ao roubá-lo de dentro das instalações da S.H.I.E.L.D. ",
                10.00, "https://www.imdb.com/title/tt0848228/?ref_=nv_sr_srsg_0", categoria1, classificacao3);
        Filme filme3 = new Filme(null, "Aladdin",
                "https://lumiere-a.akamaihd.net/v1/images/image_9e35a739.jpeg?region=0%2C0%2C540%2C810",
                2019, "Um jovem humilde descobre uma lâmpada mágica, com um gênio que pode lhe conceder desejos. Agora o rapaz quer conquistar" +
                " a moça por quem se apaixonou, mas o que ele não sabe é que a jovem é uma princesa que está prestes a se noivar. ",
                10.00, "https://www.imdb.com/title/tt6139732/?ref_=nv_sr_srsg_0", categoria7,
                classificacao2);
        Filme filme4 = new Filme(null, "Escola de Rock",
                "https://br.web.img3.acsta.net/medias/nmedia/18/91/90/98/20169244.jpg",
                2003, "Depois que o guitarrista Dewey é expulso de sua banda, " +
                "ele se faz passar por professor de música em uma escola particular.",
                10.00, "https://www.imdb.com/title/tt0332379/?ref_=nv_sr_srsg_33", categoria7, classificacao1);
        Filme filme5 = new Filme(null, "Vida de inseto",
                "https://br.web.img3.acsta.net/medias/nmedia/18/92/03/69/20176403.jpg",
                1998, "Flik é uma formiga cheia de ideias e sempre causa problemas na sua colônia. " +
                "Seu último acidente foi destruir os alimentos que seriam usados para pagamento ao gafanhoto Hopper.",
                10.00, "https://www.imdb.com/title/tt0120623/?ref_=fn_al_tt_1", categoria6, classificacao1);
        Filme filme6 = new Filme(null, "Cruella",
                "https://www.alagoas24horas.com.br/wp-content/uploads/2021/05/cruella.jpg",
                2021, "Inteligente, criativa e determinada, Estella quer fazer um nome para si " +
                "através de seus designs e acaba chamando a atenção da Baronesa Von Hellman",
                10.00, "https://www.imdb.com/title/tt3228774/?ref_=hm_fanfav_tt_i_4_pd_fp1", categoria6,classificacao2);
        Filme filme7 = new Filme(null, "Luca",
                "https://cdn.ome.lt/mTE1KKHcu69yrrHeOkaeNbV-ZC8=/fit-in/1070x750/smart/" +
                        "filer_public/48/fa/48fa45cf-bbca-46cc-9cc1-7e8af3df34ef/e246crnvkaabq-7.jpg",
                2021, "Luca vive aventuras com seu novo melhor amigo, mas a diversão é ameaçada por um segredo: " +
                "seu amigo é um monstro marinho de outro mundo que fica abaixo da superfície da água.", 8.0 ,
                "https://www.imdb.com/title/tt12801262/?ref_=nv_sr_srsg_0", categoria1, classificacao1);
        Filme filme8 = new Filme(null, "Eu nunca",
                "https://br.web.img3.acsta.net/pictures/20/04/17/09/39/5755257.jpg",
                2020, "Devi é uma adolescente que não é muito popular, mas ela e suas amigas estão decididas a mudar isso.",
                9.0, "https://www.imdb.com/title/tt10062292/?ref_=nv_sr_srsg_0",
                categoria3, classificacao2);
        filmeRepository.saveAll(Arrays.asList(filme1,filme2,filme3,filme4,filme5,filme6,filme7,filme8));

        categoria1.getFilmes().addAll(Arrays.asList(filme1,filme2,filme3,filme4,filme7));
        categoria3.getFilmes().add(filme8);
        categoria6.getFilmes().addAll(Arrays.asList(filme5, filme6));
        categoria7.getFilmes().addAll(Arrays.asList(filme3,filme4));
        categoriaRepository.saveAll(Arrays.asList(categoria1,categoria6,categoria7,categoria3));

        classificacao1.getFilmes().addAll(Arrays.asList(filme4,filme5,filme7));
        classificacao2.getFilmes().addAll(Arrays.asList(filme3,filme6,filme8));
        classificacao3.getFilmes().addAll(Arrays.asList(filme1,filme2));
        classificacaoRepository.saveAll(Arrays.asList(classificacao1,classificacao2,classificacao3));
    }
}
