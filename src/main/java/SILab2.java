import java.util.ArrayList;
import java.util.List;

class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
};



public class SILab2 {

    public List<Integer> function(List<Time> timesList) {
        List<Integer> result = new ArrayList<>();   //1

        for (int i = 0; i < timesList.size(); i++) { //2
            int hr = timesList.get(i).getHours();   //3
            int min = timesList.get(i).getMinutes();//4
            int sec = timesList.get(i).getSeconds();//5
            if (hr < 0 || hr > 24){                 //6
                if (hr < 0){                        //7
                    throw new RuntimeException("The hours are smaller than the minimum");//8
                }
                else {
                    throw new RuntimeException("The hours are grater than the maximum");//9
                }
            }
            else if (hr < 24) {//10

                if (min < 0 || min > 59)//11
                    throw new RuntimeException("The minutes are not valid!");//12
                else {
                    if (sec >= 0 && sec <= 59)//13
                        result.add(hr * 3600 + min * 60 + sec);//14
                    else
                        throw new RuntimeException("The seconds are not valid");//15
                }
            } 
            else if (hr == 24 && min == 0 && sec == 0) {//16
                    result.add(hr * 3600 + min * 60 + sec);//17
            } 
            else {
                throw new RuntimeException("The time is greater than the maximum");//18
            }
        }
        return result;//19
    }//20
}