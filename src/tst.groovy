def getUser() {
    [login: 'use2',password:'pass3']
}

//User user = getUser()

User us1 = new User(password: 'pass1',login:'user1')
User us2 = new User(password: 'pass2',login:'user2')
User us3 = new User(password: 'pass3',login:'user1')
List<User> list = [us1, us2, us3]

User sum = user + us1
//println sum.login
//println sum.password
//def pr = {println "variable"}
//
//pr.call()

def findAllElements = {List<User> users, User user1, Closure closure -> users.findAll {userI->closure(user1, userI)}}

println findAllElements(list, user, {u1, u2->u1.password==u2.password}).size()

us1.metaClass.getLogin={null}

println us1.login
println us2.login
println us3.login