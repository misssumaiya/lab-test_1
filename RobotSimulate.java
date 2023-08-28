package JavaLabTestQuestion_2;

import java.awt.*;

public class RobotSimulate {

    private int xPoint;
    private int yPoint;
    private String direction =" ";
    public RobotSimulate(int point1,int point2,String Direction){
        xPoint = point1;
        yPoint = point2;
        direction = Direction;
    }
    public void turnLeft(){
   if(direction == "N"){
     direction = "E";
   }
   else if (direction == "W") {

      direction = "N";
   }
   else if (direction == "E") {
      direction = "S";
   }
   else if (direction == "S") {
      direction = "W";
   }

    }

    public void turnRight(){
        if(direction == "N"){
         direction = "W";
        } else if (direction == "W") {

          direction = "S";
        }
        else if (direction == "S") {
          direction = "E";
        }
        else if (direction == "E") {
         direction = "N";

        }


    }
    public void move(int x,int y){
       xPoint = x + xPoint;
      yPoint = y + yPoint;

    }
    public Point getLocation(){
       return new Point(xPoint,yPoint);
    }

    public String getDirection(){
        return direction;
    }


}
