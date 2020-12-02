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

import java.util.ArrayList;
import java.util.List;

import com.google.gson.annotations.SerializedName;
import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * ClientAuth.
 */
public class ClientAuth extends GenericModel {

  protected String type;
  @SerializedName("tls_certs")
  protected List<String> tlsCerts;

  /**
   * Builder.
   */
  public static class Builder {
    private String type;
    private List<String> tlsCerts;

    private Builder(ClientAuth clientAuth) {
      this.type = clientAuth.type;
      this.tlsCerts = clientAuth.tlsCerts;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ClientAuth.
     *
     * @return the new ClientAuth instance
     */
    public ClientAuth build() {
      return new ClientAuth(this);
    }

    /**
     * Adds an tlsCerts to tlsCerts.
     *
     * @param tlsCerts the new tlsCerts
     * @return the ClientAuth builder
     */
    public Builder addTlsCerts(String tlsCerts) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tlsCerts,
        "tlsCerts cannot be null");
      if (this.tlsCerts == null) {
        this.tlsCerts = new ArrayList<String>();
      }
      this.tlsCerts.add(tlsCerts);
      return this;
    }

    /**
     * Set the type.
     *
     * @param type the type
     * @return the ClientAuth builder
     */
    public Builder type(String type) {
      this.type = type;
      return this;
    }

    /**
     * Set the tlsCerts.
     * Existing tlsCerts will be replaced.
     *
     * @param tlsCerts the tlsCerts
     * @return the ClientAuth builder
     */
    public Builder tlsCerts(List<String> tlsCerts) {
      this.tlsCerts = tlsCerts;
      return this;
    }
  }

  protected ClientAuth(Builder builder) {
    type = builder.type;
    tlsCerts = builder.tlsCerts;
  }

  /**
   * New builder.
   *
   * @return a ClientAuth builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the type.
   *
   * @return the type
   */
  public String type() {
    return type;
  }

  /**
   * Gets the tlsCerts.
   *
   * @return the tlsCerts
   */
  public List<String> tlsCerts() {
    return tlsCerts;
  }
}

