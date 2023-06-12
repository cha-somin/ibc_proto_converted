// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/multisig/v1beta1/genesis.proto

package com.axelar.multisig.v1beta1;

public interface GenesisStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:axelar.multisig.v1beta1.GenesisState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.axelar.multisig.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <code>.axelar.multisig.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return The params.
   */
  com.axelar.multisig.v1beta1.Params getParams();
  /**
   * <code>.axelar.multisig.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   */
  com.axelar.multisig.v1beta1.ParamsOrBuilder getParamsOrBuilder();

  /**
   * <code>repeated .axelar.multisig.v1beta1.KeygenSession keygen_sessions = 2 [json_name = "keygenSessions", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.axelar.multisig.v1beta1.KeygenSession> 
      getKeygenSessionsList();
  /**
   * <code>repeated .axelar.multisig.v1beta1.KeygenSession keygen_sessions = 2 [json_name = "keygenSessions", (.gogoproto.nullable) = false];</code>
   */
  com.axelar.multisig.v1beta1.KeygenSession getKeygenSessions(int index);
  /**
   * <code>repeated .axelar.multisig.v1beta1.KeygenSession keygen_sessions = 2 [json_name = "keygenSessions", (.gogoproto.nullable) = false];</code>
   */
  int getKeygenSessionsCount();
  /**
   * <code>repeated .axelar.multisig.v1beta1.KeygenSession keygen_sessions = 2 [json_name = "keygenSessions", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.axelar.multisig.v1beta1.KeygenSessionOrBuilder> 
      getKeygenSessionsOrBuilderList();
  /**
   * <code>repeated .axelar.multisig.v1beta1.KeygenSession keygen_sessions = 2 [json_name = "keygenSessions", (.gogoproto.nullable) = false];</code>
   */
  com.axelar.multisig.v1beta1.KeygenSessionOrBuilder getKeygenSessionsOrBuilder(
      int index);

  /**
   * <code>repeated .axelar.multisig.v1beta1.SigningSession signing_sessions = 3 [json_name = "signingSessions", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.axelar.multisig.v1beta1.SigningSession> 
      getSigningSessionsList();
  /**
   * <code>repeated .axelar.multisig.v1beta1.SigningSession signing_sessions = 3 [json_name = "signingSessions", (.gogoproto.nullable) = false];</code>
   */
  com.axelar.multisig.v1beta1.SigningSession getSigningSessions(int index);
  /**
   * <code>repeated .axelar.multisig.v1beta1.SigningSession signing_sessions = 3 [json_name = "signingSessions", (.gogoproto.nullable) = false];</code>
   */
  int getSigningSessionsCount();
  /**
   * <code>repeated .axelar.multisig.v1beta1.SigningSession signing_sessions = 3 [json_name = "signingSessions", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.axelar.multisig.v1beta1.SigningSessionOrBuilder> 
      getSigningSessionsOrBuilderList();
  /**
   * <code>repeated .axelar.multisig.v1beta1.SigningSession signing_sessions = 3 [json_name = "signingSessions", (.gogoproto.nullable) = false];</code>
   */
  com.axelar.multisig.v1beta1.SigningSessionOrBuilder getSigningSessionsOrBuilder(
      int index);

  /**
   * <code>repeated .axelar.multisig.v1beta1.Key keys = 4 [json_name = "keys", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.axelar.multisig.v1beta1.Key> 
      getKeysList();
  /**
   * <code>repeated .axelar.multisig.v1beta1.Key keys = 4 [json_name = "keys", (.gogoproto.nullable) = false];</code>
   */
  com.axelar.multisig.v1beta1.Key getKeys(int index);
  /**
   * <code>repeated .axelar.multisig.v1beta1.Key keys = 4 [json_name = "keys", (.gogoproto.nullable) = false];</code>
   */
  int getKeysCount();
  /**
   * <code>repeated .axelar.multisig.v1beta1.Key keys = 4 [json_name = "keys", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.axelar.multisig.v1beta1.KeyOrBuilder> 
      getKeysOrBuilderList();
  /**
   * <code>repeated .axelar.multisig.v1beta1.Key keys = 4 [json_name = "keys", (.gogoproto.nullable) = false];</code>
   */
  com.axelar.multisig.v1beta1.KeyOrBuilder getKeysOrBuilder(
      int index);

  /**
   * <code>repeated .axelar.multisig.v1beta1.KeyEpoch key_epochs = 5 [json_name = "keyEpochs", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<com.axelar.multisig.v1beta1.KeyEpoch> 
      getKeyEpochsList();
  /**
   * <code>repeated .axelar.multisig.v1beta1.KeyEpoch key_epochs = 5 [json_name = "keyEpochs", (.gogoproto.nullable) = false];</code>
   */
  com.axelar.multisig.v1beta1.KeyEpoch getKeyEpochs(int index);
  /**
   * <code>repeated .axelar.multisig.v1beta1.KeyEpoch key_epochs = 5 [json_name = "keyEpochs", (.gogoproto.nullable) = false];</code>
   */
  int getKeyEpochsCount();
  /**
   * <code>repeated .axelar.multisig.v1beta1.KeyEpoch key_epochs = 5 [json_name = "keyEpochs", (.gogoproto.nullable) = false];</code>
   */
  java.util.List<? extends com.axelar.multisig.v1beta1.KeyEpochOrBuilder> 
      getKeyEpochsOrBuilderList();
  /**
   * <code>repeated .axelar.multisig.v1beta1.KeyEpoch key_epochs = 5 [json_name = "keyEpochs", (.gogoproto.nullable) = false];</code>
   */
  com.axelar.multisig.v1beta1.KeyEpochOrBuilder getKeyEpochsOrBuilder(
      int index);
}
