// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/query.proto

package com.injective.exchange.v1beta1;

/**
 * <pre>
 * QueryBalanceMismatchesRequest is the request type for the
 * Query/QueryBalanceMismatches RPC method.
 * </pre>
 *
 * Protobuf type {@code injective.exchange.v1beta1.QueryBalanceMismatchesRequest}
 */
public final class QueryBalanceMismatchesRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.exchange.v1beta1.QueryBalanceMismatchesRequest)
    QueryBalanceMismatchesRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryBalanceMismatchesRequest.newBuilder() to construct.
  private QueryBalanceMismatchesRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryBalanceMismatchesRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryBalanceMismatchesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QueryBalanceMismatchesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QueryBalanceMismatchesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest.class, com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest.Builder.class);
  }

  public static final int DUST_FACTOR_FIELD_NUMBER = 1;
  private long dustFactor_ = 0L;
  /**
   * <code>int64 dust_factor = 1 [json_name = "dustFactor"];</code>
   * @return The dustFactor.
   */
  @java.lang.Override
  public long getDustFactor() {
    return dustFactor_;
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
    if (dustFactor_ != 0L) {
      output.writeInt64(1, dustFactor_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dustFactor_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt64Size(1, dustFactor_);
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
    if (!(obj instanceof com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest)) {
      return super.equals(obj);
    }
    com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest other = (com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest) obj;

    if (getDustFactor()
        != other.getDustFactor()) return false;
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
    hash = (37 * hash) + DUST_FACTOR_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDustFactor());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest parseFrom(
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
  public static Builder newBuilder(com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest prototype) {
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
   * QueryBalanceMismatchesRequest is the request type for the
   * Query/QueryBalanceMismatches RPC method.
   * </pre>
   *
   * Protobuf type {@code injective.exchange.v1beta1.QueryBalanceMismatchesRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.exchange.v1beta1.QueryBalanceMismatchesRequest)
      com.injective.exchange.v1beta1.QueryBalanceMismatchesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QueryBalanceMismatchesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QueryBalanceMismatchesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest.class, com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest.Builder.class);
    }

    // Construct using com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest.newBuilder()
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
      dustFactor_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.injective.exchange.v1beta1.QueryProto.internal_static_injective_exchange_v1beta1_QueryBalanceMismatchesRequest_descriptor;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest getDefaultInstanceForType() {
      return com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest build() {
      com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest buildPartial() {
      com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest result = new com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dustFactor_ = dustFactor_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest) {
        return mergeFrom((com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest other) {
      if (other == com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest.getDefaultInstance()) return this;
      if (other.getDustFactor() != 0L) {
        setDustFactor(other.getDustFactor());
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
              dustFactor_ = input.readInt64();
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

    private long dustFactor_ ;
    /**
     * <code>int64 dust_factor = 1 [json_name = "dustFactor"];</code>
     * @return The dustFactor.
     */
    @java.lang.Override
    public long getDustFactor() {
      return dustFactor_;
    }
    /**
     * <code>int64 dust_factor = 1 [json_name = "dustFactor"];</code>
     * @param value The dustFactor to set.
     * @return This builder for chaining.
     */
    public Builder setDustFactor(long value) {

      dustFactor_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>int64 dust_factor = 1 [json_name = "dustFactor"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDustFactor() {
      bitField0_ = (bitField0_ & ~0x00000001);
      dustFactor_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:injective.exchange.v1beta1.QueryBalanceMismatchesRequest)
  }

  // @@protoc_insertion_point(class_scope:injective.exchange.v1beta1.QueryBalanceMismatchesRequest)
  private static final com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest();
  }

  public static com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryBalanceMismatchesRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryBalanceMismatchesRequest>() {
    @java.lang.Override
    public QueryBalanceMismatchesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryBalanceMismatchesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryBalanceMismatchesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.injective.exchange.v1beta1.QueryBalanceMismatchesRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

