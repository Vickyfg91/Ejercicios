/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package daw;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import javax.swing.JOptionPane;

/**
 *
 * @author Victoria
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Menu con opciones
        String[] opcionesMenu = {"1-. Comprobar año bisiesto",
            "2-. Comprobar formato de fecha",
            "3-. Copia de una fecha",
            "4-. Número de días que tiene el mes",
            "5-. Obtener el día de la semana",
            "6-. Mostrar fecha completa",
            "7-. Sumar días a una fecha",
            "8-. Calcular días transcurridos entre fechas",
            "9-. Día siguiente",
            "10-. Día anterior",
            "11-. Calcular minutos entre fechas",
            "12-. Sumar segundos a una fecha",
            "13-. Salir",};
        JOptionPane.showMessageDialog(null, opcionesMenu);
        String opcionElegida;
        boolean continuar = true;
        do {
        
        opcionElegida = (String) JOptionPane.showInputDialog(null,
                "Elige una opción", "Opciones con fechas",
                JOptionPane.QUESTION_MESSAGE, null,
                opcionesMenu, "1-. Comprobar año bisiesto");
        switch (opcionElegida) {
            case "1-. Comprobar año bisiesto" -> {
                //solicitar usuario                
                String yearBisiesto = JOptionPane.showInputDialog("Introduzca el año:");
                int year = Integer.parseInt(yearBisiesto);

                LocalDate bisiestoYear = LocalDate.of(year, 1, 1);
                boolean resultado = UtilidadesFecha.esBisiesto(bisiestoYear);
                JOptionPane.showMessageDialog(null, "¿El año es bisiesto? " + resultado);
                break;
            }
            case "2-. Comprobar formato de fecha" -> {
                String fechaIntroducida = JOptionPane.showInputDialog("Introduzca una fecha en formato (yyyy-MM-dd):");
                try {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDate fechaValida = LocalDate.parse(fechaIntroducida, formatter);
                    boolean esValida = UtilidadesFecha.fechaValida(fechaValida.getYear(), fechaValida.getMonthValue(), fechaValida.getDayOfMonth());
                    if (esValida) {
                        JOptionPane.showMessageDialog(null, "La fecha es válida.");
                    } else {
                        JOptionPane.showMessageDialog(null, "La fecha no es válida.");
                    }
                } catch (DateTimeParseException e) {
                    JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto.");
                }
                break;
            }
            case "3-. Copia de una fecha" -> {
                String fechaOriginalIntr = JOptionPane.showInputDialog("Introduzca una fecha en formato (yyyy-MM-dd):");
                try {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDate fechaOriginal = LocalDate.parse(fechaOriginalIntr, formatter);
                    LocalDate copia = UtilidadesFecha.copiaFecha(fechaOriginal);
                    JOptionPane.showMessageDialog(null, "La copia de la fecha es: " + copia);
                } catch (DateTimeParseException e) {
                    JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto.");
                }
                break;
            }
            case "4-. Número de días que tiene el mes" -> {
                String fechaMesIntroducida = JOptionPane.showInputDialog("Introduzca una fecha en formato (yyyy-MM):");
                try {
                    fechaMesIntroducida += "-01";
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDate fechaMes = LocalDate.parse(fechaMesIntroducida, formatter);
                    int diasMes = UtilidadesFecha.diasMes(fechaMes);
                    JOptionPane.showMessageDialog(null, "El mes tiene " + diasMes + " días.");
                } catch (DateTimeParseException e) {
                    JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto.");
                }
                break;
            }
            case "5-. Obtener el día de la semana" -> {
                String fechaDiaSemanaIntro = JOptionPane.showInputDialog("Introduzca una fecha en formato (yyyy-MM-dd):");
                try {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDate fechaDiaSemana = LocalDate.parse(fechaDiaSemanaIntro, formatter);
                    String nombreDiaSemana = UtilidadesFecha.diaSemana(fechaDiaSemana);
                    JOptionPane.showMessageDialog(null, "El día de la semana es: " + nombreDiaSemana);
                } catch (DateTimeParseException e) {
                    JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto.");
                }
                break;
            }
            case "6-. Mostrar fecha completa" -> {
                String fechaCompletaIntro = JOptionPane.showInputDialog("Introduzca una fecha en formato (yyyy-MM-dd):");
                try {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDate fechaCompleta = LocalDate.parse(fechaCompletaIntro, formatter);
                    String fechaFormateada = UtilidadesFecha.mostrarFechaLarga(fechaCompleta);
                    JOptionPane.showMessageDialog(null, "La fecha completa es: " + fechaFormateada);
                } catch (DateTimeParseException e) {
                    JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto.");
                }
                break;
            }
            case "7-. Sumar días a una fecha" -> {
                String fechaInicialIntr = JOptionPane.showInputDialog("Introduzca una fecha en formato (yyyy-MM-dd):");
                try {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDate fechaInicial = LocalDate.parse(fechaInicialIntr, formatter);

                    String diasASumar = JOptionPane.showInputDialog("Introduzca el número de días a sumar:");
                    long diasASumarParseado = Long.parseLong(diasASumar);

                    LocalDate fechaNueva = UtilidadesFecha.sumarDias(diasASumarParseado, fechaInicial);

                    JOptionPane.showMessageDialog(null, "La nueva fecha después de sumar " + diasASumarParseado + " días es: " + fechaNueva);
                } catch (DateTimeParseException | NumberFormatException e) {
                    JOptionPane.showMessageDialog(null, "Formato de fecha o número de días incorrecto.");
                }
                break;
            }
            case "8-. Calcular días transcurridos entre fechas" -> {
                String fechaInicialIntro = JOptionPane.showInputDialog("Introduzca la fecha inicial en formato (yyyy-MM-dd):");
                String fechaFinalIn = JOptionPane.showInputDialog("Introduzca la fecha final en formato (yyyy-MM-dd):");

                try {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDate fechaInicial = LocalDate.parse(fechaInicialIntro, formatter);
                    LocalDate fechaFinal = LocalDate.parse(fechaFinalIn, formatter);

                    long diasTranscurridos = UtilidadesFecha.diasTranscurridos(fechaInicial, fechaFinal);

                    JOptionPane.showMessageDialog(null, "El número de días transcurridos entre las fechas es: " + diasTranscurridos);
                } catch (DateTimeParseException e) {
                    JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto.");
                }
                break;
            }
            case "9-. Día siguiente" -> {
                String fechaIntroducida = JOptionPane.showInputDialog("Introduzca una fecha en formato (yyyy-MM-dd):");
                try {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDate fecha = LocalDate.parse(fechaIntroducida, formatter);

                    LocalDate siguiente = UtilidadesFecha.siguienteDia(fecha);

                    JOptionPane.showMessageDialog(null, "El día siguiente es: " + siguiente);
                } catch (DateTimeParseException e) {
                    JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto.");
                }
                break;
            }
            case "10-. Día anterior" -> {
                String fechaIntroducida = JOptionPane.showInputDialog("Introduzca una fecha en formato (yyyy-MM-dd):");
                try {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDate fecha = LocalDate.parse(fechaIntroducida, formatter);

                    LocalDate anterior = UtilidadesFecha.anteriorDia(fecha);

                    JOptionPane.showMessageDialog(null, "El día anterior es: " + anterior);
                } catch (DateTimeParseException e) {
                    JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto.");
                }
                break;
            }
            case "11-. Calcular minutos entre fechas" -> {

                String fechaIntroducida = JOptionPane.showInputDialog("Ingrese una fecha en formato (yyyy-MM-dd):");
                try {
                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                    LocalDate fecha = LocalDate.parse(fechaIntroducida, formatter);

                    LocalDate diaAnterior = UtilidadesFecha.anteriorDia(fecha);

                    JOptionPane.showMessageDialog(null, "El día anterior es: " + diaAnterior);
                } catch (DateTimeParseException e) {
                    JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto.");
                }
                break;

            }
            case "12-. Sumar segundos a una fecha" -> {
                String fechaString = JOptionPane.showInputDialog("Ingrese una fecha en formato (yyyy-MM-dd HH:mm:ss):");
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
                LocalDateTime fecha = LocalDateTime.parse(fechaString, formatter);
                
                String segundosString = JOptionPane.showInputDialog("Ingrese la cantidad de segundos a sumar:");
                long segundosASumar = Long.parseLong(segundosString);
                
                LocalDateTime fechaNueva = UtilidadesFecha.sumarSegundos(segundosASumar, fecha);
                
                JOptionPane.showMessageDialog(null, "La nueva fecha después de sumar " + segundosASumar + " segundos es: " + fechaNueva);
            } catch (DateTimeParseException | NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Formato de fecha o cantidad de segundos incorrectos.");
            }
            break;
            }
            default -> {
                continuar = false;
            }
            }
        
        
        } while(continuar);


        }
}
