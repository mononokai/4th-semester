import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Container(
        color: Colors.white,
        child: Column(
          mainAxisAlignment: MainAxisAlignment.spaceEvenly,
          children: [
            Align(
              alignment: Alignment.topCenter,
              child: Container(
                height: 200,
                width: 200,
                decoration: BoxDecoration(
                  border: Border.all(
                    width: 5,
                    color: Colors.orange
                  ),
                  shape: BoxShape.circle,
                ),
                child: const Align(
                  alignment: Alignment.center,
                  child: Text(
                    "H",
                    style: TextStyle(
                      color: Colors.orange,
                      fontSize: 150,
                      decoration: TextDecoration.none
                    ),
                    textAlign: TextAlign.center,
                  ),
                ),
              ),
            ),
            Align(
              alignment: Alignment.bottomCenter,
              child: Container(
                width: 350,
                // padding: const EdgeInsets.all(20),
                decoration: BoxDecoration(
                  color: Colors.blue,
                  borderRadius: BorderRadius.circular(50.0)
                ),
                child: Align(
                  alignment: Alignment.centerLeft,
                  child: Container(
                    width: 260,
                    padding: const EdgeInsets.all(30),
                    decoration: const BoxDecoration(
                      borderRadius: BorderRadius.only(
                        topLeft: Radius.circular(50),
                        bottomLeft: Radius.circular(50),
                      ),
                      color: Colors.lightBlueAccent
                    ),
                    child: const Text(
                      "Challenge",
                      style: TextStyle(
                        color: Colors.white,
                        decoration: TextDecoration.none,
                        fontSize: 35,
                      ),
                    ),
                  ),
                )
              ),
            )
          ],
        )
      )
    );
  }
}
