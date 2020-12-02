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
 * UpdateEnrollmentCryptoFieldCa.
 */
public class UpdateEnrollmentCryptoFieldCa extends GenericModel {

  protected String host;
  protected Double port;
  protected String name;
  @SerializedName("tls_cert")
  protected String tlsCert;
  @SerializedName("enroll_id")
  protected String enrollId;
  @SerializedName("enroll_secret")
  protected String enrollSecret;

  /**
   * Builder.
   */
  public static class Builder {
    private String host;
    private Double port;
    private String name;
    private String tlsCert;
    private String enrollId;
    private String enrollSecret;

    private Builder(UpdateEnrollmentCryptoFieldCa updateEnrollmentCryptoFieldCa) {
      this.host = updateEnrollmentCryptoFieldCa.host;
      this.port = updateEnrollmentCryptoFieldCa.port;
      this.name = updateEnrollmentCryptoFieldCa.name;
      this.tlsCert = updateEnrollmentCryptoFieldCa.tlsCert;
      this.enrollId = updateEnrollmentCryptoFieldCa.enrollId;
      this.enrollSecret = updateEnrollmentCryptoFieldCa.enrollSecret;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a UpdateEnrollmentCryptoFieldCa.
     *
     * @return the new UpdateEnrollmentCryptoFieldCa instance
     */
    public UpdateEnrollmentCryptoFieldCa build() {
      return new UpdateEnrollmentCryptoFieldCa(this);
    }

    /**
     * Set the host.
     *
     * @param host the host
     * @return the UpdateEnrollmentCryptoFieldCa builder
     */
    public Builder host(String host) {
      this.host = host;
      return this;
    }

    /**
     * Set the port.
     *
     * @param port the port
     * @return the UpdateEnrollmentCryptoFieldCa builder
     */
    public Builder port(Double port) {
      this.port = port;
      return this;
    }

    /**
     * Set the name.
     *
     * @param name the name
     * @return the UpdateEnrollmentCryptoFieldCa builder
     */
    public Builder name(String name) {
      this.name = name;
      return this;
    }

    /**
     * Set the tlsCert.
     *
     * @param tlsCert the tlsCert
     * @return the UpdateEnrollmentCryptoFieldCa builder
     */
    public Builder tlsCert(String tlsCert) {
      this.tlsCert = tlsCert;
      return this;
    }

    /**
     * Set the enrollId.
     *
     * @param enrollId the enrollId
     * @return the UpdateEnrollmentCryptoFieldCa builder
     */
    public Builder enrollId(String enrollId) {
      this.enrollId = enrollId;
      return this;
    }

    /**
     * Set the enrollSecret.
     *
     * @param enrollSecret the enrollSecret
     * @return the UpdateEnrollmentCryptoFieldCa builder
     */
    public Builder enrollSecret(String enrollSecret) {
      this.enrollSecret = enrollSecret;
      return this;
    }
  }

  protected UpdateEnrollmentCryptoFieldCa(Builder builder) {
    host = builder.host;
    port = builder.port;
    name = builder.name;
    tlsCert = builder.tlsCert;
    enrollId = builder.enrollId;
    enrollSecret = builder.enrollSecret;
  }

  /**
   * New builder.
   *
   * @return a UpdateEnrollmentCryptoFieldCa builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the host.
   *
   * The CA's hostname. Do not include protocol or port.
   *
   * @return the host
   */
  public String host() {
    return host;
  }

  /**
   * Gets the port.
   *
   * The CA's port.
   *
   * @return the port
   */
  public Double port() {
    return port;
  }

  /**
   * Gets the name.
   *
   * The CA's "CAName" attribute. This name is used to distinguish this CA from the TLS CA.
   *
   * @return the name
   */
  public String name() {
    return name;
  }

  /**
   * Gets the tlsCert.
   *
   * The TLS certificate as base 64 encoded PEM. Certificate is used to secure/validate a TLS connection with this
   * component.
   *
   * @return the tlsCert
   */
  public String tlsCert() {
    return tlsCert;
  }

  /**
   * Gets the enrollId.
   *
   * The username of the enroll id.
   *
   * @return the enrollId
   */
  public String enrollId() {
    return enrollId;
  }

  /**
   * Gets the enrollSecret.
   *
   * The password of the enroll id.
   *
   * @return the enrollSecret
   */
  public String enrollSecret() {
    return enrollSecret;
  }
}

