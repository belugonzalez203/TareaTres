/**
 * Write a description of class Matematico here.
 * 
 * @author (Belen) 
 * @version (18/04/2021)
 */
public class Matematico{
    String cuadrante;
    public String ordenNumeros(double a, double b, double c){
        //Los numeros se ordenaran de mayor a menor
        double aux = 0;
        double aux2 = 0;
        if (a>=b){
            if ((b>=c)&&(a>=c)){
                a = a;
                b = b;
                c = c;
             
            }else if((a>=c)&&(c>=b)){ 
                a = a;
                aux = b;
                b = c;
                c = aux;
            }else if((c>=a)&&(c>=b)){
                aux = a;
                aux2 = b;
                a = c;
                b = aux;
                c = aux2;
            }
        }else if((b>=c)&&(c>=a)){
            aux = a;
            a = b;
            b = c;
            c = aux;
        }else if((a>=c)&&(b>=c)){
            c = c;
            aux = a;
            a = b;
            b = aux;
        }else if((c>=a)&&(c>=b)){
            aux = a;
            b = b;
            a = c;
            c = aux;
        }
        return "El mayor es " + a + ", el del medio es " + b + ", el menor es " + c;
    }
    
    public double areaCuadrado(double lado){
        double area = Math.pow(lado, 2);
        return area;
    }
    
    public double distancia(Punto1 punto1, Punto2 punto2){
        double distancia;
        double aux;
        double xCuadrado, yCuadrado;
        
        xCuadrado = Math.pow(punto2.getX2() - punto1.getX1(), 2);
        yCuadrado = Math.pow(punto2.getY2() - punto1.getY1(), 2);
        distancia = Math.sqrt(xCuadrado + yCuadrado);
        return distancia;
    }
    
    public String cuadrantePunto(Punto1 punto){
        String cuadrante = "";
        
        if(punto.getX1()>0){
            if((punto.getY1()>0)){
                cuadrante = "punto (" + punto.getX1() +", " + punto.getY1() + ") en el primer cuadrante";
            }else{
                if((punto.getY1()<0)){
                cuadrante = "punto (" + punto.getX1() +", " + punto.getY1() + ") en el cuarto cuadrante";
                }
                
            }
        }else if(punto.getX1()<0){
            if(punto.getY1()>0){
                cuadrante = "punto (" + punto.getX1() +", " + punto.getY1() + ") en el segundo cuadrante";
            }else if(punto.getY1()<0){
                cuadrante = "punto (" + punto.getX1() +", " + punto.getY1() + ") en el tercer cuadrante";
            }
        }else if((punto.getX1() == 0)&&(punto.getY1() == 0)){
            cuadrante = "punto (" + punto.getX1() +", " + punto.getY1() + ") en el origen";
        }else if((punto.getX1() == 0) && (punto.getY1() != 0)){
            cuadrante = "punto (" + punto.getX1() +", " + punto.getY1() + ") sobre el eje Y";
        }else if((punto.getY1() == 0) && (punto.getX1() != 0)){
            cuadrante = "punto (" + punto.getX1() +", " + punto.getY1() + ") sobre el eje X";
        }
        return cuadrante;
    }
    public String ecuacionDeRecta(Punto1 punto1, Punto2 punto2){
        //AmigoDelMatematico ecRecta = new AmigoDelMatematico();
        String ecRecta = "";
        //ecRecta = ecRecta.getEcRecta();
        return ecRecta;
    }
    
}