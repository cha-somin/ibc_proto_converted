// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: juno/feeshare/v1/genesis.proto

package com.juno.feeshare.v1;

/**
 * <pre>
 * GenesisState defines the module's genesis state.
 * </pre>
 *
 * Protobuf type {@code juno.feeshare.v1.GenesisState}
 */
public final class GenesisState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:juno.feeshare.v1.GenesisState)
    GenesisStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenesisState.newBuilder() to construct.
  private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenesisState() {
    feeShare_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenesisState();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.juno.feeshare.v1.GenesisProto.internal_static_juno_feeshare_v1_GenesisState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.juno.feeshare.v1.GenesisProto.internal_static_juno_feeshare_v1_GenesisState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.juno.feeshare.v1.GenesisState.class, com.juno.feeshare.v1.GenesisState.Builder.class);
  }

  public static final int PARAMS_FIELD_NUMBER = 1;
  private com.juno.feeshare.v1.Params params_;
  /**
   * <pre>
   * params are the feeshare module parameters
   * </pre>
   *
   * <code>.juno.feeshare.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return Whether the params field is set.
   */
  @java.lang.Override
  public boolean hasParams() {
    return params_ != null;
  }
  /**
   * <pre>
   * params are the feeshare module parameters
   * </pre>
   *
   * <code>.juno.feeshare.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return The params.
   */
  @java.lang.Override
  public com.juno.feeshare.v1.Params getParams() {
    return params_ == null ? com.juno.feeshare.v1.Params.getDefaultInstance() : params_;
  }
  /**
   * <pre>
   * params are the feeshare module parameters
   * </pre>
   *
   * <code>.juno.feeshare.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.juno.feeshare.v1.ParamsOrBuilder getParamsOrBuilder() {
    return params_ == null ? com.juno.feeshare.v1.Params.getDefaultInstance() : params_;
  }

  public static final int FEE_SHARE_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.juno.feeshare.v1.FeeShare> feeShare_;
  /**
   * <pre>
   * FeeShare is a slice of active registered contracts for fee distribution
   * </pre>
   *
   * <code>repeated .juno.feeshare.v1.FeeShare fee_share = 2 [json_name = "feeShare", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.juno.feeshare.v1.FeeShare> getFeeShareList() {
    return feeShare_;
  }
  /**
   * <pre>
   * FeeShare is a slice of active registered contracts for fee distribution
   * </pre>
   *
   * <code>repeated .juno.feeshare.v1.FeeShare fee_share = 2 [json_name = "feeShare", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.juno.feeshare.v1.FeeShareOrBuilder> 
      getFeeShareOrBuilderList() {
    return feeShare_;
  }
  /**
   * <pre>
   * FeeShare is a slice of active registered contracts for fee distribution
   * </pre>
   *
   * <code>repeated .juno.feeshare.v1.FeeShare fee_share = 2 [json_name = "feeShare", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getFeeShareCount() {
    return feeShare_.size();
  }
  /**
   * <pre>
   * FeeShare is a slice of active registered contracts for fee distribution
   * </pre>
   *
   * <code>repeated .juno.feeshare.v1.FeeShare fee_share = 2 [json_name = "feeShare", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.juno.feeshare.v1.FeeShare getFeeShare(int index) {
    return feeShare_.get(index);
  }
  /**
   * <pre>
   * FeeShare is a slice of active registered contracts for fee distribution
   * </pre>
   *
   * <code>repeated .juno.feeshare.v1.FeeShare fee_share = 2 [json_name = "feeShare", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.juno.feeshare.v1.FeeShareOrBuilder getFeeShareOrBuilder(
      int index) {
    return feeShare_.get(index);
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
    for (int i = 0; i < feeShare_.size(); i++) {
      output.writeMessage(2, feeShare_.get(i));
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
    for (int i = 0; i < feeShare_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, feeShare_.get(i));
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
    if (!(obj instanceof com.juno.feeshare.v1.GenesisState)) {
      return super.equals(obj);
    }
    com.juno.feeshare.v1.GenesisState other = (com.juno.feeshare.v1.GenesisState) obj;

    if (hasParams() != other.hasParams()) return false;
    if (hasParams()) {
      if (!getParams()
          .equals(other.getParams())) return false;
    }
    if (!getFeeShareList()
        .equals(other.getFeeShareList())) return false;
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
    if (getFeeShareCount() > 0) {
      hash = (37 * hash) + FEE_SHARE_FIELD_NUMBER;
      hash = (53 * hash) + getFeeShareList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.juno.feeshare.v1.GenesisState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.juno.feeshare.v1.GenesisState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.juno.feeshare.v1.GenesisState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.juno.feeshare.v1.GenesisState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.juno.feeshare.v1.GenesisState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.juno.feeshare.v1.GenesisState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.juno.feeshare.v1.GenesisState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.juno.feeshare.v1.GenesisState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.juno.feeshare.v1.GenesisState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.juno.feeshare.v1.GenesisState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.juno.feeshare.v1.GenesisState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.juno.feeshare.v1.GenesisState parseFrom(
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
  public static Builder newBuilder(com.juno.feeshare.v1.GenesisState prototype) {
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
   * GenesisState defines the module's genesis state.
   * </pre>
   *
   * Protobuf type {@code juno.feeshare.v1.GenesisState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:juno.feeshare.v1.GenesisState)
      com.juno.feeshare.v1.GenesisStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.juno.feeshare.v1.GenesisProto.internal_static_juno_feeshare_v1_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.juno.feeshare.v1.GenesisProto.internal_static_juno_feeshare_v1_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.juno.feeshare.v1.GenesisState.class, com.juno.feeshare.v1.GenesisState.Builder.class);
    }

    // Construct using com.juno.feeshare.v1.GenesisState.newBuilder()
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
      if (feeShareBuilder_ == null) {
        feeShare_ = java.util.Collections.emptyList();
      } else {
        feeShare_ = null;
        feeShareBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.juno.feeshare.v1.GenesisProto.internal_static_juno_feeshare_v1_GenesisState_descriptor;
    }

    @java.lang.Override
    public com.juno.feeshare.v1.GenesisState getDefaultInstanceForType() {
      return com.juno.feeshare.v1.GenesisState.getDefaultInstance();
    }

    @java.lang.Override
    public com.juno.feeshare.v1.GenesisState build() {
      com.juno.feeshare.v1.GenesisState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.juno.feeshare.v1.GenesisState buildPartial() {
      com.juno.feeshare.v1.GenesisState result = new com.juno.feeshare.v1.GenesisState(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.juno.feeshare.v1.GenesisState result) {
      if (feeShareBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          feeShare_ = java.util.Collections.unmodifiableList(feeShare_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.feeShare_ = feeShare_;
      } else {
        result.feeShare_ = feeShareBuilder_.build();
      }
    }

    private void buildPartial0(com.juno.feeshare.v1.GenesisState result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.params_ = paramsBuilder_ == null
            ? params_
            : paramsBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.juno.feeshare.v1.GenesisState) {
        return mergeFrom((com.juno.feeshare.v1.GenesisState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.juno.feeshare.v1.GenesisState other) {
      if (other == com.juno.feeshare.v1.GenesisState.getDefaultInstance()) return this;
      if (other.hasParams()) {
        mergeParams(other.getParams());
      }
      if (feeShareBuilder_ == null) {
        if (!other.feeShare_.isEmpty()) {
          if (feeShare_.isEmpty()) {
            feeShare_ = other.feeShare_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureFeeShareIsMutable();
            feeShare_.addAll(other.feeShare_);
          }
          onChanged();
        }
      } else {
        if (!other.feeShare_.isEmpty()) {
          if (feeShareBuilder_.isEmpty()) {
            feeShareBuilder_.dispose();
            feeShareBuilder_ = null;
            feeShare_ = other.feeShare_;
            bitField0_ = (bitField0_ & ~0x00000002);
            feeShareBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getFeeShareFieldBuilder() : null;
          } else {
            feeShareBuilder_.addAllMessages(other.feeShare_);
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
              com.juno.feeshare.v1.FeeShare m =
                  input.readMessage(
                      com.juno.feeshare.v1.FeeShare.parser(),
                      extensionRegistry);
              if (feeShareBuilder_ == null) {
                ensureFeeShareIsMutable();
                feeShare_.add(m);
              } else {
                feeShareBuilder_.addMessage(m);
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

    private com.juno.feeshare.v1.Params params_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.juno.feeshare.v1.Params, com.juno.feeshare.v1.Params.Builder, com.juno.feeshare.v1.ParamsOrBuilder> paramsBuilder_;
    /**
     * <pre>
     * params are the feeshare module parameters
     * </pre>
     *
     * <code>.juno.feeshare.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    public boolean hasParams() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * params are the feeshare module parameters
     * </pre>
     *
     * <code>.juno.feeshare.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     * @return The params.
     */
    public com.juno.feeshare.v1.Params getParams() {
      if (paramsBuilder_ == null) {
        return params_ == null ? com.juno.feeshare.v1.Params.getDefaultInstance() : params_;
      } else {
        return paramsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * params are the feeshare module parameters
     * </pre>
     *
     * <code>.juno.feeshare.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public Builder setParams(com.juno.feeshare.v1.Params value) {
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
     * params are the feeshare module parameters
     * </pre>
     *
     * <code>.juno.feeshare.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public Builder setParams(
        com.juno.feeshare.v1.Params.Builder builderForValue) {
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
     * params are the feeshare module parameters
     * </pre>
     *
     * <code>.juno.feeshare.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeParams(com.juno.feeshare.v1.Params value) {
      if (paramsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          params_ != null &&
          params_ != com.juno.feeshare.v1.Params.getDefaultInstance()) {
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
     * params are the feeshare module parameters
     * </pre>
     *
     * <code>.juno.feeshare.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
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
     * params are the feeshare module parameters
     * </pre>
     *
     * <code>.juno.feeshare.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public com.juno.feeshare.v1.Params.Builder getParamsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getParamsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * params are the feeshare module parameters
     * </pre>
     *
     * <code>.juno.feeshare.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public com.juno.feeshare.v1.ParamsOrBuilder getParamsOrBuilder() {
      if (paramsBuilder_ != null) {
        return paramsBuilder_.getMessageOrBuilder();
      } else {
        return params_ == null ?
            com.juno.feeshare.v1.Params.getDefaultInstance() : params_;
      }
    }
    /**
     * <pre>
     * params are the feeshare module parameters
     * </pre>
     *
     * <code>.juno.feeshare.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.juno.feeshare.v1.Params, com.juno.feeshare.v1.Params.Builder, com.juno.feeshare.v1.ParamsOrBuilder> 
        getParamsFieldBuilder() {
      if (paramsBuilder_ == null) {
        paramsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.juno.feeshare.v1.Params, com.juno.feeshare.v1.Params.Builder, com.juno.feeshare.v1.ParamsOrBuilder>(
                getParams(),
                getParentForChildren(),
                isClean());
        params_ = null;
      }
      return paramsBuilder_;
    }

    private java.util.List<com.juno.feeshare.v1.FeeShare> feeShare_ =
      java.util.Collections.emptyList();
    private void ensureFeeShareIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        feeShare_ = new java.util.ArrayList<com.juno.feeshare.v1.FeeShare>(feeShare_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.juno.feeshare.v1.FeeShare, com.juno.feeshare.v1.FeeShare.Builder, com.juno.feeshare.v1.FeeShareOrBuilder> feeShareBuilder_;

    /**
     * <pre>
     * FeeShare is a slice of active registered contracts for fee distribution
     * </pre>
     *
     * <code>repeated .juno.feeshare.v1.FeeShare fee_share = 2 [json_name = "feeShare", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.juno.feeshare.v1.FeeShare> getFeeShareList() {
      if (feeShareBuilder_ == null) {
        return java.util.Collections.unmodifiableList(feeShare_);
      } else {
        return feeShareBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * FeeShare is a slice of active registered contracts for fee distribution
     * </pre>
     *
     * <code>repeated .juno.feeshare.v1.FeeShare fee_share = 2 [json_name = "feeShare", (.gogoproto.nullable) = false];</code>
     */
    public int getFeeShareCount() {
      if (feeShareBuilder_ == null) {
        return feeShare_.size();
      } else {
        return feeShareBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * FeeShare is a slice of active registered contracts for fee distribution
     * </pre>
     *
     * <code>repeated .juno.feeshare.v1.FeeShare fee_share = 2 [json_name = "feeShare", (.gogoproto.nullable) = false];</code>
     */
    public com.juno.feeshare.v1.FeeShare getFeeShare(int index) {
      if (feeShareBuilder_ == null) {
        return feeShare_.get(index);
      } else {
        return feeShareBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * FeeShare is a slice of active registered contracts for fee distribution
     * </pre>
     *
     * <code>repeated .juno.feeshare.v1.FeeShare fee_share = 2 [json_name = "feeShare", (.gogoproto.nullable) = false];</code>
     */
    public Builder setFeeShare(
        int index, com.juno.feeshare.v1.FeeShare value) {
      if (feeShareBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeeShareIsMutable();
        feeShare_.set(index, value);
        onChanged();
      } else {
        feeShareBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * FeeShare is a slice of active registered contracts for fee distribution
     * </pre>
     *
     * <code>repeated .juno.feeshare.v1.FeeShare fee_share = 2 [json_name = "feeShare", (.gogoproto.nullable) = false];</code>
     */
    public Builder setFeeShare(
        int index, com.juno.feeshare.v1.FeeShare.Builder builderForValue) {
      if (feeShareBuilder_ == null) {
        ensureFeeShareIsMutable();
        feeShare_.set(index, builderForValue.build());
        onChanged();
      } else {
        feeShareBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * FeeShare is a slice of active registered contracts for fee distribution
     * </pre>
     *
     * <code>repeated .juno.feeshare.v1.FeeShare fee_share = 2 [json_name = "feeShare", (.gogoproto.nullable) = false];</code>
     */
    public Builder addFeeShare(com.juno.feeshare.v1.FeeShare value) {
      if (feeShareBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeeShareIsMutable();
        feeShare_.add(value);
        onChanged();
      } else {
        feeShareBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * FeeShare is a slice of active registered contracts for fee distribution
     * </pre>
     *
     * <code>repeated .juno.feeshare.v1.FeeShare fee_share = 2 [json_name = "feeShare", (.gogoproto.nullable) = false];</code>
     */
    public Builder addFeeShare(
        int index, com.juno.feeshare.v1.FeeShare value) {
      if (feeShareBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureFeeShareIsMutable();
        feeShare_.add(index, value);
        onChanged();
      } else {
        feeShareBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * FeeShare is a slice of active registered contracts for fee distribution
     * </pre>
     *
     * <code>repeated .juno.feeshare.v1.FeeShare fee_share = 2 [json_name = "feeShare", (.gogoproto.nullable) = false];</code>
     */
    public Builder addFeeShare(
        com.juno.feeshare.v1.FeeShare.Builder builderForValue) {
      if (feeShareBuilder_ == null) {
        ensureFeeShareIsMutable();
        feeShare_.add(builderForValue.build());
        onChanged();
      } else {
        feeShareBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * FeeShare is a slice of active registered contracts for fee distribution
     * </pre>
     *
     * <code>repeated .juno.feeshare.v1.FeeShare fee_share = 2 [json_name = "feeShare", (.gogoproto.nullable) = false];</code>
     */
    public Builder addFeeShare(
        int index, com.juno.feeshare.v1.FeeShare.Builder builderForValue) {
      if (feeShareBuilder_ == null) {
        ensureFeeShareIsMutable();
        feeShare_.add(index, builderForValue.build());
        onChanged();
      } else {
        feeShareBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * FeeShare is a slice of active registered contracts for fee distribution
     * </pre>
     *
     * <code>repeated .juno.feeshare.v1.FeeShare fee_share = 2 [json_name = "feeShare", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllFeeShare(
        java.lang.Iterable<? extends com.juno.feeshare.v1.FeeShare> values) {
      if (feeShareBuilder_ == null) {
        ensureFeeShareIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, feeShare_);
        onChanged();
      } else {
        feeShareBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * FeeShare is a slice of active registered contracts for fee distribution
     * </pre>
     *
     * <code>repeated .juno.feeshare.v1.FeeShare fee_share = 2 [json_name = "feeShare", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearFeeShare() {
      if (feeShareBuilder_ == null) {
        feeShare_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        feeShareBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * FeeShare is a slice of active registered contracts for fee distribution
     * </pre>
     *
     * <code>repeated .juno.feeshare.v1.FeeShare fee_share = 2 [json_name = "feeShare", (.gogoproto.nullable) = false];</code>
     */
    public Builder removeFeeShare(int index) {
      if (feeShareBuilder_ == null) {
        ensureFeeShareIsMutable();
        feeShare_.remove(index);
        onChanged();
      } else {
        feeShareBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * FeeShare is a slice of active registered contracts for fee distribution
     * </pre>
     *
     * <code>repeated .juno.feeshare.v1.FeeShare fee_share = 2 [json_name = "feeShare", (.gogoproto.nullable) = false];</code>
     */
    public com.juno.feeshare.v1.FeeShare.Builder getFeeShareBuilder(
        int index) {
      return getFeeShareFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * FeeShare is a slice of active registered contracts for fee distribution
     * </pre>
     *
     * <code>repeated .juno.feeshare.v1.FeeShare fee_share = 2 [json_name = "feeShare", (.gogoproto.nullable) = false];</code>
     */
    public com.juno.feeshare.v1.FeeShareOrBuilder getFeeShareOrBuilder(
        int index) {
      if (feeShareBuilder_ == null) {
        return feeShare_.get(index);  } else {
        return feeShareBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * FeeShare is a slice of active registered contracts for fee distribution
     * </pre>
     *
     * <code>repeated .juno.feeshare.v1.FeeShare fee_share = 2 [json_name = "feeShare", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.juno.feeshare.v1.FeeShareOrBuilder> 
         getFeeShareOrBuilderList() {
      if (feeShareBuilder_ != null) {
        return feeShareBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(feeShare_);
      }
    }
    /**
     * <pre>
     * FeeShare is a slice of active registered contracts for fee distribution
     * </pre>
     *
     * <code>repeated .juno.feeshare.v1.FeeShare fee_share = 2 [json_name = "feeShare", (.gogoproto.nullable) = false];</code>
     */
    public com.juno.feeshare.v1.FeeShare.Builder addFeeShareBuilder() {
      return getFeeShareFieldBuilder().addBuilder(
          com.juno.feeshare.v1.FeeShare.getDefaultInstance());
    }
    /**
     * <pre>
     * FeeShare is a slice of active registered contracts for fee distribution
     * </pre>
     *
     * <code>repeated .juno.feeshare.v1.FeeShare fee_share = 2 [json_name = "feeShare", (.gogoproto.nullable) = false];</code>
     */
    public com.juno.feeshare.v1.FeeShare.Builder addFeeShareBuilder(
        int index) {
      return getFeeShareFieldBuilder().addBuilder(
          index, com.juno.feeshare.v1.FeeShare.getDefaultInstance());
    }
    /**
     * <pre>
     * FeeShare is a slice of active registered contracts for fee distribution
     * </pre>
     *
     * <code>repeated .juno.feeshare.v1.FeeShare fee_share = 2 [json_name = "feeShare", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.juno.feeshare.v1.FeeShare.Builder> 
         getFeeShareBuilderList() {
      return getFeeShareFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.juno.feeshare.v1.FeeShare, com.juno.feeshare.v1.FeeShare.Builder, com.juno.feeshare.v1.FeeShareOrBuilder> 
        getFeeShareFieldBuilder() {
      if (feeShareBuilder_ == null) {
        feeShareBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.juno.feeshare.v1.FeeShare, com.juno.feeshare.v1.FeeShare.Builder, com.juno.feeshare.v1.FeeShareOrBuilder>(
                feeShare_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        feeShare_ = null;
      }
      return feeShareBuilder_;
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


    // @@protoc_insertion_point(builder_scope:juno.feeshare.v1.GenesisState)
  }

  // @@protoc_insertion_point(class_scope:juno.feeshare.v1.GenesisState)
  private static final com.juno.feeshare.v1.GenesisState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.juno.feeshare.v1.GenesisState();
  }

  public static com.juno.feeshare.v1.GenesisState getDefaultInstance() {
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
  public com.juno.feeshare.v1.GenesisState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

