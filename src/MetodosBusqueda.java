public class MetodosBusqueda {
    public int busquedaLineal(int [] array, int elemento){
        for (int i=0; i<array.length; i++){
            if (array[i]==elemento){
                return i;
            }
        }
        return -1;
    }

    public void imprimirArreglo(int [] arrego){
        int tam =arrego.length;
        for (int i=0; i<tam; i++){
            System.out.println(" [" + arrego[i] + "]");
            }
    }

    
}

