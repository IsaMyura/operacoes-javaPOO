
package sp.senai.br.operacoes;

public class Main {
    public static void main(String args[]){   
       
        Operacoes biblioteca = new Operacoes();
        
        double[] vetor = new double[10];
        double soma = biblioteca.soma(1, 2);
        double subtracao = biblioteca.subtracao(1, 2);
        double divisao = biblioteca.divisao(10, 2);
        double multiplicacao = biblioteca.multiplicacao(2, 2);
        
        vetor[0] = 10;
        vetor[1] = 20;
        vetor[2] = 30;
        vetor[3] = 40;
        vetor[4] = 50;
        vetor[5] = 60;
        vetor[6] = 70;
        vetor[7] = 80;
        vetor[8] = 90;
        vetor[9] = 100;
        
        
        double max = biblioteca.max(vetor);
        double min = biblioteca.min(vetor);
        double media = biblioteca.media(vetor);
        double mediana = biblioteca.mediana(vetor);
        
                
        System.out.println(max);
        System.out.println(min);
        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(divisao);
        System.out.println(multiplicacao);
        System.out.println(media);
        System.out.println(mediana);
        
    	System.exit(0);
		
    }
}
