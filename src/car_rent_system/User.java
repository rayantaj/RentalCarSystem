
package car_rent_system;



/*
 THIS IS AN ABSTRACT CLASS , AND IT IS THE FATHER FOR BOTH CUSTOMER AND ORGNAIZATION ....
 THIS CLASS PROVIDE THE SIGNUP AND LOGIN METHODS .
 */

public abstract class User {

    String Name, Email, Password, phone;

    public User(String Name, String Email, String Password, String phone) {
        this.Name = Name;
        this.Email = Email;
        this.Password = Password;
        this.phone = phone;
    }

    public boolean Login(String Email, String Password) {

        if (this.Email.equalsIgnoreCase(Email) && this.Password.equals(Password)) {
            return true;
        }

        return false;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void Get_User_Data() {

        System.out.println("name  : " + this.Name);
        System.out.println("email : " + this.Email);
        System.out.println("password : " + this.Password);
        System.out.println("phone : " + this.phone);

    }

}
