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
 * DeleteComponentResponse.
 */
public class DeleteComponentResponse extends GenericModel {

  protected String message;
  protected String type;
  protected String id;
  @SerializedName("display_name")
  protected String displayName;

  /**
   * Gets the message.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Gets the type.
   *
   * The type of this component. Such as: "fabric-peer", "fabric-ca", "fabric-orderer", etc.
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the id.
   *
   * The unique identifier of this component.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the displayName.
   *
   * A descriptive name for this peer. The IBP console tile displays this name.
   *
   * @return the displayName
   */
  public String getDisplayName() {
    return displayName;
  }
}

