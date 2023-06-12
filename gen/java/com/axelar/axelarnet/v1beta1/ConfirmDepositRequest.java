// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/axelarnet/v1beta1/tx.proto

package com.axelar.axelarnet.v1beta1;

/**
 * <pre>
 * MsgConfirmDeposit represents a deposit confirmation message
 * </pre>
 *
 * Protobuf type {@code axelar.axelarnet.v1beta1.ConfirmDepositRequest}
 */
public final class ConfirmDepositRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:axelar.axelarnet.v1beta1.ConfirmDepositRequest)
    ConfirmDepositRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ConfirmDepositRequest.newBuilder() to construct.
  private ConfirmDepositRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ConfirmDepositRequest() {
    sender_ = com.google.protobuf.ByteString.EMPTY;
    depositAddress_ = com.google.protobuf.ByteString.EMPTY;
    denom_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ConfirmDepositRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.axelar.axelarnet.v1beta1.TxProto.internal_static_axelar_axelarnet_v1beta1_ConfirmDepositRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.axelar.axelarnet.v1beta1.TxProto.internal_static_axelar_axelarnet_v1beta1_ConfirmDepositRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.axelar.axelarnet.v1beta1.ConfirmDepositRequest.class, com.axelar.axelarnet.v1beta1.ConfirmDepositRequest.Builder.class);
  }

  public static final int SENDER_FIELD_NUMBER = 1;
  private com.google.protobuf.ByteString sender_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
   * @return The sender.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSender() {
    return sender_;
  }

  public static final int DEPOSIT_ADDRESS_FIELD_NUMBER = 4;
  private com.google.protobuf.ByteString depositAddress_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes deposit_address = 4 [json_name = "depositAddress", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
   * @return The depositAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDepositAddress() {
    return depositAddress_;
  }

  public static final int DENOM_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private volatile java.lang.Object denom_ = "";
  /**
   * <code>string denom = 5 [json_name = "denom"];</code>
   * @return The denom.
   */
  @java.lang.Override
  public java.lang.String getDenom() {
    java.lang.Object ref = denom_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      denom_ = s;
      return s;
    }
  }
  /**
   * <code>string denom = 5 [json_name = "denom"];</code>
   * @return The bytes for denom.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getDenomBytes() {
    java.lang.Object ref = denom_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      denom_ = b;
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
    if (!sender_.isEmpty()) {
      output.writeBytes(1, sender_);
    }
    if (!depositAddress_.isEmpty()) {
      output.writeBytes(4, depositAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 5, denom_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!sender_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(1, sender_);
    }
    if (!depositAddress_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(4, depositAddress_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(5, denom_);
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
    if (!(obj instanceof com.axelar.axelarnet.v1beta1.ConfirmDepositRequest)) {
      return super.equals(obj);
    }
    com.axelar.axelarnet.v1beta1.ConfirmDepositRequest other = (com.axelar.axelarnet.v1beta1.ConfirmDepositRequest) obj;

    if (!getSender()
        .equals(other.getSender())) return false;
    if (!getDepositAddress()
        .equals(other.getDepositAddress())) return false;
    if (!getDenom()
        .equals(other.getDenom())) return false;
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
    hash = (37 * hash) + SENDER_FIELD_NUMBER;
    hash = (53 * hash) + getSender().hashCode();
    hash = (37 * hash) + DEPOSIT_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getDepositAddress().hashCode();
    hash = (37 * hash) + DENOM_FIELD_NUMBER;
    hash = (53 * hash) + getDenom().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.axelar.axelarnet.v1beta1.ConfirmDepositRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.axelarnet.v1beta1.ConfirmDepositRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.axelarnet.v1beta1.ConfirmDepositRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.axelarnet.v1beta1.ConfirmDepositRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.axelarnet.v1beta1.ConfirmDepositRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.axelarnet.v1beta1.ConfirmDepositRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.axelarnet.v1beta1.ConfirmDepositRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.axelarnet.v1beta1.ConfirmDepositRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.axelar.axelarnet.v1beta1.ConfirmDepositRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.axelar.axelarnet.v1beta1.ConfirmDepositRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.axelar.axelarnet.v1beta1.ConfirmDepositRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.axelarnet.v1beta1.ConfirmDepositRequest parseFrom(
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
  public static Builder newBuilder(com.axelar.axelarnet.v1beta1.ConfirmDepositRequest prototype) {
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
   * MsgConfirmDeposit represents a deposit confirmation message
   * </pre>
   *
   * Protobuf type {@code axelar.axelarnet.v1beta1.ConfirmDepositRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:axelar.axelarnet.v1beta1.ConfirmDepositRequest)
      com.axelar.axelarnet.v1beta1.ConfirmDepositRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.axelar.axelarnet.v1beta1.TxProto.internal_static_axelar_axelarnet_v1beta1_ConfirmDepositRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.axelar.axelarnet.v1beta1.TxProto.internal_static_axelar_axelarnet_v1beta1_ConfirmDepositRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.axelar.axelarnet.v1beta1.ConfirmDepositRequest.class, com.axelar.axelarnet.v1beta1.ConfirmDepositRequest.Builder.class);
    }

    // Construct using com.axelar.axelarnet.v1beta1.ConfirmDepositRequest.newBuilder()
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
      sender_ = com.google.protobuf.ByteString.EMPTY;
      depositAddress_ = com.google.protobuf.ByteString.EMPTY;
      denom_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.axelar.axelarnet.v1beta1.TxProto.internal_static_axelar_axelarnet_v1beta1_ConfirmDepositRequest_descriptor;
    }

    @java.lang.Override
    public com.axelar.axelarnet.v1beta1.ConfirmDepositRequest getDefaultInstanceForType() {
      return com.axelar.axelarnet.v1beta1.ConfirmDepositRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.axelar.axelarnet.v1beta1.ConfirmDepositRequest build() {
      com.axelar.axelarnet.v1beta1.ConfirmDepositRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.axelar.axelarnet.v1beta1.ConfirmDepositRequest buildPartial() {
      com.axelar.axelarnet.v1beta1.ConfirmDepositRequest result = new com.axelar.axelarnet.v1beta1.ConfirmDepositRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.axelar.axelarnet.v1beta1.ConfirmDepositRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sender_ = sender_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.depositAddress_ = depositAddress_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.denom_ = denom_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.axelar.axelarnet.v1beta1.ConfirmDepositRequest) {
        return mergeFrom((com.axelar.axelarnet.v1beta1.ConfirmDepositRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.axelar.axelarnet.v1beta1.ConfirmDepositRequest other) {
      if (other == com.axelar.axelarnet.v1beta1.ConfirmDepositRequest.getDefaultInstance()) return this;
      if (other.getSender() != com.google.protobuf.ByteString.EMPTY) {
        setSender(other.getSender());
      }
      if (other.getDepositAddress() != com.google.protobuf.ByteString.EMPTY) {
        setDepositAddress(other.getDepositAddress());
      }
      if (!other.getDenom().isEmpty()) {
        denom_ = other.denom_;
        bitField0_ |= 0x00000004;
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
            case 10: {
              sender_ = input.readBytes();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 34: {
              depositAddress_ = input.readBytes();
              bitField0_ |= 0x00000002;
              break;
            } // case 34
            case 42: {
              denom_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 42
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

    private com.google.protobuf.ByteString sender_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
     * @return The sender.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getSender() {
      return sender_;
    }
    /**
     * <code>bytes sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
     * @param value The sender to set.
     * @return This builder for chaining.
     */
    public Builder setSender(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      sender_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>bytes sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSender() {
      bitField0_ = (bitField0_ & ~0x00000001);
      sender_ = getDefaultInstance().getSender();
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString depositAddress_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes deposit_address = 4 [json_name = "depositAddress", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
     * @return The depositAddress.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getDepositAddress() {
      return depositAddress_;
    }
    /**
     * <code>bytes deposit_address = 4 [json_name = "depositAddress", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
     * @param value The depositAddress to set.
     * @return This builder for chaining.
     */
    public Builder setDepositAddress(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      depositAddress_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>bytes deposit_address = 4 [json_name = "depositAddress", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDepositAddress() {
      bitField0_ = (bitField0_ & ~0x00000002);
      depositAddress_ = getDefaultInstance().getDepositAddress();
      onChanged();
      return this;
    }

    private java.lang.Object denom_ = "";
    /**
     * <code>string denom = 5 [json_name = "denom"];</code>
     * @return The denom.
     */
    public java.lang.String getDenom() {
      java.lang.Object ref = denom_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        denom_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string denom = 5 [json_name = "denom"];</code>
     * @return The bytes for denom.
     */
    public com.google.protobuf.ByteString
        getDenomBytes() {
      java.lang.Object ref = denom_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        denom_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string denom = 5 [json_name = "denom"];</code>
     * @param value The denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenom(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      denom_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>string denom = 5 [json_name = "denom"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDenom() {
      denom_ = getDefaultInstance().getDenom();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <code>string denom = 5 [json_name = "denom"];</code>
     * @param value The bytes for denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      denom_ = value;
      bitField0_ |= 0x00000004;
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


    // @@protoc_insertion_point(builder_scope:axelar.axelarnet.v1beta1.ConfirmDepositRequest)
  }

  // @@protoc_insertion_point(class_scope:axelar.axelarnet.v1beta1.ConfirmDepositRequest)
  private static final com.axelar.axelarnet.v1beta1.ConfirmDepositRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.axelar.axelarnet.v1beta1.ConfirmDepositRequest();
  }

  public static com.axelar.axelarnet.v1beta1.ConfirmDepositRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ConfirmDepositRequest>
      PARSER = new com.google.protobuf.AbstractParser<ConfirmDepositRequest>() {
    @java.lang.Override
    public ConfirmDepositRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ConfirmDepositRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ConfirmDepositRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.axelar.axelarnet.v1beta1.ConfirmDepositRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

