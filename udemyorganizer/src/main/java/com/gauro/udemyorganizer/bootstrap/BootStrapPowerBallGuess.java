package com.gauro.udemyorganizer.bootstrap;

import com.gauro.udemyorganizer.model.NumberOccur;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Chandra
 */
@Slf4j
@Component
public class BootStrapPowerBallGuess implements CommandLineRunner {
    List<NumberOccur> lsNumberOccur=new ArrayList<>();
    @Override
    public void run(String... args) throws Exception {
        storeNumber();
        findLuckumber();

    }

    private void storeNumber() {
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(61).drawnTimes(78).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(32).drawnTimes(77).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(21).drawnTimes(73).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(63).drawnTimes(73).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(69).drawnTimes(72).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(23).drawnTimes(70).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(36).drawnTimes(70).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(39).drawnTimes(69).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(62).drawnTimes(69).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(59).drawnTimes(68).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(20).drawnTimes(66).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(3).drawnTimes(65).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(27).drawnTimes(65).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(28).drawnTimes(65).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(37).drawnTimes(65).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(53).drawnTimes(65).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(10).drawnTimes(64).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(6).drawnTimes(63).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(64).drawnTimes(63).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(33).drawnTimes(62).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(56).drawnTimes(62).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(16).drawnTimes(61).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(40).drawnTimes(61).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(22).drawnTimes(60).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(41).drawnTimes(60).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(8).drawnTimes(59).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(14).drawnTimes(59).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(15).drawnTimes(59).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(17).drawnTimes(59).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(18).drawnTimes(59).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(44).drawnTimes(59).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(52).drawnTimes(59).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(45).drawnTimes(58).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(57).drawnTimes(58).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(2).drawnTimes(57).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(12).drawnTimes(57).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(19).drawnTimes(57).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(42).drawnTimes(57).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(47).drawnTimes(57).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(67).drawnTimes(57).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(68).drawnTimes(57).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(30).drawnTimes(55).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(50).drawnTimes(55).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(54).drawnTimes(55).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(55).drawnTimes(55).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(1).drawnTimes(54).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(5).drawnTimes(54).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(7).drawnTimes(54).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(11).drawnTimes(54).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(65).drawnTimes(54).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(38).drawnTimes(53).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(48).drawnTimes(53).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(25).drawnTimes(52).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(29).drawnTimes(52).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(58).drawnTimes(52).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(60).drawnTimes(52).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(66).drawnTimes(52).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(31).drawnTimes(51).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(43).drawnTimes(50).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(9).drawnTimes(49).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(51).drawnTimes(49).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(35).drawnTimes(47).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(46).drawnTimes(47).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(49).drawnTimes(47).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(4).drawnTimes(46).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(24).drawnTimes(46).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(13).drawnTimes(45).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(26).drawnTimes(44).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(34).drawnTimes(44).numberType("number").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(24).drawnTimes(45).numberType("powerball").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(18).drawnTimes(42).numberType("powerball").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(4).drawnTimes(36).numberType("powerball").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(13).drawnTimes(34).numberType("powerball").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(21).drawnTimes(34).numberType("powerball").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(6).drawnTimes(33).numberType("powerball").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(10).drawnTimes(33).numberType("powerball").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(26).drawnTimes(33).numberType("powerball").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(3).drawnTimes(32).numberType("powerball").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(19).drawnTimes(32).numberType("powerball").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(5).drawnTimes(31).numberType("powerball").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(8).drawnTimes(31).numberType("powerball").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(9).drawnTimes(31).numberType("powerball").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(11).drawnTimes(31).numberType("powerball").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(25).drawnTimes(31).numberType("powerball").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(14).drawnTimes(30).numberType("powerball").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(17).drawnTimes(29).numberType("powerball").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(1).drawnTimes(28).numberType("powerball").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(2).drawnTimes(28).numberType("powerball").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(20).drawnTimes(28).numberType("powerball").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(22).drawnTimes(28).numberType("powerball").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(7).drawnTimes(26).numberType("powerball").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(16).drawnTimes(26).numberType("powerball").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(15).drawnTimes(25).numberType("powerball").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(12).drawnTimes(24).numberType("powerball").build());
        lsNumberOccur.add(NumberOccur.builder().luckyNumber(23).drawnTimes(22).numberType("powerball").build());

    }

    private void findLuckumber() {
        lsNumberOccur.forEach(el->{
            System.out.println(el);
        });
    }
}
