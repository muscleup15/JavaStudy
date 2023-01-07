public class CardTest {
    public static void main(String args[]){
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7; //인스턴스 값 변경

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1 은" + c1.kind + "," + c1.number +"이며, 크기는 (" + c1.width+","+c1.height+")");
        System.out.println("c2 는" + c2.kind + "," + c2.number +"이며, 크기는 (" + c2.width+","+c2.height+")");

        c1.width = 50;
        c1.height = 80; // 클래스 변수의 값 변경 cf)이렇게 하는 것보다 Card.height 처럼 변경해주는 것이 클래스 변경이라는 것을 확인하기 쉽다

        System.out.println("c1 은" + c1.kind + "," + c1.number +"이며, 크기는 (" + c1.width+","+c1.height+")");
        System.out.println("c2 는" + c2.kind + "," + c2.number +"이며, 크기는 (" + c2.width+","+c2.height+")");


    }
}

class Card{
    String kind;
    int number;
    static int width = 100;
    static int height = 250;
}