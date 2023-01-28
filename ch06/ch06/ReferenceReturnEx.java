package ch06;

public class ReferenceReturnEx {
    public static void main(String[] args){
        Data d = new Data();
        d.x = 10;

        Data d2 = copy(d);
        System.out.println("d.x = "+ d.x);
        System.out.println("d2.x = " + d2.x);
    }

    static Data copy(Data d){ //data 형으로 지정해줘야 돼
        Data tmp = new Data();
        tmp.x = d.x;

        return tmp; //복사한 값의 주소를 반환, 반환 타입이 data이기 때문에 호출 결과 저장하는 변수 타입 역시 data로 지정
    }
}
