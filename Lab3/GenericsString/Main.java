package Lab3.GenericsString;
public class Main{
    public static void main(String[] args) {

        Integer intArr[]={10,20,15};
        Float floatArr[] = new Float[5];  ;

        for (int i = 0; i < floatArr.length; i++) {
            floatArr[i] = 1/((float)i + 1);
        }

        WorkArray<Integer> insWorkArrayInt = new WorkArray<>(intArr);
      
        WorkArray<Float> insWorkArrayFloat = new WorkArray<>(floatArr);

        System.out.println(insWorkArrayInt.sum());
        System.out.println(insWorkArrayFloat.sum());


    }
}