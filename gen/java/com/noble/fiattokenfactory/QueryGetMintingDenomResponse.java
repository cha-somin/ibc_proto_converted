// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: noble/fiattokenfactory/query.proto

package com.noble.fiattokenfactory;

/**
 * Protobuf type {@code noble.fiattokenfactory.QueryGetMintingDenomResponse}
 */
public final class QueryGetMintingDenomResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:noble.fiattokenfactory.QueryGetMintingDenomResponse)
    QueryGetMintingDenomResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryGetMintingDenomResponse.newBuilder() to construct.
  private QueryGetMintingDenomResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryGetMintingDenomResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryGetMintingDenomResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.noble.fiattokenfactory.QueryProto.internal_static_noble_fiattokenfactory_QueryGetMintingDenomResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.noble.fiattokenfactory.QueryProto.internal_static_noble_fiattokenfactory_QueryGetMintingDenomResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.noble.fiattokenfactory.QueryGetMintingDenomResponse.class, com.noble.fiattokenfactory.QueryGetMintingDenomResponse.Builder.class);
  }

  public static final int MINTINGDENOM_FIELD_NUMBER = 1;
  private com.noble.fiattokenfactory.MintingDenom mintingDenom_;
  /**
   * <code>.noble.fiattokenfactory.MintingDenom mintingDenom = 1 [json_name = "mintingDenom", (.gogoproto.nullable) = false];</code>
   * @return Whether the mintingDenom field is set.
   */
  @java.lang.Override
  public boolean hasMintingDenom() {
    return mintingDenom_ != null;
  }
  /**
   * <code>.noble.fiattokenfactory.MintingDenom mintingDenom = 1 [json_name = "mintingDenom", (.gogoproto.nullable) = false];</code>
   * @return The mintingDenom.
   */
  @java.lang.Override
  public com.noble.fiattokenfactory.MintingDenom getMintingDenom() {
    return mintingDenom_ == null ? com.noble.fiattokenfactory.MintingDenom.getDefaultInstance() : mintingDenom_;
  }
  /**
   * <code>.noble.fiattokenfactory.MintingDenom mintingDenom = 1 [json_name = "mintingDenom", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.noble.fiattokenfactory.MintingDenomOrBuilder getMintingDenomOrBuilder() {
    return mintingDenom_ == null ? com.noble.fiattokenfactory.MintingDenom.getDefaultInstance() : mintingDenom_;
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
    if (mintingDenom_ != null) {
      output.writeMessage(1, getMintingDenom());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (mintingDenom_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getMintingDenom());
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
    if (!(obj instanceof com.noble.fiattokenfactory.QueryGetMintingDenomResponse)) {
      return super.equals(obj);
    }
    com.noble.fiattokenfactory.QueryGetMintingDenomResponse other = (com.noble.fiattokenfactory.QueryGetMintingDenomResponse) obj;

    if (hasMintingDenom() != other.hasMintingDenom()) return false;
    if (hasMintingDenom()) {
      if (!getMintingDenom()
          .equals(other.getMintingDenom())) return false;
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
    if (hasMintingDenom()) {
      hash = (37 * hash) + MINTINGDENOM_FIELD_NUMBER;
      hash = (53 * hash) + getMintingDenom().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.noble.fiattokenfactory.QueryGetMintingDenomResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.noble.fiattokenfactory.QueryGetMintingDenomResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.noble.fiattokenfactory.QueryGetMintingDenomResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.noble.fiattokenfactory.QueryGetMintingDenomResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.noble.fiattokenfactory.QueryGetMintingDenomResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.noble.fiattokenfactory.QueryGetMintingDenomResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.noble.fiattokenfactory.QueryGetMintingDenomResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.noble.fiattokenfactory.QueryGetMintingDenomResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.noble.fiattokenfactory.QueryGetMintingDenomResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.noble.fiattokenfactory.QueryGetMintingDenomResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.noble.fiattokenfactory.QueryGetMintingDenomResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.noble.fiattokenfactory.QueryGetMintingDenomResponse parseFrom(
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
  public static Builder newBuilder(com.noble.fiattokenfactory.QueryGetMintingDenomResponse prototype) {
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
   * Protobuf type {@code noble.fiattokenfactory.QueryGetMintingDenomResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:noble.fiattokenfactory.QueryGetMintingDenomResponse)
      com.noble.fiattokenfactory.QueryGetMintingDenomResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.noble.fiattokenfactory.QueryProto.internal_static_noble_fiattokenfactory_QueryGetMintingDenomResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.noble.fiattokenfactory.QueryProto.internal_static_noble_fiattokenfactory_QueryGetMintingDenomResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.noble.fiattokenfactory.QueryGetMintingDenomResponse.class, com.noble.fiattokenfactory.QueryGetMintingDenomResponse.Builder.class);
    }

    // Construct using com.noble.fiattokenfactory.QueryGetMintingDenomResponse.newBuilder()
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
      mintingDenom_ = null;
      if (mintingDenomBuilder_ != null) {
        mintingDenomBuilder_.dispose();
        mintingDenomBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.noble.fiattokenfactory.QueryProto.internal_static_noble_fiattokenfactory_QueryGetMintingDenomResponse_descriptor;
    }

    @java.lang.Override
    public com.noble.fiattokenfactory.QueryGetMintingDenomResponse getDefaultInstanceForType() {
      return com.noble.fiattokenfactory.QueryGetMintingDenomResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.noble.fiattokenfactory.QueryGetMintingDenomResponse build() {
      com.noble.fiattokenfactory.QueryGetMintingDenomResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.noble.fiattokenfactory.QueryGetMintingDenomResponse buildPartial() {
      com.noble.fiattokenfactory.QueryGetMintingDenomResponse result = new com.noble.fiattokenfactory.QueryGetMintingDenomResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.noble.fiattokenfactory.QueryGetMintingDenomResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.mintingDenom_ = mintingDenomBuilder_ == null
            ? mintingDenom_
            : mintingDenomBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.noble.fiattokenfactory.QueryGetMintingDenomResponse) {
        return mergeFrom((com.noble.fiattokenfactory.QueryGetMintingDenomResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.noble.fiattokenfactory.QueryGetMintingDenomResponse other) {
      if (other == com.noble.fiattokenfactory.QueryGetMintingDenomResponse.getDefaultInstance()) return this;
      if (other.hasMintingDenom()) {
        mergeMintingDenom(other.getMintingDenom());
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
                  getMintingDenomFieldBuilder().getBuilder(),
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

    private com.noble.fiattokenfactory.MintingDenom mintingDenom_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.noble.fiattokenfactory.MintingDenom, com.noble.fiattokenfactory.MintingDenom.Builder, com.noble.fiattokenfactory.MintingDenomOrBuilder> mintingDenomBuilder_;
    /**
     * <code>.noble.fiattokenfactory.MintingDenom mintingDenom = 1 [json_name = "mintingDenom", (.gogoproto.nullable) = false];</code>
     * @return Whether the mintingDenom field is set.
     */
    public boolean hasMintingDenom() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.noble.fiattokenfactory.MintingDenom mintingDenom = 1 [json_name = "mintingDenom", (.gogoproto.nullable) = false];</code>
     * @return The mintingDenom.
     */
    public com.noble.fiattokenfactory.MintingDenom getMintingDenom() {
      if (mintingDenomBuilder_ == null) {
        return mintingDenom_ == null ? com.noble.fiattokenfactory.MintingDenom.getDefaultInstance() : mintingDenom_;
      } else {
        return mintingDenomBuilder_.getMessage();
      }
    }
    /**
     * <code>.noble.fiattokenfactory.MintingDenom mintingDenom = 1 [json_name = "mintingDenom", (.gogoproto.nullable) = false];</code>
     */
    public Builder setMintingDenom(com.noble.fiattokenfactory.MintingDenom value) {
      if (mintingDenomBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        mintingDenom_ = value;
      } else {
        mintingDenomBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.noble.fiattokenfactory.MintingDenom mintingDenom = 1 [json_name = "mintingDenom", (.gogoproto.nullable) = false];</code>
     */
    public Builder setMintingDenom(
        com.noble.fiattokenfactory.MintingDenom.Builder builderForValue) {
      if (mintingDenomBuilder_ == null) {
        mintingDenom_ = builderForValue.build();
      } else {
        mintingDenomBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.noble.fiattokenfactory.MintingDenom mintingDenom = 1 [json_name = "mintingDenom", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeMintingDenom(com.noble.fiattokenfactory.MintingDenom value) {
      if (mintingDenomBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          mintingDenom_ != null &&
          mintingDenom_ != com.noble.fiattokenfactory.MintingDenom.getDefaultInstance()) {
          getMintingDenomBuilder().mergeFrom(value);
        } else {
          mintingDenom_ = value;
        }
      } else {
        mintingDenomBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.noble.fiattokenfactory.MintingDenom mintingDenom = 1 [json_name = "mintingDenom", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearMintingDenom() {
      bitField0_ = (bitField0_ & ~0x00000001);
      mintingDenom_ = null;
      if (mintingDenomBuilder_ != null) {
        mintingDenomBuilder_.dispose();
        mintingDenomBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.noble.fiattokenfactory.MintingDenom mintingDenom = 1 [json_name = "mintingDenom", (.gogoproto.nullable) = false];</code>
     */
    public com.noble.fiattokenfactory.MintingDenom.Builder getMintingDenomBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMintingDenomFieldBuilder().getBuilder();
    }
    /**
     * <code>.noble.fiattokenfactory.MintingDenom mintingDenom = 1 [json_name = "mintingDenom", (.gogoproto.nullable) = false];</code>
     */
    public com.noble.fiattokenfactory.MintingDenomOrBuilder getMintingDenomOrBuilder() {
      if (mintingDenomBuilder_ != null) {
        return mintingDenomBuilder_.getMessageOrBuilder();
      } else {
        return mintingDenom_ == null ?
            com.noble.fiattokenfactory.MintingDenom.getDefaultInstance() : mintingDenom_;
      }
    }
    /**
     * <code>.noble.fiattokenfactory.MintingDenom mintingDenom = 1 [json_name = "mintingDenom", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.noble.fiattokenfactory.MintingDenom, com.noble.fiattokenfactory.MintingDenom.Builder, com.noble.fiattokenfactory.MintingDenomOrBuilder> 
        getMintingDenomFieldBuilder() {
      if (mintingDenomBuilder_ == null) {
        mintingDenomBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.noble.fiattokenfactory.MintingDenom, com.noble.fiattokenfactory.MintingDenom.Builder, com.noble.fiattokenfactory.MintingDenomOrBuilder>(
                getMintingDenom(),
                getParentForChildren(),
                isClean());
        mintingDenom_ = null;
      }
      return mintingDenomBuilder_;
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


    // @@protoc_insertion_point(builder_scope:noble.fiattokenfactory.QueryGetMintingDenomResponse)
  }

  // @@protoc_insertion_point(class_scope:noble.fiattokenfactory.QueryGetMintingDenomResponse)
  private static final com.noble.fiattokenfactory.QueryGetMintingDenomResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.noble.fiattokenfactory.QueryGetMintingDenomResponse();
  }

  public static com.noble.fiattokenfactory.QueryGetMintingDenomResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryGetMintingDenomResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryGetMintingDenomResponse>() {
    @java.lang.Override
    public QueryGetMintingDenomResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryGetMintingDenomResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryGetMintingDenomResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.noble.fiattokenfactory.QueryGetMintingDenomResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

