
import 'package:flutter/material.dart';

void main() {
  runApp(const MaterialApp(
    home: Widgy()
  )
  );
}


class Widgy extends StatelessWidget{
  const Widgy({super.key});

  @override
  Widget build(BuildContext context) {
    return Container(
      color: Colors.white,
      child: Row(
        children: [
          Expanded(
            child: Column(
              mainAxisAlignment: MainAxisAlignment.spaceEvenly,
              crossAxisAlignment: CrossAxisAlignment.center,
              children: [
                Container(
                  decoration: BoxDecoration(
                    border: Border.all(
                      color: Colors.black,
                      width: 2
                    )
                  ),
                child: const Padding(
                  padding: EdgeInsets.fromLTRB(20, 2, 20, 2),
                    child: Text(
                      "Strawberry Pavlova",
                      style: TextStyle(
                        color: Colors.black,
                        fontSize: 16,
                        decoration: TextDecoration.none
                      ),
                      textAlign: TextAlign.center,
                    ),
                  ),
                ),
                Container(
                  decoration: BoxDecoration(
                    border: Border.all(
                      color: Colors.black,
                      width: 2
                    )
                  ),
                  child: const Padding (
                    padding: EdgeInsets.all(2),
                    child: Text(
                      "Pavlova is a meringue-based dessert named after the Russian ballerina Anna Pavlova. Pavlova features a crisp crust and soft, light inside, topped with fruit and whipped cream.",
                      style: TextStyle(
                        color: Colors.black,
                        fontSize: 13,
                        decoration: TextDecoration.none
                      ),
                      textAlign: TextAlign.center,
                    ),
                  ),
                ),
                Container(
                  decoration: BoxDecoration(
                    border: Border.all(
                      color: Colors.black,
                      width: 2
                    )
                  ),
                  child: Row(
                    mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                    children: [
                      Column(
                        children: [
                          Row(children: [
                            Image.asset(
                              "assets/star.png",
                              height: 10,
                            ),
                            Image.asset(
                              "assets/star.png",
                              height: 10,
                            ),
                            Image.asset(
                              "assets/star.png",
                              height: 10,
                            ),
                            Image.asset(
                              "assets/star.png",
                              height: 10,
                            ),
                            Image.asset(
                              "assets/star.png",
                              height: 10,
                            ),
                          ],)
                        ],
                      ),
                      const Text(
                        "170 Reviews",
                          style: TextStyle(
                            color: Colors.black,
                            fontSize: 13,
                            decoration: TextDecoration.none
                          ),
                      )
                    ],
                  ),
                ),
                Container(
                  decoration: BoxDecoration(
                    border: Border.all(
                      color: Colors.black,
                      width: 2
                    )
                  ),
                  child: Row(
                    mainAxisAlignment: MainAxisAlignment.spaceAround,
                    children: [
                      Column(
                        children: [
                          Image.asset(
                            "assets/fridge.png",
                            height: 25,
                          ),
                          const Text(
                            "PREP:",
                            style: TextStyle(
                              color: Colors.black,
                              fontSize: 13,
                              decoration: TextDecoration.none
                            ),
                          ),
                          const Text(
                            "25 min",
                            style: TextStyle(
                              color: Colors.black,
                              fontSize: 13,
                              decoration: TextDecoration.none
                            ),
                          )
                        ],
                      ),
                      Column(
                        children: [
                          Image.asset(
                            "assets/time.png",
                            height: 25,
                          ),
                          const Text(
                            "COOK:",
                            style: TextStyle(
                              color: Colors.black,
                              fontSize: 13,
                              decoration: TextDecoration.none
                            ),
                          ),
                          const Text(
                            "1 hr",
                            style: TextStyle(
                              fontSize: 14,
                              color: Colors.black,
                              decoration: TextDecoration.none
                            ),
                          )
                        ],
                      ),
                      Column(
                        children: [
                          Image.asset(
                            "assets/cutlery.png",
                            height: 25,
                          ),
                          const Text(
                            "FEEDS:",
                            style: TextStyle(
                              color: Colors.black,
                              fontSize: 13,
                              decoration: TextDecoration.none
                            ),
                          ),
                          const Text(
                            "4-6",
                            style: TextStyle(
                              color: Colors.black,
                              fontSize: 13,
                              decoration: TextDecoration.none
                            ),
                          )
                        ],
                      ),
                    ],
                  ),
                ),
              ],
            ),
          ),
          Image.asset(
            "assets/strawberry_pavlova.png",
            fit: BoxFit.fitHeight
          ),
        ],
      )
    );
  }
}