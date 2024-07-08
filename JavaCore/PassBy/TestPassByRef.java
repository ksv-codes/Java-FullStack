package A9_2Polymorphism.PassBy;
public class TestPassByRef {
    public static void main(String[] args) {
        point first = new point(4, 8);
        System.out.println(first);
        move(first);
        System.out.println(first);
    }
    public static void move(point p){
        p.x++;
        p.y++;
        System.out.println(p);
    }
    public static class point {
        int x;
        int y;
        public point(int x, int y) {
            this.x = x;
            this.y = y;
        }
        @Override
        public String toString() {
            return "point [x=" + x + ", y=" + y + "]";
        }
    }
}
