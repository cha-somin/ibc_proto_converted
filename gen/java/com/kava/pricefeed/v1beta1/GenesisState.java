// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: kava/pricefeed/v1beta1/genesis.proto

package com.kava.pricefeed.v1beta1;

/**
 * <pre>
 * GenesisState defines the pricefeed module's genesis state.
 * </pre>
 *
 * Protobuf type {@code kava.pricefeed.v1beta1.GenesisState}
 */
public final class GenesisState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:kava.pricefeed.v1beta1.GenesisState)
    GenesisStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenesisState.newBuilder() to construct.
  private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenesisState() {
    postedPrices_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenesisState();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.kava.pricefeed.v1beta1.GenesisProto.internal_static_kava_pricefeed_v1beta1_GenesisState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.kava.pricefeed.v1beta1.GenesisProto.internal_static_kava_pricefeed_v1beta1_GenesisState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.kava.pricefeed.v1beta1.GenesisState.class, com.kava.pricefeed.v1beta1.GenesisState.Builder.class);
  }

  public static final int PARAMS_FIELD_NUMBER = 1;
  private com.kava.pricefeed.v1beta1.Params params_;
  /**
   * <pre>
   * params defines all the paramaters of the module.
   * </pre>
   *
   * <code>.kava.pricefeed.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return Whether the params field is set.
   */
  @java.lang.Override
  public boolean hasParams() {
    return params_ != null;
  }
  /**
   * <pre>
   * params defines all the paramaters of the module.
   * </pre>
   *
   * <code>.kava.pricefeed.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return The params.
   */
  @java.lang.Override
  public com.kava.pricefeed.v1beta1.Params getParams() {
    return params_ == null ? com.kava.pricefeed.v1beta1.Params.getDefaultInstance() : params_;
  }
  /**
   * <pre>
   * params defines all the paramaters of the module.
   * </pre>
   *
   * <code>.kava.pricefeed.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.kava.pricefeed.v1beta1.ParamsOrBuilder getParamsOrBuilder() {
    return params_ == null ? com.kava.pricefeed.v1beta1.Params.getDefaultInstance() : params_;
  }

  public static final int POSTED_PRICES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.kava.pricefeed.v1beta1.PostedPrice> postedPrices_;
  /**
   * <code>repeated .kava.pricefeed.v1beta1.PostedPrice posted_prices = 2 [json_name = "postedPrices", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "PostedPrices"];</code>
   */
  @java.lang.Override
  public java.util.List<com.kava.pricefeed.v1beta1.PostedPrice> getPostedPricesList() {
    return postedPrices_;
  }
  /**
   * <code>repeated .kava.pricefeed.v1beta1.PostedPrice posted_prices = 2 [json_name = "postedPrices", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "PostedPrices"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.kava.pricefeed.v1beta1.PostedPriceOrBuilder> 
      getPostedPricesOrBuilderList() {
    return postedPrices_;
  }
  /**
   * <code>repeated .kava.pricefeed.v1beta1.PostedPrice posted_prices = 2 [json_name = "postedPrices", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "PostedPrices"];</code>
   */
  @java.lang.Override
  public int getPostedPricesCount() {
    return postedPrices_.size();
  }
  /**
   * <code>repeated .kava.pricefeed.v1beta1.PostedPrice posted_prices = 2 [json_name = "postedPrices", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "PostedPrices"];</code>
   */
  @java.lang.Override
  public com.kava.pricefeed.v1beta1.PostedPrice getPostedPrices(int index) {
    return postedPrices_.get(index);
  }
  /**
   * <code>repeated .kava.pricefeed.v1beta1.PostedPrice posted_prices = 2 [json_name = "postedPrices", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "PostedPrices"];</code>
   */
  @java.lang.Override
  public com.kava.pricefeed.v1beta1.PostedPriceOrBuilder getPostedPricesOrBuilder(
      int index) {
    return postedPrices_.get(index);
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
    if (params_ != null) {
      output.writeMessage(1, getParams());
    }
    for (int i = 0; i < postedPrices_.size(); i++) {
      output.writeMessage(2, postedPrices_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (params_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getParams());
    }
    for (int i = 0; i < postedPrices_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, postedPrices_.get(i));
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
    if (!(obj instanceof com.kava.pricefeed.v1beta1.GenesisState)) {
      return super.equals(obj);
    }
    com.kava.pricefeed.v1beta1.GenesisState other = (com.kava.pricefeed.v1beta1.GenesisState) obj;

    if (hasParams() != other.hasParams()) return false;
    if (hasParams()) {
      if (!getParams()
          .equals(other.getParams())) return false;
    }
    if (!getPostedPricesList()
        .equals(other.getPostedPricesList())) return false;
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
    if (hasParams()) {
      hash = (37 * hash) + PARAMS_FIELD_NUMBER;
      hash = (53 * hash) + getParams().hashCode();
    }
    if (getPostedPricesCount() > 0) {
      hash = (37 * hash) + POSTED_PRICES_FIELD_NUMBER;
      hash = (53 * hash) + getPostedPricesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.kava.pricefeed.v1beta1.GenesisState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.pricefeed.v1beta1.GenesisState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.pricefeed.v1beta1.GenesisState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.pricefeed.v1beta1.GenesisState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.pricefeed.v1beta1.GenesisState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.kava.pricefeed.v1beta1.GenesisState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.kava.pricefeed.v1beta1.GenesisState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kava.pricefeed.v1beta1.GenesisState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.kava.pricefeed.v1beta1.GenesisState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.kava.pricefeed.v1beta1.GenesisState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.kava.pricefeed.v1beta1.GenesisState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.kava.pricefeed.v1beta1.GenesisState parseFrom(
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
  public static Builder newBuilder(com.kava.pricefeed.v1beta1.GenesisState prototype) {
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
   * GenesisState defines the pricefeed module's genesis state.
   * </pre>
   *
   * Protobuf type {@code kava.pricefeed.v1beta1.GenesisState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:kava.pricefeed.v1beta1.GenesisState)
      com.kava.pricefeed.v1beta1.GenesisStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.kava.pricefeed.v1beta1.GenesisProto.internal_static_kava_pricefeed_v1beta1_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.kava.pricefeed.v1beta1.GenesisProto.internal_static_kava_pricefeed_v1beta1_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.kava.pricefeed.v1beta1.GenesisState.class, com.kava.pricefeed.v1beta1.GenesisState.Builder.class);
    }

    // Construct using com.kava.pricefeed.v1beta1.GenesisState.newBuilder()
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
      params_ = null;
      if (paramsBuilder_ != null) {
        paramsBuilder_.dispose();
        paramsBuilder_ = null;
      }
      if (postedPricesBuilder_ == null) {
        postedPrices_ = java.util.Collections.emptyList();
      } else {
        postedPrices_ = null;
        postedPricesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.kava.pricefeed.v1beta1.GenesisProto.internal_static_kava_pricefeed_v1beta1_GenesisState_descriptor;
    }

    @java.lang.Override
    public com.kava.pricefeed.v1beta1.GenesisState getDefaultInstanceForType() {
      return com.kava.pricefeed.v1beta1.GenesisState.getDefaultInstance();
    }

    @java.lang.Override
    public com.kava.pricefeed.v1beta1.GenesisState build() {
      com.kava.pricefeed.v1beta1.GenesisState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.kava.pricefeed.v1beta1.GenesisState buildPartial() {
      com.kava.pricefeed.v1beta1.GenesisState result = new com.kava.pricefeed.v1beta1.GenesisState(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.kava.pricefeed.v1beta1.GenesisState result) {
      if (postedPricesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          postedPrices_ = java.util.Collections.unmodifiableList(postedPrices_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.postedPrices_ = postedPrices_;
      } else {
        result.postedPrices_ = postedPricesBuilder_.build();
      }
    }

    private void buildPartial0(com.kava.pricefeed.v1beta1.GenesisState result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.params_ = paramsBuilder_ == null
            ? params_
            : paramsBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.kava.pricefeed.v1beta1.GenesisState) {
        return mergeFrom((com.kava.pricefeed.v1beta1.GenesisState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.kava.pricefeed.v1beta1.GenesisState other) {
      if (other == com.kava.pricefeed.v1beta1.GenesisState.getDefaultInstance()) return this;
      if (other.hasParams()) {
        mergeParams(other.getParams());
      }
      if (postedPricesBuilder_ == null) {
        if (!other.postedPrices_.isEmpty()) {
          if (postedPrices_.isEmpty()) {
            postedPrices_ = other.postedPrices_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensurePostedPricesIsMutable();
            postedPrices_.addAll(other.postedPrices_);
          }
          onChanged();
        }
      } else {
        if (!other.postedPrices_.isEmpty()) {
          if (postedPricesBuilder_.isEmpty()) {
            postedPricesBuilder_.dispose();
            postedPricesBuilder_ = null;
            postedPrices_ = other.postedPrices_;
            bitField0_ = (bitField0_ & ~0x00000002);
            postedPricesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPostedPricesFieldBuilder() : null;
          } else {
            postedPricesBuilder_.addAllMessages(other.postedPrices_);
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
              input.readMessage(
                  getParamsFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.kava.pricefeed.v1beta1.PostedPrice m =
                  input.readMessage(
                      com.kava.pricefeed.v1beta1.PostedPrice.parser(),
                      extensionRegistry);
              if (postedPricesBuilder_ == null) {
                ensurePostedPricesIsMutable();
                postedPrices_.add(m);
              } else {
                postedPricesBuilder_.addMessage(m);
              }
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

    private com.kava.pricefeed.v1beta1.Params params_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.kava.pricefeed.v1beta1.Params, com.kava.pricefeed.v1beta1.Params.Builder, com.kava.pricefeed.v1beta1.ParamsOrBuilder> paramsBuilder_;
    /**
     * <pre>
     * params defines all the paramaters of the module.
     * </pre>
     *
     * <code>.kava.pricefeed.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    public boolean hasParams() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * params defines all the paramaters of the module.
     * </pre>
     *
     * <code>.kava.pricefeed.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     * @return The params.
     */
    public com.kava.pricefeed.v1beta1.Params getParams() {
      if (paramsBuilder_ == null) {
        return params_ == null ? com.kava.pricefeed.v1beta1.Params.getDefaultInstance() : params_;
      } else {
        return paramsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * params defines all the paramaters of the module.
     * </pre>
     *
     * <code>.kava.pricefeed.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public Builder setParams(com.kava.pricefeed.v1beta1.Params value) {
      if (paramsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        params_ = value;
      } else {
        paramsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * params defines all the paramaters of the module.
     * </pre>
     *
     * <code>.kava.pricefeed.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public Builder setParams(
        com.kava.pricefeed.v1beta1.Params.Builder builderForValue) {
      if (paramsBuilder_ == null) {
        params_ = builderForValue.build();
      } else {
        paramsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * params defines all the paramaters of the module.
     * </pre>
     *
     * <code>.kava.pricefeed.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeParams(com.kava.pricefeed.v1beta1.Params value) {
      if (paramsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          params_ != null &&
          params_ != com.kava.pricefeed.v1beta1.Params.getDefaultInstance()) {
          getParamsBuilder().mergeFrom(value);
        } else {
          params_ = value;
        }
      } else {
        paramsBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * params defines all the paramaters of the module.
     * </pre>
     *
     * <code>.kava.pricefeed.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearParams() {
      bitField0_ = (bitField0_ & ~0x00000001);
      params_ = null;
      if (paramsBuilder_ != null) {
        paramsBuilder_.dispose();
        paramsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * params defines all the paramaters of the module.
     * </pre>
     *
     * <code>.kava.pricefeed.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public com.kava.pricefeed.v1beta1.Params.Builder getParamsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getParamsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * params defines all the paramaters of the module.
     * </pre>
     *
     * <code>.kava.pricefeed.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public com.kava.pricefeed.v1beta1.ParamsOrBuilder getParamsOrBuilder() {
      if (paramsBuilder_ != null) {
        return paramsBuilder_.getMessageOrBuilder();
      } else {
        return params_ == null ?
            com.kava.pricefeed.v1beta1.Params.getDefaultInstance() : params_;
      }
    }
    /**
     * <pre>
     * params defines all the paramaters of the module.
     * </pre>
     *
     * <code>.kava.pricefeed.v1beta1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.kava.pricefeed.v1beta1.Params, com.kava.pricefeed.v1beta1.Params.Builder, com.kava.pricefeed.v1beta1.ParamsOrBuilder> 
        getParamsFieldBuilder() {
      if (paramsBuilder_ == null) {
        paramsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.kava.pricefeed.v1beta1.Params, com.kava.pricefeed.v1beta1.Params.Builder, com.kava.pricefeed.v1beta1.ParamsOrBuilder>(
                getParams(),
                getParentForChildren(),
                isClean());
        params_ = null;
      }
      return paramsBuilder_;
    }

    private java.util.List<com.kava.pricefeed.v1beta1.PostedPrice> postedPrices_ =
      java.util.Collections.emptyList();
    private void ensurePostedPricesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        postedPrices_ = new java.util.ArrayList<com.kava.pricefeed.v1beta1.PostedPrice>(postedPrices_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.kava.pricefeed.v1beta1.PostedPrice, com.kava.pricefeed.v1beta1.PostedPrice.Builder, com.kava.pricefeed.v1beta1.PostedPriceOrBuilder> postedPricesBuilder_;

    /**
     * <code>repeated .kava.pricefeed.v1beta1.PostedPrice posted_prices = 2 [json_name = "postedPrices", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "PostedPrices"];</code>
     */
    public java.util.List<com.kava.pricefeed.v1beta1.PostedPrice> getPostedPricesList() {
      if (postedPricesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(postedPrices_);
      } else {
        return postedPricesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .kava.pricefeed.v1beta1.PostedPrice posted_prices = 2 [json_name = "postedPrices", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "PostedPrices"];</code>
     */
    public int getPostedPricesCount() {
      if (postedPricesBuilder_ == null) {
        return postedPrices_.size();
      } else {
        return postedPricesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .kava.pricefeed.v1beta1.PostedPrice posted_prices = 2 [json_name = "postedPrices", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "PostedPrices"];</code>
     */
    public com.kava.pricefeed.v1beta1.PostedPrice getPostedPrices(int index) {
      if (postedPricesBuilder_ == null) {
        return postedPrices_.get(index);
      } else {
        return postedPricesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .kava.pricefeed.v1beta1.PostedPrice posted_prices = 2 [json_name = "postedPrices", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "PostedPrices"];</code>
     */
    public Builder setPostedPrices(
        int index, com.kava.pricefeed.v1beta1.PostedPrice value) {
      if (postedPricesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePostedPricesIsMutable();
        postedPrices_.set(index, value);
        onChanged();
      } else {
        postedPricesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .kava.pricefeed.v1beta1.PostedPrice posted_prices = 2 [json_name = "postedPrices", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "PostedPrices"];</code>
     */
    public Builder setPostedPrices(
        int index, com.kava.pricefeed.v1beta1.PostedPrice.Builder builderForValue) {
      if (postedPricesBuilder_ == null) {
        ensurePostedPricesIsMutable();
        postedPrices_.set(index, builderForValue.build());
        onChanged();
      } else {
        postedPricesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .kava.pricefeed.v1beta1.PostedPrice posted_prices = 2 [json_name = "postedPrices", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "PostedPrices"];</code>
     */
    public Builder addPostedPrices(com.kava.pricefeed.v1beta1.PostedPrice value) {
      if (postedPricesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePostedPricesIsMutable();
        postedPrices_.add(value);
        onChanged();
      } else {
        postedPricesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .kava.pricefeed.v1beta1.PostedPrice posted_prices = 2 [json_name = "postedPrices", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "PostedPrices"];</code>
     */
    public Builder addPostedPrices(
        int index, com.kava.pricefeed.v1beta1.PostedPrice value) {
      if (postedPricesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePostedPricesIsMutable();
        postedPrices_.add(index, value);
        onChanged();
      } else {
        postedPricesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .kava.pricefeed.v1beta1.PostedPrice posted_prices = 2 [json_name = "postedPrices", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "PostedPrices"];</code>
     */
    public Builder addPostedPrices(
        com.kava.pricefeed.v1beta1.PostedPrice.Builder builderForValue) {
      if (postedPricesBuilder_ == null) {
        ensurePostedPricesIsMutable();
        postedPrices_.add(builderForValue.build());
        onChanged();
      } else {
        postedPricesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .kava.pricefeed.v1beta1.PostedPrice posted_prices = 2 [json_name = "postedPrices", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "PostedPrices"];</code>
     */
    public Builder addPostedPrices(
        int index, com.kava.pricefeed.v1beta1.PostedPrice.Builder builderForValue) {
      if (postedPricesBuilder_ == null) {
        ensurePostedPricesIsMutable();
        postedPrices_.add(index, builderForValue.build());
        onChanged();
      } else {
        postedPricesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .kava.pricefeed.v1beta1.PostedPrice posted_prices = 2 [json_name = "postedPrices", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "PostedPrices"];</code>
     */
    public Builder addAllPostedPrices(
        java.lang.Iterable<? extends com.kava.pricefeed.v1beta1.PostedPrice> values) {
      if (postedPricesBuilder_ == null) {
        ensurePostedPricesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, postedPrices_);
        onChanged();
      } else {
        postedPricesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .kava.pricefeed.v1beta1.PostedPrice posted_prices = 2 [json_name = "postedPrices", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "PostedPrices"];</code>
     */
    public Builder clearPostedPrices() {
      if (postedPricesBuilder_ == null) {
        postedPrices_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        postedPricesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .kava.pricefeed.v1beta1.PostedPrice posted_prices = 2 [json_name = "postedPrices", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "PostedPrices"];</code>
     */
    public Builder removePostedPrices(int index) {
      if (postedPricesBuilder_ == null) {
        ensurePostedPricesIsMutable();
        postedPrices_.remove(index);
        onChanged();
      } else {
        postedPricesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .kava.pricefeed.v1beta1.PostedPrice posted_prices = 2 [json_name = "postedPrices", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "PostedPrices"];</code>
     */
    public com.kava.pricefeed.v1beta1.PostedPrice.Builder getPostedPricesBuilder(
        int index) {
      return getPostedPricesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .kava.pricefeed.v1beta1.PostedPrice posted_prices = 2 [json_name = "postedPrices", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "PostedPrices"];</code>
     */
    public com.kava.pricefeed.v1beta1.PostedPriceOrBuilder getPostedPricesOrBuilder(
        int index) {
      if (postedPricesBuilder_ == null) {
        return postedPrices_.get(index);  } else {
        return postedPricesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .kava.pricefeed.v1beta1.PostedPrice posted_prices = 2 [json_name = "postedPrices", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "PostedPrices"];</code>
     */
    public java.util.List<? extends com.kava.pricefeed.v1beta1.PostedPriceOrBuilder> 
         getPostedPricesOrBuilderList() {
      if (postedPricesBuilder_ != null) {
        return postedPricesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(postedPrices_);
      }
    }
    /**
     * <code>repeated .kava.pricefeed.v1beta1.PostedPrice posted_prices = 2 [json_name = "postedPrices", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "PostedPrices"];</code>
     */
    public com.kava.pricefeed.v1beta1.PostedPrice.Builder addPostedPricesBuilder() {
      return getPostedPricesFieldBuilder().addBuilder(
          com.kava.pricefeed.v1beta1.PostedPrice.getDefaultInstance());
    }
    /**
     * <code>repeated .kava.pricefeed.v1beta1.PostedPrice posted_prices = 2 [json_name = "postedPrices", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "PostedPrices"];</code>
     */
    public com.kava.pricefeed.v1beta1.PostedPrice.Builder addPostedPricesBuilder(
        int index) {
      return getPostedPricesFieldBuilder().addBuilder(
          index, com.kava.pricefeed.v1beta1.PostedPrice.getDefaultInstance());
    }
    /**
     * <code>repeated .kava.pricefeed.v1beta1.PostedPrice posted_prices = 2 [json_name = "postedPrices", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "PostedPrices"];</code>
     */
    public java.util.List<com.kava.pricefeed.v1beta1.PostedPrice.Builder> 
         getPostedPricesBuilderList() {
      return getPostedPricesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.kava.pricefeed.v1beta1.PostedPrice, com.kava.pricefeed.v1beta1.PostedPrice.Builder, com.kava.pricefeed.v1beta1.PostedPriceOrBuilder> 
        getPostedPricesFieldBuilder() {
      if (postedPricesBuilder_ == null) {
        postedPricesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.kava.pricefeed.v1beta1.PostedPrice, com.kava.pricefeed.v1beta1.PostedPrice.Builder, com.kava.pricefeed.v1beta1.PostedPriceOrBuilder>(
                postedPrices_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        postedPrices_ = null;
      }
      return postedPricesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:kava.pricefeed.v1beta1.GenesisState)
  }

  // @@protoc_insertion_point(class_scope:kava.pricefeed.v1beta1.GenesisState)
  private static final com.kava.pricefeed.v1beta1.GenesisState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.kava.pricefeed.v1beta1.GenesisState();
  }

  public static com.kava.pricefeed.v1beta1.GenesisState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GenesisState>
      PARSER = new com.google.protobuf.AbstractParser<GenesisState>() {
    @java.lang.Override
    public GenesisState parsePartialFrom(
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

  public static com.google.protobuf.Parser<GenesisState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GenesisState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.kava.pricefeed.v1beta1.GenesisState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

