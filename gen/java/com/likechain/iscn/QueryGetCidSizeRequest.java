// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: likechain/iscn/query.proto

package com.likechain.iscn;

/**
 * Protobuf type {@code likechain.iscn.QueryGetCidSizeRequest}
 */
public final class QueryGetCidSizeRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:likechain.iscn.QueryGetCidSizeRequest)
    QueryGetCidSizeRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryGetCidSizeRequest.newBuilder() to construct.
  private QueryGetCidSizeRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryGetCidSizeRequest() {
    cid_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryGetCidSizeRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.likechain.iscn.QueryProto.internal_static_likechain_iscn_QueryGetCidSizeRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.likechain.iscn.QueryProto.internal_static_likechain_iscn_QueryGetCidSizeRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.likechain.iscn.QueryGetCidSizeRequest.class, com.likechain.iscn.QueryGetCidSizeRequest.Builder.class);
  }

  public static final int CID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object cid_ = "";
  /**
   * <code>string cid = 1 [json_name = "cid"];</code>
   * @return The cid.
   */
  @java.lang.Override
  public java.lang.String getCid() {
    java.lang.Object ref = cid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      cid_ = s;
      return s;
    }
  }
  /**
   * <code>string cid = 1 [json_name = "cid"];</code>
   * @return The bytes for cid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getCidBytes() {
    java.lang.Object ref = cid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      cid_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cid_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, cid_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(cid_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, cid_);
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
    if (!(obj instanceof com.likechain.iscn.QueryGetCidSizeRequest)) {
      return super.equals(obj);
    }
    com.likechain.iscn.QueryGetCidSizeRequest other = (com.likechain.iscn.QueryGetCidSizeRequest) obj;

    if (!getCid()
        .equals(other.getCid())) return false;
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
    hash = (37 * hash) + CID_FIELD_NUMBER;
    hash = (53 * hash) + getCid().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.likechain.iscn.QueryGetCidSizeRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.iscn.QueryGetCidSizeRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.iscn.QueryGetCidSizeRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.iscn.QueryGetCidSizeRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.iscn.QueryGetCidSizeRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.likechain.iscn.QueryGetCidSizeRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.likechain.iscn.QueryGetCidSizeRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.likechain.iscn.QueryGetCidSizeRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.likechain.iscn.QueryGetCidSizeRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.likechain.iscn.QueryGetCidSizeRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.likechain.iscn.QueryGetCidSizeRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.likechain.iscn.QueryGetCidSizeRequest parseFrom(
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
  public static Builder newBuilder(com.likechain.iscn.QueryGetCidSizeRequest prototype) {
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
   * Protobuf type {@code likechain.iscn.QueryGetCidSizeRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:likechain.iscn.QueryGetCidSizeRequest)
      com.likechain.iscn.QueryGetCidSizeRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.likechain.iscn.QueryProto.internal_static_likechain_iscn_QueryGetCidSizeRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.likechain.iscn.QueryProto.internal_static_likechain_iscn_QueryGetCidSizeRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.likechain.iscn.QueryGetCidSizeRequest.class, com.likechain.iscn.QueryGetCidSizeRequest.Builder.class);
    }

    // Construct using com.likechain.iscn.QueryGetCidSizeRequest.newBuilder()
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
      cid_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.likechain.iscn.QueryProto.internal_static_likechain_iscn_QueryGetCidSizeRequest_descriptor;
    }

    @java.lang.Override
    public com.likechain.iscn.QueryGetCidSizeRequest getDefaultInstanceForType() {
      return com.likechain.iscn.QueryGetCidSizeRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.likechain.iscn.QueryGetCidSizeRequest build() {
      com.likechain.iscn.QueryGetCidSizeRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.likechain.iscn.QueryGetCidSizeRequest buildPartial() {
      com.likechain.iscn.QueryGetCidSizeRequest result = new com.likechain.iscn.QueryGetCidSizeRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.likechain.iscn.QueryGetCidSizeRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.cid_ = cid_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.likechain.iscn.QueryGetCidSizeRequest) {
        return mergeFrom((com.likechain.iscn.QueryGetCidSizeRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.likechain.iscn.QueryGetCidSizeRequest other) {
      if (other == com.likechain.iscn.QueryGetCidSizeRequest.getDefaultInstance()) return this;
      if (!other.getCid().isEmpty()) {
        cid_ = other.cid_;
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
              cid_ = input.readStringRequireUtf8();
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

    private java.lang.Object cid_ = "";
    /**
     * <code>string cid = 1 [json_name = "cid"];</code>
     * @return The cid.
     */
    public java.lang.String getCid() {
      java.lang.Object ref = cid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        cid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string cid = 1 [json_name = "cid"];</code>
     * @return The bytes for cid.
     */
    public com.google.protobuf.ByteString
        getCidBytes() {
      java.lang.Object ref = cid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        cid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string cid = 1 [json_name = "cid"];</code>
     * @param value The cid to set.
     * @return This builder for chaining.
     */
    public Builder setCid(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      cid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string cid = 1 [json_name = "cid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearCid() {
      cid_ = getDefaultInstance().getCid();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string cid = 1 [json_name = "cid"];</code>
     * @param value The bytes for cid to set.
     * @return This builder for chaining.
     */
    public Builder setCidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      cid_ = value;
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


    // @@protoc_insertion_point(builder_scope:likechain.iscn.QueryGetCidSizeRequest)
  }

  // @@protoc_insertion_point(class_scope:likechain.iscn.QueryGetCidSizeRequest)
  private static final com.likechain.iscn.QueryGetCidSizeRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.likechain.iscn.QueryGetCidSizeRequest();
  }

  public static com.likechain.iscn.QueryGetCidSizeRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryGetCidSizeRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryGetCidSizeRequest>() {
    @java.lang.Override
    public QueryGetCidSizeRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryGetCidSizeRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryGetCidSizeRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.likechain.iscn.QueryGetCidSizeRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

