package sobrecarga;
/**
 *
 * @author fei
 */
public class Sobrecarga{
    public  String  tipos(int num1, int num2)  {
        return "int, int";
    }  

    public  String  tipos(double num1, double num2)  {
        return "double, double";
    }  

    public  String  tipos(String num1, String num2)  {
        return "String, String";
    } 
    
    public  String  tipos(String num1, double num2)  {
        return "String, double";
    }
    
    public  String  tipos(double num1, String num2)  {
        return "double, String";
    } 
}



