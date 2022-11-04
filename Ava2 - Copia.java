/*Faça uma aplicação Java, no qual o método main dessa aplicação apresente um
menu com as seguintes opções:
1. Informe um número mágico(inteiro).
2. Informe uma palavra ou frase.
3. Transformar a frase para maiúscula a frase a partir do número mágico.
4. Transformar para maiúscula até o número mágico.
5. Sair.

Cada uma das opções listadas acima deverá ser feita via um método diferente.
As alterações feitas pela Ação 3 deve ser visível pela ação 4 do menu.
A ordem de execução do menu fica a critério do usuário. Portanto, se o usuário
escolher como primeira opção a 3 o sistema deverá informar que não foi digitada
uma palavra ou frase. Se for executado a ação 1 =>2 =>3, se o valor mágico for
maior que a frase o sistema também deverá informar que a operação é impossível
de ser realizada.*/

import java.util.Scanner;

public class Ava2 {
    public static void main(String[] args) {

        String palavra = "";
        int menu;
        int num = 0;
        Scanner ler = new Scanner(System.in);


        for(;;){
            System.out.println();
            System.out.println("Menu de Opções:");
            System.out.println("1 - Informar um número mágico(inteiro).");
            System.out.println("2 - Informar uma palavra ou frase.");
            System.out.println("3 - Transformar	a palavra/frase	para maiúscula a partir do número mágico.");
            System.out.println("4 - Transformar para maiúscula a palavra/frase do início até o número mágico.");
            System.out.println("5 - Sair do programa.");
            System.out.println();
            //        " \n MENU: \n1 - Informe um número mágico(inteiro) \n2 - Informe uma palavra ou frase \n3 - Transformar	a frase	para maiúscula a frase a partir do número mágico \n4 - Transformar para maiúscula até o número mágico \n5 - Sair");

            System.out.print("Escolha as opções acima: ");
            menu = ler.nextInt();



            switch (menu) {
                case 1:
                    ler.nextLine();
                    System.out.print("Informe o número mágico: ");
                    num = ler.nextInt();
                    break;
                case 2:
                    ler.nextLine();
                    System.out.print("Informe uma palavra/frase: ");
                    palavra = ler.nextLine();
                    break;
                case 3:
                    if (palavra.length() == 0){
                        System.out.print("Escolha primeiro um número mágico e depois a palavra/frase: ");
                        System.out.println("");

                    }
                    else {
                        if (num > palavra.length()){
                            System.out.println("Numero mágico escolhido: " +num);
                            System.out.println("Quantidade de caracteres é incompativel com o número mágico escolhido!!");
                            System.out.println("");
                        }
                        else {
                            System.out.println("numero mágico: "+num);
                            System.out.print("R: ");
                            palavra = maiusculaFinal(palavra, num);
                        }
                    }
                    break;
                case 4:
                    if (palavra.length() == 0){
                        System.out.println("Escolha primeiro um número mágico e depois a frase/palavra: ");
                        System.out.println("");
                    }
                    else {
                       if (num > palavra.length()){
                        System.out.println("Numero mágico escolhido: " + num);
                        System.out.println("Quantidade de caracteres é incompativel com o número mágico escolhido!!");

                    }else
                            System.out.println("Numero mágico escolhido: "+num);
                            System.out.print("R: ");
                            palavra = maiusculaInicial(palavra,num);
                        }
                    break;
                    default:
                    sair();
                    break;
            }

        }
    }

    private static String maiusculaFinal(String palavra, int num) {
        char[] con = palavra.toCharArray();
        for (int i = num; i < con.length; i++) {
            con[i] = Character.toUpperCase(con[i]);
        }
        String palavra2;
        palavra2 = String.copyValueOf(con);
        System.out.println(palavra2);
        return palavra2;
    }

    public static String maiusculaInicial(String palavra, int num) {
        char con[] = palavra.toCharArray();
        for (int i = 0; i < num; i++) {
            con[i] = Character.toUpperCase(con[i]);
        }
        String palavra2;
        palavra2 = String.copyValueOf(con);
        System.out.println(palavra2);
        return palavra2;
    }

    public static void sair() {
        System.exit(0);
    }

}