// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/name/v1/genesis.proto

package com.provenance.name.v1;

/**
 * <pre>
 * GenesisState defines the name module's genesis state.
 * </pre>
 *
 * Protobuf type {@code provenance.name.v1.GenesisState}
 */
public final class GenesisState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.name.v1.GenesisState)
    GenesisStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenesisState.newBuilder() to construct.
  private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenesisState() {
    bindings_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenesisState();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.provenance.name.v1.GenesisProto.internal_static_provenance_name_v1_GenesisState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.provenance.name.v1.GenesisProto.internal_static_provenance_name_v1_GenesisState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.provenance.name.v1.GenesisState.class, com.provenance.name.v1.GenesisState.Builder.class);
  }

  public static final int PARAMS_FIELD_NUMBER = 1;
  private com.provenance.name.v1.Params params_;
  /**
   * <pre>
   * params defines all the parameters of the module.
   * </pre>
   *
   * <code>.provenance.name.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return Whether the params field is set.
   */
  @java.lang.Override
  public boolean hasParams() {
    return params_ != null;
  }
  /**
   * <pre>
   * params defines all the parameters of the module.
   * </pre>
   *
   * <code>.provenance.name.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   * @return The params.
   */
  @java.lang.Override
  public com.provenance.name.v1.Params getParams() {
    return params_ == null ? com.provenance.name.v1.Params.getDefaultInstance() : params_;
  }
  /**
   * <pre>
   * params defines all the parameters of the module.
   * </pre>
   *
   * <code>.provenance.name.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.provenance.name.v1.ParamsOrBuilder getParamsOrBuilder() {
    return params_ == null ? com.provenance.name.v1.Params.getDefaultInstance() : params_;
  }

  public static final int BINDINGS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.provenance.name.v1.NameRecord> bindings_;
  /**
   * <pre>
   * bindings defines all the name records present at genesis
   * </pre>
   *
   * <code>repeated .provenance.name.v1.NameRecord bindings = 2 [json_name = "bindings", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.provenance.name.v1.NameRecord> getBindingsList() {
    return bindings_;
  }
  /**
   * <pre>
   * bindings defines all the name records present at genesis
   * </pre>
   *
   * <code>repeated .provenance.name.v1.NameRecord bindings = 2 [json_name = "bindings", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.provenance.name.v1.NameRecordOrBuilder> 
      getBindingsOrBuilderList() {
    return bindings_;
  }
  /**
   * <pre>
   * bindings defines all the name records present at genesis
   * </pre>
   *
   * <code>repeated .provenance.name.v1.NameRecord bindings = 2 [json_name = "bindings", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getBindingsCount() {
    return bindings_.size();
  }
  /**
   * <pre>
   * bindings defines all the name records present at genesis
   * </pre>
   *
   * <code>repeated .provenance.name.v1.NameRecord bindings = 2 [json_name = "bindings", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.provenance.name.v1.NameRecord getBindings(int index) {
    return bindings_.get(index);
  }
  /**
   * <pre>
   * bindings defines all the name records present at genesis
   * </pre>
   *
   * <code>repeated .provenance.name.v1.NameRecord bindings = 2 [json_name = "bindings", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.provenance.name.v1.NameRecordOrBuilder getBindingsOrBuilder(
      int index) {
    return bindings_.get(index);
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
    for (int i = 0; i < bindings_.size(); i++) {
      output.writeMessage(2, bindings_.get(i));
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
    for (int i = 0; i < bindings_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, bindings_.get(i));
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
    if (!(obj instanceof com.provenance.name.v1.GenesisState)) {
      return super.equals(obj);
    }
    com.provenance.name.v1.GenesisState other = (com.provenance.name.v1.GenesisState) obj;

    if (hasParams() != other.hasParams()) return false;
    if (hasParams()) {
      if (!getParams()
          .equals(other.getParams())) return false;
    }
    if (!getBindingsList()
        .equals(other.getBindingsList())) return false;
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
    if (getBindingsCount() > 0) {
      hash = (37 * hash) + BINDINGS_FIELD_NUMBER;
      hash = (53 * hash) + getBindingsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.provenance.name.v1.GenesisState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.name.v1.GenesisState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.name.v1.GenesisState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.name.v1.GenesisState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.name.v1.GenesisState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.name.v1.GenesisState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.name.v1.GenesisState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.name.v1.GenesisState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.provenance.name.v1.GenesisState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.provenance.name.v1.GenesisState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.provenance.name.v1.GenesisState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.name.v1.GenesisState parseFrom(
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
  public static Builder newBuilder(com.provenance.name.v1.GenesisState prototype) {
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
   * GenesisState defines the name module's genesis state.
   * </pre>
   *
   * Protobuf type {@code provenance.name.v1.GenesisState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.name.v1.GenesisState)
      com.provenance.name.v1.GenesisStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.provenance.name.v1.GenesisProto.internal_static_provenance_name_v1_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.provenance.name.v1.GenesisProto.internal_static_provenance_name_v1_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.provenance.name.v1.GenesisState.class, com.provenance.name.v1.GenesisState.Builder.class);
    }

    // Construct using com.provenance.name.v1.GenesisState.newBuilder()
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
      if (bindingsBuilder_ == null) {
        bindings_ = java.util.Collections.emptyList();
      } else {
        bindings_ = null;
        bindingsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.provenance.name.v1.GenesisProto.internal_static_provenance_name_v1_GenesisState_descriptor;
    }

    @java.lang.Override
    public com.provenance.name.v1.GenesisState getDefaultInstanceForType() {
      return com.provenance.name.v1.GenesisState.getDefaultInstance();
    }

    @java.lang.Override
    public com.provenance.name.v1.GenesisState build() {
      com.provenance.name.v1.GenesisState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.provenance.name.v1.GenesisState buildPartial() {
      com.provenance.name.v1.GenesisState result = new com.provenance.name.v1.GenesisState(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.provenance.name.v1.GenesisState result) {
      if (bindingsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          bindings_ = java.util.Collections.unmodifiableList(bindings_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.bindings_ = bindings_;
      } else {
        result.bindings_ = bindingsBuilder_.build();
      }
    }

    private void buildPartial0(com.provenance.name.v1.GenesisState result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.params_ = paramsBuilder_ == null
            ? params_
            : paramsBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.provenance.name.v1.GenesisState) {
        return mergeFrom((com.provenance.name.v1.GenesisState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.provenance.name.v1.GenesisState other) {
      if (other == com.provenance.name.v1.GenesisState.getDefaultInstance()) return this;
      if (other.hasParams()) {
        mergeParams(other.getParams());
      }
      if (bindingsBuilder_ == null) {
        if (!other.bindings_.isEmpty()) {
          if (bindings_.isEmpty()) {
            bindings_ = other.bindings_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureBindingsIsMutable();
            bindings_.addAll(other.bindings_);
          }
          onChanged();
        }
      } else {
        if (!other.bindings_.isEmpty()) {
          if (bindingsBuilder_.isEmpty()) {
            bindingsBuilder_.dispose();
            bindingsBuilder_ = null;
            bindings_ = other.bindings_;
            bitField0_ = (bitField0_ & ~0x00000002);
            bindingsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getBindingsFieldBuilder() : null;
          } else {
            bindingsBuilder_.addAllMessages(other.bindings_);
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
              com.provenance.name.v1.NameRecord m =
                  input.readMessage(
                      com.provenance.name.v1.NameRecord.parser(),
                      extensionRegistry);
              if (bindingsBuilder_ == null) {
                ensureBindingsIsMutable();
                bindings_.add(m);
              } else {
                bindingsBuilder_.addMessage(m);
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

    private com.provenance.name.v1.Params params_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.provenance.name.v1.Params, com.provenance.name.v1.Params.Builder, com.provenance.name.v1.ParamsOrBuilder> paramsBuilder_;
    /**
     * <pre>
     * params defines all the parameters of the module.
     * </pre>
     *
     * <code>.provenance.name.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     * @return Whether the params field is set.
     */
    public boolean hasParams() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * params defines all the parameters of the module.
     * </pre>
     *
     * <code>.provenance.name.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     * @return The params.
     */
    public com.provenance.name.v1.Params getParams() {
      if (paramsBuilder_ == null) {
        return params_ == null ? com.provenance.name.v1.Params.getDefaultInstance() : params_;
      } else {
        return paramsBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * params defines all the parameters of the module.
     * </pre>
     *
     * <code>.provenance.name.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public Builder setParams(com.provenance.name.v1.Params value) {
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
     * params defines all the parameters of the module.
     * </pre>
     *
     * <code>.provenance.name.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public Builder setParams(
        com.provenance.name.v1.Params.Builder builderForValue) {
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
     * params defines all the parameters of the module.
     * </pre>
     *
     * <code>.provenance.name.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeParams(com.provenance.name.v1.Params value) {
      if (paramsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          params_ != null &&
          params_ != com.provenance.name.v1.Params.getDefaultInstance()) {
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
     * params defines all the parameters of the module.
     * </pre>
     *
     * <code>.provenance.name.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
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
     * params defines all the parameters of the module.
     * </pre>
     *
     * <code>.provenance.name.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public com.provenance.name.v1.Params.Builder getParamsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getParamsFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * params defines all the parameters of the module.
     * </pre>
     *
     * <code>.provenance.name.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    public com.provenance.name.v1.ParamsOrBuilder getParamsOrBuilder() {
      if (paramsBuilder_ != null) {
        return paramsBuilder_.getMessageOrBuilder();
      } else {
        return params_ == null ?
            com.provenance.name.v1.Params.getDefaultInstance() : params_;
      }
    }
    /**
     * <pre>
     * params defines all the parameters of the module.
     * </pre>
     *
     * <code>.provenance.name.v1.Params params = 1 [json_name = "params", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.provenance.name.v1.Params, com.provenance.name.v1.Params.Builder, com.provenance.name.v1.ParamsOrBuilder> 
        getParamsFieldBuilder() {
      if (paramsBuilder_ == null) {
        paramsBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.provenance.name.v1.Params, com.provenance.name.v1.Params.Builder, com.provenance.name.v1.ParamsOrBuilder>(
                getParams(),
                getParentForChildren(),
                isClean());
        params_ = null;
      }
      return paramsBuilder_;
    }

    private java.util.List<com.provenance.name.v1.NameRecord> bindings_ =
      java.util.Collections.emptyList();
    private void ensureBindingsIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        bindings_ = new java.util.ArrayList<com.provenance.name.v1.NameRecord>(bindings_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.provenance.name.v1.NameRecord, com.provenance.name.v1.NameRecord.Builder, com.provenance.name.v1.NameRecordOrBuilder> bindingsBuilder_;

    /**
     * <pre>
     * bindings defines all the name records present at genesis
     * </pre>
     *
     * <code>repeated .provenance.name.v1.NameRecord bindings = 2 [json_name = "bindings", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.provenance.name.v1.NameRecord> getBindingsList() {
      if (bindingsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(bindings_);
      } else {
        return bindingsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * bindings defines all the name records present at genesis
     * </pre>
     *
     * <code>repeated .provenance.name.v1.NameRecord bindings = 2 [json_name = "bindings", (.gogoproto.nullable) = false];</code>
     */
    public int getBindingsCount() {
      if (bindingsBuilder_ == null) {
        return bindings_.size();
      } else {
        return bindingsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * bindings defines all the name records present at genesis
     * </pre>
     *
     * <code>repeated .provenance.name.v1.NameRecord bindings = 2 [json_name = "bindings", (.gogoproto.nullable) = false];</code>
     */
    public com.provenance.name.v1.NameRecord getBindings(int index) {
      if (bindingsBuilder_ == null) {
        return bindings_.get(index);
      } else {
        return bindingsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * bindings defines all the name records present at genesis
     * </pre>
     *
     * <code>repeated .provenance.name.v1.NameRecord bindings = 2 [json_name = "bindings", (.gogoproto.nullable) = false];</code>
     */
    public Builder setBindings(
        int index, com.provenance.name.v1.NameRecord value) {
      if (bindingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBindingsIsMutable();
        bindings_.set(index, value);
        onChanged();
      } else {
        bindingsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * bindings defines all the name records present at genesis
     * </pre>
     *
     * <code>repeated .provenance.name.v1.NameRecord bindings = 2 [json_name = "bindings", (.gogoproto.nullable) = false];</code>
     */
    public Builder setBindings(
        int index, com.provenance.name.v1.NameRecord.Builder builderForValue) {
      if (bindingsBuilder_ == null) {
        ensureBindingsIsMutable();
        bindings_.set(index, builderForValue.build());
        onChanged();
      } else {
        bindingsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * bindings defines all the name records present at genesis
     * </pre>
     *
     * <code>repeated .provenance.name.v1.NameRecord bindings = 2 [json_name = "bindings", (.gogoproto.nullable) = false];</code>
     */
    public Builder addBindings(com.provenance.name.v1.NameRecord value) {
      if (bindingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBindingsIsMutable();
        bindings_.add(value);
        onChanged();
      } else {
        bindingsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * bindings defines all the name records present at genesis
     * </pre>
     *
     * <code>repeated .provenance.name.v1.NameRecord bindings = 2 [json_name = "bindings", (.gogoproto.nullable) = false];</code>
     */
    public Builder addBindings(
        int index, com.provenance.name.v1.NameRecord value) {
      if (bindingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureBindingsIsMutable();
        bindings_.add(index, value);
        onChanged();
      } else {
        bindingsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * bindings defines all the name records present at genesis
     * </pre>
     *
     * <code>repeated .provenance.name.v1.NameRecord bindings = 2 [json_name = "bindings", (.gogoproto.nullable) = false];</code>
     */
    public Builder addBindings(
        com.provenance.name.v1.NameRecord.Builder builderForValue) {
      if (bindingsBuilder_ == null) {
        ensureBindingsIsMutable();
        bindings_.add(builderForValue.build());
        onChanged();
      } else {
        bindingsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * bindings defines all the name records present at genesis
     * </pre>
     *
     * <code>repeated .provenance.name.v1.NameRecord bindings = 2 [json_name = "bindings", (.gogoproto.nullable) = false];</code>
     */
    public Builder addBindings(
        int index, com.provenance.name.v1.NameRecord.Builder builderForValue) {
      if (bindingsBuilder_ == null) {
        ensureBindingsIsMutable();
        bindings_.add(index, builderForValue.build());
        onChanged();
      } else {
        bindingsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * bindings defines all the name records present at genesis
     * </pre>
     *
     * <code>repeated .provenance.name.v1.NameRecord bindings = 2 [json_name = "bindings", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllBindings(
        java.lang.Iterable<? extends com.provenance.name.v1.NameRecord> values) {
      if (bindingsBuilder_ == null) {
        ensureBindingsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, bindings_);
        onChanged();
      } else {
        bindingsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * bindings defines all the name records present at genesis
     * </pre>
     *
     * <code>repeated .provenance.name.v1.NameRecord bindings = 2 [json_name = "bindings", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearBindings() {
      if (bindingsBuilder_ == null) {
        bindings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        bindingsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * bindings defines all the name records present at genesis
     * </pre>
     *
     * <code>repeated .provenance.name.v1.NameRecord bindings = 2 [json_name = "bindings", (.gogoproto.nullable) = false];</code>
     */
    public Builder removeBindings(int index) {
      if (bindingsBuilder_ == null) {
        ensureBindingsIsMutable();
        bindings_.remove(index);
        onChanged();
      } else {
        bindingsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * bindings defines all the name records present at genesis
     * </pre>
     *
     * <code>repeated .provenance.name.v1.NameRecord bindings = 2 [json_name = "bindings", (.gogoproto.nullable) = false];</code>
     */
    public com.provenance.name.v1.NameRecord.Builder getBindingsBuilder(
        int index) {
      return getBindingsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * bindings defines all the name records present at genesis
     * </pre>
     *
     * <code>repeated .provenance.name.v1.NameRecord bindings = 2 [json_name = "bindings", (.gogoproto.nullable) = false];</code>
     */
    public com.provenance.name.v1.NameRecordOrBuilder getBindingsOrBuilder(
        int index) {
      if (bindingsBuilder_ == null) {
        return bindings_.get(index);  } else {
        return bindingsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * bindings defines all the name records present at genesis
     * </pre>
     *
     * <code>repeated .provenance.name.v1.NameRecord bindings = 2 [json_name = "bindings", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.provenance.name.v1.NameRecordOrBuilder> 
         getBindingsOrBuilderList() {
      if (bindingsBuilder_ != null) {
        return bindingsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(bindings_);
      }
    }
    /**
     * <pre>
     * bindings defines all the name records present at genesis
     * </pre>
     *
     * <code>repeated .provenance.name.v1.NameRecord bindings = 2 [json_name = "bindings", (.gogoproto.nullable) = false];</code>
     */
    public com.provenance.name.v1.NameRecord.Builder addBindingsBuilder() {
      return getBindingsFieldBuilder().addBuilder(
          com.provenance.name.v1.NameRecord.getDefaultInstance());
    }
    /**
     * <pre>
     * bindings defines all the name records present at genesis
     * </pre>
     *
     * <code>repeated .provenance.name.v1.NameRecord bindings = 2 [json_name = "bindings", (.gogoproto.nullable) = false];</code>
     */
    public com.provenance.name.v1.NameRecord.Builder addBindingsBuilder(
        int index) {
      return getBindingsFieldBuilder().addBuilder(
          index, com.provenance.name.v1.NameRecord.getDefaultInstance());
    }
    /**
     * <pre>
     * bindings defines all the name records present at genesis
     * </pre>
     *
     * <code>repeated .provenance.name.v1.NameRecord bindings = 2 [json_name = "bindings", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.provenance.name.v1.NameRecord.Builder> 
         getBindingsBuilderList() {
      return getBindingsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.provenance.name.v1.NameRecord, com.provenance.name.v1.NameRecord.Builder, com.provenance.name.v1.NameRecordOrBuilder> 
        getBindingsFieldBuilder() {
      if (bindingsBuilder_ == null) {
        bindingsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.provenance.name.v1.NameRecord, com.provenance.name.v1.NameRecord.Builder, com.provenance.name.v1.NameRecordOrBuilder>(
                bindings_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        bindings_ = null;
      }
      return bindingsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:provenance.name.v1.GenesisState)
  }

  // @@protoc_insertion_point(class_scope:provenance.name.v1.GenesisState)
  private static final com.provenance.name.v1.GenesisState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.provenance.name.v1.GenesisState();
  }

  public static com.provenance.name.v1.GenesisState getDefaultInstance() {
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
  public com.provenance.name.v1.GenesisState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

