// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: em/buyback/v1/genesis.proto

package com.em.buyback.v1;

/**
 * Protobuf type {@code em.buyback.v1.GenesisState}
 */
public final class GenesisState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:em.buyback.v1.GenesisState)
    GenesisStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenesisState.newBuilder() to construct.
  private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenesisState() {
    interval_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenesisState();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.em.buyback.v1.GenesisProto.internal_static_em_buyback_v1_GenesisState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.em.buyback.v1.GenesisProto.internal_static_em_buyback_v1_GenesisState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.em.buyback.v1.GenesisState.class, com.em.buyback.v1.GenesisState.Builder.class);
  }

  public static final int INTERVAL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object interval_ = "";
  /**
   * <code>string interval = 1 [json_name = "interval", (.gogoproto.customname) = "Interval", (.gogoproto.moretags) = "yaml:&#92;"interval&#92;""];</code>
   * @return The interval.
   */
  @java.lang.Override
  public java.lang.String getInterval() {
    java.lang.Object ref = interval_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      interval_ = s;
      return s;
    }
  }
  /**
   * <code>string interval = 1 [json_name = "interval", (.gogoproto.customname) = "Interval", (.gogoproto.moretags) = "yaml:&#92;"interval&#92;""];</code>
   * @return The bytes for interval.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getIntervalBytes() {
    java.lang.Object ref = interval_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      interval_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(interval_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, interval_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(interval_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, interval_);
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
    if (!(obj instanceof com.em.buyback.v1.GenesisState)) {
      return super.equals(obj);
    }
    com.em.buyback.v1.GenesisState other = (com.em.buyback.v1.GenesisState) obj;

    if (!getInterval()
        .equals(other.getInterval())) return false;
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
    hash = (37 * hash) + INTERVAL_FIELD_NUMBER;
    hash = (53 * hash) + getInterval().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.em.buyback.v1.GenesisState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.em.buyback.v1.GenesisState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.em.buyback.v1.GenesisState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.em.buyback.v1.GenesisState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.em.buyback.v1.GenesisState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.em.buyback.v1.GenesisState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.em.buyback.v1.GenesisState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.em.buyback.v1.GenesisState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.em.buyback.v1.GenesisState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.em.buyback.v1.GenesisState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.em.buyback.v1.GenesisState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.em.buyback.v1.GenesisState parseFrom(
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
  public static Builder newBuilder(com.em.buyback.v1.GenesisState prototype) {
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
   * Protobuf type {@code em.buyback.v1.GenesisState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:em.buyback.v1.GenesisState)
      com.em.buyback.v1.GenesisStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.em.buyback.v1.GenesisProto.internal_static_em_buyback_v1_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.em.buyback.v1.GenesisProto.internal_static_em_buyback_v1_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.em.buyback.v1.GenesisState.class, com.em.buyback.v1.GenesisState.Builder.class);
    }

    // Construct using com.em.buyback.v1.GenesisState.newBuilder()
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
      interval_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.em.buyback.v1.GenesisProto.internal_static_em_buyback_v1_GenesisState_descriptor;
    }

    @java.lang.Override
    public com.em.buyback.v1.GenesisState getDefaultInstanceForType() {
      return com.em.buyback.v1.GenesisState.getDefaultInstance();
    }

    @java.lang.Override
    public com.em.buyback.v1.GenesisState build() {
      com.em.buyback.v1.GenesisState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.em.buyback.v1.GenesisState buildPartial() {
      com.em.buyback.v1.GenesisState result = new com.em.buyback.v1.GenesisState(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.em.buyback.v1.GenesisState result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.interval_ = interval_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.em.buyback.v1.GenesisState) {
        return mergeFrom((com.em.buyback.v1.GenesisState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.em.buyback.v1.GenesisState other) {
      if (other == com.em.buyback.v1.GenesisState.getDefaultInstance()) return this;
      if (!other.getInterval().isEmpty()) {
        interval_ = other.interval_;
        bitField0_ |= 0x00000001;
        onChanged();
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
              interval_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
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

    private java.lang.Object interval_ = "";
    /**
     * <code>string interval = 1 [json_name = "interval", (.gogoproto.customname) = "Interval", (.gogoproto.moretags) = "yaml:&#92;"interval&#92;""];</code>
     * @return The interval.
     */
    public java.lang.String getInterval() {
      java.lang.Object ref = interval_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        interval_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string interval = 1 [json_name = "interval", (.gogoproto.customname) = "Interval", (.gogoproto.moretags) = "yaml:&#92;"interval&#92;""];</code>
     * @return The bytes for interval.
     */
    public com.google.protobuf.ByteString
        getIntervalBytes() {
      java.lang.Object ref = interval_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        interval_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string interval = 1 [json_name = "interval", (.gogoproto.customname) = "Interval", (.gogoproto.moretags) = "yaml:&#92;"interval&#92;""];</code>
     * @param value The interval to set.
     * @return This builder for chaining.
     */
    public Builder setInterval(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      interval_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string interval = 1 [json_name = "interval", (.gogoproto.customname) = "Interval", (.gogoproto.moretags) = "yaml:&#92;"interval&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearInterval() {
      interval_ = getDefaultInstance().getInterval();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string interval = 1 [json_name = "interval", (.gogoproto.customname) = "Interval", (.gogoproto.moretags) = "yaml:&#92;"interval&#92;""];</code>
     * @param value The bytes for interval to set.
     * @return This builder for chaining.
     */
    public Builder setIntervalBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      interval_ = value;
      bitField0_ |= 0x00000001;
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


    // @@protoc_insertion_point(builder_scope:em.buyback.v1.GenesisState)
  }

  // @@protoc_insertion_point(class_scope:em.buyback.v1.GenesisState)
  private static final com.em.buyback.v1.GenesisState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.em.buyback.v1.GenesisState();
  }

  public static com.em.buyback.v1.GenesisState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenesisState>
      PARSER = new com.google.protobuf.AbstractParser<GenesisState>() {
    @java.lang.Override
    public GenesisState parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenesisState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenesisState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.em.buyback.v1.GenesisState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

