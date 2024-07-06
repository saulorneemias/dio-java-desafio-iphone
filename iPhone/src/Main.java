import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        iPhone meuIphone = new iPhone();
        Scanner scanner = new Scanner(System.in);
        String input;

        // Reprodutor Musical
        System.out.println("Digite o nome da música para selecionar:");
        input = scanner.nextLine();
        meuIphone.selecionarMusica(input);

        System.out.println("Deseja tocar ou pausar a música? (tocar/pausar):");
        input = scanner.nextLine();
        if (input.equalsIgnoreCase("tocar")) {
            meuIphone.tocar();
        } else if (input.equalsIgnoreCase("pausar")) {
            meuIphone.pausar();
        }

        // Aparelho Telefônico
        System.out.println("Digite o número para ligar:");
        input = scanner.nextLine();
        meuIphone.ligar(input);

        System.out.println("Deseja atender a chamada? (sim/não):");
        input = scanner.nextLine();
        if (input.equalsIgnoreCase("sim")) {
            meuIphone.atender();
        }

        System.out.println("Deseja iniciar o correio de voz? (sim/não):");
        input = scanner.nextLine();
        if (input.equalsIgnoreCase("sim")) {
            meuIphone.iniciarCorreioVoz();
        }

        // Navegador na Internet
        System.out.println("Digite a URL para exibir a página:");
        input = scanner.nextLine();
        meuIphone.exibirPagina(input);

        System.out.println("Deseja adicionar uma nova aba? (sim/não):");
        input = scanner.nextLine();
        if (input.equalsIgnoreCase("sim")) {
            meuIphone.adicionarNovaAba();
        }

        System.out.println("Deseja atualizar a página? (sim/não):");
        input = scanner.nextLine();
        if (input.equalsIgnoreCase("sim")) {
            meuIphone.atualizarPagina();
        }

        scanner.close();
    }
}
