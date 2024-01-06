package ProjectOOPs;
/*
Create Registration Class in which you would have variables such as email,
userName and password that have an access scope only within its own class.
After creating an object of the class, the user should be able to call methods
and in each method separately pass values to set users email, username and
password.
Requirements:
● Valid email consider to be only yahoo
● Valid userName and password cannot be empty and should be of
length larger than 6 characters. Also valid passwords cannot contain
userName
 */
public class P14Registration {
        private String email;
        private String userName;
        private String password;


    public P14Registration(String email, String userName, String password) {
        this.email = email;
        this.userName = userName;
        this.password = password;
    }

        public void setEmail(String email) {
            // Valid email should be only yahoo
            if (email.toLowerCase().endsWith("@yahoo.com")) {
                this.email = email;
            } else {
                System.out.println("Invalid email format. Please use a Yahoo email.");
            }
        }
        public void setUserName(String userName) {
            // Valid userName cannot be empty and should be of length larger than 6 characters
            if (userName.length() > 6) {
                this.userName = userName;
            } else {
                System.out.println("Invalid username. Username should be longer than 6 characters.");
            }
        }
        public void setPassword(String password) {
            // Valid passwords cannot be empty, should be of length larger than 6 characters,
            // and should not contain the userName
            if (!password.isEmpty() && password.length() > 6 && !password.contains(userName)) {
                this.password = password;
            } else {
                System.out.println("Invalid password. Password should be longer than 6 characters and not contain the username.");
            }
        }

        // Getter methods
        public String getEmail() {
            return email;
        }

        public String getUserName() {
            return userName;
        }

        public String getPassword() {
            return password;
        }
    }
class RegistrationTester {
    public static void main(String[] args) {
        P14Registration registration = new P14Registration("sare@yahoo.com", "user123", "password123");

        // Accessing private variables using getter methods
        System.out.println("Email: " + registration.getEmail());
        System.out.println("Username: " + registration.getUserName());
        System.out.println("Password: " + registration.getPassword());
    }
}





