// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmwasm/wasm/v1/types.proto

package com.cosmwasm.wasm.v1;

/**
 * <pre>
 * AbsoluteTxPosition is a unique transaction position that allows for global
 * ordering of transactions.
 * </pre>
 *
 * Protobuf type {@code cosmwasm.wasm.v1.AbsoluteTxPosition}
 */
public final class AbsoluteTxPosition extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmwasm.wasm.v1.AbsoluteTxPosition)
    AbsoluteTxPositionOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AbsoluteTxPosition.newBuilder() to construct.
  private AbsoluteTxPosition(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AbsoluteTxPosition() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AbsoluteTxPosition();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmwasm.wasm.v1.TypesProto.internal_static_cosmwasm_wasm_v1_AbsoluteTxPosition_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmwasm.wasm.v1.TypesProto.internal_static_cosmwasm_wasm_v1_AbsoluteTxPosition_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmwasm.wasm.v1.AbsoluteTxPosition.class, com.cosmwasm.wasm.v1.AbsoluteTxPosition.Builder.class);
  }

  public static final int BLOCK_HEIGHT_FIELD_NUMBER = 1;
  private long blockHeight_ = 0L;
  /**
   * <pre>
   * BlockHeight is the block the contract was created at
   * </pre>
   *
   * <code>uint64 block_height = 1 [json_name = "blockHeight"];</code>
   * @return The blockHeight.
   */
  @java.lang.Override
  public long getBlockHeight() {
    return blockHeight_;
  }

  public static final int TX_INDEX_FIELD_NUMBER = 2;
  private long txIndex_ = 0L;
  /**
   * <pre>
   * TxIndex is a monotonic counter within the block (actual transaction index,
   * or gas consumed)
   * </pre>
   *
   * <code>uint64 tx_index = 2 [json_name = "txIndex"];</code>
   * @return The txIndex.
   */
  @java.lang.Override
  public long getTxIndex() {
    return txIndex_;
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
    if (blockHeight_ != 0L) {
      output.writeUInt64(1, blockHeight_);
    }
    if (txIndex_ != 0L) {
      output.writeUInt64(2, txIndex_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (blockHeight_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, blockHeight_);
    }
    if (txIndex_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, txIndex_);
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
    if (!(obj instanceof com.cosmwasm.wasm.v1.AbsoluteTxPosition)) {
      return super.equals(obj);
    }
    com.cosmwasm.wasm.v1.AbsoluteTxPosition other = (com.cosmwasm.wasm.v1.AbsoluteTxPosition) obj;

    if (getBlockHeight()
        != other.getBlockHeight()) return false;
    if (getTxIndex()
        != other.getTxIndex()) return false;
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
    hash = (37 * hash) + BLOCK_HEIGHT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getBlockHeight());
    hash = (37 * hash) + TX_INDEX_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTxIndex());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmwasm.wasm.v1.AbsoluteTxPosition parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmwasm.wasm.v1.AbsoluteTxPosition parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmwasm.wasm.v1.AbsoluteTxPosition parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmwasm.wasm.v1.AbsoluteTxPosition parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmwasm.wasm.v1.AbsoluteTxPosition parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmwasm.wasm.v1.AbsoluteTxPosition parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmwasm.wasm.v1.AbsoluteTxPosition parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmwasm.wasm.v1.AbsoluteTxPosition parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cosmwasm.wasm.v1.AbsoluteTxPosition parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cosmwasm.wasm.v1.AbsoluteTxPosition parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmwasm.wasm.v1.AbsoluteTxPosition parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmwasm.wasm.v1.AbsoluteTxPosition parseFrom(
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
  public static Builder newBuilder(com.cosmwasm.wasm.v1.AbsoluteTxPosition prototype) {
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
   * <pre>
   * AbsoluteTxPosition is a unique transaction position that allows for global
   * ordering of transactions.
   * </pre>
   *
   * Protobuf type {@code cosmwasm.wasm.v1.AbsoluteTxPosition}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmwasm.wasm.v1.AbsoluteTxPosition)
      com.cosmwasm.wasm.v1.AbsoluteTxPositionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmwasm.wasm.v1.TypesProto.internal_static_cosmwasm_wasm_v1_AbsoluteTxPosition_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmwasm.wasm.v1.TypesProto.internal_static_cosmwasm_wasm_v1_AbsoluteTxPosition_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmwasm.wasm.v1.AbsoluteTxPosition.class, com.cosmwasm.wasm.v1.AbsoluteTxPosition.Builder.class);
    }

    // Construct using com.cosmwasm.wasm.v1.AbsoluteTxPosition.newBuilder()
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
      blockHeight_ = 0L;
      txIndex_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmwasm.wasm.v1.TypesProto.internal_static_cosmwasm_wasm_v1_AbsoluteTxPosition_descriptor;
    }

    @java.lang.Override
    public com.cosmwasm.wasm.v1.AbsoluteTxPosition getDefaultInstanceForType() {
      return com.cosmwasm.wasm.v1.AbsoluteTxPosition.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmwasm.wasm.v1.AbsoluteTxPosition build() {
      com.cosmwasm.wasm.v1.AbsoluteTxPosition result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmwasm.wasm.v1.AbsoluteTxPosition buildPartial() {
      com.cosmwasm.wasm.v1.AbsoluteTxPosition result = new com.cosmwasm.wasm.v1.AbsoluteTxPosition(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cosmwasm.wasm.v1.AbsoluteTxPosition result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.blockHeight_ = blockHeight_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.txIndex_ = txIndex_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cosmwasm.wasm.v1.AbsoluteTxPosition) {
        return mergeFrom((com.cosmwasm.wasm.v1.AbsoluteTxPosition)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmwasm.wasm.v1.AbsoluteTxPosition other) {
      if (other == com.cosmwasm.wasm.v1.AbsoluteTxPosition.getDefaultInstance()) return this;
      if (other.getBlockHeight() != 0L) {
        setBlockHeight(other.getBlockHeight());
      }
      if (other.getTxIndex() != 0L) {
        setTxIndex(other.getTxIndex());
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
            case 8: {
              blockHeight_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 16: {
              txIndex_ = input.readUInt64();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
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

    private long blockHeight_ ;
    /**
     * <pre>
     * BlockHeight is the block the contract was created at
     * </pre>
     *
     * <code>uint64 block_height = 1 [json_name = "blockHeight"];</code>
     * @return The blockHeight.
     */
    @java.lang.Override
    public long getBlockHeight() {
      return blockHeight_;
    }
    /**
     * <pre>
     * BlockHeight is the block the contract was created at
     * </pre>
     *
     * <code>uint64 block_height = 1 [json_name = "blockHeight"];</code>
     * @param value The blockHeight to set.
     * @return This builder for chaining.
     */
    public Builder setBlockHeight(long value) {

      blockHeight_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * BlockHeight is the block the contract was created at
     * </pre>
     *
     * <code>uint64 block_height = 1 [json_name = "blockHeight"];</code>
     * @return This builder for chaining.
     */
    public Builder clearBlockHeight() {
      bitField0_ = (bitField0_ & ~0x00000001);
      blockHeight_ = 0L;
      onChanged();
      return this;
    }

    private long txIndex_ ;
    /**
     * <pre>
     * TxIndex is a monotonic counter within the block (actual transaction index,
     * or gas consumed)
     * </pre>
     *
     * <code>uint64 tx_index = 2 [json_name = "txIndex"];</code>
     * @return The txIndex.
     */
    @java.lang.Override
    public long getTxIndex() {
      return txIndex_;
    }
    /**
     * <pre>
     * TxIndex is a monotonic counter within the block (actual transaction index,
     * or gas consumed)
     * </pre>
     *
     * <code>uint64 tx_index = 2 [json_name = "txIndex"];</code>
     * @param value The txIndex to set.
     * @return This builder for chaining.
     */
    public Builder setTxIndex(long value) {

      txIndex_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * TxIndex is a monotonic counter within the block (actual transaction index,
     * or gas consumed)
     * </pre>
     *
     * <code>uint64 tx_index = 2 [json_name = "txIndex"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTxIndex() {
      bitField0_ = (bitField0_ & ~0x00000002);
      txIndex_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:cosmwasm.wasm.v1.AbsoluteTxPosition)
  }

  // @@protoc_insertion_point(class_scope:cosmwasm.wasm.v1.AbsoluteTxPosition)
  private static final com.cosmwasm.wasm.v1.AbsoluteTxPosition DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmwasm.wasm.v1.AbsoluteTxPosition();
  }

  public static com.cosmwasm.wasm.v1.AbsoluteTxPosition getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AbsoluteTxPosition>
      PARSER = new com.google.protobuf.AbstractParser<AbsoluteTxPosition>() {
    @java.lang.Override
    public AbsoluteTxPosition parsePartialFrom(
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

  public static com.google.protobuf.Parser<AbsoluteTxPosition> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AbsoluteTxPosition> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmwasm.wasm.v1.AbsoluteTxPosition getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

