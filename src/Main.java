import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombreEmpleado = "";
        String documentoEmpleado= "";
        String diaDescanso = "";
        double salarioBruto = 0;
        double salarioNeto = 0;
        double deduccionPension = 0;
        double deduccionSalud = 0;
        double horasTrabajadas = 0;
        double valorHora = 0;
        double bonificacionEmpleado = 0;
        double valorSalarioMinimo = 1423500;
        double auxilioTransporte = 200000;
        double cantidadHorasExtras = 0;
        double valorHoraExtra = 0;
        double totalValorHorasExtras = 0;

        System.out.print("Ingrese el nombre del empleado: ");
        nombreEmpleado = sc.nextLine();
        System.out.print("Ingrese el documento del empleado: ");
        documentoEmpleado = sc.nextLine();
        System.out.println("Ingrese el día de descanso: (Lunes - Viernes)");
        diaDescanso = sc.nextLine();

    }
}