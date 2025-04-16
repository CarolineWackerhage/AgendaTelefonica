import java.util.ArrayList;
import java.util.Scanner;

public class AgendaTelefonica {
    public static void main(String[] args) {

        boolean estaAtivo = true;
        String entrada;

        Scanner s = new Scanner(System.in);
        ArrayList<String> agendaTelefonica = new ArrayList<>();

        while (estaAtivo) {
            System.out.println("Digite o que deseja:\n" +
                    "1 - Adicionar novo contato\n" +
                    "2 - Buscar contato\n" +
                    "3 - Lista de contatos\n" +
                    "4 - Remover contato\n" +
                    "x - sair");
            entrada = s.nextLine();

            boolean querContinuar = true;


        }
    }
}