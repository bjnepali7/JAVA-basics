public class wrap {
    public static void main(String[] args) {

      float x1=Float.parseFloat("12");
      Float c= Float.valueOf("13");
      float y1= c.floatValue();
      System.err.println("the conversion to float is\t"+x1+"\t"+y1+"\n");
      int  x2= Integer.parseInt("45");
      Integer c2= Integer.valueOf("1011",2);
      int y2= c2.intValue();
      System.err.println("the conversion to string to integer is\t"+x2+"\n"+y2);
      
        
    }
    
}
