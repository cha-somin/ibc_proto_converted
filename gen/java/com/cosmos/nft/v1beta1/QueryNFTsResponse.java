// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/nft/v1beta1/query.proto

package com.cosmos.nft.v1beta1;

/**
 * <pre>
 * QueryNFTsResponse is the response type for the Query/NFTs RPC methods
 * </pre>
 *
 * Protobuf type {@code cosmos.nft.v1beta1.QueryNFTsResponse}
 */
public final class QueryNFTsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.nft.v1beta1.QueryNFTsResponse)
    QueryNFTsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryNFTsResponse.newBuilder() to construct.
  private QueryNFTsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryNFTsResponse() {
    nfts_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryNFTsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.nft.v1beta1.QueryProto.internal_static_cosmos_nft_v1beta1_QueryNFTsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.nft.v1beta1.QueryProto.internal_static_cosmos_nft_v1beta1_QueryNFTsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.nft.v1beta1.QueryNFTsResponse.class, com.cosmos.nft.v1beta1.QueryNFTsResponse.Builder.class);
  }

  public static final int NFTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.cosmos.nft.v1beta1.NFT> nfts_;
  /**
   * <pre>
   * NFT defines the NFT
   * </pre>
   *
   * <code>repeated .cosmos.nft.v1beta1.NFT nfts = 1 [json_name = "nfts"];</code>
   */
  @java.lang.Override
  public java.util.List<com.cosmos.nft.v1beta1.NFT> getNftsList() {
    return nfts_;
  }
  /**
   * <pre>
   * NFT defines the NFT
   * </pre>
   *
   * <code>repeated .cosmos.nft.v1beta1.NFT nfts = 1 [json_name = "nfts"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.cosmos.nft.v1beta1.NFTOrBuilder> 
      getNftsOrBuilderList() {
    return nfts_;
  }
  /**
   * <pre>
   * NFT defines the NFT
   * </pre>
   *
   * <code>repeated .cosmos.nft.v1beta1.NFT nfts = 1 [json_name = "nfts"];</code>
   */
  @java.lang.Override
  public int getNftsCount() {
    return nfts_.size();
  }
  /**
   * <pre>
   * NFT defines the NFT
   * </pre>
   *
   * <code>repeated .cosmos.nft.v1beta1.NFT nfts = 1 [json_name = "nfts"];</code>
   */
  @java.lang.Override
  public com.cosmos.nft.v1beta1.NFT getNfts(int index) {
    return nfts_.get(index);
  }
  /**
   * <pre>
   * NFT defines the NFT
   * </pre>
   *
   * <code>repeated .cosmos.nft.v1beta1.NFT nfts = 1 [json_name = "nfts"];</code>
   */
  @java.lang.Override
  public com.cosmos.nft.v1beta1.NFTOrBuilder getNftsOrBuilder(
      int index) {
    return nfts_.get(index);
  }

  public static final int PAGINATION_FIELD_NUMBER = 2;
  private com.cosmos.base.query.v1beta1.PageResponse pagination_;
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return Whether the pagination field is set.
   */
  @java.lang.Override
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
   * @return The pagination.
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageResponse getPagination() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
  }
  /**
   * <pre>
   * pagination defines the pagination in the response.
   * </pre>
   *
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
    for (int i = 0; i < nfts_.size(); i++) {
      output.writeMessage(1, nfts_.get(i));
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
    for (int i = 0; i < nfts_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, nfts_.get(i));
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
    if (!(obj instanceof com.cosmos.nft.v1beta1.QueryNFTsResponse)) {
      return super.equals(obj);
    }
    com.cosmos.nft.v1beta1.QueryNFTsResponse other = (com.cosmos.nft.v1beta1.QueryNFTsResponse) obj;

    if (!getNftsList()
        .equals(other.getNftsList())) return false;
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
    if (getNftsCount() > 0) {
      hash = (37 * hash) + NFTS_FIELD_NUMBER;
      hash = (53 * hash) + getNftsList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.nft.v1beta1.QueryNFTsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.nft.v1beta1.QueryNFTsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.nft.v1beta1.QueryNFTsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.nft.v1beta1.QueryNFTsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.nft.v1beta1.QueryNFTsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.nft.v1beta1.QueryNFTsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.nft.v1beta1.QueryNFTsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.nft.v1beta1.QueryNFTsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cosmos.nft.v1beta1.QueryNFTsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cosmos.nft.v1beta1.QueryNFTsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.nft.v1beta1.QueryNFTsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.nft.v1beta1.QueryNFTsResponse parseFrom(
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
  public static Builder newBuilder(com.cosmos.nft.v1beta1.QueryNFTsResponse prototype) {
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
   * QueryNFTsResponse is the response type for the Query/NFTs RPC methods
   * </pre>
   *
   * Protobuf type {@code cosmos.nft.v1beta1.QueryNFTsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.nft.v1beta1.QueryNFTsResponse)
      com.cosmos.nft.v1beta1.QueryNFTsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.nft.v1beta1.QueryProto.internal_static_cosmos_nft_v1beta1_QueryNFTsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.nft.v1beta1.QueryProto.internal_static_cosmos_nft_v1beta1_QueryNFTsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.nft.v1beta1.QueryNFTsResponse.class, com.cosmos.nft.v1beta1.QueryNFTsResponse.Builder.class);
    }

    // Construct using com.cosmos.nft.v1beta1.QueryNFTsResponse.newBuilder()
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
      if (nftsBuilder_ == null) {
        nfts_ = java.util.Collections.emptyList();
      } else {
        nfts_ = null;
        nftsBuilder_.clear();
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
      return com.cosmos.nft.v1beta1.QueryProto.internal_static_cosmos_nft_v1beta1_QueryNFTsResponse_descriptor;
    }

    @java.lang.Override
    public com.cosmos.nft.v1beta1.QueryNFTsResponse getDefaultInstanceForType() {
      return com.cosmos.nft.v1beta1.QueryNFTsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.nft.v1beta1.QueryNFTsResponse build() {
      com.cosmos.nft.v1beta1.QueryNFTsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.nft.v1beta1.QueryNFTsResponse buildPartial() {
      com.cosmos.nft.v1beta1.QueryNFTsResponse result = new com.cosmos.nft.v1beta1.QueryNFTsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.cosmos.nft.v1beta1.QueryNFTsResponse result) {
      if (nftsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          nfts_ = java.util.Collections.unmodifiableList(nfts_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.nfts_ = nfts_;
      } else {
        result.nfts_ = nftsBuilder_.build();
      }
    }

    private void buildPartial0(com.cosmos.nft.v1beta1.QueryNFTsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cosmos.nft.v1beta1.QueryNFTsResponse) {
        return mergeFrom((com.cosmos.nft.v1beta1.QueryNFTsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.nft.v1beta1.QueryNFTsResponse other) {
      if (other == com.cosmos.nft.v1beta1.QueryNFTsResponse.getDefaultInstance()) return this;
      if (nftsBuilder_ == null) {
        if (!other.nfts_.isEmpty()) {
          if (nfts_.isEmpty()) {
            nfts_ = other.nfts_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureNftsIsMutable();
            nfts_.addAll(other.nfts_);
          }
          onChanged();
        }
      } else {
        if (!other.nfts_.isEmpty()) {
          if (nftsBuilder_.isEmpty()) {
            nftsBuilder_.dispose();
            nftsBuilder_ = null;
            nfts_ = other.nfts_;
            bitField0_ = (bitField0_ & ~0x00000001);
            nftsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getNftsFieldBuilder() : null;
          } else {
            nftsBuilder_.addAllMessages(other.nfts_);
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
              com.cosmos.nft.v1beta1.NFT m =
                  input.readMessage(
                      com.cosmos.nft.v1beta1.NFT.parser(),
                      extensionRegistry);
              if (nftsBuilder_ == null) {
                ensureNftsIsMutable();
                nfts_.add(m);
              } else {
                nftsBuilder_.addMessage(m);
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

    private java.util.List<com.cosmos.nft.v1beta1.NFT> nfts_ =
      java.util.Collections.emptyList();
    private void ensureNftsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        nfts_ = new java.util.ArrayList<com.cosmos.nft.v1beta1.NFT>(nfts_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.nft.v1beta1.NFT, com.cosmos.nft.v1beta1.NFT.Builder, com.cosmos.nft.v1beta1.NFTOrBuilder> nftsBuilder_;

    /**
     * <pre>
     * NFT defines the NFT
     * </pre>
     *
     * <code>repeated .cosmos.nft.v1beta1.NFT nfts = 1 [json_name = "nfts"];</code>
     */
    public java.util.List<com.cosmos.nft.v1beta1.NFT> getNftsList() {
      if (nftsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(nfts_);
      } else {
        return nftsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * NFT defines the NFT
     * </pre>
     *
     * <code>repeated .cosmos.nft.v1beta1.NFT nfts = 1 [json_name = "nfts"];</code>
     */
    public int getNftsCount() {
      if (nftsBuilder_ == null) {
        return nfts_.size();
      } else {
        return nftsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * NFT defines the NFT
     * </pre>
     *
     * <code>repeated .cosmos.nft.v1beta1.NFT nfts = 1 [json_name = "nfts"];</code>
     */
    public com.cosmos.nft.v1beta1.NFT getNfts(int index) {
      if (nftsBuilder_ == null) {
        return nfts_.get(index);
      } else {
        return nftsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * NFT defines the NFT
     * </pre>
     *
     * <code>repeated .cosmos.nft.v1beta1.NFT nfts = 1 [json_name = "nfts"];</code>
     */
    public Builder setNfts(
        int index, com.cosmos.nft.v1beta1.NFT value) {
      if (nftsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNftsIsMutable();
        nfts_.set(index, value);
        onChanged();
      } else {
        nftsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * NFT defines the NFT
     * </pre>
     *
     * <code>repeated .cosmos.nft.v1beta1.NFT nfts = 1 [json_name = "nfts"];</code>
     */
    public Builder setNfts(
        int index, com.cosmos.nft.v1beta1.NFT.Builder builderForValue) {
      if (nftsBuilder_ == null) {
        ensureNftsIsMutable();
        nfts_.set(index, builderForValue.build());
        onChanged();
      } else {
        nftsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * NFT defines the NFT
     * </pre>
     *
     * <code>repeated .cosmos.nft.v1beta1.NFT nfts = 1 [json_name = "nfts"];</code>
     */
    public Builder addNfts(com.cosmos.nft.v1beta1.NFT value) {
      if (nftsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNftsIsMutable();
        nfts_.add(value);
        onChanged();
      } else {
        nftsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * NFT defines the NFT
     * </pre>
     *
     * <code>repeated .cosmos.nft.v1beta1.NFT nfts = 1 [json_name = "nfts"];</code>
     */
    public Builder addNfts(
        int index, com.cosmos.nft.v1beta1.NFT value) {
      if (nftsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureNftsIsMutable();
        nfts_.add(index, value);
        onChanged();
      } else {
        nftsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * NFT defines the NFT
     * </pre>
     *
     * <code>repeated .cosmos.nft.v1beta1.NFT nfts = 1 [json_name = "nfts"];</code>
     */
    public Builder addNfts(
        com.cosmos.nft.v1beta1.NFT.Builder builderForValue) {
      if (nftsBuilder_ == null) {
        ensureNftsIsMutable();
        nfts_.add(builderForValue.build());
        onChanged();
      } else {
        nftsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * NFT defines the NFT
     * </pre>
     *
     * <code>repeated .cosmos.nft.v1beta1.NFT nfts = 1 [json_name = "nfts"];</code>
     */
    public Builder addNfts(
        int index, com.cosmos.nft.v1beta1.NFT.Builder builderForValue) {
      if (nftsBuilder_ == null) {
        ensureNftsIsMutable();
        nfts_.add(index, builderForValue.build());
        onChanged();
      } else {
        nftsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * NFT defines the NFT
     * </pre>
     *
     * <code>repeated .cosmos.nft.v1beta1.NFT nfts = 1 [json_name = "nfts"];</code>
     */
    public Builder addAllNfts(
        java.lang.Iterable<? extends com.cosmos.nft.v1beta1.NFT> values) {
      if (nftsBuilder_ == null) {
        ensureNftsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, nfts_);
        onChanged();
      } else {
        nftsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * NFT defines the NFT
     * </pre>
     *
     * <code>repeated .cosmos.nft.v1beta1.NFT nfts = 1 [json_name = "nfts"];</code>
     */
    public Builder clearNfts() {
      if (nftsBuilder_ == null) {
        nfts_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        nftsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * NFT defines the NFT
     * </pre>
     *
     * <code>repeated .cosmos.nft.v1beta1.NFT nfts = 1 [json_name = "nfts"];</code>
     */
    public Builder removeNfts(int index) {
      if (nftsBuilder_ == null) {
        ensureNftsIsMutable();
        nfts_.remove(index);
        onChanged();
      } else {
        nftsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * NFT defines the NFT
     * </pre>
     *
     * <code>repeated .cosmos.nft.v1beta1.NFT nfts = 1 [json_name = "nfts"];</code>
     */
    public com.cosmos.nft.v1beta1.NFT.Builder getNftsBuilder(
        int index) {
      return getNftsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * NFT defines the NFT
     * </pre>
     *
     * <code>repeated .cosmos.nft.v1beta1.NFT nfts = 1 [json_name = "nfts"];</code>
     */
    public com.cosmos.nft.v1beta1.NFTOrBuilder getNftsOrBuilder(
        int index) {
      if (nftsBuilder_ == null) {
        return nfts_.get(index);  } else {
        return nftsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * NFT defines the NFT
     * </pre>
     *
     * <code>repeated .cosmos.nft.v1beta1.NFT nfts = 1 [json_name = "nfts"];</code>
     */
    public java.util.List<? extends com.cosmos.nft.v1beta1.NFTOrBuilder> 
         getNftsOrBuilderList() {
      if (nftsBuilder_ != null) {
        return nftsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(nfts_);
      }
    }
    /**
     * <pre>
     * NFT defines the NFT
     * </pre>
     *
     * <code>repeated .cosmos.nft.v1beta1.NFT nfts = 1 [json_name = "nfts"];</code>
     */
    public com.cosmos.nft.v1beta1.NFT.Builder addNftsBuilder() {
      return getNftsFieldBuilder().addBuilder(
          com.cosmos.nft.v1beta1.NFT.getDefaultInstance());
    }
    /**
     * <pre>
     * NFT defines the NFT
     * </pre>
     *
     * <code>repeated .cosmos.nft.v1beta1.NFT nfts = 1 [json_name = "nfts"];</code>
     */
    public com.cosmos.nft.v1beta1.NFT.Builder addNftsBuilder(
        int index) {
      return getNftsFieldBuilder().addBuilder(
          index, com.cosmos.nft.v1beta1.NFT.getDefaultInstance());
    }
    /**
     * <pre>
     * NFT defines the NFT
     * </pre>
     *
     * <code>repeated .cosmos.nft.v1beta1.NFT nfts = 1 [json_name = "nfts"];</code>
     */
    public java.util.List<com.cosmos.nft.v1beta1.NFT.Builder> 
         getNftsBuilderList() {
      return getNftsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.nft.v1beta1.NFT, com.cosmos.nft.v1beta1.NFT.Builder, com.cosmos.nft.v1beta1.NFTOrBuilder> 
        getNftsFieldBuilder() {
      if (nftsBuilder_ == null) {
        nftsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.cosmos.nft.v1beta1.NFT, com.cosmos.nft.v1beta1.NFT.Builder, com.cosmos.nft.v1beta1.NFTOrBuilder>(
                nfts_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        nfts_ = null;
      }
      return nftsBuilder_;
    }

    private com.cosmos.base.query.v1beta1.PageResponse pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> paginationBuilder_;
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     * @return Whether the pagination field is set.
     */
    public boolean hasPagination() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
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
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
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
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
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
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
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
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
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
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination"];</code>
     */
    public com.cosmos.base.query.v1beta1.PageResponse.Builder getPaginationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
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
     * <pre>
     * pagination defines the pagination in the response.
     * </pre>
     *
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


    // @@protoc_insertion_point(builder_scope:cosmos.nft.v1beta1.QueryNFTsResponse)
  }

  // @@protoc_insertion_point(class_scope:cosmos.nft.v1beta1.QueryNFTsResponse)
  private static final com.cosmos.nft.v1beta1.QueryNFTsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.nft.v1beta1.QueryNFTsResponse();
  }

  public static com.cosmos.nft.v1beta1.QueryNFTsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryNFTsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryNFTsResponse>() {
    @java.lang.Override
    public QueryNFTsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryNFTsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryNFTsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.nft.v1beta1.QueryNFTsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

