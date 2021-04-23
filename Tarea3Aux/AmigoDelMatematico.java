
/**
 * Write a description of class Calculadora here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AmigoDelMatematico{
    String ecRecta = "";
    
    public String ecSegundoGrado(int a, int b, int c){
        //se utilizara el metodo de la formula de raices cuadradas
        double raiz = Math.sqrt((b*b) - 4*a*c);
        double denominador = 2*a;
        double x1 = (-b + raiz) / denominador;
        double x2 = (-b - raiz) / denominador;
        return "Los valores son: x1 = " + x1 + " y x2 = " + x2;
    }
    public String ecRecta(Punto1 punto1, Punto2 punto2){
        String ecRecta = "";
        double vectorX = punto2.getX2() - punto1.getX1();
        double vectorY = punto2.getY2() - punto1.getY1();
        double pendiente = vectorY / vectorX;
        double a = pendiente;
        double c = -1 * (pendiente * punto1.getX1()) + punto1.getY1();
        ecRecta = "y = " + a + " x " + "+ (" + c + ")";
        this.ecRecta = ecRecta;
        return ecRecta;
    }
    
    public String getEcRecta(){
        return ecRecta;
    }
        
    public double triangulo(double hipotenusa, double catetoA){
        double catetoB = 0;
        double hipotenusa2 = Math.pow(hipotenusa, 2);
        double catetoA2 = Math.pow(catetoA, 2);
        catetoB = Math.sqrt(hipotenusa2 - catetoA);
        return catetoB;
    } 
    
}
