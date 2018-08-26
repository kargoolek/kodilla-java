package com.kodilla.testing.forum.statistics;

import org.junit.*;

import java.util.ArrayList;
import java.util.Random;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class StatisticsTestSuite {
    StatsTools statsTools = new StatsTools();
    Statistics statsMock = mock(Statistics.class);
    ArrayList<String> usersNames;

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Test Suite: begin");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("Test Suite: end");
    }

    @Before
    public void before(){
        System.out.println("Test Case: begin");
        initializeMockObject();
    }

    @After
    public void after(){ System.out.println("Test Case: end\n"); }

    @Test
    public void testZeroPosts(){
        when(statsMock.postsCount()).thenReturn(0);
        statsTools.calculateAdvStatistics(statsMock);

        Assert.assertEquals("testing case: zero posts",0, statsTools.getPostsCount());
        Assert.assertTrue(statsTools.getAvCommentsPerPost() == 0);
    }

    @Test
    public void test1000Posts(){
        when(statsMock.postsCount()).thenReturn(1000);
        statsTools.calculateAdvStatistics(statsMock);

        Assert.assertEquals("testing case: 1000 posts",1000, statsTools.getPostsCount());
    }

    @Test
    public void testZeroComments(){
        when(statsMock.commentsCount()).thenReturn(0);
        statsTools.calculateAdvStatistics(statsMock);

        Assert.assertEquals("testing case: zero comments",0, statsTools.getCommentsCount());
    }

    @Test
    public void testCommentsLessThanPosts(){
        when(statsMock.commentsCount()).thenReturn(10);
        when(statsMock.postsCount()).thenReturn(99);
        statsTools.calculateAdvStatistics(statsMock);

        Assert.assertTrue("testing case: comments quantity less than posts quantity", statsTools.getCommentsCount() < statsTools.getPostsCount());
        Assert.assertTrue(statsTools.getCommentsCount() == 10);
        Assert.assertTrue(statsTools.getPostsCount() == 99);
    }

    @Test
    public void testCommentsMoreThanPosts(){
        when(statsMock.commentsCount()).thenReturn(99);
        when(statsMock.postsCount()).thenReturn(10);
        statsTools.calculateAdvStatistics(statsMock);

        Assert.assertTrue("testing case: comments quantity more than posts quantity", statsTools.getCommentsCount() > statsTools.getPostsCount());
        Assert.assertTrue(statsTools.getCommentsCount() == 99);
        Assert.assertTrue(statsTools.getPostsCount() == 10);
    }

    @Test
    public void testNoUsers(){
        ArrayList<String> lstEmptyUsersList = new ArrayList<String>();

        when(statsMock.usersNames()).thenReturn(lstEmptyUsersList);
        statsTools.calculateAdvStatistics(statsMock);

        Assert.assertEquals("testing case: no users registered", 0, statsTools.getUsersCount());
        Assert.assertTrue(statsTools.getAvCommentsPerUser() == 0);
        Assert.assertTrue(statsTools.getAvPostsPerUser() == 0);
    }

    @Test
    public void test100Users(){
        Random r = new Random();
        ArrayList<String> lstFullUsersList = new ArrayList<String>();

        while(lstFullUsersList.size()<100){
            lstFullUsersList.add("user"+r.nextInt());
        }

        when(statsMock.usersNames()).thenReturn(lstFullUsersList);
        statsTools.calculateAdvStatistics(statsMock);

        Assert.assertEquals("testing case: many users registered", 100, statsTools.getUsersCount());
    }


    private void initializeMockObject(){
        usersNames = new ArrayList<String>();
        usersNames.add("Peppa");
        usersNames.add("Zoe");
        usersNames.add("Sussie");
        usersNames.add("Candy");
        usersNames.add("Pedro");
        usersNames.add("Kloe");
        usersNames.add("Rebeka");

        when(statsMock.usersNames()).thenReturn(usersNames);
    }


}
