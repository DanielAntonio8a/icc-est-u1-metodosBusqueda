import java.util.Scanner;
import controllers.MetodosBusqueda;
import controllers.MetodosBusquedaBinario;
import controllers.MetodosOrdenamiento;
import models.Person;

public class App {
    static Scanner leer=new Scanner(System.in);
    public static void main(String[] args) throws Exception {

        Person [] personas = new Person[7] ;
        personas [0] = new Person(101,"Juan");
        personas [1] = new Person(102,"Pedro");
        personas [2] = new Person(103,"Luis");
        personas [3] = new Person(104,"Carlos");
        personas [4] = new Person(105,"Daniel");
        personas [5] = new Person(106,"Andres");
        personas [6] = new Person(107,"Jorge");
        System.out.println("La lista ingresada es: ");
        mostrarLista(personas);
       // MetodosBusqueda mB = new MetodosBusqueda(personas);
    
       MetodosOrdenamiento mO= new MetodosOrdenamiento();
       mO.sortByName(personas);
       System.out.println("\nLa lista ordenada por nombre es:");
       mostrarLista(personas);

       System.out.println("Mostrar Busqueda Binarea");
       MetodosBusquedaBinario mBB= new MetodosBusquedaBinario(personas);
       System.out.println("Busqueda por Codigo: ");
       mBB.showPerson();
       System.out.println("Busqueda por Nombre: ");
       mBB.showPersonByName();
    }


    public static void mostrarLista(Person[] personas) {
        for (Person p : personas) {
            System.out.println(p);
        }
    }
}
