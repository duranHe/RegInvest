package org.heyuning.RegInvest

import org.heyuning.RegInvest.datasource.historical.CSVReader

object Launcher {
  def main(args: Array[String]) = {
    new CSVReader().parseCSV()
  }
}
