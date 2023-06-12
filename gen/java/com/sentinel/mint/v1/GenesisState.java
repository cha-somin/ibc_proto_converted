// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: sentinel/mint/v1/genesis.proto

package com.sentinel.mint.v1;

/**
 * Protobuf type {@code sentinel.mint.v1.GenesisState}
 */
public final class GenesisState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:sentinel.mint.v1.GenesisState)
    GenesisStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenesisState.newBuilder() to construct.
  private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenesisState() {
    inflations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenesisState();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.sentinel.mint.v1.GenesisProto.internal_static_sentinel_mint_v1_GenesisState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.sentinel.mint.v1.GenesisProto.internal_static_sentinel_mint_v1_GenesisState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.sentinel.mint.v1.GenesisState.class, com.sentinel.mint.v1.GenesisState.Builder.class);
  }

  public static final int INFLATIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.sentinel.mint.v1.Inflation> inflations_;
  /**
   * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
   */
  @java.lang.Override
  public java.util.List<com.sentinel.mint.v1.Inflation> getInflationsList() {
    return inflations_;
  }
  /**
   * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.sentinel.mint.v1.InflationOrBuilder> 
      getInflationsOrBuilderList() {
    return inflations_;
  }
  /**
   * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
   */
  @java.lang.Override
  public int getInflationsCount() {
    return inflations_.size();
  }
  /**
   * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
   */
  @java.lang.Override
  public com.sentinel.mint.v1.Inflation getInflations(int index) {
    return inflations_.get(index);
  }
  /**
   * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
   */
  @java.lang.Override
  public com.sentinel.mint.v1.InflationOrBuilder getInflationsOrBuilder(
      int index) {
    return inflations_.get(index);
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
    for (int i = 0; i < inflations_.size(); i++) {
      output.writeMessage(1, inflations_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < inflations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, inflations_.get(i));
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
    if (!(obj instanceof com.sentinel.mint.v1.GenesisState)) {
      return super.equals(obj);
    }
    com.sentinel.mint.v1.GenesisState other = (com.sentinel.mint.v1.GenesisState) obj;

    if (!getInflationsList()
        .equals(other.getInflationsList())) return false;
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
    if (getInflationsCount() > 0) {
      hash = (37 * hash) + INFLATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getInflationsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.sentinel.mint.v1.GenesisState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sentinel.mint.v1.GenesisState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sentinel.mint.v1.GenesisState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sentinel.mint.v1.GenesisState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sentinel.mint.v1.GenesisState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.sentinel.mint.v1.GenesisState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.sentinel.mint.v1.GenesisState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sentinel.mint.v1.GenesisState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.sentinel.mint.v1.GenesisState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.sentinel.mint.v1.GenesisState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.sentinel.mint.v1.GenesisState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.sentinel.mint.v1.GenesisState parseFrom(
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
  public static Builder newBuilder(com.sentinel.mint.v1.GenesisState prototype) {
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
   * Protobuf type {@code sentinel.mint.v1.GenesisState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:sentinel.mint.v1.GenesisState)
      com.sentinel.mint.v1.GenesisStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.sentinel.mint.v1.GenesisProto.internal_static_sentinel_mint_v1_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.sentinel.mint.v1.GenesisProto.internal_static_sentinel_mint_v1_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.sentinel.mint.v1.GenesisState.class, com.sentinel.mint.v1.GenesisState.Builder.class);
    }

    // Construct using com.sentinel.mint.v1.GenesisState.newBuilder()
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
      if (inflationsBuilder_ == null) {
        inflations_ = java.util.Collections.emptyList();
      } else {
        inflations_ = null;
        inflationsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.sentinel.mint.v1.GenesisProto.internal_static_sentinel_mint_v1_GenesisState_descriptor;
    }

    @java.lang.Override
    public com.sentinel.mint.v1.GenesisState getDefaultInstanceForType() {
      return com.sentinel.mint.v1.GenesisState.getDefaultInstance();
    }

    @java.lang.Override
    public com.sentinel.mint.v1.GenesisState build() {
      com.sentinel.mint.v1.GenesisState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.sentinel.mint.v1.GenesisState buildPartial() {
      com.sentinel.mint.v1.GenesisState result = new com.sentinel.mint.v1.GenesisState(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.sentinel.mint.v1.GenesisState result) {
      if (inflationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          inflations_ = java.util.Collections.unmodifiableList(inflations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.inflations_ = inflations_;
      } else {
        result.inflations_ = inflationsBuilder_.build();
      }
    }

    private void buildPartial0(com.sentinel.mint.v1.GenesisState result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.sentinel.mint.v1.GenesisState) {
        return mergeFrom((com.sentinel.mint.v1.GenesisState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.sentinel.mint.v1.GenesisState other) {
      if (other == com.sentinel.mint.v1.GenesisState.getDefaultInstance()) return this;
      if (inflationsBuilder_ == null) {
        if (!other.inflations_.isEmpty()) {
          if (inflations_.isEmpty()) {
            inflations_ = other.inflations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInflationsIsMutable();
            inflations_.addAll(other.inflations_);
          }
          onChanged();
        }
      } else {
        if (!other.inflations_.isEmpty()) {
          if (inflationsBuilder_.isEmpty()) {
            inflationsBuilder_.dispose();
            inflationsBuilder_ = null;
            inflations_ = other.inflations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            inflationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getInflationsFieldBuilder() : null;
          } else {
            inflationsBuilder_.addAllMessages(other.inflations_);
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
              com.sentinel.mint.v1.Inflation m =
                  input.readMessage(
                      com.sentinel.mint.v1.Inflation.parser(),
                      extensionRegistry);
              if (inflationsBuilder_ == null) {
                ensureInflationsIsMutable();
                inflations_.add(m);
              } else {
                inflationsBuilder_.addMessage(m);
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

    private java.util.List<com.sentinel.mint.v1.Inflation> inflations_ =
      java.util.Collections.emptyList();
    private void ensureInflationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        inflations_ = new java.util.ArrayList<com.sentinel.mint.v1.Inflation>(inflations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sentinel.mint.v1.Inflation, com.sentinel.mint.v1.Inflation.Builder, com.sentinel.mint.v1.InflationOrBuilder> inflationsBuilder_;

    /**
     * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
     */
    public java.util.List<com.sentinel.mint.v1.Inflation> getInflationsList() {
      if (inflationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(inflations_);
      } else {
        return inflationsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
     */
    public int getInflationsCount() {
      if (inflationsBuilder_ == null) {
        return inflations_.size();
      } else {
        return inflationsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
     */
    public com.sentinel.mint.v1.Inflation getInflations(int index) {
      if (inflationsBuilder_ == null) {
        return inflations_.get(index);
      } else {
        return inflationsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
     */
    public Builder setInflations(
        int index, com.sentinel.mint.v1.Inflation value) {
      if (inflationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInflationsIsMutable();
        inflations_.set(index, value);
        onChanged();
      } else {
        inflationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
     */
    public Builder setInflations(
        int index, com.sentinel.mint.v1.Inflation.Builder builderForValue) {
      if (inflationsBuilder_ == null) {
        ensureInflationsIsMutable();
        inflations_.set(index, builderForValue.build());
        onChanged();
      } else {
        inflationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
     */
    public Builder addInflations(com.sentinel.mint.v1.Inflation value) {
      if (inflationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInflationsIsMutable();
        inflations_.add(value);
        onChanged();
      } else {
        inflationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
     */
    public Builder addInflations(
        int index, com.sentinel.mint.v1.Inflation value) {
      if (inflationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInflationsIsMutable();
        inflations_.add(index, value);
        onChanged();
      } else {
        inflationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
     */
    public Builder addInflations(
        com.sentinel.mint.v1.Inflation.Builder builderForValue) {
      if (inflationsBuilder_ == null) {
        ensureInflationsIsMutable();
        inflations_.add(builderForValue.build());
        onChanged();
      } else {
        inflationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
     */
    public Builder addInflations(
        int index, com.sentinel.mint.v1.Inflation.Builder builderForValue) {
      if (inflationsBuilder_ == null) {
        ensureInflationsIsMutable();
        inflations_.add(index, builderForValue.build());
        onChanged();
      } else {
        inflationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
     */
    public Builder addAllInflations(
        java.lang.Iterable<? extends com.sentinel.mint.v1.Inflation> values) {
      if (inflationsBuilder_ == null) {
        ensureInflationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, inflations_);
        onChanged();
      } else {
        inflationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
     */
    public Builder clearInflations() {
      if (inflationsBuilder_ == null) {
        inflations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        inflationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
     */
    public Builder removeInflations(int index) {
      if (inflationsBuilder_ == null) {
        ensureInflationsIsMutable();
        inflations_.remove(index);
        onChanged();
      } else {
        inflationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
     */
    public com.sentinel.mint.v1.Inflation.Builder getInflationsBuilder(
        int index) {
      return getInflationsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
     */
    public com.sentinel.mint.v1.InflationOrBuilder getInflationsOrBuilder(
        int index) {
      if (inflationsBuilder_ == null) {
        return inflations_.get(index);  } else {
        return inflationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
     */
    public java.util.List<? extends com.sentinel.mint.v1.InflationOrBuilder> 
         getInflationsOrBuilderList() {
      if (inflationsBuilder_ != null) {
        return inflationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(inflations_);
      }
    }
    /**
     * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
     */
    public com.sentinel.mint.v1.Inflation.Builder addInflationsBuilder() {
      return getInflationsFieldBuilder().addBuilder(
          com.sentinel.mint.v1.Inflation.getDefaultInstance());
    }
    /**
     * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
     */
    public com.sentinel.mint.v1.Inflation.Builder addInflationsBuilder(
        int index) {
      return getInflationsFieldBuilder().addBuilder(
          index, com.sentinel.mint.v1.Inflation.getDefaultInstance());
    }
    /**
     * <code>repeated .sentinel.mint.v1.Inflation inflations = 1 [json_name = "inflations", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"inflations&#92;""];</code>
     */
    public java.util.List<com.sentinel.mint.v1.Inflation.Builder> 
         getInflationsBuilderList() {
      return getInflationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.sentinel.mint.v1.Inflation, com.sentinel.mint.v1.Inflation.Builder, com.sentinel.mint.v1.InflationOrBuilder> 
        getInflationsFieldBuilder() {
      if (inflationsBuilder_ == null) {
        inflationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.sentinel.mint.v1.Inflation, com.sentinel.mint.v1.Inflation.Builder, com.sentinel.mint.v1.InflationOrBuilder>(
                inflations_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        inflations_ = null;
      }
      return inflationsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:sentinel.mint.v1.GenesisState)
  }

  // @@protoc_insertion_point(class_scope:sentinel.mint.v1.GenesisState)
  private static final com.sentinel.mint.v1.GenesisState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.sentinel.mint.v1.GenesisState();
  }

  public static com.sentinel.mint.v1.GenesisState getDefaultInstance() {
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
  public com.sentinel.mint.v1.GenesisState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

