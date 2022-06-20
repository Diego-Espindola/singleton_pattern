import com.singleton.SingleObject;

public class Principal {
    public static void main(String[] args) {

        //Illegal constructor
        //SingleObject object = new SingleObject();

        //Recover an object
        SingleObject object1 = SingleObject.getInstance();
        object1.showMessage();

        SingleObject object2 = SingleObject.getInstance();
        object2.showMessage();
    }
}