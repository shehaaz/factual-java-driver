package com.factual.demo;

import static com.factual.FactualTest.read;

import com.factual.Factual;
import com.factual.Query;


public class DemoSimpleRead {

  public static void main(String[] args) {
    String key = read("key.txt");
    String secret = read("secret.txt");
    Factual factual = new Factual(key, secret);

    System.out.println(
        factual.fetch("places", new Query().limit(3)));
  }

}
