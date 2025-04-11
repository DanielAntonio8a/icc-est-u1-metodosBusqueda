import java.util.Scanner;

public class App {
    static Scanner leer=new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        System.out.print("Ingrese el tamaño de la lista: ");
        int tamLista=leer.nextInt();

        int [] array= new int[tamLista] ;

        System.out.println("Ingrese los elementos de la Lista: ");
        for (int i=0; i<tamLista; i++){
            System.out.println("Elemento: "+i+1);
            array[i]=leer.nextInt();
        }

        System.out.print("Ingrese el numero a buscar: ");
        int elemento=leer.nextInt();

        MetodosBusqueda mB= new MetodosBusqueda();
        int resultado=mB.busquedaLineal(array, elemento);

        if (resultado != -1){
            System.out.println("El Elemento "+elemento+" Se encuentra en: "+resultado);
        }else {
            System.out.println("El elemento "+elemento+" no es listado");
        }
    }
}
