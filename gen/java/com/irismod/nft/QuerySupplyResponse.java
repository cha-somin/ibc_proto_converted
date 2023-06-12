// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: irismod/nft/query.proto

package com.irismod.nft;

/**
 * <pre>
 * QuerySupplyResponse is the response type for the Query/Supply RPC method
 * </pre>
 *
 * Protobuf type {@code irismod.nft.QuerySupplyResponse}
 */
public final class QuerySupplyResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:irismod.nft.QuerySupplyResponse)
    QuerySupplyResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QuerySupplyResponse.newBuilder() to construct.
  private QuerySupplyResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QuerySupplyResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QuerySupplyResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.irismod.nft.QueryProto.internal_static_irismod_nft_QuerySupplyResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.irismod.nft.QueryProto.internal_static_irismod_nft_QuerySupplyResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.irismod.nft.QuerySupplyResponse.class, com.irismod.nft.QuerySupplyResponse.Builder.class);
  }

  public static final int AMOUNT_FIELD_NUMBER = 1;
  private long amount_ = 0L;
  /**
   * <code>uint64 amount = 1 [json_name = "amount"];</code>
   * @return The amount.
   */
  @java.lang.Override
  public long getAmount() {
    return amount_;
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
    if (amount_ != 0L) {
      output.writeUInt64(1, amount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (amount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, amount_);
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
    if (!(obj instanceof com.irismod.nft.QuerySupplyResponse)) {
      return super.equals(obj);
    }
    com.irismod.nft.QuerySupplyResponse other = (com.irismod.nft.QuerySupplyResponse) obj;

    if (getAmount()
        != other.getAmount()) return false;
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
    hash = (37 * hash) + AMOUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAmount());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.irismod.nft.QuerySupplyResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.irismod.nft.QuerySupplyResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.irismod.nft.QuerySupplyResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.irismod.nft.QuerySupplyResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.irismod.nft.QuerySupplyResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.irismod.nft.QuerySupplyResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.irismod.nft.QuerySupplyResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.irismod.nft.QuerySupplyResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.irismod.nft.QuerySupplyResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.irismod.nft.QuerySupplyResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.irismod.nft.QuerySupplyResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.irismod.nft.QuerySupplyResponse parseFrom(
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
  public static Builder newBuilder(com.irismod.nft.QuerySupplyResponse prototype) {
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
   * QuerySupplyResponse is the response type for the Query/Supply RPC method
   * </pre>
   *
   * Protobuf type {@code irismod.nft.QuerySupplyResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:irismod.nft.QuerySupplyResponse)
      com.irismod.nft.QuerySupplyResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.irismod.nft.QueryProto.internal_static_irismod_nft_QuerySupplyResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.irismod.nft.QueryProto.internal_static_irismod_nft_QuerySupplyResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.irismod.nft.QuerySupplyResponse.class, com.irismod.nft.QuerySupplyResponse.Builder.class);
    }

    // Construct using com.irismod.nft.QuerySupplyResponse.newBuilder()
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
      amount_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.irismod.nft.QueryProto.internal_static_irismod_nft_QuerySupplyResponse_descriptor;
    }

    @java.lang.Override
    public com.irismod.nft.QuerySupplyResponse getDefaultInstanceForType() {
      return com.irismod.nft.QuerySupplyResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.irismod.nft.QuerySupplyResponse build() {
      com.irismod.nft.QuerySupplyResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.irismod.nft.QuerySupplyResponse buildPartial() {
      com.irismod.nft.QuerySupplyResponse result = new com.irismod.nft.QuerySupplyResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.irismod.nft.QuerySupplyResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.amount_ = amount_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.irismod.nft.QuerySupplyResponse) {
        return mergeFrom((com.irismod.nft.QuerySupplyResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.irismod.nft.QuerySupplyResponse other) {
      if (other == com.irismod.nft.QuerySupplyResponse.getDefaultInstance()) return this;
      if (other.getAmount() != 0L) {
        setAmount(other.getAmount());
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
              amount_ = input.readUInt64();
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

    private long amount_ ;
    /**
     * <code>uint64 amount = 1 [json_name = "amount"];</code>
     * @return The amount.
     */
    @java.lang.Override
    public long getAmount() {
      return amount_;
    }
    /**
     * <code>uint64 amount = 1 [json_name = "amount"];</code>
     * @param value The amount to set.
     * @return This builder for chaining.
     */
    public Builder setAmount(long value) {

      amount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 amount = 1 [json_name = "amount"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAmount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      amount_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:irismod.nft.QuerySupplyResponse)
  }

  // @@protoc_insertion_point(class_scope:irismod.nft.QuerySupplyResponse)
  private static final com.irismod.nft.QuerySupplyResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.irismod.nft.QuerySupplyResponse();
  }

  public static com.irismod.nft.QuerySupplyResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QuerySupplyResponse>
      PARSER = new com.google.protobuf.AbstractParser<QuerySupplyResponse>() {
    @java.lang.Override
    public QuerySupplyResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QuerySupplyResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QuerySupplyResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.irismod.nft.QuerySupplyResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

