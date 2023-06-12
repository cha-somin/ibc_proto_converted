// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/auction/v1beta1/query.proto

package com.kava.auction.v1beta1;

/**
 * <pre>
 * QueryNextAuctionIDResponse defines the response type for querying x/auction next auction ID.
 * </pre>
 *
 * Protobuf type {@code kava.auction.v1beta1.QueryNextAuctionIDResponse}
 */
public final class QueryNextAuctionIDResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kava.auction.v1beta1.QueryNextAuctionIDResponse)
    QueryNextAuctionIDResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryNextAuctionIDResponse.newBuilder() to construct.
  private QueryNextAuctionIDResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryNextAuctionIDResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryNextAuctionIDResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kava.auction.v1beta1.QueryProto.internal_static_kava_auction_v1beta1_QueryNextAuctionIDResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kava.auction.v1beta1.QueryProto.internal_static_kava_auction_v1beta1_QueryNextAuctionIDResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kava.auction.v1beta1.QueryNextAuctionIDResponse.class, com.kava.auction.v1beta1.QueryNextAuctionIDResponse.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;
  private long id_ = 0L;
  /**
   * <code>uint64 id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  @java.lang.Override
  public long getId() {
    return id_;
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
    if (id_ != 0L) {
      output.writeUInt64(1, id_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, id_);
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
    if (!(obj instanceof com.kava.auction.v1beta1.QueryNextAuctionIDResponse)) {
      return super.equals(obj);
    }
    com.kava.auction.v1beta1.QueryNextAuctionIDResponse other = (com.kava.auction.v1beta1.QueryNextAuctionIDResponse) obj;

    if (getId()
        != other.getId()) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kava.auction.v1beta1.QueryNextAuctionIDResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.auction.v1beta1.QueryNextAuctionIDResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.auction.v1beta1.QueryNextAuctionIDResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.auction.v1beta1.QueryNextAuctionIDResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.auction.v1beta1.QueryNextAuctionIDResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.auction.v1beta1.QueryNextAuctionIDResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.auction.v1beta1.QueryNextAuctionIDResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kava.auction.v1beta1.QueryNextAuctionIDResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.kava.auction.v1beta1.QueryNextAuctionIDResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.kava.auction.v1beta1.QueryNextAuctionIDResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kava.auction.v1beta1.QueryNextAuctionIDResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kava.auction.v1beta1.QueryNextAuctionIDResponse parseFrom(
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
  public static Builder newBuilder(com.kava.auction.v1beta1.QueryNextAuctionIDResponse prototype) {
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
   * QueryNextAuctionIDResponse defines the response type for querying x/auction next auction ID.
   * </pre>
   *
   * Protobuf type {@code kava.auction.v1beta1.QueryNextAuctionIDResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kava.auction.v1beta1.QueryNextAuctionIDResponse)
      com.kava.auction.v1beta1.QueryNextAuctionIDResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kava.auction.v1beta1.QueryProto.internal_static_kava_auction_v1beta1_QueryNextAuctionIDResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kava.auction.v1beta1.QueryProto.internal_static_kava_auction_v1beta1_QueryNextAuctionIDResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kava.auction.v1beta1.QueryNextAuctionIDResponse.class, com.kava.auction.v1beta1.QueryNextAuctionIDResponse.Builder.class);
    }

    // Construct using com.kava.auction.v1beta1.QueryNextAuctionIDResponse.newBuilder()
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
      id_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kava.auction.v1beta1.QueryProto.internal_static_kava_auction_v1beta1_QueryNextAuctionIDResponse_descriptor;
    }

    @java.lang.Override
    public com.kava.auction.v1beta1.QueryNextAuctionIDResponse getDefaultInstanceForType() {
      return com.kava.auction.v1beta1.QueryNextAuctionIDResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.kava.auction.v1beta1.QueryNextAuctionIDResponse build() {
      com.kava.auction.v1beta1.QueryNextAuctionIDResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kava.auction.v1beta1.QueryNextAuctionIDResponse buildPartial() {
      com.kava.auction.v1beta1.QueryNextAuctionIDResponse result = new com.kava.auction.v1beta1.QueryNextAuctionIDResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.kava.auction.v1beta1.QueryNextAuctionIDResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.kava.auction.v1beta1.QueryNextAuctionIDResponse) {
        return mergeFrom((com.kava.auction.v1beta1.QueryNextAuctionIDResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kava.auction.v1beta1.QueryNextAuctionIDResponse other) {
      if (other == com.kava.auction.v1beta1.QueryNextAuctionIDResponse.getDefaultInstance()) return this;
      if (other.getId() != 0L) {
        setId(other.getId());
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
              id_ = input.readUInt64();
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

    private long id_ ;
    /**
     * <code>uint64 id = 1 [json_name = "id"];</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }
    /**
     * <code>uint64 id = 1 [json_name = "id"];</code>
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(long value) {

      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 id = 1 [json_name = "id"];</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      id_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:kava.auction.v1beta1.QueryNextAuctionIDResponse)
  }

  // @@protoc_insertion_point(class_scope:kava.auction.v1beta1.QueryNextAuctionIDResponse)
  private static final com.kava.auction.v1beta1.QueryNextAuctionIDResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kava.auction.v1beta1.QueryNextAuctionIDResponse();
  }

  public static com.kava.auction.v1beta1.QueryNextAuctionIDResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryNextAuctionIDResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryNextAuctionIDResponse>() {
    @java.lang.Override
    public QueryNextAuctionIDResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryNextAuctionIDResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryNextAuctionIDResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.kava.auction.v1beta1.QueryNextAuctionIDResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

