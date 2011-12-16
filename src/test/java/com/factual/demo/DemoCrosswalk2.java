package com.factual.demo;

import static com.factual.FactualTest.read;

import com.factual.Crosswalk;
import com.factual.CrosswalkQuery;
import com.factual.CrosswalkResponse;
import com.factual.Factual;


public class DemoCrosswalk2 {
  private static String key = read("key.txt");
  private static String secret = read("secret.txt");
  private static Factual factual = new Factual(key, secret);

  public static void main(String[] args) {
    // Get Loopt's Crosswalk data for a specific Places entity, using its Factual ID:
    CrosswalkResponse resp = factual.fetch("places",
        new CrosswalkQuery()
    .factualId("97598010-433f-4946-8fd5-4a6dd1639d77")
    .only("loopt"));

    // Print out the Crosswalk results:
    for(Crosswalk cw : resp.getCrosswalks()) {
      System.out.println(cw);
    }
  }

}
