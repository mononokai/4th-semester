import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return const MaterialApp(
      home: WelcomePage()
    );
  }
}

class WelcomePage extends StatelessWidget {
  const WelcomePage({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.blueGrey.shade300,
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          crossAxisAlignment: CrossAxisAlignment.center,
          children: [
            Container(
              margin: const EdgeInsets.only(bottom: 10),
              child: Title(
                color: Colors.white, 
                child: const Text(
                  'Welcome',
                  style: TextStyle(
                    fontSize: 50,
                    color: Colors.white
                  ),
                )
              ),
            ),
            Container(
              margin: const EdgeInsets.only(bottom: 40),
              child: const Text(
                'What do you wanna do?',
                style: TextStyle(
                  fontSize: 20,
                  color: Colors.white
                ),
              ),
            ),
            ElevatedButton(
              onPressed: () {
                Navigator.push(
                  context, 
                  MaterialPageRoute(
                    builder: (context) => LoginPage()
                  )
                );
              }, 
              child: Text(
                'Login',
                style: TextStyle(
                  color: Colors.grey.shade900
                ),
              )
            ),
            ElevatedButton(
              onPressed: () {
                Navigator.push(
                  context,
                  MaterialPageRoute(
                    builder:(context) => SignUpPage(),
                  )
                );
              }, 
              child: Text(
                'Sign up',
                style: TextStyle(
                  color: Colors.grey.shade900
                ),
              )
            ),
          ],
        ),
      )
    );
  }
}

class LoginPage extends StatelessWidget {
  LoginPage ({super.key});

  final _formKey = GlobalKey<FormState>();
  final _emailController = TextEditingController();
  final _passwordController = TextEditingController();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.blueGrey.shade300,
      appBar: AppBar(
        leading: const BackButton(),
        backgroundColor: Colors.blueGrey,
      ),
      body: Center(
        child: Form(
          key: _formKey,
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: [
              Title(
                color: Colors.white,
                child: const Text(
                  "Log In",
                  style: TextStyle(
                    fontSize: 40,
                    color: Colors.white
                  ),
                ),
              ),
              SizedBox(
                width: 300,
                child: Column(
                  children: [
                    Container(
                      margin: const EdgeInsets.only(top: 30, bottom: 10),
                      child: TextFormField(
                        controller: _emailController,
                        decoration: const InputDecoration(
                          hintText: "Email",
                          filled: true,
                          fillColor: Colors.white,
                          focusedBorder: OutlineInputBorder(
                            borderSide: BorderSide(
                              color: Colors.grey
                            ),
                            borderRadius: BorderRadius.all(Radius.circular(10)),
                          ),
                          border: OutlineInputBorder(
                            borderRadius: BorderRadius.all(Radius.circular(5)),
                          ),
                          errorStyle: TextStyle(
                            fontSize: 14
                          ),
                        ),
                        validator: (value) {
                          if (value == null || value.isEmpty) {
                            return 'Please enter your email';
                          }
                          return null;
                        },
                      ),
                    ),
                    Container(
                      margin: const EdgeInsets.only(bottom: 10),
                      child: TextFormField(
                        controller: _passwordController,
                        obscureText: true,
                        decoration: const InputDecoration(
                          hintText: "Password",
                          filled: true,
                          fillColor: Colors.white,
                          focusedBorder: OutlineInputBorder(
                            borderSide: BorderSide(
                              color: Colors.grey
                            ),
                            borderRadius: BorderRadius.all(Radius.circular(10)),
                          ),
                          border: OutlineInputBorder(
                            borderRadius: BorderRadius.all(Radius.circular(5)),
                          ),
                          errorMaxLines: 3,
                          errorStyle: TextStyle(
                            fontSize: 14
                          ),
                        ),
                        validator: (value) {
                          if (value == null || value.isEmpty) {
                            return 'Please enter your password';
                          }
                          if (!passwordCheck(value)) {
                            return 'Password must have at least 1 uppercase, 1 lowercase, 1 number and be at least 8 characters long';
                          }
                          return null;
                        },
                      ),
                    ),
                    ElevatedButton(
                      onPressed: () {
                        if (_formKey.currentState!.validate()) {
                          Navigator.push(
                            context,
                            MaterialPageRoute(
                              builder: (context) => const HomePage()
                            )
                          );
                        }
                      }, 
                      child: Text(
                        'Login',
                        style: TextStyle(
                          color: Colors.grey.shade900
                        ),
                      )
                    ),
                    ElevatedButton(
                      onPressed: () {
                        Navigator.push(
                          context,
                          MaterialPageRoute(
                            builder:(context) => SignUpPage(),
                          )
                        );
                      }, 
                      child: Text(
                        'Sign up',
                        style: TextStyle(
                          color: Colors.grey.shade900
                        ),
                      )
                    ),
                  ],
                ),
              ),
            ]
          ),
        ),
      ),
    );
  }
}

class SignUpPage extends StatelessWidget {
  SignUpPage({super.key});

  final _formKey = GlobalKey<FormState>();
  final _passwordController = TextEditingController();
  final _confirmPasswordController = TextEditingController();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      backgroundColor: Colors.blueGrey.shade300,
      appBar: AppBar(
        leading: const BackButton(),
        backgroundColor: Colors.blueGrey,
      ),
      body: Center(
        child: SingleChildScrollView(
          child: Form(
            key: _formKey,
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                Title(
                  color: Colors.white,
                  child: const Text(
                    "Sign up",
                    style: TextStyle(
                      fontSize: 40,
                      color: Colors.white
                    ),
                  ),
                ),
                SizedBox(
                  width: 300,
                  child: Column(
                    children: [
                      Container(
                        margin: const EdgeInsets.only(top: 30, bottom: 10),
                        child: TextFormField(
                          decoration: const InputDecoration(
                            hintText: "Email",
                            filled: true,
                            fillColor: Colors.white,
                            focusedBorder: OutlineInputBorder(
                              borderSide: BorderSide(
                                color: Colors.grey
                              ),
                              borderRadius: BorderRadius.all(Radius.circular(10)),
                            ),
                            border: OutlineInputBorder(
                              borderRadius: BorderRadius.all(Radius.circular(5)),
                            ),
                            errorStyle: TextStyle(
                              fontSize: 14
                            ),
                          ),
                          validator: (value) {
                            if (value == null || value.isEmpty) {
                              return 'Please enter your email';
                            }
                            return null;
                          },
                        ),
                      ),
                      Container(
                        margin: const EdgeInsets.only(bottom: 10),
                        child: TextFormField(
                          controller: _passwordController,
                          obscureText: true,
                          decoration: const InputDecoration(
                            hintText: "Password",
                            filled: true,
                            fillColor: Colors.white,
                            focusedBorder: OutlineInputBorder(
                              borderSide: BorderSide(
                                color: Colors.grey
                              ),
                              borderRadius: BorderRadius.all(Radius.circular(10)),
                            ),
                            border: OutlineInputBorder(
                              borderRadius: BorderRadius.all(Radius.circular(5)),
                            ),
                            errorMaxLines: 3,
                            errorStyle: TextStyle(
                              fontSize: 14
                            ),
                          ),
                          validator: (value) {
                            if (value == null || value.isEmpty) {
                              return 'Please enter your password';
                            }
                            if (!passwordCheck(value)) {
                              return 'Password must have at least 1 uppercase, 1 lowercase, 1 number and be at least 8 characters long';
                            }
                            return null;
                          },
                        ),
                      ),
                      Container(
                        margin: const EdgeInsets.only(bottom: 10),
                        child: TextFormField(
                          controller: _confirmPasswordController,
                          obscureText: true,
                          decoration: const InputDecoration(
                            hintText: "Confirm Password",
                            filled: true,
                            fillColor: Colors.white,
                            focusedBorder: OutlineInputBorder(
                              borderSide: BorderSide(
                                color: Colors.grey
                              ),
                              borderRadius: BorderRadius.all(Radius.circular(10)),
                            ),
                            border: OutlineInputBorder(
                              borderRadius: BorderRadius.all(Radius.circular(5)),
                            ),
                            errorStyle: TextStyle(
                              fontSize: 14
                            ),
                          ),
                          validator: (value) {
                            if (value == null || value.isEmpty) {
                              return 'Please confirm your password';
                            }
                            if (value != _passwordController.text) {
                              return 'Passwords do not match';
                            }
                            return null;
                          },
                        ),
                      ),
                      ElevatedButton(
                        onPressed: () {
                          if (_formKey.currentState!.validate()) {
                            Navigator.push(
                              context,
                              MaterialPageRoute(
                                builder: (context) => const HomePage()
                              )
                            );
                          }
                        }, 
                        child: Text(
                          'Sign up',
                          style: TextStyle(
                            color: Colors.grey.shade900
                          ),
                        )
                      ),
                    ],
                  ),
                ),
              ]
            ),
          ),
        ),
      ),
    );
  }
}

class HomePage extends StatefulWidget {
  const HomePage({super.key});

  @override
  State<HomePage> createState() => _HomePageState();
}

class _HomePageState extends State<HomePage> {
  final _robertMessages = Messages(friend: 'Robert');
  final _accountInfo = User(
    name: 'David', 
    picture: Image.asset('assets/profile_pictures/pfp.png'),
    status: 'help'
  );

  _HomePageState() {
    _robertMessages.addMessage(Message(
      text: "hello",
      isSent: false,
      timestamp: DateTime.now().subtract(const Duration(seconds: 100))
    ));
    _robertMessages.addMessage(Message(
      text: "hi there",
      isSent: true,
      timestamp: DateTime.now().subtract(const Duration(seconds: 90))
    ));
    _robertMessages.addMessage(Message(
      text: "what's up?",
      isSent: false,
      timestamp: DateTime.now().subtract(const Duration(seconds: 80))
    ));
    _robertMessages.addMessage(Message(
      text: "not much",
      isSent: true,
      timestamp: DateTime.now().subtract(const Duration(seconds: 70))
    ));
    _robertMessages.addMessage(Message(
      text: "how about you?",
      isSent: true,
      timestamp: DateTime.now().subtract(const Duration(seconds: 69))
    ));
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Colors.blueGrey,
        iconTheme: const IconThemeData(
          color: Colors.black
        ),
      ),
      floatingActionButton: FloatingActionButton(
        onPressed: (){},
        shape: const CircleBorder(),
        backgroundColor: Colors.blueGrey,
        child: const Icon(
          Icons.add,
          color: Colors.black,
        ),
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
          children:  [
            DrawerHeader(
              child: ListTile(
                leading: Container(
                  height: 30,
                  margin: const EdgeInsets.only(bottom: 20),
                  decoration: BoxDecoration(
                    border: Border.all(
                      color: Colors.grey.shade600,
                      width: 4,
                    ),
                    borderRadius: const BorderRadius.all(Radius.circular(50)),
                  ),
                  child: ClipOval(child: _accountInfo.picture)
                ),
                title: Text(_accountInfo.name),
                subtitle: Text('"${_accountInfo.status}"'),
              ),
            ),
            GestureDetector(
              onTap:() {
                Navigator.push(
                  context,
                  MaterialPageRoute(
                    builder: (context) => ChatPage(robertMessages: _robertMessages)
                  )
                );
              },
              child: const ListTile(
                leading: Icon(Icons.person),
                title: Text("Robert")
              ),
            ),
            const ListTile(
              leading: Icon(Icons.person),
              title: Text("Ryan")
            ),
            const ListTile(
              leading: Icon(Icons.person),
              title: Text("Dave")
            ),
            const ListTile(
              leading: Icon(Icons.person),
              title: Text("Chris")
            ),
            const Divider(),
            GestureDetector(
              onTap: () {
                Navigator.push(
                  context,
                  MaterialPageRoute(
                    builder: (context) => AccountPage(accountInfo: _accountInfo)
                  )
                );
              },
              child: const ListTile(
                leading: Icon(Icons.settings),
                title: Text("Account Page"),
              ),
            ),
            const Divider(),
            const ListTile(
              leading: Icon(Icons.logout),
              title: Text("Logout")
            )
          ]
        ),
      ),
    );
  }
}

class AccountPage extends StatefulWidget {
  final User accountInfo;

  const AccountPage({required this.accountInfo, super.key});

  @override
  State<AccountPage> createState() => _AccountPageState();
}

class _AccountPageState extends State<AccountPage> {
  late final TextEditingController _nameController;
  late final TextEditingController _statusController;
  bool _editMode = false;

  @override
  void initState() {
    super.initState();
    _nameController = TextEditingController(text: widget.accountInfo.name);
    _statusController = TextEditingController(text: widget.accountInfo.status);
  }

  void _toggleEditMode() {
    setState(() {
      _editMode = !_editMode;

      if (!_editMode) {
        widget.accountInfo.name = _nameController.text;
        widget.accountInfo.status = _statusController.text;
      }
    });
  }

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        backgroundColor: Colors.blueGrey,
        iconTheme: const IconThemeData(
          color: Colors.black,
        ),
        leading: BackButton(
          onPressed: () {Navigator.pop(context);},
        ),
        title: const Text("Account Page"),
        actions: [
          IconButton(
            icon: Icon(_editMode ? Icons.save : Icons.edit),
            onPressed: _toggleEditMode,
          ),
        ],
      ),
      body: Padding(
        padding: const EdgeInsets.all(20),
        child: Column(
          children: [
            Container(
              height: 80,
              margin: const EdgeInsets.only(bottom: 20),
              decoration: BoxDecoration(
                border: Border.all(
                  color: Colors.grey.shade600,
                  width: 4,
                ),
                borderRadius: const BorderRadius.all(Radius.circular(50)),
              ),
              child: ClipOval(child: widget.accountInfo.picture)
            ),
            Row(
              children: [
                const Padding(
                  padding: EdgeInsets.all(8.0),
                  child: Text('Name: '),
                ),
                Expanded(
                  child: _editMode
                    ? TextField(
                        controller: _nameController,
                        style: const TextStyle(
                          fontSize: 20
                        )
                      )
                    : Text(
                        widget.accountInfo.name,
                        style: const TextStyle(
                          fontSize: 20
                        ),
                      ),
                ),
              ],
            ),
            Row(
              children: [
                const Padding(
                  padding: EdgeInsets.all(8.0),
                  child: Text('Status: '),
                ),
                Expanded(
                  child: _editMode
                    ? TextField(
                        controller: _statusController,
                        style: const TextStyle(
                          fontSize: 20
                        )
                      )
                    : Text(
                        widget.accountInfo.status,
                        style: const TextStyle(
                          fontSize: 20
                        ),
                      ),
                ),
              ],
            ),
          ],
        ),
      )
    );
  }
}

class ChatPage extends StatefulWidget {
  final Messages robertMessages;

  const ChatPage ({required this.robertMessages, super.key});

  @override
  State<ChatPage> createState() => _ChatPageState();
}

class _ChatPageState extends State<ChatPage> {
  final _messageController = TextEditingController();
  final _scrollController = ScrollController();

  @override
  Widget build(BuildContext context) {
    return Scaffold(
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
            child: ListView.builder(
              controller: _scrollController,
              padding: const EdgeInsets.all(10),
              itemCount: widget.robertMessages.messages.length,
              itemBuilder: (context, index) {
                final message = widget.robertMessages.messages[index];
                return _buildMessageTile(message);
              },
            ) 
          ),
          const Divider(),
          Row(
            crossAxisAlignment: CrossAxisAlignment.center,
            mainAxisAlignment: MainAxisAlignment.spaceEvenly,
            children: [
              Expanded(
                child: SizedBox(
                  width: 150,
                  // decoration: const BoxDecoration(),
                  child: TextField(
                    controller: _messageController,
                    style: const TextStyle(fontSize: 16),
                    decoration: const InputDecoration(
                      hintText: "Type your message",
                      border: OutlineInputBorder(
                        borderRadius: BorderRadius.all(Radius.circular(20))
                      ),
                      contentPadding: EdgeInsets.fromLTRB(12, 8, 12, 8),
                    ),
                  )
                ),
              ),
              IconButton(
                icon: const Icon(Icons.send),
                onPressed: (){
                  final text = _messageController.text;

                  if (text.isNotEmpty) {
                    setState(() {
                      widget.robertMessages.addMessage(Message(
                        text: text,
                        isSent: true,
                        timestamp: DateTime.now()
                      ));
                      _messageController.clear(); // Clear the text field
                    });

                    _scrollController.animateTo(
                      _scrollController.position.maxScrollExtent,
                      duration: const Duration(microseconds: 200),
                      curve: Curves.easeInOut
                    );
                  }
                }, 
              ),
              ElevatedButton(
                onPressed: (){}, 
                child: const Icon(Icons.mic)
              )
            ],
          )
        ],
      )
    );
  }

  Widget _buildMessageTile(Message message) {
    if (message.isSent) {
      return ListTile(
        trailing: Container(
          decoration: const BoxDecoration(
            color: Colors.blue,
            borderRadius: BorderRadius.all(Radius.circular(20))
          ),
          child: Padding(
            padding: const EdgeInsets.all(12),
            child: Text(
              message.text,
              style: const TextStyle(
                color: Colors.white,
                fontSize: 16
              ),
            ),
          ),
        ),
      );
    }
    else {
      return ListTile(
        leading: Container(
          decoration: const BoxDecoration(
            color: Colors.black87,
            borderRadius: BorderRadius.all(Radius.circular(20))
          ),
          child: Padding(
            padding: const EdgeInsets.all(12),
            child: Text(
              message.text,
              style: const TextStyle(
                color: Colors.white,
                fontSize: 16
              ),
            ),
          ),
        ),
      );
    }
  }
}

bool passwordCheck (String password) {
  if (password.length < 8) {
    return false;
  }

  bool hasUppercase = password.contains(RegExp(r'[A-Z]'));
  bool hasDigits = password.contains(RegExp(r'[0-9]'));
  bool hasLowercase = password.contains(RegExp(r'[a-z]'));

  return hasUppercase & hasLowercase & hasDigits;
}

class User{
  String name;
  Image picture;
  String status;

  User ({
    required this.name,
    required this.picture,
    this.status = ''
  });
}

class Message {
  final String text;
  final bool isSent;
  final DateTime timestamp;

  Message({
    required this.text,
    required this.isSent,
    required this.timestamp
  });
}

class Messages {
  final String friend;
  List<Message> messages;

  Messages({
    required this.friend
  }) : messages = <Message>[]; // this is called a member variable, here we are initializing it

  void addMessage(Message message) {
    messages.add(message);
  }
}