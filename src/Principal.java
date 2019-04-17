
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LABORATORIO_INFO
 */
public class Principal {
            
    public static void main (String [] args) {
        
        Carro carro1 = new Carro();
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Nome: ");
        carro1.nome = scan.next();
        
        System.out.print("Marca: ");
        carro1.marca = scan.next();
        
        System.out.print("Cor: ");
        carro1.cor = scan.next();
        
        System.out.print("Fabricação: ");
        carro1.fabricação = scan.next();
        
        System.out.print("Largura: ");
        carro1.largura = scan.next();
        
        System.out.print("Peso: ");
        carro1.peso = scan.next();
        
        System.out.println("Nome:" + carro1.nome);
        System.out.println("Marca:" + carro1.marca);
        System.out.println("Cor:" + carro1.cor);
        System.out.println("Fabricação:" + carro1.fabricação);
        System.out.println("Largura:" + carro1.largura);
        System.out.println("Peso:" + carro1.peso);
        
        
        Carro carro2 = new Carro();

        System.out.print("Nome: ");
        carro2.nome = scan.next();
        
        System.out.print("Marca: ");
        carro2.marca = scan.next();
        
        System.out.print("Cor: ");
        carro2.cor = scan.next();
        
        System.out.print("Fabricação: ");
        carro2.fabricação = scan.next();
        
        System.out.print("Largura: ");
        carro2.largura = scan.next();
        
        System.out.print("Peso: ");
        carro2.peso = scan.next();
        
        System.out.println("Nome:" + carro2.nome);
        System.out.println("Marca:" + carro2.marca);
        System.out.println("Cor:" + carro2.cor);
        System.out.println("Fabricação:" + carro2.fabricação);
        System.out.println("Largura:" + carro2.largura);
        System.out.println("Peso:" + carro2.peso);
        
        
        
    }
            
            
}
