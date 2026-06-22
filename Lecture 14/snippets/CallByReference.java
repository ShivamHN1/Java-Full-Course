public class CallByReference {
    public static void main(String[] args){
        random ran = new random(10, 20);
        
        System.out.println("Before addTen: x = " + ran.x + ", y = " + ran.y);

        addTen(ran);

        System.out.println("After addTen: x = " + ran.x + ", y = " + ran.y);

    }
    static void addTen(random ran){
        ran.x += 10;
        ran.y += 10;
    }
}

class random{
        int x;
        int y;

        random(int x, int y){
            this.x = x;
            this.y = y;
        }
    }