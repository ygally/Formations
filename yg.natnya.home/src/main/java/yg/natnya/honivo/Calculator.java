package yg.natnya.honivo;

import yg.natnya.banivo.DBAccessor;

/**
 * Service de calcul de surface habitable
 */
public class Calculator {
    public Calculator(){
    }
    public int calculTotalSurfaceFromHome() {
        final Home home=new DBAccessor().getHome(0);
        return home.nbFloors*home.surface;
    }
}