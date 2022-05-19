public class BusquedaLineal {
    public static void main(String[] args) {
        //Creamos un arreglo de enteros de 10 elementos
        int a[] = new int[10];

        //Población del arreglo con enteros aleatorios
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 99);
        }
        a[9] = 50;

        //Mostramos resultado en consola utilizando un for:
        for(int v : a) {
            System.out.print(v + " ");
        }
        System.out.println();
        int x = 50;
        /*
        Busqueda Lineal : Recorremos todo el areglo y comparamos si el elemento
        en el que estoy recorriendo el arreglo es igual al que estoy buscando,
        lo muestro.
         */
        for (int i = 0; i < a.length; i++) {
            if(a[i] == x) { //Preguntamos si el elemento actual es el valor buscado(x)
                System.out.println("El numero : " + x + " esta en el indice: " + i);
            }
        }

    }
}
