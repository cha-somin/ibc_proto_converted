// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/bep3/v1beta1/bep3.proto

package com.kava.bep3.v1beta1;

/**
 * <pre>
 * Params defines the parameters for the bep3 module.
 * </pre>
 *
 * Protobuf type {@code kava.bep3.v1beta1.Params}
 */
public final class Params extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kava.bep3.v1beta1.Params)
    ParamsOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Params.newBuilder() to construct.
  private Params(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Params() {
    assetParams_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Params();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kava.bep3.v1beta1.Bep3Proto.internal_static_kava_bep3_v1beta1_Params_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kava.bep3.v1beta1.Bep3Proto.internal_static_kava_bep3_v1beta1_Params_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kava.bep3.v1beta1.Params.class, com.kava.bep3.v1beta1.Params.Builder.class);
  }

  public static final int ASSET_PARAMS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.kava.bep3.v1beta1.AssetParam> assetParams_;
  /**
   * <pre>
   * asset_params define the parameters for each bep3 asset
   * </pre>
   *
   * <code>repeated .kava.bep3.v1beta1.AssetParam asset_params = 1 [json_name = "assetParams", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "AssetParams"];</code>
   */
  @java.lang.Override
  public java.util.List<com.kava.bep3.v1beta1.AssetParam> getAssetParamsList() {
    return assetParams_;
  }
  /**
   * <pre>
   * asset_params define the parameters for each bep3 asset
   * </pre>
   *
   * <code>repeated .kava.bep3.v1beta1.AssetParam asset_params = 1 [json_name = "assetParams", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "AssetParams"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.kava.bep3.v1beta1.AssetParamOrBuilder> 
      getAssetParamsOrBuilderList() {
    return assetParams_;
  }
  /**
   * <pre>
   * asset_params define the parameters for each bep3 asset
   * </pre>
   *
   * <code>repeated .kava.bep3.v1beta1.AssetParam asset_params = 1 [json_name = "assetParams", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "AssetParams"];</code>
   */
  @java.lang.Override
  public int getAssetParamsCount() {
    return assetParams_.size();
  }
  /**
   * <pre>
   * asset_params define the parameters for each bep3 asset
   * </pre>
   *
   * <code>repeated .kava.bep3.v1beta1.AssetParam asset_params = 1 [json_name = "assetParams", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "AssetParams"];</code>
   */
  @java.lang.Override
  public com.kava.bep3.v1beta1.AssetParam getAssetParams(int index) {
    return assetParams_.get(index);
  }
  /**
   * <pre>
   * asset_params define the parameters for each bep3 asset
   * </pre>
   *
   * <code>repeated .kava.bep3.v1beta1.AssetParam asset_params = 1 [json_name = "assetParams", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "AssetParams"];</code>
   */
  @java.lang.Override
  public com.kava.bep3.v1beta1.AssetParamOrBuilder getAssetParamsOrBuilder(
      int index) {
    return assetParams_.get(index);
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
    for (int i = 0; i < assetParams_.size(); i++) {
      output.writeMessage(1, assetParams_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < assetParams_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, assetParams_.get(i));
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
    if (!(obj instanceof com.kava.bep3.v1beta1.Params)) {
      return super.equals(obj);
    }
    com.kava.bep3.v1beta1.Params other = (com.kava.bep3.v1beta1.Params) obj;

    if (!getAssetParamsList()
        .equals(other.getAssetParamsList())) return false;
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
    if (getAssetParamsCount() > 0) {
      hash = (37 * hash) + ASSET_PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getAssetParamsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kava.bep3.v1beta1.Params parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.bep3.v1beta1.Params parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.bep3.v1beta1.Params parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.bep3.v1beta1.Params parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.bep3.v1beta1.Params parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.bep3.v1beta1.Params parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.bep3.v1beta1.Params parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kava.bep3.v1beta1.Params parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.kava.bep3.v1beta1.Params parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.kava.bep3.v1beta1.Params parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kava.bep3.v1beta1.Params parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kava.bep3.v1beta1.Params parseFrom(
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
  public static Builder newBuilder(com.kava.bep3.v1beta1.Params prototype) {
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
   * Params defines the parameters for the bep3 module.
   * </pre>
   *
   * Protobuf type {@code kava.bep3.v1beta1.Params}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kava.bep3.v1beta1.Params)
      com.kava.bep3.v1beta1.ParamsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kava.bep3.v1beta1.Bep3Proto.internal_static_kava_bep3_v1beta1_Params_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kava.bep3.v1beta1.Bep3Proto.internal_static_kava_bep3_v1beta1_Params_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kava.bep3.v1beta1.Params.class, com.kava.bep3.v1beta1.Params.Builder.class);
    }

    // Construct using com.kava.bep3.v1beta1.Params.newBuilder()
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
      if (assetParamsBuilder_ == null) {
        assetParams_ = java.util.Collections.emptyList();
      } else {
        assetParams_ = null;
        assetParamsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kava.bep3.v1beta1.Bep3Proto.internal_static_kava_bep3_v1beta1_Params_descriptor;
    }

    @java.lang.Override
    public com.kava.bep3.v1beta1.Params getDefaultInstanceForType() {
      return com.kava.bep3.v1beta1.Params.getDefaultInstance();
    }

    @java.lang.Override
    public com.kava.bep3.v1beta1.Params build() {
      com.kava.bep3.v1beta1.Params result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kava.bep3.v1beta1.Params buildPartial() {
      com.kava.bep3.v1beta1.Params result = new com.kava.bep3.v1beta1.Params(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.kava.bep3.v1beta1.Params result) {
      if (assetParamsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          assetParams_ = java.util.Collections.unmodifiableList(assetParams_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.assetParams_ = assetParams_;
      } else {
        result.assetParams_ = assetParamsBuilder_.build();
      }
    }

    private void buildPartial0(com.kava.bep3.v1beta1.Params result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.kava.bep3.v1beta1.Params) {
        return mergeFrom((com.kava.bep3.v1beta1.Params)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kava.bep3.v1beta1.Params other) {
      if (other == com.kava.bep3.v1beta1.Params.getDefaultInstance()) return this;
      if (assetParamsBuilder_ == null) {
        if (!other.assetParams_.isEmpty()) {
          if (assetParams_.isEmpty()) {
            assetParams_ = other.assetParams_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAssetParamsIsMutable();
            assetParams_.addAll(other.assetParams_);
          }
          onChanged();
        }
      } else {
        if (!other.assetParams_.isEmpty()) {
          if (assetParamsBuilder_.isEmpty()) {
            assetParamsBuilder_.dispose();
            assetParamsBuilder_ = null;
            assetParams_ = other.assetParams_;
            bitField0_ = (bitField0_ & ~0x00000001);
            assetParamsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAssetParamsFieldBuilder() : null;
          } else {
            assetParamsBuilder_.addAllMessages(other.assetParams_);
          }
        }
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
              com.kava.bep3.v1beta1.AssetParam m =
                  input.readMessage(
                      com.kava.bep3.v1beta1.AssetParam.parser(),
                      extensionRegistry);
              if (assetParamsBuilder_ == null) {
                ensureAssetParamsIsMutable();
                assetParams_.add(m);
              } else {
                assetParamsBuilder_.addMessage(m);
              }
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

    private java.util.List<com.kava.bep3.v1beta1.AssetParam> assetParams_ =
      java.util.Collections.emptyList();
    private void ensureAssetParamsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        assetParams_ = new java.util.ArrayList<com.kava.bep3.v1beta1.AssetParam>(assetParams_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.kava.bep3.v1beta1.AssetParam, com.kava.bep3.v1beta1.AssetParam.Builder, com.kava.bep3.v1beta1.AssetParamOrBuilder> assetParamsBuilder_;

    /**
     * <pre>
     * asset_params define the parameters for each bep3 asset
     * </pre>
     *
     * <code>repeated .kava.bep3.v1beta1.AssetParam asset_params = 1 [json_name = "assetParams", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "AssetParams"];</code>
     */
    public java.util.List<com.kava.bep3.v1beta1.AssetParam> getAssetParamsList() {
      if (assetParamsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(assetParams_);
      } else {
        return assetParamsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * asset_params define the parameters for each bep3 asset
     * </pre>
     *
     * <code>repeated .kava.bep3.v1beta1.AssetParam asset_params = 1 [json_name = "assetParams", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "AssetParams"];</code>
     */
    public int getAssetParamsCount() {
      if (assetParamsBuilder_ == null) {
        return assetParams_.size();
      } else {
        return assetParamsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * asset_params define the parameters for each bep3 asset
     * </pre>
     *
     * <code>repeated .kava.bep3.v1beta1.AssetParam asset_params = 1 [json_name = "assetParams", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "AssetParams"];</code>
     */
    public com.kava.bep3.v1beta1.AssetParam getAssetParams(int index) {
      if (assetParamsBuilder_ == null) {
        return assetParams_.get(index);
      } else {
        return assetParamsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * asset_params define the parameters for each bep3 asset
     * </pre>
     *
     * <code>repeated .kava.bep3.v1beta1.AssetParam asset_params = 1 [json_name = "assetParams", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "AssetParams"];</code>
     */
    public Builder setAssetParams(
        int index, com.kava.bep3.v1beta1.AssetParam value) {
      if (assetParamsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAssetParamsIsMutable();
        assetParams_.set(index, value);
        onChanged();
      } else {
        assetParamsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * asset_params define the parameters for each bep3 asset
     * </pre>
     *
     * <code>repeated .kava.bep3.v1beta1.AssetParam asset_params = 1 [json_name = "assetParams", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "AssetParams"];</code>
     */
    public Builder setAssetParams(
        int index, com.kava.bep3.v1beta1.AssetParam.Builder builderForValue) {
      if (assetParamsBuilder_ == null) {
        ensureAssetParamsIsMutable();
        assetParams_.set(index, builderForValue.build());
        onChanged();
      } else {
        assetParamsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * asset_params define the parameters for each bep3 asset
     * </pre>
     *
     * <code>repeated .kava.bep3.v1beta1.AssetParam asset_params = 1 [json_name = "assetParams", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "AssetParams"];</code>
     */
    public Builder addAssetParams(com.kava.bep3.v1beta1.AssetParam value) {
      if (assetParamsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAssetParamsIsMutable();
        assetParams_.add(value);
        onChanged();
      } else {
        assetParamsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * asset_params define the parameters for each bep3 asset
     * </pre>
     *
     * <code>repeated .kava.bep3.v1beta1.AssetParam asset_params = 1 [json_name = "assetParams", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "AssetParams"];</code>
     */
    public Builder addAssetParams(
        int index, com.kava.bep3.v1beta1.AssetParam value) {
      if (assetParamsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAssetParamsIsMutable();
        assetParams_.add(index, value);
        onChanged();
      } else {
        assetParamsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * asset_params define the parameters for each bep3 asset
     * </pre>
     *
     * <code>repeated .kava.bep3.v1beta1.AssetParam asset_params = 1 [json_name = "assetParams", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "AssetParams"];</code>
     */
    public Builder addAssetParams(
        com.kava.bep3.v1beta1.AssetParam.Builder builderForValue) {
      if (assetParamsBuilder_ == null) {
        ensureAssetParamsIsMutable();
        assetParams_.add(builderForValue.build());
        onChanged();
      } else {
        assetParamsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * asset_params define the parameters for each bep3 asset
     * </pre>
     *
     * <code>repeated .kava.bep3.v1beta1.AssetParam asset_params = 1 [json_name = "assetParams", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "AssetParams"];</code>
     */
    public Builder addAssetParams(
        int index, com.kava.bep3.v1beta1.AssetParam.Builder builderForValue) {
      if (assetParamsBuilder_ == null) {
        ensureAssetParamsIsMutable();
        assetParams_.add(index, builderForValue.build());
        onChanged();
      } else {
        assetParamsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * asset_params define the parameters for each bep3 asset
     * </pre>
     *
     * <code>repeated .kava.bep3.v1beta1.AssetParam asset_params = 1 [json_name = "assetParams", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "AssetParams"];</code>
     */
    public Builder addAllAssetParams(
        java.lang.Iterable<? extends com.kava.bep3.v1beta1.AssetParam> values) {
      if (assetParamsBuilder_ == null) {
        ensureAssetParamsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, assetParams_);
        onChanged();
      } else {
        assetParamsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * asset_params define the parameters for each bep3 asset
     * </pre>
     *
     * <code>repeated .kava.bep3.v1beta1.AssetParam asset_params = 1 [json_name = "assetParams", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "AssetParams"];</code>
     */
    public Builder clearAssetParams() {
      if (assetParamsBuilder_ == null) {
        assetParams_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        assetParamsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * asset_params define the parameters for each bep3 asset
     * </pre>
     *
     * <code>repeated .kava.bep3.v1beta1.AssetParam asset_params = 1 [json_name = "assetParams", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "AssetParams"];</code>
     */
    public Builder removeAssetParams(int index) {
      if (assetParamsBuilder_ == null) {
        ensureAssetParamsIsMutable();
        assetParams_.remove(index);
        onChanged();
      } else {
        assetParamsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * asset_params define the parameters for each bep3 asset
     * </pre>
     *
     * <code>repeated .kava.bep3.v1beta1.AssetParam asset_params = 1 [json_name = "assetParams", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "AssetParams"];</code>
     */
    public com.kava.bep3.v1beta1.AssetParam.Builder getAssetParamsBuilder(
        int index) {
      return getAssetParamsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * asset_params define the parameters for each bep3 asset
     * </pre>
     *
     * <code>repeated .kava.bep3.v1beta1.AssetParam asset_params = 1 [json_name = "assetParams", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "AssetParams"];</code>
     */
    public com.kava.bep3.v1beta1.AssetParamOrBuilder getAssetParamsOrBuilder(
        int index) {
      if (assetParamsBuilder_ == null) {
        return assetParams_.get(index);  } else {
        return assetParamsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * asset_params define the parameters for each bep3 asset
     * </pre>
     *
     * <code>repeated .kava.bep3.v1beta1.AssetParam asset_params = 1 [json_name = "assetParams", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "AssetParams"];</code>
     */
    public java.util.List<? extends com.kava.bep3.v1beta1.AssetParamOrBuilder> 
         getAssetParamsOrBuilderList() {
      if (assetParamsBuilder_ != null) {
        return assetParamsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(assetParams_);
      }
    }
    /**
     * <pre>
     * asset_params define the parameters for each bep3 asset
     * </pre>
     *
     * <code>repeated .kava.bep3.v1beta1.AssetParam asset_params = 1 [json_name = "assetParams", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "AssetParams"];</code>
     */
    public com.kava.bep3.v1beta1.AssetParam.Builder addAssetParamsBuilder() {
      return getAssetParamsFieldBuilder().addBuilder(
          com.kava.bep3.v1beta1.AssetParam.getDefaultInstance());
    }
    /**
     * <pre>
     * asset_params define the parameters for each bep3 asset
     * </pre>
     *
     * <code>repeated .kava.bep3.v1beta1.AssetParam asset_params = 1 [json_name = "assetParams", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "AssetParams"];</code>
     */
    public com.kava.bep3.v1beta1.AssetParam.Builder addAssetParamsBuilder(
        int index) {
      return getAssetParamsFieldBuilder().addBuilder(
          index, com.kava.bep3.v1beta1.AssetParam.getDefaultInstance());
    }
    /**
     * <pre>
     * asset_params define the parameters for each bep3 asset
     * </pre>
     *
     * <code>repeated .kava.bep3.v1beta1.AssetParam asset_params = 1 [json_name = "assetParams", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "AssetParams"];</code>
     */
    public java.util.List<com.kava.bep3.v1beta1.AssetParam.Builder> 
         getAssetParamsBuilderList() {
      return getAssetParamsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.kava.bep3.v1beta1.AssetParam, com.kava.bep3.v1beta1.AssetParam.Builder, com.kava.bep3.v1beta1.AssetParamOrBuilder> 
        getAssetParamsFieldBuilder() {
      if (assetParamsBuilder_ == null) {
        assetParamsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.kava.bep3.v1beta1.AssetParam, com.kava.bep3.v1beta1.AssetParam.Builder, com.kava.bep3.v1beta1.AssetParamOrBuilder>(
                assetParams_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        assetParams_ = null;
      }
      return assetParamsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:kava.bep3.v1beta1.Params)
  }

  // @@protoc_insertion_point(class_scope:kava.bep3.v1beta1.Params)
  private static final com.kava.bep3.v1beta1.Params DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kava.bep3.v1beta1.Params();
  }

  public static com.kava.bep3.v1beta1.Params getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Params>
      PARSER = new com.google.protobuf.AbstractParser<Params>() {
    @java.lang.Override
    public Params parsePartialFrom(
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

  public static com.google.protobuf.Parser<Params> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Params> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.kava.bep3.v1beta1.Params getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

