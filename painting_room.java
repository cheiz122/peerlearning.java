package javake.painting;

import java.util.Scanner;
public class painting_room {
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.print("please input the length:");
float length=sc.nextFloat();
Scanner read=new Scanner(System.in);
System.out.println("please input the width of the room");
float width= read.nextFloat();
Scanner h=new Scanner(System.in);
System.out.println("please input the height of the room");
float height=h.nextFloat();
Scanner dh=new Scanner(System.in);
System.out.println("please inpit the height of the door");
float height_d=dh.nextFloat();
Scanner dl=new Scanner(System.in);
System.out.println("please input length of the door");
float length_d=dl.nextFloat();
Scanner wl=new Scanner(System.in);
System.out.println("please input the length of the window");
float length_w=wl.nextFloat();
Scanner ww=new Scanner(System.in);
System.out.println("please input the width of the window:");
float width_w=ww.nextFloat();
Scanner c=new Scanner(System.in);
System.out.println("please input the cost of painting per meter sq");
float  cost_painting=c.nextFloat();
Scanner cc=new Scanner(System.in);
System.out.println("please input the cost of carpet per sq meter");
float cost_carpet=cc.nextFloat();
float total_cost_carpet;
float total_cost_painting;
float area_floor,area_walls,area_windows,area_door;
float total_area_painted, total_area_carpeted;
area_floor=length*width;
area_walls=2*(length*height) + 2*(width*height);
area_windows=length_w*width_w;
area_door=length_d*height_d;
total_area_carpeted=area_floor;
total_area_painted=area_walls -(area_door + area_windows);
total_cost_carpet=total_area_carpeted * cost_carpet;
total_cost_painting=total_area_painted * cost_painting;

System.out.println("the total cost for painting is" + total_cost_painting +"$" +
"and   the total cost for carpeting is"+ total_cost_carpet +"$"
);


}

    
}
