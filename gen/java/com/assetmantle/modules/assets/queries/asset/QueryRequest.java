// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetmantle/assets/queries/asset/query_request.proto

package com.assetmantle.modules.assets.queries.asset;

/**
 * Protobuf type {@code assetmantle.modules.assets.queries.asset.QueryRequest}
 */
public final class QueryRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:assetmantle.modules.assets.queries.asset.QueryRequest)
    QueryRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryRequest.newBuilder() to construct.
  private QueryRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryRequest() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.assetmantle.modules.assets.queries.asset.QueryRequestProto.internal_static_assetmantle_modules_assets_queries_asset_QueryRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.assetmantle.modules.assets.queries.asset.QueryRequestProto.internal_static_assetmantle_modules_assets_queries_asset_QueryRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.assetmantle.modules.assets.queries.asset.QueryRequest.class, com.assetmantle.modules.assets.queries.asset.QueryRequest.Builder.class);
  }

  public static final int ASSET_I_D_FIELD_NUMBER = 1;
  private com.assetmantle.schema.ids.base.AssetID assetID_;
  /**
   * <code>.assetmantle.schema.ids.base.AssetID asset_i_d = 1 [json_name = "assetID"];</code>
   * @return Whether the assetID field is set.
   */
  @java.lang.Override
  public boolean hasAssetID() {
    return assetID_ != null;
  }
  /**
   * <code>.assetmantle.schema.ids.base.AssetID asset_i_d = 1 [json_name = "assetID"];</code>
   * @return The assetID.
   */
  @java.lang.Override
  public com.assetmantle.schema.ids.base.AssetID getAssetID() {
    return assetID_ == null ? com.assetmantle.schema.ids.base.AssetID.getDefaultInstance() : assetID_;
  }
  /**
   * <code>.assetmantle.schema.ids.base.AssetID asset_i_d = 1 [json_name = "assetID"];</code>
   */
  @java.lang.Override
  public com.assetmantle.schema.ids.base.AssetIDOrBuilder getAssetIDOrBuilder() {
    return assetID_ == null ? com.assetmantle.schema.ids.base.AssetID.getDefaultInstance() : assetID_;
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
    if (assetID_ != null) {
      output.writeMessage(1, getAssetID());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (assetID_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getAssetID());
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
    if (!(obj instanceof com.assetmantle.modules.assets.queries.asset.QueryRequest)) {
      return super.equals(obj);
    }
    com.assetmantle.modules.assets.queries.asset.QueryRequest other = (com.assetmantle.modules.assets.queries.asset.QueryRequest) obj;

    if (hasAssetID() != other.hasAssetID()) return false;
    if (hasAssetID()) {
      if (!getAssetID()
          .equals(other.getAssetID())) return false;
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
    if (hasAssetID()) {
      hash = (37 * hash) + ASSET_I_D_FIELD_NUMBER;
      hash = (53 * hash) + getAssetID().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.assetmantle.modules.assets.queries.asset.QueryRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.assetmantle.modules.assets.queries.asset.QueryRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.assetmantle.modules.assets.queries.asset.QueryRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.assetmantle.modules.assets.queries.asset.QueryRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.assetmantle.modules.assets.queries.asset.QueryRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.assetmantle.modules.assets.queries.asset.QueryRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.assetmantle.modules.assets.queries.asset.QueryRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.assetmantle.modules.assets.queries.asset.QueryRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.assetmantle.modules.assets.queries.asset.QueryRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.assetmantle.modules.assets.queries.asset.QueryRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.assetmantle.modules.assets.queries.asset.QueryRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.assetmantle.modules.assets.queries.asset.QueryRequest parseFrom(
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
  public static Builder newBuilder(com.assetmantle.modules.assets.queries.asset.QueryRequest prototype) {
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
   * Protobuf type {@code assetmantle.modules.assets.queries.asset.QueryRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:assetmantle.modules.assets.queries.asset.QueryRequest)
      com.assetmantle.modules.assets.queries.asset.QueryRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.assetmantle.modules.assets.queries.asset.QueryRequestProto.internal_static_assetmantle_modules_assets_queries_asset_QueryRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.assetmantle.modules.assets.queries.asset.QueryRequestProto.internal_static_assetmantle_modules_assets_queries_asset_QueryRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.assetmantle.modules.assets.queries.asset.QueryRequest.class, com.assetmantle.modules.assets.queries.asset.QueryRequest.Builder.class);
    }

    // Construct using com.assetmantle.modules.assets.queries.asset.QueryRequest.newBuilder()
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
      assetID_ = null;
      if (assetIDBuilder_ != null) {
        assetIDBuilder_.dispose();
        assetIDBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.assetmantle.modules.assets.queries.asset.QueryRequestProto.internal_static_assetmantle_modules_assets_queries_asset_QueryRequest_descriptor;
    }

    @java.lang.Override
    public com.assetmantle.modules.assets.queries.asset.QueryRequest getDefaultInstanceForType() {
      return com.assetmantle.modules.assets.queries.asset.QueryRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.assetmantle.modules.assets.queries.asset.QueryRequest build() {
      com.assetmantle.modules.assets.queries.asset.QueryRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.assetmantle.modules.assets.queries.asset.QueryRequest buildPartial() {
      com.assetmantle.modules.assets.queries.asset.QueryRequest result = new com.assetmantle.modules.assets.queries.asset.QueryRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.assetmantle.modules.assets.queries.asset.QueryRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.assetID_ = assetIDBuilder_ == null
            ? assetID_
            : assetIDBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.assetmantle.modules.assets.queries.asset.QueryRequest) {
        return mergeFrom((com.assetmantle.modules.assets.queries.asset.QueryRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.assetmantle.modules.assets.queries.asset.QueryRequest other) {
      if (other == com.assetmantle.modules.assets.queries.asset.QueryRequest.getDefaultInstance()) return this;
      if (other.hasAssetID()) {
        mergeAssetID(other.getAssetID());
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
                  getAssetIDFieldBuilder().getBuilder(),
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

    private com.assetmantle.schema.ids.base.AssetID assetID_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.assetmantle.schema.ids.base.AssetID, com.assetmantle.schema.ids.base.AssetID.Builder, com.assetmantle.schema.ids.base.AssetIDOrBuilder> assetIDBuilder_;
    /**
     * <code>.assetmantle.schema.ids.base.AssetID asset_i_d = 1 [json_name = "assetID"];</code>
     * @return Whether the assetID field is set.
     */
    public boolean hasAssetID() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.assetmantle.schema.ids.base.AssetID asset_i_d = 1 [json_name = "assetID"];</code>
     * @return The assetID.
     */
    public com.assetmantle.schema.ids.base.AssetID getAssetID() {
      if (assetIDBuilder_ == null) {
        return assetID_ == null ? com.assetmantle.schema.ids.base.AssetID.getDefaultInstance() : assetID_;
      } else {
        return assetIDBuilder_.getMessage();
      }
    }
    /**
     * <code>.assetmantle.schema.ids.base.AssetID asset_i_d = 1 [json_name = "assetID"];</code>
     */
    public Builder setAssetID(com.assetmantle.schema.ids.base.AssetID value) {
      if (assetIDBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        assetID_ = value;
      } else {
        assetIDBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.assetmantle.schema.ids.base.AssetID asset_i_d = 1 [json_name = "assetID"];</code>
     */
    public Builder setAssetID(
        com.assetmantle.schema.ids.base.AssetID.Builder builderForValue) {
      if (assetIDBuilder_ == null) {
        assetID_ = builderForValue.build();
      } else {
        assetIDBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.assetmantle.schema.ids.base.AssetID asset_i_d = 1 [json_name = "assetID"];</code>
     */
    public Builder mergeAssetID(com.assetmantle.schema.ids.base.AssetID value) {
      if (assetIDBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          assetID_ != null &&
          assetID_ != com.assetmantle.schema.ids.base.AssetID.getDefaultInstance()) {
          getAssetIDBuilder().mergeFrom(value);
        } else {
          assetID_ = value;
        }
      } else {
        assetIDBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.assetmantle.schema.ids.base.AssetID asset_i_d = 1 [json_name = "assetID"];</code>
     */
    public Builder clearAssetID() {
      bitField0_ = (bitField0_ & ~0x00000001);
      assetID_ = null;
      if (assetIDBuilder_ != null) {
        assetIDBuilder_.dispose();
        assetIDBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.assetmantle.schema.ids.base.AssetID asset_i_d = 1 [json_name = "assetID"];</code>
     */
    public com.assetmantle.schema.ids.base.AssetID.Builder getAssetIDBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getAssetIDFieldBuilder().getBuilder();
    }
    /**
     * <code>.assetmantle.schema.ids.base.AssetID asset_i_d = 1 [json_name = "assetID"];</code>
     */
    public com.assetmantle.schema.ids.base.AssetIDOrBuilder getAssetIDOrBuilder() {
      if (assetIDBuilder_ != null) {
        return assetIDBuilder_.getMessageOrBuilder();
      } else {
        return assetID_ == null ?
            com.assetmantle.schema.ids.base.AssetID.getDefaultInstance() : assetID_;
      }
    }
    /**
     * <code>.assetmantle.schema.ids.base.AssetID asset_i_d = 1 [json_name = "assetID"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.assetmantle.schema.ids.base.AssetID, com.assetmantle.schema.ids.base.AssetID.Builder, com.assetmantle.schema.ids.base.AssetIDOrBuilder> 
        getAssetIDFieldBuilder() {
      if (assetIDBuilder_ == null) {
        assetIDBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.assetmantle.schema.ids.base.AssetID, com.assetmantle.schema.ids.base.AssetID.Builder, com.assetmantle.schema.ids.base.AssetIDOrBuilder>(
                getAssetID(),
                getParentForChildren(),
                isClean());
        assetID_ = null;
      }
      return assetIDBuilder_;
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


    // @@protoc_insertion_point(builder_scope:assetmantle.modules.assets.queries.asset.QueryRequest)
  }

  // @@protoc_insertion_point(class_scope:assetmantle.modules.assets.queries.asset.QueryRequest)
  private static final com.assetmantle.modules.assets.queries.asset.QueryRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.assetmantle.modules.assets.queries.asset.QueryRequest();
  }

  public static com.assetmantle.modules.assets.queries.asset.QueryRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryRequest>
      PARSER = new com.google.protobuf.AbstractParser<QueryRequest>() {
    @java.lang.Override
    public QueryRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.assetmantle.modules.assets.queries.asset.QueryRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

