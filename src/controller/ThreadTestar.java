package controller;

public class ThreadTestar extends Thread {
	
	private int vet[];
	private int num;
	
	public ThreadTestar(int num, int[] vetor) {
		this.num = num;
		this.vet = vetor;
	}
	
	public void run() {
		ThreadVetor();
	}
	
	private void ThreadVetor() {
		
		if(num % 2 == 0) {
			
			double tempoInicial = System.nanoTime()
					
;			for(int i = 0; i < vet.length; i++) {
				System.out.println(vet[i] + " ");
				
			}

			double tempoFinal = System.nanoTime();
			double tempoTotal1 = tempoFinal - tempoInicial;
			
			tempoTotal1 = tempoTotal1 / Math.pow(10, 9);
			
			System.out.println("Estrutura For, tempo da thread do Vetor ==> " + tempoTotal1 + "s. ");
			
			} else{
				
				double tempoInicial = System.nanoTime();
						
				for (int i : vet) {
					System.out.println(vet[i] + " ");
				}

				double tempoFinal = System.nanoTime();
				double tempoTotal = tempoFinal - tempoInicial;
									
				tempoTotal = tempoTotal / Math.pow(10, 9);
									
				System.out.println("Estrutura Foreach, tempo da thread do Vetor ==> " + tempoTotal + "s. ");
			}
			
	}
}
