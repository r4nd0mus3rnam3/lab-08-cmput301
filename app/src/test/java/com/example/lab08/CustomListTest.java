package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);

        // This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }
    @Test
    public void testDeleteCity() {
        CustomList cityList = new CustomList();
        City cityToRemove = new City("Edmonton", "Alberta");

        cityList.addCity(cityToRemove);

        // Ensure the city is there before deleting
        assertTrue(cityList.hasCity(cityToRemove));

        // Delete the city and verify it's gone
        cityList.deleteCity(cityToRemove);
        assertFalse(cityList.hasCity(cityToRemove));
        assertEquals(0, cityList.countCities());
    }

    @Test
    void testCountCities() {
        CustomList cityList = new CustomList();
        assertEquals(1, cityList.countCities());

        cityList.addCity(new City("Saskatoon", "Saskatchewan"));
        assertEquals(2, cityList.countCities());

        cityList.deleteCity(new City("Edmonton", "Alberta"));
        assertEquals(1, cityList.countCities());
    }



}
