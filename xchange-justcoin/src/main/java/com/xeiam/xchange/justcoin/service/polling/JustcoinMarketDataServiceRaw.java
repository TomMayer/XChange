/**
 * Copyright (C) 2012 - 2014 Xeiam LLC http://xeiam.com
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of
 * this software and associated documentation files (the "Software"), to deal in
 * the Software without restriction, including without limitation the rights to
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
package com.xeiam.xchange.justcoin.service.polling;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import si.mazi.rescu.RestProxyFactory;

import com.xeiam.xchange.ExchangeSpecification;
import com.xeiam.xchange.currency.CurrencyPair;
import com.xeiam.xchange.justcoin.Justcoin;
import com.xeiam.xchange.justcoin.JustcoinUtils;
import com.xeiam.xchange.justcoin.dto.marketdata.JustcoinDepth;
import com.xeiam.xchange.justcoin.dto.marketdata.JustcoinTicker;
import com.xeiam.xchange.service.polling.BasePollingExchangeService;

/**
 * @author jamespedwards42
 */
public class JustcoinMarketDataServiceRaw extends BasePollingExchangeService {

  protected final Justcoin justcoin;

  public JustcoinMarketDataServiceRaw(final ExchangeSpecification exchangeSpecification) {

    super(exchangeSpecification);
    this.justcoin = RestProxyFactory.createProxy(Justcoin.class, exchangeSpecification.getSslUri());
  }

  public JustcoinTicker[] getTickers() throws IOException {

    return justcoin.getTickers();
  }

  public JustcoinDepth getMarketDepth(final String tradableIdentifier, final String currency) throws IOException {

    return justcoin.getDepth(tradableIdentifier.toUpperCase(), currency.toUpperCase());
  }

  public List<CurrencyPair> getExchangeSymbols() {

    return new ArrayList<CurrencyPair>(JustcoinUtils.CURRENCY_PAIRS);
  }
}
