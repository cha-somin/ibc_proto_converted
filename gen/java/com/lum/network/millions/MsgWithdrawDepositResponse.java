// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: lum-network/millions/tx.proto

package com.lum.network.millions;

/**
 * Protobuf type {@code lum.network.millions.MsgWithdrawDepositResponse}
 */
public final class MsgWithdrawDepositResponse extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:lum.network.millions.MsgWithdrawDepositResponse)
    MsgWithdrawDepositResponseOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgWithdrawDepositResponse.newBuilder() to construct.
  private MsgWithdrawDepositResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgWithdrawDepositResponse() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgWithdrawDepositResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.lum.network.millions.TxProto.internal_static_lum_network_millions_MsgWithdrawDepositResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.lum.network.millions.TxProto.internal_static_lum_network_millions_MsgWithdrawDepositResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.lum.network.millions.MsgWithdrawDepositResponse.class, com.lum.network.millions.MsgWithdrawDepositResponse.Builder.class);
  }

  public static final int WITHDRAWAL_ID_FIELD_NUMBER = 1;
  private long withdrawalId_ = 0L;
  /**
   * <code>uint64 withdrawal_id = 1 [json_name = "withdrawalId"];</code>
   * @return The withdrawalId.
   */
  @java.lang.Override
  public long getWithdrawalId() {
    return withdrawalId_;
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
    if (withdrawalId_ != 0L) {
      output.writeUInt64(1, withdrawalId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (withdrawalId_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, withdrawalId_);
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
    if (!(obj instanceof com.lum.network.millions.MsgWithdrawDepositResponse)) {
      return super.equals(obj);
    }
    com.lum.network.millions.MsgWithdrawDepositResponse other = (com.lum.network.millions.MsgWithdrawDepositResponse) obj;

    if (getWithdrawalId()
        != other.getWithdrawalId()) return false;
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
    hash = (37 * hash) + WITHDRAWAL_ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getWithdrawalId());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.lum.network.millions.MsgWithdrawDepositResponse parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lum.network.millions.MsgWithdrawDepositResponse parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lum.network.millions.MsgWithdrawDepositResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lum.network.millions.MsgWithdrawDepositResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lum.network.millions.MsgWithdrawDepositResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.lum.network.millions.MsgWithdrawDepositResponse parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.lum.network.millions.MsgWithdrawDepositResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.lum.network.millions.MsgWithdrawDepositResponse parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.lum.network.millions.MsgWithdrawDepositResponse parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.lum.network.millions.MsgWithdrawDepositResponse parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.lum.network.millions.MsgWithdrawDepositResponse parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.lum.network.millions.MsgWithdrawDepositResponse parseFrom(
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
  public static Builder newBuilder(com.lum.network.millions.MsgWithdrawDepositResponse prototype) {
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
   * Protobuf type {@code lum.network.millions.MsgWithdrawDepositResponse}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:lum.network.millions.MsgWithdrawDepositResponse)
      com.lum.network.millions.MsgWithdrawDepositResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.lum.network.millions.TxProto.internal_static_lum_network_millions_MsgWithdrawDepositResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.lum.network.millions.TxProto.internal_static_lum_network_millions_MsgWithdrawDepositResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.lum.network.millions.MsgWithdrawDepositResponse.class, com.lum.network.millions.MsgWithdrawDepositResponse.Builder.class);
    }

    // Construct using com.lum.network.millions.MsgWithdrawDepositResponse.newBuilder()
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
      withdrawalId_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.lum.network.millions.TxProto.internal_static_lum_network_millions_MsgWithdrawDepositResponse_descriptor;
    }

    @java.lang.Override
    public com.lum.network.millions.MsgWithdrawDepositResponse getDefaultInstanceForType() {
      return com.lum.network.millions.MsgWithdrawDepositResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.lum.network.millions.MsgWithdrawDepositResponse build() {
      com.lum.network.millions.MsgWithdrawDepositResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.lum.network.millions.MsgWithdrawDepositResponse buildPartial() {
      com.lum.network.millions.MsgWithdrawDepositResponse result = new com.lum.network.millions.MsgWithdrawDepositResponse(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.lum.network.millions.MsgWithdrawDepositResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.withdrawalId_ = withdrawalId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.lum.network.millions.MsgWithdrawDepositResponse) {
        return mergeFrom((com.lum.network.millions.MsgWithdrawDepositResponse)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.lum.network.millions.MsgWithdrawDepositResponse other) {
      if (other == com.lum.network.millions.MsgWithdrawDepositResponse.getDefaultInstance()) return this;
      if (other.getWithdrawalId() != 0L) {
        setWithdrawalId(other.getWithdrawalId());
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
              withdrawalId_ = input.readUInt64();
              bitField0_ |= 0x00000001;
              break;
            } // case 8
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

    private long withdrawalId_ ;
    /**
     * <code>uint64 withdrawal_id = 1 [json_name = "withdrawalId"];</code>
     * @return The withdrawalId.
     */
    @java.lang.Override
    public long getWithdrawalId() {
      return withdrawalId_;
    }
    /**
     * <code>uint64 withdrawal_id = 1 [json_name = "withdrawalId"];</code>
     * @param value The withdrawalId to set.
     * @return This builder for chaining.
     */
    public Builder setWithdrawalId(long value) {

      withdrawalId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 withdrawal_id = 1 [json_name = "withdrawalId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearWithdrawalId() {
      bitField0_ = (bitField0_ & ~0x00000001);
      withdrawalId_ = 0L;
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


    // @@protoc_insertion_point(builder_scope:lum.network.millions.MsgWithdrawDepositResponse)
  }

  // @@protoc_insertion_point(class_scope:lum.network.millions.MsgWithdrawDepositResponse)
  private static final com.lum.network.millions.MsgWithdrawDepositResponse DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.lum.network.millions.MsgWithdrawDepositResponse();
  }

  public static com.lum.network.millions.MsgWithdrawDepositResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgWithdrawDepositResponse>
      PARSER = new com.google.protobuf.AbstractParser<MsgWithdrawDepositResponse>() {
    @java.lang.Override
    public MsgWithdrawDepositResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgWithdrawDepositResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgWithdrawDepositResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.lum.network.millions.MsgWithdrawDepositResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

