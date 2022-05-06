/*
A área de um triângulo consiste na metade da multiplicação da base pela altura.

Para calcular o perímetro do triângulo, bastar somar os seus lados.
 */
package ativaval1;


public class Triangulo extends Forma2D{
    
    Triangulo(String nome, double base, double altura){
    super(nome);
    this.base1 = base;
    this.altura = altura;
    }
    
    @Override
    double calcularArea(){
    area = (base1*altura)/2;
    return area;
    }
    
    @Override
    double calcularPerimetro(){
    perimetro = base1+(altura*2);
    return perimetro;
    }
}
