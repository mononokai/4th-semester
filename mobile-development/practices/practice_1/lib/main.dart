import 'package:flutter/material.dart';

void main() {
  runApp(
    MaterialApp(
      home: Scaffold(
        body: Center(
          child: Container(
            color: Colors.red,
            width: 300,
            height: 200,
            child: const Center(
              child: Text(
              "Hello World!",
              style: TextStyle(
                fontSize: 30
                ),
              )
            ),
          ),
        )
      ),
    )
  );
}

