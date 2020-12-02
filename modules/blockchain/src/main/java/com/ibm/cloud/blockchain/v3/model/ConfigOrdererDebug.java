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
 * Controls the debugging options for the orderer.
 */
public class ConfigOrdererDebug extends GenericModel {

  @SerializedName("BroadcastTraceDir")
  protected String broadcastTraceDir;
  @SerializedName("DeliverTraceDir")
  protected String deliverTraceDir;

  /**
   * Builder.
   */
  public static class Builder {
    private String broadcastTraceDir;
    private String deliverTraceDir;

    private Builder(ConfigOrdererDebug configOrdererDebug) {
      this.broadcastTraceDir = configOrdererDebug.broadcastTraceDir;
      this.deliverTraceDir = configOrdererDebug.deliverTraceDir;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a ConfigOrdererDebug.
     *
     * @return the new ConfigOrdererDebug instance
     */
    public ConfigOrdererDebug build() {
      return new ConfigOrdererDebug(this);
    }

    /**
     * Set the broadcastTraceDir.
     *
     * @param broadcastTraceDir the broadcastTraceDir
     * @return the ConfigOrdererDebug builder
     */
    public Builder broadcastTraceDir(String broadcastTraceDir) {
      this.broadcastTraceDir = broadcastTraceDir;
      return this;
    }

    /**
     * Set the deliverTraceDir.
     *
     * @param deliverTraceDir the deliverTraceDir
     * @return the ConfigOrdererDebug builder
     */
    public Builder deliverTraceDir(String deliverTraceDir) {
      this.deliverTraceDir = deliverTraceDir;
      return this;
    }
  }

  protected ConfigOrdererDebug(Builder builder) {
    broadcastTraceDir = builder.broadcastTraceDir;
    deliverTraceDir = builder.deliverTraceDir;
  }

  /**
   * New builder.
   *
   * @return a ConfigOrdererDebug builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the broadcastTraceDir.
   *
   * Path to directory. If set will cause each request to the Broadcast service to be written to a file in this
   * directory.
   *
   * @return the broadcastTraceDir
   */
  public String broadcastTraceDir() {
    return broadcastTraceDir;
  }

  /**
   * Gets the deliverTraceDir.
   *
   * Path to directory. If set will cause each request to the Deliver service to be written to a file in this directory.
   *
   * @return the deliverTraceDir
   */
  public String deliverTraceDir() {
    return deliverTraceDir;
  }
}

