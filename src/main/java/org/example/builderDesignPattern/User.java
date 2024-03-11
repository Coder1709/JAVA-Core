package org.example.builderDesignPattern;

public class User {

    private String userId;

    private String userName;

    private String address;

    private String email;


    private  User(UserBuilder userBuilder) {
        this.userId = userBuilder.userId;
        this.userName =userBuilder.userName;
        this.address = userBuilder.address;
        this.email = userBuilder.email;

   }
        //initialize


    //Getters

    public String getUserId() {
        return userId;
    }

    public String getUserName() {
        return userName;
    }

    public String getAddress() {
        return address;
    }

    public String getEmail() {
        return email;
    }

    //inner class to create object

    static class UserBuilder {


        private String userId;

        private String userName;

        private String address;

        private String email;

        public UserBuilder(){

        }


        public UserBuilder setUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder setUserName(String userName) {
            this.userName = userName;
            return  this;
        }

        public UserBuilder setAddress(String address) {
            this.address = address;
            return this;
        }

        public UserBuilder setEmail(String email) {
            this.email = email;
            return this;

        }

        public User build() {
            User user = new User(this);
            return user;
        }
    }
}
