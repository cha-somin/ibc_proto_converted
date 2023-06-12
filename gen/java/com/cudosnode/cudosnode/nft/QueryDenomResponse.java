// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cudos/nft/query.proto

package com.cudosnode.cudosnode.nft;

/**
 * <pre>
 * QueryDenomResponse is the response type for the Query/Denom RPC method
 * </pre>
 *
 * Protobuf type {@code cudosnode.cudosnode.nft.QueryDenomResponse}
 */
public final class QueryDenomResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cudosnode.cudosnode.nft.QueryDenomResponse)
    QueryDenomResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryDenomResponse.newBuilder() to construct.
  private QueryDenomResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryDenomResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryDenomResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cudosnode.cudosnode.nft.QueryProto.internal_static_cudosnode_cudosnode_nft_QueryDenomResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cudosnode.cudosnode.nft.QueryProto.internal_static_cudosnode_cudosnode_nft_QueryDenomResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cudosnode.cudosnode.nft.QueryDenomResponse.class, com.cudosnode.cudosnode.nft.QueryDenomResponse.Builder.class);
  }

  public static final int DENOM_FIELD_NUMBER = 1;
  private com.cudosnode.cudosnode.nft.Denom denom_;
  /**
   * <code>.cudosnode.cudosnode.nft.Denom denom = 1 [json_name = "denom"];</code>
   * @return Whether the denom field is set.
   */
  @java.lang.Override
  public boolean hasDenom() {
    return denom_ != null;
  }
  /**
   * <code>.cudosnode.cudosnode.nft.Denom denom = 1 [json_name = "denom"];</code>
   * @return The denom.
   */
  @java.lang.Override
  public com.cudosnode.cudosnode.nft.Denom getDenom() {
    return denom_ == null ? com.cudosnode.cudosnode.nft.Denom.getDefaultInstance() : denom_;
  }
  /**
   * <code>.cudosnode.cudosnode.nft.Denom denom = 1 [json_name = "denom"];</code>
   */
  @java.lang.Override
  public com.cudosnode.cudosnode.nft.DenomOrBuilder getDenomOrBuilder() {
    return denom_ == null ? com.cudosnode.cudosnode.nft.Denom.getDefaultInstance() : denom_;
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
    if (denom_ != null) {
      output.writeMessage(1, getDenom());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (denom_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getDenom());
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
    if (!(obj instanceof com.cudosnode.cudosnode.nft.QueryDenomResponse)) {
      return super.equals(obj);
    }
    com.cudosnode.cudosnode.nft.QueryDenomResponse other = (com.cudosnode.cudosnode.nft.QueryDenomResponse) obj;

    if (hasDenom() != other.hasDenom()) return false;
    if (hasDenom()) {
      if (!getDenom()
          .equals(other.getDenom())) return false;
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
    if (hasDenom()) {
      hash = (37 * hash) + DENOM_FIELD_NUMBER;
      hash = (53 * hash) + getDenom().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cudosnode.cudosnode.nft.QueryDenomResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cudosnode.cudosnode.nft.QueryDenomResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cudosnode.cudosnode.nft.QueryDenomResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cudosnode.cudosnode.nft.QueryDenomResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cudosnode.cudosnode.nft.QueryDenomResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cudosnode.cudosnode.nft.QueryDenomResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cudosnode.cudosnode.nft.QueryDenomResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cudosnode.cudosnode.nft.QueryDenomResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cudosnode.cudosnode.nft.QueryDenomResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cudosnode.cudosnode.nft.QueryDenomResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cudosnode.cudosnode.nft.QueryDenomResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cudosnode.cudosnode.nft.QueryDenomResponse parseFrom(
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
  public static Builder newBuilder(com.cudosnode.cudosnode.nft.QueryDenomResponse prototype) {
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
   * QueryDenomResponse is the response type for the Query/Denom RPC method
   * </pre>
   *
   * Protobuf type {@code cudosnode.cudosnode.nft.QueryDenomResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cudosnode.cudosnode.nft.QueryDenomResponse)
      com.cudosnode.cudosnode.nft.QueryDenomResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cudosnode.cudosnode.nft.QueryProto.internal_static_cudosnode_cudosnode_nft_QueryDenomResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cudosnode.cudosnode.nft.QueryProto.internal_static_cudosnode_cudosnode_nft_QueryDenomResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cudosnode.cudosnode.nft.QueryDenomResponse.class, com.cudosnode.cudosnode.nft.QueryDenomResponse.Builder.class);
    }

    // Construct using com.cudosnode.cudosnode.nft.QueryDenomResponse.newBuilder()
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
      denom_ = null;
      if (denomBuilder_ != null) {
        denomBuilder_.dispose();
        denomBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cudosnode.cudosnode.nft.QueryProto.internal_static_cudosnode_cudosnode_nft_QueryDenomResponse_descriptor;
    }

    @java.lang.Override
    public com.cudosnode.cudosnode.nft.QueryDenomResponse getDefaultInstanceForType() {
      return com.cudosnode.cudosnode.nft.QueryDenomResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.cudosnode.cudosnode.nft.QueryDenomResponse build() {
      com.cudosnode.cudosnode.nft.QueryDenomResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cudosnode.cudosnode.nft.QueryDenomResponse buildPartial() {
      com.cudosnode.cudosnode.nft.QueryDenomResponse result = new com.cudosnode.cudosnode.nft.QueryDenomResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cudosnode.cudosnode.nft.QueryDenomResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.denom_ = denomBuilder_ == null
            ? denom_
            : denomBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cudosnode.cudosnode.nft.QueryDenomResponse) {
        return mergeFrom((com.cudosnode.cudosnode.nft.QueryDenomResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cudosnode.cudosnode.nft.QueryDenomResponse other) {
      if (other == com.cudosnode.cudosnode.nft.QueryDenomResponse.getDefaultInstance()) return this;
      if (other.hasDenom()) {
        mergeDenom(other.getDenom());
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
                  getDenomFieldBuilder().getBuilder(),
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

    private com.cudosnode.cudosnode.nft.Denom denom_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cudosnode.cudosnode.nft.Denom, com.cudosnode.cudosnode.nft.Denom.Builder, com.cudosnode.cudosnode.nft.DenomOrBuilder> denomBuilder_;
    /**
     * <code>.cudosnode.cudosnode.nft.Denom denom = 1 [json_name = "denom"];</code>
     * @return Whether the denom field is set.
     */
    public boolean hasDenom() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.cudosnode.cudosnode.nft.Denom denom = 1 [json_name = "denom"];</code>
     * @return The denom.
     */
    public com.cudosnode.cudosnode.nft.Denom getDenom() {
      if (denomBuilder_ == null) {
        return denom_ == null ? com.cudosnode.cudosnode.nft.Denom.getDefaultInstance() : denom_;
      } else {
        return denomBuilder_.getMessage();
      }
    }
    /**
     * <code>.cudosnode.cudosnode.nft.Denom denom = 1 [json_name = "denom"];</code>
     */
    public Builder setDenom(com.cudosnode.cudosnode.nft.Denom value) {
      if (denomBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        denom_ = value;
      } else {
        denomBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.cudosnode.cudosnode.nft.Denom denom = 1 [json_name = "denom"];</code>
     */
    public Builder setDenom(
        com.cudosnode.cudosnode.nft.Denom.Builder builderForValue) {
      if (denomBuilder_ == null) {
        denom_ = builderForValue.build();
      } else {
        denomBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.cudosnode.cudosnode.nft.Denom denom = 1 [json_name = "denom"];</code>
     */
    public Builder mergeDenom(com.cudosnode.cudosnode.nft.Denom value) {
      if (denomBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          denom_ != null &&
          denom_ != com.cudosnode.cudosnode.nft.Denom.getDefaultInstance()) {
          getDenomBuilder().mergeFrom(value);
        } else {
          denom_ = value;
        }
      } else {
        denomBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.cudosnode.cudosnode.nft.Denom denom = 1 [json_name = "denom"];</code>
     */
    public Builder clearDenom() {
      bitField0_ = (bitField0_ & ~0x00000001);
      denom_ = null;
      if (denomBuilder_ != null) {
        denomBuilder_.dispose();
        denomBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cudosnode.cudosnode.nft.Denom denom = 1 [json_name = "denom"];</code>
     */
    public com.cudosnode.cudosnode.nft.Denom.Builder getDenomBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDenomFieldBuilder().getBuilder();
    }
    /**
     * <code>.cudosnode.cudosnode.nft.Denom denom = 1 [json_name = "denom"];</code>
     */
    public com.cudosnode.cudosnode.nft.DenomOrBuilder getDenomOrBuilder() {
      if (denomBuilder_ != null) {
        return denomBuilder_.getMessageOrBuilder();
      } else {
        return denom_ == null ?
            com.cudosnode.cudosnode.nft.Denom.getDefaultInstance() : denom_;
      }
    }
    /**
     * <code>.cudosnode.cudosnode.nft.Denom denom = 1 [json_name = "denom"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cudosnode.cudosnode.nft.Denom, com.cudosnode.cudosnode.nft.Denom.Builder, com.cudosnode.cudosnode.nft.DenomOrBuilder> 
        getDenomFieldBuilder() {
      if (denomBuilder_ == null) {
        denomBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cudosnode.cudosnode.nft.Denom, com.cudosnode.cudosnode.nft.Denom.Builder, com.cudosnode.cudosnode.nft.DenomOrBuilder>(
                getDenom(),
                getParentForChildren(),
                isClean());
        denom_ = null;
      }
      return denomBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cudosnode.cudosnode.nft.QueryDenomResponse)
  }

  // @@protoc_insertion_point(class_scope:cudosnode.cudosnode.nft.QueryDenomResponse)
  private static final com.cudosnode.cudosnode.nft.QueryDenomResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cudosnode.cudosnode.nft.QueryDenomResponse();
  }

  public static com.cudosnode.cudosnode.nft.QueryDenomResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryDenomResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryDenomResponse>() {
    @java.lang.Override
    public QueryDenomResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryDenomResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryDenomResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cudosnode.cudosnode.nft.QueryDenomResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

