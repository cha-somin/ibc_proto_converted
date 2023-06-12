// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: injective/exchange/v1beta1/events.proto

package com.injective.exchange.v1beta1;

/**
 * Protobuf type {@code injective.exchange.v1beta1.EventBatchDepositUpdate}
 */
public final class EventBatchDepositUpdate extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:injective.exchange.v1beta1.EventBatchDepositUpdate)
    EventBatchDepositUpdateOrBuilder {
private static final long serialVersionUID = 0L;
  // Use EventBatchDepositUpdate.newBuilder() to construct.
  private EventBatchDepositUpdate(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private EventBatchDepositUpdate() {
    depositUpdates_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new EventBatchDepositUpdate();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.injective.exchange.v1beta1.EventsProto.internal_static_injective_exchange_v1beta1_EventBatchDepositUpdate_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.injective.exchange.v1beta1.EventsProto.internal_static_injective_exchange_v1beta1_EventBatchDepositUpdate_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.injective.exchange.v1beta1.EventBatchDepositUpdate.class, com.injective.exchange.v1beta1.EventBatchDepositUpdate.Builder.class);
  }

  public static final int DEPOSIT_UPDATES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.injective.exchange.v1beta1.DepositUpdate> depositUpdates_;
  /**
   * <code>repeated .injective.exchange.v1beta1.DepositUpdate deposit_updates = 1 [json_name = "depositUpdates"];</code>
   */
  @java.lang.Override
  public java.util.List<com.injective.exchange.v1beta1.DepositUpdate> getDepositUpdatesList() {
    return depositUpdates_;
  }
  /**
   * <code>repeated .injective.exchange.v1beta1.DepositUpdate deposit_updates = 1 [json_name = "depositUpdates"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.injective.exchange.v1beta1.DepositUpdateOrBuilder> 
      getDepositUpdatesOrBuilderList() {
    return depositUpdates_;
  }
  /**
   * <code>repeated .injective.exchange.v1beta1.DepositUpdate deposit_updates = 1 [json_name = "depositUpdates"];</code>
   */
  @java.lang.Override
  public int getDepositUpdatesCount() {
    return depositUpdates_.size();
  }
  /**
   * <code>repeated .injective.exchange.v1beta1.DepositUpdate deposit_updates = 1 [json_name = "depositUpdates"];</code>
   */
  @java.lang.Override
  public com.injective.exchange.v1beta1.DepositUpdate getDepositUpdates(int index) {
    return depositUpdates_.get(index);
  }
  /**
   * <code>repeated .injective.exchange.v1beta1.DepositUpdate deposit_updates = 1 [json_name = "depositUpdates"];</code>
   */
  @java.lang.Override
  public com.injective.exchange.v1beta1.DepositUpdateOrBuilder getDepositUpdatesOrBuilder(
      int index) {
    return depositUpdates_.get(index);
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
    for (int i = 0; i < depositUpdates_.size(); i++) {
      output.writeMessage(1, depositUpdates_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < depositUpdates_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, depositUpdates_.get(i));
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
    if (!(obj instanceof com.injective.exchange.v1beta1.EventBatchDepositUpdate)) {
      return super.equals(obj);
    }
    com.injective.exchange.v1beta1.EventBatchDepositUpdate other = (com.injective.exchange.v1beta1.EventBatchDepositUpdate) obj;

    if (!getDepositUpdatesList()
        .equals(other.getDepositUpdatesList())) return false;
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
    if (getDepositUpdatesCount() > 0) {
      hash = (37 * hash) + DEPOSIT_UPDATES_FIELD_NUMBER;
      hash = (53 * hash) + getDepositUpdatesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.injective.exchange.v1beta1.EventBatchDepositUpdate parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.EventBatchDepositUpdate parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.EventBatchDepositUpdate parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.EventBatchDepositUpdate parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.EventBatchDepositUpdate parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.injective.exchange.v1beta1.EventBatchDepositUpdate parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.EventBatchDepositUpdate parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.EventBatchDepositUpdate parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.injective.exchange.v1beta1.EventBatchDepositUpdate parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.injective.exchange.v1beta1.EventBatchDepositUpdate parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.injective.exchange.v1beta1.EventBatchDepositUpdate parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.injective.exchange.v1beta1.EventBatchDepositUpdate parseFrom(
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
  public static Builder newBuilder(com.injective.exchange.v1beta1.EventBatchDepositUpdate prototype) {
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
   * Protobuf type {@code injective.exchange.v1beta1.EventBatchDepositUpdate}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:injective.exchange.v1beta1.EventBatchDepositUpdate)
      com.injective.exchange.v1beta1.EventBatchDepositUpdateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.injective.exchange.v1beta1.EventsProto.internal_static_injective_exchange_v1beta1_EventBatchDepositUpdate_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.injective.exchange.v1beta1.EventsProto.internal_static_injective_exchange_v1beta1_EventBatchDepositUpdate_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.injective.exchange.v1beta1.EventBatchDepositUpdate.class, com.injective.exchange.v1beta1.EventBatchDepositUpdate.Builder.class);
    }

    // Construct using com.injective.exchange.v1beta1.EventBatchDepositUpdate.newBuilder()
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
      if (depositUpdatesBuilder_ == null) {
        depositUpdates_ = java.util.Collections.emptyList();
      } else {
        depositUpdates_ = null;
        depositUpdatesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.injective.exchange.v1beta1.EventsProto.internal_static_injective_exchange_v1beta1_EventBatchDepositUpdate_descriptor;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.EventBatchDepositUpdate getDefaultInstanceForType() {
      return com.injective.exchange.v1beta1.EventBatchDepositUpdate.getDefaultInstance();
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.EventBatchDepositUpdate build() {
      com.injective.exchange.v1beta1.EventBatchDepositUpdate result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.injective.exchange.v1beta1.EventBatchDepositUpdate buildPartial() {
      com.injective.exchange.v1beta1.EventBatchDepositUpdate result = new com.injective.exchange.v1beta1.EventBatchDepositUpdate(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.injective.exchange.v1beta1.EventBatchDepositUpdate result) {
      if (depositUpdatesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          depositUpdates_ = java.util.Collections.unmodifiableList(depositUpdates_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.depositUpdates_ = depositUpdates_;
      } else {
        result.depositUpdates_ = depositUpdatesBuilder_.build();
      }
    }

    private void buildPartial0(com.injective.exchange.v1beta1.EventBatchDepositUpdate result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.injective.exchange.v1beta1.EventBatchDepositUpdate) {
        return mergeFrom((com.injective.exchange.v1beta1.EventBatchDepositUpdate)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.injective.exchange.v1beta1.EventBatchDepositUpdate other) {
      if (other == com.injective.exchange.v1beta1.EventBatchDepositUpdate.getDefaultInstance()) return this;
      if (depositUpdatesBuilder_ == null) {
        if (!other.depositUpdates_.isEmpty()) {
          if (depositUpdates_.isEmpty()) {
            depositUpdates_ = other.depositUpdates_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDepositUpdatesIsMutable();
            depositUpdates_.addAll(other.depositUpdates_);
          }
          onChanged();
        }
      } else {
        if (!other.depositUpdates_.isEmpty()) {
          if (depositUpdatesBuilder_.isEmpty()) {
            depositUpdatesBuilder_.dispose();
            depositUpdatesBuilder_ = null;
            depositUpdates_ = other.depositUpdates_;
            bitField0_ = (bitField0_ & ~0x00000001);
            depositUpdatesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getDepositUpdatesFieldBuilder() : null;
          } else {
            depositUpdatesBuilder_.addAllMessages(other.depositUpdates_);
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
              com.injective.exchange.v1beta1.DepositUpdate m =
                  input.readMessage(
                      com.injective.exchange.v1beta1.DepositUpdate.parser(),
                      extensionRegistry);
              if (depositUpdatesBuilder_ == null) {
                ensureDepositUpdatesIsMutable();
                depositUpdates_.add(m);
              } else {
                depositUpdatesBuilder_.addMessage(m);
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

    private java.util.List<com.injective.exchange.v1beta1.DepositUpdate> depositUpdates_ =
      java.util.Collections.emptyList();
    private void ensureDepositUpdatesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        depositUpdates_ = new java.util.ArrayList<com.injective.exchange.v1beta1.DepositUpdate>(depositUpdates_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.injective.exchange.v1beta1.DepositUpdate, com.injective.exchange.v1beta1.DepositUpdate.Builder, com.injective.exchange.v1beta1.DepositUpdateOrBuilder> depositUpdatesBuilder_;

    /**
     * <code>repeated .injective.exchange.v1beta1.DepositUpdate deposit_updates = 1 [json_name = "depositUpdates"];</code>
     */
    public java.util.List<com.injective.exchange.v1beta1.DepositUpdate> getDepositUpdatesList() {
      if (depositUpdatesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(depositUpdates_);
      } else {
        return depositUpdatesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.DepositUpdate deposit_updates = 1 [json_name = "depositUpdates"];</code>
     */
    public int getDepositUpdatesCount() {
      if (depositUpdatesBuilder_ == null) {
        return depositUpdates_.size();
      } else {
        return depositUpdatesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.DepositUpdate deposit_updates = 1 [json_name = "depositUpdates"];</code>
     */
    public com.injective.exchange.v1beta1.DepositUpdate getDepositUpdates(int index) {
      if (depositUpdatesBuilder_ == null) {
        return depositUpdates_.get(index);
      } else {
        return depositUpdatesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.DepositUpdate deposit_updates = 1 [json_name = "depositUpdates"];</code>
     */
    public Builder setDepositUpdates(
        int index, com.injective.exchange.v1beta1.DepositUpdate value) {
      if (depositUpdatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDepositUpdatesIsMutable();
        depositUpdates_.set(index, value);
        onChanged();
      } else {
        depositUpdatesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.DepositUpdate deposit_updates = 1 [json_name = "depositUpdates"];</code>
     */
    public Builder setDepositUpdates(
        int index, com.injective.exchange.v1beta1.DepositUpdate.Builder builderForValue) {
      if (depositUpdatesBuilder_ == null) {
        ensureDepositUpdatesIsMutable();
        depositUpdates_.set(index, builderForValue.build());
        onChanged();
      } else {
        depositUpdatesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.DepositUpdate deposit_updates = 1 [json_name = "depositUpdates"];</code>
     */
    public Builder addDepositUpdates(com.injective.exchange.v1beta1.DepositUpdate value) {
      if (depositUpdatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDepositUpdatesIsMutable();
        depositUpdates_.add(value);
        onChanged();
      } else {
        depositUpdatesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.DepositUpdate deposit_updates = 1 [json_name = "depositUpdates"];</code>
     */
    public Builder addDepositUpdates(
        int index, com.injective.exchange.v1beta1.DepositUpdate value) {
      if (depositUpdatesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDepositUpdatesIsMutable();
        depositUpdates_.add(index, value);
        onChanged();
      } else {
        depositUpdatesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.DepositUpdate deposit_updates = 1 [json_name = "depositUpdates"];</code>
     */
    public Builder addDepositUpdates(
        com.injective.exchange.v1beta1.DepositUpdate.Builder builderForValue) {
      if (depositUpdatesBuilder_ == null) {
        ensureDepositUpdatesIsMutable();
        depositUpdates_.add(builderForValue.build());
        onChanged();
      } else {
        depositUpdatesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.DepositUpdate deposit_updates = 1 [json_name = "depositUpdates"];</code>
     */
    public Builder addDepositUpdates(
        int index, com.injective.exchange.v1beta1.DepositUpdate.Builder builderForValue) {
      if (depositUpdatesBuilder_ == null) {
        ensureDepositUpdatesIsMutable();
        depositUpdates_.add(index, builderForValue.build());
        onChanged();
      } else {
        depositUpdatesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.DepositUpdate deposit_updates = 1 [json_name = "depositUpdates"];</code>
     */
    public Builder addAllDepositUpdates(
        java.lang.Iterable<? extends com.injective.exchange.v1beta1.DepositUpdate> values) {
      if (depositUpdatesBuilder_ == null) {
        ensureDepositUpdatesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, depositUpdates_);
        onChanged();
      } else {
        depositUpdatesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.DepositUpdate deposit_updates = 1 [json_name = "depositUpdates"];</code>
     */
    public Builder clearDepositUpdates() {
      if (depositUpdatesBuilder_ == null) {
        depositUpdates_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        depositUpdatesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.DepositUpdate deposit_updates = 1 [json_name = "depositUpdates"];</code>
     */
    public Builder removeDepositUpdates(int index) {
      if (depositUpdatesBuilder_ == null) {
        ensureDepositUpdatesIsMutable();
        depositUpdates_.remove(index);
        onChanged();
      } else {
        depositUpdatesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.DepositUpdate deposit_updates = 1 [json_name = "depositUpdates"];</code>
     */
    public com.injective.exchange.v1beta1.DepositUpdate.Builder getDepositUpdatesBuilder(
        int index) {
      return getDepositUpdatesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.DepositUpdate deposit_updates = 1 [json_name = "depositUpdates"];</code>
     */
    public com.injective.exchange.v1beta1.DepositUpdateOrBuilder getDepositUpdatesOrBuilder(
        int index) {
      if (depositUpdatesBuilder_ == null) {
        return depositUpdates_.get(index);  } else {
        return depositUpdatesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.DepositUpdate deposit_updates = 1 [json_name = "depositUpdates"];</code>
     */
    public java.util.List<? extends com.injective.exchange.v1beta1.DepositUpdateOrBuilder> 
         getDepositUpdatesOrBuilderList() {
      if (depositUpdatesBuilder_ != null) {
        return depositUpdatesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(depositUpdates_);
      }
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.DepositUpdate deposit_updates = 1 [json_name = "depositUpdates"];</code>
     */
    public com.injective.exchange.v1beta1.DepositUpdate.Builder addDepositUpdatesBuilder() {
      return getDepositUpdatesFieldBuilder().addBuilder(
          com.injective.exchange.v1beta1.DepositUpdate.getDefaultInstance());
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.DepositUpdate deposit_updates = 1 [json_name = "depositUpdates"];</code>
     */
    public com.injective.exchange.v1beta1.DepositUpdate.Builder addDepositUpdatesBuilder(
        int index) {
      return getDepositUpdatesFieldBuilder().addBuilder(
          index, com.injective.exchange.v1beta1.DepositUpdate.getDefaultInstance());
    }
    /**
     * <code>repeated .injective.exchange.v1beta1.DepositUpdate deposit_updates = 1 [json_name = "depositUpdates"];</code>
     */
    public java.util.List<com.injective.exchange.v1beta1.DepositUpdate.Builder> 
         getDepositUpdatesBuilderList() {
      return getDepositUpdatesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.injective.exchange.v1beta1.DepositUpdate, com.injective.exchange.v1beta1.DepositUpdate.Builder, com.injective.exchange.v1beta1.DepositUpdateOrBuilder> 
        getDepositUpdatesFieldBuilder() {
      if (depositUpdatesBuilder_ == null) {
        depositUpdatesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.injective.exchange.v1beta1.DepositUpdate, com.injective.exchange.v1beta1.DepositUpdate.Builder, com.injective.exchange.v1beta1.DepositUpdateOrBuilder>(
                depositUpdates_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        depositUpdates_ = null;
      }
      return depositUpdatesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:injective.exchange.v1beta1.EventBatchDepositUpdate)
  }

  // @@protoc_insertion_point(class_scope:injective.exchange.v1beta1.EventBatchDepositUpdate)
  private static final com.injective.exchange.v1beta1.EventBatchDepositUpdate DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.injective.exchange.v1beta1.EventBatchDepositUpdate();
  }

  public static com.injective.exchange.v1beta1.EventBatchDepositUpdate getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EventBatchDepositUpdate>
      PARSER = new com.google.protobuf.AbstractParser<EventBatchDepositUpdate>() {
    @java.lang.Override
    public EventBatchDepositUpdate parsePartialFrom(
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

  public static com.google.protobuf.Parser<EventBatchDepositUpdate> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EventBatchDepositUpdate> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.injective.exchange.v1beta1.EventBatchDepositUpdate getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

