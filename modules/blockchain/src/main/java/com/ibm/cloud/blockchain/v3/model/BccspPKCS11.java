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
 * Hardware-based blockchain crypto provider.
 */
public class BccspPKCS11 extends GenericModel {

  @SerializedName("Label")
  protected String label;
  @SerializedName("Pin")
  protected String pin;
  @SerializedName("Hash")
  protected String hash;
  @SerializedName("Security")
  protected Double security;

  /**
   * Builder.
   */
  public static class Builder {
    private String label;
    private String pin;
    private String hash;
    private Double security;

    private Builder(BccspPKCS11 bccspPkcS11) {
      this.label = bccspPkcS11.label;
      this.pin = bccspPkcS11.pin;
      this.hash = bccspPkcS11.hash;
      this.security = bccspPkcS11.security;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param label the label
     * @param pin the pin
     */
    public Builder(String label, String pin) {
      this.label = label;
      this.pin = pin;
    }

    /**
     * Builds a BccspPKCS11.
     *
     * @return the new BccspPKCS11 instance
     */
    public BccspPKCS11 build() {
      return new BccspPKCS11(this);
    }

    /**
     * Set the label.
     *
     * @param label the label
     * @return the BccspPKCS11 builder
     */
    public Builder label(String label) {
      this.label = label;
      return this;
    }

    /**
     * Set the pin.
     *
     * @param pin the pin
     * @return the BccspPKCS11 builder
     */
    public Builder pin(String pin) {
      this.pin = pin;
      return this;
    }

    /**
     * Set the hash.
     *
     * @param hash the hash
     * @return the BccspPKCS11 builder
     */
    public Builder hash(String hash) {
      this.hash = hash;
      return this;
    }

    /**
     * Set the security.
     *
     * @param security the security
     * @return the BccspPKCS11 builder
     */
    public Builder security(Double security) {
      this.security = security;
      return this;
    }
  }

  protected BccspPKCS11(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.label,
      "label cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.pin,
      "pin cannot be null");
    label = builder.label;
    pin = builder.pin;
    hash = builder.hash;
    security = builder.security;
  }

  /**
   * New builder.
   *
   * @return a BccspPKCS11 builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the label.
   *
   * Token Label.
   *
   * @return the label
   */
  public String label() {
    return label;
  }

  /**
   * Gets the pin.
   *
   * The user PIN.
   *
   * @return the pin
   */
  public String pin() {
    return pin;
  }

  /**
   * Gets the hash.
   *
   * The hash family to use for the BlockChain Crypto Service Provider (bccsp).
   *
   * @return the hash
   */
  public String hash() {
    return hash;
  }

  /**
   * Gets the security.
   *
   * The length of hash to use for the BlockChain Crypto Service Provider (bccsp).
   *
   * @return the security
   */
  public Double security() {
    return security;
  }
}

