import java.util.*;

public class test {




    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();
        List<String> username = new ArrayList<>(Arrays.asList(
                "osj4129",
                "hello",
                "boss123"
        ));
        List<String> password = new ArrayList<>(Arrays.asList(
                "hello1234",
                "12345",
                "sss333"
        ));
        for(int i =0; i<username.size(); i++){
            users.put(username.get(i), password.get(i));
        }
        System.out.println(users);

    }



}
