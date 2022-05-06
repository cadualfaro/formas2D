/*
A área de um círculo é pi vezes o raio elevado ao quadrado (A = π r²).

Para calcular o perímetro de um circulo, C = 2 * π(3,14) * r(raio)
 */
package ativaval1;


public class Circulo extends Forma2D{
    
    Circulo(String nome, double raio){
    super(nome);
    this.raio = raio;
    }
    
    @Override
    double calcularArea(){
    area = (pi*(raio*raio));
    return area;
    }
    
    @Override
    double calcularPerimetro(){
    perimetro = 2 * pi * raio;
    return perimetro;
    }
}
