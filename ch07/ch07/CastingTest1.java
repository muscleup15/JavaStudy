package ch07;

class CastingTest1 {
    public static void main(String args[]){
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;
//        car.water(); error, car type의 참조변수로는 water 호출 불가능
        fe2 = (FireEngine)car;
        fe2.water();
    }


}

class Car{
    String color;
    int door;

    void drive(){
        System.out.println("drive, brrr~");
    }

    void stop(){
        System.out.println("stop!");
    }
}

class FireEngine extends Car{
    void water(){
        System.out.println("water!!!");
    }
}

