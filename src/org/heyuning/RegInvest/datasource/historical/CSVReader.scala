package org.heyuning.RegInvest.datasource.historical


import java.io.FileReader

import org.apache.commons.csv.CSVFormat
import scala.collection.JavaConverters._

class CSVReader {
  val BTCDailyCSVPath = "/Users/heyuning/IdeaProjects/RegInvest/data/crypto/BTC-daily.csv"
  val BTCDailyCSVHeader = List("Date","Price","Open","High","Low","Volume","Change")


  def parseCSV() = {
    val in = new FileReader(BTCDailyCSVPath)
    val records = CSVFormat.RFC4180.withHeader(BTCDailyCSVHeader: _*).parse(in)
    var counter = 0
    records.asScala.foreach(record => println(record.get(CryptoHeader.Change.toString)))
    println(counter)
  }
}

object CryptoHeader extends Enumeration {
  type CryptoHeader = Value
  val Date, Price, Open, High, Low, Volume, Change = Value
}
