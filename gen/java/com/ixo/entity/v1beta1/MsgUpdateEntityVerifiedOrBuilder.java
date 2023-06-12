// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ixo/entity/v1beta1/tx.proto

package com.ixo.entity.v1beta1;

public interface MsgUpdateEntityVerifiedOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ixo.entity.v1beta1.MsgUpdateEntityVerified)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Id of entity to be updated
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * Id of entity to be updated
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * Whether entity is verified or not based on credentials
   * </pre>
   *
   * <code>bool entity_verified = 2 [json_name = "entityVerified"];</code>
   * @return The entityVerified.
   */
  boolean getEntityVerified();

  /**
   * <pre>
   * The relayer node's did used to sign this transaction.
   * </pre>
   *
   * <code>string relayer_node_did = 3 [json_name = "relayerNodeDid", (.gogoproto.casttype) = "github.com/ixofoundation/ixo-blockchain/x/iid/types.DIDFragment"];</code>
   * @return The relayerNodeDid.
   */
  java.lang.String getRelayerNodeDid();
  /**
   * <pre>
   * The relayer node's did used to sign this transaction.
   * </pre>
   *
   * <code>string relayer_node_did = 3 [json_name = "relayerNodeDid", (.gogoproto.casttype) = "github.com/ixofoundation/ixo-blockchain/x/iid/types.DIDFragment"];</code>
   * @return The bytes for relayerNodeDid.
   */
  com.google.protobuf.ByteString
      getRelayerNodeDidBytes();

  /**
   * <pre>
   * The relayer node's address used to sign this transaction.
   * </pre>
   *
   * <code>string relayer_node_address = 4 [json_name = "relayerNodeAddress"];</code>
   * @return The relayerNodeAddress.
   */
  java.lang.String getRelayerNodeAddress();
  /**
   * <pre>
   * The relayer node's address used to sign this transaction.
   * </pre>
   *
   * <code>string relayer_node_address = 4 [json_name = "relayerNodeAddress"];</code>
   * @return The bytes for relayerNodeAddress.
   */
  com.google.protobuf.ByteString
      getRelayerNodeAddressBytes();
}
