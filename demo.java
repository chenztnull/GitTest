package git;
import java.util.Scanner;  
public class demo {  
    public static void main(String[] args) {  
        Scanner scanner = new Scanner(System.in);  
        while (true) {  
            System.out.println("\n请选择操作:");  
            System.out.println("1. 加密");  
            System.out.println("2. 解密");  
            System.out.println("3. 退出");  
            String option = scanner.nextLine();  
            switch (option) {  
                case "1":  
                    jiami(scanner);  
                    break;  
                case "2":  
                    jiemi(scanner);  
                    break;  
                case "3":  
                    System.out.println("退出程序。");  
                    return;  
                default:  
                    System.out.println("无效的选项，请重新输入。");  
            }  
        }  
    }   
    private static void jiami(Scanner scanner) {  
        System.out.println("请输入要加密的密码：");  
        String password = scanner.nextLine();  
        System.out.println("请选择加密方式");  
        System.out.println("1. 偏移加密");
        System.out.println("2. 调换加密");
        System.out.println("3. 反转加密");
        String option = scanner.nextLine(); 
        switch (option) {  
                case "1":  
                    jiamiPassword(password);  
                    break;  
                case "2":  
                    jiamiPassword2(password);  
                    break;  
                case "3":  
                    jiamiPassword3(password);  
                    break;  
                default:  
                    System.out.println("无效的选项，请重新输入。");  
            }      
        System.out.println("加密后的密码： " + jiamiPassword(password));  
    }  
  
    private static String jiamiPassword(String password) {  
        StringBuilder jiamiPassword = new StringBuilder();  
        for (int i = 0; i <password.length(); i++) {  
            char c = password.charAt(i);  
            int ascii = (int) c;  
            int pianyi = 3;   
            int newAscii = ascii + i + pianyi; 
            char newChar = (char) newAscii; 
            jiamiPassword.append(newChar);
        }    
        return jiamiPassword.toString();
    }  
    private static String jiamiPassword3(String password) {  
        StringBuilder jiamiPassword = new StringBuilder();  
        for (int i = password.length(); i >= 0; i--) {  
            char c = password.charAt(i); 
            char newChar = c; 
            jiamiPassword.append(newChar); 
        }  
        return jiamiPassword.toString();  
    }  
    private static String jiamiPassword2(String password) {  
        String jiamiPassword = new String();  
        String c = String.valueOf(password.charAt(0));
        //valufOf()方法是将其他类型的数据转换成String类型,在这里的作用是将字符转换成字符串
        String c1 = String.valueOf(password.charAt(password.length()));
        jiamiPassword=c1+password.substring(1,password.length()-1)+c;  
        return jiamiPassword.toString();    
    }
  
    private static void jiemi(Scanner scanner) {  
        System.out.println("请输入要解密的密码：");  
        String jiamiPassword = scanner.nextLine();  
        String jiemiPassword = jiemiPassword(jiamiPassword);  
        System.out.println("解密后的密码： " + jiemiPassword);  
    }  
  
    private static String jiemiPassword(String jiamiPassword) {  
        StringBuilder jiemiPassword = new StringBuilder();  
        for (int i = 0; i < jiamiPassword.length(); i++) {  
            char c = jiamiPassword.charAt(i);  
            int ascii = ((int) c)-3-i;   
            char newChar = (char) ascii;   
            jiemiPassword.append(newChar); 
        }    
        return jiemiPassword.toString();   
    }  
}