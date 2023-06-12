// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ixo/claims/v1beta1/tx.proto

package com.ixo.claims.v1beta1;

public interface MsgCreateCollectionOrBuilder extends
    // @@protoc_insertion_point(interface_extends:ixo.claims.v1beta1.MsgCreateCollection)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * entity is the DID of the entity for which the claims are being created
   * </pre>
   *
   * <code>string entity = 1 [json_name = "entity"];</code>
   * @return The entity.
   */
  java.lang.String getEntity();
  /**
   * <pre>
   * entity is the DID of the entity for which the claims are being created
   * </pre>
   *
   * <code>string entity = 1 [json_name = "entity"];</code>
   * @return The bytes for entity.
   */
  com.google.protobuf.ByteString
      getEntityBytes();

  /**
   * <pre>
   * signer address
   * </pre>
   *
   * <code>string signer = 2 [json_name = "signer"];</code>
   * @return The signer.
   */
  java.lang.String getSigner();
  /**
   * <pre>
   * signer address
   * </pre>
   *
   * <code>string signer = 2 [json_name = "signer"];</code>
   * @return The bytes for signer.
   */
  com.google.protobuf.ByteString
      getSignerBytes();

  /**
   * <pre>
   * protocol is the DID of the claim protocol
   * </pre>
   *
   * <code>string protocol = 3 [json_name = "protocol"];</code>
   * @return The protocol.
   */
  java.lang.String getProtocol();
  /**
   * <pre>
   * protocol is the DID of the claim protocol
   * </pre>
   *
   * <code>string protocol = 3 [json_name = "protocol"];</code>
   * @return The bytes for protocol.
   */
  com.google.protobuf.ByteString
      getProtocolBytes();

  /**
   * <pre>
   * startDate is the date after which claims may be submitted
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_date = 4 [json_name = "startDate", (.gogoproto.stdtime) = true];</code>
   * @return Whether the startDate field is set.
   */
  boolean hasStartDate();
  /**
   * <pre>
   * startDate is the date after which claims may be submitted
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_date = 4 [json_name = "startDate", (.gogoproto.stdtime) = true];</code>
   * @return The startDate.
   */
  com.google.protobuf.Timestamp getStartDate();
  /**
   * <pre>
   * startDate is the date after which claims may be submitted
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_date = 4 [json_name = "startDate", (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getStartDateOrBuilder();

  /**
   * <pre>
   * endDate is the date after which no more claims may be submitted (no endDate
   * is allowed)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_date = 5 [json_name = "endDate", (.gogoproto.stdtime) = true];</code>
   * @return Whether the endDate field is set.
   */
  boolean hasEndDate();
  /**
   * <pre>
   * endDate is the date after which no more claims may be submitted (no endDate
   * is allowed)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_date = 5 [json_name = "endDate", (.gogoproto.stdtime) = true];</code>
   * @return The endDate.
   */
  com.google.protobuf.Timestamp getEndDate();
  /**
   * <pre>
   * endDate is the date after which no more claims may be submitted (no endDate
   * is allowed)
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_date = 5 [json_name = "endDate", (.gogoproto.stdtime) = true];</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndDateOrBuilder();

  /**
   * <pre>
   * quota is the maximum number of claims that may be submitted, 0 is unlimited
   * </pre>
   *
   * <code>uint64 quota = 6 [json_name = "quota"];</code>
   * @return The quota.
   */
  long getQuota();

  /**
   * <pre>
   * state is the current state of this Collection (open, paused, closed)
   * </pre>
   *
   * <code>.ixo.claims.v1beta1.CollectionState state = 7 [json_name = "state"];</code>
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   * <pre>
   * state is the current state of this Collection (open, paused, closed)
   * </pre>
   *
   * <code>.ixo.claims.v1beta1.CollectionState state = 7 [json_name = "state"];</code>
   * @return The state.
   */
  com.ixo.claims.v1beta1.CollectionState getState();

  /**
   * <pre>
   * payments is the amount paid for claim submission, evaluation, approval, or
   * rejection
   * </pre>
   *
   * <code>.ixo.claims.v1beta1.Payments payments = 8 [json_name = "payments"];</code>
   * @return Whether the payments field is set.
   */
  boolean hasPayments();
  /**
   * <pre>
   * payments is the amount paid for claim submission, evaluation, approval, or
   * rejection
   * </pre>
   *
   * <code>.ixo.claims.v1beta1.Payments payments = 8 [json_name = "payments"];</code>
   * @return The payments.
   */
  com.ixo.claims.v1beta1.Payments getPayments();
  /**
   * <pre>
   * payments is the amount paid for claim submission, evaluation, approval, or
   * rejection
   * </pre>
   *
   * <code>.ixo.claims.v1beta1.Payments payments = 8 [json_name = "payments"];</code>
   */
  com.ixo.claims.v1beta1.PaymentsOrBuilder getPaymentsOrBuilder();
}
