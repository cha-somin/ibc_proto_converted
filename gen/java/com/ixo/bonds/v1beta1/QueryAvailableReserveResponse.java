// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ixo/bonds/v1beta1/query.proto

package com.ixo.bonds.v1beta1;

/**
 * <pre>
 * QueryAvailableReserveResponse is the response type for the
 * Query/AvailableReserve RPC method.
 * </pre>
 *
 * Protobuf type {@code ixo.bonds.v1beta1.QueryAvailableReserveResponse}
 */
public final class QueryAvailableReserveResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ixo.bonds.v1beta1.QueryAvailableReserveResponse)
    QueryAvailableReserveResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryAvailableReserveResponse.newBuilder() to construct.
  private QueryAvailableReserveResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryAvailableReserveResponse() {
    availableReserve_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryAvailableReserveResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ixo.bonds.v1beta1.QueryProto.internal_static_ixo_bonds_v1beta1_QueryAvailableReserveResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ixo.bonds.v1beta1.QueryProto.internal_static_ixo_bonds_v1beta1_QueryAvailableReserveResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ixo.bonds.v1beta1.QueryAvailableReserveResponse.class, com.ixo.bonds.v1beta1.QueryAvailableReserveResponse.Builder.class);
  }

  public static final int AVAILABLE_RESERVE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.cosmos.base.v1beta1.Coin> availableReserve_;
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin available_reserve = 1 [json_name = "availableReserve", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"available_reserve&#92;""];</code>
   */
  @java.lang.Override
  public java.util.List<com.cosmos.base.v1beta1.Coin> getAvailableReserveList() {
    return availableReserve_;
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin available_reserve = 1 [json_name = "availableReserve", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"available_reserve&#92;""];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getAvailableReserveOrBuilderList() {
    return availableReserve_;
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin available_reserve = 1 [json_name = "availableReserve", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"available_reserve&#92;""];</code>
   */
  @java.lang.Override
  public int getAvailableReserveCount() {
    return availableReserve_.size();
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin available_reserve = 1 [json_name = "availableReserve", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"available_reserve&#92;""];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getAvailableReserve(int index) {
    return availableReserve_.get(index);
  }
  /**
   * <code>repeated .cosmos.base.v1beta1.Coin available_reserve = 1 [json_name = "availableReserve", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"available_reserve&#92;""];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getAvailableReserveOrBuilder(
      int index) {
    return availableReserve_.get(index);
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
    for (int i = 0; i < availableReserve_.size(); i++) {
      output.writeMessage(1, availableReserve_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < availableReserve_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, availableReserve_.get(i));
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
    if (!(obj instanceof com.ixo.bonds.v1beta1.QueryAvailableReserveResponse)) {
      return super.equals(obj);
    }
    com.ixo.bonds.v1beta1.QueryAvailableReserveResponse other = (com.ixo.bonds.v1beta1.QueryAvailableReserveResponse) obj;

    if (!getAvailableReserveList()
        .equals(other.getAvailableReserveList())) return false;
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
    if (getAvailableReserveCount() > 0) {
      hash = (37 * hash) + AVAILABLE_RESERVE_FIELD_NUMBER;
      hash = (53 * hash) + getAvailableReserveList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ixo.bonds.v1beta1.QueryAvailableReserveResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ixo.bonds.v1beta1.QueryAvailableReserveResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ixo.bonds.v1beta1.QueryAvailableReserveResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ixo.bonds.v1beta1.QueryAvailableReserveResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ixo.bonds.v1beta1.QueryAvailableReserveResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ixo.bonds.v1beta1.QueryAvailableReserveResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ixo.bonds.v1beta1.QueryAvailableReserveResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ixo.bonds.v1beta1.QueryAvailableReserveResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.ixo.bonds.v1beta1.QueryAvailableReserveResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.ixo.bonds.v1beta1.QueryAvailableReserveResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ixo.bonds.v1beta1.QueryAvailableReserveResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ixo.bonds.v1beta1.QueryAvailableReserveResponse parseFrom(
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
  public static Builder newBuilder(com.ixo.bonds.v1beta1.QueryAvailableReserveResponse prototype) {
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
   * QueryAvailableReserveResponse is the response type for the
   * Query/AvailableReserve RPC method.
   * </pre>
   *
   * Protobuf type {@code ixo.bonds.v1beta1.QueryAvailableReserveResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ixo.bonds.v1beta1.QueryAvailableReserveResponse)
      com.ixo.bonds.v1beta1.QueryAvailableReserveResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ixo.bonds.v1beta1.QueryProto.internal_static_ixo_bonds_v1beta1_QueryAvailableReserveResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ixo.bonds.v1beta1.QueryProto.internal_static_ixo_bonds_v1beta1_QueryAvailableReserveResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ixo.bonds.v1beta1.QueryAvailableReserveResponse.class, com.ixo.bonds.v1beta1.QueryAvailableReserveResponse.Builder.class);
    }

    // Construct using com.ixo.bonds.v1beta1.QueryAvailableReserveResponse.newBuilder()
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
      if (availableReserveBuilder_ == null) {
        availableReserve_ = java.util.Collections.emptyList();
      } else {
        availableReserve_ = null;
        availableReserveBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ixo.bonds.v1beta1.QueryProto.internal_static_ixo_bonds_v1beta1_QueryAvailableReserveResponse_descriptor;
    }

    @java.lang.Override
    public com.ixo.bonds.v1beta1.QueryAvailableReserveResponse getDefaultInstanceForType() {
      return com.ixo.bonds.v1beta1.QueryAvailableReserveResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.ixo.bonds.v1beta1.QueryAvailableReserveResponse build() {
      com.ixo.bonds.v1beta1.QueryAvailableReserveResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ixo.bonds.v1beta1.QueryAvailableReserveResponse buildPartial() {
      com.ixo.bonds.v1beta1.QueryAvailableReserveResponse result = new com.ixo.bonds.v1beta1.QueryAvailableReserveResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.ixo.bonds.v1beta1.QueryAvailableReserveResponse result) {
      if (availableReserveBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          availableReserve_ = java.util.Collections.unmodifiableList(availableReserve_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.availableReserve_ = availableReserve_;
      } else {
        result.availableReserve_ = availableReserveBuilder_.build();
      }
    }

    private void buildPartial0(com.ixo.bonds.v1beta1.QueryAvailableReserveResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ixo.bonds.v1beta1.QueryAvailableReserveResponse) {
        return mergeFrom((com.ixo.bonds.v1beta1.QueryAvailableReserveResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ixo.bonds.v1beta1.QueryAvailableReserveResponse other) {
      if (other == com.ixo.bonds.v1beta1.QueryAvailableReserveResponse.getDefaultInstance()) return this;
      if (availableReserveBuilder_ == null) {
        if (!other.availableReserve_.isEmpty()) {
          if (availableReserve_.isEmpty()) {
            availableReserve_ = other.availableReserve_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAvailableReserveIsMutable();
            availableReserve_.addAll(other.availableReserve_);
          }
          onChanged();
        }
      } else {
        if (!other.availableReserve_.isEmpty()) {
          if (availableReserveBuilder_.isEmpty()) {
            availableReserveBuilder_.dispose();
            availableReserveBuilder_ = null;
            availableReserve_ = other.availableReserve_;
            bitField0_ = (bitField0_ & ~0x00000001);
            availableReserveBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAvailableReserveFieldBuilder() : null;
          } else {
            availableReserveBuilder_.addAllMessages(other.availableReserve_);
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
              com.cosmos.base.v1beta1.Coin m =
                  input.readMessage(
                      com.cosmos.base.v1beta1.Coin.parser(),
                      extensionRegistry);
              if (availableReserveBuilder_ == null) {
                ensureAvailableReserveIsMutable();
                availableReserve_.add(m);
              } else {
                availableReserveBuilder_.addMessage(m);
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

    private java.util.List<com.cosmos.base.v1beta1.Coin> availableReserve_ =
      java.util.Collections.emptyList();
    private void ensureAvailableReserveIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        availableReserve_ = new java.util.ArrayList<com.cosmos.base.v1beta1.Coin>(availableReserve_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> availableReserveBuilder_;

    /**
     * <code>repeated .cosmos.base.v1beta1.Coin available_reserve = 1 [json_name = "availableReserve", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"available_reserve&#92;""];</code>
     */
    public java.util.List<com.cosmos.base.v1beta1.Coin> getAvailableReserveList() {
      if (availableReserveBuilder_ == null) {
        return java.util.Collections.unmodifiableList(availableReserve_);
      } else {
        return availableReserveBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin available_reserve = 1 [json_name = "availableReserve", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"available_reserve&#92;""];</code>
     */
    public int getAvailableReserveCount() {
      if (availableReserveBuilder_ == null) {
        return availableReserve_.size();
      } else {
        return availableReserveBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin available_reserve = 1 [json_name = "availableReserve", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"available_reserve&#92;""];</code>
     */
    public com.cosmos.base.v1beta1.Coin getAvailableReserve(int index) {
      if (availableReserveBuilder_ == null) {
        return availableReserve_.get(index);
      } else {
        return availableReserveBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin available_reserve = 1 [json_name = "availableReserve", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"available_reserve&#92;""];</code>
     */
    public Builder setAvailableReserve(
        int index, com.cosmos.base.v1beta1.Coin value) {
      if (availableReserveBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAvailableReserveIsMutable();
        availableReserve_.set(index, value);
        onChanged();
      } else {
        availableReserveBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin available_reserve = 1 [json_name = "availableReserve", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"available_reserve&#92;""];</code>
     */
    public Builder setAvailableReserve(
        int index, com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (availableReserveBuilder_ == null) {
        ensureAvailableReserveIsMutable();
        availableReserve_.set(index, builderForValue.build());
        onChanged();
      } else {
        availableReserveBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin available_reserve = 1 [json_name = "availableReserve", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"available_reserve&#92;""];</code>
     */
    public Builder addAvailableReserve(com.cosmos.base.v1beta1.Coin value) {
      if (availableReserveBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAvailableReserveIsMutable();
        availableReserve_.add(value);
        onChanged();
      } else {
        availableReserveBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin available_reserve = 1 [json_name = "availableReserve", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"available_reserve&#92;""];</code>
     */
    public Builder addAvailableReserve(
        int index, com.cosmos.base.v1beta1.Coin value) {
      if (availableReserveBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAvailableReserveIsMutable();
        availableReserve_.add(index, value);
        onChanged();
      } else {
        availableReserveBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin available_reserve = 1 [json_name = "availableReserve", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"available_reserve&#92;""];</code>
     */
    public Builder addAvailableReserve(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (availableReserveBuilder_ == null) {
        ensureAvailableReserveIsMutable();
        availableReserve_.add(builderForValue.build());
        onChanged();
      } else {
        availableReserveBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin available_reserve = 1 [json_name = "availableReserve", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"available_reserve&#92;""];</code>
     */
    public Builder addAvailableReserve(
        int index, com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (availableReserveBuilder_ == null) {
        ensureAvailableReserveIsMutable();
        availableReserve_.add(index, builderForValue.build());
        onChanged();
      } else {
        availableReserveBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin available_reserve = 1 [json_name = "availableReserve", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"available_reserve&#92;""];</code>
     */
    public Builder addAllAvailableReserve(
        java.lang.Iterable<? extends com.cosmos.base.v1beta1.Coin> values) {
      if (availableReserveBuilder_ == null) {
        ensureAvailableReserveIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, availableReserve_);
        onChanged();
      } else {
        availableReserveBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin available_reserve = 1 [json_name = "availableReserve", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"available_reserve&#92;""];</code>
     */
    public Builder clearAvailableReserve() {
      if (availableReserveBuilder_ == null) {
        availableReserve_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        availableReserveBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin available_reserve = 1 [json_name = "availableReserve", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"available_reserve&#92;""];</code>
     */
    public Builder removeAvailableReserve(int index) {
      if (availableReserveBuilder_ == null) {
        ensureAvailableReserveIsMutable();
        availableReserve_.remove(index);
        onChanged();
      } else {
        availableReserveBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin available_reserve = 1 [json_name = "availableReserve", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"available_reserve&#92;""];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getAvailableReserveBuilder(
        int index) {
      return getAvailableReserveFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin available_reserve = 1 [json_name = "availableReserve", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"available_reserve&#92;""];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getAvailableReserveOrBuilder(
        int index) {
      if (availableReserveBuilder_ == null) {
        return availableReserve_.get(index);  } else {
        return availableReserveBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin available_reserve = 1 [json_name = "availableReserve", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"available_reserve&#92;""];</code>
     */
    public java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
         getAvailableReserveOrBuilderList() {
      if (availableReserveBuilder_ != null) {
        return availableReserveBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(availableReserve_);
      }
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin available_reserve = 1 [json_name = "availableReserve", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"available_reserve&#92;""];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder addAvailableReserveBuilder() {
      return getAvailableReserveFieldBuilder().addBuilder(
          com.cosmos.base.v1beta1.Coin.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin available_reserve = 1 [json_name = "availableReserve", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"available_reserve&#92;""];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder addAvailableReserveBuilder(
        int index) {
      return getAvailableReserveFieldBuilder().addBuilder(
          index, com.cosmos.base.v1beta1.Coin.getDefaultInstance());
    }
    /**
     * <code>repeated .cosmos.base.v1beta1.Coin available_reserve = 1 [json_name = "availableReserve", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"available_reserve&#92;""];</code>
     */
    public java.util.List<com.cosmos.base.v1beta1.Coin.Builder> 
         getAvailableReserveBuilderList() {
      return getAvailableReserveFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getAvailableReserveFieldBuilder() {
      if (availableReserveBuilder_ == null) {
        availableReserveBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                availableReserve_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        availableReserve_ = null;
      }
      return availableReserveBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ixo.bonds.v1beta1.QueryAvailableReserveResponse)
  }

  // @@protoc_insertion_point(class_scope:ixo.bonds.v1beta1.QueryAvailableReserveResponse)
  private static final com.ixo.bonds.v1beta1.QueryAvailableReserveResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ixo.bonds.v1beta1.QueryAvailableReserveResponse();
  }

  public static com.ixo.bonds.v1beta1.QueryAvailableReserveResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryAvailableReserveResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryAvailableReserveResponse>() {
    @java.lang.Override
    public QueryAvailableReserveResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryAvailableReserveResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryAvailableReserveResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ixo.bonds.v1beta1.QueryAvailableReserveResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

