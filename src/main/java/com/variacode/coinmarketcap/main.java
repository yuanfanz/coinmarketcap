package com.variacode.coinmarketcap;

import java.math.BigDecimal;
import java.util.List;

public class main {

    public static void main(String[] args) throws CoinMarketCap.CoinMarketCapException {

        //        List<CoinMarketCap.Ticker> tickerList = CoinMarketCap.getTicker(2000, null);

        boolean all = true;
        List<RefactorTicker.newTicker> tickerList = new RefactorTicker().Refactor(10, all);

<<<<<<< HEAD
    int count = 200;

    for (RefactorTicker.newTicker ticker : tickerList) {
      if (count == 0) break;
      //            if (ticker.getRank() > 150) continue;
      //            if (ticker == null) continue;
      BigDecimal capLimit = new BigDecimal(1000000);
      BigDecimal volumeLimit = new BigDecimal(200000);
      if (ticker.getMarketCapUsd().compareTo(capLimit) < 0) continue;
      if (ticker.get24hVolumeUsd().compareTo(volumeLimit) < 0) continue;
      System.out.println(
          ticker.getPeRatio()
              + " "
              + ticker.getSymbol()
              + " "
              + ticker.getRank()
              + " "
              + ticker.getPercentChange24h()
              + "%");
      if (ticker.getSymbol().equals("GAS")) System.out.println();
      if (ticker.getSymbol().equals("ADA")) System.out.println();
      if (ticker.getSymbol().equals("BTC")) System.out.println();
      if (ticker.getSymbol().equals("THC")) System.out.println();
      count--;
=======
        int count = 200;

        for (RefactorTicker.newTicker ticker : tickerList) {
            if (count == 0) break;
            //            if (ticker.getRank() > 150) continue;
            //            if (ticker == null) continue;
            BigDecimal capLimit = new BigDecimal(1000000);
            BigDecimal volumeLimit = new BigDecimal(200000);
            if (ticker.getMarketCapUsd().compareTo(capLimit) < 0) continue;
            if (ticker.get24hVolumeUsd().compareTo(volumeLimit) < 0) continue;
            if (ticker.getSymbol().equals("USDT")) continue;
            if (ticker.getSymbol().equals("SBD")) continue;
            System.out.println(
                    ticker.getPeRatio()
                            + " "
                            + ticker.getSymbol()
                            + " "
                            + ticker.getRank()
                            + " "
                            + ticker.getPercentChange24h()
                            + "%");
            if (ticker.getSymbol().equals("BTC")) System.out.println();
            if (ticker.getSymbol().equals("GAS")) System.out.println();
            if (ticker.getSymbol().equals("NEO")) System.out.println();
            count--;
        }
>>>>>>> 4c5422c1ed272f6a3653cf469aacfaba9f90fbcc
    }
}
