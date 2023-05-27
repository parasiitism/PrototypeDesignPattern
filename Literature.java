package PrototypeDesignPattern;

public class Literature extends Book{
    private String type;


    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        
        return "Literature{" +
                "type=" +type+
                 '}';
}

}
