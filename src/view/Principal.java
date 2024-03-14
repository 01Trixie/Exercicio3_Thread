package view;

import java.util.Random;

import controller.ThreadTestar;

public class Principal {

	public static void main(String[] args) {
		
		Random R = new Random();
		int num = R.nextInt(50);
		int[] vet = new int[1000];
		
		System.out.println("número: " + num);
		for(int i = 0; i < 1000; i++) {
			vet[i] = R.nextInt(101);
		}
		
		for(int i = 0; i < 1; i++) { //Aqui é as threds que vão pra outra classe
			Thread ThreadVetor = new ThreadTestar(num, vet);
			ThreadVetor.start();
		}

	}

}
