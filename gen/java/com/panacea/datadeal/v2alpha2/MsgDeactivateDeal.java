// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: panacea/datadeal/v2alpha2/tx.proto

package com.panacea.datadeal.v2alpha2;

/**
 * <pre>
 * MsgDeactivateDeal defines the Msg/DeactivateDeal request type.
 * </pre>
 *
 * Protobuf type {@code panacea.datadeal.v2alpha2.MsgDeactivateDeal}
 */
public final class MsgDeactivateDeal extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:panacea.datadeal.v2alpha2.MsgDeactivateDeal)
    MsgDeactivateDealOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgDeactivateDeal.newBuilder() to construct.
  private MsgDeactivateDeal(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgDeactivateDeal() {
    requesterAddress_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgDeactivateDeal();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.panacea.datadeal.v2alpha2.TxProto.internal_static_panacea_datadeal_v2alpha2_MsgDeactivateDeal_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.panacea.datadeal.v2alpha2.TxProto.internal_static_panacea_datadeal_v2alpha2_MsgDeactivateDeal_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.panacea.datadeal.v2alpha2.MsgDeactivateDeal.class, com.panacea.datadeal.v2alpha2.MsgDeactivateDeal.Builder.class);
  }

  public static final int DEAL_ID_FIELD_NUMBER = 1;
  private long dealId_ = 0L;
  /**
   * <code>uint64 deal_id = 1 [json_name = "dealId"];</code>
   * @return The dealId.
   */
  @java.lang.Override
  public long getDealId() {
    return dealId_;
  }

  public static final int REQUESTER_ADDRESS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object requesterAddress_ = "";
  /**
   * <code>string requester_address = 2 [json_name = "requesterAddress"];</code>
   * @return The requesterAddress.
   */
  @java.lang.Override
  public java.lang.String getRequesterAddress() {
    java.lang.Object ref = requesterAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      requesterAddress_ = s;
      return s;
    }
  }
  /**
   * <code>string requester_address = 2 [json_name = "requesterAddress"];</code>
   * @return The bytes for requesterAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getRequesterAddressBytes() {
    java.lang.Object ref = requesterAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      requesterAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (dealId_ != 0L) {
      output.writeUInt64(1, dealId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(requesterAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, requesterAddress_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (dealId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, dealId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(requesterAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, requesterAddress_);
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
    if (!(obj instanceof com.panacea.datadeal.v2alpha2.MsgDeactivateDeal)) {
      return super.equals(obj);
    }
    com.panacea.datadeal.v2alpha2.MsgDeactivateDeal other = (com.panacea.datadeal.v2alpha2.MsgDeactivateDeal) obj;

    if (getDealId()
        != other.getDealId()) return false;
    if (!getRequesterAddress()
        .equals(other.getRequesterAddress())) return false;
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
    hash = (37 * hash) + DEAL_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getDealId());
    hash = (37 * hash) + REQUESTER_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getRequesterAddress().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.panacea.datadeal.v2alpha2.MsgDeactivateDeal parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.panacea.datadeal.v2alpha2.MsgDeactivateDeal parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.panacea.datadeal.v2alpha2.MsgDeactivateDeal parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.panacea.datadeal.v2alpha2.MsgDeactivateDeal parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.panacea.datadeal.v2alpha2.MsgDeactivateDeal parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.panacea.datadeal.v2alpha2.MsgDeactivateDeal parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.panacea.datadeal.v2alpha2.MsgDeactivateDeal parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.panacea.datadeal.v2alpha2.MsgDeactivateDeal parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.panacea.datadeal.v2alpha2.MsgDeactivateDeal parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.panacea.datadeal.v2alpha2.MsgDeactivateDeal parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.panacea.datadeal.v2alpha2.MsgDeactivateDeal parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.panacea.datadeal.v2alpha2.MsgDeactivateDeal parseFrom(
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
  public static Builder newBuilder(com.panacea.datadeal.v2alpha2.MsgDeactivateDeal prototype) {
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
   * MsgDeactivateDeal defines the Msg/DeactivateDeal request type.
   * </pre>
   *
   * Protobuf type {@code panacea.datadeal.v2alpha2.MsgDeactivateDeal}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:panacea.datadeal.v2alpha2.MsgDeactivateDeal)
      com.panacea.datadeal.v2alpha2.MsgDeactivateDealOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.panacea.datadeal.v2alpha2.TxProto.internal_static_panacea_datadeal_v2alpha2_MsgDeactivateDeal_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.panacea.datadeal.v2alpha2.TxProto.internal_static_panacea_datadeal_v2alpha2_MsgDeactivateDeal_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.panacea.datadeal.v2alpha2.MsgDeactivateDeal.class, com.panacea.datadeal.v2alpha2.MsgDeactivateDeal.Builder.class);
    }

    // Construct using com.panacea.datadeal.v2alpha2.MsgDeactivateDeal.newBuilder()
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
      dealId_ = 0L;
      requesterAddress_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.panacea.datadeal.v2alpha2.TxProto.internal_static_panacea_datadeal_v2alpha2_MsgDeactivateDeal_descriptor;
    }

    @java.lang.Override
    public com.panacea.datadeal.v2alpha2.MsgDeactivateDeal getDefaultInstanceForType() {
      return com.panacea.datadeal.v2alpha2.MsgDeactivateDeal.getDefaultInstance();
    }

    @java.lang.Override
    public com.panacea.datadeal.v2alpha2.MsgDeactivateDeal build() {
      com.panacea.datadeal.v2alpha2.MsgDeactivateDeal result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.panacea.datadeal.v2alpha2.MsgDeactivateDeal buildPartial() {
      com.panacea.datadeal.v2alpha2.MsgDeactivateDeal result = new com.panacea.datadeal.v2alpha2.MsgDeactivateDeal(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.panacea.datadeal.v2alpha2.MsgDeactivateDeal result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dealId_ = dealId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.requesterAddress_ = requesterAddress_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.panacea.datadeal.v2alpha2.MsgDeactivateDeal) {
        return mergeFrom((com.panacea.datadeal.v2alpha2.MsgDeactivateDeal)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.panacea.datadeal.v2alpha2.MsgDeactivateDeal other) {
      if (other == com.panacea.datadeal.v2alpha2.MsgDeactivateDeal.getDefaultInstance()) return this;
      if (other.getDealId() != 0L) {
        setDealId(other.getDealId());
      }
      if (!other.getRequesterAddress().isEmpty()) {
        requesterAddress_ = other.requesterAddress_;
        bitField0_ |= 0x00000002;
        onChanged();
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
            case 8: {
              dealId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
            case 18: {
              requesterAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
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

    private long dealId_ ;
    /**
     * <code>uint64 deal_id = 1 [json_name = "dealId"];</code>
     * @return The dealId.
     */
    @java.lang.Override
    public long getDealId() {
      return dealId_;
    }
    /**
     * <code>uint64 deal_id = 1 [json_name = "dealId"];</code>
     * @param value The dealId to set.
     * @return This builder for chaining.
     */
    public Builder setDealId(long value) {

      dealId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 deal_id = 1 [json_name = "dealId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDealId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      dealId_ = 0L;
      onChanged();
      return this;
    }

    private java.lang.Object requesterAddress_ = "";
    /**
     * <code>string requester_address = 2 [json_name = "requesterAddress"];</code>
     * @return The requesterAddress.
     */
    public java.lang.String getRequesterAddress() {
      java.lang.Object ref = requesterAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        requesterAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string requester_address = 2 [json_name = "requesterAddress"];</code>
     * @return The bytes for requesterAddress.
     */
    public com.google.protobuf.ByteString
        getRequesterAddressBytes() {
      java.lang.Object ref = requesterAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        requesterAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string requester_address = 2 [json_name = "requesterAddress"];</code>
     * @param value The requesterAddress to set.
     * @return This builder for chaining.
     */
    public Builder setRequesterAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      requesterAddress_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string requester_address = 2 [json_name = "requesterAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearRequesterAddress() {
      requesterAddress_ = getDefaultInstance().getRequesterAddress();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string requester_address = 2 [json_name = "requesterAddress"];</code>
     * @param value The bytes for requesterAddress to set.
     * @return This builder for chaining.
     */
    public Builder setRequesterAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      requesterAddress_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
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


    // @@protoc_insertion_point(builder_scope:panacea.datadeal.v2alpha2.MsgDeactivateDeal)
  }

  // @@protoc_insertion_point(class_scope:panacea.datadeal.v2alpha2.MsgDeactivateDeal)
  private static final com.panacea.datadeal.v2alpha2.MsgDeactivateDeal DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.panacea.datadeal.v2alpha2.MsgDeactivateDeal();
  }

  public static com.panacea.datadeal.v2alpha2.MsgDeactivateDeal getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgDeactivateDeal>
      PARSER = new com.google.protobuf.AbstractParser<MsgDeactivateDeal>() {
    @java.lang.Override
    public MsgDeactivateDeal parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgDeactivateDeal> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgDeactivateDeal> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.panacea.datadeal.v2alpha2.MsgDeactivateDeal getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

