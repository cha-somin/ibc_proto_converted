// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stafihub/ledger/query.proto

package com.stafihub.stafihub.ledger;

/**
 * Protobuf type {@code stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest}
 */
public final class QueryPoolUnbondNextSequenceRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest)
    QueryPoolUnbondNextSequenceRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryPoolUnbondNextSequenceRequest.newBuilder() to construct.
  private QueryPoolUnbondNextSequenceRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryPoolUnbondNextSequenceRequest() {
    denom_ = "";
    pool_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryPoolUnbondNextSequenceRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.stafihub.stafihub.ledger.QueryProto.internal_static_stafihub_stafihub_ledger_QueryPoolUnbondNextSequenceRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.stafihub.stafihub.ledger.QueryProto.internal_static_stafihub_stafihub_ledger_QueryPoolUnbondNextSequenceRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest.class, com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest.Builder.class);
  }

  public static final int DENOM_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object denom_ = "";
  /**
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The denom.
   */
  @java.lang.Override
  public java.lang.String getDenom() {
    java.lang.Object ref = denom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      denom_ = s;
      return s;
    }
  }
  /**
   * <code>string denom = 1 [json_name = "denom"];</code>
   * @return The bytes for denom.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDenomBytes() {
    java.lang.Object ref = denom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      denom_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int POOL_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object pool_ = "";
  /**
   * <code>string pool = 2 [json_name = "pool"];</code>
   * @return The pool.
   */
  @java.lang.Override
  public java.lang.String getPool() {
    java.lang.Object ref = pool_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pool_ = s;
      return s;
    }
  }
  /**
   * <code>string pool = 2 [json_name = "pool"];</code>
   * @return The bytes for pool.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getPoolBytes() {
    java.lang.Object ref = pool_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      pool_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UNLOCKERA_FIELD_NUMBER = 3;
  private int unlockEra_ = 0;
  /**
   * <code>uint32 unlockEra = 3 [json_name = "unlockEra"];</code>
   * @return The unlockEra.
   */
  @java.lang.Override
  public int getUnlockEra() {
    return unlockEra_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, denom_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pool_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, pool_);
    }
    if (unlockEra_ != 0) {
      output.writeUInt32(3, unlockEra_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, denom_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(pool_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, pool_);
    }
    if (unlockEra_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, unlockEra_);
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
    if (!(obj instanceof com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest)) {
      return super.equals(obj);
    }
    com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest other = (com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest) obj;

    if (!getDenom()
        .equals(other.getDenom())) return false;
    if (!getPool()
        .equals(other.getPool())) return false;
    if (getUnlockEra()
        != other.getUnlockEra()) return false;
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
    hash = (37 * hash) + DENOM_FIELD_NUMBER;
    hash = (53 * hash) + getDenom().hashCode();
    hash = (37 * hash) + POOL_FIELD_NUMBER;
    hash = (53 * hash) + getPool().hashCode();
    hash = (37 * hash) + UNLOCKERA_FIELD_NUMBER;
    hash = (53 * hash) + getUnlockEra();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest parseFrom(
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
  public static Builder newBuilder(com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest prototype) {
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
   * Protobuf type {@code stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest)
      com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stafihub.stafihub.ledger.QueryProto.internal_static_stafihub_stafihub_ledger_QueryPoolUnbondNextSequenceRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stafihub.stafihub.ledger.QueryProto.internal_static_stafihub_stafihub_ledger_QueryPoolUnbondNextSequenceRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest.class, com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest.Builder.class);
    }

    // Construct using com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest.newBuilder()
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
      denom_ = "";
      pool_ = "";
      unlockEra_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.stafihub.stafihub.ledger.QueryProto.internal_static_stafihub_stafihub_ledger_QueryPoolUnbondNextSequenceRequest_descriptor;
    }

    @java.lang.Override
    public com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest getDefaultInstanceForType() {
      return com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest build() {
      com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest buildPartial() {
      com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest result = new com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.denom_ = denom_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pool_ = pool_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.unlockEra_ = unlockEra_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest) {
        return mergeFrom((com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest other) {
      if (other == com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest.getDefaultInstance()) return this;
      if (!other.getDenom().isEmpty()) {
        denom_ = other.denom_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getPool().isEmpty()) {
        pool_ = other.pool_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getUnlockEra() != 0) {
        setUnlockEra(other.getUnlockEra());
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
              denom_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              pool_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 24: {
              unlockEra_ = input.readUInt32();
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

    private java.lang.Object denom_ = "";
    /**
     * <code>string denom = 1 [json_name = "denom"];</code>
     * @return The denom.
     */
    public java.lang.String getDenom() {
      java.lang.Object ref = denom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        denom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string denom = 1 [json_name = "denom"];</code>
     * @return The bytes for denom.
     */
    public com.google.protobuf.ByteString
        getDenomBytes() {
      java.lang.Object ref = denom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        denom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string denom = 1 [json_name = "denom"];</code>
     * @param value The denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenom(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      denom_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string denom = 1 [json_name = "denom"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDenom() {
      denom_ = getDefaultInstance().getDenom();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string denom = 1 [json_name = "denom"];</code>
     * @param value The bytes for denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      denom_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object pool_ = "";
    /**
     * <code>string pool = 2 [json_name = "pool"];</code>
     * @return The pool.
     */
    public java.lang.String getPool() {
      java.lang.Object ref = pool_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pool_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string pool = 2 [json_name = "pool"];</code>
     * @return The bytes for pool.
     */
    public com.google.protobuf.ByteString
        getPoolBytes() {
      java.lang.Object ref = pool_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        pool_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string pool = 2 [json_name = "pool"];</code>
     * @param value The pool to set.
     * @return This builder for chaining.
     */
    public Builder setPool(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      pool_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string pool = 2 [json_name = "pool"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPool() {
      pool_ = getDefaultInstance().getPool();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string pool = 2 [json_name = "pool"];</code>
     * @param value The bytes for pool to set.
     * @return This builder for chaining.
     */
    public Builder setPoolBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      pool_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int unlockEra_ ;
    /**
     * <code>uint32 unlockEra = 3 [json_name = "unlockEra"];</code>
     * @return The unlockEra.
     */
    @java.lang.Override
    public int getUnlockEra() {
      return unlockEra_;
    }
    /**
     * <code>uint32 unlockEra = 3 [json_name = "unlockEra"];</code>
     * @param value The unlockEra to set.
     * @return This builder for chaining.
     */
    public Builder setUnlockEra(int value) {

      unlockEra_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 unlockEra = 3 [json_name = "unlockEra"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUnlockEra() {
      bitField0_ = (bitField0_ & ~0x00000004);
      unlockEra_ = 0;
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


    // @@protoc_insertion_point(builder_scope:stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest)
  }

  // @@protoc_insertion_point(class_scope:stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest)
  private static final com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest();
  }

  public static com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryPoolUnbondNextSequenceRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryPoolUnbondNextSequenceRequest>() {
    @java.lang.Override
    public QueryPoolUnbondNextSequenceRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryPoolUnbondNextSequenceRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryPoolUnbondNextSequenceRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.stafihub.stafihub.ledger.QueryPoolUnbondNextSequenceRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

