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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ConfigCAIdemix.
 */
public class ConfigCAIdemix extends GenericModel {

  protected Double rhpoolsize;
  protected String nonceexpiration;
  protected String noncesweepinterval;

  /**
   * Builder.
   */
  public static class Builder {
    private Double rhpoolsize;
    private String nonceexpiration;
    private String noncesweepinterval;

    private Builder(ConfigCAIdemix configCaIdemix) {
      this.rhpoolsize = configCaIdemix.rhpoolsize;
      this.nonceexpiration = configCaIdemix.nonceexpiration;
      this.noncesweepinterval = configCaIdemix.noncesweepinterval;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param rhpoolsize the rhpoolsize
     * @param nonceexpiration the nonceexpiration
     * @param noncesweepinterval the noncesweepinterval
     */
    public Builder(Double rhpoolsize, String nonceexpiration, String noncesweepinterval) {
      this.rhpoolsize = rhpoolsize;
      this.nonceexpiration = nonceexpiration;
      this.noncesweepinterval = noncesweepinterval;
    }

    /**
     * Builds a ConfigCAIdemix.
     *
     * @return the new ConfigCAIdemix instance
     */
    public ConfigCAIdemix build() {
      return new ConfigCAIdemix(this);
    }

    /**
     * Set the rhpoolsize.
     *
     * @param rhpoolsize the rhpoolsize
     * @return the ConfigCAIdemix builder
     */
    public Builder rhpoolsize(Double rhpoolsize) {
      this.rhpoolsize = rhpoolsize;
      return this;
    }

    /**
     * Set the nonceexpiration.
     *
     * @param nonceexpiration the nonceexpiration
     * @return the ConfigCAIdemix builder
     */
    public Builder nonceexpiration(String nonceexpiration) {
      this.nonceexpiration = nonceexpiration;
      return this;
    }

    /**
     * Set the noncesweepinterval.
     *
     * @param noncesweepinterval the noncesweepinterval
     * @return the ConfigCAIdemix builder
     */
    public Builder noncesweepinterval(String noncesweepinterval) {
      this.noncesweepinterval = noncesweepinterval;
      return this;
    }
  }

  protected ConfigCAIdemix(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.rhpoolsize,
      "rhpoolsize cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.nonceexpiration,
      "nonceexpiration cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.noncesweepinterval,
      "noncesweepinterval cannot be null");
    rhpoolsize = builder.rhpoolsize;
    nonceexpiration = builder.nonceexpiration;
    noncesweepinterval = builder.noncesweepinterval;
  }

  /**
   * New builder.
   *
   * @return a ConfigCAIdemix builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the rhpoolsize.
   *
   * Specifies the revocation pool size.
   *
   * @return the rhpoolsize
   */
  public Double rhpoolsize() {
    return rhpoolsize;
  }

  /**
   * Gets the nonceexpiration.
   *
   * Specifies the expiration for the nonces.
   *
   * @return the nonceexpiration
   */
  public String nonceexpiration() {
    return nonceexpiration;
  }

  /**
   * Gets the noncesweepinterval.
   *
   * Specifies frequency at which expired nonces are removed from data store.
   *
   * @return the noncesweepinterval
   */
  public String noncesweepinterval() {
    return noncesweepinterval;
  }
}

