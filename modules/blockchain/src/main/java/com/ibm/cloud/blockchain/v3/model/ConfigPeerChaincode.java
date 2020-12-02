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
 * ConfigPeerChaincode.
 */
public class ConfigPeerChaincode extends GenericModel {

  protected ConfigPeerChaincodeGolang golang;
  protected List<ConfigPeerChaincodeExternalBuildersItem> externalBuilders;
  protected String installTimeout;
  protected String startuptimeout;
  protected String executetimeout;
  protected ConfigPeerChaincodeSystem system;
  protected ConfigPeerChaincodeLogging logging;

  /**
   * Builder.
   */
  public static class Builder {
    private ConfigPeerChaincodeGolang golang;
    private List<ConfigPeerChaincodeExternalBuildersItem> externalBuilders;
    private String installTimeout;
    private String startuptimeout;
    private String executetimeout;
    private ConfigPeerChaincodeSystem system;
    private ConfigPeerChaincodeLogging logging;

    private Builder(ConfigPeerChaincode configPeerChaincode) {
      this.golang = configPeerChaincode.golang;
      this.externalBuilders = configPeerChaincode.externalBuilders;
      this.installTimeout = configPeerChaincode.installTimeout;
      this.startuptimeout = configPeerChaincode.startuptimeout;
      this.executetimeout = configPeerChaincode.executetimeout;
      this.system = configPeerChaincode.system;
      this.logging = configPeerChaincode.logging;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigPeerChaincode.
     *
     * @return the new ConfigPeerChaincode instance
     */
    public ConfigPeerChaincode build() {
      return new ConfigPeerChaincode(this);
    }

    /**
     * Adds an externalBuilders to externalBuilders.
     *
     * @param externalBuilders the new externalBuilders
     * @return the ConfigPeerChaincode builder
     */
    public Builder addExternalBuilders(ConfigPeerChaincodeExternalBuildersItem externalBuilders) {
      com.ibm.cloud.sdk.core.util.Validator.notNull(externalBuilders,
        "externalBuilders cannot be null");
      if (this.externalBuilders == null) {
        this.externalBuilders = new ArrayList<ConfigPeerChaincodeExternalBuildersItem>();
      }
      this.externalBuilders.add(externalBuilders);
      return this;
    }

    /**
     * Set the golang.
     *
     * @param golang the golang
     * @return the ConfigPeerChaincode builder
     */
    public Builder golang(ConfigPeerChaincodeGolang golang) {
      this.golang = golang;
      return this;
    }

    /**
     * Set the externalBuilders.
     * Existing externalBuilders will be replaced.
     *
     * @param externalBuilders the externalBuilders
     * @return the ConfigPeerChaincode builder
     */
    public Builder externalBuilders(List<ConfigPeerChaincodeExternalBuildersItem> externalBuilders) {
      this.externalBuilders = externalBuilders;
      return this;
    }

    /**
     * Set the installTimeout.
     *
     * @param installTimeout the installTimeout
     * @return the ConfigPeerChaincode builder
     */
    public Builder installTimeout(String installTimeout) {
      this.installTimeout = installTimeout;
      return this;
    }

    /**
     * Set the startuptimeout.
     *
     * @param startuptimeout the startuptimeout
     * @return the ConfigPeerChaincode builder
     */
    public Builder startuptimeout(String startuptimeout) {
      this.startuptimeout = startuptimeout;
      return this;
    }

    /**
     * Set the executetimeout.
     *
     * @param executetimeout the executetimeout
     * @return the ConfigPeerChaincode builder
     */
    public Builder executetimeout(String executetimeout) {
      this.executetimeout = executetimeout;
      return this;
    }

    /**
     * Set the system.
     *
     * @param system the system
     * @return the ConfigPeerChaincode builder
     */
    public Builder system(ConfigPeerChaincodeSystem system) {
      this.system = system;
      return this;
    }

    /**
     * Set the logging.
     *
     * @param logging the logging
     * @return the ConfigPeerChaincode builder
     */
    public Builder logging(ConfigPeerChaincodeLogging logging) {
      this.logging = logging;
      return this;
    }
  }

  protected ConfigPeerChaincode(Builder builder) {
    golang = builder.golang;
    externalBuilders = builder.externalBuilders;
    installTimeout = builder.installTimeout;
    startuptimeout = builder.startuptimeout;
    executetimeout = builder.executetimeout;
    system = builder.system;
    logging = builder.logging;
  }

  /**
   * New builder.
   *
   * @return a ConfigPeerChaincode builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the golang.
   *
   * @return the golang
   */
  public ConfigPeerChaincodeGolang golang() {
    return golang;
  }

  /**
   * Gets the externalBuilders.
   *
   * List of directories to treat as external builders/launches of chaincode.
   *
   * @return the externalBuilders
   */
  public List<ConfigPeerChaincodeExternalBuildersItem> externalBuilders() {
    return externalBuilders;
  }

  /**
   * Gets the installTimeout.
   *
   * Maximum duration to wait for the chaincode build and install process to complete.
   *
   * @return the installTimeout
   */
  public String installTimeout() {
    return installTimeout;
  }

  /**
   * Gets the startuptimeout.
   *
   * Time for starting up a container and waiting for Register to come through.
   *
   * @return the startuptimeout
   */
  public String startuptimeout() {
    return startuptimeout;
  }

  /**
   * Gets the executetimeout.
   *
   * Time for Invoke and Init calls to return. This timeout is used by all chaincodes in all the channels, including
   * system chaincodes. Note that if the image is not available the peer needs to build the image, which will take
   * additional time.
   *
   * @return the executetimeout
   */
  public String executetimeout() {
    return executetimeout;
  }

  /**
   * Gets the system.
   *
   * The complete whitelist for system chaincodes. To append a new chaincode add the new id to the default list.
   *
   * @return the system
   */
  public ConfigPeerChaincodeSystem system() {
    return system;
  }

  /**
   * Gets the logging.
   *
   * @return the logging
   */
  public ConfigPeerChaincodeLogging logging() {
    return logging;
  }
}

