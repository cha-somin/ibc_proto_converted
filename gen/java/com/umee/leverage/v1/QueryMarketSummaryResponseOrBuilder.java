// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: umee/leverage/v1/query.proto

package com.umee.leverage.v1;

public interface QueryMarketSummaryResponseOrBuilder extends
    // @@protoc_insertion_point(interface_extends:umee.leverage.v1.QueryMarketSummaryResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Symbol Denom is the human-readable representation of a token denom, for example "UMEE" or "ATOM".
   * </pre>
   *
   * <code>string symbol_denom = 1 [json_name = "symbolDenom"];</code>
   * @return The symbolDenom.
   */
  java.lang.String getSymbolDenom();
  /**
   * <pre>
   * Symbol Denom is the human-readable representation of a token denom, for example "UMEE" or "ATOM".
   * </pre>
   *
   * <code>string symbol_denom = 1 [json_name = "symbolDenom"];</code>
   * @return The bytes for symbolDenom.
   */
  com.google.protobuf.ByteString
      getSymbolDenomBytes();

  /**
   * <pre>
   * Exponent is the power of ten required to get from base denom to symbol denom. For example, an exponent of 6 means 10^6 uumee = 1 UMEE.
   * </pre>
   *
   * <code>uint32 exponent = 2 [json_name = "exponent"];</code>
   * @return The exponent.
   */
  int getExponent();

  /**
   * <pre>
   * Oracle Price is the current USD value of a token. Oracle price is nil when the oracle is down.
   * </pre>
   *
   * <code>string oracle_price = 3 [json_name = "oraclePrice", (.gogoproto.nullable) = true, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The oraclePrice.
   */
  java.lang.String getOraclePrice();
  /**
   * <pre>
   * Oracle Price is the current USD value of a token. Oracle price is nil when the oracle is down.
   * </pre>
   *
   * <code>string oracle_price = 3 [json_name = "oraclePrice", (.gogoproto.nullable) = true, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for oraclePrice.
   */
  com.google.protobuf.ByteString
      getOraclePriceBytes();

  /**
   * <pre>
   * uToken Exchange Rate is the amount of base tokens received when withdrawing 1 uToken. For example, a uToken exchange rate of 1.5 means a supplier receives 3 uumee for every 2 u/uumee they wish to withdraw. The same applies in reverse: supplying 3 uumee would award 2 u/uumee at that time.
   * </pre>
   *
   * <code>string uToken_exchange_rate = 4 [json_name = "uTokenExchangeRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.jsontag) = "utoken_exchange_rate"];</code>
   * @return The uTokenExchangeRate.
   */
  java.lang.String getUTokenExchangeRate();
  /**
   * <pre>
   * uToken Exchange Rate is the amount of base tokens received when withdrawing 1 uToken. For example, a uToken exchange rate of 1.5 means a supplier receives 3 uumee for every 2 u/uumee they wish to withdraw. The same applies in reverse: supplying 3 uumee would award 2 u/uumee at that time.
   * </pre>
   *
   * <code>string uToken_exchange_rate = 4 [json_name = "uTokenExchangeRate", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.jsontag) = "utoken_exchange_rate"];</code>
   * @return The bytes for uTokenExchangeRate.
   */
  com.google.protobuf.ByteString
      getUTokenExchangeRateBytes();

  /**
   * <pre>
   * Supply APY is the current interest rate suppliers are receiving for their deposits. For example, 0.11 would mean 11% APY. Supply APY is always less than borrow APY.
   * </pre>
   *
   * <code>string supply_APY = 5 [json_name = "supplyAPY", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.jsontag) = "supply_apy"];</code>
   * @return The supplyAPY.
   */
  java.lang.String getSupplyAPY();
  /**
   * <pre>
   * Supply APY is the current interest rate suppliers are receiving for their deposits. For example, 0.11 would mean 11% APY. Supply APY is always less than borrow APY.
   * </pre>
   *
   * <code>string supply_APY = 5 [json_name = "supplyAPY", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.jsontag) = "supply_apy"];</code>
   * @return The bytes for supplyAPY.
   */
  com.google.protobuf.ByteString
      getSupplyAPYBytes();

  /**
   * <pre>
   * Borrow APY is the current interest rate borrowers are being charged on their loans. For example, 0.2 would mean 20% APY.
   * </pre>
   *
   * <code>string borrow_APY = 6 [json_name = "borrowAPY", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.jsontag) = "borrow_apy"];</code>
   * @return The borrowAPY.
   */
  java.lang.String getBorrowAPY();
  /**
   * <pre>
   * Borrow APY is the current interest rate borrowers are being charged on their loans. For example, 0.2 would mean 20% APY.
   * </pre>
   *
   * <code>string borrow_APY = 6 [json_name = "borrowAPY", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec", (.gogoproto.jsontag) = "borrow_apy"];</code>
   * @return The bytes for borrowAPY.
   */
  com.google.protobuf.ByteString
      getBorrowAPYBytes();

  /**
   * <pre>
   * Supplied is the total amount of tokens supplied to the the system by all suppliers, including any interest earned. This includes that tokens which have been borrowed out or enabled as collateral, but excludes reserves. Supplied is denominated in base tokens, so exponent must be applied to convert to symbol denom.
   * </pre>
   *
   * <code>string supplied = 7 [json_name = "supplied", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The supplied.
   */
  java.lang.String getSupplied();
  /**
   * <pre>
   * Supplied is the total amount of tokens supplied to the the system by all suppliers, including any interest earned. This includes that tokens which have been borrowed out or enabled as collateral, but excludes reserves. Supplied is denominated in base tokens, so exponent must be applied to convert to symbol denom.
   * </pre>
   *
   * <code>string supplied = 7 [json_name = "supplied", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for supplied.
   */
  com.google.protobuf.ByteString
      getSuppliedBytes();

  /**
   * <pre>
   * Reserved is the total amount of tokens held in reserve by the module for emergencies. Reserves are always excluded from total supply, borrow, collateral, and liqduidity queries. Reserves are denominated in base tokens, so exponent must be applied to convert to symbol denom.
   * </pre>
   *
   * <code>string reserved = 8 [json_name = "reserved", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The reserved.
   */
  java.lang.String getReserved();
  /**
   * <pre>
   * Reserved is the total amount of tokens held in reserve by the module for emergencies. Reserves are always excluded from total supply, borrow, collateral, and liqduidity queries. Reserves are denominated in base tokens, so exponent must be applied to convert to symbol denom.
   * </pre>
   *
   * <code>string reserved = 8 [json_name = "reserved", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for reserved.
   */
  com.google.protobuf.ByteString
      getReservedBytes();

  /**
   * <pre>
   * Collateral is the total amount of uTokens collateralized by all borrowers. Collateral is denominated in uTokenso, so both uToken exchange rate and exponent must also be applied to convert to symbol denom. For example, if collateral is 4000000 u/uumee and uToken exchange rate is 1.2, then 5 UMEE have been collateralized.
   * </pre>
   *
   * <code>string collateral = 9 [json_name = "collateral", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The collateral.
   */
  java.lang.String getCollateral();
  /**
   * <pre>
   * Collateral is the total amount of uTokens collateralized by all borrowers. Collateral is denominated in uTokenso, so both uToken exchange rate and exponent must also be applied to convert to symbol denom. For example, if collateral is 4000000 u/uumee and uToken exchange rate is 1.2, then 5 UMEE have been collateralized.
   * </pre>
   *
   * <code>string collateral = 9 [json_name = "collateral", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for collateral.
   */
  com.google.protobuf.ByteString
      getCollateralBytes();

  /**
   * <pre>
   * Borrowed is the total amount of debt in this token held across all borrowers. It is denominated in base tokens, so exponent must be applied to convert to symbol denom.
   * </pre>
   *
   * <code>string borrowed = 10 [json_name = "borrowed", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The borrowed.
   */
  java.lang.String getBorrowed();
  /**
   * <pre>
   * Borrowed is the total amount of debt in this token held across all borrowers. It is denominated in base tokens, so exponent must be applied to convert to symbol denom.
   * </pre>
   *
   * <code>string borrowed = 10 [json_name = "borrowed", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for borrowed.
   */
  com.google.protobuf.ByteString
      getBorrowedBytes();

  /**
   * <pre>
   * Liquidity is the amount of a token that has been supplied but not yet borrowed or reserved. It is denominated in base tokens, so exponent must be applied to convert to symbol denom.
   * </pre>
   *
   * <code>string liquidity = 11 [json_name = "liquidity", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The liquidity.
   */
  java.lang.String getLiquidity();
  /**
   * <pre>
   * Liquidity is the amount of a token that has been supplied but not yet borrowed or reserved. It is denominated in base tokens, so exponent must be applied to convert to symbol denom.
   * </pre>
   *
   * <code>string liquidity = 11 [json_name = "liquidity", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for liquidity.
   */
  com.google.protobuf.ByteString
      getLiquidityBytes();

  /**
   * <pre>
   * Maximum Borrow is the amount of a token that is available for borrowing, including that which has already been borrowed out. This amount is less than total supply due to safety limits. It is denominated in base tokens, so exponent must be applied to convert to symbol denom. For example, if borrowed is 3000000 uumee and maximum borrow is 4000000 uumee, then 1 UMEE is currently available for borrowing.
   * </pre>
   *
   * <code>string maximum_borrow = 12 [json_name = "maximumBorrow", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The maximumBorrow.
   */
  java.lang.String getMaximumBorrow();
  /**
   * <pre>
   * Maximum Borrow is the amount of a token that is available for borrowing, including that which has already been borrowed out. This amount is less than total supply due to safety limits. It is denominated in base tokens, so exponent must be applied to convert to symbol denom. For example, if borrowed is 3000000 uumee and maximum borrow is 4000000 uumee, then 1 UMEE is currently available for borrowing.
   * </pre>
   *
   * <code>string maximum_borrow = 12 [json_name = "maximumBorrow", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for maximumBorrow.
   */
  com.google.protobuf.ByteString
      getMaximumBorrowBytes();

  /**
   * <pre>
   * Maximum Collateral is the amount of a token that can be collateralized, including that which is already collateral. This amount is less than total supply due to safety limits. It is denominated in uTokens, so both uToken exchange rate and exponent must be applied to convert to symbol denom. For example, if collateral is 4000000 u/uumee, uToken exchange rate is 1.2, and maximum borrow is 7000000 uumee, then a maximum of 2 additional UMEE is permitted to be collateralized.
   * </pre>
   *
   * <code>string maximum_collateral = 13 [json_name = "maximumCollateral", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The maximumCollateral.
   */
  java.lang.String getMaximumCollateral();
  /**
   * <pre>
   * Maximum Collateral is the amount of a token that can be collateralized, including that which is already collateral. This amount is less than total supply due to safety limits. It is denominated in uTokens, so both uToken exchange rate and exponent must be applied to convert to symbol denom. For example, if collateral is 4000000 u/uumee, uToken exchange rate is 1.2, and maximum borrow is 7000000 uumee, then a maximum of 2 additional UMEE is permitted to be collateralized.
   * </pre>
   *
   * <code>string maximum_collateral = 13 [json_name = "maximumCollateral", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for maximumCollateral.
   */
  com.google.protobuf.ByteString
      getMaximumCollateralBytes();

  /**
   * <pre>
   * Minimum Liquidity is the minimum amount of liquidity in the module required by safety limits, based on the current collateral. It is denominated in base tokens, so exponent must be applied to convert to symbol denom. For example, if liquidity is 9000000 uumee and minimum liquidity is 8000000 uumee, then a maximum of 1 additional UMEE is currently available for borrowing or withdrawal.
   * </pre>
   *
   * <code>string minimum_liquidity = 14 [json_name = "minimumLiquidity", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The minimumLiquidity.
   */
  java.lang.String getMinimumLiquidity();
  /**
   * <pre>
   * Minimum Liquidity is the minimum amount of liquidity in the module required by safety limits, based on the current collateral. It is denominated in base tokens, so exponent must be applied to convert to symbol denom. For example, if liquidity is 9000000 uumee and minimum liquidity is 8000000 uumee, then a maximum of 1 additional UMEE is currently available for borrowing or withdrawal.
   * </pre>
   *
   * <code>string minimum_liquidity = 14 [json_name = "minimumLiquidity", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for minimumLiquidity.
   */
  com.google.protobuf.ByteString
      getMinimumLiquidityBytes();

  /**
   * <pre>
   * uToken Supply is the total amount of a base token's associated uToken in circulation.
   * </pre>
   *
   * <code>string uToken_supply = 15 [json_name = "uTokenSupply", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.jsontag) = "utoken_supply"];</code>
   * @return The uTokenSupply.
   */
  java.lang.String getUTokenSupply();
  /**
   * <pre>
   * uToken Supply is the total amount of a base token's associated uToken in circulation.
   * </pre>
   *
   * <code>string uToken_supply = 15 [json_name = "uTokenSupply", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int", (.gogoproto.jsontag) = "utoken_supply"];</code>
   * @return The bytes for uTokenSupply.
   */
  com.google.protobuf.ByteString
      getUTokenSupplyBytes();

  /**
   * <pre>
   * Available Borrow is the maximum additional amount of base tokens than can be borrowed based on current liquidity and system safety limits. It can also be calculated by MIN(maximum_borrow - borrowed, liquidity - minimum_liquidity). It is denominated in base tokens, so exponent must be applied to convert to symbol denom. A negative availability means safety limits have been exceeded and borrowing is temporarily unavailable.
   * </pre>
   *
   * <code>string available_borrow = 16 [json_name = "availableBorrow", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The availableBorrow.
   */
  java.lang.String getAvailableBorrow();
  /**
   * <pre>
   * Available Borrow is the maximum additional amount of base tokens than can be borrowed based on current liquidity and system safety limits. It can also be calculated by MIN(maximum_borrow - borrowed, liquidity - minimum_liquidity). It is denominated in base tokens, so exponent must be applied to convert to symbol denom. A negative availability means safety limits have been exceeded and borrowing is temporarily unavailable.
   * </pre>
   *
   * <code>string available_borrow = 16 [json_name = "availableBorrow", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for availableBorrow.
   */
  com.google.protobuf.ByteString
      getAvailableBorrowBytes();

  /**
   * <pre>
   * Available Withdraw is the maximum amount of uTokens than can currently be withdrawn based on liquidity and system safety limits. It can also be calculated by (liquidity - minimum_liquidity). It is denominated in uTokens, so both uToken exchange rate and exponent must be applied to convert to symbol denom. A negative availability means safety limits have been exceeded and withdrawal is temporarily unavailable.
   * </pre>
   *
   * <code>string available_withdraw = 17 [json_name = "availableWithdraw", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The availableWithdraw.
   */
  java.lang.String getAvailableWithdraw();
  /**
   * <pre>
   * Available Withdraw is the maximum amount of uTokens than can currently be withdrawn based on liquidity and system safety limits. It can also be calculated by (liquidity - minimum_liquidity). It is denominated in uTokens, so both uToken exchange rate and exponent must be applied to convert to symbol denom. A negative availability means safety limits have been exceeded and withdrawal is temporarily unavailable.
   * </pre>
   *
   * <code>string available_withdraw = 17 [json_name = "availableWithdraw", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for availableWithdraw.
   */
  com.google.protobuf.ByteString
      getAvailableWithdrawBytes();

  /**
   * <pre>
   * Available Collateralize is the maximum additional amount of uTokens than can be collateralized based on current liquidity and system safety limits. It can also be calculated by (maximum_collateral, - collateral). It is denominated in uTokens, so both uToken exchange rate and exponent must be applied to convert to symbol denom. A negative availability means safety limits have been exceeded and additional collateral cannot be created until more liquidity is present.
   * </pre>
   *
   * <code>string available_collateralize = 18 [json_name = "availableCollateralize", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The availableCollateralize.
   */
  java.lang.String getAvailableCollateralize();
  /**
   * <pre>
   * Available Collateralize is the maximum additional amount of uTokens than can be collateralized based on current liquidity and system safety limits. It can also be calculated by (maximum_collateral, - collateral). It is denominated in uTokens, so both uToken exchange rate and exponent must be applied to convert to symbol denom. A negative availability means safety limits have been exceeded and additional collateral cannot be created until more liquidity is present.
   * </pre>
   *
   * <code>string available_collateralize = 18 [json_name = "availableCollateralize", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for availableCollateralize.
   */
  com.google.protobuf.ByteString
      getAvailableCollateralizeBytes();

  /**
   * <pre>
   * Oracle Historic Price is the historic USD value of a token. Historic price is defined as the median of the last N historic median prices from the oracle module, with N being this token's HistoricMedians in the leverage registry. Current price is used if required medians is zero. Price is nil when the oracle is down or insufficient historic medians are available.
   * </pre>
   *
   * <code>string oracle_historic_price = 19 [json_name = "oracleHistoricPrice", (.gogoproto.nullable) = true, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The oracleHistoricPrice.
   */
  java.lang.String getOracleHistoricPrice();
  /**
   * <pre>
   * Oracle Historic Price is the historic USD value of a token. Historic price is defined as the median of the last N historic median prices from the oracle module, with N being this token's HistoricMedians in the leverage registry. Current price is used if required medians is zero. Price is nil when the oracle is down or insufficient historic medians are available.
   * </pre>
   *
   * <code>string oracle_historic_price = 19 [json_name = "oracleHistoricPrice", (.gogoproto.nullable) = true, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Dec"];</code>
   * @return The bytes for oracleHistoricPrice.
   */
  com.google.protobuf.ByteString
      getOracleHistoricPriceBytes();

  /**
   * <code>string errors = 20 [json_name = "errors"];</code>
   * @return The errors.
   */
  java.lang.String getErrors();
  /**
   * <code>string errors = 20 [json_name = "errors"];</code>
   * @return The bytes for errors.
   */
  com.google.protobuf.ByteString
      getErrorsBytes();
}
