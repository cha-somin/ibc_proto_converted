// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stride/stakeibc/query.proto

package com.stride.stakeibc;

/**
 * Protobuf type {@code stride.stakeibc.QueryGetNextPacketSequenceResponse}
 */
public final class QueryGetNextPacketSequenceResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:stride.stakeibc.QueryGetNextPacketSequenceResponse)
    QueryGetNextPacketSequenceResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryGetNextPacketSequenceResponse.newBuilder() to construct.
  private QueryGetNextPacketSequenceResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryGetNextPacketSequenceResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryGetNextPacketSequenceResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.stride.stakeibc.QueryProto.internal_static_stride_stakeibc_QueryGetNextPacketSequenceResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.stride.stakeibc.QueryProto.internal_static_stride_stakeibc_QueryGetNextPacketSequenceResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.stride.stakeibc.QueryGetNextPacketSequenceResponse.class, com.stride.stakeibc.QueryGetNextPacketSequenceResponse.Builder.class);
  }

  public static final int SEQUENCE_FIELD_NUMBER = 1;
  private long sequence_ = 0L;
  /**
   * <code>uint64 sequence = 1 [json_name = "sequence"];</code>
   * @return The sequence.
   */
  @java.lang.Override
  public long getSequence() {
    return sequence_;
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
    if (sequence_ != 0L) {
      output.writeUInt64(1, sequence_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (sequence_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, sequence_);
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
    if (!(obj instanceof com.stride.stakeibc.QueryGetNextPacketSequenceResponse)) {
      return super.equals(obj);
    }
    com.stride.stakeibc.QueryGetNextPacketSequenceResponse other = (com.stride.stakeibc.QueryGetNextPacketSequenceResponse) obj;

    if (getSequence()
        != other.getSequence()) return false;
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
    hash = (37 * hash) + SEQUENCE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getSequence());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.stride.stakeibc.QueryGetNextPacketSequenceResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stride.stakeibc.QueryGetNextPacketSequenceResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stride.stakeibc.QueryGetNextPacketSequenceResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stride.stakeibc.QueryGetNextPacketSequenceResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stride.stakeibc.QueryGetNextPacketSequenceResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.stride.stakeibc.QueryGetNextPacketSequenceResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.stride.stakeibc.QueryGetNextPacketSequenceResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stride.stakeibc.QueryGetNextPacketSequenceResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.stride.stakeibc.QueryGetNextPacketSequenceResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.stride.stakeibc.QueryGetNextPacketSequenceResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.stride.stakeibc.QueryGetNextPacketSequenceResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.stride.stakeibc.QueryGetNextPacketSequenceResponse parseFrom(
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
  public static Builder newBuilder(com.stride.stakeibc.QueryGetNextPacketSequenceResponse prototype) {
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
   * Protobuf type {@code stride.stakeibc.QueryGetNextPacketSequenceResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:stride.stakeibc.QueryGetNextPacketSequenceResponse)
      com.stride.stakeibc.QueryGetNextPacketSequenceResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.stride.stakeibc.QueryProto.internal_static_stride_stakeibc_QueryGetNextPacketSequenceResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.stride.stakeibc.QueryProto.internal_static_stride_stakeibc_QueryGetNextPacketSequenceResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.stride.stakeibc.QueryGetNextPacketSequenceResponse.class, com.stride.stakeibc.QueryGetNextPacketSequenceResponse.Builder.class);
    }

    // Construct using com.stride.stakeibc.QueryGetNextPacketSequenceResponse.newBuilder()
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
      sequence_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.stride.stakeibc.QueryProto.internal_static_stride_stakeibc_QueryGetNextPacketSequenceResponse_descriptor;
    }

    @java.lang.Override
    public com.stride.stakeibc.QueryGetNextPacketSequenceResponse getDefaultInstanceForType() {
      return com.stride.stakeibc.QueryGetNextPacketSequenceResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.stride.stakeibc.QueryGetNextPacketSequenceResponse build() {
      com.stride.stakeibc.QueryGetNextPacketSequenceResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.stride.stakeibc.QueryGetNextPacketSequenceResponse buildPartial() {
      com.stride.stakeibc.QueryGetNextPacketSequenceResponse result = new com.stride.stakeibc.QueryGetNextPacketSequenceResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.stride.stakeibc.QueryGetNextPacketSequenceResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sequence_ = sequence_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.stride.stakeibc.QueryGetNextPacketSequenceResponse) {
        return mergeFrom((com.stride.stakeibc.QueryGetNextPacketSequenceResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.stride.stakeibc.QueryGetNextPacketSequenceResponse other) {
      if (other == com.stride.stakeibc.QueryGetNextPacketSequenceResponse.getDefaultInstance()) return this;
      if (other.getSequence() != 0L) {
        setSequence(other.getSequence());
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
              sequence_ = input.readUInt64();
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

    private long sequence_ ;
    /**
     * <code>uint64 sequence = 1 [json_name = "sequence"];</code>
     * @return The sequence.
     */
    @java.lang.Override
    public long getSequence() {
      return sequence_;
    }
    /**
     * <code>uint64 sequence = 1 [json_name = "sequence"];</code>
     * @param value The sequence to set.
     * @return This builder for chaining.
     */
    public Builder setSequence(long value) {

      sequence_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 sequence = 1 [json_name = "sequence"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSequence() {
      bitField0_ = (bitField0_ & ~0x00000001);
      sequence_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:stride.stakeibc.QueryGetNextPacketSequenceResponse)
  }

  // @@protoc_insertion_point(class_scope:stride.stakeibc.QueryGetNextPacketSequenceResponse)
  private static final com.stride.stakeibc.QueryGetNextPacketSequenceResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.stride.stakeibc.QueryGetNextPacketSequenceResponse();
  }

  public static com.stride.stakeibc.QueryGetNextPacketSequenceResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryGetNextPacketSequenceResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryGetNextPacketSequenceResponse>() {
    @java.lang.Override
    public QueryGetNextPacketSequenceResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryGetNextPacketSequenceResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryGetNextPacketSequenceResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.stride.stakeibc.QueryGetNextPacketSequenceResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

