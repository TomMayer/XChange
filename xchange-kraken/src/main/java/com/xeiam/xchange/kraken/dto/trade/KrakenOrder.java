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
package com.xeiam.xchange.kraken.dto.trade;

import java.math.BigDecimal;
import java.util.List;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.xeiam.xchange.kraken.dto.trade.KrakenOrderFlags.KrakenOrderFlagsDeserializer;

public class KrakenOrder {

  private final String refId;
  private final String userRefId;
  private final KrakenOrderStatus status;
  private final double openTimestamp;
  private final double startTimestamp;
  private final double expireTimestamp;
  private final KrakenOrderDescription orderDescription;
  private final BigDecimal volume;
  private final BigDecimal volumeExecuted;
  private final BigDecimal cost;
  private final BigDecimal fee;
  private final BigDecimal price;
  private final BigDecimal stopPrice;
  private final BigDecimal limitPrice;
  private final String miscellaneous;
  private final Set<KrakenOrderFlags> orderFlags;
  private final List<String> tradeIds;
  private final double closeTimestamp;
  private final String closeReason;

  public KrakenOrder(@JsonProperty("refid") String refId, @JsonProperty("userref") String userRefId, @JsonProperty("status") KrakenOrderStatus status, @JsonProperty("opentm") double openTimestamp,
      @JsonProperty("starttm") double startTimestamp, @JsonProperty("expiretm") double expireTimestamp, @JsonProperty("descr") KrakenOrderDescription orderDescription,
      @JsonProperty("vol") BigDecimal volume, @JsonProperty("vol_exec") BigDecimal volumeExecuted, @JsonProperty("cost") BigDecimal cost, @JsonProperty("fee") BigDecimal fee,
      @JsonProperty("price") BigDecimal price, @JsonProperty("stopprice") BigDecimal stopPrice, @JsonProperty("limitprice") BigDecimal limitPrice, @JsonProperty("misc") String misc,
      @JsonProperty("oflags") @JsonDeserialize(using = KrakenOrderFlagsDeserializer.class) Set<KrakenOrderFlags> orderFLags, @JsonProperty("trades") List<String> tradeIds,
      @JsonProperty("closetm") double closeTimestamp, @JsonProperty("reason") String closeReason) {

    this.refId = refId;
    this.userRefId = userRefId;
    this.status = status;
    this.openTimestamp = openTimestamp;
    this.startTimestamp = startTimestamp;
    this.expireTimestamp = expireTimestamp;
    this.orderDescription = orderDescription;
    this.volume = volume;
    this.volumeExecuted = volumeExecuted;
    this.cost = cost;
    this.fee = fee;
    this.price = price;
    this.stopPrice = stopPrice;
    this.limitPrice = limitPrice;
    this.miscellaneous = misc;
    this.orderFlags = orderFLags;
    this.tradeIds = tradeIds;
    this.closeTimestamp = closeTimestamp;
    this.closeReason = closeReason;
  }

  public KrakenOrderDescription getOrderDescription() {

    return orderDescription;
  }

  public String getRefId() {

    return refId;
  }

  public String getUserRefId() {

    return userRefId;
  }

  public KrakenOrderStatus getStatus() {

    return status;
  }

  public double getOpenTimestamp() {

    return openTimestamp;
  }

  public double getStartTimestamp() {

    return startTimestamp;
  }

  public double getExpireTimestamp() {

    return expireTimestamp;
  }

  public BigDecimal getVolume() {

    return volume;
  }

  public BigDecimal getVolumeExecuted() {

    return volumeExecuted;
  }

  public BigDecimal getCost() {

    return cost;
  }

  public BigDecimal getFee() {

    return fee;
  }

  public BigDecimal getPrice() {

    return price;
  }

  public BigDecimal getStopPrice() {

    return stopPrice;
  }

  public BigDecimal getLimitPrice() {

    return limitPrice;
  }

  public String getMiscellaneous() {

    return miscellaneous;
  }

  public Set<KrakenOrderFlags> getOrderFlags() {

    return orderFlags;
  }

  public List<String> getTradeIds() {

    return tradeIds;
  }

  public double getCloseTimestamp() {

    return closeTimestamp;
  }

  public String getCloseReason() {

    return closeReason;
  }

  @Override
  public String toString() {

    return "KrakenOrder [refId=" + refId + ", userRefId=" + userRefId + ", status=" + status + ", openTimestamp=" + openTimestamp + ", startTimestamp=" + startTimestamp + ", expireTimestamp="
        + expireTimestamp + ", orderDescription=" + orderDescription + ", volume=" + volume + ", volumeExecuted=" + volumeExecuted + ", cost=" + cost + ", fee=" + fee + ", price=" + price
        + ", stopPrice=" + stopPrice + ", limitPrice=" + limitPrice + ", miscellaneous=" + miscellaneous + ", orderFlags=" + orderFlags + ", tradeIds=" + tradeIds + ", closeTimestamp="
        + closeTimestamp + ", closeReason=" + closeReason + "]";
  }
}
