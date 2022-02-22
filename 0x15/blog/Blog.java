import java.util.*;

public class Blog {

    private List<Post> posts = new ArrayList<>();

    public void adicionarPostagem(Post post) {
        posts.add(post);
    }

    public TreeSet<String> obterTodosAutores() {
        TreeSet<String> autores = new TreeSet<String>();
        for (Post post : posts) {
            autores.add(post.getAutor());

        }
        return autores;
    }

    public Map<String, Integer> obterContagemPorCategoria(){
        TreeMap<String, Integer> obterContagemPorCategoria = new TreeMap<String, Integer>();

        for(Post post : posts) {

            String categoria = post.getCategoria();
            if(obterContagemPorCategoria.containsKey(categoria)) {
                Integer contagem = obterContagemPorCategoria.get(categoria);
                contagem ++;
                obterContagemPorCategoria.put(categoria, contagem);

            }else {
                obterContagemPorCategoria.put(categoria, 1);			}

        }

        return obterContagemPorCategoria;
    }
}
