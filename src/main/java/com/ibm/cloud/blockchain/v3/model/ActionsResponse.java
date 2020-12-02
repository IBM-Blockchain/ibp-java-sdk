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
 * ActionsResponse.
 */
public class ActionsResponse extends GenericModel {

  protected String message;
  protected String id;
  protected List<String> actions;

  /**
   * Gets the message.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Gets the id.
   *
   * The id of the component.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the actions.
   *
   * @return the actions
   */
  public List<String> getActions() {
    return actions;
  }
}

