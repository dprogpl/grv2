class User {
    String login;
    private String password;

    @Override
    boolean equals(Object obj1) {
        return login == obj1.login
    }

    User plus(User user2) {
        new User(login: "${login} ${user2.login}", password: "${password} ${user2.password}")
    }
}
