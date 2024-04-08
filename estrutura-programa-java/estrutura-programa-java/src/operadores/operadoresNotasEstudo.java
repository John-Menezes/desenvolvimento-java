package operadores;

public class operadoresNotasEstudo {
    public static void main(String[] args) {
        int numero1 = 1;
        int numero2 = 2;
        int soma = numero1 + numero2;
        // System.out.println("A soma é: " + soma);
        // ( + ) Concatenação ou Soma

        int numero3 = 3;
        int numero4 = 4;
        int subtracao = numero4 - numero3;
        // System.out.println(subtracao);

        int numero5 = 5;
        int numero6 = 6;
        int multiplicacao = numero5 * numero6;
        // System.out.println(multiplicacao);

        double numero7 = 2.5;
        double numero8 = 4;
        double multiplicacao2 = numero7 * numero8;
        // System.out.println(multiplicacao2);

        int numero9 = 7;
        int numero71 = 71;
        int divisao = numero71 / numero9;
        // System.out.println(divisao);

        int modulo = numero71 % numero9;
        // System.out.println(modulo);
        // ( % ) Operador de módulo

        int contador = 0;
        contador++;
        contador++;
        // System.out.println(contador);
        // ( ++ ) Quando tiver ++ o sistema interpreta como 1
        contador--;
        contador--;
        // System.out.println(contador);
        // ( -- ) Quando tiver -- o sistema retira 1

        double decimal1 = 1.0;
        double decimal2 = 2.0;
        boolean ehMaior = decimal1 > decimal2;
        // System.out.println(ehMaior);

        boolean ehMenor = decimal2 < decimal1;
        // System.out.println(ehMenor);

        // System.out.println(decimal1 >= decimal1);

        // System.out.println(decimal1 <= decimal1);

        // System.out.println(decimal1 == decimal1);

        // System.out.println(decimal1 != decimal1);

        int variavel = 1;
        // variavel += 4;
        // variavel -= 1;
        // variavel *= 2;
        // variavel /= 2;
        // variavel %= 2;
        // variavel ++;
        // variavel --;
        // System.out.println(variavel);

        int valor1 = 4;
        int valor2 = 2;
        boolean expressao = valor1 < 10 && valor2 < 10;
        //System.out.println(expressao);

        boolean expressaoOr = valor1 < 10 || valor2 < 2;
        // System.out.println(expressaoOr);

        boolean expressaoNegada = (2 < 1 );
        System.out.println(!expressaoNegada);

    }
}