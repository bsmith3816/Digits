import java.util.ArrayList;
import java.util.List;

public class Digits {

    private ArrayList<Integer> digitList;

    public Digits(int num){
        ArrayList<Integer> digitList = new ArrayList<>();
        if(num == 0){
            digitList.add(0);
        } else {
            while(num > 0){
                int x = num % 10;
                digitList.add(0, x);
                num = num / 10;
            }
        }
        this.digitList = digitList;
    }

    public boolean isStrictlyIncreasing(){
        for(int i = 0; i < digitList.size()-1; i++){
            if(digitList.get(i) >= digitList.get(i+1)){
                return false;
            }
        } return true;
    }

    public String getDigitList(){
        String str = "[";
        for(int i = 0; i < digitList.size()-1; i++){
            str += digitList.get(i) + ", ";
        }
        return str + digitList.get(digitList.size()-1) + "]";
    }
}
