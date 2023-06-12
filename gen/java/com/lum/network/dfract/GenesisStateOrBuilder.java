// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lum-network/dfract/genesis.proto

package com.lum.network.dfract;

public interface GenesisStateOrBuilder extends
    // @@protoc_insertion_point(interface_extends:lum.network.dfract.GenesisState)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .cosmos.base.v1beta1.Coin module_account_balance = 1 [json_name = "moduleAccountBalance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"module_account_balance&#92;""];</code>
   */
  java.util.List<com.cosmos.base.v1beta1.Coin> 
      getModuleAccountBalanceList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin module_account_balance = 1 [json_name = "moduleAccountBalance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"module_account_balance&#92;""];</code>
   */
  com.cosmos.base.v1beta1.Coin getModuleAccountBalance(int index);
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin module_account_balance = 1 [json_name = "moduleAccountBalance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"module_account_balance&#92;""];</code>
   */
  int getModuleAccountBalanceCount();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin module_account_balance = 1 [json_name = "moduleAccountBalance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"module_account_balance&#92;""];</code>
   */
  java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getModuleAccountBalanceOrBuilderList();
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin module_account_balance = 1 [json_name = "moduleAccountBalance", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"module_account_balance&#92;""];</code>
   */
  com.cosmos.base.v1beta1.CoinOrBuilder getModuleAccountBalanceOrBuilder(
      int index);

  /**
   * <code>.lum.network.dfract.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"params&#92;""];</code>
   * @return Whether the params field is set.
   */
  boolean hasParams();
  /**
   * <code>.lum.network.dfract.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"params&#92;""];</code>
   * @return The params.
   */
  com.lum.network.dfract.Params getParams();
  /**
   * <code>.lum.network.dfract.Params params = 2 [json_name = "params", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"params&#92;""];</code>
   */
  com.lum.network.dfract.ParamsOrBuilder getParamsOrBuilder();

  /**
   * <code>repeated .lum.network.dfract.Deposit deposits_pending_withdrawal = 3 [json_name = "depositsPendingWithdrawal"];</code>
   */
  java.util.List<com.lum.network.dfract.Deposit> 
      getDepositsPendingWithdrawalList();
  /**
   * <code>repeated .lum.network.dfract.Deposit deposits_pending_withdrawal = 3 [json_name = "depositsPendingWithdrawal"];</code>
   */
  com.lum.network.dfract.Deposit getDepositsPendingWithdrawal(int index);
  /**
   * <code>repeated .lum.network.dfract.Deposit deposits_pending_withdrawal = 3 [json_name = "depositsPendingWithdrawal"];</code>
   */
  int getDepositsPendingWithdrawalCount();
  /**
   * <code>repeated .lum.network.dfract.Deposit deposits_pending_withdrawal = 3 [json_name = "depositsPendingWithdrawal"];</code>
   */
  java.util.List<? extends com.lum.network.dfract.DepositOrBuilder> 
      getDepositsPendingWithdrawalOrBuilderList();
  /**
   * <code>repeated .lum.network.dfract.Deposit deposits_pending_withdrawal = 3 [json_name = "depositsPendingWithdrawal"];</code>
   */
  com.lum.network.dfract.DepositOrBuilder getDepositsPendingWithdrawalOrBuilder(
      int index);

  /**
   * <code>repeated .lum.network.dfract.Deposit deposits_pending_mint = 4 [json_name = "depositsPendingMint"];</code>
   */
  java.util.List<com.lum.network.dfract.Deposit> 
      getDepositsPendingMintList();
  /**
   * <code>repeated .lum.network.dfract.Deposit deposits_pending_mint = 4 [json_name = "depositsPendingMint"];</code>
   */
  com.lum.network.dfract.Deposit getDepositsPendingMint(int index);
  /**
   * <code>repeated .lum.network.dfract.Deposit deposits_pending_mint = 4 [json_name = "depositsPendingMint"];</code>
   */
  int getDepositsPendingMintCount();
  /**
   * <code>repeated .lum.network.dfract.Deposit deposits_pending_mint = 4 [json_name = "depositsPendingMint"];</code>
   */
  java.util.List<? extends com.lum.network.dfract.DepositOrBuilder> 
      getDepositsPendingMintOrBuilderList();
  /**
   * <code>repeated .lum.network.dfract.Deposit deposits_pending_mint = 4 [json_name = "depositsPendingMint"];</code>
   */
  com.lum.network.dfract.DepositOrBuilder getDepositsPendingMintOrBuilder(
      int index);

  /**
   * <code>repeated .lum.network.dfract.Deposit deposits_minted = 5 [json_name = "depositsMinted"];</code>
   */
  java.util.List<com.lum.network.dfract.Deposit> 
      getDepositsMintedList();
  /**
   * <code>repeated .lum.network.dfract.Deposit deposits_minted = 5 [json_name = "depositsMinted"];</code>
   */
  com.lum.network.dfract.Deposit getDepositsMinted(int index);
  /**
   * <code>repeated .lum.network.dfract.Deposit deposits_minted = 5 [json_name = "depositsMinted"];</code>
   */
  int getDepositsMintedCount();
  /**
   * <code>repeated .lum.network.dfract.Deposit deposits_minted = 5 [json_name = "depositsMinted"];</code>
   */
  java.util.List<? extends com.lum.network.dfract.DepositOrBuilder> 
      getDepositsMintedOrBuilderList();
  /**
   * <code>repeated .lum.network.dfract.Deposit deposits_minted = 5 [json_name = "depositsMinted"];</code>
   */
  com.lum.network.dfract.DepositOrBuilder getDepositsMintedOrBuilder(
      int index);
}
