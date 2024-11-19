package lv.rvt;

public class Timer {
    private ClockHand hundredths;
    private ClockHand seconds;

    public Timer() {
        this.hundredths = new ClockHand(100); // Simtdaļas (0-99)
        this.seconds = new ClockHand(60); // Sekundes (0-59)
    }

    public void advance() {
        this.hundredths.advance(); // Pievienojam 1 simtdaļu
        if (this.hundredths.value() == 0) {
            this.seconds.advance(); // Ja simtdaļas pāriet pāri robežai, pievienojam sekundi
    }
    }

    public String toString() {
        return this.seconds + ":" + this.hundredths;
    }
}

