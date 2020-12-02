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
 * The complete whitelist for system chaincodes. To append a new chaincode add the new id to the default list.
 */
public class ConfigPeerChaincodeSystem extends GenericModel {

  protected Boolean cscc;
  protected Boolean lscc;
  protected Boolean escc;
  protected Boolean vscc;
  protected Boolean qscc;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean cscc;
    private Boolean lscc;
    private Boolean escc;
    private Boolean vscc;
    private Boolean qscc;

    private Builder(ConfigPeerChaincodeSystem configPeerChaincodeSystem) {
      this.cscc = configPeerChaincodeSystem.cscc;
      this.lscc = configPeerChaincodeSystem.lscc;
      this.escc = configPeerChaincodeSystem.escc;
      this.vscc = configPeerChaincodeSystem.vscc;
      this.qscc = configPeerChaincodeSystem.qscc;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigPeerChaincodeSystem.
     *
     * @return the new ConfigPeerChaincodeSystem instance
     */
    public ConfigPeerChaincodeSystem build() {
      return new ConfigPeerChaincodeSystem(this);
    }

    /**
     * Set the cscc.
     *
     * @param cscc the cscc
     * @return the ConfigPeerChaincodeSystem builder
     */
    public Builder cscc(Boolean cscc) {
      this.cscc = cscc;
      return this;
    }

    /**
     * Set the lscc.
     *
     * @param lscc the lscc
     * @return the ConfigPeerChaincodeSystem builder
     */
    public Builder lscc(Boolean lscc) {
      this.lscc = lscc;
      return this;
    }

    /**
     * Set the escc.
     *
     * @param escc the escc
     * @return the ConfigPeerChaincodeSystem builder
     */
    public Builder escc(Boolean escc) {
      this.escc = escc;
      return this;
    }

    /**
     * Set the vscc.
     *
     * @param vscc the vscc
     * @return the ConfigPeerChaincodeSystem builder
     */
    public Builder vscc(Boolean vscc) {
      this.vscc = vscc;
      return this;
    }

    /**
     * Set the qscc.
     *
     * @param qscc the qscc
     * @return the ConfigPeerChaincodeSystem builder
     */
    public Builder qscc(Boolean qscc) {
      this.qscc = qscc;
      return this;
    }
  }

  protected ConfigPeerChaincodeSystem(Builder builder) {
    cscc = builder.cscc;
    lscc = builder.lscc;
    escc = builder.escc;
    vscc = builder.vscc;
    qscc = builder.qscc;
  }

  /**
   * New builder.
   *
   * @return a ConfigPeerChaincodeSystem builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the cscc.
   *
   * Adds the system chaincode `cscc` to the whitelist.
   *
   * @return the cscc
   */
  public Boolean cscc() {
    return cscc;
  }

  /**
   * Gets the lscc.
   *
   * Adds the system chaincode `lscc` to the whitelist.
   *
   * @return the lscc
   */
  public Boolean lscc() {
    return lscc;
  }

  /**
   * Gets the escc.
   *
   * Adds the system chaincode `escc` to the whitelist.
   *
   * @return the escc
   */
  public Boolean escc() {
    return escc;
  }

  /**
   * Gets the vscc.
   *
   * Adds the system chaincode `vscc` to the whitelist.
   *
   * @return the vscc
   */
  public Boolean vscc() {
    return vscc;
  }

  /**
   * Gets the qscc.
   *
   * Adds the system chaincode `qscc` to the whitelist.
   *
   * @return the qscc
   */
  public Boolean qscc() {
    return qscc;
  }
}

