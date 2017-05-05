public class Rectangle {
//This is a Class defined for Rectangle and Variable for Length and Width are defined below.
 public int length;
 public int width;
//The below line is a constructor which links us to  variables and defines what a variable is
 public Rectangle(int length, int width) {
  this.length = length;
  this.width = width;
 }
//the below lines are simple functions returning the Area and perimeter of the the rectangle using above defined variables.
 public int getArea() {
  return length * width;
 }
 public int getPerimeter() {
  return 2 * (length + width);
 }
}
