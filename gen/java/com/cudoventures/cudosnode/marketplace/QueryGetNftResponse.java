// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cudos/marketplace/query.proto

package com.cudoventures.cudosnode.marketplace;

/**
 * Protobuf type {@code cudoventures.cudosnode.marketplace.QueryGetNftResponse}
 */
public final class QueryGetNftResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cudoventures.cudosnode.marketplace.QueryGetNftResponse)
    QueryGetNftResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryGetNftResponse.newBuilder() to construct.
  private QueryGetNftResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryGetNftResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryGetNftResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cudoventures.cudosnode.marketplace.QueryProto.internal_static_cudoventures_cudosnode_marketplace_QueryGetNftResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cudoventures.cudosnode.marketplace.QueryProto.internal_static_cudoventures_cudosnode_marketplace_QueryGetNftResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cudoventures.cudosnode.marketplace.QueryGetNftResponse.class, com.cudoventures.cudosnode.marketplace.QueryGetNftResponse.Builder.class);
  }

  public static final int NFT_FIELD_NUMBER = 1;
  private com.cudoventures.cudosnode.marketplace.Nft nft_;
  /**
   * <code>.cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
   * @return Whether the nft field is set.
   */
  @java.lang.Override
  public boolean hasNft() {
    return nft_ != null;
  }
  /**
   * <code>.cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
   * @return The nft.
   */
  @java.lang.Override
  public com.cudoventures.cudosnode.marketplace.Nft getNft() {
    return nft_ == null ? com.cudoventures.cudosnode.marketplace.Nft.getDefaultInstance() : nft_;
  }
  /**
   * <code>.cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.cudoventures.cudosnode.marketplace.NftOrBuilder getNftOrBuilder() {
    return nft_ == null ? com.cudoventures.cudosnode.marketplace.Nft.getDefaultInstance() : nft_;
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
    if (nft_ != null) {
      output.writeMessage(1, getNft());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (nft_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getNft());
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
    if (!(obj instanceof com.cudoventures.cudosnode.marketplace.QueryGetNftResponse)) {
      return super.equals(obj);
    }
    com.cudoventures.cudosnode.marketplace.QueryGetNftResponse other = (com.cudoventures.cudosnode.marketplace.QueryGetNftResponse) obj;

    if (hasNft() != other.hasNft()) return false;
    if (hasNft()) {
      if (!getNft()
          .equals(other.getNft())) return false;
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
    if (hasNft()) {
      hash = (37 * hash) + NFT_FIELD_NUMBER;
      hash = (53 * hash) + getNft().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cudoventures.cudosnode.marketplace.QueryGetNftResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cudoventures.cudosnode.marketplace.QueryGetNftResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cudoventures.cudosnode.marketplace.QueryGetNftResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cudoventures.cudosnode.marketplace.QueryGetNftResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cudoventures.cudosnode.marketplace.QueryGetNftResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cudoventures.cudosnode.marketplace.QueryGetNftResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cudoventures.cudosnode.marketplace.QueryGetNftResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cudoventures.cudosnode.marketplace.QueryGetNftResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cudoventures.cudosnode.marketplace.QueryGetNftResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cudoventures.cudosnode.marketplace.QueryGetNftResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cudoventures.cudosnode.marketplace.QueryGetNftResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cudoventures.cudosnode.marketplace.QueryGetNftResponse parseFrom(
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
  public static Builder newBuilder(com.cudoventures.cudosnode.marketplace.QueryGetNftResponse prototype) {
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
   * Protobuf type {@code cudoventures.cudosnode.marketplace.QueryGetNftResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cudoventures.cudosnode.marketplace.QueryGetNftResponse)
      com.cudoventures.cudosnode.marketplace.QueryGetNftResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cudoventures.cudosnode.marketplace.QueryProto.internal_static_cudoventures_cudosnode_marketplace_QueryGetNftResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cudoventures.cudosnode.marketplace.QueryProto.internal_static_cudoventures_cudosnode_marketplace_QueryGetNftResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cudoventures.cudosnode.marketplace.QueryGetNftResponse.class, com.cudoventures.cudosnode.marketplace.QueryGetNftResponse.Builder.class);
    }

    // Construct using com.cudoventures.cudosnode.marketplace.QueryGetNftResponse.newBuilder()
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
      nft_ = null;
      if (nftBuilder_ != null) {
        nftBuilder_.dispose();
        nftBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cudoventures.cudosnode.marketplace.QueryProto.internal_static_cudoventures_cudosnode_marketplace_QueryGetNftResponse_descriptor;
    }

    @java.lang.Override
    public com.cudoventures.cudosnode.marketplace.QueryGetNftResponse getDefaultInstanceForType() {
      return com.cudoventures.cudosnode.marketplace.QueryGetNftResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.cudoventures.cudosnode.marketplace.QueryGetNftResponse build() {
      com.cudoventures.cudosnode.marketplace.QueryGetNftResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cudoventures.cudosnode.marketplace.QueryGetNftResponse buildPartial() {
      com.cudoventures.cudosnode.marketplace.QueryGetNftResponse result = new com.cudoventures.cudosnode.marketplace.QueryGetNftResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.cudoventures.cudosnode.marketplace.QueryGetNftResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.nft_ = nftBuilder_ == null
            ? nft_
            : nftBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cudoventures.cudosnode.marketplace.QueryGetNftResponse) {
        return mergeFrom((com.cudoventures.cudosnode.marketplace.QueryGetNftResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cudoventures.cudosnode.marketplace.QueryGetNftResponse other) {
      if (other == com.cudoventures.cudosnode.marketplace.QueryGetNftResponse.getDefaultInstance()) return this;
      if (other.hasNft()) {
        mergeNft(other.getNft());
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
                  getNftFieldBuilder().getBuilder(),
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

    private com.cudoventures.cudosnode.marketplace.Nft nft_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cudoventures.cudosnode.marketplace.Nft, com.cudoventures.cudosnode.marketplace.Nft.Builder, com.cudoventures.cudosnode.marketplace.NftOrBuilder> nftBuilder_;
    /**
     * <code>.cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
     * @return Whether the nft field is set.
     */
    public boolean hasNft() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
     * @return The nft.
     */
    public com.cudoventures.cudosnode.marketplace.Nft getNft() {
      if (nftBuilder_ == null) {
        return nft_ == null ? com.cudoventures.cudosnode.marketplace.Nft.getDefaultInstance() : nft_;
      } else {
        return nftBuilder_.getMessage();
      }
    }
    /**
     * <code>.cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
     */
    public Builder setNft(com.cudoventures.cudosnode.marketplace.Nft value) {
      if (nftBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        nft_ = value;
      } else {
        nftBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
     */
    public Builder setNft(
        com.cudoventures.cudosnode.marketplace.Nft.Builder builderForValue) {
      if (nftBuilder_ == null) {
        nft_ = builderForValue.build();
      } else {
        nftBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeNft(com.cudoventures.cudosnode.marketplace.Nft value) {
      if (nftBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          nft_ != null &&
          nft_ != com.cudoventures.cudosnode.marketplace.Nft.getDefaultInstance()) {
          getNftBuilder().mergeFrom(value);
        } else {
          nft_ = value;
        }
      } else {
        nftBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearNft() {
      bitField0_ = (bitField0_ & ~0x00000001);
      nft_ = null;
      if (nftBuilder_ != null) {
        nftBuilder_.dispose();
        nftBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
     */
    public com.cudoventures.cudosnode.marketplace.Nft.Builder getNftBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getNftFieldBuilder().getBuilder();
    }
    /**
     * <code>.cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
     */
    public com.cudoventures.cudosnode.marketplace.NftOrBuilder getNftOrBuilder() {
      if (nftBuilder_ != null) {
        return nftBuilder_.getMessageOrBuilder();
      } else {
        return nft_ == null ?
            com.cudoventures.cudosnode.marketplace.Nft.getDefaultInstance() : nft_;
      }
    }
    /**
     * <code>.cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cudoventures.cudosnode.marketplace.Nft, com.cudoventures.cudosnode.marketplace.Nft.Builder, com.cudoventures.cudosnode.marketplace.NftOrBuilder> 
        getNftFieldBuilder() {
      if (nftBuilder_ == null) {
        nftBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cudoventures.cudosnode.marketplace.Nft, com.cudoventures.cudosnode.marketplace.Nft.Builder, com.cudoventures.cudosnode.marketplace.NftOrBuilder>(
                getNft(),
                getParentForChildren(),
                isClean());
        nft_ = null;
      }
      return nftBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cudoventures.cudosnode.marketplace.QueryGetNftResponse)
  }

  // @@protoc_insertion_point(class_scope:cudoventures.cudosnode.marketplace.QueryGetNftResponse)
  private static final com.cudoventures.cudosnode.marketplace.QueryGetNftResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cudoventures.cudosnode.marketplace.QueryGetNftResponse();
  }

  public static com.cudoventures.cudosnode.marketplace.QueryGetNftResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryGetNftResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryGetNftResponse>() {
    @java.lang.Override
    public QueryGetNftResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryGetNftResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryGetNftResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cudoventures.cudosnode.marketplace.QueryGetNftResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

