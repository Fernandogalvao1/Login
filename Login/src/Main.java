import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String userName = "admin";
        String password = "miojo";

        System.out.println("Insira o nome do usuário: ");
        String inputUserName = scanner.nextLine();

        System.out.println("Insira a senha: ");
        String inputUserPassword = scanner.nextLine();

        if (inputUserName.equals(userName) && inputUserPassword.equals(password)) {
            System.out.println("Login realizado com sucesso!");
        } else {
            System.out.println("Usuário e/ou senha inválido(s)!");
        }
    }
}