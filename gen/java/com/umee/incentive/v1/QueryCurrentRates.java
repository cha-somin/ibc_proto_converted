// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: umee/incentive/v1/query.proto

package com.umee.incentive.v1;

/**
 * <pre>
 * QueryCurrentRates defines the request structure for the CurrentRates gRPC service handler.
 * </pre>
 *
 * Protobuf type {@code umee.incentive.v1.QueryCurrentRates}
 */
public final class QueryCurrentRates extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:umee.incentive.v1.QueryCurrentRates)
    QueryCurrentRatesOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryCurrentRates.newBuilder() to construct.
  private QueryCurrentRates(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryCurrentRates() {
    uToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryCurrentRates();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.umee.incentive.v1.QueryProto.internal_static_umee_incentive_v1_QueryCurrentRates_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.umee.incentive.v1.QueryProto.internal_static_umee_incentive_v1_QueryCurrentRates_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.umee.incentive.v1.QueryCurrentRates.class, com.umee.incentive.v1.QueryCurrentRates.Builder.class);
  }

  public static final int UTOKEN_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object uToken_ = "";
  /**
   * <pre>
   * uToken is the uToken denomination whose current annual rate of rewards is being queried
   * </pre>
   *
   * <code>string uToken = 1 [json_name = "uToken"];</code>
   * @return The uToken.
   */
  @java.lang.Override
  public java.lang.String getUToken() {
    java.lang.Object ref = uToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      uToken_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * uToken is the uToken denomination whose current annual rate of rewards is being queried
   * </pre>
   *
   * <code>string uToken = 1 [json_name = "uToken"];</code>
   * @return The bytes for uToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getUTokenBytes() {
    java.lang.Object ref = uToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      uToken_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, uToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(uToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, uToken_);
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
    if (!(obj instanceof com.umee.incentive.v1.QueryCurrentRates)) {
      return super.equals(obj);
    }
    com.umee.incentive.v1.QueryCurrentRates other = (com.umee.incentive.v1.QueryCurrentRates) obj;

    if (!getUToken()
        .equals(other.getUToken())) return false;
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
    hash = (37 * hash) + UTOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getUToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.umee.incentive.v1.QueryCurrentRates parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.umee.incentive.v1.QueryCurrentRates parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.umee.incentive.v1.QueryCurrentRates parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.umee.incentive.v1.QueryCurrentRates parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.umee.incentive.v1.QueryCurrentRates parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.umee.incentive.v1.QueryCurrentRates parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.umee.incentive.v1.QueryCurrentRates parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.umee.incentive.v1.QueryCurrentRates parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.umee.incentive.v1.QueryCurrentRates parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.umee.incentive.v1.QueryCurrentRates parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.umee.incentive.v1.QueryCurrentRates parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.umee.incentive.v1.QueryCurrentRates parseFrom(
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
  public static Builder newBuilder(com.umee.incentive.v1.QueryCurrentRates prototype) {
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
   * QueryCurrentRates defines the request structure for the CurrentRates gRPC service handler.
   * </pre>
   *
   * Protobuf type {@code umee.incentive.v1.QueryCurrentRates}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:umee.incentive.v1.QueryCurrentRates)
      com.umee.incentive.v1.QueryCurrentRatesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.umee.incentive.v1.QueryProto.internal_static_umee_incentive_v1_QueryCurrentRates_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.umee.incentive.v1.QueryProto.internal_static_umee_incentive_v1_QueryCurrentRates_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.umee.incentive.v1.QueryCurrentRates.class, com.umee.incentive.v1.QueryCurrentRates.Builder.class);
    }

    // Construct using com.umee.incentive.v1.QueryCurrentRates.newBuilder()
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
      uToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.umee.incentive.v1.QueryProto.internal_static_umee_incentive_v1_QueryCurrentRates_descriptor;
    }

    @java.lang.Override
    public com.umee.incentive.v1.QueryCurrentRates getDefaultInstanceForType() {
      return com.umee.incentive.v1.QueryCurrentRates.getDefaultInstance();
    }

    @java.lang.Override
    public com.umee.incentive.v1.QueryCurrentRates build() {
      com.umee.incentive.v1.QueryCurrentRates result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.umee.incentive.v1.QueryCurrentRates buildPartial() {
      com.umee.incentive.v1.QueryCurrentRates result = new com.umee.incentive.v1.QueryCurrentRates(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.umee.incentive.v1.QueryCurrentRates result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.uToken_ = uToken_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.umee.incentive.v1.QueryCurrentRates) {
        return mergeFrom((com.umee.incentive.v1.QueryCurrentRates)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.umee.incentive.v1.QueryCurrentRates other) {
      if (other == com.umee.incentive.v1.QueryCurrentRates.getDefaultInstance()) return this;
      if (!other.getUToken().isEmpty()) {
        uToken_ = other.uToken_;
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
              uToken_ = input.readStringRequireUtf8();
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

    private java.lang.Object uToken_ = "";
    /**
     * <pre>
     * uToken is the uToken denomination whose current annual rate of rewards is being queried
     * </pre>
     *
     * <code>string uToken = 1 [json_name = "uToken"];</code>
     * @return The uToken.
     */
    public java.lang.String getUToken() {
      java.lang.Object ref = uToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        uToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * uToken is the uToken denomination whose current annual rate of rewards is being queried
     * </pre>
     *
     * <code>string uToken = 1 [json_name = "uToken"];</code>
     * @return The bytes for uToken.
     */
    public com.google.protobuf.ByteString
        getUTokenBytes() {
      java.lang.Object ref = uToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        uToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * uToken is the uToken denomination whose current annual rate of rewards is being queried
     * </pre>
     *
     * <code>string uToken = 1 [json_name = "uToken"];</code>
     * @param value The uToken to set.
     * @return This builder for chaining.
     */
    public Builder setUToken(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      uToken_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * uToken is the uToken denomination whose current annual rate of rewards is being queried
     * </pre>
     *
     * <code>string uToken = 1 [json_name = "uToken"];</code>
     * @return This builder for chaining.
     */
    public Builder clearUToken() {
      uToken_ = getDefaultInstance().getUToken();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * uToken is the uToken denomination whose current annual rate of rewards is being queried
     * </pre>
     *
     * <code>string uToken = 1 [json_name = "uToken"];</code>
     * @param value The bytes for uToken to set.
     * @return This builder for chaining.
     */
    public Builder setUTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      uToken_ = value;
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


    // @@protoc_insertion_point(builder_scope:umee.incentive.v1.QueryCurrentRates)
  }

  // @@protoc_insertion_point(class_scope:umee.incentive.v1.QueryCurrentRates)
  private static final com.umee.incentive.v1.QueryCurrentRates DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.umee.incentive.v1.QueryCurrentRates();
  }

  public static com.umee.incentive.v1.QueryCurrentRates getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryCurrentRates>
      PARSER = new com.google.protobuf.AbstractParser<QueryCurrentRates>() {
    @java.lang.Override
    public QueryCurrentRates parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryCurrentRates> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryCurrentRates> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.umee.incentive.v1.QueryCurrentRates getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

