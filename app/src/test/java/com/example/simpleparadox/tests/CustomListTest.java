package com.example.simpleparadox.tests;

import com.example.simpleparadox.listycity.City;
import com.example.simpleparadox.listycity.CustomList;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;


    @Before
    public void createList() {
        list = new CustomList(null, new ArrayList<City>());
    }

    @Test
    public void addCityTest() {
        int listSize = list.getCount();
        list.addCity(new City("Halifax", "NS"));
        Assert.assertEquals(list.getCount(), listSize + 1);
    }
    @Test
    public void hasCityTest() {
        int listSize = list.getCount();
        City city = new City("Halifax","NS");
        list.addCity(city);
        Assert.assertEquals(list.hasCity(city), true);
    }

    @Test
    public void deleteCityTest() {
        int listSize = list.getCount();
        City city = new City("Edmonton","AB");
        list.addCity(city);
        list.deleteCity(city);
        Assert.assertEquals(list.hasCity(city), false);
    }
}