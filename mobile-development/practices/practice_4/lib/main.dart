import 'package:flutter/material.dart';
import 'package:flutter_credit_card/flutter_credit_card.dart';

void main() {
  runApp(MyApp());
}

class MyApp extends StatelessWidget {
  MyApp({super.key});

  final List<Map<String, String>> planets = [
    {
      'name': 'Mercury',
      'description': 'The smallest planet in our solar system.',
      'image': 'assets/planet.jpeg',
      'distance': '58 million km',
      'orbitalSpeed': '47.87 km/s'
    },
    {
      'name': 'Venus',
      'description': 'The hottest planet in our solar system.',
      'image': 'assets/planet.jpeg',
      'distance': '108 million',
      'orbitalSpeed': '35.02 km/s'
    },
    {
      'name': 'Earth',
      'description': 'The only planet known to have life.',
      'image': 'assets/planet.jpeg',
      'distance': '150 million',
      'orbitalSpeed': '29.78 km/s'
    },
    {
      'name': 'Mars',
      'description': 'The red planet.',
      'image': 'assets/planet.jpeg',
      'distance': '228 million',
      'orbitalSpeed': '24.07 km/s'
    },
    {
      'name': 'Jupiter',
      'description': 'The largest planet in our solar system.',
      'image': 'assets/planet.jpeg',
      'distance': '778 million',
      'orbitalSpeed': '13.07 km/s'
    },
    {
      'name': 'Saturn',
      'description': 'The planet with the largest rings.',
      'image': 'assets/planet.jpeg',
      'distance': '1.4 billion km',
      'orbitalSpeed': '9.69 km/s'
    },
    {
      'name': 'Uranus',
      'description': 'The coldest planet in our solar system.',
      'image': 'assets/planet.jpeg',
      'distance': '2.9 billion km',
      'orbitalSpeed': '6.81 km/s'
    },
    {
      'name': 'Neptune',
      'description': 'The planet with the fastest winds.',
      'image': 'assets/planet.jpeg',
      'distance': '4.5 billion km',
      'orbitalSpeed': '5.43 km/s'
    },
  ];

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      home: Scaffold(
        body: Column(
          children: [
            // Expanded(
            //   child: ListView(
            //     children: [
            //       ListTile(
            //         title: const Text("Colors"),
            //         leading: Stack(
            //           children: [
            //             Container(
            //               width: 100,
            //               height: 100,
            //               color: Colors.red,
            //             ),
            //             Container(
            //               width: 90,
            //               height: 90,
            //               color: Colors.green,
            //             ),
            //             Container(
            //               width: 80,
            //               height: 80,
            //               color: Colors.blue,
            //             ),
            //           ],
            //         ),
            //       ),
            //       const Card(
            //         child: ListTile(
            //           title: Text("Robert"),
            //           leading: CircleAvatar(
            //             backgroundImage: AssetImage("assets/face.jpg"),
            //           ),
            //         ),
            //       ),
            //       const Card(
            //         child: ListTile(
            //           title: Text("One-line ListTile")
            //         ),
            //       ),
            //       const Card(
            //         child: ListTile(
            //           leading: FlutterLogo(size: 56),
            //           title: Text("One-line with leading widget"),
            //         )
            //       ),
            //       const Card(
            //         child: ListTile(
            //           title: Text("One-line with trailing widget"),
            //           trailing: Icon(Icons.more_vert)
            //         )
            //       ),
            //       const Card(
            //         child: ListTile(
            //           leading: FlutterLogo(size: 56),
            //           title: Text("Two-line with both widgets"),
            //           trailing: Icon(Icons.more_vert)
            //         )
            //       ),
            //       const Card(
            //         child: ListTile(
            //           dense: true,
            //           title: Text("One-line dense ListTile"),
            //         )
            //       ),
            //       const Card(
            //         child: ListTile(
            //           leading: FlutterLogo(size: 56),
            //           title: Text("Two-line ListTile"),
            //           subtitle: Text("Here is a second line"),
            //           trailing: Icon(Icons.more_vert)
            //         )
            //       ),
            //       const Card(
            //         child: ListTile(
            //           leading: FlutterLogo(size: 56),
            //           title: Text("Three-line ListTile"),
            //           subtitle: Text("A sufficiently long subtitle warrants three lines."),
            //           trailing: Icon(Icons.more_vert)
            //         )
            //       ),
            //     ]
            //   ),
            // ),
            // Expanded(
            //   child: ListView.separated(
            //     itemCount: 6,
            //     separatorBuilder: (context, index) {
            //       return Card(
            //         child: ListTile(
            //           title: Text("Separator ${index + 1}"),
            //         )
            //       );
            //     },
            //     itemBuilder: (context, index) {
            //       List<String> months = ['January', 'February', 'March', 'April', 'May', 'June'];
            //       return Card(
            //         child: ListTile(
            //           title: Text(months[index]),
            //         )
            //       );
            //     }
            //   ),
            // ),
            Expanded(
              child: Container(
                color:  const Color.fromARGB(255, 118, 102, 181),
                child: ListView.builder(
                  itemCount: planets.length,
                  itemBuilder: (context, index) {
                    return Stack(
                      children: [
                        Container(
                          margin: const EdgeInsets.fromLTRB(50, 0, 0, 0),
                          child: Card(
                            color: const Color.fromARGB(255, 54, 48, 101),
                            child: Container(
                              height: 110,
                              padding: const EdgeInsets.only(left: 30, top: 10, bottom: 10),
                              child: ListTile(
                                title: Text(
                                  planets[index]['name']!,
                                  style: const TextStyle(color: Colors.white)
                                  ),
                                subtitle: Text(
                                  planets[index]['description']!,
                                  style: const TextStyle(color: Colors.grey)
                                  ),
                                trailing: Column(
                                  children: [
                                    Text(
                                      planets[index]['distance']!,
                                      style: const TextStyle(color: Colors.grey)
                                      ),
                                    Text(
                                      planets[index]['orbitalSpeed']!,
                                      style: const TextStyle(color: Colors.grey)
                                      )
                                  ],
                                )
                              ),
                            ),
                          ),
                        ),
                        Container(
                          margin: const EdgeInsets.only(top: 18, left: 10),
                          child: const CircleAvatar(
                            radius: 40,
                            backgroundImage: AssetImage('assets/planet.jpg'),
                          ),
                        ),
                      ]
                    );
                  }
                ),
              )
            ),
            CreditCardWidget(
              cardNumber: '5450 7879 4864 7854', 
              expiryDate: '10/25', 
              cardHolderName: 'Robert', 
              cvvCode: '456', 
              isHolderNameVisible: true,
              backgroundImage: "assets/scenery.jpg",
              onCreditCardWidgetChange: (CreditCardBrand creditCardBrand) {},
              showBackView: false,
            )
          ]
        ),
      ),
    );
  }
}
