// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: quasar/epochs/genesis.proto

package com.quasarlabs.quasarnode.epochs;

/**
 * <pre>
 * GenesisState defines the epochs module's genesis state.
 * </pre>
 *
 * Protobuf type {@code quasarlabs.quasarnode.epochs.GenesisState}
 */
public final class GenesisState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:quasarlabs.quasarnode.epochs.GenesisState)
    GenesisStateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GenesisState.newBuilder() to construct.
  private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GenesisState() {
    epochs_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GenesisState();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.quasarlabs.quasarnode.epochs.GenesisProto.internal_static_quasarlabs_quasarnode_epochs_GenesisState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.quasarlabs.quasarnode.epochs.GenesisProto.internal_static_quasarlabs_quasarnode_epochs_GenesisState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.quasarlabs.quasarnode.epochs.GenesisState.class, com.quasarlabs.quasarnode.epochs.GenesisState.Builder.class);
  }

  public static final int EPOCHS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.quasarlabs.quasarnode.epochs.EpochInfo> epochs_;
  /**
   * <code>repeated .quasarlabs.quasarnode.epochs.EpochInfo epochs = 1 [json_name = "epochs", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.quasarlabs.quasarnode.epochs.EpochInfo> getEpochsList() {
    return epochs_;
  }
  /**
   * <code>repeated .quasarlabs.quasarnode.epochs.EpochInfo epochs = 1 [json_name = "epochs", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.quasarlabs.quasarnode.epochs.EpochInfoOrBuilder> 
      getEpochsOrBuilderList() {
    return epochs_;
  }
  /**
   * <code>repeated .quasarlabs.quasarnode.epochs.EpochInfo epochs = 1 [json_name = "epochs", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getEpochsCount() {
    return epochs_.size();
  }
  /**
   * <code>repeated .quasarlabs.quasarnode.epochs.EpochInfo epochs = 1 [json_name = "epochs", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.quasarlabs.quasarnode.epochs.EpochInfo getEpochs(int index) {
    return epochs_.get(index);
  }
  /**
   * <code>repeated .quasarlabs.quasarnode.epochs.EpochInfo epochs = 1 [json_name = "epochs", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.quasarlabs.quasarnode.epochs.EpochInfoOrBuilder getEpochsOrBuilder(
      int index) {
    return epochs_.get(index);
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
    for (int i = 0; i < epochs_.size(); i++) {
      output.writeMessage(1, epochs_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < epochs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, epochs_.get(i));
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
    if (!(obj instanceof com.quasarlabs.quasarnode.epochs.GenesisState)) {
      return super.equals(obj);
    }
    com.quasarlabs.quasarnode.epochs.GenesisState other = (com.quasarlabs.quasarnode.epochs.GenesisState) obj;

    if (!getEpochsList()
        .equals(other.getEpochsList())) return false;
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
    if (getEpochsCount() > 0) {
      hash = (37 * hash) + EPOCHS_FIELD_NUMBER;
      hash = (53 * hash) + getEpochsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.quasarlabs.quasarnode.epochs.GenesisState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.quasarlabs.quasarnode.epochs.GenesisState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.quasarlabs.quasarnode.epochs.GenesisState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.quasarlabs.quasarnode.epochs.GenesisState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.quasarlabs.quasarnode.epochs.GenesisState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.quasarlabs.quasarnode.epochs.GenesisState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.quasarlabs.quasarnode.epochs.GenesisState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.quasarlabs.quasarnode.epochs.GenesisState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.quasarlabs.quasarnode.epochs.GenesisState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.quasarlabs.quasarnode.epochs.GenesisState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.quasarlabs.quasarnode.epochs.GenesisState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.quasarlabs.quasarnode.epochs.GenesisState parseFrom(
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
  public static Builder newBuilder(com.quasarlabs.quasarnode.epochs.GenesisState prototype) {
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
   * GenesisState defines the epochs module's genesis state.
   * </pre>
   *
   * Protobuf type {@code quasarlabs.quasarnode.epochs.GenesisState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:quasarlabs.quasarnode.epochs.GenesisState)
      com.quasarlabs.quasarnode.epochs.GenesisStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.quasarlabs.quasarnode.epochs.GenesisProto.internal_static_quasarlabs_quasarnode_epochs_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.quasarlabs.quasarnode.epochs.GenesisProto.internal_static_quasarlabs_quasarnode_epochs_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.quasarlabs.quasarnode.epochs.GenesisState.class, com.quasarlabs.quasarnode.epochs.GenesisState.Builder.class);
    }

    // Construct using com.quasarlabs.quasarnode.epochs.GenesisState.newBuilder()
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
      if (epochsBuilder_ == null) {
        epochs_ = java.util.Collections.emptyList();
      } else {
        epochs_ = null;
        epochsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.quasarlabs.quasarnode.epochs.GenesisProto.internal_static_quasarlabs_quasarnode_epochs_GenesisState_descriptor;
    }

    @java.lang.Override
    public com.quasarlabs.quasarnode.epochs.GenesisState getDefaultInstanceForType() {
      return com.quasarlabs.quasarnode.epochs.GenesisState.getDefaultInstance();
    }

    @java.lang.Override
    public com.quasarlabs.quasarnode.epochs.GenesisState build() {
      com.quasarlabs.quasarnode.epochs.GenesisState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.quasarlabs.quasarnode.epochs.GenesisState buildPartial() {
      com.quasarlabs.quasarnode.epochs.GenesisState result = new com.quasarlabs.quasarnode.epochs.GenesisState(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.quasarlabs.quasarnode.epochs.GenesisState result) {
      if (epochsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          epochs_ = java.util.Collections.unmodifiableList(epochs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.epochs_ = epochs_;
      } else {
        result.epochs_ = epochsBuilder_.build();
      }
    }

    private void buildPartial0(com.quasarlabs.quasarnode.epochs.GenesisState result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.quasarlabs.quasarnode.epochs.GenesisState) {
        return mergeFrom((com.quasarlabs.quasarnode.epochs.GenesisState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.quasarlabs.quasarnode.epochs.GenesisState other) {
      if (other == com.quasarlabs.quasarnode.epochs.GenesisState.getDefaultInstance()) return this;
      if (epochsBuilder_ == null) {
        if (!other.epochs_.isEmpty()) {
          if (epochs_.isEmpty()) {
            epochs_ = other.epochs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureEpochsIsMutable();
            epochs_.addAll(other.epochs_);
          }
          onChanged();
        }
      } else {
        if (!other.epochs_.isEmpty()) {
          if (epochsBuilder_.isEmpty()) {
            epochsBuilder_.dispose();
            epochsBuilder_ = null;
            epochs_ = other.epochs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            epochsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getEpochsFieldBuilder() : null;
          } else {
            epochsBuilder_.addAllMessages(other.epochs_);
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
              com.quasarlabs.quasarnode.epochs.EpochInfo m =
                  input.readMessage(
                      com.quasarlabs.quasarnode.epochs.EpochInfo.parser(),
                      extensionRegistry);
              if (epochsBuilder_ == null) {
                ensureEpochsIsMutable();
                epochs_.add(m);
              } else {
                epochsBuilder_.addMessage(m);
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

    private java.util.List<com.quasarlabs.quasarnode.epochs.EpochInfo> epochs_ =
      java.util.Collections.emptyList();
    private void ensureEpochsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        epochs_ = new java.util.ArrayList<com.quasarlabs.quasarnode.epochs.EpochInfo>(epochs_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.quasarlabs.quasarnode.epochs.EpochInfo, com.quasarlabs.quasarnode.epochs.EpochInfo.Builder, com.quasarlabs.quasarnode.epochs.EpochInfoOrBuilder> epochsBuilder_;

    /**
     * <code>repeated .quasarlabs.quasarnode.epochs.EpochInfo epochs = 1 [json_name = "epochs", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.quasarlabs.quasarnode.epochs.EpochInfo> getEpochsList() {
      if (epochsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(epochs_);
      } else {
        return epochsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .quasarlabs.quasarnode.epochs.EpochInfo epochs = 1 [json_name = "epochs", (.gogoproto.nullable) = false];</code>
     */
    public int getEpochsCount() {
      if (epochsBuilder_ == null) {
        return epochs_.size();
      } else {
        return epochsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .quasarlabs.quasarnode.epochs.EpochInfo epochs = 1 [json_name = "epochs", (.gogoproto.nullable) = false];</code>
     */
    public com.quasarlabs.quasarnode.epochs.EpochInfo getEpochs(int index) {
      if (epochsBuilder_ == null) {
        return epochs_.get(index);
      } else {
        return epochsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .quasarlabs.quasarnode.epochs.EpochInfo epochs = 1 [json_name = "epochs", (.gogoproto.nullable) = false];</code>
     */
    public Builder setEpochs(
        int index, com.quasarlabs.quasarnode.epochs.EpochInfo value) {
      if (epochsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEpochsIsMutable();
        epochs_.set(index, value);
        onChanged();
      } else {
        epochsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .quasarlabs.quasarnode.epochs.EpochInfo epochs = 1 [json_name = "epochs", (.gogoproto.nullable) = false];</code>
     */
    public Builder setEpochs(
        int index, com.quasarlabs.quasarnode.epochs.EpochInfo.Builder builderForValue) {
      if (epochsBuilder_ == null) {
        ensureEpochsIsMutable();
        epochs_.set(index, builderForValue.build());
        onChanged();
      } else {
        epochsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .quasarlabs.quasarnode.epochs.EpochInfo epochs = 1 [json_name = "epochs", (.gogoproto.nullable) = false];</code>
     */
    public Builder addEpochs(com.quasarlabs.quasarnode.epochs.EpochInfo value) {
      if (epochsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEpochsIsMutable();
        epochs_.add(value);
        onChanged();
      } else {
        epochsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .quasarlabs.quasarnode.epochs.EpochInfo epochs = 1 [json_name = "epochs", (.gogoproto.nullable) = false];</code>
     */
    public Builder addEpochs(
        int index, com.quasarlabs.quasarnode.epochs.EpochInfo value) {
      if (epochsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureEpochsIsMutable();
        epochs_.add(index, value);
        onChanged();
      } else {
        epochsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .quasarlabs.quasarnode.epochs.EpochInfo epochs = 1 [json_name = "epochs", (.gogoproto.nullable) = false];</code>
     */
    public Builder addEpochs(
        com.quasarlabs.quasarnode.epochs.EpochInfo.Builder builderForValue) {
      if (epochsBuilder_ == null) {
        ensureEpochsIsMutable();
        epochs_.add(builderForValue.build());
        onChanged();
      } else {
        epochsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .quasarlabs.quasarnode.epochs.EpochInfo epochs = 1 [json_name = "epochs", (.gogoproto.nullable) = false];</code>
     */
    public Builder addEpochs(
        int index, com.quasarlabs.quasarnode.epochs.EpochInfo.Builder builderForValue) {
      if (epochsBuilder_ == null) {
        ensureEpochsIsMutable();
        epochs_.add(index, builderForValue.build());
        onChanged();
      } else {
        epochsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .quasarlabs.quasarnode.epochs.EpochInfo epochs = 1 [json_name = "epochs", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllEpochs(
        java.lang.Iterable<? extends com.quasarlabs.quasarnode.epochs.EpochInfo> values) {
      if (epochsBuilder_ == null) {
        ensureEpochsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, epochs_);
        onChanged();
      } else {
        epochsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .quasarlabs.quasarnode.epochs.EpochInfo epochs = 1 [json_name = "epochs", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearEpochs() {
      if (epochsBuilder_ == null) {
        epochs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        epochsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .quasarlabs.quasarnode.epochs.EpochInfo epochs = 1 [json_name = "epochs", (.gogoproto.nullable) = false];</code>
     */
    public Builder removeEpochs(int index) {
      if (epochsBuilder_ == null) {
        ensureEpochsIsMutable();
        epochs_.remove(index);
        onChanged();
      } else {
        epochsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .quasarlabs.quasarnode.epochs.EpochInfo epochs = 1 [json_name = "epochs", (.gogoproto.nullable) = false];</code>
     */
    public com.quasarlabs.quasarnode.epochs.EpochInfo.Builder getEpochsBuilder(
        int index) {
      return getEpochsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .quasarlabs.quasarnode.epochs.EpochInfo epochs = 1 [json_name = "epochs", (.gogoproto.nullable) = false];</code>
     */
    public com.quasarlabs.quasarnode.epochs.EpochInfoOrBuilder getEpochsOrBuilder(
        int index) {
      if (epochsBuilder_ == null) {
        return epochs_.get(index);  } else {
        return epochsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .quasarlabs.quasarnode.epochs.EpochInfo epochs = 1 [json_name = "epochs", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.quasarlabs.quasarnode.epochs.EpochInfoOrBuilder> 
         getEpochsOrBuilderList() {
      if (epochsBuilder_ != null) {
        return epochsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(epochs_);
      }
    }
    /**
     * <code>repeated .quasarlabs.quasarnode.epochs.EpochInfo epochs = 1 [json_name = "epochs", (.gogoproto.nullable) = false];</code>
     */
    public com.quasarlabs.quasarnode.epochs.EpochInfo.Builder addEpochsBuilder() {
      return getEpochsFieldBuilder().addBuilder(
          com.quasarlabs.quasarnode.epochs.EpochInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .quasarlabs.quasarnode.epochs.EpochInfo epochs = 1 [json_name = "epochs", (.gogoproto.nullable) = false];</code>
     */
    public com.quasarlabs.quasarnode.epochs.EpochInfo.Builder addEpochsBuilder(
        int index) {
      return getEpochsFieldBuilder().addBuilder(
          index, com.quasarlabs.quasarnode.epochs.EpochInfo.getDefaultInstance());
    }
    /**
     * <code>repeated .quasarlabs.quasarnode.epochs.EpochInfo epochs = 1 [json_name = "epochs", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.quasarlabs.quasarnode.epochs.EpochInfo.Builder> 
         getEpochsBuilderList() {
      return getEpochsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.quasarlabs.quasarnode.epochs.EpochInfo, com.quasarlabs.quasarnode.epochs.EpochInfo.Builder, com.quasarlabs.quasarnode.epochs.EpochInfoOrBuilder> 
        getEpochsFieldBuilder() {
      if (epochsBuilder_ == null) {
        epochsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.quasarlabs.quasarnode.epochs.EpochInfo, com.quasarlabs.quasarnode.epochs.EpochInfo.Builder, com.quasarlabs.quasarnode.epochs.EpochInfoOrBuilder>(
                epochs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        epochs_ = null;
      }
      return epochsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:quasarlabs.quasarnode.epochs.GenesisState)
  }

  // @@protoc_insertion_point(class_scope:quasarlabs.quasarnode.epochs.GenesisState)
  private static final com.quasarlabs.quasarnode.epochs.GenesisState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.quasarlabs.quasarnode.epochs.GenesisState();
  }

  public static com.quasarlabs.quasarnode.epochs.GenesisState getDefaultInstance() {
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
  public com.quasarlabs.quasarnode.epochs.GenesisState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

