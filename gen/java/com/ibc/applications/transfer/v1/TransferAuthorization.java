// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/applications/transfer/v1/authz.proto

package com.ibc.applications.transfer.v1;

/**
 * <pre>
 * TransferAuthorization allows the grantee to spend up to spend_limit coins from
 * the granter's account for ibc transfer on a specific channel
 * </pre>
 *
 * Protobuf type {@code ibc.applications.transfer.v1.TransferAuthorization}
 */
public final class TransferAuthorization extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.applications.transfer.v1.TransferAuthorization)
    TransferAuthorizationOrBuilder {
private static final long serialVersionUID = 0L;
  // Use TransferAuthorization.newBuilder() to construct.
  private TransferAuthorization(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private TransferAuthorization() {
    allocations_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new TransferAuthorization();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ibc.applications.transfer.v1.AuthzProto.internal_static_ibc_applications_transfer_v1_TransferAuthorization_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ibc.applications.transfer.v1.AuthzProto.internal_static_ibc_applications_transfer_v1_TransferAuthorization_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ibc.applications.transfer.v1.TransferAuthorization.class, com.ibc.applications.transfer.v1.TransferAuthorization.Builder.class);
  }

  public static final int ALLOCATIONS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.ibc.applications.transfer.v1.Allocation> allocations_;
  /**
   * <pre>
   * port and channel amounts
   * </pre>
   *
   * <code>repeated .ibc.applications.transfer.v1.Allocation allocations = 1 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<com.ibc.applications.transfer.v1.Allocation> getAllocationsList() {
    return allocations_;
  }
  /**
   * <pre>
   * port and channel amounts
   * </pre>
   *
   * <code>repeated .ibc.applications.transfer.v1.Allocation allocations = 1 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.ibc.applications.transfer.v1.AllocationOrBuilder> 
      getAllocationsOrBuilderList() {
    return allocations_;
  }
  /**
   * <pre>
   * port and channel amounts
   * </pre>
   *
   * <code>repeated .ibc.applications.transfer.v1.Allocation allocations = 1 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public int getAllocationsCount() {
    return allocations_.size();
  }
  /**
   * <pre>
   * port and channel amounts
   * </pre>
   *
   * <code>repeated .ibc.applications.transfer.v1.Allocation allocations = 1 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.ibc.applications.transfer.v1.Allocation getAllocations(int index) {
    return allocations_.get(index);
  }
  /**
   * <pre>
   * port and channel amounts
   * </pre>
   *
   * <code>repeated .ibc.applications.transfer.v1.Allocation allocations = 1 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.ibc.applications.transfer.v1.AllocationOrBuilder getAllocationsOrBuilder(
      int index) {
    return allocations_.get(index);
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
    for (int i = 0; i < allocations_.size(); i++) {
      output.writeMessage(1, allocations_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < allocations_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, allocations_.get(i));
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
    if (!(obj instanceof com.ibc.applications.transfer.v1.TransferAuthorization)) {
      return super.equals(obj);
    }
    com.ibc.applications.transfer.v1.TransferAuthorization other = (com.ibc.applications.transfer.v1.TransferAuthorization) obj;

    if (!getAllocationsList()
        .equals(other.getAllocationsList())) return false;
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
    if (getAllocationsCount() > 0) {
      hash = (37 * hash) + ALLOCATIONS_FIELD_NUMBER;
      hash = (53 * hash) + getAllocationsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ibc.applications.transfer.v1.TransferAuthorization parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.applications.transfer.v1.TransferAuthorization parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.applications.transfer.v1.TransferAuthorization parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.applications.transfer.v1.TransferAuthorization parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.applications.transfer.v1.TransferAuthorization parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.applications.transfer.v1.TransferAuthorization parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.applications.transfer.v1.TransferAuthorization parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.applications.transfer.v1.TransferAuthorization parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.ibc.applications.transfer.v1.TransferAuthorization parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.ibc.applications.transfer.v1.TransferAuthorization parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.applications.transfer.v1.TransferAuthorization parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.applications.transfer.v1.TransferAuthorization parseFrom(
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
  public static Builder newBuilder(com.ibc.applications.transfer.v1.TransferAuthorization prototype) {
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
   * TransferAuthorization allows the grantee to spend up to spend_limit coins from
   * the granter's account for ibc transfer on a specific channel
   * </pre>
   *
   * Protobuf type {@code ibc.applications.transfer.v1.TransferAuthorization}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.applications.transfer.v1.TransferAuthorization)
      com.ibc.applications.transfer.v1.TransferAuthorizationOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ibc.applications.transfer.v1.AuthzProto.internal_static_ibc_applications_transfer_v1_TransferAuthorization_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibc.applications.transfer.v1.AuthzProto.internal_static_ibc_applications_transfer_v1_TransferAuthorization_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibc.applications.transfer.v1.TransferAuthorization.class, com.ibc.applications.transfer.v1.TransferAuthorization.Builder.class);
    }

    // Construct using com.ibc.applications.transfer.v1.TransferAuthorization.newBuilder()
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
      if (allocationsBuilder_ == null) {
        allocations_ = java.util.Collections.emptyList();
      } else {
        allocations_ = null;
        allocationsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ibc.applications.transfer.v1.AuthzProto.internal_static_ibc_applications_transfer_v1_TransferAuthorization_descriptor;
    }

    @java.lang.Override
    public com.ibc.applications.transfer.v1.TransferAuthorization getDefaultInstanceForType() {
      return com.ibc.applications.transfer.v1.TransferAuthorization.getDefaultInstance();
    }

    @java.lang.Override
    public com.ibc.applications.transfer.v1.TransferAuthorization build() {
      com.ibc.applications.transfer.v1.TransferAuthorization result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ibc.applications.transfer.v1.TransferAuthorization buildPartial() {
      com.ibc.applications.transfer.v1.TransferAuthorization result = new com.ibc.applications.transfer.v1.TransferAuthorization(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.ibc.applications.transfer.v1.TransferAuthorization result) {
      if (allocationsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          allocations_ = java.util.Collections.unmodifiableList(allocations_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.allocations_ = allocations_;
      } else {
        result.allocations_ = allocationsBuilder_.build();
      }
    }

    private void buildPartial0(com.ibc.applications.transfer.v1.TransferAuthorization result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ibc.applications.transfer.v1.TransferAuthorization) {
        return mergeFrom((com.ibc.applications.transfer.v1.TransferAuthorization)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ibc.applications.transfer.v1.TransferAuthorization other) {
      if (other == com.ibc.applications.transfer.v1.TransferAuthorization.getDefaultInstance()) return this;
      if (allocationsBuilder_ == null) {
        if (!other.allocations_.isEmpty()) {
          if (allocations_.isEmpty()) {
            allocations_ = other.allocations_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAllocationsIsMutable();
            allocations_.addAll(other.allocations_);
          }
          onChanged();
        }
      } else {
        if (!other.allocations_.isEmpty()) {
          if (allocationsBuilder_.isEmpty()) {
            allocationsBuilder_.dispose();
            allocationsBuilder_ = null;
            allocations_ = other.allocations_;
            bitField0_ = (bitField0_ & ~0x00000001);
            allocationsBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAllocationsFieldBuilder() : null;
          } else {
            allocationsBuilder_.addAllMessages(other.allocations_);
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
              com.ibc.applications.transfer.v1.Allocation m =
                  input.readMessage(
                      com.ibc.applications.transfer.v1.Allocation.parser(),
                      extensionRegistry);
              if (allocationsBuilder_ == null) {
                ensureAllocationsIsMutable();
                allocations_.add(m);
              } else {
                allocationsBuilder_.addMessage(m);
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

    private java.util.List<com.ibc.applications.transfer.v1.Allocation> allocations_ =
      java.util.Collections.emptyList();
    private void ensureAllocationsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        allocations_ = new java.util.ArrayList<com.ibc.applications.transfer.v1.Allocation>(allocations_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ibc.applications.transfer.v1.Allocation, com.ibc.applications.transfer.v1.Allocation.Builder, com.ibc.applications.transfer.v1.AllocationOrBuilder> allocationsBuilder_;

    /**
     * <pre>
     * port and channel amounts
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.Allocation allocations = 1 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.ibc.applications.transfer.v1.Allocation> getAllocationsList() {
      if (allocationsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(allocations_);
      } else {
        return allocationsBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * port and channel amounts
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.Allocation allocations = 1 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public int getAllocationsCount() {
      if (allocationsBuilder_ == null) {
        return allocations_.size();
      } else {
        return allocationsBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * port and channel amounts
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.Allocation allocations = 1 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public com.ibc.applications.transfer.v1.Allocation getAllocations(int index) {
      if (allocationsBuilder_ == null) {
        return allocations_.get(index);
      } else {
        return allocationsBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * port and channel amounts
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.Allocation allocations = 1 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public Builder setAllocations(
        int index, com.ibc.applications.transfer.v1.Allocation value) {
      if (allocationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAllocationsIsMutable();
        allocations_.set(index, value);
        onChanged();
      } else {
        allocationsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * port and channel amounts
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.Allocation allocations = 1 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public Builder setAllocations(
        int index, com.ibc.applications.transfer.v1.Allocation.Builder builderForValue) {
      if (allocationsBuilder_ == null) {
        ensureAllocationsIsMutable();
        allocations_.set(index, builderForValue.build());
        onChanged();
      } else {
        allocationsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * port and channel amounts
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.Allocation allocations = 1 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllocations(com.ibc.applications.transfer.v1.Allocation value) {
      if (allocationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAllocationsIsMutable();
        allocations_.add(value);
        onChanged();
      } else {
        allocationsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * port and channel amounts
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.Allocation allocations = 1 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllocations(
        int index, com.ibc.applications.transfer.v1.Allocation value) {
      if (allocationsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAllocationsIsMutable();
        allocations_.add(index, value);
        onChanged();
      } else {
        allocationsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * port and channel amounts
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.Allocation allocations = 1 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllocations(
        com.ibc.applications.transfer.v1.Allocation.Builder builderForValue) {
      if (allocationsBuilder_ == null) {
        ensureAllocationsIsMutable();
        allocations_.add(builderForValue.build());
        onChanged();
      } else {
        allocationsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * port and channel amounts
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.Allocation allocations = 1 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllocations(
        int index, com.ibc.applications.transfer.v1.Allocation.Builder builderForValue) {
      if (allocationsBuilder_ == null) {
        ensureAllocationsIsMutable();
        allocations_.add(index, builderForValue.build());
        onChanged();
      } else {
        allocationsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * port and channel amounts
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.Allocation allocations = 1 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public Builder addAllAllocations(
        java.lang.Iterable<? extends com.ibc.applications.transfer.v1.Allocation> values) {
      if (allocationsBuilder_ == null) {
        ensureAllocationsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, allocations_);
        onChanged();
      } else {
        allocationsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * port and channel amounts
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.Allocation allocations = 1 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearAllocations() {
      if (allocationsBuilder_ == null) {
        allocations_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        allocationsBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * port and channel amounts
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.Allocation allocations = 1 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public Builder removeAllocations(int index) {
      if (allocationsBuilder_ == null) {
        ensureAllocationsIsMutable();
        allocations_.remove(index);
        onChanged();
      } else {
        allocationsBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * port and channel amounts
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.Allocation allocations = 1 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public com.ibc.applications.transfer.v1.Allocation.Builder getAllocationsBuilder(
        int index) {
      return getAllocationsFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * port and channel amounts
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.Allocation allocations = 1 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public com.ibc.applications.transfer.v1.AllocationOrBuilder getAllocationsOrBuilder(
        int index) {
      if (allocationsBuilder_ == null) {
        return allocations_.get(index);  } else {
        return allocationsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * port and channel amounts
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.Allocation allocations = 1 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<? extends com.ibc.applications.transfer.v1.AllocationOrBuilder> 
         getAllocationsOrBuilderList() {
      if (allocationsBuilder_ != null) {
        return allocationsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(allocations_);
      }
    }
    /**
     * <pre>
     * port and channel amounts
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.Allocation allocations = 1 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public com.ibc.applications.transfer.v1.Allocation.Builder addAllocationsBuilder() {
      return getAllocationsFieldBuilder().addBuilder(
          com.ibc.applications.transfer.v1.Allocation.getDefaultInstance());
    }
    /**
     * <pre>
     * port and channel amounts
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.Allocation allocations = 1 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public com.ibc.applications.transfer.v1.Allocation.Builder addAllocationsBuilder(
        int index) {
      return getAllocationsFieldBuilder().addBuilder(
          index, com.ibc.applications.transfer.v1.Allocation.getDefaultInstance());
    }
    /**
     * <pre>
     * port and channel amounts
     * </pre>
     *
     * <code>repeated .ibc.applications.transfer.v1.Allocation allocations = 1 [json_name = "allocations", (.gogoproto.nullable) = false];</code>
     */
    public java.util.List<com.ibc.applications.transfer.v1.Allocation.Builder> 
         getAllocationsBuilderList() {
      return getAllocationsFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.ibc.applications.transfer.v1.Allocation, com.ibc.applications.transfer.v1.Allocation.Builder, com.ibc.applications.transfer.v1.AllocationOrBuilder> 
        getAllocationsFieldBuilder() {
      if (allocationsBuilder_ == null) {
        allocationsBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.ibc.applications.transfer.v1.Allocation, com.ibc.applications.transfer.v1.Allocation.Builder, com.ibc.applications.transfer.v1.AllocationOrBuilder>(
                allocations_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        allocations_ = null;
      }
      return allocationsBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ibc.applications.transfer.v1.TransferAuthorization)
  }

  // @@protoc_insertion_point(class_scope:ibc.applications.transfer.v1.TransferAuthorization)
  private static final com.ibc.applications.transfer.v1.TransferAuthorization DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ibc.applications.transfer.v1.TransferAuthorization();
  }

  public static com.ibc.applications.transfer.v1.TransferAuthorization getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TransferAuthorization>
      PARSER = new com.google.protobuf.AbstractParser<TransferAuthorization>() {
    @java.lang.Override
    public TransferAuthorization parsePartialFrom(
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

  public static com.google.protobuf.Parser<TransferAuthorization> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TransferAuthorization> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ibc.applications.transfer.v1.TransferAuthorization getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

