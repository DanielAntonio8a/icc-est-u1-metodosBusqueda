import java.util.Scanner;
import controllers.MetodosBusqueda;
import models.Person;

public class App {
    static Scanner leer=new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        
        // MetodosBusqueda mB= new MetodosBusqueda();
        // System.out.print("Ingrese el tamaño de la lista: ");
        // int tamLista=leer.nextInt();

        // int [] array= new int[tamLista] ;

        // System.out.println("Ingrese los elementos de la Lista: ");
        // for (int i=0; i<tamLista; i++){
        //     System.out.println("Elemento: "+i+1);
        //     array[i]=leer.nextInt();
        // }
        // System.out.println("La lista ingresada es: ");
        // mB.imprimirArreglo(array);

        // System.out.print("Ingrese el numero a buscar: ");
        // int elemento=leer.nextInt();

        // int resultado=mB.busquedaLineal(array, elemento);

        // if (resultado != -1){
        //     System.out.println("El Elemento "+elemento+" Se encuentra en: "+resultado);
        // }else {
        //     System.out.println("El elemento "+elemento+" no es listado");
        // }

//-----------------------------------------------------------------------------------------------------------------------------
        Person [] personas = new Person[7] ;
        personas [0] = new Person(101,"Juan");
        personas [1] = new Person(102,"Pedro");
        personas [2] = new Person(103,"Luis");
        personas [3] = new Person(104,"Carlos");
        personas [4] = new Person(105,"Juan");
        personas [5] = new Person(106,"Pedro");
        personas [6] = new Person(107,"Luis");
        System.out.println("La lista ingresada es: ");
        
        MetodosBusqueda mB = new MetodosBusqueda(personas);







    }
}
