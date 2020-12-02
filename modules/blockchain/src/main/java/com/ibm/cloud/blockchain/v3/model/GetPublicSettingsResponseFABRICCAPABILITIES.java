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

import java.util.List;

import com.ibm.cloud.sdk.core.service.model.GenericModel;

/**
 * Contains the Hyperledger Fabric capabilities flags that should be used.
 */
public class GetPublicSettingsResponseFABRICCAPABILITIES extends GenericModel {

  protected List<String> application;
  protected List<String> channel;
  protected List<String> orderer;

  /**
   * Gets the application.
   *
   * @return the application
   */
  public List<String> getApplication() {
    return application;
  }

  /**
   * Gets the channel.
   *
   * @return the channel
   */
  public List<String> getChannel() {
    return channel;
  }

  /**
   * Gets the orderer.
   *
   * @return the orderer
   */
  public List<String> getOrderer() {
    return orderer;
  }
}

