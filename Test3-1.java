import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

//ArrayList

public class Test3 {
// Have a class Shape
	public static class Circle{
		
		private double x,y,r;
		Circle(String str){
			x = Double.parseDouble(str.split(" ")[1]);
			y = Double.parseDouble(str.split(" ")[2]);
			r = Double.parseDouble(str.split(" ")[3]);
		}
		public boolean isInside(double X,double Y){
			double Distance = Math.sqrt((X-x)*(X-x)+(Y-y)*(Y-y));
			return (Distance<r);
		}
		public String toString(){
			return "Circle(x="+ x + ",y=" + y + ",r=" + r + ")";
		}
	}
	public static class Rect{
		private double x,y,w,h;
		Rect(String str){
			x = Double.parseDouble(str.split(" ")[1]);
			y = Double.parseDouble(str.split(" ")[2]);
			w = Double.parseDouble(str.split(" ")[3]);
			h = Double.parseDouble(str.split(" ")[4]);
		}
		public boolean isInside(double X,double Y){
			return (X > x && X<(x+w)) && (Y > y && X<(y+h));
		}
		public String toString(){
			return "Rect(x="+ x + ",y=" + y + ",w=" + w + ",h=" + h + ")";
		}
	}
	private static void INSIDE(int x, int y, ArrayList<Circle> CircleList, ArrayList<Rect> RectList) {
		System.out.println("Point("+x+','+y +"):");
		for(int i=0;i<CircleList.size();i++){
			if(CircleList.get(i).isInside(x,y)){
				System.out.println("In the " + CircleList.get(i));
			}
		}
		for(int i=0;i<RectList.size();i++){
			if(RectList.get(i).isInside(x,y)){
				System.out.println("In the " + RectList.get(i));
			}
		}
	}
	
	public static void main(String[] args) throws FileNotFoundException {
		//Read file
		File file = new File("src/test3.txt");
		Scanner s = new Scanner(file);
		ArrayList<Circle> CircleList = new ArrayList<Circle>();
		ArrayList<Rect> RectList = new ArrayList<Rect>();
		while(s.hasNextLine()){
			String shapeStr = s.nextLine();
//			System.out.println(shapeStr);
			if(shapeStr.split(" ")[0].equals("Circle")){
				CircleList.add(new Circle(shapeStr));
			}else if(shapeStr.split(" ")[0].equals("Rect")){
				RectList.add(new Rect(shapeStr));
			}else{
				System.out.println("Error: " + shapeStr);
			}
		}
		s.close();
		
		//Traverse & print
		for(int i=0;i<CircleList.size();i++){
			System.out.println(CircleList.get(i));
		}
		for(int i=0;i<RectList.size();i++){
			System.out.println(RectList.get(i));
		}
		
		//Get INSIDE
		INSIDE(41,20,CircleList,RectList);
	}


}
