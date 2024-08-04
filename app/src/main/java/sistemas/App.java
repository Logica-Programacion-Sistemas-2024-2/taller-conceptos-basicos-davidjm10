/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sistemas;

import java.util.Scanner;

public class App {
    
    // Diseñe un algoritmo para saludar al usuario: Hola usuario. El nombre del usuario es ingresado por teclado
    public static String saludarUsuario(String nombre) {
        try {
            return "hola" + nombre;
        } catch (Exception e) {
            return "Error: " + e.getMessage();
        }
    }

    // Diseñe un algoritmo que lea por teclado una velocidad en Km/seg y la convierta a metros/seg y a metros/hora
    // retorne el valor en formato string (metrosPorSeg + "|" + metrosPorHora)
    public static String convertirVelocidad(double kmPorSeg) {
        try {
            double metrosPorSeg = kmPorSeg * 1000;
            double metrosPorHora = metrosPorSeg * 3600;
            return metrosPorSeg + "|" + metrosPorHora;
        } catch (Exception e) {
            return "0|0";
        }
    }

    // Solicitar al usuario ingresar una cantidad expresada en cc (centímetros cúbicos) y devolver su cantidad en litros
    public static int convertirCcALitros(double cc) {
        try {
            int litros = (int)(cc / 1000);
            return litros;
        } catch (Exception e) {
            return -1;
        }
    }

    // Solicitar al usuario ingresar una cantidad en dólares y convertirla a pesos según la TRM del día
    public static int convertirDolaresAPesos(double dolares, double trm) {
        try {
            int pesos = (int)(dolares * trm);
            return pesos;
        } catch (Exception e) {
            return -1;
        }
    }

    // Solicitar al usuario ingresar la temperatura en grados centígrados y convertirla en grados Fahrenheit (averiguar la fórmula) F = 32 + ( 9 * C / 5)
    public static int convertirCelsiusAFahrenheit(double celsius) {
        try {
            int fahrenheit = (int)((9.0 / 5.0) * celsius + 32);
            return fahrenheit;
    
        } catch (Exception e) {
            return -1;
        }
    }

    // Solicitar al usuario ingresar Nro de Días nro de horas nro de minutos y nro segundos y convertir todo a segundos.
    public static int convertirATotalSegundos(int dias, int horas, int minutos, int segundos) {
        try {
            long segundosDia = dias * 86400;
        
            long segundosHora = horas * 3600;
            
            long segundosMinuto = minutos * 60;
            
            long segundosTotales = segundosDia + segundosHora + segundosMinuto + segundos;
            
            int segundosTotalesInt = (int) segundosTotales;
            return segundosTotalesInt;
        } catch (Exception e) {
            return -1;
        }
      
    }

    // Un usuario tiene un sistema de báscula para pesar camiones, dado el peso de un camión debe sacar el peso neto de la carga en kilos y toneladas
    // retorne el valor en formato string (pesoEnKg + "|" + pesoEnToneladas)
    public static String calcularPesoNeto(double peso) {
        try {
                double pesoCamionVacio = 3000;
                
                double pesoNetoKg = pesoTotal - pesoCamionVacio;
                
                double pesoNetoToneladas = pesoNetoKg / 1000;

                return pesoNetoKg + "|" + pesoNetoToneladas;
            } catch (Exception e) {
                return "0|0"; 
            }
        }

    // Diseñe un algoritmo que calcule el tiempo necesario para alcanzar un destino dado por el usuario quien además ingresará la velocidad promedio en kilómetros/hora y la distancia en kilómetros
    public static int calcularTiempoViaje(double distancia, double velocidadKilometros, double velocidadHora) {
        try {
            double tiempoHoras = distancia / velocidadKilometros;
        
        return (int) tiempoHoras; 
            
        } catch (Exception e) {
            return -1;
        }
       
    }

    // Un avión necesita cargar combustible para cubrir sus rutas programadas en el día. Cada 0.2 toneladas de combustible puede recorrer 60.8 Km en velocidad de crucero. En el despegue el avión consume 1.2 toneladas de combustible y en el aterrizaje consume 0.4 toneladas. El piloto desea un algoritmo que ingresando 4 rutas y el kilometraje de cada ruta obtenga la cantidad de combustible que debe tanquear en el avión.
    public static int calcularCombustible(double ruta1, double ruta2, double ruta3, double ruta4) {
        try {
            double distanciaTotal = ruta1 + ruta2 + ruta3 + ruta4;
            double combustibleCruzero = distanciaTotal / 60.8 * 0.2;
            double combustibleDespegue = 1.2; 
            double combustibleAterrizaje = 0.4 * 4; 
            double combustibleDespeguesAdicionales = 1.2 * 3; 
            double totalCombustible = combustibleCruzero + combustibleDespegue + combustibleAterrizaje + combustibleDespeguesAdicionales;
            
            return (int) totalCombustible;
        } catch (Exception e) {
            return -1; 
        }
    }
    

    // Diseñar un algoritmo que calcule el peso neto en la luna de un peso terrestre ingresado por teclado. La gravedad de la Luna es de alrededor del 17% más que la de la tierra
    public static int calcularPesoLunar(double pesoTierra) {
        try {
            double pesoLunar = pesoTierra * 0.83;
            return (int) pesoLunar;
        } catch (Exception e) {
            return -1;
        }
        
    }

    // Diseñar un algoritmo que calcule el saldo que debe haber en una taquilla de un banco. El cajero deberá ingresar la base el total de recaudos y el total de retiros
    public static int calcularSaldoTaquilla(double base, double ingresos, double retiros) {
        try {
            double saldoFinal = base + ingresos - retiros;
            return (int) saldoFinal;
        } catch (Exception e) {
            return -1;
        }
    }

    // Diseñe un algoritmo para calcular la propina en un restaurante(10%) el impuesto al consumo (8%) y el valor final que deberá pagar ingresando el valor de la comida.
    // retorne el valor en formato string (propina + "|" + impuesto + "|" + total)
    public static String calcularCuentaRestaurante(double costoComida) {
        try {
            double propina = costoComida * 0.10;
            double impuestoConsumo = costoComida * 0.08;
            double total = costoComida + propina + impuestoConsumo;
            return propina + "|" + impuestoConsumo + "|" + total;
        } catch (Exception e) {
            return -1 + "|" + -1 + "|" + -1;
        }
    }

    // Diseñar un algoritmo que obtenga los puntos finales de un equipo de fútbol (puntuación según lineamientos de Fifa) a partir de los datos ingresados por teclado: Número de partidos ganados número de partidos perdidos número de partidos empatados.
    public static int calcularPuntosFutbol(int ganados, int perdidos, int empatados) {
        try {
            int puntosGanados = ganados * 3;
            int puntosEmpatados = empatados * 1;
            int puntosFinales = puntosGanados + puntosEmpatados;
            
            return puntosFinales;
        } catch (Exception e) {
            return -1;
        }
    }

    // Elaborar un algoritmo que dadas todas las 5 notas y los 5 porcentajes para una materia calcule la nota final.
    public static int calcularNotaFinal(double nota1, double nota2, double nota3, double nota4, double nota5,
                                        double porcentaje1, double porcentaje2, double porcentaje3, double porcentaje4, double porcentaje5) {
        try {
            double pesoNota1 = nota1 * porcentaje1;
            double pesoNota2 = nota2 * porcentaje2;
            double pesoNota3 = nota3 * porcentaje3;
            double pesoNota4 = nota4 * porcentaje4;
            double pesoNota5 = nota5 * porcentaje5;
            double puntajeTotal = pesoNota1 + pesoNota2 + pesoNota3 + pesoNota4 + pesoNota5;
            double notaFinal = puntajeTotal / (porcentaje1 + porcentaje2 + porcentaje3 + porcentaje4 + porcentaje5);
            return (int) notaFinal;
         }   catch (Exception e) {
            return -1;
        }
    }

    // Elaborar un algoritmo que dados los 5 porcentajes de una materia y las 4 primeras notas calcule cuánto tiene que sacar para ganar si el puntaje mínimo es 3.
    public static int calcularNotaNecesaria(double porcentaje1, double porcentaje2, double porcentaje3, double porcentaje4, double porcentaje5, double nota1, double nota2, double nota3, double nota4) {
        try {
            double notaMinimaNecesaria = 3 / 5;
        return (int) notaMinimaNecesaria;
        } catch (Exception e) {
            return -1;
        }
    }

    // Se requiere un algoritmo para calcular el salario a pagar a un trabajador con los siguientes datos ingresados por teclado: cantidad de horas normales laboradas cantidad de horas extras diurnas laboradas cantidad de horas extras nocturnas laboradas valor de la hora normal. El valor de las horas extras diurnas tienen un recargo adicional del 15% sobre la hora normal. El valor de las horas extras nocturnas tienen un recargo adicional del 35% sobre la hora normal.
    public static int calcularSalario(int horasNormales, int horasExtrasDiurnas, int horasExtrasNocturnas, double valorHoraNormal) {
        try {
            double salarioNormales = horasNormales * valorHoraNormal;
            double salarioExtrasDiurnas = horasExtrasDiurnas * valorHoraNormal * 1.15;
            double salarioExtrasNocturnas = horasExtrasNocturnas * valorHoraNormal * 1.35;
            double salarioTotal = salarioNormales + salarioExtrasDiurnas + salarioExtrasNocturnas;
        return (int) salarioTotal;
        } catch (Exception e) {
            return -1;
        }
    }

    // Diseñe un algoritmo que calcule el área de un triángulo rectángulo.
    public static int calcularAreaTriangulo(double base, double altura) {
        try {
            double area = (base * altura) / 2;
            return (int) area;
        } catch (Exception e) {
            return -1;
        }
    }

    // Diseñe un algoritmo que calcule el perímetro de un cuadrado.
    public static int calcularPerimetroCuadrado(double lado) {
        try {
            double perimetro = lado * 4;
            return (int) perimetro;
        } catch (Exception e) {
            return -1;
        }
    }

    // Diseñe un algoritmo que calcule el volumen de un cilindro.
    public static int calcularVolumenCilindro(double radio, double altura) {
        try {
            double volumen = Math.PI * Math.pow(radio, 2) * altura;
        return (int) volumen;
        } catch (Exception e) {
            return -1;
        }
    }

    // Diseñe un algoritmo que calcule el área del círculo. El radio se pide por teclado.
   
    public static int calcularAreaCirculo(double radio) {
        try {
         double area = Math.PI * Math.pow(radio, 2);
            return (int) area;
        } catch (Exception e) {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese el radio del círculo:");
        if (!scanner.hasNextDouble()) {
            System.out.println("Error: Por favor, ingrese un número válido para el radio.");
        }
        double radio = scanner.nextDouble();
        
        int area = calcularAreaCirculo(radio);
        
        if (area == -1) {
            System.out.println("Error al calcular el área.");
        } else {
            System.out.println("El área del círculo es: " + area);
        }
        
        scanner.close();
    }
}
