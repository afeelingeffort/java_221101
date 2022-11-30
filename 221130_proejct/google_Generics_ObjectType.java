class ObjectType {
    private Object obj;

    public Object getObject() {
        return obj;
    }

    public void setObject(Object obj) {
        this.obj = obj;
    }
}

class GenericType<T> {
    private T genericType;

    public T getGenericType() {
        return genericType;
    }

    public void setGenericType(T genericType) {
        this.genericType = genericType;
    }

}

public class google_Generics_ObjectType {

    public static void main(String[] args) {
        ObjectType ot = new ObjectType();
        ot.setObject("비제네릭타입");
        String str = (String) ot.getObject();

        GenericType<String> gt = new GenericType<String>();
        gt.setGenericType("제네릭타입");
        String str2 = gt.getGenericType();
    }

}
