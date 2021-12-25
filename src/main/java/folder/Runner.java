/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package folder;

import java.util.LinkedList;
import java.util.List;
import java.util.function.IntFunction;

/**
 *
 * @author mcaikovs
 */
public class Runner {

    int average(List<Long> results) {
        return (int) results.stream().mapToLong(l -> l).average().getAsDouble();
    }

    void measure(IntFunction<Long> code) {
        List<Long> results = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            long start = System.currentTimeMillis();
            long r = code.apply(40);
            long time = System.currentTimeMillis() - start;
            results.add(time);
            System.out.println(i+" "+r + " in " + time + " ms");
        }
        System.out.println("average: " + average(results));
    }
}
