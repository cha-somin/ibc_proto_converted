// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/evm/v1beta1/query.proto

package com.axelar.evm.v1beta1;

/**
 * Protobuf type {@code axelar.evm.v1beta1.QueryDepositStateParams}
 */
@java.lang.Deprecated public final class QueryDepositStateParams extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:axelar.evm.v1beta1.QueryDepositStateParams)
    QueryDepositStateParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryDepositStateParams.newBuilder() to construct.
  private QueryDepositStateParams(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryDepositStateParams() {
    txId_ = com.google.protobuf.ByteString.EMPTY;
    burnerAddress_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryDepositStateParams();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.axelar.evm.v1beta1.QueryProto.internal_static_axelar_evm_v1beta1_QueryDepositStateParams_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.axelar.evm.v1beta1.QueryProto.internal_static_axelar_evm_v1beta1_QueryDepositStateParams_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.axelar.evm.v1beta1.QueryDepositStateParams.class, com.axelar.evm.v1beta1.QueryDepositStateParams.Builder.class);
  }

  public static final int TX_ID_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString txId_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes tx_id = 1 [json_name = "txId", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Hash", (.gogoproto.customname) = "TxID"];</code>
   * @return The txId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTxId() {
    return txId_;
  }

  public static final int BURNER_ADDRESS_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString burnerAddress_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes burner_address = 2 [json_name = "burnerAddress", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Address"];</code>
   * @return The burnerAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getBurnerAddress() {
    return burnerAddress_;
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
    if (!txId_.isEmpty()) {
      output.writeBytes(1, txId_);
    }
    if (!burnerAddress_.isEmpty()) {
      output.writeBytes(2, burnerAddress_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!txId_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, txId_);
    }
    if (!burnerAddress_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(2, burnerAddress_);
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
    if (!(obj instanceof com.axelar.evm.v1beta1.QueryDepositStateParams)) {
      return super.equals(obj);
    }
    com.axelar.evm.v1beta1.QueryDepositStateParams other = (com.axelar.evm.v1beta1.QueryDepositStateParams) obj;

    if (!getTxId()
        .equals(other.getTxId())) return false;
    if (!getBurnerAddress()
        .equals(other.getBurnerAddress())) return false;
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
    hash = (37 * hash) + TX_ID_FIELD_NUMBER;
    hash = (53 * hash) + getTxId().hashCode();
    hash = (37 * hash) + BURNER_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getBurnerAddress().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.axelar.evm.v1beta1.QueryDepositStateParams parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.evm.v1beta1.QueryDepositStateParams parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.evm.v1beta1.QueryDepositStateParams parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.evm.v1beta1.QueryDepositStateParams parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.evm.v1beta1.QueryDepositStateParams parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.evm.v1beta1.QueryDepositStateParams parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.evm.v1beta1.QueryDepositStateParams parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.evm.v1beta1.QueryDepositStateParams parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.axelar.evm.v1beta1.QueryDepositStateParams parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.axelar.evm.v1beta1.QueryDepositStateParams parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.axelar.evm.v1beta1.QueryDepositStateParams parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.evm.v1beta1.QueryDepositStateParams parseFrom(
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
  public static Builder newBuilder(com.axelar.evm.v1beta1.QueryDepositStateParams prototype) {
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
   * Protobuf type {@code axelar.evm.v1beta1.QueryDepositStateParams}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:axelar.evm.v1beta1.QueryDepositStateParams)
      com.axelar.evm.v1beta1.QueryDepositStateParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.axelar.evm.v1beta1.QueryProto.internal_static_axelar_evm_v1beta1_QueryDepositStateParams_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.axelar.evm.v1beta1.QueryProto.internal_static_axelar_evm_v1beta1_QueryDepositStateParams_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.axelar.evm.v1beta1.QueryDepositStateParams.class, com.axelar.evm.v1beta1.QueryDepositStateParams.Builder.class);
    }

    // Construct using com.axelar.evm.v1beta1.QueryDepositStateParams.newBuilder()
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
      txId_ = com.google.protobuf.ByteString.EMPTY;
      burnerAddress_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.axelar.evm.v1beta1.QueryProto.internal_static_axelar_evm_v1beta1_QueryDepositStateParams_descriptor;
    }

    @java.lang.Override
    public com.axelar.evm.v1beta1.QueryDepositStateParams getDefaultInstanceForType() {
      return com.axelar.evm.v1beta1.QueryDepositStateParams.getDefaultInstance();
    }

    @java.lang.Override
    public com.axelar.evm.v1beta1.QueryDepositStateParams build() {
      com.axelar.evm.v1beta1.QueryDepositStateParams result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.axelar.evm.v1beta1.QueryDepositStateParams buildPartial() {
      com.axelar.evm.v1beta1.QueryDepositStateParams result = new com.axelar.evm.v1beta1.QueryDepositStateParams(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.axelar.evm.v1beta1.QueryDepositStateParams result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.txId_ = txId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.burnerAddress_ = burnerAddress_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.axelar.evm.v1beta1.QueryDepositStateParams) {
        return mergeFrom((com.axelar.evm.v1beta1.QueryDepositStateParams)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.axelar.evm.v1beta1.QueryDepositStateParams other) {
      if (other == com.axelar.evm.v1beta1.QueryDepositStateParams.getDefaultInstance()) return this;
      if (other.getTxId() != com.google.protobuf.ByteString.EMPTY) {
        setTxId(other.getTxId());
      }
      if (other.getBurnerAddress() != com.google.protobuf.ByteString.EMPTY) {
        setBurnerAddress(other.getBurnerAddress());
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
              txId_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              burnerAddress_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private com.google.protobuf.ByteString txId_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes tx_id = 1 [json_name = "txId", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Hash", (.gogoproto.customname) = "TxID"];</code>
     * @return The txId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getTxId() {
      return txId_;
    }
    /**
     * <code>bytes tx_id = 1 [json_name = "txId", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Hash", (.gogoproto.customname) = "TxID"];</code>
     * @param value The txId to set.
     * @return This builder for chaining.
     */
    public Builder setTxId(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      txId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bytes tx_id = 1 [json_name = "txId", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Hash", (.gogoproto.customname) = "TxID"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTxId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      txId_ = getDefaultInstance().getTxId();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString burnerAddress_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes burner_address = 2 [json_name = "burnerAddress", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Address"];</code>
     * @return The burnerAddress.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getBurnerAddress() {
      return burnerAddress_;
    }
    /**
     * <code>bytes burner_address = 2 [json_name = "burnerAddress", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Address"];</code>
     * @param value The burnerAddress to set.
     * @return This builder for chaining.
     */
    public Builder setBurnerAddress(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      burnerAddress_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bytes burner_address = 2 [json_name = "burnerAddress", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Address"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBurnerAddress() {
      bitField0_ = (bitField0_ & ~0x00000002);
      burnerAddress_ = getDefaultInstance().getBurnerAddress();
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


    // @@protoc_insertion_point(builder_scope:axelar.evm.v1beta1.QueryDepositStateParams)
  }

  // @@protoc_insertion_point(class_scope:axelar.evm.v1beta1.QueryDepositStateParams)
  private static final com.axelar.evm.v1beta1.QueryDepositStateParams DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.axelar.evm.v1beta1.QueryDepositStateParams();
  }

  public static com.axelar.evm.v1beta1.QueryDepositStateParams getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryDepositStateParams>
      PARSER = new com.google.protobuf.AbstractParser<QueryDepositStateParams>() {
    @java.lang.Override
    public QueryDepositStateParams parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryDepositStateParams> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryDepositStateParams> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.axelar.evm.v1beta1.QueryDepositStateParams getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

