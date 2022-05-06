/*
Para calcular a área do retângulo, basta calcular o produto entre a sua base e a sua altura, ou seja, a área é dada pela fórmula A=b⋅h

Para calcular o perímetro de um retângulo, deve-se somar os seus quatro lados.
 */
package ativaval1;

public class Retangulo extends Forma2D {
    
    Retangulo(String nome, double base, double altura){
    super(nome);
    this.base1 = base;
    this.altura = altura;
    }
    
    @Override
    double calcularArea(){
    area = base1*altura;
    return area;
    }
    
    @Override
    double calcularPerimetro(){
    perimetro = (base1*2)+(altura*2);
    return perimetro;
    }
}
