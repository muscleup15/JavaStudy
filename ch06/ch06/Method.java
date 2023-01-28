package ch06;

public class Method {

    public static void main(String args[]){
        MyMath mm = new MyMath();
        double result4 = mm.divide(5L, 3L);//자동 형 변환 이루어짐
//        printGugudan(2); static void printGugudan으로 하지 않았기에 호출이 되지 않음

    }

    void printGugudan(int dan){
        for(int i = 1;i<=9;i++){
            System.out.printf("%d * %d = %d%n", dan, i , dan*i);
        }
        return;//반환타입이 void이기 때문에 생략가능, void에서 자동으로 추가됨
    }

    int max(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b; //else 생략 하면 안됨, if문 거짓일때 return 값 없을 수도 있기 때문
        }
    }
}


class MyMath {
    long add(long a, long b){
        long result = a+b;
        return result;
        //return a+b 가능
    }
        double divide(double a, double b) {
        return a / b;
    }
};


