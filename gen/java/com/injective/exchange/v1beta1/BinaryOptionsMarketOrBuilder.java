// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/exchange.proto

package com.injective.exchange.v1beta1;

public interface BinaryOptionsMarketOrBuilder extends
    // @@protoc_insertion_point(interface_extends:injective.exchange.v1beta1.BinaryOptionsMarket)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Ticker for the derivative contract.
   * </pre>
   *
   * <code>string ticker = 1 [json_name = "ticker"];</code>
   * @return The ticker.
   */
  java.lang.String getTicker();
  /**
   * <pre>
   * Ticker for the derivative contract.
   * </pre>
   *
   * <code>string ticker = 1 [json_name = "ticker"];</code>
   * @return The bytes for ticker.
   */
  com.google.protobuf.ByteString
      getTickerBytes();

  /**
   * <pre>
   * Oracle symbol
   * </pre>
   *
   * <code>string oracle_symbol = 2 [json_name = "oracleSymbol"];</code>
   * @return The oracleSymbol.
   */
  java.lang.String getOracleSymbol();
  /**
   * <pre>
   * Oracle symbol
   * </pre>
   *
   * <code>string oracle_symbol = 2 [json_name = "oracleSymbol"];</code>
   * @return The bytes for oracleSymbol.
   */
  com.google.protobuf.ByteString
      getOracleSymbolBytes();

  /**
   * <pre>
   * Oracle Provider
   * </pre>
   *
   * <code>string oracle_provider = 3 [json_name = "oracleProvider"];</code>
   * @return The oracleProvider.
   */
  java.lang.String getOracleProvider();
  /**
   * <pre>
   * Oracle Provider
   * </pre>
   *
   * <code>string oracle_provider = 3 [json_name = "oracleProvider"];</code>
   * @return The bytes for oracleProvider.
   */
  com.google.protobuf.ByteString
      getOracleProviderBytes();

  /**
   * <pre>
   * Oracle type
   * </pre>
   *
   * <code>.injective.oracle.v1beta1.OracleType oracle_type = 4 [json_name = "oracleType"];</code>
   * @return The enum numeric value on the wire for oracleType.
   */
  int getOracleTypeValue();
  /**
   * <pre>
   * Oracle type
   * </pre>
   *
   * <code>.injective.oracle.v1beta1.OracleType oracle_type = 4 [json_name = "oracleType"];</code>
   * @return The oracleType.
   */
  com.injective.oracle.v1beta1.OracleType getOracleType();

  /**
   * <pre>
   * Scale factor for oracle prices.
   * </pre>
   *
   * <code>uint32 oracle_scale_factor = 5 [json_name = "oracleScaleFactor"];</code>
   * @return The oracleScaleFactor.
   */
  int getOracleScaleFactor();

  /**
   * <pre>
   * expiration timestamp
   * </pre>
   *
   * <code>int64 expiration_timestamp = 6 [json_name = "expirationTimestamp"];</code>
   * @return The expirationTimestamp.
   */
  long getExpirationTimestamp();

  /**
   * <pre>
   * expiration timestamp
   * </pre>
   *
   * <code>int64 settlement_timestamp = 7 [json_name = "settlementTimestamp"];</code>
   * @return The settlementTimestamp.
   */
  long getSettlementTimestamp();

  /**
   * <pre>
   * admin of the market
   * </pre>
   *
   * <code>string admin = 8 [json_name = "admin"];</code>
   * @return The admin.
   */
  java.lang.String getAdmin();
  /**
   * <pre>
   * admin of the market
   * </pre>
   *
   * <code>string admin = 8 [json_name = "admin"];</code>
   * @return The bytes for admin.
   */
  com.google.protobuf.ByteString
      getAdminBytes();

  /**
   * <pre>
   * Address of the quote currency denomination for the binary options contract
   * </pre>
   *
   * <code>string quote_denom = 9 [json_name = "quoteDenom"];</code>
   * @return The quoteDenom.
   */
  java.lang.String getQuoteDenom();
  /**
   * <pre>
   * Address of the quote currency denomination for the binary options contract
   * </pre>
   *
   * <code>string quote_denom = 9 [json_name = "quoteDenom"];</code>
   * @return The bytes for quoteDenom.
   */
  com.google.protobuf.ByteString
      getQuoteDenomBytes();

  /**
   * <pre>
   * Unique market ID.
   * </pre>
   *
   * <code>string market_id = 10 [json_name = "marketId"];</code>
   * @return The marketId.
   */
  java.lang.String getMarketId();
  /**
   * <pre>
   * Unique market ID.
   * </pre>
   *
   * <code>string market_id = 10 [json_name = "marketId"];</code>
   * @return The bytes for marketId.
   */
  com.google.protobuf.ByteString
      getMarketIdBytes();

  /**
   * <pre>
   * maker_fee_rate defines the maker fee rate of a binary options market
   * </pre>
   *
   * <code>string maker_fee_rate = 11 [json_name = "makerFeeRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The makerFeeRate.
   */
  java.lang.String getMakerFeeRate();
  /**
   * <pre>
   * maker_fee_rate defines the maker fee rate of a binary options market
   * </pre>
   *
   * <code>string maker_fee_rate = 11 [json_name = "makerFeeRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for makerFeeRate.
   */
  com.google.protobuf.ByteString
      getMakerFeeRateBytes();

  /**
   * <pre>
   * taker_fee_rate defines the taker fee rate of a derivative market
   * </pre>
   *
   * <code>string taker_fee_rate = 12 [json_name = "takerFeeRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The takerFeeRate.
   */
  java.lang.String getTakerFeeRate();
  /**
   * <pre>
   * taker_fee_rate defines the taker fee rate of a derivative market
   * </pre>
   *
   * <code>string taker_fee_rate = 12 [json_name = "takerFeeRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for takerFeeRate.
   */
  com.google.protobuf.ByteString
      getTakerFeeRateBytes();

  /**
   * <pre>
   * relayer_fee_share_rate defines the percentage of the transaction fee shared
   * with the relayer in a derivative market
   * </pre>
   *
   * <code>string relayer_fee_share_rate = 13 [json_name = "relayerFeeShareRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The relayerFeeShareRate.
   */
  java.lang.String getRelayerFeeShareRate();
  /**
   * <pre>
   * relayer_fee_share_rate defines the percentage of the transaction fee shared
   * with the relayer in a derivative market
   * </pre>
   *
   * <code>string relayer_fee_share_rate = 13 [json_name = "relayerFeeShareRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for relayerFeeShareRate.
   */
  com.google.protobuf.ByteString
      getRelayerFeeShareRateBytes();

  /**
   * <pre>
   * Status of the market
   * </pre>
   *
   * <code>.injective.exchange.v1beta1.MarketStatus status = 14 [json_name = "status"];</code>
   * @return The enum numeric value on the wire for status.
   */
  int getStatusValue();
  /**
   * <pre>
   * Status of the market
   * </pre>
   *
   * <code>.injective.exchange.v1beta1.MarketStatus status = 14 [json_name = "status"];</code>
   * @return The status.
   */
  com.injective.exchange.v1beta1.MarketStatus getStatus();

  /**
   * <pre>
   * min_price_tick_size defines the minimum tick size that the price and margin
   * required for orders in the market
   * </pre>
   *
   * <code>string min_price_tick_size = 15 [json_name = "minPriceTickSize", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The minPriceTickSize.
   */
  java.lang.String getMinPriceTickSize();
  /**
   * <pre>
   * min_price_tick_size defines the minimum tick size that the price and margin
   * required for orders in the market
   * </pre>
   *
   * <code>string min_price_tick_size = 15 [json_name = "minPriceTickSize", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for minPriceTickSize.
   */
  com.google.protobuf.ByteString
      getMinPriceTickSizeBytes();

  /**
   * <pre>
   * min_quantity_tick_size defines the minimum tick size of the quantity
   * required for orders in the market
   * </pre>
   *
   * <code>string min_quantity_tick_size = 16 [json_name = "minQuantityTickSize", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The minQuantityTickSize.
   */
  java.lang.String getMinQuantityTickSize();
  /**
   * <pre>
   * min_quantity_tick_size defines the minimum tick size of the quantity
   * required for orders in the market
   * </pre>
   *
   * <code>string min_quantity_tick_size = 16 [json_name = "minQuantityTickSize", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for minQuantityTickSize.
   */
  com.google.protobuf.ByteString
      getMinQuantityTickSizeBytes();

  /**
   * <code>string settlement_price = 17 [json_name = "settlementPrice", (.gogoproto.nullable) = true, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The settlementPrice.
   */
  java.lang.String getSettlementPrice();
  /**
   * <code>string settlement_price = 17 [json_name = "settlementPrice", (.gogoproto.nullable) = true, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for settlementPrice.
   */
  com.google.protobuf.ByteString
      getSettlementPriceBytes();
}
