// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cudos/marketplace/query.proto

package com.cudoventures.cudosnode.marketplace;

/**
 * Protobuf type {@code cudoventures.cudosnode.marketplace.QueryAllNftResponse}
 */
public final class QueryAllNftResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cudoventures.cudosnode.marketplace.QueryAllNftResponse)
    QueryAllNftResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryAllNftResponse.newBuilder() to construct.
  private QueryAllNftResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryAllNftResponse() {
    nft_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryAllNftResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cudoventures.cudosnode.marketplace.QueryProto.internal_static_cudoventures_cudosnode_marketplace_QueryAllNftResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cudoventures.cudosnode.marketplace.QueryProto.internal_static_cudoventures_cudosnode_marketplace_QueryAllNftResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cudoventures.cudosnode.marketplace.QueryAllNftResponse.class, com.cudoventures.cudosnode.marketplace.QueryAllNftResponse.Builder.class);
  }

  public static final int NFT_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.cudoventures.cudosnode.marketplace.Nft> nft_;
  /**
   * <code>repeated .cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.cudoventures.cudosnode.marketplace.Nft> getNftList() {
    return nft_;
  }
  /**
   * <code>repeated .cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.cudoventures.cudosnode.marketplace.NftOrBuilder> 
      getNftOrBuilderList() {
    return nft_;
  }
  /**
   * <code>repeated .cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getNftCount() {
    return nft_.size();
  }
  /**
   * <code>repeated .cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.cudoventures.cudosnode.marketplace.Nft getNft(int index) {
    return nft_.get(index);
  }
  /**
   * <code>repeated .cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.cudoventures.cudosnode.marketplace.NftOrBuilder getNftOrBuilder(
      int index) {
    return nft_.get(index);
  }

  public static final int PAGINATION_FIELD_NUMBER = 2;
  private com.cosmos.base.query.v1beta1.PageResponse pagination_;
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  @java.lang.Override
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageResponse getPagination() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
  }
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
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
    for (int i = 0; i < nft_.size(); i++) {
      output.writeMessage(1, nft_.get(i));
    }
    if (pagination_ != null) {
      output.writeMessage(2, getPagination());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < nft_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, nft_.get(i));
    }
    if (pagination_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getPagination());
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
    if (!(obj instanceof com.cudoventures.cudosnode.marketplace.QueryAllNftResponse)) {
      return super.equals(obj);
    }
    com.cudoventures.cudosnode.marketplace.QueryAllNftResponse other = (com.cudoventures.cudosnode.marketplace.QueryAllNftResponse) obj;

    if (!getNftList()
        .equals(other.getNftList())) return false;
    if (hasPagination() != other.hasPagination()) return false;
    if (hasPagination()) {
      if (!getPagination()
          .equals(other.getPagination())) return false;
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
    if (getNftCount() > 0) {
      hash = (37 * hash) + NFT_FIELD_NUMBER;
      hash = (53 * hash) + getNftList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cudoventures.cudosnode.marketplace.QueryAllNftResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cudoventures.cudosnode.marketplace.QueryAllNftResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cudoventures.cudosnode.marketplace.QueryAllNftResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cudoventures.cudosnode.marketplace.QueryAllNftResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cudoventures.cudosnode.marketplace.QueryAllNftResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cudoventures.cudosnode.marketplace.QueryAllNftResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cudoventures.cudosnode.marketplace.QueryAllNftResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cudoventures.cudosnode.marketplace.QueryAllNftResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cudoventures.cudosnode.marketplace.QueryAllNftResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cudoventures.cudosnode.marketplace.QueryAllNftResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cudoventures.cudosnode.marketplace.QueryAllNftResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cudoventures.cudosnode.marketplace.QueryAllNftResponse parseFrom(
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
  public static Builder newBuilder(com.cudoventures.cudosnode.marketplace.QueryAllNftResponse prototype) {
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
   * Protobuf type {@code cudoventures.cudosnode.marketplace.QueryAllNftResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cudoventures.cudosnode.marketplace.QueryAllNftResponse)
      com.cudoventures.cudosnode.marketplace.QueryAllNftResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cudoventures.cudosnode.marketplace.QueryProto.internal_static_cudoventures_cudosnode_marketplace_QueryAllNftResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cudoventures.cudosnode.marketplace.QueryProto.internal_static_cudoventures_cudosnode_marketplace_QueryAllNftResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cudoventures.cudosnode.marketplace.QueryAllNftResponse.class, com.cudoventures.cudosnode.marketplace.QueryAllNftResponse.Builder.class);
    }

    // Construct using com.cudoventures.cudosnode.marketplace.QueryAllNftResponse.newBuilder()
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
      if (nftBuilder_ == null) {
        nft_ = java.util.Collections.emptyList();
      } else {
        nft_ = null;
        nftBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      pagination_ = null;
      if (paginationBuilder_ != null) {
        paginationBuilder_.dispose();
        paginationBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cudoventures.cudosnode.marketplace.QueryProto.internal_static_cudoventures_cudosnode_marketplace_QueryAllNftResponse_descriptor;
    }

    @java.lang.Override
    public com.cudoventures.cudosnode.marketplace.QueryAllNftResponse getDefaultInstanceForType() {
      return com.cudoventures.cudosnode.marketplace.QueryAllNftResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.cudoventures.cudosnode.marketplace.QueryAllNftResponse build() {
      com.cudoventures.cudosnode.marketplace.QueryAllNftResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cudoventures.cudosnode.marketplace.QueryAllNftResponse buildPartial() {
      com.cudoventures.cudosnode.marketplace.QueryAllNftResponse result = new com.cudoventures.cudosnode.marketplace.QueryAllNftResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.cudoventures.cudosnode.marketplace.QueryAllNftResponse result) {
      if (nftBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          nft_ = java.util.Collections.unmodifiableList(nft_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.nft_ = nft_;
      } else {
        result.nft_ = nftBuilder_.build();
      }
    }

    private void buildPartial0(com.cudoventures.cudosnode.marketplace.QueryAllNftResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cudoventures.cudosnode.marketplace.QueryAllNftResponse) {
        return mergeFrom((com.cudoventures.cudosnode.marketplace.QueryAllNftResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cudoventures.cudosnode.marketplace.QueryAllNftResponse other) {
      if (other == com.cudoventures.cudosnode.marketplace.QueryAllNftResponse.getDefaultInstance()) return this;
      if (nftBuilder_ == null) {
        if (!other.nft_.isEmpty()) {
          if (nft_.isEmpty()) {
            nft_ = other.nft_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNftIsMutable();
            nft_.addAll(other.nft_);
          }
          onChanged();
        }
      } else {
        if (!other.nft_.isEmpty()) {
          if (nftBuilder_.isEmpty()) {
            nftBuilder_.dispose();
            nftBuilder_ = null;
            nft_ = other.nft_;
            bitField0_ = (bitField0_ & ~0x00000001);
            nftBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getNftFieldBuilder() : null;
          } else {
            nftBuilder_.addAllMessages(other.nft_);
          }
        }
      }
      if (other.hasPagination()) {
        mergePagination(other.getPagination());
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
              com.cudoventures.cudosnode.marketplace.Nft m =
                  input.readMessage(
                      com.cudoventures.cudosnode.marketplace.Nft.parser(),
                      extensionRegistry);
              if (nftBuilder_ == null) {
                ensureNftIsMutable();
                nft_.add(m);
              } else {
                nftBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getPaginationFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private java.util.List<com.cudoventures.cudosnode.marketplace.Nft> nft_ =
      java.util.Collections.emptyList();
    private void ensureNftIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        nft_ = new java.util.ArrayList<com.cudoventures.cudosnode.marketplace.Nft>(nft_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cudoventures.cudosnode.marketplace.Nft, com.cudoventures.cudosnode.marketplace.Nft.Builder, com.cudoventures.cudosnode.marketplace.NftOrBuilder> nftBuilder_;

    /**
     * <code>repeated .cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.cudoventures.cudosnode.marketplace.Nft> getNftList() {
      if (nftBuilder_ == null) {
        return java.util.Collections.unmodifiableList(nft_);
      } else {
        return nftBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
     */
    public int getNftCount() {
      if (nftBuilder_ == null) {
        return nft_.size();
      } else {
        return nftBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
     */
    public com.cudoventures.cudosnode.marketplace.Nft getNft(int index) {
      if (nftBuilder_ == null) {
        return nft_.get(index);
      } else {
        return nftBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
     */
    public Builder setNft(
        int index, com.cudoventures.cudosnode.marketplace.Nft value) {
      if (nftBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNftIsMutable();
        nft_.set(index, value);
        onChanged();
      } else {
        nftBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
     */
    public Builder setNft(
        int index, com.cudoventures.cudosnode.marketplace.Nft.Builder builderForValue) {
      if (nftBuilder_ == null) {
        ensureNftIsMutable();
        nft_.set(index, builderForValue.build());
        onChanged();
      } else {
        nftBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
     */
    public Builder addNft(com.cudoventures.cudosnode.marketplace.Nft value) {
      if (nftBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNftIsMutable();
        nft_.add(value);
        onChanged();
      } else {
        nftBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
     */
    public Builder addNft(
        int index, com.cudoventures.cudosnode.marketplace.Nft value) {
      if (nftBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNftIsMutable();
        nft_.add(index, value);
        onChanged();
      } else {
        nftBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
     */
    public Builder addNft(
        com.cudoventures.cudosnode.marketplace.Nft.Builder builderForValue) {
      if (nftBuilder_ == null) {
        ensureNftIsMutable();
        nft_.add(builderForValue.build());
        onChanged();
      } else {
        nftBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
     */
    public Builder addNft(
        int index, com.cudoventures.cudosnode.marketplace.Nft.Builder builderForValue) {
      if (nftBuilder_ == null) {
        ensureNftIsMutable();
        nft_.add(index, builderForValue.build());
        onChanged();
      } else {
        nftBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllNft(
        java.lang.Iterable<? extends com.cudoventures.cudosnode.marketplace.Nft> values) {
      if (nftBuilder_ == null) {
        ensureNftIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, nft_);
        onChanged();
      } else {
        nftBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearNft() {
      if (nftBuilder_ == null) {
        nft_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        nftBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
     */
    public Builder removeNft(int index) {
      if (nftBuilder_ == null) {
        ensureNftIsMutable();
        nft_.remove(index);
        onChanged();
      } else {
        nftBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
     */
    public com.cudoventures.cudosnode.marketplace.Nft.Builder getNftBuilder(
        int index) {
      return getNftFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
     */
    public com.cudoventures.cudosnode.marketplace.NftOrBuilder getNftOrBuilder(
        int index) {
      if (nftBuilder_ == null) {
        return nft_.get(index);  } else {
        return nftBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.cudoventures.cudosnode.marketplace.NftOrBuilder> 
         getNftOrBuilderList() {
      if (nftBuilder_ != null) {
        return nftBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(nft_);
      }
    }
    /**
     * <code>repeated .cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
     */
    public com.cudoventures.cudosnode.marketplace.Nft.Builder addNftBuilder() {
      return getNftFieldBuilder().addBuilder(
          com.cudoventures.cudosnode.marketplace.Nft.getDefaultInstance());
    }
    /**
     * <code>repeated .cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
     */
    public com.cudoventures.cudosnode.marketplace.Nft.Builder addNftBuilder(
        int index) {
      return getNftFieldBuilder().addBuilder(
          index, com.cudoventures.cudosnode.marketplace.Nft.getDefaultInstance());
    }
    /**
     * <code>repeated .cudoventures.cudosnode.marketplace.Nft Nft = 1 [json_name = "Nft", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.cudoventures.cudosnode.marketplace.Nft.Builder> 
         getNftBuilderList() {
      return getNftFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cudoventures.cudosnode.marketplace.Nft, com.cudoventures.cudosnode.marketplace.Nft.Builder, com.cudoventures.cudosnode.marketplace.NftOrBuilder> 
        getNftFieldBuilder() {
      if (nftBuilder_ == null) {
        nftBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.cudoventures.cudosnode.marketplace.Nft, com.cudoventures.cudosnode.marketplace.Nft.Builder, com.cudoventures.cudosnode.marketplace.NftOrBuilder>(
                nft_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        nft_ = null;
      }
      return nftBuilder_;
    }

    private com.cosmos.base.query.v1beta1.PageResponse pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> paginationBuilder_;
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     * @return Whether the pagination field is set.
     */
    public boolean hasPagination() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     * @return The pagination.
     */
    public com.cosmos.base.query.v1beta1.PageResponse getPagination() {
      if (paginationBuilder_ == null) {
        return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
      } else {
        return paginationBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder setPagination(com.cosmos.base.query.v1beta1.PageResponse value) {
      if (paginationBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        pagination_ = value;
      } else {
        paginationBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder setPagination(
        com.cosmos.base.query.v1beta1.PageResponse.Builder builderForValue) {
      if (paginationBuilder_ == null) {
        pagination_ = builderForValue.build();
      } else {
        paginationBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder mergePagination(com.cosmos.base.query.v1beta1.PageResponse value) {
      if (paginationBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          pagination_ != null &&
          pagination_ != com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance()) {
          getPaginationBuilder().mergeFrom(value);
        } else {
          pagination_ = value;
        }
      } else {
        paginationBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public Builder clearPagination() {
      bitField0_ = (bitField0_ & ~0x00000002);
      pagination_ = null;
      if (paginationBuilder_ != null) {
        paginationBuilder_.dispose();
        paginationBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageResponse.Builder getPaginationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageResponseOrBuilder getPaginationOrBuilder() {
      if (paginationBuilder_ != null) {
        return paginationBuilder_.getMessageOrBuilder();
      } else {
        return pagination_ == null ?
            com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
      }
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> 
        getPaginationFieldBuilder() {
      if (paginationBuilder_ == null) {
        paginationBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder>(
                getPagination(),
                getParentForChildren(),
                isClean());
        pagination_ = null;
      }
      return paginationBuilder_;
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


    // @@protoc_insertion_point(builder_scope:cudoventures.cudosnode.marketplace.QueryAllNftResponse)
  }

  // @@protoc_insertion_point(class_scope:cudoventures.cudosnode.marketplace.QueryAllNftResponse)
  private static final com.cudoventures.cudosnode.marketplace.QueryAllNftResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cudoventures.cudosnode.marketplace.QueryAllNftResponse();
  }

  public static com.cudoventures.cudosnode.marketplace.QueryAllNftResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryAllNftResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryAllNftResponse>() {
    @java.lang.Override
    public QueryAllNftResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryAllNftResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryAllNftResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cudoventures.cudosnode.marketplace.QueryAllNftResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

