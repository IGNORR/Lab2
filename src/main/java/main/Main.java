package main;

import house.House;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /**
     * Метод для створення масиву об'єктів типу House
     * @return
     */
    public static ArrayList<House> createHouses() {
        ArrayList<House> houses = new ArrayList<>();
        houses.add(new House(1, 56, 80.5, 5, 3, "Бібліотечна"));
        houses.add(new House(2, 14, 45.0, 3, 1, "Алмазна"));
        houses.add(new House(3, 26, 100.0, 10, 4, "Галицька"));
        houses.add(new House(4, 10, 60.5, 7, 2, "Дубова"));
        houses.add(new House(5, 6, 85.0, 4, 3, "Житня"));
        houses.add(new House(6, 1, 100.0, 5, 4, "Кедрова"));
        houses.add(new House(7, 54, 60.2, 5, 3, "Мідна"));
        houses.add(new House(8, 23, 46.6, 2, 2, "Богдана Хмельницького"));
        return houses;
    }

    /**
     * Метод для пошуку квартир з відповідною кількістю квартир
     * @param houses
     * @param rooms
     */
    public static void printHousesByRooms(ArrayList<House> houses, int rooms) {
        System.out.println("Квартири з " + rooms + " кімнатами:");
        for (House house : houses) {
            if (house.getRooms() == rooms) {
                System.out.println(house);
            }
        }
    }

    /**
     * Метод для пошуку квартир з відповідною кількістю квартир і на відповідному поверсі
     * @param houses
     * @param rooms
     * @param floorMin
     * @param floorMax
     */
    public static void printHousesByRoomsAndFloorRange(ArrayList<House> houses, int rooms, int floorMin, int floorMax) {
        System.out.println("Квартири з " + rooms + " кімнатами і поверхом в діапазоні " + floorMin + "-" + floorMax + ":");
        for (House house : houses) {
            if (house.getRooms() == rooms && house.getFloor() >= floorMin && house.getFloor() <= floorMax) {
                System.out.println(house);
            }
        }
    }

    /**
     * Метод для пошуку квартир з відповідною площею
     * @param houses
     * @param minArea
     */
    public static void printHousesByArea(ArrayList<House> houses, double minArea) {
        System.out.println("Квартири з площею більше " + minArea + " кв.м:");
        for (House house : houses) {
            if (house.getArea() > minArea) {
                System.out.println(house);
            }
        }
    }

    /**
     * Метод main. В ньому викликаються всі основні методи.
     * @param args
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<House> houses = createHouses();

        // Виведення квартир за критеріями
        System.out.print("Введіть кількість квартир для пошуку: ");
        int rooms = scan.nextInt();
        printHousesByRooms(houses, rooms);
        System.out.println();

        System.out.print("Введіть кількість квартир для пошуку: ");
        rooms = scan.nextInt();
        System.out.print("Введіть мінімальний поверх для пошуку: ");
        int floorMin = scan.nextInt();
        System.out.print("Введіть максимальний поверх для пошуку: ");
        int floorMax = scan.nextInt();
        printHousesByRoomsAndFloorRange(houses, rooms, floorMin, floorMax);
        System.out.println();

        System.out.print("Введіть мінімальну площу для пошуку: ");
        double minArea = scan.nextDouble();
        printHousesByArea(houses, minArea);

        scan.close();
    }
}
