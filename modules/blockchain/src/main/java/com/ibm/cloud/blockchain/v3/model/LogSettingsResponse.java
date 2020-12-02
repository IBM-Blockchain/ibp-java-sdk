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
 * The logging settings for the client and server.
 */
public class LogSettingsResponse extends GenericModel {

  protected LoggingSettingsClient client;
  protected LoggingSettingsServer server;

  /**
   * Gets the client.
   *
   * The client side (browser) logging settings. _Changes to this field will restart the IBP console server(s)_.
   *
   * @return the client
   */
  public LoggingSettingsClient getClient() {
    return client;
  }

  /**
   * Gets the server.
   *
   * The server side logging settings. _Changes to this field will restart the IBP console server(s)_.
   *
   * @return the server
   */
  public LoggingSettingsServer getServer() {
    return server;
  }
}

