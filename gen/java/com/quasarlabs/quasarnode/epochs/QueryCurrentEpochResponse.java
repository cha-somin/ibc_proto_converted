// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: quasar/epochs/query.proto

package com.quasarlabs.quasarnode.epochs;

/**
 * Protobuf type {@code quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse}
 */
public final class QueryCurrentEpochResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse)
    QueryCurrentEpochResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryCurrentEpochResponse.newBuilder() to construct.
  private QueryCurrentEpochResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryCurrentEpochResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryCurrentEpochResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.quasarlabs.quasarnode.epochs.QueryProto.internal_static_quasarlabs_quasarnode_epochs_QueryCurrentEpochResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.quasarlabs.quasarnode.epochs.QueryProto.internal_static_quasarlabs_quasarnode_epochs_QueryCurrentEpochResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse.class, com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse.Builder.class);
  }

  public static final int CURRENT_EPOCH_FIELD_NUMBER = 1;
  private long currentEpoch_ = 0L;
  /**
   * <code>int64 current_epoch = 1 [json_name = "currentEpoch"];</code>
   * @return The currentEpoch.
   */
  @java.lang.Override
  public long getCurrentEpoch() {
    return currentEpoch_;
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
    if (currentEpoch_ != 0L) {
      output.writeInt64(1, currentEpoch_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (currentEpoch_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, currentEpoch_);
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
    if (!(obj instanceof com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse)) {
      return super.equals(obj);
    }
    com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse other = (com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse) obj;

    if (getCurrentEpoch()
        != other.getCurrentEpoch()) return false;
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
    hash = (37 * hash) + CURRENT_EPOCH_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getCurrentEpoch());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse parseFrom(
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
  public static Builder newBuilder(com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse prototype) {
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
   * Protobuf type {@code quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse)
      com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.quasarlabs.quasarnode.epochs.QueryProto.internal_static_quasarlabs_quasarnode_epochs_QueryCurrentEpochResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.quasarlabs.quasarnode.epochs.QueryProto.internal_static_quasarlabs_quasarnode_epochs_QueryCurrentEpochResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse.class, com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse.Builder.class);
    }

    // Construct using com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse.newBuilder()
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
      currentEpoch_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.quasarlabs.quasarnode.epochs.QueryProto.internal_static_quasarlabs_quasarnode_epochs_QueryCurrentEpochResponse_descriptor;
    }

    @java.lang.Override
    public com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse getDefaultInstanceForType() {
      return com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse build() {
      com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse buildPartial() {
      com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse result = new com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.currentEpoch_ = currentEpoch_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse) {
        return mergeFrom((com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse other) {
      if (other == com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse.getDefaultInstance()) return this;
      if (other.getCurrentEpoch() != 0L) {
        setCurrentEpoch(other.getCurrentEpoch());
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
              currentEpoch_ = input.readInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private long currentEpoch_ ;
    /**
     * <code>int64 current_epoch = 1 [json_name = "currentEpoch"];</code>
     * @return The currentEpoch.
     */
    @java.lang.Override
    public long getCurrentEpoch() {
      return currentEpoch_;
    }
    /**
     * <code>int64 current_epoch = 1 [json_name = "currentEpoch"];</code>
     * @param value The currentEpoch to set.
     * @return This builder for chaining.
     */
    public Builder setCurrentEpoch(long value) {

      currentEpoch_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 current_epoch = 1 [json_name = "currentEpoch"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCurrentEpoch() {
      bitField0_ = (bitField0_ & ~0x00000001);
      currentEpoch_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse)
  }

  // @@protoc_insertion_point(class_scope:quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse)
  private static final com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse();
  }

  public static com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryCurrentEpochResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryCurrentEpochResponse>() {
    @java.lang.Override
    public QueryCurrentEpochResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryCurrentEpochResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryCurrentEpochResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.quasarlabs.quasarnode.epochs.QueryCurrentEpochResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

