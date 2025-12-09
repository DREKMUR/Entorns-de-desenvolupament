/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package practicaunidad4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
/**
 * Esta es la clase que ejecuta el menú con las funciones correspondientes.
 * @author Derek Murillo Fernandez
 */
public final class Main {
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
 
    private static final int OPCION_INGRESAR = 1;
    private static final int OPCION_RETIRAR = 2;
    private static final int OPCION_FINALIZAR = 3;

    /**
     * Constructor privado para evitar que la clase Main sea instanciada, lo decia el PMD.
     */
    private Main() {
    }
    
    /**
     * Método principal de la aplicación.
     * Crea la cuenta bancaria inicial con un saldo, llama al método para gestionar las operaciones
     * del usuario y, al finalizar, imprime el saldo final.
     * 
     * @param args Para que se ejecute el programa, supongo.
     */
    public static void main(String[] args) {
        Cuenta comptePrincipal;
        double saldoActual;
        
        comptePrincipal = new Cuenta("Juan López","1000-2365-85-123456789",2500,0);
        
        gestionarCompte(comptePrincipal);

        saldoActual = comptePrincipal.getSaldo();
        System.out.println("El saldo actual es"+ saldoActual );
    }

    /**
     * Muestra el menú de operaciones al usuario y gestiona las acciones de ingresar o retirar.
     * Este método se ejecuta en un bucle (do-while) hasta que el usuario elige 'Finalizar' (opción 3).
     * También incluye manejo de errores si el usuario introduce una letra o un número no válido.
     *
     * @param comptePrincipal El objeto Cuenta sobre el que se realizarán las operaciones de ingreso o retiro.
     */
    public static void gestionarCompte(Cuenta comptePrincipal) {
        int opcion = 0;
        do {
            try {
                System.out.println("MENÚ DE OPERACIONES");
                System.out.println("-------------------");
                System.out.println(OPCION_INGRESAR + " - Ingresar");
                System.out.println(OPCION_RETIRAR + " - Retirar");
                System.out.println(OPCION_FINALIZAR + " - Finalizar");
                
                String input = reader.readLine();
                if (input.isEmpty()) {
                	continue;
                }
                opcion = Integer.parseInt(input);

                switch (opcion) {
                    case OPCION_INGRESAR:
                        System.out.println("¿Cuánto desea ingresar?: ");
                        double ingresar = Double.parseDouble(reader.readLine());
                        try {
                            System.out.println("Ingreso en cuenta");
                            comptePrincipal.ingresar(ingresar);
                        } catch (Exception error) {
                            System.out.print("Fallo al ingresar");
                        }
                        break;

                    case OPCION_RETIRAR:
                        System.out.println("¿Cuánto desea retirar?: ");
                        double retirar = Double.parseDouble(reader.readLine());
                        try {
                            comptePrincipal.retirar(retirar);
                        } catch (Exception error) {
                            System.out.print("Fallo al retirar");
                        }
                        break;

                    case OPCION_FINALIZAR:
                        System.out.println("Finalizamos la ejecución");
                        break;

                    default:
                        System.err.println("Opción errónea");
                }
            } catch (IOException | NumberFormatException exception) {
                System.err.println("Error en la entrada de datos");
            }
        } while (opcion != OPCION_FINALIZAR);
    }
}