package org.heyuning.RegInvest.client

import com.binance.api.client.BinanceApiClientFactory

object BinanceClient {
  val factory = BinanceApiClientFactory.newInstance("API", "Secret")
  val restClient = factory.newRestClient()
  val asyncClient = factory.newAsyncRestClient()

  def testConnectivity() = {
    System.out.println(restClient.getOrderBook("XZCETH", 10));
  }
}
