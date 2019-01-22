package com.kodilla.testing.forum.statistics;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsPresentationTestSuite {

    @Test
    public void test1CalculateAdvStatistics(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersMock= new ArrayList<String>();
        double postsMock = 0;
        double commentsMock = 0;
        when(statisticsMock.usersNames()).thenReturn(usersMock);
        when(statisticsMock.postsCount()).thenReturn(postsMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsMock);
        StatisticsPresentation statisticsPresentation = new StatisticsPresentation(statisticsMock);
        //When
        double[] result = statisticsPresentation.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(0, result[0], 0.1);
        Assert.assertEquals(0, result[1], 0.1);
        Assert.assertEquals(0, result[2], 0.1);
    }

    @Test
    public void test2CalculateAdvStatistics(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersMock= new ArrayList<String>();
        for (int i=0; i<100; i++){
            usersMock.add("n");
        }
        double postsMock = 1000;
        double commentsMock = 2000;
        when(statisticsMock.usersNames()).thenReturn(usersMock);
        when(statisticsMock.postsCount()).thenReturn(postsMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsMock);
        StatisticsPresentation statisticsPresentation = new StatisticsPresentation(statisticsMock);
        //When
        double[] result = statisticsPresentation.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(10, result[0], 0.1);
        Assert.assertEquals(2, result[1], 0.1);
        Assert.assertEquals(20, result[2], 0.1);
    }

    @Test
    public void test3CalculateAdvStatistics(){
        //Given
        Statistics statisticsMock = mock(Statistics.class);
        List<String> usersMock= new ArrayList<String>();
        for (int k=0; k<100; k++){
            usersMock.add("n");
        }
        double postsMock = 1000;
        double commentsMock = 500;
        when(statisticsMock.usersNames()).thenReturn(usersMock);
        when(statisticsMock.postsCount()).thenReturn(postsMock);
        when(statisticsMock.commentsCount()).thenReturn(commentsMock);
        StatisticsPresentation statisticsPresentation = new StatisticsPresentation(statisticsMock);
        //When
        double[] result = statisticsPresentation.calculateAdvStatistics(statisticsMock);
        //Then
        Assert.assertEquals(10, result[0], 0.1);
        Assert.assertEquals(0.5, result[1], 0.1);
        Assert.assertEquals(5, result[2], 0.1);
    }
}
