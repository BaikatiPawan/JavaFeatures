package com.baikati.supplier;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.UUID;
import java.util.function.Supplier;

public class SupplierDemo {
    public static void main(String[] args) {
        Supplier<Integer> supplier = () -> (int) (Math.random() * 10000);
        System.out.println(supplier.get());
        System.out.println(supplier.get());

        Supplier<LocalDateTime> localDateTimeSupplier = () -> LocalDateTime.now();
        System.out.println(localDateTimeSupplier.get());

        DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        Supplier<String> supplier1 = ()->dateFormat.format(LocalDateTime.now());
        System.out.println(supplier1.get());



    }
}
