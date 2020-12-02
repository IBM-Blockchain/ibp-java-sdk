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
 * ConfigCASigningProfilesCaCaconstraint.
 */
public class ConfigCASigningProfilesCaCaconstraint extends GenericModel {

  protected Boolean isca;
  protected Double maxpathlen;
  protected Boolean maxpathlenzero;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean isca;
    private Double maxpathlen;
    private Boolean maxpathlenzero;

    private Builder(ConfigCASigningProfilesCaCaconstraint configCaSigningProfilesCaCaconstraint) {
      this.isca = configCaSigningProfilesCaCaconstraint.isca;
      this.maxpathlen = configCaSigningProfilesCaCaconstraint.maxpathlen;
      this.maxpathlenzero = configCaSigningProfilesCaCaconstraint.maxpathlenzero;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigCASigningProfilesCaCaconstraint.
     *
     * @return the new ConfigCASigningProfilesCaCaconstraint instance
     */
    public ConfigCASigningProfilesCaCaconstraint build() {
      return new ConfigCASigningProfilesCaCaconstraint(this);
    }

    /**
     * Set the isca.
     *
     * @param isca the isca
     * @return the ConfigCASigningProfilesCaCaconstraint builder
     */
    public Builder isca(Boolean isca) {
      this.isca = isca;
      return this;
    }

    /**
     * Set the maxpathlen.
     *
     * @param maxpathlen the maxpathlen
     * @return the ConfigCASigningProfilesCaCaconstraint builder
     */
    public Builder maxpathlen(Double maxpathlen) {
      this.maxpathlen = maxpathlen;
      return this;
    }

    /**
     * Set the maxpathlenzero.
     *
     * @param maxpathlenzero the maxpathlenzero
     * @return the ConfigCASigningProfilesCaCaconstraint builder
     */
    public Builder maxpathlenzero(Boolean maxpathlenzero) {
      this.maxpathlenzero = maxpathlenzero;
      return this;
    }
  }

  protected ConfigCASigningProfilesCaCaconstraint(Builder builder) {
    isca = builder.isca;
    maxpathlen = builder.maxpathlen;
    maxpathlenzero = builder.maxpathlenzero;
  }

  /**
   * New builder.
   *
   * @return a ConfigCASigningProfilesCaCaconstraint builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the isca.
   *
   * Indicates if this certificate is for a CA.
   *
   * @return the isca
   */
  public Boolean isca() {
    return isca;
  }

  /**
   * Gets the maxpathlen.
   *
   * A value of 0 indicates that this intermediate CA cannot issue other intermediate CA certificates.
   *
   * @return the maxpathlen
   */
  public Double maxpathlen() {
    return maxpathlen;
  }

  /**
   * Gets the maxpathlenzero.
   *
   * To enforce a `maxpathlen` of 0, this field must be `true`. If `maxpathlen` should be ignored or if it is greater
   * than 0 set this to `false`.
   *
   * @return the maxpathlenzero
   */
  public Boolean maxpathlenzero() {
    return maxpathlenzero;
  }
}

