// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: quicksilver/tokenfactory/v1beta1/query.proto

package com.quicksilver.tokenfactory.v1beta1;

/**
 * <pre>
 * QueryDenomAuthorityMetadataResponse defines the response structure for the
 * DenomAuthorityMetadata gRPC query.
 * </pre>
 *
 * Protobuf type {@code quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse}
 */
public final class QueryDenomAuthorityMetadataResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse)
    QueryDenomAuthorityMetadataResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryDenomAuthorityMetadataResponse.newBuilder() to construct.
  private QueryDenomAuthorityMetadataResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryDenomAuthorityMetadataResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryDenomAuthorityMetadataResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.quicksilver.tokenfactory.v1beta1.QueryProto.internal_static_quicksilver_tokenfactory_v1beta1_QueryDenomAuthorityMetadataResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.quicksilver.tokenfactory.v1beta1.QueryProto.internal_static_quicksilver_tokenfactory_v1beta1_QueryDenomAuthorityMetadataResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse.class, com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse.Builder.class);
  }

  public static final int AUTHORITY_METADATA_FIELD_NUMBER = 1;
  private com.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata authorityMetadata_;
  /**
   * <code>.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata authority_metadata = 1 [json_name = "authorityMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"authority_metadata&#92;""];</code>
   * @return Whether the authorityMetadata field is set.
   */
  @java.lang.Override
  public boolean hasAuthorityMetadata() {
    return authorityMetadata_ != null;
  }
  /**
   * <code>.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata authority_metadata = 1 [json_name = "authorityMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"authority_metadata&#92;""];</code>
   * @return The authorityMetadata.
   */
  @java.lang.Override
  public com.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata getAuthorityMetadata() {
    return authorityMetadata_ == null ? com.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata.getDefaultInstance() : authorityMetadata_;
  }
  /**
   * <code>.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata authority_metadata = 1 [json_name = "authorityMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"authority_metadata&#92;""];</code>
   */
  @java.lang.Override
  public com.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadataOrBuilder getAuthorityMetadataOrBuilder() {
    return authorityMetadata_ == null ? com.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata.getDefaultInstance() : authorityMetadata_;
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
    if (authorityMetadata_ != null) {
      output.writeMessage(1, getAuthorityMetadata());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (authorityMetadata_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAuthorityMetadata());
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
    if (!(obj instanceof com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse)) {
      return super.equals(obj);
    }
    com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse other = (com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse) obj;

    if (hasAuthorityMetadata() != other.hasAuthorityMetadata()) return false;
    if (hasAuthorityMetadata()) {
      if (!getAuthorityMetadata()
          .equals(other.getAuthorityMetadata())) return false;
    }
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
    if (hasAuthorityMetadata()) {
      hash = (37 * hash) + AUTHORITY_METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getAuthorityMetadata().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse parseFrom(
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
  public static Builder newBuilder(com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse prototype) {
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
   * QueryDenomAuthorityMetadataResponse defines the response structure for the
   * DenomAuthorityMetadata gRPC query.
   * </pre>
   *
   * Protobuf type {@code quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse)
      com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.quicksilver.tokenfactory.v1beta1.QueryProto.internal_static_quicksilver_tokenfactory_v1beta1_QueryDenomAuthorityMetadataResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.quicksilver.tokenfactory.v1beta1.QueryProto.internal_static_quicksilver_tokenfactory_v1beta1_QueryDenomAuthorityMetadataResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse.class, com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse.Builder.class);
    }

    // Construct using com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse.newBuilder()
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
      authorityMetadata_ = null;
      if (authorityMetadataBuilder_ != null) {
        authorityMetadataBuilder_.dispose();
        authorityMetadataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.quicksilver.tokenfactory.v1beta1.QueryProto.internal_static_quicksilver_tokenfactory_v1beta1_QueryDenomAuthorityMetadataResponse_descriptor;
    }

    @java.lang.Override
    public com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse getDefaultInstanceForType() {
      return com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse build() {
      com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse buildPartial() {
      com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse result = new com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.authorityMetadata_ = authorityMetadataBuilder_ == null
            ? authorityMetadata_
            : authorityMetadataBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse) {
        return mergeFrom((com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse other) {
      if (other == com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse.getDefaultInstance()) return this;
      if (other.hasAuthorityMetadata()) {
        mergeAuthorityMetadata(other.getAuthorityMetadata());
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
              input.readMessage(
                  getAuthorityMetadataFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private com.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata authorityMetadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata, com.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata.Builder, com.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadataOrBuilder> authorityMetadataBuilder_;
    /**
     * <code>.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata authority_metadata = 1 [json_name = "authorityMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"authority_metadata&#92;""];</code>
     * @return Whether the authorityMetadata field is set.
     */
    public boolean hasAuthorityMetadata() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata authority_metadata = 1 [json_name = "authorityMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"authority_metadata&#92;""];</code>
     * @return The authorityMetadata.
     */
    public com.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata getAuthorityMetadata() {
      if (authorityMetadataBuilder_ == null) {
        return authorityMetadata_ == null ? com.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata.getDefaultInstance() : authorityMetadata_;
      } else {
        return authorityMetadataBuilder_.getMessage();
      }
    }
    /**
     * <code>.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata authority_metadata = 1 [json_name = "authorityMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"authority_metadata&#92;""];</code>
     */
    public Builder setAuthorityMetadata(com.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata value) {
      if (authorityMetadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        authorityMetadata_ = value;
      } else {
        authorityMetadataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata authority_metadata = 1 [json_name = "authorityMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"authority_metadata&#92;""];</code>
     */
    public Builder setAuthorityMetadata(
        com.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata.Builder builderForValue) {
      if (authorityMetadataBuilder_ == null) {
        authorityMetadata_ = builderForValue.build();
      } else {
        authorityMetadataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata authority_metadata = 1 [json_name = "authorityMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"authority_metadata&#92;""];</code>
     */
    public Builder mergeAuthorityMetadata(com.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata value) {
      if (authorityMetadataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          authorityMetadata_ != null &&
          authorityMetadata_ != com.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata.getDefaultInstance()) {
          getAuthorityMetadataBuilder().mergeFrom(value);
        } else {
          authorityMetadata_ = value;
        }
      } else {
        authorityMetadataBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata authority_metadata = 1 [json_name = "authorityMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"authority_metadata&#92;""];</code>
     */
    public Builder clearAuthorityMetadata() {
      bitField0_ = (bitField0_ & ~0x00000001);
      authorityMetadata_ = null;
      if (authorityMetadataBuilder_ != null) {
        authorityMetadataBuilder_.dispose();
        authorityMetadataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata authority_metadata = 1 [json_name = "authorityMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"authority_metadata&#92;""];</code>
     */
    public com.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata.Builder getAuthorityMetadataBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAuthorityMetadataFieldBuilder().getBuilder();
    }
    /**
     * <code>.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata authority_metadata = 1 [json_name = "authorityMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"authority_metadata&#92;""];</code>
     */
    public com.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadataOrBuilder getAuthorityMetadataOrBuilder() {
      if (authorityMetadataBuilder_ != null) {
        return authorityMetadataBuilder_.getMessageOrBuilder();
      } else {
        return authorityMetadata_ == null ?
            com.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata.getDefaultInstance() : authorityMetadata_;
      }
    }
    /**
     * <code>.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata authority_metadata = 1 [json_name = "authorityMetadata", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"authority_metadata&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata, com.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata.Builder, com.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadataOrBuilder> 
        getAuthorityMetadataFieldBuilder() {
      if (authorityMetadataBuilder_ == null) {
        authorityMetadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata, com.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadata.Builder, com.quicksilver.tokenfactory.v1beta1.DenomAuthorityMetadataOrBuilder>(
                getAuthorityMetadata(),
                getParentForChildren(),
                isClean());
        authorityMetadata_ = null;
      }
      return authorityMetadataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse)
  }

  // @@protoc_insertion_point(class_scope:quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse)
  private static final com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse();
  }

  public static com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryDenomAuthorityMetadataResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryDenomAuthorityMetadataResponse>() {
    @java.lang.Override
    public QueryDenomAuthorityMetadataResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryDenomAuthorityMetadataResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryDenomAuthorityMetadataResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.quicksilver.tokenfactory.v1beta1.QueryDenomAuthorityMetadataResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

