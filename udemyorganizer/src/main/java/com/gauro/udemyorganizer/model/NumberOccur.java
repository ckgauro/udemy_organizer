package com.gauro.udemyorganizer.model;

import lombok.Builder;
import lombok.Data;

/**
 * @author Chandra
 */
@Data
@Builder
public class NumberOccur {
    int luckyNumber;
    int drawnTimes;
    String numberType;

}
