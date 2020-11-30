

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PruebaTest {
    
    public PruebaTest() {
    }
     Ejercicios edabit = new Ejercicios();
     
     //Test de Minutos en segundos
        @Test
        public void testComprobarTiempo(){
        assertEquals(edabit.segundos(12),720);
        }
          @Test
        public void testComprobarTiempo1(){
        assertEquals(edabit.segundos(8),480);
        }
         @Test
        public void testComprobarTiempo2(){
        assertEquals(edabit.segundos(5),300);
        }
        
    //Test de edad en días
        @Test
        public void testComprobarEdad(){
        assertEquals(edabit.edad(14),5110);
        }
          @Test
        public void testComprobarEdad1(){
        assertEquals(edabit.edad(4),1460);
        }
         @Test
        public void testComprobarEdad2(){
        assertEquals(edabit.edad(2),730);
        }
    //Test de numeros iguales
        @Test
        public void testComprobarNumeros(){
        assertEquals(true, edabit.numeros(5,5));
        }
        @Test
        public void testComprobarNumeros1(){
        assertEquals(false, edabit.numeros(7,9));
        }
        public void testComprobarNumeros2(){
        assertEquals(true, edabit.numeros(8,8));
        }
}

