package com.avic.common.utils;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.*;

/**
 * @author sconglee
 * @date 2019/10/24
 */
public class CountFinalScore {

    private final static Log logger = LogFactory.getLog(CountFinalScore.class);

    private CountFinalScore() {
    }

    public static Map<String, Object> getFinalScore(List<String> pointList, String itemWeight) {


        logger.info(pointList);
        logger.info(itemWeight);
        logger.info(";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;");
        Map map = new HashMap();
        List<List<String>> pointList1 = new ArrayList<>();
        List<String> itemWeightList = Arrays.asList(itemWeight.split(","));
        int expertNumber = pointList.size();


        for (String point : pointList) {
            pointList1.add(Arrays.asList(point.split(",")));
        }
        int Number = pointList1.get(0).size();

        List<List<String>> pointList2 = new ArrayList<>();
        for (int i = 0; i < Number; i++) {
            pointList2.add(ConvertList(pointList1, i));
        }
        logger.info(pointList2);
        logger.info(expertNumber);
        logger.info("-----------------------------");

        //去掉最高分和最低分然后求取平均分
        List<Float> averageScoreList = new ArrayList<>();
        for (List<String> pointList3 : pointList2) {
            float sum = 0;
            float averageScore = 0;
            logger.info("!!!!!!!!!!!!!!!!!!!!");
            logger.info(pointList3);
            for (int z = 0; z < pointList3.size(); z++) {
                sum = Float.parseFloat(pointList3.get(z)) + sum;
            }
            List<Integer> integerList = new ArrayList<>();
            for (String x : pointList3) {
                integerList.add(Integer.parseInt(x));
            }
            averageScore = (sum - Collections.max(integerList) - Collections.min(integerList)) / (expertNumber - 2);
            logger.info("'''''''''''''''");
            logger.info(Collections.max(integerList));
            logger.info(Collections.min(integerList));
            logger.info("''''''''''''''''");
            averageScoreList.add(averageScore);
        }
        logger.info(averageScoreList);
        logger.info(itemWeightList);
        logger.info("________________________");
        List<String> finalScoreList = new ArrayList<>();
        for (int k = 0; k < Number; k++) {
            finalScoreList.add(String.valueOf(averageScoreList.get(k) * Float.parseFloat(itemWeightList.get(k))));
        }

        //最后总得分
        float totalScore = 0;
        for (int m = 0; m < finalScoreList.size(); m++) {
            totalScore = Float.parseFloat(finalScoreList.get(m)) + totalScore;
        }
        logger.info(finalScoreList);
        logger.info(totalScore);

        map.put("finalScore", finalScoreList);
        map.put("totalScore", totalScore);

        return map;
    }

    public static List<String> ConvertList(List<List<String>> list, int j) {
        List<String> list1 = new ArrayList<>();
        for (List<String> list2 : list) {
            list1.add(list2.get(j));
        }
        return list1;
    }
}
