package org.insset.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.RemoteService;

/**
 *
 * @author user
 */
public interface ExempleServiceAsync {
  void inverserChaine(String name, AsyncCallback<String> callback);
}