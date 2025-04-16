package views;
import java.util.Scanner;

public class showConsole {
    private Scanner scanner;

    public showConsole() {
        this.scanner= new Scanner(System.in);
        showBanner();
    }

    public void showBanner() {
        System.out.println("** Metodos de Busqueda  **");
    }

    public int inputCode(){
        System.out.println("Ingrese el codigo de busqueda: ");
        int code = scanner.nextInt();
        return code;
    }


    public String inputName(){
        System.out.println("Ingrese el nombre de busqueda: ");
        String name = scanner.nextLine();
        return name;
    }

    public void showMessage(String message){
        System.out.println(message);
    }

    
}