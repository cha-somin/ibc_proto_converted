// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: shentu/cvm/v1alpha1/query.proto

package com.shentu.cvm.v1alpha1;

/**
 * Protobuf type {@code shentu.cvm.v1alpha1.QueryAddressMetaRequest}
 */
public final class QueryAddressMetaRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:shentu.cvm.v1alpha1.QueryAddressMetaRequest)
    QueryAddressMetaRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryAddressMetaRequest.newBuilder() to construct.
  private QueryAddressMetaRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryAddressMetaRequest() {
    address_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryAddressMetaRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.shentu.cvm.v1alpha1.QueryProto.internal_static_shentu_cvm_v1alpha1_QueryAddressMetaRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.shentu.cvm.v1alpha1.QueryProto.internal_static_shentu_cvm_v1alpha1_QueryAddressMetaRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.shentu.cvm.v1alpha1.QueryAddressMetaRequest.class, com.shentu.cvm.v1alpha1.QueryAddressMetaRequest.Builder.class);
  }

  public static final int ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object address_ = "";
  /**
   * <code>string address = 1 [json_name = "address", (.gogoproto.moretags) = "yaml:&#92;"address&#92;""];</code>
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
   * <code>string address = 1 [json_name = "address", (.gogoproto.moretags) = "yaml:&#92;"address&#92;""];</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, address_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, address_);
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
    if (!(obj instanceof com.shentu.cvm.v1alpha1.QueryAddressMetaRequest)) {
      return super.equals(obj);
    }
    com.shentu.cvm.v1alpha1.QueryAddressMetaRequest other = (com.shentu.cvm.v1alpha1.QueryAddressMetaRequest) obj;

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
    hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getAddress().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.shentu.cvm.v1alpha1.QueryAddressMetaRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.shentu.cvm.v1alpha1.QueryAddressMetaRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.shentu.cvm.v1alpha1.QueryAddressMetaRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.shentu.cvm.v1alpha1.QueryAddressMetaRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.shentu.cvm.v1alpha1.QueryAddressMetaRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.shentu.cvm.v1alpha1.QueryAddressMetaRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.shentu.cvm.v1alpha1.QueryAddressMetaRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.shentu.cvm.v1alpha1.QueryAddressMetaRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.shentu.cvm.v1alpha1.QueryAddressMetaRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.shentu.cvm.v1alpha1.QueryAddressMetaRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.shentu.cvm.v1alpha1.QueryAddressMetaRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.shentu.cvm.v1alpha1.QueryAddressMetaRequest parseFrom(
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
  public static Builder newBuilder(com.shentu.cvm.v1alpha1.QueryAddressMetaRequest prototype) {
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
   * Protobuf type {@code shentu.cvm.v1alpha1.QueryAddressMetaRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:shentu.cvm.v1alpha1.QueryAddressMetaRequest)
      com.shentu.cvm.v1alpha1.QueryAddressMetaRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.shentu.cvm.v1alpha1.QueryProto.internal_static_shentu_cvm_v1alpha1_QueryAddressMetaRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.shentu.cvm.v1alpha1.QueryProto.internal_static_shentu_cvm_v1alpha1_QueryAddressMetaRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.shentu.cvm.v1alpha1.QueryAddressMetaRequest.class, com.shentu.cvm.v1alpha1.QueryAddressMetaRequest.Builder.class);
    }

    // Construct using com.shentu.cvm.v1alpha1.QueryAddressMetaRequest.newBuilder()
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
      address_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.shentu.cvm.v1alpha1.QueryProto.internal_static_shentu_cvm_v1alpha1_QueryAddressMetaRequest_descriptor;
    }

    @java.lang.Override
    public com.shentu.cvm.v1alpha1.QueryAddressMetaRequest getDefaultInstanceForType() {
      return com.shentu.cvm.v1alpha1.QueryAddressMetaRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.shentu.cvm.v1alpha1.QueryAddressMetaRequest build() {
      com.shentu.cvm.v1alpha1.QueryAddressMetaRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.shentu.cvm.v1alpha1.QueryAddressMetaRequest buildPartial() {
      com.shentu.cvm.v1alpha1.QueryAddressMetaRequest result = new com.shentu.cvm.v1alpha1.QueryAddressMetaRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.shentu.cvm.v1alpha1.QueryAddressMetaRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.address_ = address_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.shentu.cvm.v1alpha1.QueryAddressMetaRequest) {
        return mergeFrom((com.shentu.cvm.v1alpha1.QueryAddressMetaRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.shentu.cvm.v1alpha1.QueryAddressMetaRequest other) {
      if (other == com.shentu.cvm.v1alpha1.QueryAddressMetaRequest.getDefaultInstance()) return this;
      if (!other.getAddress().isEmpty()) {
        address_ = other.address_;
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
              address_ = input.readStringRequireUtf8();
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

    private java.lang.Object address_ = "";
    /**
     * <code>string address = 1 [json_name = "address", (.gogoproto.moretags) = "yaml:&#92;"address&#92;""];</code>
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
     * <code>string address = 1 [json_name = "address", (.gogoproto.moretags) = "yaml:&#92;"address&#92;""];</code>
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
     * <code>string address = 1 [json_name = "address", (.gogoproto.moretags) = "yaml:&#92;"address&#92;""];</code>
     * @param value The address to set.
     * @return This builder for chaining.
     */
    public Builder setAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      address_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string address = 1 [json_name = "address", (.gogoproto.moretags) = "yaml:&#92;"address&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearAddress() {
      address_ = getDefaultInstance().getAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string address = 1 [json_name = "address", (.gogoproto.moretags) = "yaml:&#92;"address&#92;""];</code>
     * @param value The bytes for address to set.
     * @return This builder for chaining.
     */
    public Builder setAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      address_ = value;
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


    // @@protoc_insertion_point(builder_scope:shentu.cvm.v1alpha1.QueryAddressMetaRequest)
  }

  // @@protoc_insertion_point(class_scope:shentu.cvm.v1alpha1.QueryAddressMetaRequest)
  private static final com.shentu.cvm.v1alpha1.QueryAddressMetaRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.shentu.cvm.v1alpha1.QueryAddressMetaRequest();
  }

  public static com.shentu.cvm.v1alpha1.QueryAddressMetaRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryAddressMetaRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryAddressMetaRequest>() {
    @java.lang.Override
    public QueryAddressMetaRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryAddressMetaRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryAddressMetaRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.shentu.cvm.v1alpha1.QueryAddressMetaRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

