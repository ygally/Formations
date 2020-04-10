package yg.natnya;

import yg.natnya.banivo.DBAccessor;
import yg.natnya.honivo.Calculator;

public class HomeApp {
    public static void main(String[] args) {
        System.out.println(new Calculator(new DBAccessor()).calculTotalSurfaceFromHome());
    }
}
