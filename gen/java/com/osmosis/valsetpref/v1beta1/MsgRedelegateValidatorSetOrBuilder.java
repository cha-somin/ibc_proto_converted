// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/valset-pref/v1beta1/tx.proto

package com.osmosis.valsetpref.v1beta1;

public interface MsgRedelegateValidatorSetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:osmosis.valsetpref.v1beta1.MsgRedelegateValidatorSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * delegator is the user who is trying to create a validator-set.
   * </pre>
   *
   * <code>string delegator = 1 [json_name = "delegator", (.gogoproto.moretags) = "yaml:&#92;"delegator&#92;""];</code>
   * @return The delegator.
   */
  java.lang.String getDelegator();
  /**
   * <pre>
   * delegator is the user who is trying to create a validator-set.
   * </pre>
   *
   * <code>string delegator = 1 [json_name = "delegator", (.gogoproto.moretags) = "yaml:&#92;"delegator&#92;""];</code>
   * @return The bytes for delegator.
   */
  com.google.protobuf.ByteString
      getDelegatorBytes();

  /**
   * <pre>
   * list of {valAddr, weight} to delegate to
   * </pre>
   *
   * <code>repeated .osmosis.valsetpref.v1beta1.ValidatorPreference preferences = 2 [json_name = "preferences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"preferences&#92;""];</code>
   */
  java.util.List<com.osmosis.valsetpref.v1beta1.ValidatorPreference> 
      getPreferencesList();
  /**
   * <pre>
   * list of {valAddr, weight} to delegate to
   * </pre>
   *
   * <code>repeated .osmosis.valsetpref.v1beta1.ValidatorPreference preferences = 2 [json_name = "preferences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"preferences&#92;""];</code>
   */
  com.osmosis.valsetpref.v1beta1.ValidatorPreference getPreferences(int index);
  /**
   * <pre>
   * list of {valAddr, weight} to delegate to
   * </pre>
   *
   * <code>repeated .osmosis.valsetpref.v1beta1.ValidatorPreference preferences = 2 [json_name = "preferences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"preferences&#92;""];</code>
   */
  int getPreferencesCount();
  /**
   * <pre>
   * list of {valAddr, weight} to delegate to
   * </pre>
   *
   * <code>repeated .osmosis.valsetpref.v1beta1.ValidatorPreference preferences = 2 [json_name = "preferences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"preferences&#92;""];</code>
   */
  java.util.List<? extends com.osmosis.valsetpref.v1beta1.ValidatorPreferenceOrBuilder> 
      getPreferencesOrBuilderList();
  /**
   * <pre>
   * list of {valAddr, weight} to delegate to
   * </pre>
   *
   * <code>repeated .osmosis.valsetpref.v1beta1.ValidatorPreference preferences = 2 [json_name = "preferences", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"preferences&#92;""];</code>
   */
  com.osmosis.valsetpref.v1beta1.ValidatorPreferenceOrBuilder getPreferencesOrBuilder(
      int index);
}
