// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: osmosis/protorev/v1beta1/query.proto

package com.osmosis.protorev.v1beta1;

/**
 * <pre>
 * QueryGetProtoRevPoolRequest is request type for the
 * Query/GetProtoRevPool RPC method.
 * </pre>
 *
 * Protobuf type {@code osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest}
 */
public final class QueryGetProtoRevPoolRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest)
    QueryGetProtoRevPoolRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryGetProtoRevPoolRequest.newBuilder() to construct.
  private QueryGetProtoRevPoolRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryGetProtoRevPoolRequest() {
    baseDenom_ = "";
    otherDenom_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryGetProtoRevPoolRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.osmosis.protorev.v1beta1.QueryProto.internal_static_osmosis_protorev_v1beta1_QueryGetProtoRevPoolRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.osmosis.protorev.v1beta1.QueryProto.internal_static_osmosis_protorev_v1beta1_QueryGetProtoRevPoolRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest.class, com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest.Builder.class);
  }

  public static final int BASE_DENOM_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object baseDenom_ = "";
  /**
   * <pre>
   * base_denom is the base denom set in protorev for the denom pair to pool
   * mapping
   * </pre>
   *
   * <code>string base_denom = 1 [json_name = "baseDenom", (.gogoproto.moretags) = "yaml:&#92;"base_denom&#92;""];</code>
   * @return The baseDenom.
   */
  @java.lang.Override
  public java.lang.String getBaseDenom() {
    java.lang.Object ref = baseDenom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      baseDenom_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * base_denom is the base denom set in protorev for the denom pair to pool
   * mapping
   * </pre>
   *
   * <code>string base_denom = 1 [json_name = "baseDenom", (.gogoproto.moretags) = "yaml:&#92;"base_denom&#92;""];</code>
   * @return The bytes for baseDenom.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getBaseDenomBytes() {
    java.lang.Object ref = baseDenom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      baseDenom_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int OTHER_DENOM_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object otherDenom_ = "";
  /**
   * <pre>
   * other_denom is the other denom for the denom pair to pool mapping
   * </pre>
   *
   * <code>string other_denom = 2 [json_name = "otherDenom", (.gogoproto.moretags) = "yaml:&#92;"other_denom&#92;""];</code>
   * @return The otherDenom.
   */
  @java.lang.Override
  public java.lang.String getOtherDenom() {
    java.lang.Object ref = otherDenom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      otherDenom_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * other_denom is the other denom for the denom pair to pool mapping
   * </pre>
   *
   * <code>string other_denom = 2 [json_name = "otherDenom", (.gogoproto.moretags) = "yaml:&#92;"other_denom&#92;""];</code>
   * @return The bytes for otherDenom.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getOtherDenomBytes() {
    java.lang.Object ref = otherDenom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      otherDenom_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(baseDenom_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, baseDenom_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(otherDenom_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, otherDenom_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(baseDenom_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, baseDenom_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(otherDenom_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, otherDenom_);
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
    if (!(obj instanceof com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest)) {
      return super.equals(obj);
    }
    com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest other = (com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest) obj;

    if (!getBaseDenom()
        .equals(other.getBaseDenom())) return false;
    if (!getOtherDenom()
        .equals(other.getOtherDenom())) return false;
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
    hash = (37 * hash) + BASE_DENOM_FIELD_NUMBER;
    hash = (53 * hash) + getBaseDenom().hashCode();
    hash = (37 * hash) + OTHER_DENOM_FIELD_NUMBER;
    hash = (53 * hash) + getOtherDenom().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest parseFrom(
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
  public static Builder newBuilder(com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest prototype) {
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
   * QueryGetProtoRevPoolRequest is request type for the
   * Query/GetProtoRevPool RPC method.
   * </pre>
   *
   * Protobuf type {@code osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest)
      com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.osmosis.protorev.v1beta1.QueryProto.internal_static_osmosis_protorev_v1beta1_QueryGetProtoRevPoolRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.osmosis.protorev.v1beta1.QueryProto.internal_static_osmosis_protorev_v1beta1_QueryGetProtoRevPoolRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest.class, com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest.Builder.class);
    }

    // Construct using com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest.newBuilder()
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
      baseDenom_ = "";
      otherDenom_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.osmosis.protorev.v1beta1.QueryProto.internal_static_osmosis_protorev_v1beta1_QueryGetProtoRevPoolRequest_descriptor;
    }

    @java.lang.Override
    public com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest getDefaultInstanceForType() {
      return com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest build() {
      com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest buildPartial() {
      com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest result = new com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.baseDenom_ = baseDenom_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.otherDenom_ = otherDenom_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest) {
        return mergeFrom((com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest other) {
      if (other == com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest.getDefaultInstance()) return this;
      if (!other.getBaseDenom().isEmpty()) {
        baseDenom_ = other.baseDenom_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getOtherDenom().isEmpty()) {
        otherDenom_ = other.otherDenom_;
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
              baseDenom_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              otherDenom_ = input.readStringRequireUtf8();
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

    private java.lang.Object baseDenom_ = "";
    /**
     * <pre>
     * base_denom is the base denom set in protorev for the denom pair to pool
     * mapping
     * </pre>
     *
     * <code>string base_denom = 1 [json_name = "baseDenom", (.gogoproto.moretags) = "yaml:&#92;"base_denom&#92;""];</code>
     * @return The baseDenom.
     */
    public java.lang.String getBaseDenom() {
      java.lang.Object ref = baseDenom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        baseDenom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * base_denom is the base denom set in protorev for the denom pair to pool
     * mapping
     * </pre>
     *
     * <code>string base_denom = 1 [json_name = "baseDenom", (.gogoproto.moretags) = "yaml:&#92;"base_denom&#92;""];</code>
     * @return The bytes for baseDenom.
     */
    public com.google.protobuf.ByteString
        getBaseDenomBytes() {
      java.lang.Object ref = baseDenom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        baseDenom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * base_denom is the base denom set in protorev for the denom pair to pool
     * mapping
     * </pre>
     *
     * <code>string base_denom = 1 [json_name = "baseDenom", (.gogoproto.moretags) = "yaml:&#92;"base_denom&#92;""];</code>
     * @param value The baseDenom to set.
     * @return This builder for chaining.
     */
    public Builder setBaseDenom(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      baseDenom_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * base_denom is the base denom set in protorev for the denom pair to pool
     * mapping
     * </pre>
     *
     * <code>string base_denom = 1 [json_name = "baseDenom", (.gogoproto.moretags) = "yaml:&#92;"base_denom&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearBaseDenom() {
      baseDenom_ = getDefaultInstance().getBaseDenom();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * base_denom is the base denom set in protorev for the denom pair to pool
     * mapping
     * </pre>
     *
     * <code>string base_denom = 1 [json_name = "baseDenom", (.gogoproto.moretags) = "yaml:&#92;"base_denom&#92;""];</code>
     * @param value The bytes for baseDenom to set.
     * @return This builder for chaining.
     */
    public Builder setBaseDenomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      baseDenom_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object otherDenom_ = "";
    /**
     * <pre>
     * other_denom is the other denom for the denom pair to pool mapping
     * </pre>
     *
     * <code>string other_denom = 2 [json_name = "otherDenom", (.gogoproto.moretags) = "yaml:&#92;"other_denom&#92;""];</code>
     * @return The otherDenom.
     */
    public java.lang.String getOtherDenom() {
      java.lang.Object ref = otherDenom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        otherDenom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * other_denom is the other denom for the denom pair to pool mapping
     * </pre>
     *
     * <code>string other_denom = 2 [json_name = "otherDenom", (.gogoproto.moretags) = "yaml:&#92;"other_denom&#92;""];</code>
     * @return The bytes for otherDenom.
     */
    public com.google.protobuf.ByteString
        getOtherDenomBytes() {
      java.lang.Object ref = otherDenom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        otherDenom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * other_denom is the other denom for the denom pair to pool mapping
     * </pre>
     *
     * <code>string other_denom = 2 [json_name = "otherDenom", (.gogoproto.moretags) = "yaml:&#92;"other_denom&#92;""];</code>
     * @param value The otherDenom to set.
     * @return This builder for chaining.
     */
    public Builder setOtherDenom(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      otherDenom_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * other_denom is the other denom for the denom pair to pool mapping
     * </pre>
     *
     * <code>string other_denom = 2 [json_name = "otherDenom", (.gogoproto.moretags) = "yaml:&#92;"other_denom&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearOtherDenom() {
      otherDenom_ = getDefaultInstance().getOtherDenom();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * other_denom is the other denom for the denom pair to pool mapping
     * </pre>
     *
     * <code>string other_denom = 2 [json_name = "otherDenom", (.gogoproto.moretags) = "yaml:&#92;"other_denom&#92;""];</code>
     * @param value The bytes for otherDenom to set.
     * @return This builder for chaining.
     */
    public Builder setOtherDenomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      otherDenom_ = value;
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


    // @@protoc_insertion_point(builder_scope:osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest)
  }

  // @@protoc_insertion_point(class_scope:osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest)
  private static final com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest();
  }

  public static com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryGetProtoRevPoolRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryGetProtoRevPoolRequest>() {
    @java.lang.Override
    public QueryGetProtoRevPoolRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryGetProtoRevPoolRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryGetProtoRevPoolRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.osmosis.protorev.v1beta1.QueryGetProtoRevPoolRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

