package Entrega1.Ejera.e7;

//Zona de atributos
public class Time {
    private int hour;
    private int minute;
    private int second;
    //Zona de metodos
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    public void setTime(int hour, int minute, int second) {
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }
    @Override
    public String toString() {
        return String.format("%02d:%02d:%02d", hour, minute, second);
    }
    public Time nextSecond() {
        second++;
        if (second > 59) {
            second = 0;
            minute++;
            if (minute > 59) {
                minute = 0;
                hour++;
                if (hour > 23) {
                    hour = 0;
                }
            }
        }
        return this;
    }
    public Time previousSecond() {
        second--;
        if (second < 0) {
            second = 59;
            minute--;
            if (minute < 0) {
                minute = 59;
                hour = (hour - 1 + 24) % 24;
            }
        }
        return this;
    }
}
