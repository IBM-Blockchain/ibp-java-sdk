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
 * The server side logging settings. _Changes to this field will restart the IBP console server(s)_.
 */
public class LoggingSettingsServer extends GenericModel {

  /**
   * Valid log levels: "error", "warn", "info", "verbose", "debug", or "silly".
   */
  public interface Level {
    /** error. */
    String ERROR = "error";
    /** warn. */
    String WARN = "warn";
    /** info. */
    String INFO = "info";
    /** verbose. */
    String VERBOSE = "verbose";
    /** debug. */
    String DEBUG = "debug";
    /** silly. */
    String SILLY = "silly";
  }

  protected Boolean enabled;
  protected String level;
  @SerializedName("unique_name")
  protected Boolean uniqueName;

  /**
   * Builder.
   */
  public static class Builder {
    private Boolean enabled;
    private String level;
    private Boolean uniqueName;

    private Builder(LoggingSettingsServer loggingSettingsServer) {
      this.enabled = loggingSettingsServer.enabled;
      this.level = loggingSettingsServer.level;
      this.uniqueName = loggingSettingsServer.uniqueName;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a LoggingSettingsServer.
     *
     * @return the new LoggingSettingsServer instance
     */
    public LoggingSettingsServer build() {
      return new LoggingSettingsServer(this);
    }

    /**
     * Set the enabled.
     *
     * @param enabled the enabled
     * @return the LoggingSettingsServer builder
     */
    public Builder enabled(Boolean enabled) {
      this.enabled = enabled;
      return this;
    }

    /**
     * Set the level.
     *
     * @param level the level
     * @return the LoggingSettingsServer builder
     */
    public Builder level(String level) {
      this.level = level;
      return this;
    }

    /**
     * Set the uniqueName.
     *
     * @param uniqueName the uniqueName
     * @return the LoggingSettingsServer builder
     */
    public Builder uniqueName(Boolean uniqueName) {
      this.uniqueName = uniqueName;
      return this;
    }
  }

  protected LoggingSettingsServer(Builder builder) {
    enabled = builder.enabled;
    level = builder.level;
    uniqueName = builder.uniqueName;
  }

  /**
   * New builder.
   *
   * @return a LoggingSettingsServer builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the enabled.
   *
   * If `true` logging will be stored to a file on the file system.
   *
   * @return the enabled
   */
  public Boolean enabled() {
    return enabled;
  }

  /**
   * Gets the level.
   *
   * Valid log levels: "error", "warn", "info", "verbose", "debug", or "silly".
   *
   * @return the level
   */
  public String level() {
    return level;
  }

  /**
   * Gets the uniqueName.
   *
   * If `true` log file names will have a random suffix.
   *
   * @return the uniqueName
   */
  public Boolean uniqueName() {
    return uniqueName;
  }
}

