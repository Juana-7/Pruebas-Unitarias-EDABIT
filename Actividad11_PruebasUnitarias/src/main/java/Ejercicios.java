
public class Ejercicios {
    
      //Convertir minutos en segundos
     public int segundos(int a){
        int resultado =  a * 60;
         System.out.println(a + " minutos tiene : " + resultado + " segundos");
        return resultado;
    }
     
       //Convertir edad en dias
     public int edad(int a){
        int resultado =  a * 365;
         System.out.println(a + " años tiene : " + resultado + " dias");
        return resultado;
    }
     
       //Comprobar si dos numeros son iguales
    public boolean numeros(int num1, int num2){
        boolean comprobar;
        if( num1 == num2){
            comprobar = true;
            System.out.println("Los numeros " + num1 + " y " + num2 + " son iguales: " + comprobar);
        }else{
            comprobar = false;
            System.out.println("Los numeros " + num1 + " y " + num2 + " son iguales: " + comprobar);
        }
        return comprobar;
    }
}
