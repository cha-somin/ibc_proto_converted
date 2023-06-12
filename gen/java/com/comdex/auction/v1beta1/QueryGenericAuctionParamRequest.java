// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/auction/v1beta1/query.proto

package com.comdex.auction.v1beta1;

/**
 * Protobuf type {@code comdex.auction.v1beta1.QueryGenericAuctionParamRequest}
 */
public final class QueryGenericAuctionParamRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:comdex.auction.v1beta1.QueryGenericAuctionParamRequest)
    QueryGenericAuctionParamRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryGenericAuctionParamRequest.newBuilder() to construct.
  private QueryGenericAuctionParamRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryGenericAuctionParamRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryGenericAuctionParamRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.comdex.auction.v1beta1.QueryProto.internal_static_comdex_auction_v1beta1_QueryGenericAuctionParamRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.comdex.auction.v1beta1.QueryProto.internal_static_comdex_auction_v1beta1_QueryGenericAuctionParamRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest.class, com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest.Builder.class);
  }

  public static final int APP_ID_FIELD_NUMBER = 1;
  private long appId_ = 0L;
  /**
   * <code>uint64 app_id = 1 [json_name = "appId"];</code>
   * @return The appId.
   */
  @java.lang.Override
  public long getAppId() {
    return appId_;
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
    if (appId_ != 0L) {
      output.writeUInt64(1, appId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (appId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, appId_);
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
    if (!(obj instanceof com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest)) {
      return super.equals(obj);
    }
    com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest other = (com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest) obj;

    if (getAppId()
        != other.getAppId()) return false;
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
    hash = (37 * hash) + APP_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getAppId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest parseFrom(
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
  public static Builder newBuilder(com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest prototype) {
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
   * Protobuf type {@code comdex.auction.v1beta1.QueryGenericAuctionParamRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:comdex.auction.v1beta1.QueryGenericAuctionParamRequest)
      com.comdex.auction.v1beta1.QueryGenericAuctionParamRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.comdex.auction.v1beta1.QueryProto.internal_static_comdex_auction_v1beta1_QueryGenericAuctionParamRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.comdex.auction.v1beta1.QueryProto.internal_static_comdex_auction_v1beta1_QueryGenericAuctionParamRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest.class, com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest.Builder.class);
    }

    // Construct using com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest.newBuilder()
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
      appId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.comdex.auction.v1beta1.QueryProto.internal_static_comdex_auction_v1beta1_QueryGenericAuctionParamRequest_descriptor;
    }

    @java.lang.Override
    public com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest getDefaultInstanceForType() {
      return com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest build() {
      com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest buildPartial() {
      com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest result = new com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.appId_ = appId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest) {
        return mergeFrom((com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest other) {
      if (other == com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest.getDefaultInstance()) return this;
      if (other.getAppId() != 0L) {
        setAppId(other.getAppId());
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
              appId_ = input.readUInt64();
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

    private long appId_ ;
    /**
     * <code>uint64 app_id = 1 [json_name = "appId"];</code>
     * @return The appId.
     */
    @java.lang.Override
    public long getAppId() {
      return appId_;
    }
    /**
     * <code>uint64 app_id = 1 [json_name = "appId"];</code>
     * @param value The appId to set.
     * @return This builder for chaining.
     */
    public Builder setAppId(long value) {

      appId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 app_id = 1 [json_name = "appId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAppId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      appId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:comdex.auction.v1beta1.QueryGenericAuctionParamRequest)
  }

  // @@protoc_insertion_point(class_scope:comdex.auction.v1beta1.QueryGenericAuctionParamRequest)
  private static final com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest();
  }

  public static com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryGenericAuctionParamRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryGenericAuctionParamRequest>() {
    @java.lang.Override
    public QueryGenericAuctionParamRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryGenericAuctionParamRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryGenericAuctionParamRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.comdex.auction.v1beta1.QueryGenericAuctionParamRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

