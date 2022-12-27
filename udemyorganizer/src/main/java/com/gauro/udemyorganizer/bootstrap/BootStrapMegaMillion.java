package com.gauro.udemyorganizer.bootstrap;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author Chandra
 */
@Slf4j
@Component
public class BootStrapMegaMillion  implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        List<Integer> luckNumber= Stream.of(14, 17,38,31,10,8,4,48,64,15,3,20,43,7,11,53,48,58,25,62,44,24,28,42,56,34,59,40,37,56,34,59,40,70,16)
                .collect(Collectors.toList());
        List<Integer> luckMega= Stream.of(22,11,9,10,24,17,19,18,25,13,4,14,1,12,20).collect(Collectors.toList());
        List<List<Integer>> myguessedNumber=getLuckyNumber(luckNumber,luckMega,15);
        log.info("luckNumber ==>"+luckNumber.size());
        log.info("luckMega ==>"+luckMega.size());

        log.info("Hello Mega Million");
    }

    private List<List<Integer>> getLuckyNumber(List<Integer> luckNumber, List<Integer> luckMega, int number) {
        List<Integer> localuckNumber=new ArrayList<>(luckNumber);
        Collections.copy(localuckNumber, luckNumber);
        List<List<Integer>> localNumber=new ArrayList<>();
        for(int i=0;i<number;i++){
            List<Integer> list=new ArrayList<>();
            while(list.size()<5){
                int rnd = (int) ((Math.random() * (localuckNumber.size() - 0)));
              //  System.out.println("Size:"+localuckNumber.size()+"\tRnd:"+rnd);
                if(!list.contains(localuckNumber.get(rnd))){
                    list.add(localuckNumber.get(rnd));
                }
                localuckNumber.remove(rnd);
                if(localuckNumber.size()<=0){
                    localuckNumber=new ArrayList<>(luckNumber);
                }
            }
            int rnd = (int) ((Math.random() * (luckMega.size() - 0)));
            //System.out.println("Size:"+luckMega.size()+"\tRnd:"+rnd);
            list.add(luckMega.get(rnd));
            luckMega.remove(rnd);
          //  System.out.println(localuckNumber.size());
            System.out.println(i+"==>:"+list.toString());
        }


        return localNumber;
    }
}
