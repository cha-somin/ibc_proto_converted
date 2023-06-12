// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cryptoorg/nft/v1/query.proto

package com.chainmain.nft.v1;

/**
 * <pre>
 * QueryNFTResponse is the response type for the Query/NFT RPC method
 * </pre>
 *
 * Protobuf type {@code chainmain.nft.v1.QueryNFTResponse}
 */
public final class QueryNFTResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:chainmain.nft.v1.QueryNFTResponse)
    QueryNFTResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryNFTResponse.newBuilder() to construct.
  private QueryNFTResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryNFTResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryNFTResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.chainmain.nft.v1.QueryProto.internal_static_chainmain_nft_v1_QueryNFTResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.chainmain.nft.v1.QueryProto.internal_static_chainmain_nft_v1_QueryNFTResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.chainmain.nft.v1.QueryNFTResponse.class, com.chainmain.nft.v1.QueryNFTResponse.Builder.class);
  }

  public static final int NFT_FIELD_NUMBER = 1;
  private com.chainmain.nft.v1.BaseNFT nft_;
  /**
   * <code>.chainmain.nft.v1.BaseNFT nft = 1 [json_name = "nft", (.gogoproto.customname) = "NFT"];</code>
   * @return Whether the nft field is set.
   */
  @java.lang.Override
  public boolean hasNft() {
    return nft_ != null;
  }
  /**
   * <code>.chainmain.nft.v1.BaseNFT nft = 1 [json_name = "nft", (.gogoproto.customname) = "NFT"];</code>
   * @return The nft.
   */
  @java.lang.Override
  public com.chainmain.nft.v1.BaseNFT getNft() {
    return nft_ == null ? com.chainmain.nft.v1.BaseNFT.getDefaultInstance() : nft_;
  }
  /**
   * <code>.chainmain.nft.v1.BaseNFT nft = 1 [json_name = "nft", (.gogoproto.customname) = "NFT"];</code>
   */
  @java.lang.Override
  public com.chainmain.nft.v1.BaseNFTOrBuilder getNftOrBuilder() {
    return nft_ == null ? com.chainmain.nft.v1.BaseNFT.getDefaultInstance() : nft_;
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
    if (!(obj instanceof com.chainmain.nft.v1.QueryNFTResponse)) {
      return super.equals(obj);
    }
    com.chainmain.nft.v1.QueryNFTResponse other = (com.chainmain.nft.v1.QueryNFTResponse) obj;

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

  public static com.chainmain.nft.v1.QueryNFTResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.chainmain.nft.v1.QueryNFTResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.chainmain.nft.v1.QueryNFTResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.chainmain.nft.v1.QueryNFTResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.chainmain.nft.v1.QueryNFTResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.chainmain.nft.v1.QueryNFTResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.chainmain.nft.v1.QueryNFTResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.chainmain.nft.v1.QueryNFTResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.chainmain.nft.v1.QueryNFTResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.chainmain.nft.v1.QueryNFTResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.chainmain.nft.v1.QueryNFTResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.chainmain.nft.v1.QueryNFTResponse parseFrom(
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
  public static Builder newBuilder(com.chainmain.nft.v1.QueryNFTResponse prototype) {
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
   * QueryNFTResponse is the response type for the Query/NFT RPC method
   * </pre>
   *
   * Protobuf type {@code chainmain.nft.v1.QueryNFTResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chainmain.nft.v1.QueryNFTResponse)
      com.chainmain.nft.v1.QueryNFTResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.chainmain.nft.v1.QueryProto.internal_static_chainmain_nft_v1_QueryNFTResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.chainmain.nft.v1.QueryProto.internal_static_chainmain_nft_v1_QueryNFTResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.chainmain.nft.v1.QueryNFTResponse.class, com.chainmain.nft.v1.QueryNFTResponse.Builder.class);
    }

    // Construct using com.chainmain.nft.v1.QueryNFTResponse.newBuilder()
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
      return com.chainmain.nft.v1.QueryProto.internal_static_chainmain_nft_v1_QueryNFTResponse_descriptor;
    }

    @java.lang.Override
    public com.chainmain.nft.v1.QueryNFTResponse getDefaultInstanceForType() {
      return com.chainmain.nft.v1.QueryNFTResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.chainmain.nft.v1.QueryNFTResponse build() {
      com.chainmain.nft.v1.QueryNFTResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.chainmain.nft.v1.QueryNFTResponse buildPartial() {
      com.chainmain.nft.v1.QueryNFTResponse result = new com.chainmain.nft.v1.QueryNFTResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.chainmain.nft.v1.QueryNFTResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.nft_ = nftBuilder_ == null
            ? nft_
            : nftBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.chainmain.nft.v1.QueryNFTResponse) {
        return mergeFrom((com.chainmain.nft.v1.QueryNFTResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.chainmain.nft.v1.QueryNFTResponse other) {
      if (other == com.chainmain.nft.v1.QueryNFTResponse.getDefaultInstance()) return this;
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

    private com.chainmain.nft.v1.BaseNFT nft_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.chainmain.nft.v1.BaseNFT, com.chainmain.nft.v1.BaseNFT.Builder, com.chainmain.nft.v1.BaseNFTOrBuilder> nftBuilder_;
    /**
     * <code>.chainmain.nft.v1.BaseNFT nft = 1 [json_name = "nft", (.gogoproto.customname) = "NFT"];</code>
     * @return Whether the nft field is set.
     */
    public boolean hasNft() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.chainmain.nft.v1.BaseNFT nft = 1 [json_name = "nft", (.gogoproto.customname) = "NFT"];</code>
     * @return The nft.
     */
    public com.chainmain.nft.v1.BaseNFT getNft() {
      if (nftBuilder_ == null) {
        return nft_ == null ? com.chainmain.nft.v1.BaseNFT.getDefaultInstance() : nft_;
      } else {
        return nftBuilder_.getMessage();
      }
    }
    /**
     * <code>.chainmain.nft.v1.BaseNFT nft = 1 [json_name = "nft", (.gogoproto.customname) = "NFT"];</code>
     */
    public Builder setNft(com.chainmain.nft.v1.BaseNFT value) {
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
     * <code>.chainmain.nft.v1.BaseNFT nft = 1 [json_name = "nft", (.gogoproto.customname) = "NFT"];</code>
     */
    public Builder setNft(
        com.chainmain.nft.v1.BaseNFT.Builder builderForValue) {
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
     * <code>.chainmain.nft.v1.BaseNFT nft = 1 [json_name = "nft", (.gogoproto.customname) = "NFT"];</code>
     */
    public Builder mergeNft(com.chainmain.nft.v1.BaseNFT value) {
      if (nftBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          nft_ != null &&
          nft_ != com.chainmain.nft.v1.BaseNFT.getDefaultInstance()) {
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
     * <code>.chainmain.nft.v1.BaseNFT nft = 1 [json_name = "nft", (.gogoproto.customname) = "NFT"];</code>
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
     * <code>.chainmain.nft.v1.BaseNFT nft = 1 [json_name = "nft", (.gogoproto.customname) = "NFT"];</code>
     */
    public com.chainmain.nft.v1.BaseNFT.Builder getNftBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getNftFieldBuilder().getBuilder();
    }
    /**
     * <code>.chainmain.nft.v1.BaseNFT nft = 1 [json_name = "nft", (.gogoproto.customname) = "NFT"];</code>
     */
    public com.chainmain.nft.v1.BaseNFTOrBuilder getNftOrBuilder() {
      if (nftBuilder_ != null) {
        return nftBuilder_.getMessageOrBuilder();
      } else {
        return nft_ == null ?
            com.chainmain.nft.v1.BaseNFT.getDefaultInstance() : nft_;
      }
    }
    /**
     * <code>.chainmain.nft.v1.BaseNFT nft = 1 [json_name = "nft", (.gogoproto.customname) = "NFT"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.chainmain.nft.v1.BaseNFT, com.chainmain.nft.v1.BaseNFT.Builder, com.chainmain.nft.v1.BaseNFTOrBuilder> 
        getNftFieldBuilder() {
      if (nftBuilder_ == null) {
        nftBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.chainmain.nft.v1.BaseNFT, com.chainmain.nft.v1.BaseNFT.Builder, com.chainmain.nft.v1.BaseNFTOrBuilder>(
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


    // @@protoc_insertion_point(builder_scope:chainmain.nft.v1.QueryNFTResponse)
  }

  // @@protoc_insertion_point(class_scope:chainmain.nft.v1.QueryNFTResponse)
  private static final com.chainmain.nft.v1.QueryNFTResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.chainmain.nft.v1.QueryNFTResponse();
  }

  public static com.chainmain.nft.v1.QueryNFTResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryNFTResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryNFTResponse>() {
    @java.lang.Override
    public QueryNFTResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryNFTResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryNFTResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.chainmain.nft.v1.QueryNFTResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

