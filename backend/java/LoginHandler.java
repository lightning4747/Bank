import java.util.HashMap;

public class LoginHandler {
 private static HashMap<String, String> mockuser = new HashMap<>();

 static {
    mockuser.put("Gazi", "jarin");

 }
 public static boolean smt(String username, String password) {

    if(mockuser.containsKey(username)) {
           return mockuser.get(username).equals(password);  
    }
    return false;
 }

    public static void main(String [] args) {
           
           if(smt("Gazi", "jarin")) {
            System.out.print("hehe");
           }
           else {
            System.out.print("nigga");
           }


    }
}
