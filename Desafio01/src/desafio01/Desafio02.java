package desafio01;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Desafio02 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int n1;
        
        String texto = " -     DESAFIO 02     - ";
        
        deLay (texto);
        texto = "O agente atende à ligação que estava aguardando, surpreso, ele descobre que a pessoa que havia lhe ligado era um antigo pupilo o qual ele havia treinado uma década antes em seu tempo no Afeganistão.\n" +
"Voltando no passado, esse rapaz chamado Hamid, integrava uma família que desprezava os EUA, mas ele não via problema na presença dos americanos no Afeganistão, e,\n" +
"como o EUA oferecia alimentação e uma condição de vida melhor para quem era recrutado, ele optou por se tornar um recruta.\n" +
"Conforme o passar do tempo, quase ao fim de seu treinamento, Hamid presenciou uma situação que mudou o seu destino.\n" +
"\n" +
"Em uma batida dos Estados Unidos em um vilarejo, eles suspeitaram que uma pessoa que tinha ligação com o grupo terrorista local a Isis-K, porém o rapaz conhecia aquela pessoa e a considerava alguém inocente.";
        deLay (texto);
        texto = " -     AÇÃO     - ";
        deLay (texto);
        texto = "1 - Ajudar o senhor? ";
        deLay (texto);
        texto = "2 - Não ajudar o senhor? ";
        deLay (texto);
        
        n1=leia.nextInt();
        
        switch (n1){
                 case 1:
                    System.out.println(" Hamid toma atitude vendo aquela situação e tenta ajudar o senhor a qual estava sendo agredido, porém mesmo implorando para os soldados parassem com aquilo, eles continuaram até matar o homem.\n" +
"Após todo o ocorrido os soldados americanos ocultaram a morte do senhor e mesmo com a população de testemunha do ocorrido, seus atos foram ignorados e ninguém acabou punido.\n" +
"Ao testemunhar tudo aquilo, sua concepção a respeito dos Estados Unidos mudou, o garoto na qual não via problema algum na presença de americanos no Afeganistão, passou a odiá-los assim como seus familiares.");
                    break;
                 case 2:
                    System.out.println(" Hamid permanece imóvel, quase em estado de choque testemunhando tudo aquilo sem saber o que fazer.\n" +
"Vendo toda essa situação, imaginando como uma pessoa seria capaz de fazer tal ato a alguém inocente,\n" +
"o rapaz pensa a respeito das suas decisões e passa a considerar os EUA invasores de seu país assim como seus familiares.");
                    break;   
        }
        texto = " - Após a ação do jogador - ";
        deLay (texto);
        texto = "Voltando para o presente, o agente atende a ligação e escuta uma voz calma e conhecida...\n" +
"Hamid diz – “Lembra de mim “professor”?” sarcasticamente\n" +
"Então o agente respondeu – “Quem é você?”\n" +
"Hamid novamente diz – “Nossa, fico desapontado que você não lembra de mim, encontrei com seus amigos americanos hoje de manhã, nós saímos para dar um rolezinho por aí” diz novamente em um tom sarcástico.\n" +
"O agente responde preocupado - “ONDE ESTÁ MINHA EQUIPE ??!!”\n" +
"Hamid revela – “Tenho duas localizações para te passar, ainda tenho um pouco de esperança de que você seja uma pessoa boa então quero ver que atitude o senhor irá tomar professor”\n" +
"“Tem um armazém localizado ao sul do aeroporto com uma fachada vermelha e branca, vá para lá se quiser encontrar os seus amigos, agora, caso você ainda seja a pessoa boa que eu costumava a conhecer,\n" +
"um grupo de professoras estão presas em um prédio e chamas ao oeste de sua posição, apenas siga a fumaça. Agora, elas são pessoas inocentes, diferente dos seus amiguinhos americanos, que assassinaram um homem a sangue frio tempos atrás.”";
        deLay (texto);
        texto = " - Fim do desafio 2 - ";
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
    

