import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          backgroundColor: const Color.fromARGB(255, 170, 140, 210),
          actions: <Widget>[
            Builder(
              builder: (BuildContext context) {
                return TextButton(
                  onPressed: (){
                    Navigator.push(
                      context, 
                      MaterialPageRoute(
                        builder: (context) => const LoginPage()
                      )
                    );
                  }, 
                  child: const Text(
                    "Login",
                    style: TextStyle(
                      color: Colors.black
                    )
                  )
                );
              },
            )
          ]
        ),
        floatingActionButton: FloatingActionButton(
          onPressed: (){},
          shape: const CircleBorder(),
          backgroundColor: const Color.fromARGB(255, 170, 140, 210),
          child: const Icon(Icons.add),
        ),
        floatingActionButtonLocation: FloatingActionButtonLocation.endFloat,
        persistentFooterButtons: <Widget>[
          ElevatedButton(
            onPressed: (){}, 
            child: const Icon(Icons.print)
          ),
          ElevatedButton(
            onPressed: (){}, 
            child: const Icon(Icons.send)
          )
        ],
        bottomNavigationBar: BottomNavigationBar(
          items: const [
            BottomNavigationBarItem(
              label: "Home",
              icon: Icon(Icons.home)
            ),
            BottomNavigationBarItem(
              label: "Search",
              icon: Icon(Icons.search)
            ),
            BottomNavigationBarItem(
              label: "Add",
              icon: Icon(Icons.add)
            ),
          ]
        ),
        drawer: Drawer(
          child: ListView(
            children: const [
              DrawerHeader(
                child: ListTile(
                  title: Text("Title"),
                  subtitle: Text("subtext"),
                ),
              ),
              ListTile(
                leading: Icon(Icons.mail),
                title: Text("Inbox")
              ),
              ListTile(
                leading: Icon(Icons.send),
                title: Text("Outbox")
              ),
              ListTile(
                leading: Icon(Icons.favorite),
                title: Text("Favorites")
              ),
              ListTile(
                leading: Icon(Icons.archive),
                title: Text("Archive")
              ),
              ListTile(
                leading: Icon(Icons.delete),
                title: Text("Trash")
              ),
              ListTile(
                leading: Icon(Icons.report),
                title: Text("Spam")
              ),
              Divider(),
              ListTile(title: Text("Labels")),
              ListTile(
                leading: Icon(Icons.bookmark),
                title: Text("Family")
              ),
              ListTile(
                leading: Icon(Icons.bookmark),
                title: Text("Friend")
              ),
              ListTile(
                leading: Icon(Icons.bookmark),
                title: Text("Work")
              ),
              Divider(),
              ListTile(
                leading: Icon(Icons.settings),
                title: Text("Settings & account"),
              )
            ]
          ),
        ),
      )
    );
  }
}


class LoginPage extends StatelessWidget {
  const LoginPage ({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        backgroundColor: const Color.fromARGB(255, 170, 140, 210),
        body: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.spaceAround,
            children: [
              Title(
                color: Colors.blue,
                child: const Text(
                  "Hello",
                  style: TextStyle(
                    fontSize: 40,
                    color: Colors.white
                  ),
                ),
              ),
              SizedBox(
                width: 200,
                child: Column(
                  children: [
                    const TextField(
                      decoration: InputDecoration(
                        hintText: "Email"
                      ),
                    ),
                    const TextField(
                      decoration: InputDecoration(
                        hintText: "Password"
                      ),
                    ),
                    ElevatedButton(
                      onPressed: (){
                        Navigator.push(
                          context, 
                          MaterialPageRoute(
                            builder: (context) => const ChatPage()
                          )
                        );
                      }, 
                      child: const Icon(Icons.arrow_forward)
                    ),
                  ],
                ),
              ),
              ElevatedButton(
                onPressed: (){
                  Navigator.pop(context);
                }, 
                child: const Icon(Icons.arrow_back)
              )
            ]
          ),
        ),
      ),
    );
  }
}


class ChatPage extends StatelessWidget {
  const ChatPage ({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        appBar: AppBar(
          leading: BackButton(
            onPressed: () {Navigator.pop(context);},
          ),
          title: const Column(
            mainAxisAlignment: MainAxisAlignment.center,
            crossAxisAlignment: CrossAxisAlignment.center,
            children: <Widget>[
              Text(
                'Robert',
                style: TextStyle(fontSize: 24),
              ),
              Text(
                'Online',
                style: TextStyle(fontSize: 16),
              ),
            ],
          ),
          actions: const [
            Icon(Icons.phone),
            Icon(Icons.video_call)
          ],
        ),
        body: Column(
          children: [
            Flexible(
              child: ListView(
                padding: const EdgeInsets.all(10),
                children: [
                  ListTile(
                    leading: Container(
                      decoration: const BoxDecoration(
                        color: Colors.black87,
                        borderRadius: BorderRadius.all(Radius.circular(20))
                      ),
                      child: const Padding(
                        padding: EdgeInsets.all(12),
                        child: Text(
                          "hello",
                          style: TextStyle(
                            color: Colors.white,
                            fontSize: 16
                          ),
                        ),
                      ),
                    ),
                  ),
                  ListTile(
                    trailing: Container(
                      decoration: const BoxDecoration(
                        color: Colors.blue,
                        borderRadius: BorderRadius.all(Radius.circular(20))
                      ),
                      child: const Padding(
                        padding: EdgeInsets.all(12),
                        child: Text(
                          "hi there",
                          style: TextStyle(
                            color: Colors.white,
                            fontSize: 16
                          ),
                        ),
                      ),
                    ),
                  ),
                  ListTile(
                    leading: Container(
                      decoration: const BoxDecoration(
                        color: Colors.black87,
                        borderRadius: BorderRadius.all(Radius.circular(20))
                      ),
                      child: const Padding(
                        padding: EdgeInsets.all(12),
                        child: Text(
                          "what's up?",
                          style: TextStyle(
                            color: Colors.white,
                            fontSize: 16
                          ),
                        ),
                      ),
                    ),
                  ),
                  ListTile(
                    trailing: Container(
                      decoration: const BoxDecoration(
                        color: Colors.blue,
                        borderRadius: BorderRadius.all(Radius.circular(20))
                      ),
                      child: const Padding(
                        padding: EdgeInsets.all(12),
                        child: Text(
                          "not much",
                          style: TextStyle(
                            color: Colors.white,
                            fontSize: 16
                          ),
                        ),
                      ),
                    ),
                  ),
                  ListTile(
                    trailing: Container(
                      decoration: const BoxDecoration(
                        color: Colors.blue,
                        borderRadius: BorderRadius.all(Radius.circular(20))
                      ),
                      child: const Padding(
                        padding: EdgeInsets.all(12),
                        child: Text(
                          "how about you?",
                          style: TextStyle(
                            color: Colors.white,
                            fontSize: 16
                          ),
                        ),
                      ),
                    ),
                  ),
                ]
              )
            ),
            const Divider(),
            Row(
              crossAxisAlignment: CrossAxisAlignment.center,
              mainAxisAlignment: MainAxisAlignment.spaceEvenly,
              children: [
                const Expanded(
                  child: SizedBox(
                    width: 150,
                    // decoration: const BoxDecoration(),
                    child: TextField(
                      style: TextStyle(fontSize: 16),
                      decoration: InputDecoration(
                        hintText: "Type your message",
                        border: OutlineInputBorder(
                          borderRadius: BorderRadius.all(Radius.circular(20))
                        ),
                        contentPadding: EdgeInsets.fromLTRB(12, 8, 12, 8),
                      ),
                    )
                  ),
                ),
                ElevatedButton(
                  onPressed: (){}, 
                  child: const Icon(Icons.attach_email),
                ),
                ElevatedButton(
                  onPressed: (){}, 
                  child: const Icon(Icons.mic)
                )
              ],
            )
          ],
        )
      ),
    );
  }
}