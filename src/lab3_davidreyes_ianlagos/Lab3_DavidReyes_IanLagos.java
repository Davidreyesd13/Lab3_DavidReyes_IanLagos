package lab3_davidreyes_ianlagos;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab3_DavidReyes_IanLagos {

    public static void main(String[] args) {
        ArrayList<Jugadas> jugadas_fav = new ArrayList();
        int opcion;
        ArrayList<Equipo> equipos = new ArrayList();
        Scanner leer = new Scanner(System.in);
        while (true) {
            System.out.println("0.Salir"
                    + "\n1.creacion de equipo"
                    + "\n2.Modificacion\n3.Despedir"
                    + "\n4.Agentes libres\n5.Comprar Jugador\n6.Simulacion");
            opcion = leer.nextInt();
            switch (opcion) {
                case 0:
                    System.exit(0);
                case 1:
                    ArrayList personal = new ArrayList();
                    System.out.println("Ingrese Nombre de equipo");
                    String nombre = leer.next();
                    System.out.println("Ingrese fecha de creacion");
                    String fecha = leer.next();
                    System.out.println("Ingrese numero de campeonatos");
                    int campeonatos = leer.nextInt();
                    System.out.println("1.Agregar jugadores\n2.Agregar Medico\n3.Agregar Entrenador\n4.Agregar dueño");
                    int persona = leer.nextInt();
                    switch (persona) {
                        case 0:
                            System.out.println("ingrese jugada: ");
                            String nom_jug = leer.next();
                            System.out.println("ingrese el porcentaje: ");
                            double porcen = leer.nextDouble();
                            jugadas_fav.add(new Jugadas(nom_jug, porcen));
                            break;
                        case 1:
                            System.out.println("Ingrese cuantos jugadores quiere meter en su equipo");
                            int cont = leer.nextInt();
                            while (cont < 5 || cont > 13) {
                                if (cont < 5) {
                                    System.out.println("Muy pocos jugadores");
                                } else if (cont > 13) {
                                    System.out.println("Muchos jugadores");
                                }
                                System.out.println("Ingrese jugadores minimo 5 y maximo 13");
                                cont = leer.nextInt();
                            }
                            for (int i = 0; i < cont; i++) {
                                System.out.println("Ingrese nombre de jugador");
                                nombre = leer.next();
                                System.out.println("Ingrese Apellido");
                                String apellido = leer.next();
                                System.out.println("Años profesionles");
                                String años = leer.next();
                                System.out.println("Ingrese el salario");
                                double salario = leer.nextDouble();
                                System.out.println("Ingrese numero de camisa");
                                int camisa = leer.nextInt();
                                System.out.println("Ingrese valor de tiro de 3");
                                int tiro3 = leer.nextInt();
                                if (tiro3 < 0) {
                                    System.out.println("No se puede menores que 0");
                                    System.out.println("Ingrese valor de tiro de 3");
                                    tiro3 = leer.nextInt();

                                } else if (tiro3 > 99) {
                                    System.out.println("No se puede un numero mayor de 99");
                                    System.out.println("Ingrese valor de tiro de 3");
                                    tiro3 = leer.nextInt();
                                }
                                System.out.println("Ingrese valor de defensa");
                                int def = leer.nextInt();
                                if (def < 0) {
                                    System.out.println("No se puede menores que 0");
                                    System.out.println("Ingrese valor de defensa");
                                    def = leer.nextInt();

                                } else if (def > 99) {
                                    System.out.println("No se puede un numero mayor de 99");
                                    System.out.println("Ingrese valor de defensa");
                                    def = leer.nextInt();
                                }
                                System.out.println("Ingrese valor de tiro de media");
                                int media = leer.nextInt();
                                if (media < 0) {
                                    System.out.println("No se puede menores que 0");
                                    System.out.println("Ingrese valor de media");
                                    media = leer.nextInt();

                                } else if (media > 99) {
                                    System.out.println("No se puede un numero mayor de 99");
                                    System.out.println("Ingrese valor de media");
                                    media = leer.nextInt();
                                }
                                System.out.println("Ingrese valor de rebote");
                                int rebote = leer.nextInt();
                                if (rebote < 0) {
                                    System.out.println("No se puede menores que 0");
                                    System.out.println("Ingrese valor de rebote");
                                    rebote = leer.nextInt();

                                } else if (def > 99) {
                                    System.out.println("No se puede un numero mayor de 99");
                                    System.out.println("Ingrese valor de rebote");
                                    rebote = leer.nextInt();
                                }
                                System.out.println("Ingrese valor de bandeja");
                                int bandeja = leer.nextInt();
                                if (bandeja < 0) {
                                    System.out.println("No se puede menores que 0");
                                    System.out.println("Ingrese valor de bandeja");
                                    bandeja = leer.nextInt();

                                } else if (bandeja > 99) {
                                    System.out.println("No se puede un numero mayor de 99");
                                    System.out.println("Ingrese valor de bandeja");
                                    bandeja = leer.nextInt();
                                }
                                System.out.println("Ingrese valor de pases");
                                int pases = leer.nextInt();
                                if (pases < 0) {
                                    System.out.println("No se puede menores que 0");
                                    System.out.println("Ingrese valor de pases");
                                    pases = leer.nextInt();

                                } else if (pases > 99) {
                                    System.out.println("No se puede un numero mayor de 99");
                                    System.out.println("Ingrese valor de pases");
                                    pases = leer.nextInt();
                                }
                                System.out.println("Ingrese valor de posteo");
                                int posteo = leer.nextInt();
                                if (posteo < 0) {
                                    System.out.println("No se puede menores que 0");
                                    System.out.println("Ingrese valor de posteo");
                                    posteo = leer.nextInt();

                                } else if (posteo > 99) {
                                    System.out.println("No se puede un numero mayor de 99");
                                    System.out.println("Ingrese valor de posteo");
                                    posteo = leer.nextInt();
                                }
                                System.out.println("Que tipo de jugador sera:\n1.Base\n2.Escolta\n3.Alero\n4.Pivot\n5.Centro");
                                int tij = leer.nextInt();
                                double altura = 0;
                                switch (tij) {
                                    case 1:
                                        altura = 1.93;
                                        break;
                                    case 2:
                                        altura = 2.00;
                                        break;
                                    case 3:
                                        altura = 2.05;
                                        break;
                                    case 4:
                                        altura = 2.10;
                                        break;
                                    case 5:
                                        altura = 2.13;
                                    default:
                                        System.out.println("Opcion no valida");
                                }

                                personal.add(new Persona(nombre, apellido, años, salario).getJugador().add(new Jugador(camisa, tiro3, def, media, rebote, bandeja, pases, posteo, altura, nombre, apellido, años, salario)));
                            }
                            break;
                        case 2:
                            System.out.print("ingrese nombre del medico: ");
                            String nom_medic = leer.next();
                            System.out.print("ingrese apellido medico: ");
                            String ape_medic = leer.next();
                            System.out.print("ingrese años profecionales: ");
                            String años_medic = leer.next();
                            System.out.print("Ingrese salario");
                            double sal_medic = leer.nextDouble();
                            System.out.println("1= medico general");
                            System.out.println("2= cirujano");
                            System.out.println("3= terapeuta");
                            System.out.print("ingrese tipo de medico: ");
                            int opc_medic = leer.nextInt();
                            String tipo_medic = "";
                            switch (opc_medic) {
                                case 1:
                                    tipo_medic = "medico general";
                                    break;
                                case 2:
                                    tipo_medic = "cirujano";
                                    break;
                                case 3:
                                    tipo_medic = "terapeuta";
                                    break;
                            }
                            personal.add(new Persona(nom_medic, ape_medic, años_medic, sal_medic).getMedico().add(new medico(nom_medic, nombre, ape_medic, años_medic, sal_medic)));
                            break;
                        case 3:
                            System.out.print("ingrese nombre del dueño: ");
                            String nom_dueño = leer.next();
                            System.out.print("ingrese apellido dueño: ");
                            String ape_dueño = leer.next();
                            System.out.print("ingrese años profecionales: ");
                            String años_dueño = leer.next();
                            System.out.print("ingrese Net worth: ");
                            double nw_dueño = leer.nextDouble();
                            System.out.print("ingrese lugar donde nacio: ");
                            String lug_nac = leer.nextLine();
                            personal.add(new Persona(nom_dueño, ape_dueño, años_dueño).getDueño_equipo().add(new Dueño_equipo(nw_dueño, nom_dueño)));
                            break;
                        case 4:
                            System.out.print("ingrese nombre del Entrenador: ");
                            String nom_entre = leer.next();
                            System.out.print("ingrese apellido del Entrenador: ");
                            String ape_entre = leer.next();
                            System.out.print("ingrese años profecionales: ");
                            String años_entre = leer.next();
                            System.out.println("usted fue jugador si/no: ");
                            String ex_jug = leer.next();

                            System.out.println("1 = entrenador principal");
                            System.out.println("2 = asistente entrenador ");
                            System.out.println("3 = Preparador fisico");
                            System.out.println("ingrese tipo de entrenador");
                            int tipo_entre = leer.nextInt();
                            switch (tipo_entre) {
                                case 1:
                                    int contjug = 0;
                                    for (Jugadas jo : jugadas_fav) {
                                        System.out.print(contjug);
                                        System.out.println(jo);
                                        contjug++;
                                    }
                                    System.out.println("elija su favorita: ");
                                    int opc_jug = leer.nextInt();
                                    personal.add(new Persona(nom_entre, ape_entre, años_entre).getEntrendadores().add(new Entrenador_principal(ex_jug, jugadas_fav.get(opc_jug), nombre, ape_entre, años_entre, 2000000)));
                                    break;
                                case 2:
                                    contjug = 0;
                                    for (Jugadas jo : jugadas_fav) {
                                        System.out.print(contjug);
                                        System.out.println(jo);
                                        contjug++;
                                    }
                                    System.out.println("elija su favorita: ");
                                    opc_jug = leer.nextInt();
                                    personal.add(new Persona(nom_entre, ape_entre, años_entre).getEntrendadores().add(new Asistente_Entrenador(ex_jug, jugadas_fav.get(opc_jug), nom_entre, ape_entre, años_entre, 1000000)));
                                    break;
                                case 3:
                                    contjug = 0;
                                    for (Jugadas jo : jugadas_fav) {
                                        System.out.print(contjug);
                                        System.out.println(jo);
                                        contjug++;
                                    }
                                    System.out.println("elija su favorita: ");
                                    opc_jug = leer.nextInt();
                                    personal.add(new Persona(nom_entre, ape_entre, años_entre).getEntrendadores().add(new Preparador_fisico(ex_jug, jugadas_fav.get(opc_jug), nom_entre, ape_entre, años_entre, 800000)));
                                    break;
                            }
                            break;
                        default:
                            System.out.println("Opcion no valida");
                    }
                    equipos.add(new Equipo(nombre, fecha, campeonatos, personal));
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("1 = jugador");
                    System.out.println("2 = medico ");
                    System.out.println("3 = entrenador");
                    System.out.println("ingrese a quien decea eliminar");
                    int opc_elim_gen = leer.nextInt();
                    switch (opc_elim_gen) {
                        case 1:
                            for (int i = 0; i < equipos.size(); i++) {
                                if (((Jugador)equipos.get(i).getPersonal().get(i)) instanceof Jugador) {
                                    System.out.println(i+""+(Jugador)equipos.get(i).getPersonal().get(i));
                                    
                                }
                            }
                            System.out.println("ingrese a quien desea eliminar");
                            int opc_elim_jug= leer.nextInt();
                            equipos.remove(equipos.get(opc_elim_jug).getPersonal().get(opc_elim_jug));
                            break;
                        case 2:
                            for (int i = 0; i < equipos.size(); i++) {
                                if (((medico)equipos.get(i).getPersonal().get(i)) instanceof medico) {
                                    System.out.println(i+""+(medico)equipos.get(i).getPersonal().get(i));
                                }
                            }
                            break;
                        case 3:
                            for (int i = 0; i < equipos.size(); i++) {
                                if (((Entrenador)equipos.get(i).getPersonal().get(i)) instanceof Entrenador) {
                                    System.out.println(i+""+(Entrenador)equipos.get(i).getPersonal().get(i));
                                }
                            }
                            break;
                    }
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opcion no valida");
            }
        }

    }
}
