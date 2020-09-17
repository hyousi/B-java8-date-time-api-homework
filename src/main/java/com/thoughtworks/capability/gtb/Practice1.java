package com.thoughtworks.capability.gtb;

import static java.time.temporal.ChronoUnit.DAYS;

import java.time.LocalDate;
import java.time.Year;

/**
 * 计算任意日期与下一个劳动节相差多少天
 *
 * @author itutry
 * @create 2020-05-15_16:33
 */
public class Practice1 {

  public static long getDaysBetweenNextLaborDay(LocalDate date) {
    int year = date.getYear();
    LocalDate laborDate = LocalDate.of(year, 5, 1);
    long daysBetween = DAYS.between(date, laborDate);

    if (daysBetween < 0) {
      daysBetween += Year.of(year+1).length();
    }
    return daysBetween;
  }
}
