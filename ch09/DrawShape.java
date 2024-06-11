package ch09;

import java.awt.Frame;
import java.awt.Graphics;

class DrawShape extends Frame {
    public static void main(String[] args)
    {
          DrawShape win = new DrawShape("도형그리기"); 
          // 자동적으로 paint(Graphics g)메서드가 호출
    }

    public void paint(Graphics g) {
          Point[] p = { new Point(100, 100), new Point(140, 50), new Point(200, 100)};
          Triangle t = new Triangle(p);
          Circle c = new Circle(new Point(150, 150), 50);


          // 원을 그린다.
          g.drawOval(c.center.x, c.center.y, c.r, c.r);

          // 직선 3개로 삼각형을 그린다.
          g.drawLine(t.p[0].x, t.p[0].y, t.p[1].x, t.p[1].y);
          g.drawLine(t.p[1].x, t.p[1].y, t.p[2].x, t.p[2].y);
          g.drawLine(t.p[2].x, t.p[2].y, t.p[0].x, t.p[0].y);
    }
    DrawShape(String title) {
          super(title);
          setSize(300, 300);
          setVisible(true);
    }
}

class Point {
    int x;
    int y;
    Point(int x, int y) {
          this.x = x;
          this.y = y;
    }
    Point() {
          this(0,0);
    }
}

class Circle {
    Point center;       // 원의 원점좌표
    int r;                   // 반지름
    Circle() {            
          this(new Point(0, 0), 100);
    }
    Circle(Point center, int r) {
          this.center = center;
          this.r = r;
    }
}

class Triangle {
    Point[] p = new Point[3]; // 3개의 Point인스턴스를 담을 배열을 생성한다.
    Triangle(Point[] p) {
          this.p = p;
    }
    Triangle(Point p1, Point p2, Point p3) {
          p[0] = p1;
          p[1] = p2;
          p[2] = p3;
    }
}
