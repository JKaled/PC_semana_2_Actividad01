package proyecto_grupal1;

import java.util.ArrayList;
import java.util.Scanner;

public class GestionEstudiantes {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();

        int opcion;

        do {

            System.out.println("\n===== SISTEMA DE ESTUDIANTES =====");
            System.out.println("1. Registrar estudiante");
            System.out.println("2. Listar estudiantes");
            System.out.println("3. Buscar estudiante por codigo");
            System.out.println("4. Registrar calificacion");
            System.out.println("5. Calcular promedio");
            System.out.println("6. Salir");

            System.out.print("Ingrese una opcion: ");
            opcion = leer.nextInt();

            switch (opcion) {
                              // OPCION 1: REGISTRAR ESTUDIANTE
                case 1:

                    System.out.print("Ingrese codigo: ");
                    int codigo = leer.nextInt();

                    boolean codigoExiste = false;

                    for (Estudiante e : estudiantes) {

                        if (e.getCodigo() == codigo) {
                            codigoExiste = true;
                            break;
                        }
                    }

                    if (codigoExiste) {

                        System.out.println("Estudiante ya ingresado");

                    } else {

                        leer.nextLine();

                        System.out.print("Ingrese nombre: ");
                        String nombre = leer.nextLine();

                        Estudiante estudiante = new Estudiante(codigo, nombre, 0);

                        estudiantes.add(estudiante);

                        System.out.println("Estudiante registrado correctamente.");
                    }

                    break;
                                 // OPCION 2: LISTAR ESTUDIANTES
                case 2:

                    System.out.println("\n--- LISTA DE ESTUDIANTES ---");

                    for (Estudiante e : estudiantes) {

                        System.out.println("Codigo: " + e.getCodigo());
                        System.out.println("Nombre: " + e.getNombre());
                        System.out.println("Calificacion: " + e.getCalificacion());
                        System.out.println("-------------------------");
                    }

                    break;

                case 3:
                             // OPCION 3: BUSCAR ESTUDIANTE POR CODIGO
                    System.out.print("Ingrese codigo a buscar: ");
                    int codigoBuscar = leer.nextInt();

                    boolean encontrado = false;

                    for (Estudiante e : estudiantes) {

                        if (e.getCodigo() == codigoBuscar) {

                            System.out.println("Estudiante encontrado");
                            System.out.println("Nombre: " + e.getNombre());
                            System.out.println("Calificacion: " + e.getCalificacion());

                            encontrado = true;
                            break;
                        }
                    }

                    if (!encontrado) {
                        System.out.println("El estudiante no existe.");
                    }

                    break;

                case 4:
                               // OPCION 4: REGISTRAR CALIFICACION
                    System.out.print("Ingrese codigo del estudiante: ");
                    int codigoNota = leer.nextInt();

                    boolean encontradoNota = false;

                    for (Estudiante e : estudiantes) {

                        if (e.getCodigo() == codigoNota) {

                            System.out.print("Ingrese calificacion: ");
                            double nota = leer.nextDouble();

                            if (nota > 20) {

                                System.out.println("Se pasa el limite de nota");

                            } else {

                                e.setCalificacion(nota);
                                System.out.println("Calificacion registrada.");
                            }

                            encontradoNota = true;
                            break;
                        }
                    }

                    if (!encontradoNota) {
                        System.out.println("El estudiante no existe.");
                    }

                    break;

                case 5:
                              // OPCION 5: CALCULAR PROMEDIO
                    if (estudiantes.isEmpty()) {

                        System.out.println("No hay estudiantes registrados.");

                    } else {

                        double suma = 0;

                        for (Estudiante e : estudiantes) {
                            suma += e.getCalificacion();
                        }

                        double promedio = suma / estudiantes.size();

                        System.out.println("Promedio: " + promedio);
                    }

                    break;

                case 6:
                             // OPCION 6: SALIR
                    System.out.println("Programa finalizado.");

                    break;
                             // OPCION NO VALIDA
                default:

                    System.out.println("Opcion no valida.");
            }

        } while (opcion != 6);

        leer.close();
    }
}


         
         

    
