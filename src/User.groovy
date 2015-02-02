class User {
    String login;
    private String password;

    @Override
    boolean equals(Object obj5) {
        return login == obj5.login
    }

    User plus(User user2) {
        new User(login: "${login} ${user2.login}", password: "${password} ${user2.password}")
    }
}
