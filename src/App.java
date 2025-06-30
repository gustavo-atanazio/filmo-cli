import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import models.CatalogItem;
import models.Movie;

public class App {
  public static void main(String[] args) throws Exception {
    boolean running = true;
    String options = """
    1. Cadastrar novo filme
    2. Ver filmes cadastrados
    3. Sair
    """;
    Scanner scanner = new Scanner(System.in);
    List<CatalogItem> catalog = new ArrayList<>();

    System.out.println("Bem-vindo ao Filmo!");

    while (running) {
      System.out.println("Escolha uma das opções:");
      System.out.println(options);

      String choose = scanner.nextLine();

      switch (choose) {
        case "1":
          System.out.println("Digite o nome do filme:");
          String name = scanner.nextLine();

          System.out.println("Digite o ano de lançamento:");
          String releaseYearInput = scanner.nextLine();
          short releaseYear = Short.parseShort(releaseYearInput);

          Movie movie = new Movie(name, releaseYear);
          catalog.add(movie);


          System.out.println("Filme cadastrado com sucesso!");
          break;

        case "2":
          for (int i = 0; i < catalog.size(); i++) {
            System.out.println(i + 1 + ". " + catalog.get(i).toString());
          }

          break;

        case "3":
          running = false;
          break;
      
        default:
          continue;
      }
    }

    scanner.close();
  }
}