// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: desmos/profiles/v3/query_app_links.proto

package com.desmos.profiles.v3;

public interface QueryApplicationLinkByClientIDResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:desmos.profiles.v3.QueryApplicationLinkByClientIDResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.desmos.profiles.v3.ApplicationLink link = 1 [json_name = "link", (.gogoproto.nullable) = false];</code>
   * @return Whether the link field is set.
   */
  boolean hasLink();
  /**
   * <code>.desmos.profiles.v3.ApplicationLink link = 1 [json_name = "link", (.gogoproto.nullable) = false];</code>
   * @return The link.
   */
  com.desmos.profiles.v3.ApplicationLink getLink();
  /**
   * <code>.desmos.profiles.v3.ApplicationLink link = 1 [json_name = "link", (.gogoproto.nullable) = false];</code>
   */
  com.desmos.profiles.v3.ApplicationLinkOrBuilder getLinkOrBuilder();
}
