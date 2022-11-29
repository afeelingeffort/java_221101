//모르겠다 .
class PhoneBook {
    private String number;
    private String address;
    private String name;

    public PhoneBook(String number, String address, String name) {
        this.number = number;
        this.address = address;
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public boolean equals(Object o) {
        if (o instanceof PhoneBook) {
            PhoneBook pb = (PhoneBook) o;
            if (number.equals(pb.getNumber()) && name.equals(pb.getName()))
                return true;
            else
                return false;
        }
    }

    public String toString() {
        StringBuffer sb = new StringBuffer();
        sb.append("전화번호: ").append(number).append(" , ");
        sb.append("주소: ").append(address).append(" , ");
        sb.append("이름: ").append(name);
        return sb.toString();
    }
}

public class google_FrameWork_Collections_method_PhoneBook {

    public static void main(String[] args) {

    }

}
