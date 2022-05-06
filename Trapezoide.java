/*
Para calcular a área de um trapézio, somamos os comprimentos da base maior com o da base menor, 
multiplicamos o resultado da soma pela altura do trapézio e dividimos o produto por dois.

Para calcular o perímetro de um trapézio, devemos somar todos os seus lados.
 */
package ativaval1;

public class Trapezoide extends Forma2D{
    
    Trapezoide(String nome, double base1, double base2, double altura){
    super(nome);
    this.base1 = base1;
    this.base2 = base2;
    this.altura = altura;
    this.lado = Math.sqrt((altura*altura)+(((base1-base2)/2)*((base1-base2)/2)));
    }
    
    @Override
    double calcularArea(){
    area = ((base1+base2)*altura)/2;
    return area;
    }
    
    @Override
    double calcularPerimetro(){
    perimetro = (lado*2)+base1+base2;
    return perimetro;
    }
}
