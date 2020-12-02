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

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * CryptoEnrollmentComponent.
 */
public class CryptoEnrollmentComponent extends GenericModel {

  protected List<String> admincerts;

  /**
   * Builder.
   */
  public static class Builder {
    private List<String> admincerts;

    private Builder(CryptoEnrollmentComponent cryptoEnrollmentComponent) {
      this.admincerts = cryptoEnrollmentComponent.admincerts;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a CryptoEnrollmentComponent.
     *
     * @return the new CryptoEnrollmentComponent instance
     */
    public CryptoEnrollmentComponent build() {
      return new CryptoEnrollmentComponent(this);
    }

    /**
     * Adds an admincerts to admincerts.
     *
     * @param admincerts the new admincerts
     * @return the CryptoEnrollmentComponent builder
     */
    public Builder addAdmincerts(String admincerts) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(admincerts,
        "admincerts cannot be null");
      if (this.admincerts == null) {
        this.admincerts = new ArrayList<String>();
      }
      this.admincerts.add(admincerts);
      return this;
    }

    /**
     * Set the admincerts.
     * Existing admincerts will be replaced.
     *
     * @param admincerts the admincerts
     * @return the CryptoEnrollmentComponent builder
     */
    public Builder admincerts(List<String> admincerts) {
      this.admincerts = admincerts;
      return this;
    }
  }

  protected CryptoEnrollmentComponent(Builder builder) {
    admincerts = builder.admincerts;
  }

  /**
   * New builder.
   *
   * @return a CryptoEnrollmentComponent builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the admincerts.
   *
   * An array that contains base 64 encoded PEM identity certificates for administrators. Also known as signing
   * certificates of an organization administrator.
   *
   * @return the admincerts
   */
  public List<String> admincerts() {
    return admincerts;
  }
}

