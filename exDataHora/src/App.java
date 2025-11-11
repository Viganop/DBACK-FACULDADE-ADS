import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Instaciando tadas e horas atuais
        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        // Instanciando datas a partir de Strings
        LocalDate d04 = LocalDate.parse("2024-06-15");
        LocalDateTime d05 = LocalDateTime.parse("2024-06-15T10:30:00");
        Instant d06 = Instant.parse("2024-07-15T01:30:00Z");
        Instant d07 = Instant.parse("2024-07-15T01:30:00-03:00");

        // Instanciando datas apartir de formatos personalizados
        LocalDate d08 = LocalDate.parse("15/06/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime d09 = LocalDateTime.parse("15/06/2024 10:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        LocalDate d10 = LocalDate.of(2024, 6, 15 );
        LocalDateTime d11 = LocalDateTime.of(2024, 6, 15, 10,30);

        // formatando datas para String
        String d12 = d04.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        String d13 = d05.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        String d14 = (DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()).format(d06));

        // convertimento entre tipos de data/hora
        LocalDate d15 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate d16 = LocalDate.ofInstant(d06, ZoneId.systemDefault());

        // Extraindo componentes individuais
        int d17 = d05.getDayOfMonth();
        int d18 = d05.getMonthValue();
        int d19 = d05.getYear();
        int d20 = d05.getHour();
        int d21 = d05.getMinute();
        int d22 = d05.getSecond();

        //Operações de adição e subtração
        LocalDate d23 = d04.minusDays(7);
        LocalDate d24 = d04.plusDays(7);
        LocalDateTime d25 = d05.minusDays(7);
        LocalDateTime d26 = d05.plusDays(7);
        Instant d27 = d06.minus(7, ChronoUnit.DAYS);
        Instant d28 = d06.plus(7, ChronoUnit.DAYS);

        // Saidas
        System.out.println("d01 = " + d01);
        System.out.println("d02 = " + d02);
        System.out.println("d03 = " + d03);
        System.out.println("d04 = " + d04);
        System.out.println("d05 = " + d05);
        System.out.println("d06 = " + d06);
        System.out.println("d07 = " + d07);
        System.out.println("d08 = " + d08);
        System.out.println("d09 = " + d09);
        System.out.println("d10 = " + d10);
        System.out.println("d11 = " + d11);
        System.out.println("d12 = " + d12);
        System.out.println("d13 = " + d13);
        System.out.println("d14 = " + d14);
        System.out.println("d15 = " + d15);
        System.out.println("d16 = " + d16);
        System.out.println("d17 = " + d17);
        System.out.println("d18 = " + d18);
        System.out.println("d19 = " + d19);
        System.out.println("d20 = " + d20);
        System.out.println("d21 = " + d21);
        System.out.println("d22 = " + d22);
        System.out.println("d23 = " + d23);
        System.out.println("d24 = " + d24);
        System.out.println("d25 = " + d25);
        System.out.println("d26 = " + d26);
        System.out.println("d27 = " + d27);
        System.out.println("d28 = " + d28);
        


    }
}
