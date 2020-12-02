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
 * File system logging settings. All body fields are optional (only send the fields that you want to change). _Changes
 * to this field will restart the IBP console server(s)_.
 */
public class EditLogSettingsBody extends GenericModel {

  protected LoggingSettingsClient client;
  protected LoggingSettingsServer server;

  /**
   * Builder.
   */
  public static class Builder {
    private LoggingSettingsClient client;
    private LoggingSettingsServer server;

    private Builder(EditLogSettingsBody editLogSettingsBody) {
      this.client = editLogSettingsBody.client;
      this.server = editLogSettingsBody.server;
    }

    /**
     * Instantiates a new builder.
     */
    public Builder() {
    }

    /**
     * Builds a EditLogSettingsBody.
     *
     * @return the new EditLogSettingsBody instance
     */
    public EditLogSettingsBody build() {
      return new EditLogSettingsBody(this);
    }

    /**
     * Set the client.
     *
     * @param client the client
     * @return the EditLogSettingsBody builder
     */
    public Builder client(LoggingSettingsClient client) {
      this.client = client;
      return this;
    }

    /**
     * Set the server.
     *
     * @param server the server
     * @return the EditLogSettingsBody builder
     */
    public Builder server(LoggingSettingsServer server) {
      this.server = server;
      return this;
    }
  }

  protected EditLogSettingsBody(Builder builder) {
    client = builder.client;
    server = builder.server;
  }

  /**
   * New builder.
   *
   * @return a EditLogSettingsBody builder
   */
  public Builder newBuilder() {
    return new Builder(this);
  }

  /**
   * Gets the client.
   *
   * The client side (browser) logging settings. _Changes to this field will restart the IBP console server(s)_.
   *
   * @return the client
   */
  public LoggingSettingsClient client() {
    return client;
  }

  /**
   * Gets the server.
   *
   * The server side logging settings. _Changes to this field will restart the IBP console server(s)_.
   *
   * @return the server
   */
  public LoggingSettingsServer server() {
    return server;
  }
}

