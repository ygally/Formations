package yg.natnya.honivo;

import yg.natnya.banivo.DBAccessor;

/**
 * Service de calcul de surface habitable
 */
public class Calculator {
    private Interface homeHolder;
    public Calculator(final Interface homeHolder){
        this.homeHolder = homeHolder;
    }
    public int calculTotalSurfaceFromHome() {
        final Home home=homeHolder.getHome(0);
        return home.nbFloors*home.surface;
    }
}