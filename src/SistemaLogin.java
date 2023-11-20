import java.util.ArrayList;
import java.util.Scanner;

public class SistemaLogin {
    private static ArrayList<Usuario> usuarios = new ArrayList<>();
    private static Usuario usuarioLogado = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Sistema de Login");
            if (usuarioLogado == null) {
                System.out.println("1- Registrar");
                System.out.println("2- Fazer Login");
                System.out.println("3- Sair");
            } else {
                System.out.println("4- Fazer Logout");
            }

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    registrarUsuario();
                    break;
                case 2:
                    if (usuarioLogado == null) {
                        fazerLogin();
                    } else {
                        System.out.println("Você já está logado como "+ usuarioLogado.getNome());
                    }
                    break;
                case 3:
                    System.out.println("Saindo do sistema");
                    System.exit(0);
                case 4:
                    fazerLogout();
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");

            }
        }
    }
    public static void registrarUsuario() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do usuário: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a senha: ");
        String senha = scanner.nextLine();

        Usuario novoUsuario = new Usuario(nome, senha);
        usuarios.add(novoUsuario);

        System.out.println("Usuário registrado com sucesso");
    }

    public static void fazerLogin() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do usuário: ");
        String nome = scanner.nextLine();

        System.out.println("Digite a senha: ");
        String senha = scanner.nextLine();

        for (Usuario usuario : usuarios) {
            if (usuario.getNome().equals(nome) && usuario.getSenha().equals(senha)) {
                usuarioLogado = usuario;
                System.out.println("Login bem-sucedido. Bem-vindo, "+ usuario.getNome() + "!");
                return;
            }
        }

        System.out.println("Nome de usuário ou senha incorretos. Tente novamente.");
    }

    public static void fazerLogout() {
        if (usuarioLogado != null) {
            System.out.println("Logout bem-sucedido. Adeus, " + usuarioLogado.getNome() + "!");
            usuarioLogado = null;
        } else {
            System.out.println("Voce não está logado");
        }
    }
 }

 class Usuario {
    private String nome;
    private String senha;

    public Usuario(String nome, String senha) {
        this.nome = nome;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getSenha() {
        return senha;
    }
        }