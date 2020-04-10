package yg.natnya.honivo;

import com.google.gson.Gson;

import static org.junit.Assert.*;

public class HomeTest {
    public static final String JSON_HOMES = "{homes:{[{nbFloors:2,surface:50},{nbFloors:4,surface:40}]}}";

    @org.junit.Test
    public void getHomes() {
        Homes homes = new Gson().fromJson(JSON_HOMES, Homes.class);
        Home[] homeArray = homes.getHomes();
        assertEquals("getHomes() should return 2 elements from JSON sample", 2, homeArray.length);
    }

    @org.junit.Test
    public void getFloorsAndSurface() {
        Homes homes = new Gson().fromJson(JSON_HOMES, Homes.class);
        Home firstHome = homes.getHomes()[0];
        assertEquals("first surface should have 2 floors", 2, firstHome.getNbFloors());
        assertEquals("first surface should be 50m²", 50, firstHome.getSurface());
    }
}