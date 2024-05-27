package Directorio.Parcial;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class ExamParcial {
    public static void AgregarNave(ArrayList<String> Listaauto) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese el nombre del vehiculo que desea cargar");
      Listaauto.add(sc.nextLine());
      System.out.println("Vehiculo ingresado correctamente");
      sc.nextLine();
    }
    public static void BuscarNave(ArrayList<String> Listaauto) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese el nombre del vehiculo que desea buscar");
      String rta = sc.nextLine();
      for (String s : Listaauto) {
        if (rta.equalsIgnoreCase(s)) {
          System.out.println("El vehiculo " + s + " está en el sistema");
          return;
        }
      }
      System.out.println("El vehiculo no está en el sistema");
      sc.nextLine();
    }
    public static void EliminarNave(ArrayList<String> Listaauto) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese el nombre del vehiculo que desea eliminar");
      String rta = sc.nextLine();
      if (Listaauto.remove(rta)) {
        System.out.println("Se ha eliminado correctamente");
      } else {
        System.out.println("El vehiculo no está en la lista");
      }
      sc.nextLine();
    }
    public static void ListarNave(ArrayList<String> Listaauto) {
      Scanner sc = new Scanner(System.in);
      System.out.println("============Vehiculos============");
      for (String elemento : Listaauto) {
        System.out.println(elemento);
      }
      sc.nextLine();
    }
    public static void Ordenamiento(ArrayList<String> Listaauto) {
      Scanner sc = new Scanner(System.in);
      Collections.sort(Listaauto);
      System.out.println("Se ha ordenado la lista");
      sc.nextLine();
    }
    public static void EditNave(ArrayList<String> Listaauto) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese el indice del vehiculo que desea modificar");
      int indice = sc.nextInt();
      sc.nextLine(); // Consumir la nueva línea
      if (indice >= 0 && indice < Listaauto.size()) {
        System.out.println("El vehiculo que desea modificar es: " + Listaauto.get(indice));
        System.out.println("Ingrese el nuevo vehiculo a cargar");
        String nuevoVehiculo = sc.nextLine();
        Listaauto.set(indice, nuevoVehiculo);
        System.out.println("Vehiculo modificado correctamente");
      } else {
        System.out.println("Error: el índice está fuera del rango");
      }
      sc.nextLine();
    }
    public static void menu() {
      System.out.println("==================================");
      System.out.println("GESTIÓN DE VENTA DE VEHÍCULOS - MENÚ DE OPCIONES");
      System.out.println("==================================");
      System.out.println("1. Agregar vehículo");
      System.out.println("2. Buscar vehículo");
      System.out.println("3. Eliminar vehículo");
      System.out.println("4. Listar vehículos");
      System.out.println("5. Ordenar vehículos alfabéticamente");
      System.out.println("6. Editar vehículo por índice");
      System.out.println("7. Salir");
      System.out.println("==================================");
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      ArrayList<String> Listaauto = new ArrayList<>();
      Listaauto.add("Porsche 911");
      Listaauto.add("Nissan Skyline");
      Listaauto.add("Honda NSX");
      Listaauto.add("Ford GT");
      Listaauto.add("Mazda RX7");

      int rta;
      do {
        menu();
        rta = sc.nextInt();
        sc.nextLine(); // Consumir la nueva línea

        switch (rta) {
          case 1:
            AgregarNave(Listaauto);
            break;
          case 2:
            BuscarNave(Listaauto);
            break;
          case 3:
            EliminarNave(Listaauto);
            break;
          case 4:
            ListarNave(Listaauto);
            break;
          case 5:
            Ordenamiento(Listaauto);
            break;
          case 6:
            EditNave(Listaauto);
            break;
          case 7:
            System.out.println("Saliendo del programa...");
            break;
          default:
            System.out.println("Error: ingrese un número válido.");
        }
      } while (rta != 7);
    }
  }

