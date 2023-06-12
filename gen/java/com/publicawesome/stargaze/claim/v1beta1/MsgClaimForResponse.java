// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: stargaze/claim/v1beta1/tx.proto

package com.publicawesome.stargaze.claim.v1beta1;

/**
 * Protobuf type {@code publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse}
 */
public final class MsgClaimForResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse)
    MsgClaimForResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgClaimForResponse.newBuilder() to construct.
  private MsgClaimForResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgClaimForResponse() {
    address_ = "";
    claimedAmount_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgClaimForResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.publicawesome.stargaze.claim.v1beta1.TxProto.internal_static_publicawesome_stargaze_claim_v1beta1_MsgClaimForResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.publicawesome.stargaze.claim.v1beta1.TxProto.internal_static_publicawesome_stargaze_claim_v1beta1_MsgClaimForResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse.class, com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse.Builder.class);
  }

  public static final int ADDRESS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object address_ = "";
  /**
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The address.
   */
  @java.lang.Override
  public java.lang.String getAddress() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      address_ = s;
      return s;
    }
  }
  /**
   * <code>string address = 1 [json_name = "address"];</code>
   * @return The bytes for address.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getAddressBytes() {
    java.lang.Object ref = address_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      address_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLAIMED_AMOUNT_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.cosmos.base.v1beta1.Coin> claimedAmount_;
  /**
   * <pre>
   * total initial claimable amount for the user
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin claimed_amount = 2 [json_name = "claimedAmount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claimed_amount&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public java.util.List<com.cosmos.base.v1beta1.Coin> getClaimedAmountList() {
    return claimedAmount_;
  }
  /**
   * <pre>
   * total initial claimable amount for the user
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin claimed_amount = 2 [json_name = "claimedAmount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claimed_amount&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
      getClaimedAmountOrBuilderList() {
    return claimedAmount_;
  }
  /**
   * <pre>
   * total initial claimable amount for the user
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin claimed_amount = 2 [json_name = "claimedAmount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claimed_amount&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public int getClaimedAmountCount() {
    return claimedAmount_.size();
  }
  /**
   * <pre>
   * total initial claimable amount for the user
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin claimed_amount = 2 [json_name = "claimedAmount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claimed_amount&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getClaimedAmount(int index) {
    return claimedAmount_.get(index);
  }
  /**
   * <pre>
   * total initial claimable amount for the user
   * </pre>
   *
   * <code>repeated .cosmos.base.v1beta1.Coin claimed_amount = 2 [json_name = "claimedAmount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claimed_amount&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getClaimedAmountOrBuilder(
      int index) {
    return claimedAmount_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, address_);
    }
    for (int i = 0; i < claimedAmount_.size(); i++) {
      output.writeMessage(2, claimedAmount_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(address_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, address_);
    }
    for (int i = 0; i < claimedAmount_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, claimedAmount_.get(i));
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
    if (!(obj instanceof com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse)) {
      return super.equals(obj);
    }
    com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse other = (com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse) obj;

    if (!getAddress()
        .equals(other.getAddress())) return false;
    if (!getClaimedAmountList()
        .equals(other.getClaimedAmountList())) return false;
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
    hash = (37 * hash) + ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getAddress().hashCode();
    if (getClaimedAmountCount() > 0) {
      hash = (37 * hash) + CLAIMED_AMOUNT_FIELD_NUMBER;
      hash = (53 * hash) + getClaimedAmountList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse parseFrom(
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
  public static Builder newBuilder(com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse prototype) {
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
   * Protobuf type {@code publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse)
      com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.publicawesome.stargaze.claim.v1beta1.TxProto.internal_static_publicawesome_stargaze_claim_v1beta1_MsgClaimForResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.publicawesome.stargaze.claim.v1beta1.TxProto.internal_static_publicawesome_stargaze_claim_v1beta1_MsgClaimForResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse.class, com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse.Builder.class);
    }

    // Construct using com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse.newBuilder()
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
      address_ = "";
      if (claimedAmountBuilder_ == null) {
        claimedAmount_ = java.util.Collections.emptyList();
      } else {
        claimedAmount_ = null;
        claimedAmountBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.publicawesome.stargaze.claim.v1beta1.TxProto.internal_static_publicawesome_stargaze_claim_v1beta1_MsgClaimForResponse_descriptor;
    }

    @java.lang.Override
    public com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse getDefaultInstanceForType() {
      return com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse build() {
      com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse buildPartial() {
      com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse result = new com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse result) {
      if (claimedAmountBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          claimedAmount_ = java.util.Collections.unmodifiableList(claimedAmount_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.claimedAmount_ = claimedAmount_;
      } else {
        result.claimedAmount_ = claimedAmountBuilder_.build();
      }
    }

    private void buildPartial0(com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.address_ = address_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse) {
        return mergeFrom((com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse other) {
      if (other == com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse.getDefaultInstance()) return this;
      if (!other.getAddress().isEmpty()) {
        address_ = other.address_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (claimedAmountBuilder_ == null) {
        if (!other.claimedAmount_.isEmpty()) {
          if (claimedAmount_.isEmpty()) {
            claimedAmount_ = other.claimedAmount_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureClaimedAmountIsMutable();
            claimedAmount_.addAll(other.claimedAmount_);
          }
          onChanged();
        }
      } else {
        if (!other.claimedAmount_.isEmpty()) {
          if (claimedAmountBuilder_.isEmpty()) {
            claimedAmountBuilder_.dispose();
            claimedAmountBuilder_ = null;
            claimedAmount_ = other.claimedAmount_;
            bitField0_ = (bitField0_ & ~0x00000002);
            claimedAmountBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getClaimedAmountFieldBuilder() : null;
          } else {
            claimedAmountBuilder_.addAllMessages(other.claimedAmount_);
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
              address_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.cosmos.base.v1beta1.Coin m =
                  input.readMessage(
                      com.cosmos.base.v1beta1.Coin.parser(),
                      extensionRegistry);
              if (claimedAmountBuilder_ == null) {
                ensureClaimedAmountIsMutable();
                claimedAmount_.add(m);
              } else {
                claimedAmountBuilder_.addMessage(m);
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

    private java.lang.Object address_ = "";
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @return The address.
     */
    public java.lang.String getAddress() {
      java.lang.Object ref = address_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        address_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @return The bytes for address.
     */
    public com.google.protobuf.ByteString
        getAddressBytes() {
      java.lang.Object ref = address_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        address_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @param value The address to set.
     * @return This builder for chaining.
     */
    public Builder setAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      address_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @return This builder for chaining.
     */
    public Builder clearAddress() {
      address_ = getDefaultInstance().getAddress();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string address = 1 [json_name = "address"];</code>
     * @param value The bytes for address to set.
     * @return This builder for chaining.
     */
    public Builder setAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      address_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.util.List<com.cosmos.base.v1beta1.Coin> claimedAmount_ =
      java.util.Collections.emptyList();
    private void ensureClaimedAmountIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        claimedAmount_ = new java.util.ArrayList<com.cosmos.base.v1beta1.Coin>(claimedAmount_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> claimedAmountBuilder_;

    /**
     * <pre>
     * total initial claimable amount for the user
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin claimed_amount = 2 [json_name = "claimedAmount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claimed_amount&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public java.util.List<com.cosmos.base.v1beta1.Coin> getClaimedAmountList() {
      if (claimedAmountBuilder_ == null) {
        return java.util.Collections.unmodifiableList(claimedAmount_);
      } else {
        return claimedAmountBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * total initial claimable amount for the user
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin claimed_amount = 2 [json_name = "claimedAmount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claimed_amount&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public int getClaimedAmountCount() {
      if (claimedAmountBuilder_ == null) {
        return claimedAmount_.size();
      } else {
        return claimedAmountBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * total initial claimable amount for the user
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin claimed_amount = 2 [json_name = "claimedAmount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claimed_amount&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin getClaimedAmount(int index) {
      if (claimedAmountBuilder_ == null) {
        return claimedAmount_.get(index);
      } else {
        return claimedAmountBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * total initial claimable amount for the user
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin claimed_amount = 2 [json_name = "claimedAmount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claimed_amount&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder setClaimedAmount(
        int index, com.cosmos.base.v1beta1.Coin value) {
      if (claimedAmountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClaimedAmountIsMutable();
        claimedAmount_.set(index, value);
        onChanged();
      } else {
        claimedAmountBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * total initial claimable amount for the user
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin claimed_amount = 2 [json_name = "claimedAmount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claimed_amount&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder setClaimedAmount(
        int index, com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (claimedAmountBuilder_ == null) {
        ensureClaimedAmountIsMutable();
        claimedAmount_.set(index, builderForValue.build());
        onChanged();
      } else {
        claimedAmountBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * total initial claimable amount for the user
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin claimed_amount = 2 [json_name = "claimedAmount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claimed_amount&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addClaimedAmount(com.cosmos.base.v1beta1.Coin value) {
      if (claimedAmountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClaimedAmountIsMutable();
        claimedAmount_.add(value);
        onChanged();
      } else {
        claimedAmountBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * total initial claimable amount for the user
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin claimed_amount = 2 [json_name = "claimedAmount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claimed_amount&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addClaimedAmount(
        int index, com.cosmos.base.v1beta1.Coin value) {
      if (claimedAmountBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureClaimedAmountIsMutable();
        claimedAmount_.add(index, value);
        onChanged();
      } else {
        claimedAmountBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * total initial claimable amount for the user
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin claimed_amount = 2 [json_name = "claimedAmount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claimed_amount&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addClaimedAmount(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (claimedAmountBuilder_ == null) {
        ensureClaimedAmountIsMutable();
        claimedAmount_.add(builderForValue.build());
        onChanged();
      } else {
        claimedAmountBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * total initial claimable amount for the user
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin claimed_amount = 2 [json_name = "claimedAmount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claimed_amount&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addClaimedAmount(
        int index, com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (claimedAmountBuilder_ == null) {
        ensureClaimedAmountIsMutable();
        claimedAmount_.add(index, builderForValue.build());
        onChanged();
      } else {
        claimedAmountBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * total initial claimable amount for the user
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin claimed_amount = 2 [json_name = "claimedAmount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claimed_amount&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder addAllClaimedAmount(
        java.lang.Iterable<? extends com.cosmos.base.v1beta1.Coin> values) {
      if (claimedAmountBuilder_ == null) {
        ensureClaimedAmountIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, claimedAmount_);
        onChanged();
      } else {
        claimedAmountBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * total initial claimable amount for the user
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin claimed_amount = 2 [json_name = "claimedAmount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claimed_amount&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder clearClaimedAmount() {
      if (claimedAmountBuilder_ == null) {
        claimedAmount_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        claimedAmountBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * total initial claimable amount for the user
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin claimed_amount = 2 [json_name = "claimedAmount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claimed_amount&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public Builder removeClaimedAmount(int index) {
      if (claimedAmountBuilder_ == null) {
        ensureClaimedAmountIsMutable();
        claimedAmount_.remove(index);
        onChanged();
      } else {
        claimedAmountBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * total initial claimable amount for the user
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin claimed_amount = 2 [json_name = "claimedAmount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claimed_amount&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getClaimedAmountBuilder(
        int index) {
      return getClaimedAmountFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * total initial claimable amount for the user
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin claimed_amount = 2 [json_name = "claimedAmount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claimed_amount&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getClaimedAmountOrBuilder(
        int index) {
      if (claimedAmountBuilder_ == null) {
        return claimedAmount_.get(index);  } else {
        return claimedAmountBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * total initial claimable amount for the user
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin claimed_amount = 2 [json_name = "claimedAmount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claimed_amount&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public java.util.List<? extends com.cosmos.base.v1beta1.CoinOrBuilder> 
         getClaimedAmountOrBuilderList() {
      if (claimedAmountBuilder_ != null) {
        return claimedAmountBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(claimedAmount_);
      }
    }
    /**
     * <pre>
     * total initial claimable amount for the user
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin claimed_amount = 2 [json_name = "claimedAmount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claimed_amount&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder addClaimedAmountBuilder() {
      return getClaimedAmountFieldBuilder().addBuilder(
          com.cosmos.base.v1beta1.Coin.getDefaultInstance());
    }
    /**
     * <pre>
     * total initial claimable amount for the user
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin claimed_amount = 2 [json_name = "claimedAmount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claimed_amount&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder addClaimedAmountBuilder(
        int index) {
      return getClaimedAmountFieldBuilder().addBuilder(
          index, com.cosmos.base.v1beta1.Coin.getDefaultInstance());
    }
    /**
     * <pre>
     * total initial claimable amount for the user
     * </pre>
     *
     * <code>repeated .cosmos.base.v1beta1.Coin claimed_amount = 2 [json_name = "claimedAmount", (.gogoproto.nullable) = false, (.gogoproto.moretags) = "yaml:&#92;"claimed_amount&#92;"", (.gogoproto.castrepeated) = "github.com/cosmos/cosmos-sdk/types.Coins"];</code>
     */
    public java.util.List<com.cosmos.base.v1beta1.Coin.Builder> 
         getClaimedAmountBuilderList() {
      return getClaimedAmountFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getClaimedAmountFieldBuilder() {
      if (claimedAmountBuilder_ == null) {
        claimedAmountBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                claimedAmount_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        claimedAmount_ = null;
      }
      return claimedAmountBuilder_;
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


    // @@protoc_insertion_point(builder_scope:publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse)
  }

  // @@protoc_insertion_point(class_scope:publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse)
  private static final com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse();
  }

  public static com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgClaimForResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgClaimForResponse>() {
    @java.lang.Override
    public MsgClaimForResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgClaimForResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgClaimForResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.publicawesome.stargaze.claim.v1beta1.MsgClaimForResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

