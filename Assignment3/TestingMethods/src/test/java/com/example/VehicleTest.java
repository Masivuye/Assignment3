package com.example;

import org.junit.*;

import static org.junit.Assert.*;

public class VehicleTest {
    Vehicle veh1;
    Vehicle veh2;

    @Before
    public void setUp() throws Exception {
        veh1 = new Vehicle.Builder()
                .type("Sudan")
                .color("Pink")
                .numWheels(4)
                .build();
        veh2 = new Vehicle.Builder()
                .type("Sudan")
                .color("Pink")
                .numWheels(4)
                .build();

    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void getNumWheels() {
    }

    @Test
    public void getColor() {
    }
    @Test
    public void getType() {
    }
    @Test
    public void build() {
    }
    @Test
    public void ObjectEquality() {

        Assert.assertEquals(veh1,veh2);
    }

    @Test
    public void ObjectIdentity(){
        Assert.assertSame(veh1,veh1);
    }

    @Test(timeout = 10000)
    public void Timeouts(){
        Assert.assertSame(veh1,veh1);
        while(true);
    }

    @Ignore
    @Test
    public void DisablingTest(){
        Assert.assertEquals(veh1,veh2);
    }

    @Test(expected = AssertionError.class)
    public void FailingTest(){
        Assert.assertEquals(veh1,veh2);
    }

}