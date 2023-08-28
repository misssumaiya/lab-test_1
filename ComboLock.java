package JavaLabTestQuestion_3;

import java.util.ArrayList;

public class ComboLock {
    private int currentPosition;

    private ArrayList<Integer> correctNums = new ArrayList<>();
    private ArrayList<Integer> move = new ArrayList<>();
    private ArrayList<Integer> position = new ArrayList<>();

    private boolean unlocked = false;

    public ComboLock(int secrect1,int secrect2,int secrect3){
        correctNums.add(secrect1);
        correctNums.add(secrect2);
        correctNums.add(secrect3);

        currentPosition = 0;
    }

    public void reset(){
        currentPosition = 0;
    }
    public void turnLeft(int ticks){
        if(currentPosition + ticks >39){
            int temp1 = 39 - currentPosition + 1;
            currentPosition = ticks - temp1;
        }
        else {
            currentPosition = currentPosition + ticks;
        }

        position.add(currentPosition);
        move.add(2);
    }

    public void turnRight(int ticks){
        if(currentPosition - ticks <0){
            int temp1 = (currentPosition +1 )-ticks;
            temp1 = Math.abs(temp1);
            currentPosition = 39 - temp1;
        }
        else {
            currentPosition = currentPosition - ticks;
        }

        position.add(currentPosition);
        move.add(1);
    }

    public boolean open(){
        ArrayList<Integer> correctMoves = new ArrayList<>();

        correctMoves.add(1);
        correctMoves.add(2);
        correctMoves.add(1);

        if(move.equals(correctMoves) && (position.equals(correctNums))){
            unlocked = true;
        }

        else {
            unlocked = false;
        }

        return unlocked;
    }
    public int getCurrentPosition(){
        return currentPosition;
    }

}
