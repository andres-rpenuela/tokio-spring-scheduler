package org.tokio.spring.springscheduler.scheduling;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class ProductScheduler {
    /**
     *
     * Param <b>cron</b> specifications:
     * - sec, min, hours, day of month (1-31), month (1,12), day of week (1,7)
     * - '*': any sec, min, hours, day of month, month
     * - '?': any day of week
     *
     * Param <b>zone</b> specification: Time zones are specified as IANA Time Zone identifiers (e.g., "UTC", "Europe/London", "America/New_York").
     * more info: <a href='https://en.wikipedia.org/wiki/List_of_tz_database_time_zones'>IANA Time Zone identifiers</a>
     */
    @Scheduled(cron = "0,30 * * * * ?",zone="Europe/London") // Ejecuta el metodo cada minuto
    public void doCronTaskOneMinute() {
        // Código de la tarea programada
        System.out.println("Tarea programada cada minuto.");
    }

    @Scheduled(cron = "0 0 12 * * ?") // Ejecuta el metodo todos los días a las 12:00 PM
    public void doCronTaskMiddleMorning() {
        // Código de la tarea programada
        System.out.println("Tarea programada ejecutada a las 12:00 PM.");
    }
}
