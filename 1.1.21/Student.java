public class Student {
    private String name;
    private int first, second;
    private double dividingResult;

    public Student(String _name, int _first, int _second) {
        this.name = _name;
        this.first = _first;
        this.second = _second;
        dividingResult = (double) this.first / (double) this.second;
    }

    public String toString() {
        return (
                String.format("%-10s", this.name)
                + String.format("%-10d", this.first)
                + String.format("%-10d", this.second)
                + String.format("%.3f", this.dividingResult)
        );
    }

}
