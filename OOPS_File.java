class Shapes {
    public void area() {
      System.out.println("The formula for area of ");
    }
  }
  class Triangle {
    public void area() {
      System.out.println("Triangle is ½ * base * height ");
    }
  }
  class Circle {
    public void area() {
      System.out.println("Circle is 3.14 * radius * radius ");
    }
  }
  class OOPS_File {
    public static void main(String args[]) {
      Shapes myShape = new Shapes();  // Create a Shapes object
      Triangle myTriangle = new Triangle();  // Create a Triangle object
      Circle myCircle = new Circle();  // Create a Circle object
      myShape.area();
      myTriangle.area();
      myShape.area();
      myCircle.area();
    }
  }