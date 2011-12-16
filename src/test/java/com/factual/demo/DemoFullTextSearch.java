package com.factual.demo;

import static com.factual.FactualTest.read;

import com.factual.Factual;
import com.factual.Query;


public class DemoFullTextSearch {

  public static void main(String[] args) {
    String key = read("key.txt");
    String secret = read("secret.txt");
    Factual factual = new Factual(key, secret);

    // Print entities that match a full text search for Sushi in Santa Monica:
    System.out.println(
        factual.fetch("places", new Query().search("Sushi Santa Monica")));
  }

}
