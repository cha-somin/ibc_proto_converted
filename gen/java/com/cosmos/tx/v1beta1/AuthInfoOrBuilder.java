// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/tx/v1beta1/tx.proto

package com.cosmos.tx.v1beta1;

public interface AuthInfoOrBuilder extends
    // @@protoc_insertion_point(interface_extends:cosmos.tx.v1beta1.AuthInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * signer_infos defines the signing modes for the required signers. The number
   * and order of elements must match the required signers from TxBody's
   * messages. The first element is the primary signer and the one which pays
   * the fee.
   * </pre>
   *
   * <code>repeated .cosmos.tx.v1beta1.SignerInfo signer_infos = 1 [json_name = "signerInfos"];</code>
   */
  java.util.List<com.cosmos.tx.v1beta1.SignerInfo> 
      getSignerInfosList();
  /**
   * <pre>
   * signer_infos defines the signing modes for the required signers. The number
   * and order of elements must match the required signers from TxBody's
   * messages. The first element is the primary signer and the one which pays
   * the fee.
   * </pre>
   *
   * <code>repeated .cosmos.tx.v1beta1.SignerInfo signer_infos = 1 [json_name = "signerInfos"];</code>
   */
  com.cosmos.tx.v1beta1.SignerInfo getSignerInfos(int index);
  /**
   * <pre>
   * signer_infos defines the signing modes for the required signers. The number
   * and order of elements must match the required signers from TxBody's
   * messages. The first element is the primary signer and the one which pays
   * the fee.
   * </pre>
   *
   * <code>repeated .cosmos.tx.v1beta1.SignerInfo signer_infos = 1 [json_name = "signerInfos"];</code>
   */
  int getSignerInfosCount();
  /**
   * <pre>
   * signer_infos defines the signing modes for the required signers. The number
   * and order of elements must match the required signers from TxBody's
   * messages. The first element is the primary signer and the one which pays
   * the fee.
   * </pre>
   *
   * <code>repeated .cosmos.tx.v1beta1.SignerInfo signer_infos = 1 [json_name = "signerInfos"];</code>
   */
  java.util.List<? extends com.cosmos.tx.v1beta1.SignerInfoOrBuilder> 
      getSignerInfosOrBuilderList();
  /**
   * <pre>
   * signer_infos defines the signing modes for the required signers. The number
   * and order of elements must match the required signers from TxBody's
   * messages. The first element is the primary signer and the one which pays
   * the fee.
   * </pre>
   *
   * <code>repeated .cosmos.tx.v1beta1.SignerInfo signer_infos = 1 [json_name = "signerInfos"];</code>
   */
  com.cosmos.tx.v1beta1.SignerInfoOrBuilder getSignerInfosOrBuilder(
      int index);

  /**
   * <pre>
   * Fee is the fee and gas limit for the transaction. The first signer is the
   * primary signer and the one which pays the fee. The fee can be calculated
   * based on the cost of evaluating the body and doing signature verification
   * of the signers. This can be estimated via simulation.
   * </pre>
   *
   * <code>.cosmos.tx.v1beta1.Fee fee = 2 [json_name = "fee"];</code>
   * @return Whether the fee field is set.
   */
  boolean hasFee();
  /**
   * <pre>
   * Fee is the fee and gas limit for the transaction. The first signer is the
   * primary signer and the one which pays the fee. The fee can be calculated
   * based on the cost of evaluating the body and doing signature verification
   * of the signers. This can be estimated via simulation.
   * </pre>
   *
   * <code>.cosmos.tx.v1beta1.Fee fee = 2 [json_name = "fee"];</code>
   * @return The fee.
   */
  com.cosmos.tx.v1beta1.Fee getFee();
  /**
   * <pre>
   * Fee is the fee and gas limit for the transaction. The first signer is the
   * primary signer and the one which pays the fee. The fee can be calculated
   * based on the cost of evaluating the body and doing signature verification
   * of the signers. This can be estimated via simulation.
   * </pre>
   *
   * <code>.cosmos.tx.v1beta1.Fee fee = 2 [json_name = "fee"];</code>
   */
  com.cosmos.tx.v1beta1.FeeOrBuilder getFeeOrBuilder();

  /**
   * <pre>
   * Tip is the optional tip used for transactions fees paid in another denom.
   *
   * This field is ignored if the chain didn't enable tips, i.e. didn't add the
   * `TipDecorator` in its posthandler.
   *
   * Since: cosmos-sdk 0.46
   * </pre>
   *
   * <code>.cosmos.tx.v1beta1.Tip tip = 3 [json_name = "tip"];</code>
   * @return Whether the tip field is set.
   */
  boolean hasTip();
  /**
   * <pre>
   * Tip is the optional tip used for transactions fees paid in another denom.
   *
   * This field is ignored if the chain didn't enable tips, i.e. didn't add the
   * `TipDecorator` in its posthandler.
   *
   * Since: cosmos-sdk 0.46
   * </pre>
   *
   * <code>.cosmos.tx.v1beta1.Tip tip = 3 [json_name = "tip"];</code>
   * @return The tip.
   */
  com.cosmos.tx.v1beta1.Tip getTip();
  /**
   * <pre>
   * Tip is the optional tip used for transactions fees paid in another denom.
   *
   * This field is ignored if the chain didn't enable tips, i.e. didn't add the
   * `TipDecorator` in its posthandler.
   *
   * Since: cosmos-sdk 0.46
   * </pre>
   *
   * <code>.cosmos.tx.v1beta1.Tip tip = 3 [json_name = "tip"];</code>
   */
  com.cosmos.tx.v1beta1.TipOrBuilder getTipOrBuilder();
}
