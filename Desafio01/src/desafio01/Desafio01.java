package desafio01;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Desafio01 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n1;
        
        String texto = " -     DESAFIO 01     - ";
        
        deLay (texto);
        texto = "Após desastres no Afeganistão e o Talibã tomar o poder do país, foi designado um agente da CIA para ir ao Afeganistão e ajudar na evacuação dos soldados americanos no aeroporto de Cabul no Afeganistão.\n" +
"Chegando no aeroporto e após conseguir realizar a evacuação dos soldados o/a agente percebeu que estava faltando um grupo de soldados e sabendo que teria que dar uma explicação aos EUA sobre isso \nele então tem que decidir se vai a procura dos soldados perdidos ou não...";
        deLay (texto);
        texto = " -     AÇÃO     - ";
        deLay (texto);
        texto = "1 - Procurar soldados? ";
        deLay (texto);
        texto = "2 - Não procurar soldados? ";
        deLay (texto);
        
        n1=leia.nextInt();
        
        switch (n1){
                 case 1:
                    System.out.println(" O/a agente fica em uma intensa procura sobre os soldados restantes até que um grupo de mulheres que foram salvas pelo grupo de soldados\n" +
"fala que eles foram capturados pelo grupo terrorista do Talibã e que viu eles sendo levados dentro de um carro para fora do aeroporto, com isso em mente e sem poder deixar o local\n"+
"o/a agente notifica seu general e espera uma resposta através de uma ligação do que continuar fazendo, ficar no aeroporto e conseguir evacuar os soldados e alguns civis ou deixar o aeroporto e ir atrás dos soldados capturado");
                    break;
                 case 2:
                    System.out.println(" Com a recusa do agente em procurar os soldados perdidos a multidão que está no aeroporto percebe que sobra algumas vagas ainda no avião\n" +
"e com isso gera uma grande briga entre os civis para ver quem vai entrar no avião e acaba que os civis tentam tomar controle do avião contra os soldados e isso gera uma briga intensa\n" +
"entre soldados e civis, gerando até mesmo uma morte por conta da tentativa de tomada de avião, fazendo assim com que o/a agente tenha que verificar se nenhum repórter flagrou a morte do civil\n" +
"e resolver o problema do homicídio e com isso notifica seu general através de um ligação e espera a resposta para saber o que fazer...");
                    break;   
        }
        texto = " - Após a ação do jogador - ";
        deLay (texto);
        texto = "Sendo a ação do jogador a (sim) ou a (não) ele espera da mesma forma o telefone de seu general, mas não esperava que quem vai ligar para ele é uma pessoa misteriosa, mas que sabe muito sobre ele.";
        deLay (texto);
        texto = " - Fim do desafio 1 - ";
        deLay (texto);
    }

    static void deLay(String TextoFuncao) {
        int tamanhoDelay = TextoFuncao.length();
        System.out.println(TextoFuncao);
        try{
            TimeUnit.SECONDS.sleep(tamanhoDelay/25);   
        }catch (InterruptedException ie){
            Thread.currentThread().interrupt();
    }
    }
}
