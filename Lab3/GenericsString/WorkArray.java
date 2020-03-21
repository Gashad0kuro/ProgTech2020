package Lab3.GenericsString;
class WorkArray<T extends Number>{

    private T[] arrNums;

    WorkArray(T[] numP){
        this.arrNums = numP;
    }




    public double sum (){
        double doubleWork = 0.0;

        for (T el : arrNums) {
            doubleWork += el.doubleValue();
        }

        return doubleWork;
    }





}