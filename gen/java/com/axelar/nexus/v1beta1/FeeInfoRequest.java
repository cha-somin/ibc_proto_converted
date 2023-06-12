// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/nexus/v1beta1/query.proto

package com.axelar.nexus.v1beta1;

/**
 * <pre>
 * FeeInfoRequest represents a message that queries the transfer fees associated
 * to an asset on a chain
 * </pre>
 *
 * Protobuf type {@code axelar.nexus.v1beta1.FeeInfoRequest}
 */
public final class FeeInfoRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:axelar.nexus.v1beta1.FeeInfoRequest)
    FeeInfoRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use FeeInfoRequest.newBuilder() to construct.
  private FeeInfoRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private FeeInfoRequest() {
    chain_ = "";
    asset_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new FeeInfoRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.axelar.nexus.v1beta1.QueryProto.internal_static_axelar_nexus_v1beta1_FeeInfoRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.axelar.nexus.v1beta1.QueryProto.internal_static_axelar_nexus_v1beta1_FeeInfoRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.axelar.nexus.v1beta1.FeeInfoRequest.class, com.axelar.nexus.v1beta1.FeeInfoRequest.Builder.class);
  }

  public static final int CHAIN_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object chain_ = "";
  /**
   * <code>string chain = 1 [json_name = "chain"];</code>
   * @return The chain.
   */
  @java.lang.Override
  public java.lang.String getChain() {
    java.lang.Object ref = chain_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      chain_ = s;
      return s;
    }
  }
  /**
   * <code>string chain = 1 [json_name = "chain"];</code>
   * @return The bytes for chain.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getChainBytes() {
    java.lang.Object ref = chain_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      chain_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ASSET_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object asset_ = "";
  /**
   * <code>string asset = 2 [json_name = "asset"];</code>
   * @return The asset.
   */
  @java.lang.Override
  public java.lang.String getAsset() {
    java.lang.Object ref = asset_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      asset_ = s;
      return s;
    }
  }
  /**
   * <code>string asset = 2 [json_name = "asset"];</code>
   * @return The bytes for asset.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAssetBytes() {
    java.lang.Object ref = asset_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      asset_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(chain_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, chain_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(asset_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, asset_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(chain_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, chain_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(asset_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, asset_);
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
    if (!(obj instanceof com.axelar.nexus.v1beta1.FeeInfoRequest)) {
      return super.equals(obj);
    }
    com.axelar.nexus.v1beta1.FeeInfoRequest other = (com.axelar.nexus.v1beta1.FeeInfoRequest) obj;

    if (!getChain()
        .equals(other.getChain())) return false;
    if (!getAsset()
        .equals(other.getAsset())) return false;
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
    hash = (37 * hash) + CHAIN_FIELD_NUMBER;
    hash = (53 * hash) + getChain().hashCode();
    hash = (37 * hash) + ASSET_FIELD_NUMBER;
    hash = (53 * hash) + getAsset().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.axelar.nexus.v1beta1.FeeInfoRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.nexus.v1beta1.FeeInfoRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.nexus.v1beta1.FeeInfoRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.nexus.v1beta1.FeeInfoRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.nexus.v1beta1.FeeInfoRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.nexus.v1beta1.FeeInfoRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.nexus.v1beta1.FeeInfoRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.nexus.v1beta1.FeeInfoRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.axelar.nexus.v1beta1.FeeInfoRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.axelar.nexus.v1beta1.FeeInfoRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.axelar.nexus.v1beta1.FeeInfoRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.nexus.v1beta1.FeeInfoRequest parseFrom(
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
  public static Builder newBuilder(com.axelar.nexus.v1beta1.FeeInfoRequest prototype) {
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
   * FeeInfoRequest represents a message that queries the transfer fees associated
   * to an asset on a chain
   * </pre>
   *
   * Protobuf type {@code axelar.nexus.v1beta1.FeeInfoRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:axelar.nexus.v1beta1.FeeInfoRequest)
      com.axelar.nexus.v1beta1.FeeInfoRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.axelar.nexus.v1beta1.QueryProto.internal_static_axelar_nexus_v1beta1_FeeInfoRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.axelar.nexus.v1beta1.QueryProto.internal_static_axelar_nexus_v1beta1_FeeInfoRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.axelar.nexus.v1beta1.FeeInfoRequest.class, com.axelar.nexus.v1beta1.FeeInfoRequest.Builder.class);
    }

    // Construct using com.axelar.nexus.v1beta1.FeeInfoRequest.newBuilder()
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
      chain_ = "";
      asset_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.axelar.nexus.v1beta1.QueryProto.internal_static_axelar_nexus_v1beta1_FeeInfoRequest_descriptor;
    }

    @java.lang.Override
    public com.axelar.nexus.v1beta1.FeeInfoRequest getDefaultInstanceForType() {
      return com.axelar.nexus.v1beta1.FeeInfoRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.axelar.nexus.v1beta1.FeeInfoRequest build() {
      com.axelar.nexus.v1beta1.FeeInfoRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.axelar.nexus.v1beta1.FeeInfoRequest buildPartial() {
      com.axelar.nexus.v1beta1.FeeInfoRequest result = new com.axelar.nexus.v1beta1.FeeInfoRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.axelar.nexus.v1beta1.FeeInfoRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.chain_ = chain_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.asset_ = asset_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.axelar.nexus.v1beta1.FeeInfoRequest) {
        return mergeFrom((com.axelar.nexus.v1beta1.FeeInfoRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.axelar.nexus.v1beta1.FeeInfoRequest other) {
      if (other == com.axelar.nexus.v1beta1.FeeInfoRequest.getDefaultInstance()) return this;
      if (!other.getChain().isEmpty()) {
        chain_ = other.chain_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getAsset().isEmpty()) {
        asset_ = other.asset_;
        bitField0_ |= 0x00000002;
        onChanged();
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
              chain_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              asset_ = input.readStringRequireUtf8();
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

    private java.lang.Object chain_ = "";
    /**
     * <code>string chain = 1 [json_name = "chain"];</code>
     * @return The chain.
     */
    public java.lang.String getChain() {
      java.lang.Object ref = chain_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        chain_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string chain = 1 [json_name = "chain"];</code>
     * @return The bytes for chain.
     */
    public com.google.protobuf.ByteString
        getChainBytes() {
      java.lang.Object ref = chain_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        chain_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string chain = 1 [json_name = "chain"];</code>
     * @param value The chain to set.
     * @return This builder for chaining.
     */
    public Builder setChain(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      chain_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string chain = 1 [json_name = "chain"];</code>
     * @return This builder for chaining.
     */
    public Builder clearChain() {
      chain_ = getDefaultInstance().getChain();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string chain = 1 [json_name = "chain"];</code>
     * @param value The bytes for chain to set.
     * @return This builder for chaining.
     */
    public Builder setChainBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      chain_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object asset_ = "";
    /**
     * <code>string asset = 2 [json_name = "asset"];</code>
     * @return The asset.
     */
    public java.lang.String getAsset() {
      java.lang.Object ref = asset_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        asset_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string asset = 2 [json_name = "asset"];</code>
     * @return The bytes for asset.
     */
    public com.google.protobuf.ByteString
        getAssetBytes() {
      java.lang.Object ref = asset_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        asset_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string asset = 2 [json_name = "asset"];</code>
     * @param value The asset to set.
     * @return This builder for chaining.
     */
    public Builder setAsset(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      asset_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string asset = 2 [json_name = "asset"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAsset() {
      asset_ = getDefaultInstance().getAsset();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string asset = 2 [json_name = "asset"];</code>
     * @param value The bytes for asset to set.
     * @return This builder for chaining.
     */
    public Builder setAssetBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      asset_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:axelar.nexus.v1beta1.FeeInfoRequest)
  }

  // @@protoc_insertion_point(class_scope:axelar.nexus.v1beta1.FeeInfoRequest)
  private static final com.axelar.nexus.v1beta1.FeeInfoRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.axelar.nexus.v1beta1.FeeInfoRequest();
  }

  public static com.axelar.nexus.v1beta1.FeeInfoRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeeInfoRequest>
      PARSER = new com.google.protobuf.AbstractParser<FeeInfoRequest>() {
    @java.lang.Override
    public FeeInfoRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<FeeInfoRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeeInfoRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.axelar.nexus.v1beta1.FeeInfoRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

