// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/marker/v1/query.proto

package com.provenance.marker.v1;

/**
 * <pre>
 * QueryDenomMetadataResponse is the response type for the Query/DenomMetadata
 * </pre>
 *
 * Protobuf type {@code provenance.marker.v1.QueryDenomMetadataResponse}
 */
public final class QueryDenomMetadataResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.marker.v1.QueryDenomMetadataResponse)
    QueryDenomMetadataResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryDenomMetadataResponse.newBuilder() to construct.
  private QueryDenomMetadataResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryDenomMetadataResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryDenomMetadataResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.provenance.marker.v1.QueryProto.internal_static_provenance_marker_v1_QueryDenomMetadataResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.provenance.marker.v1.QueryProto.internal_static_provenance_marker_v1_QueryDenomMetadataResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.provenance.marker.v1.QueryDenomMetadataResponse.class, com.provenance.marker.v1.QueryDenomMetadataResponse.Builder.class);
  }

  public static final int METADATA_FIELD_NUMBER = 1;
  private com.cosmos.bank.v1beta1.Metadata metadata_;
  /**
   * <code>.cosmos.bank.v1beta1.Metadata metadata = 1 [json_name = "metadata", (.gogoproto.nullable) = false];</code>
   * @return Whether the metadata field is set.
   */
  @java.lang.Override
  public boolean hasMetadata() {
    return metadata_ != null;
  }
  /**
   * <code>.cosmos.bank.v1beta1.Metadata metadata = 1 [json_name = "metadata", (.gogoproto.nullable) = false];</code>
   * @return The metadata.
   */
  @java.lang.Override
  public com.cosmos.bank.v1beta1.Metadata getMetadata() {
    return metadata_ == null ? com.cosmos.bank.v1beta1.Metadata.getDefaultInstance() : metadata_;
  }
  /**
   * <code>.cosmos.bank.v1beta1.Metadata metadata = 1 [json_name = "metadata", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.cosmos.bank.v1beta1.MetadataOrBuilder getMetadataOrBuilder() {
    return metadata_ == null ? com.cosmos.bank.v1beta1.Metadata.getDefaultInstance() : metadata_;
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
    if (metadata_ != null) {
      output.writeMessage(1, getMetadata());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (metadata_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMetadata());
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
    if (!(obj instanceof com.provenance.marker.v1.QueryDenomMetadataResponse)) {
      return super.equals(obj);
    }
    com.provenance.marker.v1.QueryDenomMetadataResponse other = (com.provenance.marker.v1.QueryDenomMetadataResponse) obj;

    if (hasMetadata() != other.hasMetadata()) return false;
    if (hasMetadata()) {
      if (!getMetadata()
          .equals(other.getMetadata())) return false;
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
    if (hasMetadata()) {
      hash = (37 * hash) + METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getMetadata().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.provenance.marker.v1.QueryDenomMetadataResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.marker.v1.QueryDenomMetadataResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.marker.v1.QueryDenomMetadataResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.marker.v1.QueryDenomMetadataResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.marker.v1.QueryDenomMetadataResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.marker.v1.QueryDenomMetadataResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.marker.v1.QueryDenomMetadataResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.marker.v1.QueryDenomMetadataResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.provenance.marker.v1.QueryDenomMetadataResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.provenance.marker.v1.QueryDenomMetadataResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.provenance.marker.v1.QueryDenomMetadataResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.marker.v1.QueryDenomMetadataResponse parseFrom(
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
  public static Builder newBuilder(com.provenance.marker.v1.QueryDenomMetadataResponse prototype) {
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
   * QueryDenomMetadataResponse is the response type for the Query/DenomMetadata
   * </pre>
   *
   * Protobuf type {@code provenance.marker.v1.QueryDenomMetadataResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.marker.v1.QueryDenomMetadataResponse)
      com.provenance.marker.v1.QueryDenomMetadataResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.provenance.marker.v1.QueryProto.internal_static_provenance_marker_v1_QueryDenomMetadataResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.provenance.marker.v1.QueryProto.internal_static_provenance_marker_v1_QueryDenomMetadataResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.provenance.marker.v1.QueryDenomMetadataResponse.class, com.provenance.marker.v1.QueryDenomMetadataResponse.Builder.class);
    }

    // Construct using com.provenance.marker.v1.QueryDenomMetadataResponse.newBuilder()
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
      metadata_ = null;
      if (metadataBuilder_ != null) {
        metadataBuilder_.dispose();
        metadataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.provenance.marker.v1.QueryProto.internal_static_provenance_marker_v1_QueryDenomMetadataResponse_descriptor;
    }

    @java.lang.Override
    public com.provenance.marker.v1.QueryDenomMetadataResponse getDefaultInstanceForType() {
      return com.provenance.marker.v1.QueryDenomMetadataResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.provenance.marker.v1.QueryDenomMetadataResponse build() {
      com.provenance.marker.v1.QueryDenomMetadataResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.provenance.marker.v1.QueryDenomMetadataResponse buildPartial() {
      com.provenance.marker.v1.QueryDenomMetadataResponse result = new com.provenance.marker.v1.QueryDenomMetadataResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.provenance.marker.v1.QueryDenomMetadataResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.metadata_ = metadataBuilder_ == null
            ? metadata_
            : metadataBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.provenance.marker.v1.QueryDenomMetadataResponse) {
        return mergeFrom((com.provenance.marker.v1.QueryDenomMetadataResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.provenance.marker.v1.QueryDenomMetadataResponse other) {
      if (other == com.provenance.marker.v1.QueryDenomMetadataResponse.getDefaultInstance()) return this;
      if (other.hasMetadata()) {
        mergeMetadata(other.getMetadata());
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
                  getMetadataFieldBuilder().getBuilder(),
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

    private com.cosmos.bank.v1beta1.Metadata metadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.bank.v1beta1.Metadata, com.cosmos.bank.v1beta1.Metadata.Builder, com.cosmos.bank.v1beta1.MetadataOrBuilder> metadataBuilder_;
    /**
     * <code>.cosmos.bank.v1beta1.Metadata metadata = 1 [json_name = "metadata", (.gogoproto.nullable) = false];</code>
     * @return Whether the metadata field is set.
     */
    public boolean hasMetadata() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.cosmos.bank.v1beta1.Metadata metadata = 1 [json_name = "metadata", (.gogoproto.nullable) = false];</code>
     * @return The metadata.
     */
    public com.cosmos.bank.v1beta1.Metadata getMetadata() {
      if (metadataBuilder_ == null) {
        return metadata_ == null ? com.cosmos.bank.v1beta1.Metadata.getDefaultInstance() : metadata_;
      } else {
        return metadataBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.bank.v1beta1.Metadata metadata = 1 [json_name = "metadata", (.gogoproto.nullable) = false];</code>
     */
    public Builder setMetadata(com.cosmos.bank.v1beta1.Metadata value) {
      if (metadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metadata_ = value;
      } else {
        metadataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.bank.v1beta1.Metadata metadata = 1 [json_name = "metadata", (.gogoproto.nullable) = false];</code>
     */
    public Builder setMetadata(
        com.cosmos.bank.v1beta1.Metadata.Builder builderForValue) {
      if (metadataBuilder_ == null) {
        metadata_ = builderForValue.build();
      } else {
        metadataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.bank.v1beta1.Metadata metadata = 1 [json_name = "metadata", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeMetadata(com.cosmos.bank.v1beta1.Metadata value) {
      if (metadataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          metadata_ != null &&
          metadata_ != com.cosmos.bank.v1beta1.Metadata.getDefaultInstance()) {
          getMetadataBuilder().mergeFrom(value);
        } else {
          metadata_ = value;
        }
      } else {
        metadataBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.bank.v1beta1.Metadata metadata = 1 [json_name = "metadata", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearMetadata() {
      bitField0_ = (bitField0_ & ~0x00000001);
      metadata_ = null;
      if (metadataBuilder_ != null) {
        metadataBuilder_.dispose();
        metadataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.bank.v1beta1.Metadata metadata = 1 [json_name = "metadata", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.bank.v1beta1.Metadata.Builder getMetadataBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMetadataFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.bank.v1beta1.Metadata metadata = 1 [json_name = "metadata", (.gogoproto.nullable) = false];</code>
     */
    public com.cosmos.bank.v1beta1.MetadataOrBuilder getMetadataOrBuilder() {
      if (metadataBuilder_ != null) {
        return metadataBuilder_.getMessageOrBuilder();
      } else {
        return metadata_ == null ?
            com.cosmos.bank.v1beta1.Metadata.getDefaultInstance() : metadata_;
      }
    }
    /**
     * <code>.cosmos.bank.v1beta1.Metadata metadata = 1 [json_name = "metadata", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.bank.v1beta1.Metadata, com.cosmos.bank.v1beta1.Metadata.Builder, com.cosmos.bank.v1beta1.MetadataOrBuilder> 
        getMetadataFieldBuilder() {
      if (metadataBuilder_ == null) {
        metadataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.bank.v1beta1.Metadata, com.cosmos.bank.v1beta1.Metadata.Builder, com.cosmos.bank.v1beta1.MetadataOrBuilder>(
                getMetadata(),
                getParentForChildren(),
                isClean());
        metadata_ = null;
      }
      return metadataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:provenance.marker.v1.QueryDenomMetadataResponse)
  }

  // @@protoc_insertion_point(class_scope:provenance.marker.v1.QueryDenomMetadataResponse)
  private static final com.provenance.marker.v1.QueryDenomMetadataResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.provenance.marker.v1.QueryDenomMetadataResponse();
  }

  public static com.provenance.marker.v1.QueryDenomMetadataResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryDenomMetadataResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryDenomMetadataResponse>() {
    @java.lang.Override
    public QueryDenomMetadataResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryDenomMetadataResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryDenomMetadataResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.provenance.marker.v1.QueryDenomMetadataResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

