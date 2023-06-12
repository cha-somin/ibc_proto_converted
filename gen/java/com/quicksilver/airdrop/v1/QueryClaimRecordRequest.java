// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: quicksilver/airdrop/v1/query.proto

package com.quicksilver.airdrop.v1;

/**
 * <pre>
 * QueryClaimRecordRequest is the request type for Query/ClaimRecord RPC method.
 * </pre>
 *
 * Protobuf type {@code quicksilver.airdrop.v1.QueryClaimRecordRequest}
 */
public final class QueryClaimRecordRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:quicksilver.airdrop.v1.QueryClaimRecordRequest)
    QueryClaimRecordRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryClaimRecordRequest.newBuilder() to construct.
  private QueryClaimRecordRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryClaimRecordRequest() {
    chainId_ = "";
    address_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryClaimRecordRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.quicksilver.airdrop.v1.QueryProto.internal_static_quicksilver_airdrop_v1_QueryClaimRecordRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.quicksilver.airdrop.v1.QueryProto.internal_static_quicksilver_airdrop_v1_QueryClaimRecordRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.quicksilver.airdrop.v1.QueryClaimRecordRequest.class, com.quicksilver.airdrop.v1.QueryClaimRecordRequest.Builder.class);
  }

  public static final int CHAIN_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object chainId_ = "";
  /**
   * <code>string chain_id = 1 [json_name = "chainId", (.gogoproto.moretags) = "yaml:&#92;"chain_id&#92;""];</code>
   * @return The chainId.
   */
  @java.lang.Override
  public java.lang.String getChainId() {
    java.lang.Object ref = chainId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      chainId_ = s;
      return s;
    }
  }
  /**
   * <code>string chain_id = 1 [json_name = "chainId", (.gogoproto.moretags) = "yaml:&#92;"chain_id&#92;""];</code>
   * @return The bytes for chainId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getChainIdBytes() {
    java.lang.Object ref = chainId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      chainId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ADDRESS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object address_ = "";
  /**
   * <code>string address = 2 [json_name = "address", (.gogoproto.moretags) = "yaml:&#92;"address&#92;""];</code>
   * @return The address.
   */
  @java.lang.Override
  public java.lang.String getAddress() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      address_ = s;
      return s;
    }
  }
  /**
   * <code>string address = 2 [json_name = "address", (.gogoproto.moretags) = "yaml:&#92;"address&#92;""];</code>
   * @return The bytes for address.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAddressBytes() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      address_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(chainId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, chainId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, address_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(chainId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, chainId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, address_);
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
    if (!(obj instanceof com.quicksilver.airdrop.v1.QueryClaimRecordRequest)) {
      return super.equals(obj);
    }
    com.quicksilver.airdrop.v1.QueryClaimRecordRequest other = (com.quicksilver.airdrop.v1.QueryClaimRecordRequest) obj;

    if (!getChainId()
        .equals(other.getChainId())) return false;
    if (!getAddress()
        .equals(other.getAddress())) return false;
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
    hash = (37 * hash) + CHAIN_ID_FIELD_NUMBER;
    hash = (53 * hash) + getChainId().hashCode();
    hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getAddress().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.quicksilver.airdrop.v1.QueryClaimRecordRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.quicksilver.airdrop.v1.QueryClaimRecordRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.quicksilver.airdrop.v1.QueryClaimRecordRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.quicksilver.airdrop.v1.QueryClaimRecordRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.quicksilver.airdrop.v1.QueryClaimRecordRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.quicksilver.airdrop.v1.QueryClaimRecordRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.quicksilver.airdrop.v1.QueryClaimRecordRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.quicksilver.airdrop.v1.QueryClaimRecordRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.quicksilver.airdrop.v1.QueryClaimRecordRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.quicksilver.airdrop.v1.QueryClaimRecordRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.quicksilver.airdrop.v1.QueryClaimRecordRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.quicksilver.airdrop.v1.QueryClaimRecordRequest parseFrom(
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
  public static Builder newBuilder(com.quicksilver.airdrop.v1.QueryClaimRecordRequest prototype) {
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
   * QueryClaimRecordRequest is the request type for Query/ClaimRecord RPC method.
   * </pre>
   *
   * Protobuf type {@code quicksilver.airdrop.v1.QueryClaimRecordRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:quicksilver.airdrop.v1.QueryClaimRecordRequest)
      com.quicksilver.airdrop.v1.QueryClaimRecordRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.quicksilver.airdrop.v1.QueryProto.internal_static_quicksilver_airdrop_v1_QueryClaimRecordRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.quicksilver.airdrop.v1.QueryProto.internal_static_quicksilver_airdrop_v1_QueryClaimRecordRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.quicksilver.airdrop.v1.QueryClaimRecordRequest.class, com.quicksilver.airdrop.v1.QueryClaimRecordRequest.Builder.class);
    }

    // Construct using com.quicksilver.airdrop.v1.QueryClaimRecordRequest.newBuilder()
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
      chainId_ = "";
      address_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.quicksilver.airdrop.v1.QueryProto.internal_static_quicksilver_airdrop_v1_QueryClaimRecordRequest_descriptor;
    }

    @java.lang.Override
    public com.quicksilver.airdrop.v1.QueryClaimRecordRequest getDefaultInstanceForType() {
      return com.quicksilver.airdrop.v1.QueryClaimRecordRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.quicksilver.airdrop.v1.QueryClaimRecordRequest build() {
      com.quicksilver.airdrop.v1.QueryClaimRecordRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.quicksilver.airdrop.v1.QueryClaimRecordRequest buildPartial() {
      com.quicksilver.airdrop.v1.QueryClaimRecordRequest result = new com.quicksilver.airdrop.v1.QueryClaimRecordRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.quicksilver.airdrop.v1.QueryClaimRecordRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.chainId_ = chainId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.address_ = address_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.quicksilver.airdrop.v1.QueryClaimRecordRequest) {
        return mergeFrom((com.quicksilver.airdrop.v1.QueryClaimRecordRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.quicksilver.airdrop.v1.QueryClaimRecordRequest other) {
      if (other == com.quicksilver.airdrop.v1.QueryClaimRecordRequest.getDefaultInstance()) return this;
      if (!other.getChainId().isEmpty()) {
        chainId_ = other.chainId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getAddress().isEmpty()) {
        address_ = other.address_;
        bitField0_ |= 0x00000002;
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
              chainId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              address_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
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

    private java.lang.Object chainId_ = "";
    /**
     * <code>string chain_id = 1 [json_name = "chainId", (.gogoproto.moretags) = "yaml:&#92;"chain_id&#92;""];</code>
     * @return The chainId.
     */
    public java.lang.String getChainId() {
      java.lang.Object ref = chainId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        chainId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string chain_id = 1 [json_name = "chainId", (.gogoproto.moretags) = "yaml:&#92;"chain_id&#92;""];</code>
     * @return The bytes for chainId.
     */
    public com.google.protobuf.ByteString
        getChainIdBytes() {
      java.lang.Object ref = chainId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        chainId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string chain_id = 1 [json_name = "chainId", (.gogoproto.moretags) = "yaml:&#92;"chain_id&#92;""];</code>
     * @param value The chainId to set.
     * @return This builder for chaining.
     */
    public Builder setChainId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      chainId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string chain_id = 1 [json_name = "chainId", (.gogoproto.moretags) = "yaml:&#92;"chain_id&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearChainId() {
      chainId_ = getDefaultInstance().getChainId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string chain_id = 1 [json_name = "chainId", (.gogoproto.moretags) = "yaml:&#92;"chain_id&#92;""];</code>
     * @param value The bytes for chainId to set.
     * @return This builder for chaining.
     */
    public Builder setChainIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      chainId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object address_ = "";
    /**
     * <code>string address = 2 [json_name = "address", (.gogoproto.moretags) = "yaml:&#92;"address&#92;""];</code>
     * @return The address.
     */
    public java.lang.String getAddress() {
      java.lang.Object ref = address_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        address_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string address = 2 [json_name = "address", (.gogoproto.moretags) = "yaml:&#92;"address&#92;""];</code>
     * @return The bytes for address.
     */
    public com.google.protobuf.ByteString
        getAddressBytes() {
      java.lang.Object ref = address_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        address_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string address = 2 [json_name = "address", (.gogoproto.moretags) = "yaml:&#92;"address&#92;""];</code>
     * @param value The address to set.
     * @return This builder for chaining.
     */
    public Builder setAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      address_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string address = 2 [json_name = "address", (.gogoproto.moretags) = "yaml:&#92;"address&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearAddress() {
      address_ = getDefaultInstance().getAddress();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string address = 2 [json_name = "address", (.gogoproto.moretags) = "yaml:&#92;"address&#92;""];</code>
     * @param value The bytes for address to set.
     * @return This builder for chaining.
     */
    public Builder setAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      address_ = value;
      bitField0_ |= 0x00000002;
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


    // @@protoc_insertion_point(builder_scope:quicksilver.airdrop.v1.QueryClaimRecordRequest)
  }

  // @@protoc_insertion_point(class_scope:quicksilver.airdrop.v1.QueryClaimRecordRequest)
  private static final com.quicksilver.airdrop.v1.QueryClaimRecordRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.quicksilver.airdrop.v1.QueryClaimRecordRequest();
  }

  public static com.quicksilver.airdrop.v1.QueryClaimRecordRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryClaimRecordRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryClaimRecordRequest>() {
    @java.lang.Override
    public QueryClaimRecordRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryClaimRecordRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryClaimRecordRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.quicksilver.airdrop.v1.QueryClaimRecordRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

