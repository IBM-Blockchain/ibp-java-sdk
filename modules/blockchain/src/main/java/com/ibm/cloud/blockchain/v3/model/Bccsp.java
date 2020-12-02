/*
 * (C) Copyright IBM Corp. 2020.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package com.ibm.cloud.blockchain.v3.model;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Configures the Blockchain Crypto Service Providers (bccsp).
 */
public class Bccsp extends GenericModel {

  /**
   * The name of the crypto library implementation to use for the BlockChain Crypto Service Provider (bccsp). Defaults
   * to `SW`.
   */
  public interface XDefault {
    /** SW. */
    String SW = "SW";
    /** PKCS11. */
    String PKCS11 = "PKCS11";
  }

  @SerializedName("Default")
  protected String xDefault;
  @SerializedName("SW")
  protected BccspSW sw;
  @SerializedName("PKCS11")
  protected BccspPKCS11 pkcS11;

  /**
   * Builder.
   */
  public static class Builder {
    private String xDefault;
    private BccspSW sw;
    private BccspPKCS11 pkcS11;

    private Builder(Bccsp bccsp) {
      this.xDefault = bccsp.xDefault;
      this.sw = bccsp.sw;
      this.pkcS11 = bccsp.pkcS11;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a Bccsp.
     *
     * @return the new Bccsp instance
     */
    public Bccsp build() {
      return new Bccsp(this);
    }

    /**
     * Set the xDefault.
     *
     * @param xDefault the xDefault
     * @return the Bccsp builder
     */
    public Builder xDefault(String xDefault) {
      this.xDefault = xDefault;
      return this;
    }

    /**
     * Set the sw.
     *
     * @param sw the sw
     * @return the Bccsp builder
     */
    public Builder sw(BccspSW sw) {
      this.sw = sw;
      return this;
    }

    /**
     * Set the pkcS11.
     *
     * @param pkcS11 the pkcS11
     * @return the Bccsp builder
     */
    public Builder pkcS11(BccspPKCS11 pkcS11) {
      this.pkcS11 = pkcS11;
      return this;
    }
  }

  protected Bccsp(Builder builder) {
    xDefault = builder.xDefault;
    sw = builder.sw;
    pkcS11 = builder.pkcS11;
  }

  /**
   * New builder.
   *
   * @return a Bccsp builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the xDefault.
   *
   * The name of the crypto library implementation to use for the BlockChain Crypto Service Provider (bccsp). Defaults
   * to `SW`.
   *
   * @return the xDefault
   */
  public String xDefault() {
    return xDefault;
  }

  /**
   * Gets the sw.
   *
   * Software based blockchain crypto provider.
   *
   * @return the sw
   */
  public BccspSW sw() {
    return sw;
  }

  /**
   * Gets the pkcS11.
   *
   * Hardware-based blockchain crypto provider.
   *
   * @return the pkcS11
   */
  public BccspPKCS11 pkcS11() {
    return pkcS11;
  }
}

