package ru.geekbrains.algorithms.lesson2;

import java.math.BigDecimal;
import java.util.UUID;

import lombok.*;

@Value
public class Notebook implements Comparable<Notebook>{
    BigDecimal price;
    int memory;
    Producer producer;
    UUID serialId = UUID.randomUUID();

    @Override
    public int compareTo(Notebook o) {
        int result = price.compareTo(o.getPrice());
        if(result == 0) {
            result = Integer.compare(memory, o.getMemory());
            if (result == 0) {
             return producer.compareTo(o.getProducer());
            }
            return result;
            }
        return 0;
    }
}
