public class RegularPolygonTest {
    public static void main(String[] args) {

        // Store five instances in an array
        RegularPolygon polygon1 = new RegularPolygon(3, 10.0);
        RegularPolygon polygon2 = new RegularPolygon(6, 4.0);
        RegularPolygon polygon3 = new RegularPolygon(3, 1.0);
        RegularPolygon polygon4 = new RegularPolygon(10, 5.0);
        RegularPolygon polygon5 = new RegularPolygon(4, 6.5);
        RegularPolygon[] polygonArray = {polygon1, polygon2, polygon3, polygon4, polygon5};

        // Temporarily assume the first polygon to have the smallest perimeter and the largest area
        double smallestPerimeter = polygon1.getPerimeter();
        int smallestPerimeterPolygon = 1;
        double largestArea = polygon1.getArea();
        int largestAreaPolygon = 1;

        // Iterate over the "polygonArray" and print out the perimeter and the area of each polygon
        for (int i = 0; i < polygonArray.length; i++) {
            System.out.println("polygon " + (i+1) + ": " + polygonArray[i].toString() +
            " Perimeter is " + polygonArray[i].getPerimeter() +
            " Area is " + polygonArray[i].getArea());
            
            // Compare the perimeter of the last four polygons with the first one
            // If the perimeter is shorter, update the value of "smallestPerimeter"
            if (polygonArray[i].getPerimeter() < smallestPerimeter) {
                smallestPerimeter = polygonArray[i].getPerimeter();
                smallestPerimeterPolygon = i + 1;
            }

            // Compare the area of the last four polygons with the first one
            // If the area is larger, update the value of "largestArea"
            if (polygonArray[i].getArea() > largestArea) {
                largestArea = polygonArray[i].getArea();
                largestAreaPolygon = i + 1;
            }
        }

        // Print out the number and perimeter of the polygon with the minimum perimeter
        System.out.println("The number of polygon with smallest perimeter is " + smallestPerimeterPolygon
        + " ,the smallest perimeter is " + smallestPerimeter);
        // Print out the number and area of the polygon with the largest area
        System.out.println("The number of polygon with largest area is " + largestAreaPolygon
        + " ,the largest area is " + largestArea);
    }
}
