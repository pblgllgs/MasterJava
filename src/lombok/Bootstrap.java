package lombok;

public class Bootstrap {
    public static void main(String[] args) {

        User user = User.builder().name("pablo").id(1L).build();

        System.out.println("user = " + user.id + " " + user.name);

    }
}
