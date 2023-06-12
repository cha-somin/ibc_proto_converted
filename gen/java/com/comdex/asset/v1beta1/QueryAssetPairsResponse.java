// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/asset/v1beta1/query.proto

package com.comdex.asset.v1beta1;

/**
 * Protobuf type {@code comdex.asset.v1beta1.QueryAssetPairsResponse}
 */
public final class QueryAssetPairsResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:comdex.asset.v1beta1.QueryAssetPairsResponse)
    QueryAssetPairsResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryAssetPairsResponse.newBuilder() to construct.
  private QueryAssetPairsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryAssetPairsResponse() {
    pairsInfo_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryAssetPairsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.comdex.asset.v1beta1.QueryProto.internal_static_comdex_asset_v1beta1_QueryAssetPairsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.comdex.asset.v1beta1.QueryProto.internal_static_comdex_asset_v1beta1_QueryAssetPairsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.comdex.asset.v1beta1.QueryAssetPairsResponse.class, com.comdex.asset.v1beta1.QueryAssetPairsResponse.Builder.class);
  }

  public static final int PAIRSINFO_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.comdex.asset.v1beta1.PairInfo> pairsInfo_;
  /**
   * <code>repeated .comdex.asset.v1beta1.PairInfo pairsInfo = 1 [json_name = "pairsInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pairs_info&#92;""];</code>
   */
  @java.lang.Override
  public java.util.List<com.comdex.asset.v1beta1.PairInfo> getPairsInfoList() {
    return pairsInfo_;
  }
  /**
   * <code>repeated .comdex.asset.v1beta1.PairInfo pairsInfo = 1 [json_name = "pairsInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pairs_info&#92;""];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.comdex.asset.v1beta1.PairInfoOrBuilder> 
      getPairsInfoOrBuilderList() {
    return pairsInfo_;
  }
  /**
   * <code>repeated .comdex.asset.v1beta1.PairInfo pairsInfo = 1 [json_name = "pairsInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pairs_info&#92;""];</code>
   */
  @java.lang.Override
  public int getPairsInfoCount() {
    return pairsInfo_.size();
  }
  /**
   * <code>repeated .comdex.asset.v1beta1.PairInfo pairsInfo = 1 [json_name = "pairsInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pairs_info&#92;""];</code>
   */
  @java.lang.Override
  public com.comdex.asset.v1beta1.PairInfo getPairsInfo(int index) {
    return pairsInfo_.get(index);
  }
  /**
   * <code>repeated .comdex.asset.v1beta1.PairInfo pairsInfo = 1 [json_name = "pairsInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pairs_info&#92;""];</code>
   */
  @java.lang.Override
  public com.comdex.asset.v1beta1.PairInfoOrBuilder getPairsInfoOrBuilder(
      int index) {
    return pairsInfo_.get(index);
  }

  public static final int PAGINATION_FIELD_NUMBER = 2;
  private com.cosmos.base.query.v1beta1.PageResponse pagination_;
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination", (.gogoproto.moretags) = "yaml:&#92;"pagination&#92;""];</code>
   * @return Whether the pagination field is set.
   */
  @java.lang.Override
  public boolean hasPagination() {
    return pagination_ != null;
  }
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination", (.gogoproto.moretags) = "yaml:&#92;"pagination&#92;""];</code>
   * @return The pagination.
   */
  @java.lang.Override
  public com.cosmos.base.query.v1beta1.PageResponse getPagination() {
    return pagination_ == null ? com.cosmos.base.query.v1beta1.PageResponse.getDefaultInstance() : pagination_;
  }
  /**
   * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination", (.gogoproto.moretags) = "yaml:&#92;"pagination&#92;""];</code>
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
    for (int i = 0; i < pairsInfo_.size(); i++) {
      output.writeMessage(1, pairsInfo_.get(i));
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
    for (int i = 0; i < pairsInfo_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, pairsInfo_.get(i));
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
    if (!(obj instanceof com.comdex.asset.v1beta1.QueryAssetPairsResponse)) {
      return super.equals(obj);
    }
    com.comdex.asset.v1beta1.QueryAssetPairsResponse other = (com.comdex.asset.v1beta1.QueryAssetPairsResponse) obj;

    if (!getPairsInfoList()
        .equals(other.getPairsInfoList())) return false;
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
    if (getPairsInfoCount() > 0) {
      hash = (37 * hash) + PAIRSINFO_FIELD_NUMBER;
      hash = (53 * hash) + getPairsInfoList().hashCode();
    }
    if (hasPagination()) {
      hash = (37 * hash) + PAGINATION_FIELD_NUMBER;
      hash = (53 * hash) + getPagination().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.comdex.asset.v1beta1.QueryAssetPairsResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.asset.v1beta1.QueryAssetPairsResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.asset.v1beta1.QueryAssetPairsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.asset.v1beta1.QueryAssetPairsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.asset.v1beta1.QueryAssetPairsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.asset.v1beta1.QueryAssetPairsResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.asset.v1beta1.QueryAssetPairsResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.asset.v1beta1.QueryAssetPairsResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.comdex.asset.v1beta1.QueryAssetPairsResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.comdex.asset.v1beta1.QueryAssetPairsResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.comdex.asset.v1beta1.QueryAssetPairsResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.asset.v1beta1.QueryAssetPairsResponse parseFrom(
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
  public static Builder newBuilder(com.comdex.asset.v1beta1.QueryAssetPairsResponse prototype) {
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
   * Protobuf type {@code comdex.asset.v1beta1.QueryAssetPairsResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:comdex.asset.v1beta1.QueryAssetPairsResponse)
      com.comdex.asset.v1beta1.QueryAssetPairsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.comdex.asset.v1beta1.QueryProto.internal_static_comdex_asset_v1beta1_QueryAssetPairsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.comdex.asset.v1beta1.QueryProto.internal_static_comdex_asset_v1beta1_QueryAssetPairsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.comdex.asset.v1beta1.QueryAssetPairsResponse.class, com.comdex.asset.v1beta1.QueryAssetPairsResponse.Builder.class);
    }

    // Construct using com.comdex.asset.v1beta1.QueryAssetPairsResponse.newBuilder()
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
      if (pairsInfoBuilder_ == null) {
        pairsInfo_ = java.util.Collections.emptyList();
      } else {
        pairsInfo_ = null;
        pairsInfoBuilder_.clear();
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
      return com.comdex.asset.v1beta1.QueryProto.internal_static_comdex_asset_v1beta1_QueryAssetPairsResponse_descriptor;
    }

    @java.lang.Override
    public com.comdex.asset.v1beta1.QueryAssetPairsResponse getDefaultInstanceForType() {
      return com.comdex.asset.v1beta1.QueryAssetPairsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.comdex.asset.v1beta1.QueryAssetPairsResponse build() {
      com.comdex.asset.v1beta1.QueryAssetPairsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.comdex.asset.v1beta1.QueryAssetPairsResponse buildPartial() {
      com.comdex.asset.v1beta1.QueryAssetPairsResponse result = new com.comdex.asset.v1beta1.QueryAssetPairsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.comdex.asset.v1beta1.QueryAssetPairsResponse result) {
      if (pairsInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          pairsInfo_ = java.util.Collections.unmodifiableList(pairsInfo_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.pairsInfo_ = pairsInfo_;
      } else {
        result.pairsInfo_ = pairsInfoBuilder_.build();
      }
    }

    private void buildPartial0(com.comdex.asset.v1beta1.QueryAssetPairsResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pagination_ = paginationBuilder_ == null
            ? pagination_
            : paginationBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.comdex.asset.v1beta1.QueryAssetPairsResponse) {
        return mergeFrom((com.comdex.asset.v1beta1.QueryAssetPairsResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.comdex.asset.v1beta1.QueryAssetPairsResponse other) {
      if (other == com.comdex.asset.v1beta1.QueryAssetPairsResponse.getDefaultInstance()) return this;
      if (pairsInfoBuilder_ == null) {
        if (!other.pairsInfo_.isEmpty()) {
          if (pairsInfo_.isEmpty()) {
            pairsInfo_ = other.pairsInfo_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePairsInfoIsMutable();
            pairsInfo_.addAll(other.pairsInfo_);
          }
          onChanged();
        }
      } else {
        if (!other.pairsInfo_.isEmpty()) {
          if (pairsInfoBuilder_.isEmpty()) {
            pairsInfoBuilder_.dispose();
            pairsInfoBuilder_ = null;
            pairsInfo_ = other.pairsInfo_;
            bitField0_ = (bitField0_ & ~0x00000001);
            pairsInfoBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPairsInfoFieldBuilder() : null;
          } else {
            pairsInfoBuilder_.addAllMessages(other.pairsInfo_);
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
              com.comdex.asset.v1beta1.PairInfo m =
                  input.readMessage(
                      com.comdex.asset.v1beta1.PairInfo.parser(),
                      extensionRegistry);
              if (pairsInfoBuilder_ == null) {
                ensurePairsInfoIsMutable();
                pairsInfo_.add(m);
              } else {
                pairsInfoBuilder_.addMessage(m);
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

    private java.util.List<com.comdex.asset.v1beta1.PairInfo> pairsInfo_ =
      java.util.Collections.emptyList();
    private void ensurePairsInfoIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        pairsInfo_ = new java.util.ArrayList<com.comdex.asset.v1beta1.PairInfo>(pairsInfo_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.comdex.asset.v1beta1.PairInfo, com.comdex.asset.v1beta1.PairInfo.Builder, com.comdex.asset.v1beta1.PairInfoOrBuilder> pairsInfoBuilder_;

    /**
     * <code>repeated .comdex.asset.v1beta1.PairInfo pairsInfo = 1 [json_name = "pairsInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pairs_info&#92;""];</code>
     */
    public java.util.List<com.comdex.asset.v1beta1.PairInfo> getPairsInfoList() {
      if (pairsInfoBuilder_ == null) {
        return java.util.Collections.unmodifiableList(pairsInfo_);
      } else {
        return pairsInfoBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .comdex.asset.v1beta1.PairInfo pairsInfo = 1 [json_name = "pairsInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pairs_info&#92;""];</code>
     */
    public int getPairsInfoCount() {
      if (pairsInfoBuilder_ == null) {
        return pairsInfo_.size();
      } else {
        return pairsInfoBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .comdex.asset.v1beta1.PairInfo pairsInfo = 1 [json_name = "pairsInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pairs_info&#92;""];</code>
     */
    public com.comdex.asset.v1beta1.PairInfo getPairsInfo(int index) {
      if (pairsInfoBuilder_ == null) {
        return pairsInfo_.get(index);
      } else {
        return pairsInfoBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .comdex.asset.v1beta1.PairInfo pairsInfo = 1 [json_name = "pairsInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pairs_info&#92;""];</code>
     */
    public Builder setPairsInfo(
        int index, com.comdex.asset.v1beta1.PairInfo value) {
      if (pairsInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePairsInfoIsMutable();
        pairsInfo_.set(index, value);
        onChanged();
      } else {
        pairsInfoBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .comdex.asset.v1beta1.PairInfo pairsInfo = 1 [json_name = "pairsInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pairs_info&#92;""];</code>
     */
    public Builder setPairsInfo(
        int index, com.comdex.asset.v1beta1.PairInfo.Builder builderForValue) {
      if (pairsInfoBuilder_ == null) {
        ensurePairsInfoIsMutable();
        pairsInfo_.set(index, builderForValue.build());
        onChanged();
      } else {
        pairsInfoBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .comdex.asset.v1beta1.PairInfo pairsInfo = 1 [json_name = "pairsInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pairs_info&#92;""];</code>
     */
    public Builder addPairsInfo(com.comdex.asset.v1beta1.PairInfo value) {
      if (pairsInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePairsInfoIsMutable();
        pairsInfo_.add(value);
        onChanged();
      } else {
        pairsInfoBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .comdex.asset.v1beta1.PairInfo pairsInfo = 1 [json_name = "pairsInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pairs_info&#92;""];</code>
     */
    public Builder addPairsInfo(
        int index, com.comdex.asset.v1beta1.PairInfo value) {
      if (pairsInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePairsInfoIsMutable();
        pairsInfo_.add(index, value);
        onChanged();
      } else {
        pairsInfoBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .comdex.asset.v1beta1.PairInfo pairsInfo = 1 [json_name = "pairsInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pairs_info&#92;""];</code>
     */
    public Builder addPairsInfo(
        com.comdex.asset.v1beta1.PairInfo.Builder builderForValue) {
      if (pairsInfoBuilder_ == null) {
        ensurePairsInfoIsMutable();
        pairsInfo_.add(builderForValue.build());
        onChanged();
      } else {
        pairsInfoBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .comdex.asset.v1beta1.PairInfo pairsInfo = 1 [json_name = "pairsInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pairs_info&#92;""];</code>
     */
    public Builder addPairsInfo(
        int index, com.comdex.asset.v1beta1.PairInfo.Builder builderForValue) {
      if (pairsInfoBuilder_ == null) {
        ensurePairsInfoIsMutable();
        pairsInfo_.add(index, builderForValue.build());
        onChanged();
      } else {
        pairsInfoBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .comdex.asset.v1beta1.PairInfo pairsInfo = 1 [json_name = "pairsInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pairs_info&#92;""];</code>
     */
    public Builder addAllPairsInfo(
        java.lang.Iterable<? extends com.comdex.asset.v1beta1.PairInfo> values) {
      if (pairsInfoBuilder_ == null) {
        ensurePairsInfoIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, pairsInfo_);
        onChanged();
      } else {
        pairsInfoBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .comdex.asset.v1beta1.PairInfo pairsInfo = 1 [json_name = "pairsInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pairs_info&#92;""];</code>
     */
    public Builder clearPairsInfo() {
      if (pairsInfoBuilder_ == null) {
        pairsInfo_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        pairsInfoBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .comdex.asset.v1beta1.PairInfo pairsInfo = 1 [json_name = "pairsInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pairs_info&#92;""];</code>
     */
    public Builder removePairsInfo(int index) {
      if (pairsInfoBuilder_ == null) {
        ensurePairsInfoIsMutable();
        pairsInfo_.remove(index);
        onChanged();
      } else {
        pairsInfoBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .comdex.asset.v1beta1.PairInfo pairsInfo = 1 [json_name = "pairsInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pairs_info&#92;""];</code>
     */
    public com.comdex.asset.v1beta1.PairInfo.Builder getPairsInfoBuilder(
        int index) {
      return getPairsInfoFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .comdex.asset.v1beta1.PairInfo pairsInfo = 1 [json_name = "pairsInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pairs_info&#92;""];</code>
     */
    public com.comdex.asset.v1beta1.PairInfoOrBuilder getPairsInfoOrBuilder(
        int index) {
      if (pairsInfoBuilder_ == null) {
        return pairsInfo_.get(index);  } else {
        return pairsInfoBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .comdex.asset.v1beta1.PairInfo pairsInfo = 1 [json_name = "pairsInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pairs_info&#92;""];</code>
     */
    public java.util.List<? extends com.comdex.asset.v1beta1.PairInfoOrBuilder> 
         getPairsInfoOrBuilderList() {
      if (pairsInfoBuilder_ != null) {
        return pairsInfoBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(pairsInfo_);
      }
    }
    /**
     * <code>repeated .comdex.asset.v1beta1.PairInfo pairsInfo = 1 [json_name = "pairsInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pairs_info&#92;""];</code>
     */
    public com.comdex.asset.v1beta1.PairInfo.Builder addPairsInfoBuilder() {
      return getPairsInfoFieldBuilder().addBuilder(
          com.comdex.asset.v1beta1.PairInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .comdex.asset.v1beta1.PairInfo pairsInfo = 1 [json_name = "pairsInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pairs_info&#92;""];</code>
     */
    public com.comdex.asset.v1beta1.PairInfo.Builder addPairsInfoBuilder(
        int index) {
      return getPairsInfoFieldBuilder().addBuilder(
          index, com.comdex.asset.v1beta1.PairInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .comdex.asset.v1beta1.PairInfo pairsInfo = 1 [json_name = "pairsInfo", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"pairs_info&#92;""];</code>
     */
    public java.util.List<com.comdex.asset.v1beta1.PairInfo.Builder> 
         getPairsInfoBuilderList() {
      return getPairsInfoFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.comdex.asset.v1beta1.PairInfo, com.comdex.asset.v1beta1.PairInfo.Builder, com.comdex.asset.v1beta1.PairInfoOrBuilder> 
        getPairsInfoFieldBuilder() {
      if (pairsInfoBuilder_ == null) {
        pairsInfoBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.comdex.asset.v1beta1.PairInfo, com.comdex.asset.v1beta1.PairInfo.Builder, com.comdex.asset.v1beta1.PairInfoOrBuilder>(
                pairsInfo_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        pairsInfo_ = null;
      }
      return pairsInfoBuilder_;
    }

    private com.cosmos.base.query.v1beta1.PageResponse pagination_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.query.v1beta1.PageResponse, com.cosmos.base.query.v1beta1.PageResponse.Builder, com.cosmos.base.query.v1beta1.PageResponseOrBuilder> paginationBuilder_;
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination", (.gogoproto.moretags) = "yaml:&#92;"pagination&#92;""];</code>
     * @return Whether the pagination field is set.
     */
    public boolean hasPagination() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination", (.gogoproto.moretags) = "yaml:&#92;"pagination&#92;""];</code>
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
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination", (.gogoproto.moretags) = "yaml:&#92;"pagination&#92;""];</code>
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
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination", (.gogoproto.moretags) = "yaml:&#92;"pagination&#92;""];</code>
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
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination", (.gogoproto.moretags) = "yaml:&#92;"pagination&#92;""];</code>
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
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination", (.gogoproto.moretags) = "yaml:&#92;"pagination&#92;""];</code>
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
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination", (.gogoproto.moretags) = "yaml:&#92;"pagination&#92;""];</code>
     */
    public com.cosmos.base.query.v1beta1.PageResponse.Builder getPaginationBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getPaginationFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination", (.gogoproto.moretags) = "yaml:&#92;"pagination&#92;""];</code>
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
     * <code>.cosmos.base.query.v1beta1.PageResponse pagination = 2 [json_name = "pagination", (.gogoproto.moretags) = "yaml:&#92;"pagination&#92;""];</code>
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


    // @@protoc_insertion_point(builder_scope:comdex.asset.v1beta1.QueryAssetPairsResponse)
  }

  // @@protoc_insertion_point(class_scope:comdex.asset.v1beta1.QueryAssetPairsResponse)
  private static final com.comdex.asset.v1beta1.QueryAssetPairsResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.comdex.asset.v1beta1.QueryAssetPairsResponse();
  }

  public static com.comdex.asset.v1beta1.QueryAssetPairsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryAssetPairsResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryAssetPairsResponse>() {
    @java.lang.Override
    public QueryAssetPairsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryAssetPairsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryAssetPairsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.comdex.asset.v1beta1.QueryAssetPairsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

