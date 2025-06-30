import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    boolean running = true;
    String options = """
    1. Cadastrar novo filme
    2. Ver filmes cadastrados
    3. Sair
    """;
    Scanner scanner = new Scanner(System.in);

    System.out.println("Bem-vindo ao Filmo!");

    while (running) {
      System.out.println("Escolha uma das opções:");
      System.out.println(options);

      String choose = scanner.nextLine();

      switch (choose) {
        case "1":
          break;

        case "2":
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