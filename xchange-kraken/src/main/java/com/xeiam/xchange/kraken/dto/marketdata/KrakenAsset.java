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
package com.xeiam.xchange.kraken.dto.marketdata;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KrakenAsset {

  private final String altName;
  private final String assetClass;
  private final int scale;
  private final int displayScale;

  public KrakenAsset(@JsonProperty("altname") String altName, @JsonProperty("aclass") String assetClass, @JsonProperty("decimals") int scale, @JsonProperty("display_decimals") int displayScale) {

    this.altName = altName;
    this.assetClass = assetClass;
    this.scale = scale;
    this.displayScale = displayScale;
  }

  public String getAltName() {

    return altName;
  }

  public String getAssetClass() {

    return assetClass;
  }

  public int getScale() {

    return scale;
  }

  public int getDisplayScale() {

    return displayScale;
  }

  @Override
  public String toString() {

    return "KrakenAssetInfo [altName=" + altName + ", assetClass=" + assetClass + ", scale=" + scale + ", displayScale=" + displayScale + "]";
  }
}
