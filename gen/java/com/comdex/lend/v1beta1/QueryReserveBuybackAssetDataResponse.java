// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: comdex/lend/v1beta1/query.proto

package com.comdex.lend.v1beta1;

/**
 * Protobuf type {@code comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse}
 */
public final class QueryReserveBuybackAssetDataResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse)
    QueryReserveBuybackAssetDataResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryReserveBuybackAssetDataResponse.newBuilder() to construct.
  private QueryReserveBuybackAssetDataResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryReserveBuybackAssetDataResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryReserveBuybackAssetDataResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.comdex.lend.v1beta1.QueryProto.internal_static_comdex_lend_v1beta1_QueryReserveBuybackAssetDataResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.comdex.lend.v1beta1.QueryProto.internal_static_comdex_lend_v1beta1_QueryReserveBuybackAssetDataResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse.class, com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse.Builder.class);
  }

  public static final int RESERVEBUYBACKASSETDATA_FIELD_NUMBER = 1;
  private com.comdex.lend.v1beta1.ReserveBuybackAssetData reserveBuybackAssetData_;
  /**
   * <code>.comdex.lend.v1beta1.ReserveBuybackAssetData ReserveBuybackAssetData = 1 [json_name = "ReserveBuybackAssetData", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"reserve_buyback_asset_data&#92;""];</code>
   * @return Whether the reserveBuybackAssetData field is set.
   */
  @java.lang.Override
  public boolean hasReserveBuybackAssetData() {
    return reserveBuybackAssetData_ != null;
  }
  /**
   * <code>.comdex.lend.v1beta1.ReserveBuybackAssetData ReserveBuybackAssetData = 1 [json_name = "ReserveBuybackAssetData", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"reserve_buyback_asset_data&#92;""];</code>
   * @return The reserveBuybackAssetData.
   */
  @java.lang.Override
  public com.comdex.lend.v1beta1.ReserveBuybackAssetData getReserveBuybackAssetData() {
    return reserveBuybackAssetData_ == null ? com.comdex.lend.v1beta1.ReserveBuybackAssetData.getDefaultInstance() : reserveBuybackAssetData_;
  }
  /**
   * <code>.comdex.lend.v1beta1.ReserveBuybackAssetData ReserveBuybackAssetData = 1 [json_name = "ReserveBuybackAssetData", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"reserve_buyback_asset_data&#92;""];</code>
   */
  @java.lang.Override
  public com.comdex.lend.v1beta1.ReserveBuybackAssetDataOrBuilder getReserveBuybackAssetDataOrBuilder() {
    return reserveBuybackAssetData_ == null ? com.comdex.lend.v1beta1.ReserveBuybackAssetData.getDefaultInstance() : reserveBuybackAssetData_;
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
    if (reserveBuybackAssetData_ != null) {
      output.writeMessage(1, getReserveBuybackAssetData());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (reserveBuybackAssetData_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getReserveBuybackAssetData());
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
    if (!(obj instanceof com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse)) {
      return super.equals(obj);
    }
    com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse other = (com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse) obj;

    if (hasReserveBuybackAssetData() != other.hasReserveBuybackAssetData()) return false;
    if (hasReserveBuybackAssetData()) {
      if (!getReserveBuybackAssetData()
          .equals(other.getReserveBuybackAssetData())) return false;
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
    if (hasReserveBuybackAssetData()) {
      hash = (37 * hash) + RESERVEBUYBACKASSETDATA_FIELD_NUMBER;
      hash = (53 * hash) + getReserveBuybackAssetData().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse parseFrom(
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
  public static Builder newBuilder(com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse prototype) {
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
   * Protobuf type {@code comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse)
      com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.comdex.lend.v1beta1.QueryProto.internal_static_comdex_lend_v1beta1_QueryReserveBuybackAssetDataResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.comdex.lend.v1beta1.QueryProto.internal_static_comdex_lend_v1beta1_QueryReserveBuybackAssetDataResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse.class, com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse.Builder.class);
    }

    // Construct using com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse.newBuilder()
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
      reserveBuybackAssetData_ = null;
      if (reserveBuybackAssetDataBuilder_ != null) {
        reserveBuybackAssetDataBuilder_.dispose();
        reserveBuybackAssetDataBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.comdex.lend.v1beta1.QueryProto.internal_static_comdex_lend_v1beta1_QueryReserveBuybackAssetDataResponse_descriptor;
    }

    @java.lang.Override
    public com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse getDefaultInstanceForType() {
      return com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse build() {
      com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse buildPartial() {
      com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse result = new com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.reserveBuybackAssetData_ = reserveBuybackAssetDataBuilder_ == null
            ? reserveBuybackAssetData_
            : reserveBuybackAssetDataBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse) {
        return mergeFrom((com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse other) {
      if (other == com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse.getDefaultInstance()) return this;
      if (other.hasReserveBuybackAssetData()) {
        mergeReserveBuybackAssetData(other.getReserveBuybackAssetData());
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
                  getReserveBuybackAssetDataFieldBuilder().getBuilder(),
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

    private com.comdex.lend.v1beta1.ReserveBuybackAssetData reserveBuybackAssetData_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.comdex.lend.v1beta1.ReserveBuybackAssetData, com.comdex.lend.v1beta1.ReserveBuybackAssetData.Builder, com.comdex.lend.v1beta1.ReserveBuybackAssetDataOrBuilder> reserveBuybackAssetDataBuilder_;
    /**
     * <code>.comdex.lend.v1beta1.ReserveBuybackAssetData ReserveBuybackAssetData = 1 [json_name = "ReserveBuybackAssetData", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"reserve_buyback_asset_data&#92;""];</code>
     * @return Whether the reserveBuybackAssetData field is set.
     */
    public boolean hasReserveBuybackAssetData() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.comdex.lend.v1beta1.ReserveBuybackAssetData ReserveBuybackAssetData = 1 [json_name = "ReserveBuybackAssetData", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"reserve_buyback_asset_data&#92;""];</code>
     * @return The reserveBuybackAssetData.
     */
    public com.comdex.lend.v1beta1.ReserveBuybackAssetData getReserveBuybackAssetData() {
      if (reserveBuybackAssetDataBuilder_ == null) {
        return reserveBuybackAssetData_ == null ? com.comdex.lend.v1beta1.ReserveBuybackAssetData.getDefaultInstance() : reserveBuybackAssetData_;
      } else {
        return reserveBuybackAssetDataBuilder_.getMessage();
      }
    }
    /**
     * <code>.comdex.lend.v1beta1.ReserveBuybackAssetData ReserveBuybackAssetData = 1 [json_name = "ReserveBuybackAssetData", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"reserve_buyback_asset_data&#92;""];</code>
     */
    public Builder setReserveBuybackAssetData(com.comdex.lend.v1beta1.ReserveBuybackAssetData value) {
      if (reserveBuybackAssetDataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        reserveBuybackAssetData_ = value;
      } else {
        reserveBuybackAssetDataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.comdex.lend.v1beta1.ReserveBuybackAssetData ReserveBuybackAssetData = 1 [json_name = "ReserveBuybackAssetData", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"reserve_buyback_asset_data&#92;""];</code>
     */
    public Builder setReserveBuybackAssetData(
        com.comdex.lend.v1beta1.ReserveBuybackAssetData.Builder builderForValue) {
      if (reserveBuybackAssetDataBuilder_ == null) {
        reserveBuybackAssetData_ = builderForValue.build();
      } else {
        reserveBuybackAssetDataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.comdex.lend.v1beta1.ReserveBuybackAssetData ReserveBuybackAssetData = 1 [json_name = "ReserveBuybackAssetData", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"reserve_buyback_asset_data&#92;""];</code>
     */
    public Builder mergeReserveBuybackAssetData(com.comdex.lend.v1beta1.ReserveBuybackAssetData value) {
      if (reserveBuybackAssetDataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          reserveBuybackAssetData_ != null &&
          reserveBuybackAssetData_ != com.comdex.lend.v1beta1.ReserveBuybackAssetData.getDefaultInstance()) {
          getReserveBuybackAssetDataBuilder().mergeFrom(value);
        } else {
          reserveBuybackAssetData_ = value;
        }
      } else {
        reserveBuybackAssetDataBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.comdex.lend.v1beta1.ReserveBuybackAssetData ReserveBuybackAssetData = 1 [json_name = "ReserveBuybackAssetData", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"reserve_buyback_asset_data&#92;""];</code>
     */
    public Builder clearReserveBuybackAssetData() {
      bitField0_ = (bitField0_ & ~0x00000001);
      reserveBuybackAssetData_ = null;
      if (reserveBuybackAssetDataBuilder_ != null) {
        reserveBuybackAssetDataBuilder_.dispose();
        reserveBuybackAssetDataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.comdex.lend.v1beta1.ReserveBuybackAssetData ReserveBuybackAssetData = 1 [json_name = "ReserveBuybackAssetData", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"reserve_buyback_asset_data&#92;""];</code>
     */
    public com.comdex.lend.v1beta1.ReserveBuybackAssetData.Builder getReserveBuybackAssetDataBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getReserveBuybackAssetDataFieldBuilder().getBuilder();
    }
    /**
     * <code>.comdex.lend.v1beta1.ReserveBuybackAssetData ReserveBuybackAssetData = 1 [json_name = "ReserveBuybackAssetData", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"reserve_buyback_asset_data&#92;""];</code>
     */
    public com.comdex.lend.v1beta1.ReserveBuybackAssetDataOrBuilder getReserveBuybackAssetDataOrBuilder() {
      if (reserveBuybackAssetDataBuilder_ != null) {
        return reserveBuybackAssetDataBuilder_.getMessageOrBuilder();
      } else {
        return reserveBuybackAssetData_ == null ?
            com.comdex.lend.v1beta1.ReserveBuybackAssetData.getDefaultInstance() : reserveBuybackAssetData_;
      }
    }
    /**
     * <code>.comdex.lend.v1beta1.ReserveBuybackAssetData ReserveBuybackAssetData = 1 [json_name = "ReserveBuybackAssetData", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"reserve_buyback_asset_data&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.comdex.lend.v1beta1.ReserveBuybackAssetData, com.comdex.lend.v1beta1.ReserveBuybackAssetData.Builder, com.comdex.lend.v1beta1.ReserveBuybackAssetDataOrBuilder> 
        getReserveBuybackAssetDataFieldBuilder() {
      if (reserveBuybackAssetDataBuilder_ == null) {
        reserveBuybackAssetDataBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.comdex.lend.v1beta1.ReserveBuybackAssetData, com.comdex.lend.v1beta1.ReserveBuybackAssetData.Builder, com.comdex.lend.v1beta1.ReserveBuybackAssetDataOrBuilder>(
                getReserveBuybackAssetData(),
                getParentForChildren(),
                isClean());
        reserveBuybackAssetData_ = null;
      }
      return reserveBuybackAssetDataBuilder_;
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


    // @@protoc_insertion_point(builder_scope:comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse)
  }

  // @@protoc_insertion_point(class_scope:comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse)
  private static final com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse();
  }

  public static com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryReserveBuybackAssetDataResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryReserveBuybackAssetDataResponse>() {
    @java.lang.Override
    public QueryReserveBuybackAssetDataResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryReserveBuybackAssetDataResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryReserveBuybackAssetDataResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.comdex.lend.v1beta1.QueryReserveBuybackAssetDataResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

