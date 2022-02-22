import java.lang.reflect.Array;
import java.util.*;

public class Blog {
    private ArrayList<Post> posts = new ArrayList<>();

    public void adicionarPostagem(Post post) {
        for (Post postagem: posts) {
            if(postagem.getAutor().compareTo(post.getAutor()) == 0
                    && postagem.getTitulo().compareTo(post.getTitulo()) == 0) {
                throw new IllegalArgumentException("Postagem jah existente");
            }
        }
        posts.add(post);
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> autores = new TreeSet<>();
        for (Post post : posts) {
            autores.add(post.getAutor());
        }
        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> obterContagemPorCategoria = new TreeMap<>();


        for (Post post : posts) {

            Categorias categoria = post.getCategoria();
            Integer contadorCategoria = obterContagemPorCategoria.get(categoria);
            if (contadorCategoria == null) {
                obterContagemPorCategoria.put(categoria, 1);
            } else {
                contadorCategoria++;

                obterContagemPorCategoria.replace(categoria, contadorCategoria);
            }
        }
        return obterContagemPorCategoria;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> postPorAutor = new TreeSet<>();
        for (Post postagem: posts) {
            if(postagem.getAutor().compareTo(autor) == 0) {
                postPorAutor.add(postagem);
            }
        }
        return postPorAutor;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categorias) {
        TreeSet<Post> post = new TreeSet<>();
        for (Post postagem: posts) {
            if (postagem.getCategoria().compareTo(categorias) == 0) {
                post.add(postagem);
            }
        }
        return post;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> categoriasSetMap = new TreeMap<>();
        Set<Post> postSet = new TreeSet<>();
        for (Post post: posts) {
            postSet = new TreeSet<>();
            Categorias categoria = post.getCategoria();
            Set<Post> posts = categoriasSetMap.get(categoria);
            if (posts == null){
                postSet.add(post);
                categoriasSetMap.put(categoria, postSet);
            } else if (!postExiste(post, posts)) {
                posts.add(post);
                categoriasSetMap.replace(categoria, postSet);
            }
        }

        return categoriasSetMap;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> autorSetMap = new TreeMap<>();
        Set<Post> postSet = new TreeSet<>();
        for (Post post: posts) {
            postSet = new TreeSet<>();
            Autor autor = post.getAutor();
            Set<Post> posts = autorSetMap.get(autor);
            if (posts == null) {
                postSet.add(post);
                autorSetMap.put(autor, postSet);
            } else if (!postExiste(post, posts)) {
                posts.add(post);
                autorSetMap.replace(autor, posts);
            }
        }
        return autorSetMap;
    }

    private boolean postExiste(Post post, Set<Post> posts){
        for (Post postagem: posts) {
            if (post.getAutor().compareTo(postagem.getAutor()) == 0
                    && post.getTitulo().compareTo(postagem.getTitulo()) == 0) {
                return true;
            }
        }
        return false;
    }
}
