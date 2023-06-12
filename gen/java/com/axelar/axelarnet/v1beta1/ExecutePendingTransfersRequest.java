// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/axelarnet/v1beta1/tx.proto

package com.axelar.axelarnet.v1beta1;

/**
 * <pre>
 * MsgExecutePendingTransfers represents a message to trigger transfer all
 * pending transfers
 * </pre>
 *
 * Protobuf type {@code axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest}
 */
public final class ExecutePendingTransfersRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest)
    ExecutePendingTransfersRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use ExecutePendingTransfersRequest.newBuilder() to construct.
  private ExecutePendingTransfersRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private ExecutePendingTransfersRequest() {
    sender_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new ExecutePendingTransfersRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.axelar.axelarnet.v1beta1.TxProto.internal_static_axelar_axelarnet_v1beta1_ExecutePendingTransfersRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.axelar.axelarnet.v1beta1.TxProto.internal_static_axelar_axelarnet_v1beta1_ExecutePendingTransfersRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest.class, com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest.Builder.class);
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
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest)) {
      return super.equals(obj);
    }
    com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest other = (com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest) obj;

    if (!getSender()
        .equals(other.getSender())) return false;
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
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest parseFrom(
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
  public static Builder newBuilder(com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest prototype) {
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
   * MsgExecutePendingTransfers represents a message to trigger transfer all
   * pending transfers
   * </pre>
   *
   * Protobuf type {@code axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest)
      com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.axelar.axelarnet.v1beta1.TxProto.internal_static_axelar_axelarnet_v1beta1_ExecutePendingTransfersRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.axelar.axelarnet.v1beta1.TxProto.internal_static_axelar_axelarnet_v1beta1_ExecutePendingTransfersRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest.class, com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest.Builder.class);
    }

    // Construct using com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest.newBuilder()
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
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.axelar.axelarnet.v1beta1.TxProto.internal_static_axelar_axelarnet_v1beta1_ExecutePendingTransfersRequest_descriptor;
    }

    @java.lang.Override
    public com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest getDefaultInstanceForType() {
      return com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest build() {
      com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest buildPartial() {
      com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest result = new com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sender_ = sender_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest) {
        return mergeFrom((com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest other) {
      if (other == com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest.getDefaultInstance()) return this;
      if (other.getSender() != com.google.protobuf.ByteString.EMPTY) {
        setSender(other.getSender());
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


    // @@protoc_insertion_point(builder_scope:axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest)
  }

  // @@protoc_insertion_point(class_scope:axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest)
  private static final com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest();
  }

  public static com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ExecutePendingTransfersRequest>
      PARSER = new com.google.protobuf.AbstractParser<ExecutePendingTransfersRequest>() {
    @java.lang.Override
    public ExecutePendingTransfersRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ExecutePendingTransfersRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ExecutePendingTransfersRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.axelar.axelarnet.v1beta1.ExecutePendingTransfersRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

