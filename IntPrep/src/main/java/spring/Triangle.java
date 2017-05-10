package spring;

public class Triangle implements Shape{

	
	 private String type;
	 private int height;
	 
	 
	 
	 public Triangle(int height) {
	  
	  this.height = height;
	 }

	 public Triangle(String type, int height) {
	  
	  this.type = type;
	  this.height = height;
	 }

	 public Triangle(String type) {
	  this.type = type;
	 }

	 public String getType() {
	  return type;
	 }



	 public void setType(String type) {
	  this.type = "type: " + type;
	 }



	 public void draw(){
	  System.out.println("Draw works!!!!!!! + " + type + " height: " + height);
	 }


}
