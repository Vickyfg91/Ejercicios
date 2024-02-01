/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;
import java.time.DateTimeException;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
// Enumerado para los meses del año (Enero, ...)
import java.time.Month;
import java.time.MonthDay;
import java.time.Period;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.time.temporal.ChronoUnit;
import java.util.Locale;

/**
 *
 * @author Victoria
 */
public class UtilidadesFecha {
    
    //bisiesto(LocalDate fecha): devolverá si el año de la fecha es bisiesto o no.
    public static boolean esBisiesto(LocalDate fecha) {
        return fecha.isLeapYear();
    }

    /*fechaValida(int day, int month, int year): devuelve si la fecha pasada es 
    una fecha correcta, por ejemplo el día del mes no es 33, el mes del año no es 13, etc. 
    Usa la excepción que se lanza a la hora de crear el objeto LocalDate.*/
    public static boolean fechaValida(int year, int month, int day) {
        try {
            LocalDate fecha = LocalDate.of(year, month, day);
            return true;
        } catch (DateTimeException dte) {
            return false;
        }
    }

    //copia(LocalDate fecha): devolverá un nuevo objeto LocalDate haciendo una copia de fecha./
    public static LocalDate copiaFecha(LocalDate fecha) {
        LocalDate copia = LocalDate.of(fecha.getDayOfYear(), fecha.getMonth(),
                fecha.getDayOfMonth());
        return copia;
    }

    //diasMes(LocalDate fecha): devolverá el número de días que tiene el mes para la fecha.
    public static int diasMes(LocalDate fecha) {
        return fecha.lengthOfMonth();
    }

    //diaSemana(LocalDate fecha): devolverá el día de la semana de la fecha (0 para domingo, ..., 6 para sábado).
    //No se como hacer para que le domingo valga 0
    public static String diaSemana(LocalDate fecha) {
        DayOfWeek diaSemana = fecha.getDayOfWeek();
        String valorDiaSemana = diaSemana.getDisplayName(TextStyle.FULL, Locale.ENGLISH);
        return valorDiaSemana;
    }

    //mostrarFechaLarga(LocalDate fecha): mostrará la fecha en formato largo, empezando por el día de la semana (ejemplo: martes 2 de septiembre de 2003).
    public static String mostrarFechaLarga(LocalDate fecha) {
        return fecha.getDayOfWeek() + "" + fecha.getDayOfMonth() + " de "
                + fecha.getMonth() + " de " + fecha.getYear();
    }

    //sumarDias(long numeroDias, LocalDate fecha): devolverá una nueva fecha después de haber sumado los días que se pasan como parámetro al objeto fecha.
    public static LocalDate sumarDias(long numeroDias, LocalDate fecha) {
        return fecha.plusDays(numeroDias);
    }

    //diasTranscurridos(LocalDate fechaInicial, LocalDate fechaFinal): método que devolverá el número de días transcurridos desde la fecha inicial hasta la fecha final.
    public static long diasTranscurridos(LocalDate fechaInicial, LocalDate fechaFinal) {
        return ChronoUnit.DAYS.between(fechaInicial, fechaFinal);
    }
    
    //siguienteDia(LocalDate fecha): devolverá un nuevo objeto LocalDate, pasando al día siguiente de la fecha pasada.
    public static LocalDate siguienteDia(LocalDate fecha){
         return fecha.plusDays(1);
    }
    
    //anteriorDia(LocalDate fecha): igual que el método anterior pero pasando al día anterior.
    public static LocalDate anteriorDia (LocalDate fecha){
        return fecha.minusDays(1);
    }
    
    //minutosEntre(LocalDateTime fecha1, LocalDateTime fecha2): calcula los minutos entre los dos objetos, fecha1 y fecha2.
    public static long minutosEntre(LocalDateTime fecha1, LocalDateTime fecha2){
        return ChronoUnit.MINUTES.between(fecha1, fecha2);
    }
    
    //sumarSegundos(long numeroSegundos, LocalDateTime fecha): devolverá un nuevo objeto LocalDateTime después de haber sumado los segundos que se pasan como parámetro.
    public static LocalDateTime sumarSegundos(long numeroSegundos, LocalDateTime fecha){
        return fecha.plusSeconds(numeroSegundos);
    }
    

}

