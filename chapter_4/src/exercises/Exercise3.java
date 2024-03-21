/**
 * (Geography: estimate areas) Use the GPS locations for Atlanta, Georgia;
 * Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina in the figure
 * in Section 4.1 to compute the estimated area enclosed by these four cities.
 * (Hint: Use the formula in Programming Exercise 4.2 to compute the distance
 * between two cities. Divide the polygon into two triangles and use the formula in
 * Programming Exercise 2.19 to compute the area of a triangle.)
 *
 *                      Charlotte (35.2270869, –80.8431267)
 *                                       / \
 *                                      /   \
 *                                     /     \
 *                                    /       \
 *Atlanta (33.7489954, –84.3879824)  /        / Savannah (32.0835407, –81.0998342)
 *                                   \       /
 *                                    \     /
 *                                     \   /
 *                                      \ /
 *     Orlando (28.5383355, –81.3792365)
 */
package src.exercises;

public class Exercise3 {

    public static void main(String[] args) {

        //RADIUS OF EARTH in KM
        final double RADIUS = 6371.01;

        double charlotteX = Math.toRadians(35.2270869);
        double charlotteY = Math.toRadians(-80.8431267);
        double savannahX = Math.toRadians(32.0835407);
        double savannahY = Math.toRadians(-81.0998342);
        double orlandoX = Math.toRadians(28.5383355);
        double orlandoY = Math.toRadians(-81.3792365);
        double atlantaX = Math.toRadians(33.7489954);
        double atlantaY = Math.toRadians(-84.3879824);

        // Calculate the sides
        double distanceBetweenCharlotteAndSavannah = calculateDistance(charlotteX, charlotteY, savannahX, savannahY, RADIUS);
        double distanceBetweenSavannahAndOrlando = calculateDistance(savannahX, savannahY, orlandoX, orlandoY, RADIUS);
        double distanceBetweenOrlandoAndAtlanta = calculateDistance(orlandoX, orlandoY, atlantaX, atlantaY, RADIUS);
        double distanceBetweenAtlantaAndCharlotte = calculateDistance(atlantaX, atlantaY, charlotteX, charlotteY, RADIUS);

        //Need a side to be the base of the triangle
        double baseAtlantaToSavannah = calculateDistance(atlantaX, atlantaY, savannahX, savannahY, RADIUS);

        //Triangle 1
        double semiPerimeterOfFirstTriangle = (distanceBetweenCharlotteAndSavannah + distanceBetweenAtlantaAndCharlotte + baseAtlantaToSavannah) / 2;
        double firstTriangleArea = calculateAreaOfTriangle(baseAtlantaToSavannah, semiPerimeterOfFirstTriangle, distanceBetweenCharlotteAndSavannah, distanceBetweenAtlantaAndCharlotte);

        double semiPerimeterOfSecondTriangle = (distanceBetweenSavannahAndOrlando + distanceBetweenOrlandoAndAtlanta + baseAtlantaToSavannah) / 2;
        double secondTriangleArea = calculateAreaOfTriangle(baseAtlantaToSavannah, semiPerimeterOfSecondTriangle, distanceBetweenSavannahAndOrlando, distanceBetweenOrlandoAndAtlanta);

        System.out.println("The Area Is : " + (firstTriangleArea + secondTriangleArea)+ " km"); // 117863.34165943446 km
    }

    public static double calculateDistance(double x1, double y1, double x2, double y2, double RADIUS) {
        return RADIUS * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));
    }

    public static double calculateAreaOfTriangle(double base, double semiPerimeter, double side1, double side2) {
        return (Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - base)));
    }
}
