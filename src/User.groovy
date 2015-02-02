class User {
    String login;
    private String password;

    @Override
    boolean equals(Object obj) {
        return login == obj.login
    }

    User plus(User user2) {
        new User(login: "${login} ${user2.login}", password: "${password} ${user2.password}")
    }
}
