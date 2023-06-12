// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gravity/v1/pool.proto

package com.gravity.v1;

/**
 * Protobuf type {@code gravity.v1.BatchFees}
 */
public final class BatchFees extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:gravity.v1.BatchFees)
    BatchFeesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BatchFees.newBuilder() to construct.
  private BatchFees(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BatchFees() {
    token_ = "";
    totalFees_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BatchFees();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.gravity.v1.PoolProto.internal_static_gravity_v1_BatchFees_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gravity.v1.PoolProto.internal_static_gravity_v1_BatchFees_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gravity.v1.BatchFees.class, com.gravity.v1.BatchFees.Builder.class);
  }

  public static final int TOKEN_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object token_ = "";
  /**
   * <code>string token = 1 [json_name = "token"];</code>
   * @return The token.
   */
  @java.lang.Override
  public java.lang.String getToken() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      token_ = s;
      return s;
    }
  }
  /**
   * <code>string token = 1 [json_name = "token"];</code>
   * @return The bytes for token.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTokenBytes() {
    java.lang.Object ref = token_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      token_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TOTAL_FEES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object totalFees_ = "";
  /**
   * <code>string total_fees = 2 [json_name = "totalFees", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The totalFees.
   */
  @java.lang.Override
  public java.lang.String getTotalFees() {
    java.lang.Object ref = totalFees_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      totalFees_ = s;
      return s;
    }
  }
  /**
   * <code>string total_fees = 2 [json_name = "totalFees", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
   * @return The bytes for totalFees.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getTotalFeesBytes() {
    java.lang.Object ref = totalFees_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      totalFees_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TX_COUNT_FIELD_NUMBER = 3;
  private long txCount_ = 0L;
  /**
   * <code>uint64 tx_count = 3 [json_name = "txCount"];</code>
   * @return The txCount.
   */
  @java.lang.Override
  public long getTxCount() {
    return txCount_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(token_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, token_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(totalFees_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, totalFees_);
    }
    if (txCount_ != 0L) {
      output.writeUInt64(3, txCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(token_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, token_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(totalFees_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, totalFees_);
    }
    if (txCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(3, txCount_);
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
    if (!(obj instanceof com.gravity.v1.BatchFees)) {
      return super.equals(obj);
    }
    com.gravity.v1.BatchFees other = (com.gravity.v1.BatchFees) obj;

    if (!getToken()
        .equals(other.getToken())) return false;
    if (!getTotalFees()
        .equals(other.getTotalFees())) return false;
    if (getTxCount()
        != other.getTxCount()) return false;
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
    hash = (37 * hash) + TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getToken().hashCode();
    hash = (37 * hash) + TOTAL_FEES_FIELD_NUMBER;
    hash = (53 * hash) + getTotalFees().hashCode();
    hash = (37 * hash) + TX_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTxCount());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.gravity.v1.BatchFees parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gravity.v1.BatchFees parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gravity.v1.BatchFees parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gravity.v1.BatchFees parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gravity.v1.BatchFees parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gravity.v1.BatchFees parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gravity.v1.BatchFees parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gravity.v1.BatchFees parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.gravity.v1.BatchFees parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.gravity.v1.BatchFees parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.gravity.v1.BatchFees parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gravity.v1.BatchFees parseFrom(
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
  public static Builder newBuilder(com.gravity.v1.BatchFees prototype) {
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
   * Protobuf type {@code gravity.v1.BatchFees}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:gravity.v1.BatchFees)
      com.gravity.v1.BatchFeesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gravity.v1.PoolProto.internal_static_gravity_v1_BatchFees_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gravity.v1.PoolProto.internal_static_gravity_v1_BatchFees_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gravity.v1.BatchFees.class, com.gravity.v1.BatchFees.Builder.class);
    }

    // Construct using com.gravity.v1.BatchFees.newBuilder()
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
      token_ = "";
      totalFees_ = "";
      txCount_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gravity.v1.PoolProto.internal_static_gravity_v1_BatchFees_descriptor;
    }

    @java.lang.Override
    public com.gravity.v1.BatchFees getDefaultInstanceForType() {
      return com.gravity.v1.BatchFees.getDefaultInstance();
    }

    @java.lang.Override
    public com.gravity.v1.BatchFees build() {
      com.gravity.v1.BatchFees result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.gravity.v1.BatchFees buildPartial() {
      com.gravity.v1.BatchFees result = new com.gravity.v1.BatchFees(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.gravity.v1.BatchFees result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.token_ = token_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.totalFees_ = totalFees_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.txCount_ = txCount_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.gravity.v1.BatchFees) {
        return mergeFrom((com.gravity.v1.BatchFees)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gravity.v1.BatchFees other) {
      if (other == com.gravity.v1.BatchFees.getDefaultInstance()) return this;
      if (!other.getToken().isEmpty()) {
        token_ = other.token_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getTotalFees().isEmpty()) {
        totalFees_ = other.totalFees_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getTxCount() != 0L) {
        setTxCount(other.getTxCount());
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
              token_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              totalFees_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              txCount_ = input.readUInt64();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
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

    private java.lang.Object token_ = "";
    /**
     * <code>string token = 1 [json_name = "token"];</code>
     * @return The token.
     */
    public java.lang.String getToken() {
      java.lang.Object ref = token_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        token_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string token = 1 [json_name = "token"];</code>
     * @return The bytes for token.
     */
    public com.google.protobuf.ByteString
        getTokenBytes() {
      java.lang.Object ref = token_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        token_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string token = 1 [json_name = "token"];</code>
     * @param value The token to set.
     * @return This builder for chaining.
     */
    public Builder setToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      token_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string token = 1 [json_name = "token"];</code>
     * @return This builder for chaining.
     */
    public Builder clearToken() {
      token_ = getDefaultInstance().getToken();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string token = 1 [json_name = "token"];</code>
     * @param value The bytes for token to set.
     * @return This builder for chaining.
     */
    public Builder setTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      token_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object totalFees_ = "";
    /**
     * <code>string total_fees = 2 [json_name = "totalFees", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The totalFees.
     */
    public java.lang.String getTotalFees() {
      java.lang.Object ref = totalFees_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        totalFees_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string total_fees = 2 [json_name = "totalFees", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return The bytes for totalFees.
     */
    public com.google.protobuf.ByteString
        getTotalFeesBytes() {
      java.lang.Object ref = totalFees_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        totalFees_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string total_fees = 2 [json_name = "totalFees", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The totalFees to set.
     * @return This builder for chaining.
     */
    public Builder setTotalFees(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      totalFees_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string total_fees = 2 [json_name = "totalFees", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTotalFees() {
      totalFees_ = getDefaultInstance().getTotalFees();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string total_fees = 2 [json_name = "totalFees", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "github.com/cosmos/cosmos-sdk/types.Int"];</code>
     * @param value The bytes for totalFees to set.
     * @return This builder for chaining.
     */
    public Builder setTotalFeesBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      totalFees_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private long txCount_ ;
    /**
     * <code>uint64 tx_count = 3 [json_name = "txCount"];</code>
     * @return The txCount.
     */
    @java.lang.Override
    public long getTxCount() {
      return txCount_;
    }
    /**
     * <code>uint64 tx_count = 3 [json_name = "txCount"];</code>
     * @param value The txCount to set.
     * @return This builder for chaining.
     */
    public Builder setTxCount(long value) {

      txCount_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 tx_count = 3 [json_name = "txCount"];</code>
     * @return This builder for chaining.
     */
    public Builder clearTxCount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      txCount_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:gravity.v1.BatchFees)
  }

  // @@protoc_insertion_point(class_scope:gravity.v1.BatchFees)
  private static final com.gravity.v1.BatchFees DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gravity.v1.BatchFees();
  }

  public static com.gravity.v1.BatchFees getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchFees>
      PARSER = new com.google.protobuf.AbstractParser<BatchFees>() {
    @java.lang.Override
    public BatchFees parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchFees> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchFees> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.gravity.v1.BatchFees getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

