
public class Statistics {
    private int count;
    private int sum;

    public Statistics() {
        this.count = 0;
        this.sum = 0;
    }

    public void addNumber (int number) {
        this.sum += number;
        this.count++;
    }

    public int sum() {
        return this.sum;
    }

    public double average() {
        //the average of an empty number statistics object is 0
        if (this.count == 0) {
            return 0;
        }
        return (1.0 * this.sum / this.count);
    }

    public int getCount() {
        return this.count;
    }

}
