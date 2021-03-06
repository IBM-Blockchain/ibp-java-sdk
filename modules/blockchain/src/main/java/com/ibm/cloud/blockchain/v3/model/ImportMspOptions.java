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
 * The importMsp options.
 */
public class ImportMspOptions extends GenericModel {

  protected String mspId;
  protected String displayName;
  protected List<String> rootCerts;
  protected List<String> intermediateCerts;
  protected List<String> admins;
  protected List<String> tlsRootCerts;

  /**
   * Builder.
   */
  public static class Builder {
    private String mspId;
    private String displayName;
    private List<String> rootCerts;
    private List<String> intermediateCerts;
    private List<String> admins;
    private List<String> tlsRootCerts;

    private Builder(ImportMspOptions importMspOptions) {
      this.mspId = importMspOptions.mspId;
      this.displayName = importMspOptions.displayName;
      this.rootCerts = importMspOptions.rootCerts;
      this.intermediateCerts = importMspOptions.intermediateCerts;
      this.admins = importMspOptions.admins;
      this.tlsRootCerts = importMspOptions.tlsRootCerts;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Instantiates a new builder with required properties.
     *
     * @param mspId the mspId
     * @param displayName the displayName
     * @param rootCerts the rootCerts
     */
    public Builder(String mspId, String displayName, List<String> rootCerts) {
      this.mspId = mspId;
      this.displayName = displayName;
      this.rootCerts = rootCerts;
    }

    /**
     * Builds a ImportMspOptions.
     *
     * @return the new ImportMspOptions instance
     */
    public ImportMspOptions build() {
      return new ImportMspOptions(this);
    }

    /**
     * Adds an rootCerts to rootCerts.
     *
     * @param rootCerts the new rootCerts
     * @return the ImportMspOptions builder
     */
    public Builder addRootCerts(String rootCerts) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(rootCerts,
        "rootCerts cannot be null");
      if (this.rootCerts == null) {
        this.rootCerts = new ArrayList<String>();
      }
      this.rootCerts.add(rootCerts);
      return this;
    }

    /**
     * Adds an intermediateCerts to intermediateCerts.
     *
     * @param intermediateCerts the new intermediateCerts
     * @return the ImportMspOptions builder
     */
    public Builder addIntermediateCerts(String intermediateCerts) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(intermediateCerts,
        "intermediateCerts cannot be null");
      if (this.intermediateCerts == null) {
        this.intermediateCerts = new ArrayList<String>();
      }
      this.intermediateCerts.add(intermediateCerts);
      return this;
    }

    /**
     * Adds an admins to admins.
     *
     * @param admins the new admins
     * @return the ImportMspOptions builder
     */
    public Builder addAdmins(String admins) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(admins,
        "admins cannot be null");
      if (this.admins == null) {
        this.admins = new ArrayList<String>();
      }
      this.admins.add(admins);
      return this;
    }

    /**
     * Adds an tlsRootCerts to tlsRootCerts.
     *
     * @param tlsRootCerts the new tlsRootCerts
     * @return the ImportMspOptions builder
     */
    public Builder addTlsRootCerts(String tlsRootCerts) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(tlsRootCerts,
        "tlsRootCerts cannot be null");
      if (this.tlsRootCerts == null) {
        this.tlsRootCerts = new ArrayList<String>();
      }
      this.tlsRootCerts.add(tlsRootCerts);
      return this;
    }

    /**
     * Set the mspId.
     *
     * @param mspId the mspId
     * @return the ImportMspOptions builder
     */
    public Builder mspId(String mspId) {
      this.mspId = mspId;
      return this;
    }

    /**
     * Set the displayName.
     *
     * @param displayName the displayName
     * @return the ImportMspOptions builder
     */
    public Builder displayName(String displayName) {
      this.displayName = displayName;
      return this;
    }

    /**
     * Set the rootCerts.
     * Existing rootCerts will be replaced.
     *
     * @param rootCerts the rootCerts
     * @return the ImportMspOptions builder
     */
    public Builder rootCerts(List<String> rootCerts) {
      this.rootCerts = rootCerts;
      return this;
    }

    /**
     * Set the intermediateCerts.
     * Existing intermediateCerts will be replaced.
     *
     * @param intermediateCerts the intermediateCerts
     * @return the ImportMspOptions builder
     */
    public Builder intermediateCerts(List<String> intermediateCerts) {
      this.intermediateCerts = intermediateCerts;
      return this;
    }

    /**
     * Set the admins.
     * Existing admins will be replaced.
     *
     * @param admins the admins
     * @return the ImportMspOptions builder
     */
    public Builder admins(List<String> admins) {
      this.admins = admins;
      return this;
    }

    /**
     * Set the tlsRootCerts.
     * Existing tlsRootCerts will be replaced.
     *
     * @param tlsRootCerts the tlsRootCerts
     * @return the ImportMspOptions builder
     */
    public Builder tlsRootCerts(List<String> tlsRootCerts) {
      this.tlsRootCerts = tlsRootCerts;
      return this;
    }
  }

  protected ImportMspOptions(Builder builder) {
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.mspId,
      "mspId cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.displayName,
      "displayName cannot be null");
    com.ibm.cloud.sdk.core.util.Validator.notNull(builder.rootCerts,
      "rootCerts cannot be null");
    mspId = builder.mspId;
    displayName = builder.displayName;
    rootCerts = builder.rootCerts;
    intermediateCerts = builder.intermediateCerts;
    admins = builder.admins;
    tlsRootCerts = builder.tlsRootCerts;
  }

  /**
   * New builder.
   *
   * @return a ImportMspOptions builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the mspId.
   *
   * The MSP id that is related to this component.
   *
   * @return the mspId
   */
  public String mspId() {
    return mspId;
  }

  /**
   * Gets the displayName.
   *
   * A descriptive name for this MSP. The IBP console tile displays this name.
   *
   * @return the displayName
   */
  public String displayName() {
    return displayName;
  }

  /**
   * Gets the rootCerts.
   *
   * An array that contains one or more base 64 encoded PEM root certificates for the MSP.
   *
   * @return the rootCerts
   */
  public List<String> rootCerts() {
    return rootCerts;
  }

  /**
   * Gets the intermediateCerts.
   *
   * An array that contains base 64 encoded PEM intermediate certificates.
   *
   * @return the intermediateCerts
   */
  public List<String> intermediateCerts() {
    return intermediateCerts;
  }

  /**
   * Gets the admins.
   *
   * An array that contains base 64 encoded PEM identity certificates for administrators. Also known as signing
   * certificates of an organization administrator.
   *
   * @return the admins
   */
  public List<String> admins() {
    return admins;
  }

  /**
   * Gets the tlsRootCerts.
   *
   * An array that contains one or more base 64 encoded PEM TLS root certificates.
   *
   * @return the tlsRootCerts
   */
  public List<String> tlsRootCerts() {
    return tlsRootCerts;
  }
}

