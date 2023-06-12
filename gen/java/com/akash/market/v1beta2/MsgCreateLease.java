// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/market/v1beta2/lease.proto

package com.akash.market.v1beta2;

/**
 * <pre>
 * MsgCreateLease is sent to create a lease
 * </pre>
 *
 * Protobuf type {@code akash.market.v1beta2.MsgCreateLease}
 */
public final class MsgCreateLease extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:akash.market.v1beta2.MsgCreateLease)
    MsgCreateLeaseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgCreateLease.newBuilder() to construct.
  private MsgCreateLease(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgCreateLease() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgCreateLease();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.akash.market.v1beta2.LeaseProto.internal_static_akash_market_v1beta2_MsgCreateLease_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.akash.market.v1beta2.LeaseProto.internal_static_akash_market_v1beta2_MsgCreateLease_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.akash.market.v1beta2.MsgCreateLease.class, com.akash.market.v1beta2.MsgCreateLease.Builder.class);
  }

  public static final int BID_ID_FIELD_NUMBER = 1;
  private com.akash.market.v1beta2.BidID bidId_;
  /**
   * <code>.akash.market.v1beta2.BidID bid_id = 1 [json_name = "bidId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BidID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
   * @return Whether the bidId field is set.
   */
  @java.lang.Override
  public boolean hasBidId() {
    return bidId_ != null;
  }
  /**
   * <code>.akash.market.v1beta2.BidID bid_id = 1 [json_name = "bidId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BidID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
   * @return The bidId.
   */
  @java.lang.Override
  public com.akash.market.v1beta2.BidID getBidId() {
    return bidId_ == null ? com.akash.market.v1beta2.BidID.getDefaultInstance() : bidId_;
  }
  /**
   * <code>.akash.market.v1beta2.BidID bid_id = 1 [json_name = "bidId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BidID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
   */
  @java.lang.Override
  public com.akash.market.v1beta2.BidIDOrBuilder getBidIdOrBuilder() {
    return bidId_ == null ? com.akash.market.v1beta2.BidID.getDefaultInstance() : bidId_;
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
    if (bidId_ != null) {
      output.writeMessage(1, getBidId());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (bidId_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getBidId());
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
    if (!(obj instanceof com.akash.market.v1beta2.MsgCreateLease)) {
      return super.equals(obj);
    }
    com.akash.market.v1beta2.MsgCreateLease other = (com.akash.market.v1beta2.MsgCreateLease) obj;

    if (hasBidId() != other.hasBidId()) return false;
    if (hasBidId()) {
      if (!getBidId()
          .equals(other.getBidId())) return false;
    }
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
    if (hasBidId()) {
      hash = (37 * hash) + BID_ID_FIELD_NUMBER;
      hash = (53 * hash) + getBidId().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.akash.market.v1beta2.MsgCreateLease parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.market.v1beta2.MsgCreateLease parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.market.v1beta2.MsgCreateLease parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.market.v1beta2.MsgCreateLease parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.market.v1beta2.MsgCreateLease parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.market.v1beta2.MsgCreateLease parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.market.v1beta2.MsgCreateLease parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.market.v1beta2.MsgCreateLease parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.akash.market.v1beta2.MsgCreateLease parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.akash.market.v1beta2.MsgCreateLease parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.akash.market.v1beta2.MsgCreateLease parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.market.v1beta2.MsgCreateLease parseFrom(
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
  public static Builder newBuilder(com.akash.market.v1beta2.MsgCreateLease prototype) {
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
   * MsgCreateLease is sent to create a lease
   * </pre>
   *
   * Protobuf type {@code akash.market.v1beta2.MsgCreateLease}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:akash.market.v1beta2.MsgCreateLease)
      com.akash.market.v1beta2.MsgCreateLeaseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akash.market.v1beta2.LeaseProto.internal_static_akash_market_v1beta2_MsgCreateLease_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akash.market.v1beta2.LeaseProto.internal_static_akash_market_v1beta2_MsgCreateLease_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akash.market.v1beta2.MsgCreateLease.class, com.akash.market.v1beta2.MsgCreateLease.Builder.class);
    }

    // Construct using com.akash.market.v1beta2.MsgCreateLease.newBuilder()
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
      bidId_ = null;
      if (bidIdBuilder_ != null) {
        bidIdBuilder_.dispose();
        bidIdBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.akash.market.v1beta2.LeaseProto.internal_static_akash_market_v1beta2_MsgCreateLease_descriptor;
    }

    @java.lang.Override
    public com.akash.market.v1beta2.MsgCreateLease getDefaultInstanceForType() {
      return com.akash.market.v1beta2.MsgCreateLease.getDefaultInstance();
    }

    @java.lang.Override
    public com.akash.market.v1beta2.MsgCreateLease build() {
      com.akash.market.v1beta2.MsgCreateLease result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.akash.market.v1beta2.MsgCreateLease buildPartial() {
      com.akash.market.v1beta2.MsgCreateLease result = new com.akash.market.v1beta2.MsgCreateLease(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.akash.market.v1beta2.MsgCreateLease result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.bidId_ = bidIdBuilder_ == null
            ? bidId_
            : bidIdBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.akash.market.v1beta2.MsgCreateLease) {
        return mergeFrom((com.akash.market.v1beta2.MsgCreateLease)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.akash.market.v1beta2.MsgCreateLease other) {
      if (other == com.akash.market.v1beta2.MsgCreateLease.getDefaultInstance()) return this;
      if (other.hasBidId()) {
        mergeBidId(other.getBidId());
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
                  getBidIdFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
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

    private com.akash.market.v1beta2.BidID bidId_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.akash.market.v1beta2.BidID, com.akash.market.v1beta2.BidID.Builder, com.akash.market.v1beta2.BidIDOrBuilder> bidIdBuilder_;
    /**
     * <code>.akash.market.v1beta2.BidID bid_id = 1 [json_name = "bidId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BidID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     * @return Whether the bidId field is set.
     */
    public boolean hasBidId() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.akash.market.v1beta2.BidID bid_id = 1 [json_name = "bidId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BidID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     * @return The bidId.
     */
    public com.akash.market.v1beta2.BidID getBidId() {
      if (bidIdBuilder_ == null) {
        return bidId_ == null ? com.akash.market.v1beta2.BidID.getDefaultInstance() : bidId_;
      } else {
        return bidIdBuilder_.getMessage();
      }
    }
    /**
     * <code>.akash.market.v1beta2.BidID bid_id = 1 [json_name = "bidId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BidID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     */
    public Builder setBidId(com.akash.market.v1beta2.BidID value) {
      if (bidIdBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        bidId_ = value;
      } else {
        bidIdBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.market.v1beta2.BidID bid_id = 1 [json_name = "bidId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BidID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     */
    public Builder setBidId(
        com.akash.market.v1beta2.BidID.Builder builderForValue) {
      if (bidIdBuilder_ == null) {
        bidId_ = builderForValue.build();
      } else {
        bidIdBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.market.v1beta2.BidID bid_id = 1 [json_name = "bidId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BidID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     */
    public Builder mergeBidId(com.akash.market.v1beta2.BidID value) {
      if (bidIdBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          bidId_ != null &&
          bidId_ != com.akash.market.v1beta2.BidID.getDefaultInstance()) {
          getBidIdBuilder().mergeFrom(value);
        } else {
          bidId_ = value;
        }
      } else {
        bidIdBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.market.v1beta2.BidID bid_id = 1 [json_name = "bidId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BidID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     */
    public Builder clearBidId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      bidId_ = null;
      if (bidIdBuilder_ != null) {
        bidIdBuilder_.dispose();
        bidIdBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.akash.market.v1beta2.BidID bid_id = 1 [json_name = "bidId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BidID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     */
    public com.akash.market.v1beta2.BidID.Builder getBidIdBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getBidIdFieldBuilder().getBuilder();
    }
    /**
     * <code>.akash.market.v1beta2.BidID bid_id = 1 [json_name = "bidId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BidID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     */
    public com.akash.market.v1beta2.BidIDOrBuilder getBidIdOrBuilder() {
      if (bidIdBuilder_ != null) {
        return bidIdBuilder_.getMessageOrBuilder();
      } else {
        return bidId_ == null ?
            com.akash.market.v1beta2.BidID.getDefaultInstance() : bidId_;
      }
    }
    /**
     * <code>.akash.market.v1beta2.BidID bid_id = 1 [json_name = "bidId", (.gogoproto.nullable) = false, (.gogoproto.customname) = "BidID", (.gogoproto.jsontag) = "id", (.gogoproto.moretags) = "yaml:&#92;"id&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.akash.market.v1beta2.BidID, com.akash.market.v1beta2.BidID.Builder, com.akash.market.v1beta2.BidIDOrBuilder> 
        getBidIdFieldBuilder() {
      if (bidIdBuilder_ == null) {
        bidIdBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.akash.market.v1beta2.BidID, com.akash.market.v1beta2.BidID.Builder, com.akash.market.v1beta2.BidIDOrBuilder>(
                getBidId(),
                getParentForChildren(),
                isClean());
        bidId_ = null;
      }
      return bidIdBuilder_;
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


    // @@protoc_insertion_point(builder_scope:akash.market.v1beta2.MsgCreateLease)
  }

  // @@protoc_insertion_point(class_scope:akash.market.v1beta2.MsgCreateLease)
  private static final com.akash.market.v1beta2.MsgCreateLease DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.akash.market.v1beta2.MsgCreateLease();
  }

  public static com.akash.market.v1beta2.MsgCreateLease getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgCreateLease>
      PARSER = new com.google.protobuf.AbstractParser<MsgCreateLease>() {
    @java.lang.Override
    public MsgCreateLease parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgCreateLease> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgCreateLease> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.akash.market.v1beta2.MsgCreateLease getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

