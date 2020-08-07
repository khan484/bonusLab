package shape;
import static org.junit.Assert.assertEquals;
public class ShapedDemo {
        public static void calculateArea(Rectangle r){
        r.setBreadth(2);
        r.setLength(3);
        assertEquals("Area of calculation is incorrect", r.getArea(),6);
    }
   public static void main (String [] args){
       ShapedDemo.calculateArea(new Rectangle());
       ShapedDemo.calculateArea(new Square());
       }
}
