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

public void showMessage(String message){
    System.out.println(message);
}

    
}