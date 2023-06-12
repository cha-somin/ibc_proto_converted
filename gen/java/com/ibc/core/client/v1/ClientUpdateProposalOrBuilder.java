// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/client/v1/client.proto

package com.ibc.core.client.v1;

public interface ClientUpdateProposalOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ibc.core.client.v1.ClientUpdateProposal)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * the title of the update proposal
   * </pre>
   *
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The title.
   */
  java.lang.String getTitle();
  /**
   * <pre>
   * the title of the update proposal
   * </pre>
   *
   * <code>string title = 1 [json_name = "title"];</code>
   * @return The bytes for title.
   */
  com.google.protobuf.ByteString
      getTitleBytes();

  /**
   * <pre>
   * the description of the proposal
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <pre>
   * the description of the proposal
   * </pre>
   *
   * <code>string description = 2 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <pre>
   * the client identifier for the client to be updated if the proposal passes
   * </pre>
   *
   * <code>string subject_client_id = 3 [json_name = "subjectClientId"];</code>
   * @return The subjectClientId.
   */
  java.lang.String getSubjectClientId();
  /**
   * <pre>
   * the client identifier for the client to be updated if the proposal passes
   * </pre>
   *
   * <code>string subject_client_id = 3 [json_name = "subjectClientId"];</code>
   * @return The bytes for subjectClientId.
   */
  com.google.protobuf.ByteString
      getSubjectClientIdBytes();

  /**
   * <pre>
   * the substitute client identifier for the client standing in for the subject
   * client
   * </pre>
   *
   * <code>string substitute_client_id = 4 [json_name = "substituteClientId"];</code>
   * @return The substituteClientId.
   */
  java.lang.String getSubstituteClientId();
  /**
   * <pre>
   * the substitute client identifier for the client standing in for the subject
   * client
   * </pre>
   *
   * <code>string substitute_client_id = 4 [json_name = "substituteClientId"];</code>
   * @return The bytes for substituteClientId.
   */
  com.google.protobuf.ByteString
      getSubstituteClientIdBytes();
}
