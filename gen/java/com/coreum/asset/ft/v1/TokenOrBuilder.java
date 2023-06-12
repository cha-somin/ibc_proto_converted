// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: coreum/asset/ft/v1/token.proto

package com.coreum.asset.ft.v1;

public interface TokenOrBuilder extends
    // @@protoc_insertion_point(interface_extends:coreum.asset.ft.v1.Token)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The denom.
   */
  java.lang.String getDenom();
  /**
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The bytes for denom.
   */
  com.google.protobuf.ByteString
      getDenomBytes();

  /**
   * <code>string issuer = 2 [json_name = "issuer"];</code>
   * @return The issuer.
   */
  java.lang.String getIssuer();
  /**
   * <code>string issuer = 2 [json_name = "issuer"];</code>
   * @return The bytes for issuer.
   */
  com.google.protobuf.ByteString
      getIssuerBytes();

  /**
   * <code>string symbol = 3 [json_name = "symbol"];</code>
   * @return The symbol.
   */
  java.lang.String getSymbol();
  /**
   * <code>string symbol = 3 [json_name = "symbol"];</code>
   * @return The bytes for symbol.
   */
  com.google.protobuf.ByteString
      getSymbolBytes();

  /**
   * <code>string subunit = 4 [json_name = "subunit"];</code>
   * @return The subunit.
   */
  java.lang.String getSubunit();
  /**
   * <code>string subunit = 4 [json_name = "subunit"];</code>
   * @return The bytes for subunit.
   */
  com.google.protobuf.ByteString
      getSubunitBytes();

  /**
   * <code>uint32 precision = 5 [json_name = "precision"];</code>
   * @return The precision.
   */
  int getPrecision();

  /**
   * <code>string description = 6 [json_name = "description"];</code>
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   * <code>string description = 6 [json_name = "description"];</code>
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString
      getDescriptionBytes();

  /**
   * <code>bool globally_frozen = 7 [json_name = "globallyFrozen"];</code>
   * @return The globallyFrozen.
   */
  boolean getGloballyFrozen();

  /**
   * <code>repeated .coreum.asset.ft.v1.Feature features = 8 [json_name = "features"];</code>
   * @return A list containing the features.
   */
  java.util.List<com.coreum.asset.ft.v1.Feature> getFeaturesList();
  /**
   * <code>repeated .coreum.asset.ft.v1.Feature features = 8 [json_name = "features"];</code>
   * @return The count of features.
   */
  int getFeaturesCount();
  /**
   * <code>repeated .coreum.asset.ft.v1.Feature features = 8 [json_name = "features"];</code>
   * @param index The index of the element to return.
   * @return The features at the given index.
   */
  com.coreum.asset.ft.v1.Feature getFeatures(int index);
  /**
   * <code>repeated .coreum.asset.ft.v1.Feature features = 8 [json_name = "features"];</code>
   * @return A list containing the enum numeric values on the wire for features.
   */
  java.util.List<java.lang.Integer>
  getFeaturesValueList();
  /**
   * <code>repeated .coreum.asset.ft.v1.Feature features = 8 [json_name = "features"];</code>
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of features at the given index.
   */
  int getFeaturesValue(int index);

  /**
   * <pre>
   * burn_rate is a number between 0 and 1 which will be multiplied by send amount to determine
   * burn_amount. This value will be burnt on top of the send amount.
   * </pre>
   *
   * <code>string burn_rate = 9 [json_name = "burnRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The burnRate.
   */
  java.lang.String getBurnRate();
  /**
   * <pre>
   * burn_rate is a number between 0 and 1 which will be multiplied by send amount to determine
   * burn_amount. This value will be burnt on top of the send amount.
   * </pre>
   *
   * <code>string burn_rate = 9 [json_name = "burnRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for burnRate.
   */
  com.google.protobuf.ByteString
      getBurnRateBytes();

  /**
   * <pre>
   * send_commission_rate is a number between 0 and 1 which will be multiplied by send amount to determine
   * amount sent to the token issuer account.
   * </pre>
   *
   * <code>string send_commission_rate = 10 [json_name = "sendCommissionRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The sendCommissionRate.
   */
  java.lang.String getSendCommissionRate();
  /**
   * <pre>
   * send_commission_rate is a number between 0 and 1 which will be multiplied by send amount to determine
   * amount sent to the token issuer account.
   * </pre>
   *
   * <code>string send_commission_rate = 10 [json_name = "sendCommissionRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for sendCommissionRate.
   */
  com.google.protobuf.ByteString
      getSendCommissionRateBytes();
}
