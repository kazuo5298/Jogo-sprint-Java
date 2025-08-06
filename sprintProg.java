import java.util.Scanner;

public class sprintProg {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int comando = 1, totalAndado = 0, bateria, gastoBateria, totalQuadrados = 87, consumoMinimo;

        consumoMinimo = totalQuadrados / 2;

        System.out.print("Digite a carga da bateria (%): ");
        bateria = entrada.nextInt();

        if (bateria < consumoMinimo) {
            System.out.println("Bateria insuficiente! É necessário uma recarga de no mínimo " + consumoMinimo + "%.");
return;
        }

        while (comando <= 7) {
            System.out.println("Comando " + comando + " de 7");

            System.out.print("Digite a direção (cima, baixo, esquerda, direita): ");
            String direcao = entrada.next();
            direcao = direcao.toUpperCase();

            System.out.print("Digite a quantidade de quadrados: ");
            int distancia = entrada.nextInt();

            // Verifica cada comando
            if (comando == 1 && direcao.equals("DIREITA") && distancia == 9) {
                totalAndado += distancia;
                comando++;
                System.out.println("Comando valido!! Parabéns");
                System.out.println("");
            } else if (comando == 2 && direcao.equals("CIMA") && distancia == 12) {
                totalAndado += distancia;
                comando++;
                System.out.println("Comando valido!! Parabéns");
                System.out.println("");
            } else if (comando == 3 && direcao.equals("ESQUERDA") && distancia == 23) {
                totalAndado += distancia;
                comando++;
                System.out.println("Comando valido!! Parabéns");
                System.out.println("");
            } else if (comando == 4 && direcao.equals("BAIXO") && distancia == 17) {
                totalAndado += distancia;
                comando++;
                System.out.println("Comando valido!! Parabéns");
                System.out.println("");
            } else if (comando == 5 && direcao.equals("DIREITA") && distancia == 9) {
                totalAndado += distancia;
                comando++;
                System.out.println("Comando valido!! Parabéns");
                System.out.println("");
            } else if (comando == 6 && direcao.equals("CIMA") && distancia == 10) {
                totalAndado += distancia;
                comando++;
                System.out.println("Comando valido!! Parabéns");
                System.out.println("");

            } else if (comando == 7 && direcao.equals("DIREITA") && distancia == 6) {
                totalAndado += distancia;
                comando++;
                System.out.println("Comando valido!! Parabéns");
                System.out.println("");
            } else {
                System.out.println("Comando inválido. Digite novamente.");
            }
        }

        gastoBateria = totalAndado / 2;
        int bateriaFinal = bateria - gastoBateria;

        System.out.println("Percurso concluído!");
        System.out.println("Total andado: " + totalAndado + " quadrados");
        System.out.println("Bateria restante: " + bateriaFinal + "%");
    }
}
