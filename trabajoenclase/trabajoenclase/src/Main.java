import java.util.*;
import java.util.stream.Collectors;

public class Main
{
    public static void main(String[] args)
    {
        List<Pelicula> peliculas = new ArrayList<>();
        peliculas.add(new Pelicula("E.T.", "Steven Spielberg", 1982));
        peliculas.add(new Pelicula("Avatar", "James Cameron", 2009));
        peliculas.add(new Pelicula("Salvar al soldado Ryan", "Steven Spielberg", 1998));
        peliculas.add(new Pelicula("Origen", "Christopher Nolan", 2010));
        peliculas.add(new Pelicula("L.A. Confidential", "Curtis Hanson", 1997));




        List<Pelicula> peliculasSigloXXI = peliculas.stream()
                .filter(p -> p.getEstreno() >= 2000)
                .collect(Collectors.toList());

        System.out.println("Películas del siglo XXI:");
        peliculasSigloXXI.forEach(System.out::println);



        String titulosSpielberg = peliculas.stream()
                .filter(p -> "Steven Spielberg".equals(p.getDirector()))
                .map(Pelicula::getTitulo)
                .collect(Collectors.joining(", "));

        System.out.println("Títulos de películas de Steven Spielberg: " + titulosSpielberg);


        List<String> titulosOrdenados = peliculas.stream()
                .map(Pelicula::getTitulo)
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Títulos ordenados alfabéticamente:");
        titulosOrdenados.forEach(System.out::println);

      
    }
}
