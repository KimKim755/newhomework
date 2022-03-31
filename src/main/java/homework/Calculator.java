package homework;

import java.util.Scanner;

public class Calculator{
    Scanner scanner = new Scanner(System.in);
      private  int first, second;
      private  double  add,subtract,multiply;
        public float divide,square,squareRoot,exponents;

    public void setAdd(double add) {
        this.add = add;
    }
        public void setMultiply(int multiply) {
                this.multiply = multiply;
        }
        public void setSquareRoot(float squareRoot) {
                this.squareRoot = squareRoot;
        }
        public void setExponents(float exponents) {
                this.exponents = exponents;
        }
        public void setSecond(int second) {
                this.second = second;
        }
        public void setSubtract(int subtract) {
                this.subtract = subtract;
        }
        public void setDivide(float divide) {
                this.divide = divide;
        }
        public void setSquare(float square) {
                this.square = square;
        }
        public void setFirst(int first) {
                this.first = first;
        }
        public double getMultiply() {
                return multiply;
        }
        public double getAdd() {
                return add;
        }
        public double getSubtract() {
                return subtract;
        }

        public int getFirst() {
                return first;
        }

        public float getSquare() {
                return square;
        }

      public int getSecond(){
            return second;
      }

        }