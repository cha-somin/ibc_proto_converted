// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: shentu/burrow/payload.proto

package com.payload;

/**
 * Protobuf type {@code payload.GovTx}
 */
public final class GovTx extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:payload.GovTx)
    GovTxOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GovTx.newBuilder() to construct.
  private GovTx(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GovTx() {
    inputs_ = java.util.Collections.emptyList();
    accountUpdates_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GovTx();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.payload.PayloadProto.internal_static_payload_GovTx_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.payload.PayloadProto.internal_static_payload_GovTx_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.payload.GovTx.class, com.payload.GovTx.Builder.class);
  }

  public static final int INPUTS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.payload.TxInput> inputs_;
  /**
   * <code>repeated .payload.TxInput Inputs = 1 [json_name = "Inputs"];</code>
   */
  @java.lang.Override
  public java.util.List<com.payload.TxInput> getInputsList() {
    return inputs_;
  }
  /**
   * <code>repeated .payload.TxInput Inputs = 1 [json_name = "Inputs"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.payload.TxInputOrBuilder> 
      getInputsOrBuilderList() {
    return inputs_;
  }
  /**
   * <code>repeated .payload.TxInput Inputs = 1 [json_name = "Inputs"];</code>
   */
  @java.lang.Override
  public int getInputsCount() {
    return inputs_.size();
  }
  /**
   * <code>repeated .payload.TxInput Inputs = 1 [json_name = "Inputs"];</code>
   */
  @java.lang.Override
  public com.payload.TxInput getInputs(int index) {
    return inputs_.get(index);
  }
  /**
   * <code>repeated .payload.TxInput Inputs = 1 [json_name = "Inputs"];</code>
   */
  @java.lang.Override
  public com.payload.TxInputOrBuilder getInputsOrBuilder(
      int index) {
    return inputs_.get(index);
  }

  public static final int ACCOUNTUPDATES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.spec.TemplateAccount> accountUpdates_;
  /**
   * <code>repeated .spec.TemplateAccount AccountUpdates = 2 [json_name = "AccountUpdates", (.gogoproto.nullable) = true];</code>
   */
  @java.lang.Override
  public java.util.List<com.spec.TemplateAccount> getAccountUpdatesList() {
    return accountUpdates_;
  }
  /**
   * <code>repeated .spec.TemplateAccount AccountUpdates = 2 [json_name = "AccountUpdates", (.gogoproto.nullable) = true];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.spec.TemplateAccountOrBuilder> 
      getAccountUpdatesOrBuilderList() {
    return accountUpdates_;
  }
  /**
   * <code>repeated .spec.TemplateAccount AccountUpdates = 2 [json_name = "AccountUpdates", (.gogoproto.nullable) = true];</code>
   */
  @java.lang.Override
  public int getAccountUpdatesCount() {
    return accountUpdates_.size();
  }
  /**
   * <code>repeated .spec.TemplateAccount AccountUpdates = 2 [json_name = "AccountUpdates", (.gogoproto.nullable) = true];</code>
   */
  @java.lang.Override
  public com.spec.TemplateAccount getAccountUpdates(int index) {
    return accountUpdates_.get(index);
  }
  /**
   * <code>repeated .spec.TemplateAccount AccountUpdates = 2 [json_name = "AccountUpdates", (.gogoproto.nullable) = true];</code>
   */
  @java.lang.Override
  public com.spec.TemplateAccountOrBuilder getAccountUpdatesOrBuilder(
      int index) {
    return accountUpdates_.get(index);
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
    for (int i = 0; i < inputs_.size(); i++) {
      output.writeMessage(1, inputs_.get(i));
    }
    for (int i = 0; i < accountUpdates_.size(); i++) {
      output.writeMessage(2, accountUpdates_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < inputs_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, inputs_.get(i));
    }
    for (int i = 0; i < accountUpdates_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, accountUpdates_.get(i));
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
    if (!(obj instanceof com.payload.GovTx)) {
      return super.equals(obj);
    }
    com.payload.GovTx other = (com.payload.GovTx) obj;

    if (!getInputsList()
        .equals(other.getInputsList())) return false;
    if (!getAccountUpdatesList()
        .equals(other.getAccountUpdatesList())) return false;
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
    if (getInputsCount() > 0) {
      hash = (37 * hash) + INPUTS_FIELD_NUMBER;
      hash = (53 * hash) + getInputsList().hashCode();
    }
    if (getAccountUpdatesCount() > 0) {
      hash = (37 * hash) + ACCOUNTUPDATES_FIELD_NUMBER;
      hash = (53 * hash) + getAccountUpdatesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.payload.GovTx parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.payload.GovTx parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.payload.GovTx parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.payload.GovTx parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.payload.GovTx parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.payload.GovTx parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.payload.GovTx parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.payload.GovTx parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.payload.GovTx parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.payload.GovTx parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.payload.GovTx parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.payload.GovTx parseFrom(
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
  public static Builder newBuilder(com.payload.GovTx prototype) {
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
   * Protobuf type {@code payload.GovTx}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:payload.GovTx)
      com.payload.GovTxOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.payload.PayloadProto.internal_static_payload_GovTx_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.payload.PayloadProto.internal_static_payload_GovTx_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.payload.GovTx.class, com.payload.GovTx.Builder.class);
    }

    // Construct using com.payload.GovTx.newBuilder()
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
      if (inputsBuilder_ == null) {
        inputs_ = java.util.Collections.emptyList();
      } else {
        inputs_ = null;
        inputsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      if (accountUpdatesBuilder_ == null) {
        accountUpdates_ = java.util.Collections.emptyList();
      } else {
        accountUpdates_ = null;
        accountUpdatesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.payload.PayloadProto.internal_static_payload_GovTx_descriptor;
    }

    @java.lang.Override
    public com.payload.GovTx getDefaultInstanceForType() {
      return com.payload.GovTx.getDefaultInstance();
    }

    @java.lang.Override
    public com.payload.GovTx build() {
      com.payload.GovTx result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.payload.GovTx buildPartial() {
      com.payload.GovTx result = new com.payload.GovTx(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.payload.GovTx result) {
      if (inputsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          inputs_ = java.util.Collections.unmodifiableList(inputs_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.inputs_ = inputs_;
      } else {
        result.inputs_ = inputsBuilder_.build();
      }
      if (accountUpdatesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          accountUpdates_ = java.util.Collections.unmodifiableList(accountUpdates_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.accountUpdates_ = accountUpdates_;
      } else {
        result.accountUpdates_ = accountUpdatesBuilder_.build();
      }
    }

    private void buildPartial0(com.payload.GovTx result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.payload.GovTx) {
        return mergeFrom((com.payload.GovTx)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.payload.GovTx other) {
      if (other == com.payload.GovTx.getDefaultInstance()) return this;
      if (inputsBuilder_ == null) {
        if (!other.inputs_.isEmpty()) {
          if (inputs_.isEmpty()) {
            inputs_ = other.inputs_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureInputsIsMutable();
            inputs_.addAll(other.inputs_);
          }
          onChanged();
        }
      } else {
        if (!other.inputs_.isEmpty()) {
          if (inputsBuilder_.isEmpty()) {
            inputsBuilder_.dispose();
            inputsBuilder_ = null;
            inputs_ = other.inputs_;
            bitField0_ = (bitField0_ & ~0x00000001);
            inputsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getInputsFieldBuilder() : null;
          } else {
            inputsBuilder_.addAllMessages(other.inputs_);
          }
        }
      }
      if (accountUpdatesBuilder_ == null) {
        if (!other.accountUpdates_.isEmpty()) {
          if (accountUpdates_.isEmpty()) {
            accountUpdates_ = other.accountUpdates_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureAccountUpdatesIsMutable();
            accountUpdates_.addAll(other.accountUpdates_);
          }
          onChanged();
        }
      } else {
        if (!other.accountUpdates_.isEmpty()) {
          if (accountUpdatesBuilder_.isEmpty()) {
            accountUpdatesBuilder_.dispose();
            accountUpdatesBuilder_ = null;
            accountUpdates_ = other.accountUpdates_;
            bitField0_ = (bitField0_ & ~0x00000002);
            accountUpdatesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAccountUpdatesFieldBuilder() : null;
          } else {
            accountUpdatesBuilder_.addAllMessages(other.accountUpdates_);
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
              com.payload.TxInput m =
                  input.readMessage(
                      com.payload.TxInput.parser(),
                      extensionRegistry);
              if (inputsBuilder_ == null) {
                ensureInputsIsMutable();
                inputs_.add(m);
              } else {
                inputsBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              com.spec.TemplateAccount m =
                  input.readMessage(
                      com.spec.TemplateAccount.parser(),
                      extensionRegistry);
              if (accountUpdatesBuilder_ == null) {
                ensureAccountUpdatesIsMutable();
                accountUpdates_.add(m);
              } else {
                accountUpdatesBuilder_.addMessage(m);
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

    private java.util.List<com.payload.TxInput> inputs_ =
      java.util.Collections.emptyList();
    private void ensureInputsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        inputs_ = new java.util.ArrayList<com.payload.TxInput>(inputs_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.payload.TxInput, com.payload.TxInput.Builder, com.payload.TxInputOrBuilder> inputsBuilder_;

    /**
     * <code>repeated .payload.TxInput Inputs = 1 [json_name = "Inputs"];</code>
     */
    public java.util.List<com.payload.TxInput> getInputsList() {
      if (inputsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(inputs_);
      } else {
        return inputsBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .payload.TxInput Inputs = 1 [json_name = "Inputs"];</code>
     */
    public int getInputsCount() {
      if (inputsBuilder_ == null) {
        return inputs_.size();
      } else {
        return inputsBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .payload.TxInput Inputs = 1 [json_name = "Inputs"];</code>
     */
    public com.payload.TxInput getInputs(int index) {
      if (inputsBuilder_ == null) {
        return inputs_.get(index);
      } else {
        return inputsBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .payload.TxInput Inputs = 1 [json_name = "Inputs"];</code>
     */
    public Builder setInputs(
        int index, com.payload.TxInput value) {
      if (inputsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInputsIsMutable();
        inputs_.set(index, value);
        onChanged();
      } else {
        inputsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .payload.TxInput Inputs = 1 [json_name = "Inputs"];</code>
     */
    public Builder setInputs(
        int index, com.payload.TxInput.Builder builderForValue) {
      if (inputsBuilder_ == null) {
        ensureInputsIsMutable();
        inputs_.set(index, builderForValue.build());
        onChanged();
      } else {
        inputsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .payload.TxInput Inputs = 1 [json_name = "Inputs"];</code>
     */
    public Builder addInputs(com.payload.TxInput value) {
      if (inputsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInputsIsMutable();
        inputs_.add(value);
        onChanged();
      } else {
        inputsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .payload.TxInput Inputs = 1 [json_name = "Inputs"];</code>
     */
    public Builder addInputs(
        int index, com.payload.TxInput value) {
      if (inputsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureInputsIsMutable();
        inputs_.add(index, value);
        onChanged();
      } else {
        inputsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .payload.TxInput Inputs = 1 [json_name = "Inputs"];</code>
     */
    public Builder addInputs(
        com.payload.TxInput.Builder builderForValue) {
      if (inputsBuilder_ == null) {
        ensureInputsIsMutable();
        inputs_.add(builderForValue.build());
        onChanged();
      } else {
        inputsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .payload.TxInput Inputs = 1 [json_name = "Inputs"];</code>
     */
    public Builder addInputs(
        int index, com.payload.TxInput.Builder builderForValue) {
      if (inputsBuilder_ == null) {
        ensureInputsIsMutable();
        inputs_.add(index, builderForValue.build());
        onChanged();
      } else {
        inputsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .payload.TxInput Inputs = 1 [json_name = "Inputs"];</code>
     */
    public Builder addAllInputs(
        java.lang.Iterable<? extends com.payload.TxInput> values) {
      if (inputsBuilder_ == null) {
        ensureInputsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, inputs_);
        onChanged();
      } else {
        inputsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .payload.TxInput Inputs = 1 [json_name = "Inputs"];</code>
     */
    public Builder clearInputs() {
      if (inputsBuilder_ == null) {
        inputs_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        inputsBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .payload.TxInput Inputs = 1 [json_name = "Inputs"];</code>
     */
    public Builder removeInputs(int index) {
      if (inputsBuilder_ == null) {
        ensureInputsIsMutable();
        inputs_.remove(index);
        onChanged();
      } else {
        inputsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .payload.TxInput Inputs = 1 [json_name = "Inputs"];</code>
     */
    public com.payload.TxInput.Builder getInputsBuilder(
        int index) {
      return getInputsFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .payload.TxInput Inputs = 1 [json_name = "Inputs"];</code>
     */
    public com.payload.TxInputOrBuilder getInputsOrBuilder(
        int index) {
      if (inputsBuilder_ == null) {
        return inputs_.get(index);  } else {
        return inputsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .payload.TxInput Inputs = 1 [json_name = "Inputs"];</code>
     */
    public java.util.List<? extends com.payload.TxInputOrBuilder> 
         getInputsOrBuilderList() {
      if (inputsBuilder_ != null) {
        return inputsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(inputs_);
      }
    }
    /**
     * <code>repeated .payload.TxInput Inputs = 1 [json_name = "Inputs"];</code>
     */
    public com.payload.TxInput.Builder addInputsBuilder() {
      return getInputsFieldBuilder().addBuilder(
          com.payload.TxInput.getDefaultInstance());
    }
    /**
     * <code>repeated .payload.TxInput Inputs = 1 [json_name = "Inputs"];</code>
     */
    public com.payload.TxInput.Builder addInputsBuilder(
        int index) {
      return getInputsFieldBuilder().addBuilder(
          index, com.payload.TxInput.getDefaultInstance());
    }
    /**
     * <code>repeated .payload.TxInput Inputs = 1 [json_name = "Inputs"];</code>
     */
    public java.util.List<com.payload.TxInput.Builder> 
         getInputsBuilderList() {
      return getInputsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.payload.TxInput, com.payload.TxInput.Builder, com.payload.TxInputOrBuilder> 
        getInputsFieldBuilder() {
      if (inputsBuilder_ == null) {
        inputsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.payload.TxInput, com.payload.TxInput.Builder, com.payload.TxInputOrBuilder>(
                inputs_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        inputs_ = null;
      }
      return inputsBuilder_;
    }

    private java.util.List<com.spec.TemplateAccount> accountUpdates_ =
      java.util.Collections.emptyList();
    private void ensureAccountUpdatesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        accountUpdates_ = new java.util.ArrayList<com.spec.TemplateAccount>(accountUpdates_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.spec.TemplateAccount, com.spec.TemplateAccount.Builder, com.spec.TemplateAccountOrBuilder> accountUpdatesBuilder_;

    /**
     * <code>repeated .spec.TemplateAccount AccountUpdates = 2 [json_name = "AccountUpdates", (.gogoproto.nullable) = true];</code>
     */
    public java.util.List<com.spec.TemplateAccount> getAccountUpdatesList() {
      if (accountUpdatesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(accountUpdates_);
      } else {
        return accountUpdatesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .spec.TemplateAccount AccountUpdates = 2 [json_name = "AccountUpdates", (.gogoproto.nullable) = true];</code>
     */
    public int getAccountUpdatesCount() {
      if (accountUpdatesBuilder_ == null) {
        return accountUpdates_.size();
      } else {
        return accountUpdatesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .spec.TemplateAccount AccountUpdates = 2 [json_name = "AccountUpdates", (.gogoproto.nullable) = true];</code>
     */
    public com.spec.TemplateAccount getAccountUpdates(int index) {
      if (accountUpdatesBuilder_ == null) {
        return accountUpdates_.get(index);
      } else {
        return accountUpdatesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .spec.TemplateAccount AccountUpdates = 2 [json_name = "AccountUpdates", (.gogoproto.nullable) = true];</code>
     */
    public Builder setAccountUpdates(
        int index, com.spec.TemplateAccount value) {
      if (accountUpdatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccountUpdatesIsMutable();
        accountUpdates_.set(index, value);
        onChanged();
      } else {
        accountUpdatesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .spec.TemplateAccount AccountUpdates = 2 [json_name = "AccountUpdates", (.gogoproto.nullable) = true];</code>
     */
    public Builder setAccountUpdates(
        int index, com.spec.TemplateAccount.Builder builderForValue) {
      if (accountUpdatesBuilder_ == null) {
        ensureAccountUpdatesIsMutable();
        accountUpdates_.set(index, builderForValue.build());
        onChanged();
      } else {
        accountUpdatesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .spec.TemplateAccount AccountUpdates = 2 [json_name = "AccountUpdates", (.gogoproto.nullable) = true];</code>
     */
    public Builder addAccountUpdates(com.spec.TemplateAccount value) {
      if (accountUpdatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccountUpdatesIsMutable();
        accountUpdates_.add(value);
        onChanged();
      } else {
        accountUpdatesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .spec.TemplateAccount AccountUpdates = 2 [json_name = "AccountUpdates", (.gogoproto.nullable) = true];</code>
     */
    public Builder addAccountUpdates(
        int index, com.spec.TemplateAccount value) {
      if (accountUpdatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAccountUpdatesIsMutable();
        accountUpdates_.add(index, value);
        onChanged();
      } else {
        accountUpdatesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .spec.TemplateAccount AccountUpdates = 2 [json_name = "AccountUpdates", (.gogoproto.nullable) = true];</code>
     */
    public Builder addAccountUpdates(
        com.spec.TemplateAccount.Builder builderForValue) {
      if (accountUpdatesBuilder_ == null) {
        ensureAccountUpdatesIsMutable();
        accountUpdates_.add(builderForValue.build());
        onChanged();
      } else {
        accountUpdatesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .spec.TemplateAccount AccountUpdates = 2 [json_name = "AccountUpdates", (.gogoproto.nullable) = true];</code>
     */
    public Builder addAccountUpdates(
        int index, com.spec.TemplateAccount.Builder builderForValue) {
      if (accountUpdatesBuilder_ == null) {
        ensureAccountUpdatesIsMutable();
        accountUpdates_.add(index, builderForValue.build());
        onChanged();
      } else {
        accountUpdatesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .spec.TemplateAccount AccountUpdates = 2 [json_name = "AccountUpdates", (.gogoproto.nullable) = true];</code>
     */
    public Builder addAllAccountUpdates(
        java.lang.Iterable<? extends com.spec.TemplateAccount> values) {
      if (accountUpdatesBuilder_ == null) {
        ensureAccountUpdatesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, accountUpdates_);
        onChanged();
      } else {
        accountUpdatesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .spec.TemplateAccount AccountUpdates = 2 [json_name = "AccountUpdates", (.gogoproto.nullable) = true];</code>
     */
    public Builder clearAccountUpdates() {
      if (accountUpdatesBuilder_ == null) {
        accountUpdates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        accountUpdatesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .spec.TemplateAccount AccountUpdates = 2 [json_name = "AccountUpdates", (.gogoproto.nullable) = true];</code>
     */
    public Builder removeAccountUpdates(int index) {
      if (accountUpdatesBuilder_ == null) {
        ensureAccountUpdatesIsMutable();
        accountUpdates_.remove(index);
        onChanged();
      } else {
        accountUpdatesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .spec.TemplateAccount AccountUpdates = 2 [json_name = "AccountUpdates", (.gogoproto.nullable) = true];</code>
     */
    public com.spec.TemplateAccount.Builder getAccountUpdatesBuilder(
        int index) {
      return getAccountUpdatesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .spec.TemplateAccount AccountUpdates = 2 [json_name = "AccountUpdates", (.gogoproto.nullable) = true];</code>
     */
    public com.spec.TemplateAccountOrBuilder getAccountUpdatesOrBuilder(
        int index) {
      if (accountUpdatesBuilder_ == null) {
        return accountUpdates_.get(index);  } else {
        return accountUpdatesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .spec.TemplateAccount AccountUpdates = 2 [json_name = "AccountUpdates", (.gogoproto.nullable) = true];</code>
     */
    public java.util.List<? extends com.spec.TemplateAccountOrBuilder> 
         getAccountUpdatesOrBuilderList() {
      if (accountUpdatesBuilder_ != null) {
        return accountUpdatesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(accountUpdates_);
      }
    }
    /**
     * <code>repeated .spec.TemplateAccount AccountUpdates = 2 [json_name = "AccountUpdates", (.gogoproto.nullable) = true];</code>
     */
    public com.spec.TemplateAccount.Builder addAccountUpdatesBuilder() {
      return getAccountUpdatesFieldBuilder().addBuilder(
          com.spec.TemplateAccount.getDefaultInstance());
    }
    /**
     * <code>repeated .spec.TemplateAccount AccountUpdates = 2 [json_name = "AccountUpdates", (.gogoproto.nullable) = true];</code>
     */
    public com.spec.TemplateAccount.Builder addAccountUpdatesBuilder(
        int index) {
      return getAccountUpdatesFieldBuilder().addBuilder(
          index, com.spec.TemplateAccount.getDefaultInstance());
    }
    /**
     * <code>repeated .spec.TemplateAccount AccountUpdates = 2 [json_name = "AccountUpdates", (.gogoproto.nullable) = true];</code>
     */
    public java.util.List<com.spec.TemplateAccount.Builder> 
         getAccountUpdatesBuilderList() {
      return getAccountUpdatesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.spec.TemplateAccount, com.spec.TemplateAccount.Builder, com.spec.TemplateAccountOrBuilder> 
        getAccountUpdatesFieldBuilder() {
      if (accountUpdatesBuilder_ == null) {
        accountUpdatesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.spec.TemplateAccount, com.spec.TemplateAccount.Builder, com.spec.TemplateAccountOrBuilder>(
                accountUpdates_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        accountUpdates_ = null;
      }
      return accountUpdatesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:payload.GovTx)
  }

  // @@protoc_insertion_point(class_scope:payload.GovTx)
  private static final com.payload.GovTx DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.payload.GovTx();
  }

  public static com.payload.GovTx getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GovTx>
      PARSER = new com.google.protobuf.AbstractParser<GovTx>() {
    @java.lang.Override
    public GovTx parsePartialFrom(
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

  public static com.google.protobuf.Parser<GovTx> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GovTx> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.payload.GovTx getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

