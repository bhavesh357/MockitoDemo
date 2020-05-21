public class Customer {
    private final String last;
    private final String first;

    public Customer(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getFullName() {
        return first+" "+last;
    }
}
