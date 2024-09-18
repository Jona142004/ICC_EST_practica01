public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        String cadena = "Hola mundo";
        int edad = 10;
        System.out.println(cadena);
        System.out.print("Tamanio de la cadena " );

        System.out.println(cadena.length());
        System.out.println(cadena.split(" ")[0]);
        for (int i = 0; i < cadena.length(); i++ ) {
            if (i == cadena.length()-1){
                System.out.println(cadena.charAt(i) );
            }else{
                System.out.print(cadena.charAt(i) + "-" );

            }

        }
    //contar palabras

    int palabras = cadena.split(" ").length;
    System.out.println(palabras);
    //cuantas a hay en la cadena 
    
    int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a') {
                contador++;
            }
            System.out.println("La letra 'a' aparece " + contador + " veces en la cadena.");

    }
        
   


    }

}
