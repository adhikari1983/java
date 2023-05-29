package class26;

public class Entry {
    String key;
    Double value;

    public Entry(String key, Double price) {
        this.key = key;
        this.value = price;
    }

    public String getKey() {
        return key;
    }

    public Double getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }
}
