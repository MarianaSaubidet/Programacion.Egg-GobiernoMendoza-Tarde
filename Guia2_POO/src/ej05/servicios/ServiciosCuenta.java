/*
 * Sin licencia.
 * Uso para capacitación
 * 2021 Año de la Prevención y Lucha contra el COVID-19.

• Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
• Método ingresar(double ingreso): el método recibe una cantidad de dinero a
ingresar y se la sumara a saldo actual.
• Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y
se la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
• Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar
que el usuario no saque más del 20%.
• Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.

 */
package ej05.servicios;

import ej05.entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author Adrian E. Camus
 */
public class ServiciosCuenta {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    int numeroCuenta;
    long dni;
    double saldoActual, interes;
    Cuenta c1 = new Cuenta();

    public Cuenta crearCuenta() {
        System.out.println("Ingrese el Nro de la Cuenta");
        numeroCuenta = leer.nextInt();
        c1.setNumeroCuenta(numeroCuenta);
        System.out.println("Ingrese el DNI del titular de la Cuenta");
        dni = leer.nextLong();
        c1.setDni(dni);
        System.out.println("Ingrese el Saldo");
        saldoActual = leer.nextDouble();
        c1.setSaldoActual(saldoActual);
        System.out.println("Ingrese el Interes de la cuenta");
        interes = leer.nextDouble();
        c1.setInteres(interes);
        return c1;
    }

    public void ingreso(Cuenta c,double ingreso){
        saldoActual = c.getSaldoActual()+ingreso;
        c.setSaldoActual(saldoActual);
    }
    
    public void retiro(Cuenta c, double retiro) {

        if (c.getSaldoActual() > retiro) {
            saldoActual = c.getSaldoActual() - retiro;
            c.setSaldoActual(saldoActual);
        } else {
            c.setSaldoActual(0);
        }
    }

    public void extraccionRapida(Cuenta c) {
        saldoActual = c.getSaldoActual();
        double retiro = saldoActual * .20;
        c.setSaldoActual(saldoActual - retiro);
        System.out.println("Monto a retirar $ " + retiro);
    }
    
}