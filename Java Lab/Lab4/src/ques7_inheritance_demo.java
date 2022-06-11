    class Shape {
        float area;

        void showArea() {
            System.out.println(area);
        }
    }

    class Circle1 extends Shape {
        float r;

        void circlearea() {
            area = r * r;
            showArea();
        }
    }

    class Rectangle extends Shape {
        float a, b;

        void recarea() {
            area = a * b;
            showArea();
        }
    }