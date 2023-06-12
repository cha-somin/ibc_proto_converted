// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: neutron/interchainqueries/tx.proto

package com.neutron.interchainqueries;

/**
 * Protobuf type {@code neutron.interchainqueries.TxValue}
 */
public final class TxValue extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:neutron.interchainqueries.TxValue)
    TxValueOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TxValue.newBuilder() to construct.
  private TxValue(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TxValue() {
    data_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TxValue();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.neutron.interchainqueries.TxProto.internal_static_neutron_interchainqueries_TxValue_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.neutron.interchainqueries.TxProto.internal_static_neutron_interchainqueries_TxValue_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.neutron.interchainqueries.TxValue.class, com.neutron.interchainqueries.TxValue.Builder.class);
  }

  public static final int RESPONSE_FIELD_NUMBER = 1;
  private com.tendermint.abci.ResponseDeliverTx response_;
  /**
   * <code>.tendermint.abci.ResponseDeliverTx response = 1 [json_name = "response"];</code>
   * @return Whether the response field is set.
   */
  @java.lang.Override
  public boolean hasResponse() {
    return response_ != null;
  }
  /**
   * <code>.tendermint.abci.ResponseDeliverTx response = 1 [json_name = "response"];</code>
   * @return The response.
   */
  @java.lang.Override
  public com.tendermint.abci.ResponseDeliverTx getResponse() {
    return response_ == null ? com.tendermint.abci.ResponseDeliverTx.getDefaultInstance() : response_;
  }
  /**
   * <code>.tendermint.abci.ResponseDeliverTx response = 1 [json_name = "response"];</code>
   */
  @java.lang.Override
  public com.tendermint.abci.ResponseDeliverTxOrBuilder getResponseOrBuilder() {
    return response_ == null ? com.tendermint.abci.ResponseDeliverTx.getDefaultInstance() : response_;
  }

  public static final int DELIVERY_PROOF_FIELD_NUMBER = 2;
  private com.tendermint.crypto.Proof deliveryProof_;
  /**
   * <pre>
   * is the Merkle Proof which proves existence of response in block with height
   * next_block_header.Height
   * </pre>
   *
   * <code>.tendermint.crypto.Proof delivery_proof = 2 [json_name = "deliveryProof"];</code>
   * @return Whether the deliveryProof field is set.
   */
  @java.lang.Override
  public boolean hasDeliveryProof() {
    return deliveryProof_ != null;
  }
  /**
   * <pre>
   * is the Merkle Proof which proves existence of response in block with height
   * next_block_header.Height
   * </pre>
   *
   * <code>.tendermint.crypto.Proof delivery_proof = 2 [json_name = "deliveryProof"];</code>
   * @return The deliveryProof.
   */
  @java.lang.Override
  public com.tendermint.crypto.Proof getDeliveryProof() {
    return deliveryProof_ == null ? com.tendermint.crypto.Proof.getDefaultInstance() : deliveryProof_;
  }
  /**
   * <pre>
   * is the Merkle Proof which proves existence of response in block with height
   * next_block_header.Height
   * </pre>
   *
   * <code>.tendermint.crypto.Proof delivery_proof = 2 [json_name = "deliveryProof"];</code>
   */
  @java.lang.Override
  public com.tendermint.crypto.ProofOrBuilder getDeliveryProofOrBuilder() {
    return deliveryProof_ == null ? com.tendermint.crypto.Proof.getDefaultInstance() : deliveryProof_;
  }

  public static final int INCLUSION_PROOF_FIELD_NUMBER = 3;
  private com.tendermint.crypto.Proof inclusionProof_;
  /**
   * <pre>
   * is the Merkle Proof which proves existence of data in block with height
   * header.Height
   * </pre>
   *
   * <code>.tendermint.crypto.Proof inclusion_proof = 3 [json_name = "inclusionProof"];</code>
   * @return Whether the inclusionProof field is set.
   */
  @java.lang.Override
  public boolean hasInclusionProof() {
    return inclusionProof_ != null;
  }
  /**
   * <pre>
   * is the Merkle Proof which proves existence of data in block with height
   * header.Height
   * </pre>
   *
   * <code>.tendermint.crypto.Proof inclusion_proof = 3 [json_name = "inclusionProof"];</code>
   * @return The inclusionProof.
   */
  @java.lang.Override
  public com.tendermint.crypto.Proof getInclusionProof() {
    return inclusionProof_ == null ? com.tendermint.crypto.Proof.getDefaultInstance() : inclusionProof_;
  }
  /**
   * <pre>
   * is the Merkle Proof which proves existence of data in block with height
   * header.Height
   * </pre>
   *
   * <code>.tendermint.crypto.Proof inclusion_proof = 3 [json_name = "inclusionProof"];</code>
   */
  @java.lang.Override
  public com.tendermint.crypto.ProofOrBuilder getInclusionProofOrBuilder() {
    return inclusionProof_ == null ? com.tendermint.crypto.Proof.getDefaultInstance() : inclusionProof_;
  }

  public static final int DATA_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * is body of the transaction
   * </pre>
   *
   * <code>bytes data = 4 [json_name = "data"];</code>
   * @return The data.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getData() {
    return data_;
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (response_ != null) {
      output.writeMessage(1, getResponse());
    }
    if (deliveryProof_ != null) {
      output.writeMessage(2, getDeliveryProof());
    }
    if (inclusionProof_ != null) {
      output.writeMessage(3, getInclusionProof());
    }
    if (!data_.isEmpty()) {
      output.writeBytes(4, data_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (response_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getResponse());
    }
    if (deliveryProof_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getDeliveryProof());
    }
    if (inclusionProof_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getInclusionProof());
    }
    if (!data_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, data_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.neutron.interchainqueries.TxValue)) {
      return super.equals(obj);
    }
    com.neutron.interchainqueries.TxValue other = (com.neutron.interchainqueries.TxValue) obj;

    if (hasResponse() != other.hasResponse()) return false;
    if (hasResponse()) {
      if (!getResponse()
          .equals(other.getResponse())) return false;
    }
    if (hasDeliveryProof() != other.hasDeliveryProof()) return false;
    if (hasDeliveryProof()) {
      if (!getDeliveryProof()
          .equals(other.getDeliveryProof())) return false;
    }
    if (hasInclusionProof() != other.hasInclusionProof()) return false;
    if (hasInclusionProof()) {
      if (!getInclusionProof()
          .equals(other.getInclusionProof())) return false;
    }
    if (!getData()
        .equals(other.getData())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasResponse()) {
      hash = (37 * hash) + RESPONSE_FIELD_NUMBER;
      hash = (53 * hash) + getResponse().hashCode();
    }
    if (hasDeliveryProof()) {
      hash = (37 * hash) + DELIVERY_PROOF_FIELD_NUMBER;
      hash = (53 * hash) + getDeliveryProof().hashCode();
    }
    if (hasInclusionProof()) {
      hash = (37 * hash) + INCLUSION_PROOF_FIELD_NUMBER;
      hash = (53 * hash) + getInclusionProof().hashCode();
    }
    hash = (37 * hash) + DATA_FIELD_NUMBER;
    hash = (53 * hash) + getData().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.neutron.interchainqueries.TxValue parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.neutron.interchainqueries.TxValue parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.neutron.interchainqueries.TxValue parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.neutron.interchainqueries.TxValue parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.neutron.interchainqueries.TxValue parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.neutron.interchainqueries.TxValue parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.neutron.interchainqueries.TxValue parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.neutron.interchainqueries.TxValue parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.neutron.interchainqueries.TxValue parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.neutron.interchainqueries.TxValue parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.neutron.interchainqueries.TxValue parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.neutron.interchainqueries.TxValue parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.neutron.interchainqueries.TxValue prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code neutron.interchainqueries.TxValue}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:neutron.interchainqueries.TxValue)
      com.neutron.interchainqueries.TxValueOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.neutron.interchainqueries.TxProto.internal_static_neutron_interchainqueries_TxValue_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.neutron.interchainqueries.TxProto.internal_static_neutron_interchainqueries_TxValue_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.neutron.interchainqueries.TxValue.class, com.neutron.interchainqueries.TxValue.Builder.class);
    }

    // Construct using com.neutron.interchainqueries.TxValue.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      response_ = null;
      if (responseBuilder_ != null) {
        responseBuilder_.dispose();
        responseBuilder_ = null;
      }
      deliveryProof_ = null;
      if (deliveryProofBuilder_ != null) {
        deliveryProofBuilder_.dispose();
        deliveryProofBuilder_ = null;
      }
      inclusionProof_ = null;
      if (inclusionProofBuilder_ != null) {
        inclusionProofBuilder_.dispose();
        inclusionProofBuilder_ = null;
      }
      data_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.neutron.interchainqueries.TxProto.internal_static_neutron_interchainqueries_TxValue_descriptor;
    }

    @java.lang.Override
    public com.neutron.interchainqueries.TxValue getDefaultInstanceForType() {
      return com.neutron.interchainqueries.TxValue.getDefaultInstance();
    }

    @java.lang.Override
    public com.neutron.interchainqueries.TxValue build() {
      com.neutron.interchainqueries.TxValue result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.neutron.interchainqueries.TxValue buildPartial() {
      com.neutron.interchainqueries.TxValue result = new com.neutron.interchainqueries.TxValue(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.neutron.interchainqueries.TxValue result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.response_ = responseBuilder_ == null
            ? response_
            : responseBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.deliveryProof_ = deliveryProofBuilder_ == null
            ? deliveryProof_
            : deliveryProofBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.inclusionProof_ = inclusionProofBuilder_ == null
            ? inclusionProof_
            : inclusionProofBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.data_ = data_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.neutron.interchainqueries.TxValue) {
        return mergeFrom((com.neutron.interchainqueries.TxValue)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.neutron.interchainqueries.TxValue other) {
      if (other == com.neutron.interchainqueries.TxValue.getDefaultInstance()) return this;
      if (other.hasResponse()) {
        mergeResponse(other.getResponse());
      }
      if (other.hasDeliveryProof()) {
        mergeDeliveryProof(other.getDeliveryProof());
      }
      if (other.hasInclusionProof()) {
        mergeInclusionProof(other.getInclusionProof());
      }
      if (other.getData() != com.google.protobuf.ByteString.EMPTY) {
        setData(other.getData());
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getResponseFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getDeliveryProofFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              input.readMessage(
                  getInclusionProofFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
              break;
            } // case 26
            case 34: {
              data_ = input.readBytes();
              bitField0_ |= 0x00000008;
              break;
            } // case 34
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.tendermint.abci.ResponseDeliverTx response_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tendermint.abci.ResponseDeliverTx, com.tendermint.abci.ResponseDeliverTx.Builder, com.tendermint.abci.ResponseDeliverTxOrBuilder> responseBuilder_;
    /**
     * <code>.tendermint.abci.ResponseDeliverTx response = 1 [json_name = "response"];</code>
     * @return Whether the response field is set.
     */
    public boolean hasResponse() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.tendermint.abci.ResponseDeliverTx response = 1 [json_name = "response"];</code>
     * @return The response.
     */
    public com.tendermint.abci.ResponseDeliverTx getResponse() {
      if (responseBuilder_ == null) {
        return response_ == null ? com.tendermint.abci.ResponseDeliverTx.getDefaultInstance() : response_;
      } else {
        return responseBuilder_.getMessage();
      }
    }
    /**
     * <code>.tendermint.abci.ResponseDeliverTx response = 1 [json_name = "response"];</code>
     */
    public Builder setResponse(com.tendermint.abci.ResponseDeliverTx value) {
      if (responseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        response_ = value;
      } else {
        responseBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.abci.ResponseDeliverTx response = 1 [json_name = "response"];</code>
     */
    public Builder setResponse(
        com.tendermint.abci.ResponseDeliverTx.Builder builderForValue) {
      if (responseBuilder_ == null) {
        response_ = builderForValue.build();
      } else {
        responseBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.abci.ResponseDeliverTx response = 1 [json_name = "response"];</code>
     */
    public Builder mergeResponse(com.tendermint.abci.ResponseDeliverTx value) {
      if (responseBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          response_ != null &&
          response_ != com.tendermint.abci.ResponseDeliverTx.getDefaultInstance()) {
          getResponseBuilder().mergeFrom(value);
        } else {
          response_ = value;
        }
      } else {
        responseBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.abci.ResponseDeliverTx response = 1 [json_name = "response"];</code>
     */
    public Builder clearResponse() {
      bitField0_ = (bitField0_ & ~0x00000001);
      response_ = null;
      if (responseBuilder_ != null) {
        responseBuilder_.dispose();
        responseBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.tendermint.abci.ResponseDeliverTx response = 1 [json_name = "response"];</code>
     */
    public com.tendermint.abci.ResponseDeliverTx.Builder getResponseBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getResponseFieldBuilder().getBuilder();
    }
    /**
     * <code>.tendermint.abci.ResponseDeliverTx response = 1 [json_name = "response"];</code>
     */
    public com.tendermint.abci.ResponseDeliverTxOrBuilder getResponseOrBuilder() {
      if (responseBuilder_ != null) {
        return responseBuilder_.getMessageOrBuilder();
      } else {
        return response_ == null ?
            com.tendermint.abci.ResponseDeliverTx.getDefaultInstance() : response_;
      }
    }
    /**
     * <code>.tendermint.abci.ResponseDeliverTx response = 1 [json_name = "response"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tendermint.abci.ResponseDeliverTx, com.tendermint.abci.ResponseDeliverTx.Builder, com.tendermint.abci.ResponseDeliverTxOrBuilder> 
        getResponseFieldBuilder() {
      if (responseBuilder_ == null) {
        responseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tendermint.abci.ResponseDeliverTx, com.tendermint.abci.ResponseDeliverTx.Builder, com.tendermint.abci.ResponseDeliverTxOrBuilder>(
                getResponse(),
                getParentForChildren(),
                isClean());
        response_ = null;
      }
      return responseBuilder_;
    }

    private com.tendermint.crypto.Proof deliveryProof_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tendermint.crypto.Proof, com.tendermint.crypto.Proof.Builder, com.tendermint.crypto.ProofOrBuilder> deliveryProofBuilder_;
    /**
     * <pre>
     * is the Merkle Proof which proves existence of response in block with height
     * next_block_header.Height
     * </pre>
     *
     * <code>.tendermint.crypto.Proof delivery_proof = 2 [json_name = "deliveryProof"];</code>
     * @return Whether the deliveryProof field is set.
     */
    public boolean hasDeliveryProof() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * is the Merkle Proof which proves existence of response in block with height
     * next_block_header.Height
     * </pre>
     *
     * <code>.tendermint.crypto.Proof delivery_proof = 2 [json_name = "deliveryProof"];</code>
     * @return The deliveryProof.
     */
    public com.tendermint.crypto.Proof getDeliveryProof() {
      if (deliveryProofBuilder_ == null) {
        return deliveryProof_ == null ? com.tendermint.crypto.Proof.getDefaultInstance() : deliveryProof_;
      } else {
        return deliveryProofBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * is the Merkle Proof which proves existence of response in block with height
     * next_block_header.Height
     * </pre>
     *
     * <code>.tendermint.crypto.Proof delivery_proof = 2 [json_name = "deliveryProof"];</code>
     */
    public Builder setDeliveryProof(com.tendermint.crypto.Proof value) {
      if (deliveryProofBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        deliveryProof_ = value;
      } else {
        deliveryProofBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * is the Merkle Proof which proves existence of response in block with height
     * next_block_header.Height
     * </pre>
     *
     * <code>.tendermint.crypto.Proof delivery_proof = 2 [json_name = "deliveryProof"];</code>
     */
    public Builder setDeliveryProof(
        com.tendermint.crypto.Proof.Builder builderForValue) {
      if (deliveryProofBuilder_ == null) {
        deliveryProof_ = builderForValue.build();
      } else {
        deliveryProofBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * is the Merkle Proof which proves existence of response in block with height
     * next_block_header.Height
     * </pre>
     *
     * <code>.tendermint.crypto.Proof delivery_proof = 2 [json_name = "deliveryProof"];</code>
     */
    public Builder mergeDeliveryProof(com.tendermint.crypto.Proof value) {
      if (deliveryProofBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          deliveryProof_ != null &&
          deliveryProof_ != com.tendermint.crypto.Proof.getDefaultInstance()) {
          getDeliveryProofBuilder().mergeFrom(value);
        } else {
          deliveryProof_ = value;
        }
      } else {
        deliveryProofBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * is the Merkle Proof which proves existence of response in block with height
     * next_block_header.Height
     * </pre>
     *
     * <code>.tendermint.crypto.Proof delivery_proof = 2 [json_name = "deliveryProof"];</code>
     */
    public Builder clearDeliveryProof() {
      bitField0_ = (bitField0_ & ~0x00000002);
      deliveryProof_ = null;
      if (deliveryProofBuilder_ != null) {
        deliveryProofBuilder_.dispose();
        deliveryProofBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * is the Merkle Proof which proves existence of response in block with height
     * next_block_header.Height
     * </pre>
     *
     * <code>.tendermint.crypto.Proof delivery_proof = 2 [json_name = "deliveryProof"];</code>
     */
    public com.tendermint.crypto.Proof.Builder getDeliveryProofBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getDeliveryProofFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * is the Merkle Proof which proves existence of response in block with height
     * next_block_header.Height
     * </pre>
     *
     * <code>.tendermint.crypto.Proof delivery_proof = 2 [json_name = "deliveryProof"];</code>
     */
    public com.tendermint.crypto.ProofOrBuilder getDeliveryProofOrBuilder() {
      if (deliveryProofBuilder_ != null) {
        return deliveryProofBuilder_.getMessageOrBuilder();
      } else {
        return deliveryProof_ == null ?
            com.tendermint.crypto.Proof.getDefaultInstance() : deliveryProof_;
      }
    }
    /**
     * <pre>
     * is the Merkle Proof which proves existence of response in block with height
     * next_block_header.Height
     * </pre>
     *
     * <code>.tendermint.crypto.Proof delivery_proof = 2 [json_name = "deliveryProof"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tendermint.crypto.Proof, com.tendermint.crypto.Proof.Builder, com.tendermint.crypto.ProofOrBuilder> 
        getDeliveryProofFieldBuilder() {
      if (deliveryProofBuilder_ == null) {
        deliveryProofBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tendermint.crypto.Proof, com.tendermint.crypto.Proof.Builder, com.tendermint.crypto.ProofOrBuilder>(
                getDeliveryProof(),
                getParentForChildren(),
                isClean());
        deliveryProof_ = null;
      }
      return deliveryProofBuilder_;
    }

    private com.tendermint.crypto.Proof inclusionProof_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tendermint.crypto.Proof, com.tendermint.crypto.Proof.Builder, com.tendermint.crypto.ProofOrBuilder> inclusionProofBuilder_;
    /**
     * <pre>
     * is the Merkle Proof which proves existence of data in block with height
     * header.Height
     * </pre>
     *
     * <code>.tendermint.crypto.Proof inclusion_proof = 3 [json_name = "inclusionProof"];</code>
     * @return Whether the inclusionProof field is set.
     */
    public boolean hasInclusionProof() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <pre>
     * is the Merkle Proof which proves existence of data in block with height
     * header.Height
     * </pre>
     *
     * <code>.tendermint.crypto.Proof inclusion_proof = 3 [json_name = "inclusionProof"];</code>
     * @return The inclusionProof.
     */
    public com.tendermint.crypto.Proof getInclusionProof() {
      if (inclusionProofBuilder_ == null) {
        return inclusionProof_ == null ? com.tendermint.crypto.Proof.getDefaultInstance() : inclusionProof_;
      } else {
        return inclusionProofBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * is the Merkle Proof which proves existence of data in block with height
     * header.Height
     * </pre>
     *
     * <code>.tendermint.crypto.Proof inclusion_proof = 3 [json_name = "inclusionProof"];</code>
     */
    public Builder setInclusionProof(com.tendermint.crypto.Proof value) {
      if (inclusionProofBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        inclusionProof_ = value;
      } else {
        inclusionProofBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * is the Merkle Proof which proves existence of data in block with height
     * header.Height
     * </pre>
     *
     * <code>.tendermint.crypto.Proof inclusion_proof = 3 [json_name = "inclusionProof"];</code>
     */
    public Builder setInclusionProof(
        com.tendermint.crypto.Proof.Builder builderForValue) {
      if (inclusionProofBuilder_ == null) {
        inclusionProof_ = builderForValue.build();
      } else {
        inclusionProofBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * is the Merkle Proof which proves existence of data in block with height
     * header.Height
     * </pre>
     *
     * <code>.tendermint.crypto.Proof inclusion_proof = 3 [json_name = "inclusionProof"];</code>
     */
    public Builder mergeInclusionProof(com.tendermint.crypto.Proof value) {
      if (inclusionProofBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          inclusionProof_ != null &&
          inclusionProof_ != com.tendermint.crypto.Proof.getDefaultInstance()) {
          getInclusionProofBuilder().mergeFrom(value);
        } else {
          inclusionProof_ = value;
        }
      } else {
        inclusionProofBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * is the Merkle Proof which proves existence of data in block with height
     * header.Height
     * </pre>
     *
     * <code>.tendermint.crypto.Proof inclusion_proof = 3 [json_name = "inclusionProof"];</code>
     */
    public Builder clearInclusionProof() {
      bitField0_ = (bitField0_ & ~0x00000004);
      inclusionProof_ = null;
      if (inclusionProofBuilder_ != null) {
        inclusionProofBuilder_.dispose();
        inclusionProofBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * is the Merkle Proof which proves existence of data in block with height
     * header.Height
     * </pre>
     *
     * <code>.tendermint.crypto.Proof inclusion_proof = 3 [json_name = "inclusionProof"];</code>
     */
    public com.tendermint.crypto.Proof.Builder getInclusionProofBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getInclusionProofFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * is the Merkle Proof which proves existence of data in block with height
     * header.Height
     * </pre>
     *
     * <code>.tendermint.crypto.Proof inclusion_proof = 3 [json_name = "inclusionProof"];</code>
     */
    public com.tendermint.crypto.ProofOrBuilder getInclusionProofOrBuilder() {
      if (inclusionProofBuilder_ != null) {
        return inclusionProofBuilder_.getMessageOrBuilder();
      } else {
        return inclusionProof_ == null ?
            com.tendermint.crypto.Proof.getDefaultInstance() : inclusionProof_;
      }
    }
    /**
     * <pre>
     * is the Merkle Proof which proves existence of data in block with height
     * header.Height
     * </pre>
     *
     * <code>.tendermint.crypto.Proof inclusion_proof = 3 [json_name = "inclusionProof"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.tendermint.crypto.Proof, com.tendermint.crypto.Proof.Builder, com.tendermint.crypto.ProofOrBuilder> 
        getInclusionProofFieldBuilder() {
      if (inclusionProofBuilder_ == null) {
        inclusionProofBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.tendermint.crypto.Proof, com.tendermint.crypto.Proof.Builder, com.tendermint.crypto.ProofOrBuilder>(
                getInclusionProof(),
                getParentForChildren(),
                isClean());
        inclusionProof_ = null;
      }
      return inclusionProofBuilder_;
    }

    private com.google.protobuf.ByteString data_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * is body of the transaction
     * </pre>
     *
     * <code>bytes data = 4 [json_name = "data"];</code>
     * @return The data.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getData() {
      return data_;
    }
    /**
     * <pre>
     * is body of the transaction
     * </pre>
     *
     * <code>bytes data = 4 [json_name = "data"];</code>
     * @param value The data to set.
     * @return This builder for chaining.
     */
    public Builder setData(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      data_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * is body of the transaction
     * </pre>
     *
     * <code>bytes data = 4 [json_name = "data"];</code>
     * @return This builder for chaining.
     */
    public Builder clearData() {
      bitField0_ = (bitField0_ & ~0x00000008);
      data_ = getDefaultInstance().getData();
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:neutron.interchainqueries.TxValue)
  }

  // @@protoc_insertion_point(class_scope:neutron.interchainqueries.TxValue)
  private static final com.neutron.interchainqueries.TxValue DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.neutron.interchainqueries.TxValue();
  }

  public static com.neutron.interchainqueries.TxValue getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TxValue>
      PARSER = new com.google.protobuf.AbstractParser<TxValue>() {
    @java.lang.Override
    public TxValue parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<TxValue> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TxValue> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.neutron.interchainqueries.TxValue getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

