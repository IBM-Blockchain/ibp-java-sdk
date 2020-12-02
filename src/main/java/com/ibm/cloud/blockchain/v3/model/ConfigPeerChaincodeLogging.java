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
 * ConfigPeerChaincodeLogging.
 */
public class ConfigPeerChaincodeLogging extends GenericModel {

  /**
   * Default logging level for loggers within chaincode containers.
   */
  public interface Level {
    /** fatal. */
    String FATAL = "fatal";
    /** panic. */
    String PANIC = "panic";
    /** error. */
    String ERROR = "error";
    /** warning. */
    String WARNING = "warning";
    /** info. */
    String INFO = "info";
    /** debug. */
    String DEBUG = "debug";
  }

  /**
   * Override default level for the 'shim' logger.
   */
  public interface Shim {
    /** fatal. */
    String FATAL = "fatal";
    /** panic. */
    String PANIC = "panic";
    /** error. */
    String ERROR = "error";
    /** warning. */
    String WARNING = "warning";
    /** info. */
    String INFO = "info";
    /** debug. */
    String DEBUG = "debug";
  }

  protected String level;
  protected String shim;
  protected String format;

  /**
   * Builder.
   */
  public static class Builder {
    private String level;
    private String shim;
    private String format;

    private Builder(ConfigPeerChaincodeLogging configPeerChaincodeLogging) {
      this.level = configPeerChaincodeLogging.level;
      this.shim = configPeerChaincodeLogging.shim;
      this.format = configPeerChaincodeLogging.format;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigPeerChaincodeLogging.
     *
     * @return the new ConfigPeerChaincodeLogging instance
     */
    public ConfigPeerChaincodeLogging build() {
      return new ConfigPeerChaincodeLogging(this);
    }

    /**
     * Set the level.
     *
     * @param level the level
     * @return the ConfigPeerChaincodeLogging builder
     */
    public Builder level(String level) {
      this.level = level;
      return this;
    }

    /**
     * Set the shim.
     *
     * @param shim the shim
     * @return the ConfigPeerChaincodeLogging builder
     */
    public Builder shim(String shim) {
      this.shim = shim;
      return this;
    }

    /**
     * Set the format.
     *
     * @param format the format
     * @return the ConfigPeerChaincodeLogging builder
     */
    public Builder format(String format) {
      this.format = format;
      return this;
    }
  }

  protected ConfigPeerChaincodeLogging(Builder builder) {
    level = builder.level;
    shim = builder.shim;
    format = builder.format;
  }

  /**
   * New builder.
   *
   * @return a ConfigPeerChaincodeLogging builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the level.
   *
   * Default logging level for loggers within chaincode containers.
   *
   * @return the level
   */
  public String level() {
    return level;
  }

  /**
   * Gets the shim.
   *
   * Override default level for the 'shim' logger.
   *
   * @return the shim
   */
  public String shim() {
    return shim;
  }

  /**
   * Gets the format.
   *
   * Override the default log format for chaincode container logs.
   *
   * @return the format
   */
  public String format() {
    return format;
  }
}

