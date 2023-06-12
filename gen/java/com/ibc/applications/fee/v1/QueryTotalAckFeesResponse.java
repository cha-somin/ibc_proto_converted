// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/applications/fee/v1/query.proto

package com.ibc.applications.fee.v1;

/**
 * <pre>
 * QueryTotalAckFeesResponse defines the response type for the TotalAckFees rpc
 * </pre>
 *
 * Protobuf type {@code ibc.applications.fee.v1.QueryTotalAckFeesResponse}
 */
public final class QueryTotalAckFeesResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.applications.fee.v1.QueryTotalAckFeesResponse)
    QueryTotalAckFeesResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use QueryTotalAckFeesResponse.newBuilder() to construct.
  private QueryTotalAckFeesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private QueryTotalAckFeesResponse() {
    ackFees_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new QueryTotalAckFeesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ibc.applications.fee.v1.QueryProto.internal_static_ibc_applications_fee_v1_QueryTotalAckFeesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ibc.applications.fee.v1.QueryProto.internal_static_ibc_applications_fee_v1_QueryTotalAckFeesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ibc.applications.fee.v1.QueryTotalAckFeesResponse.class, com.ibc.applications.fee.v1.QueryTotalAckFeesResponse.Builder.class);
  }

  public static final int ACK_FEES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.cosmos.base.v1beta1.Coin> ackFees_;
  /**
   * <pre>
   * the total packet acknowledgement fees
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin ack_fees = 1 [json_name = "ackFees", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public java.util.List<com.cosmos.base.v1beta1.Coin> getAckFeesList() {
    return ackFees_;
  }
  /**
   * <pre>
   * the total packet acknowledgement fees
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin ack_fees = 1 [json_name = "ackFees", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getAckFeesOrBuilderList() {
    return ackFees_;
  }
  /**
   * <pre>
   * the total packet acknowledgement fees
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin ack_fees = 1 [json_name = "ackFees", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public int getAckFeesCount() {
    return ackFees_.size();
  }
  /**
   * <pre>
   * the total packet acknowledgement fees
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin ack_fees = 1 [json_name = "ackFees", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getAckFees(int index) {
    return ackFees_.get(index);
  }
  /**
   * <pre>
   * the total packet acknowledgement fees
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin ack_fees = 1 [json_name = "ackFees", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getAckFeesOrBuilder(
      int index) {
    return ackFees_.get(index);
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
    for (int i = 0; i < ackFees_.size(); i++) {
      output.writeMessage(1, ackFees_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < ackFees_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, ackFees_.get(i));
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
    if (!(obj instanceof com.ibc.applications.fee.v1.QueryTotalAckFeesResponse)) {
      return super.equals(obj);
    }
    com.ibc.applications.fee.v1.QueryTotalAckFeesResponse other = (com.ibc.applications.fee.v1.QueryTotalAckFeesResponse) obj;

    if (!getAckFeesList()
        .equals(other.getAckFeesList())) return false;
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
    if (getAckFeesCount() > 0) {
      hash = (37 * hash) + ACK_FEES_FIELD_NUMBER;
      hash = (53 * hash) + getAckFeesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ibc.applications.fee.v1.QueryTotalAckFeesResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.applications.fee.v1.QueryTotalAckFeesResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.applications.fee.v1.QueryTotalAckFeesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.applications.fee.v1.QueryTotalAckFeesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.applications.fee.v1.QueryTotalAckFeesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.applications.fee.v1.QueryTotalAckFeesResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.applications.fee.v1.QueryTotalAckFeesResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.applications.fee.v1.QueryTotalAckFeesResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.ibc.applications.fee.v1.QueryTotalAckFeesResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.ibc.applications.fee.v1.QueryTotalAckFeesResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.applications.fee.v1.QueryTotalAckFeesResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.applications.fee.v1.QueryTotalAckFeesResponse parseFrom(
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
  public static Builder newBuilder(com.ibc.applications.fee.v1.QueryTotalAckFeesResponse prototype) {
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
   * QueryTotalAckFeesResponse defines the response type for the TotalAckFees rpc
   * </pre>
   *
   * Protobuf type {@code ibc.applications.fee.v1.QueryTotalAckFeesResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.applications.fee.v1.QueryTotalAckFeesResponse)
      com.ibc.applications.fee.v1.QueryTotalAckFeesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ibc.applications.fee.v1.QueryProto.internal_static_ibc_applications_fee_v1_QueryTotalAckFeesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibc.applications.fee.v1.QueryProto.internal_static_ibc_applications_fee_v1_QueryTotalAckFeesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibc.applications.fee.v1.QueryTotalAckFeesResponse.class, com.ibc.applications.fee.v1.QueryTotalAckFeesResponse.Builder.class);
    }

    // Construct using com.ibc.applications.fee.v1.QueryTotalAckFeesResponse.newBuilder()
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
      if (ackFeesBuilder_ == null) {
        ackFees_ = java.util.Collections.emptyList();
      } else {
        ackFees_ = null;
        ackFeesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ibc.applications.fee.v1.QueryProto.internal_static_ibc_applications_fee_v1_QueryTotalAckFeesResponse_descriptor;
    }

    @java.lang.Override
    public com.ibc.applications.fee.v1.QueryTotalAckFeesResponse getDefaultInstanceForType() {
      return com.ibc.applications.fee.v1.QueryTotalAckFeesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.ibc.applications.fee.v1.QueryTotalAckFeesResponse build() {
      com.ibc.applications.fee.v1.QueryTotalAckFeesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ibc.applications.fee.v1.QueryTotalAckFeesResponse buildPartial() {
      com.ibc.applications.fee.v1.QueryTotalAckFeesResponse result = new com.ibc.applications.fee.v1.QueryTotalAckFeesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.ibc.applications.fee.v1.QueryTotalAckFeesResponse result) {
      if (ackFeesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          ackFees_ = java.util.Collections.unmodifiableList(ackFees_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.ackFees_ = ackFees_;
      } else {
        result.ackFees_ = ackFeesBuilder_.build();
      }
    }

    private void buildPartial0(com.ibc.applications.fee.v1.QueryTotalAckFeesResponse result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ibc.applications.fee.v1.QueryTotalAckFeesResponse) {
        return mergeFrom((com.ibc.applications.fee.v1.QueryTotalAckFeesResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ibc.applications.fee.v1.QueryTotalAckFeesResponse other) {
      if (other == com.ibc.applications.fee.v1.QueryTotalAckFeesResponse.getDefaultInstance()) return this;
      if (ackFeesBuilder_ == null) {
        if (!other.ackFees_.isEmpty()) {
          if (ackFees_.isEmpty()) {
            ackFees_ = other.ackFees_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureAckFeesIsMutable();
            ackFees_.addAll(other.ackFees_);
          }
          onChanged();
        }
      } else {
        if (!other.ackFees_.isEmpty()) {
          if (ackFeesBuilder_.isEmpty()) {
            ackFeesBuilder_.dispose();
            ackFeesBuilder_ = null;
            ackFees_ = other.ackFees_;
            bitField0_ = (bitField0_ & ~0x00000001);
            ackFeesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAckFeesFieldBuilder() : null;
          } else {
            ackFeesBuilder_.addAllMessages(other.ackFees_);
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
              if (ackFeesBuilder_ == null) {
                ensureAckFeesIsMutable();
                ackFees_.add(m);
              } else {
                ackFeesBuilder_.addMessage(m);
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

    private java.util.List<com.cosmos.base.v1beta1.Coin> ackFees_ =
      java.util.Collections.emptyList();
    private void ensureAckFeesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        ackFees_ = new java.util.ArrayList<com.cosmos.base.v1beta1.Coin>(ackFees_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> ackFeesBuilder_;

    /**
     * <pre>
     * the total packet acknowledgement fees
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin ack_fees = 1 [json_name = "ackFees", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public java.util.List<com.cosmos.base.v1beta1.Coin> getAckFeesList() {
      if (ackFeesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(ackFees_);
      } else {
        return ackFeesBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * the total packet acknowledgement fees
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin ack_fees = 1 [json_name = "ackFees", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public int getAckFeesCount() {
      if (ackFeesBuilder_ == null) {
        return ackFees_.size();
      } else {
        return ackFeesBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * the total packet acknowledgement fees
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin ack_fees = 1 [json_name = "ackFees", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin getAckFees(int index) {
      if (ackFeesBuilder_ == null) {
        return ackFees_.get(index);
      } else {
        return ackFeesBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * the total packet acknowledgement fees
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin ack_fees = 1 [json_name = "ackFees", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder setAckFees(
        int index, com.cosmos.base.v1beta1.Coin value) {
      if (ackFeesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAckFeesIsMutable();
        ackFees_.set(index, value);
        onChanged();
      } else {
        ackFeesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * the total packet acknowledgement fees
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin ack_fees = 1 [json_name = "ackFees", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder setAckFees(
        int index, com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (ackFeesBuilder_ == null) {
        ensureAckFeesIsMutable();
        ackFees_.set(index, builderForValue.build());
        onChanged();
      } else {
        ackFeesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * the total packet acknowledgement fees
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin ack_fees = 1 [json_name = "ackFees", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addAckFees(com.cosmos.base.v1beta1.Coin value) {
      if (ackFeesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAckFeesIsMutable();
        ackFees_.add(value);
        onChanged();
      } else {
        ackFeesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * the total packet acknowledgement fees
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin ack_fees = 1 [json_name = "ackFees", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addAckFees(
        int index, com.cosmos.base.v1beta1.Coin value) {
      if (ackFeesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAckFeesIsMutable();
        ackFees_.add(index, value);
        onChanged();
      } else {
        ackFeesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * the total packet acknowledgement fees
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin ack_fees = 1 [json_name = "ackFees", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addAckFees(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (ackFeesBuilder_ == null) {
        ensureAckFeesIsMutable();
        ackFees_.add(builderForValue.build());
        onChanged();
      } else {
        ackFeesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * the total packet acknowledgement fees
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin ack_fees = 1 [json_name = "ackFees", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addAckFees(
        int index, com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (ackFeesBuilder_ == null) {
        ensureAckFeesIsMutable();
        ackFees_.add(index, builderForValue.build());
        onChanged();
      } else {
        ackFeesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * the total packet acknowledgement fees
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin ack_fees = 1 [json_name = "ackFees", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addAllAckFees(
        java.lang.Iterable<? extends com.cosmos.base.v1beta1.Coin> values) {
      if (ackFeesBuilder_ == null) {
        ensureAckFeesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, ackFees_);
        onChanged();
      } else {
        ackFeesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * the total packet acknowledgement fees
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin ack_fees = 1 [json_name = "ackFees", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder clearAckFees() {
      if (ackFeesBuilder_ == null) {
        ackFees_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        ackFeesBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * the total packet acknowledgement fees
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin ack_fees = 1 [json_name = "ackFees", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder removeAckFees(int index) {
      if (ackFeesBuilder_ == null) {
        ensureAckFeesIsMutable();
        ackFees_.remove(index);
        onChanged();
      } else {
        ackFeesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * the total packet acknowledgement fees
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin ack_fees = 1 [json_name = "ackFees", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getAckFeesBuilder(
        int index) {
      return getAckFeesFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * the total packet acknowledgement fees
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin ack_fees = 1 [json_name = "ackFees", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getAckFeesOrBuilder(
        int index) {
      if (ackFeesBuilder_ == null) {
        return ackFees_.get(index);  } else {
        return ackFeesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * the total packet acknowledgement fees
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin ack_fees = 1 [json_name = "ackFees", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
         getAckFeesOrBuilderList() {
      if (ackFeesBuilder_ != null) {
        return ackFeesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(ackFees_);
      }
    }
    /**
     * <pre>
     * the total packet acknowledgement fees
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin ack_fees = 1 [json_name = "ackFees", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder addAckFeesBuilder() {
      return getAckFeesFieldBuilder().addBuilder(
          com.cosmos.base.v1beta1.Coin.getDefaultInstance());
    }
    /**
     * <pre>
     * the total packet acknowledgement fees
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin ack_fees = 1 [json_name = "ackFees", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder addAckFeesBuilder(
        int index) {
      return getAckFeesFieldBuilder().addBuilder(
          index, com.cosmos.base.v1beta1.Coin.getDefaultInstance());
    }
    /**
     * <pre>
     * the total packet acknowledgement fees
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin ack_fees = 1 [json_name = "ackFees", (.gogoproto.nullable) = false, (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public java.util.List<com.cosmos.base.v1beta1.Coin.Builder> 
         getAckFeesBuilderList() {
      return getAckFeesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getAckFeesFieldBuilder() {
      if (ackFeesBuilder_ == null) {
        ackFeesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                ackFees_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        ackFees_ = null;
      }
      return ackFeesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:ibc.applications.fee.v1.QueryTotalAckFeesResponse)
  }

  // @@protoc_insertion_point(class_scope:ibc.applications.fee.v1.QueryTotalAckFeesResponse)
  private static final com.ibc.applications.fee.v1.QueryTotalAckFeesResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ibc.applications.fee.v1.QueryTotalAckFeesResponse();
  }

  public static com.ibc.applications.fee.v1.QueryTotalAckFeesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<QueryTotalAckFeesResponse>
      PARSER = new com.google.protobuf.AbstractParser<QueryTotalAckFeesResponse>() {
    @java.lang.Override
    public QueryTotalAckFeesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<QueryTotalAckFeesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<QueryTotalAckFeesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ibc.applications.fee.v1.QueryTotalAckFeesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

