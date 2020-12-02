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
 * NotificationData.
 */
public class NotificationData extends GenericModel {

  protected String id;
  protected String type;
  protected String status;
  protected String by;
  protected String message;
  @SerializedName("ts_display")
  protected Double tsDisplay;

  /**
   * Gets the id.
   *
   * Unique id for the notification.
   *
   * @return the id
   */
  public String getId() {
    return id;
  }

  /**
   * Gets the type.
   *
   * Values can be "notification", "webhook_tx" or "other".
   *
   * @return the type
   */
  public String getType() {
    return type;
  }

  /**
   * Gets the status.
   *
   * Values can be "pending", "error", or "success".
   *
   * @return the status
   */
  public String getStatus() {
    return status;
  }

  /**
   * Gets the by.
   *
   * The end user who initiated the action for the notification.
   *
   * @return the by
   */
  public String getBy() {
    return by;
  }

  /**
   * Gets the message.
   *
   * Text describing the outcome of the transaction.
   *
   * @return the message
   */
  public String getMessage() {
    return message;
  }

  /**
   * Gets the tsDisplay.
   *
   * UTC UNIX timestamp of the notification's creation. In milliseconds.
   *
   * @return the tsDisplay
   */
  public Double getTsDisplay() {
    return tsDisplay;
  }
}

