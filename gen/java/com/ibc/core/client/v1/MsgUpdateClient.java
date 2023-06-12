// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/client/v1/tx.proto

package com.ibc.core.client.v1;

/**
 * <pre>
 * MsgUpdateClient defines an sdk.Msg to update a IBC client state using
 * the given client message.
 * </pre>
 *
 * Protobuf type {@code ibc.core.client.v1.MsgUpdateClient}
 */
public final class MsgUpdateClient extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.core.client.v1.MsgUpdateClient)
    MsgUpdateClientOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgUpdateClient.newBuilder() to construct.
  private MsgUpdateClient(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgUpdateClient() {
    clientId_ = "";
    signer_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgUpdateClient();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ibc.core.client.v1.TxProto.internal_static_ibc_core_client_v1_MsgUpdateClient_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ibc.core.client.v1.TxProto.internal_static_ibc_core_client_v1_MsgUpdateClient_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ibc.core.client.v1.MsgUpdateClient.class, com.ibc.core.client.v1.MsgUpdateClient.Builder.class);
  }

  public static final int CLIENT_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object clientId_ = "";
  /**
   * <pre>
   * client unique identifier
   * </pre>
   *
   * <code>string client_id = 1 [json_name = "clientId"];</code>
   * @return The clientId.
   */
  @java.lang.Override
  public java.lang.String getClientId() {
    java.lang.Object ref = clientId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clientId_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * client unique identifier
   * </pre>
   *
   * <code>string client_id = 1 [json_name = "clientId"];</code>
   * @return The bytes for clientId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getClientIdBytes() {
    java.lang.Object ref = clientId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clientId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLIENT_MESSAGE_FIELD_NUMBER = 2;
  private com.google.protobuf.Any clientMessage_;
  /**
   * <pre>
   * client message to update the light client
   * </pre>
   *
   * <code>.google.protobuf.Any client_message = 2 [json_name = "clientMessage"];</code>
   * @return Whether the clientMessage field is set.
   */
  @java.lang.Override
  public boolean hasClientMessage() {
    return clientMessage_ != null;
  }
  /**
   * <pre>
   * client message to update the light client
   * </pre>
   *
   * <code>.google.protobuf.Any client_message = 2 [json_name = "clientMessage"];</code>
   * @return The clientMessage.
   */
  @java.lang.Override
  public com.google.protobuf.Any getClientMessage() {
    return clientMessage_ == null ? com.google.protobuf.Any.getDefaultInstance() : clientMessage_;
  }
  /**
   * <pre>
   * client message to update the light client
   * </pre>
   *
   * <code>.google.protobuf.Any client_message = 2 [json_name = "clientMessage"];</code>
   */
  @java.lang.Override
  public com.google.protobuf.AnyOrBuilder getClientMessageOrBuilder() {
    return clientMessage_ == null ? com.google.protobuf.Any.getDefaultInstance() : clientMessage_;
  }

  public static final int SIGNER_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object signer_ = "";
  /**
   * <pre>
   * signer address
   * </pre>
   *
   * <code>string signer = 3 [json_name = "signer"];</code>
   * @return The signer.
   */
  @java.lang.Override
  public java.lang.String getSigner() {
    java.lang.Object ref = signer_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      signer_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * signer address
   * </pre>
   *
   * <code>string signer = 3 [json_name = "signer"];</code>
   * @return The bytes for signer.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSignerBytes() {
    java.lang.Object ref = signer_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      signer_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, clientId_);
    }
    if (clientMessage_ != null) {
      output.writeMessage(2, getClientMessage());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(signer_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, signer_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(clientId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, clientId_);
    }
    if (clientMessage_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getClientMessage());
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(signer_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, signer_);
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
    if (!(obj instanceof com.ibc.core.client.v1.MsgUpdateClient)) {
      return super.equals(obj);
    }
    com.ibc.core.client.v1.MsgUpdateClient other = (com.ibc.core.client.v1.MsgUpdateClient) obj;

    if (!getClientId()
        .equals(other.getClientId())) return false;
    if (hasClientMessage() != other.hasClientMessage()) return false;
    if (hasClientMessage()) {
      if (!getClientMessage()
          .equals(other.getClientMessage())) return false;
    }
    if (!getSigner()
        .equals(other.getSigner())) return false;
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
    hash = (37 * hash) + CLIENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getClientId().hashCode();
    if (hasClientMessage()) {
      hash = (37 * hash) + CLIENT_MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getClientMessage().hashCode();
    }
    hash = (37 * hash) + SIGNER_FIELD_NUMBER;
    hash = (53 * hash) + getSigner().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ibc.core.client.v1.MsgUpdateClient parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.client.v1.MsgUpdateClient parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.client.v1.MsgUpdateClient parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.client.v1.MsgUpdateClient parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.client.v1.MsgUpdateClient parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.client.v1.MsgUpdateClient parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.client.v1.MsgUpdateClient parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.core.client.v1.MsgUpdateClient parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.ibc.core.client.v1.MsgUpdateClient parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.ibc.core.client.v1.MsgUpdateClient parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.core.client.v1.MsgUpdateClient parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.core.client.v1.MsgUpdateClient parseFrom(
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
  public static Builder newBuilder(com.ibc.core.client.v1.MsgUpdateClient prototype) {
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
   * MsgUpdateClient defines an sdk.Msg to update a IBC client state using
   * the given client message.
   * </pre>
   *
   * Protobuf type {@code ibc.core.client.v1.MsgUpdateClient}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.core.client.v1.MsgUpdateClient)
      com.ibc.core.client.v1.MsgUpdateClientOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ibc.core.client.v1.TxProto.internal_static_ibc_core_client_v1_MsgUpdateClient_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibc.core.client.v1.TxProto.internal_static_ibc_core_client_v1_MsgUpdateClient_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibc.core.client.v1.MsgUpdateClient.class, com.ibc.core.client.v1.MsgUpdateClient.Builder.class);
    }

    // Construct using com.ibc.core.client.v1.MsgUpdateClient.newBuilder()
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
      clientId_ = "";
      clientMessage_ = null;
      if (clientMessageBuilder_ != null) {
        clientMessageBuilder_.dispose();
        clientMessageBuilder_ = null;
      }
      signer_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ibc.core.client.v1.TxProto.internal_static_ibc_core_client_v1_MsgUpdateClient_descriptor;
    }

    @java.lang.Override
    public com.ibc.core.client.v1.MsgUpdateClient getDefaultInstanceForType() {
      return com.ibc.core.client.v1.MsgUpdateClient.getDefaultInstance();
    }

    @java.lang.Override
    public com.ibc.core.client.v1.MsgUpdateClient build() {
      com.ibc.core.client.v1.MsgUpdateClient result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ibc.core.client.v1.MsgUpdateClient buildPartial() {
      com.ibc.core.client.v1.MsgUpdateClient result = new com.ibc.core.client.v1.MsgUpdateClient(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.ibc.core.client.v1.MsgUpdateClient result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.clientId_ = clientId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.clientMessage_ = clientMessageBuilder_ == null
            ? clientMessage_
            : clientMessageBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.signer_ = signer_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ibc.core.client.v1.MsgUpdateClient) {
        return mergeFrom((com.ibc.core.client.v1.MsgUpdateClient)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ibc.core.client.v1.MsgUpdateClient other) {
      if (other == com.ibc.core.client.v1.MsgUpdateClient.getDefaultInstance()) return this;
      if (!other.getClientId().isEmpty()) {
        clientId_ = other.clientId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasClientMessage()) {
        mergeClientMessage(other.getClientMessage());
      }
      if (!other.getSigner().isEmpty()) {
        signer_ = other.signer_;
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
              clientId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getClientMessageFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              signer_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000004;
              break;
            } // case 26
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

    private java.lang.Object clientId_ = "";
    /**
     * <pre>
     * client unique identifier
     * </pre>
     *
     * <code>string client_id = 1 [json_name = "clientId"];</code>
     * @return The clientId.
     */
    public java.lang.String getClientId() {
      java.lang.Object ref = clientId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * client unique identifier
     * </pre>
     *
     * <code>string client_id = 1 [json_name = "clientId"];</code>
     * @return The bytes for clientId.
     */
    public com.google.protobuf.ByteString
        getClientIdBytes() {
      java.lang.Object ref = clientId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * client unique identifier
     * </pre>
     *
     * <code>string client_id = 1 [json_name = "clientId"];</code>
     * @param value The clientId to set.
     * @return This builder for chaining.
     */
    public Builder setClientId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      clientId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * client unique identifier
     * </pre>
     *
     * <code>string client_id = 1 [json_name = "clientId"];</code>
     * @return This builder for chaining.
     */
    public Builder clearClientId() {
      clientId_ = getDefaultInstance().getClientId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * client unique identifier
     * </pre>
     *
     * <code>string client_id = 1 [json_name = "clientId"];</code>
     * @param value The bytes for clientId to set.
     * @return This builder for chaining.
     */
    public Builder setClientIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      clientId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Any clientMessage_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> clientMessageBuilder_;
    /**
     * <pre>
     * client message to update the light client
     * </pre>
     *
     * <code>.google.protobuf.Any client_message = 2 [json_name = "clientMessage"];</code>
     * @return Whether the clientMessage field is set.
     */
    public boolean hasClientMessage() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * client message to update the light client
     * </pre>
     *
     * <code>.google.protobuf.Any client_message = 2 [json_name = "clientMessage"];</code>
     * @return The clientMessage.
     */
    public com.google.protobuf.Any getClientMessage() {
      if (clientMessageBuilder_ == null) {
        return clientMessage_ == null ? com.google.protobuf.Any.getDefaultInstance() : clientMessage_;
      } else {
        return clientMessageBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * client message to update the light client
     * </pre>
     *
     * <code>.google.protobuf.Any client_message = 2 [json_name = "clientMessage"];</code>
     */
    public Builder setClientMessage(com.google.protobuf.Any value) {
      if (clientMessageBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        clientMessage_ = value;
      } else {
        clientMessageBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * client message to update the light client
     * </pre>
     *
     * <code>.google.protobuf.Any client_message = 2 [json_name = "clientMessage"];</code>
     */
    public Builder setClientMessage(
        com.google.protobuf.Any.Builder builderForValue) {
      if (clientMessageBuilder_ == null) {
        clientMessage_ = builderForValue.build();
      } else {
        clientMessageBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * client message to update the light client
     * </pre>
     *
     * <code>.google.protobuf.Any client_message = 2 [json_name = "clientMessage"];</code>
     */
    public Builder mergeClientMessage(com.google.protobuf.Any value) {
      if (clientMessageBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          clientMessage_ != null &&
          clientMessage_ != com.google.protobuf.Any.getDefaultInstance()) {
          getClientMessageBuilder().mergeFrom(value);
        } else {
          clientMessage_ = value;
        }
      } else {
        clientMessageBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * client message to update the light client
     * </pre>
     *
     * <code>.google.protobuf.Any client_message = 2 [json_name = "clientMessage"];</code>
     */
    public Builder clearClientMessage() {
      bitField0_ = (bitField0_ & ~0x00000002);
      clientMessage_ = null;
      if (clientMessageBuilder_ != null) {
        clientMessageBuilder_.dispose();
        clientMessageBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * client message to update the light client
     * </pre>
     *
     * <code>.google.protobuf.Any client_message = 2 [json_name = "clientMessage"];</code>
     */
    public com.google.protobuf.Any.Builder getClientMessageBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getClientMessageFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * client message to update the light client
     * </pre>
     *
     * <code>.google.protobuf.Any client_message = 2 [json_name = "clientMessage"];</code>
     */
    public com.google.protobuf.AnyOrBuilder getClientMessageOrBuilder() {
      if (clientMessageBuilder_ != null) {
        return clientMessageBuilder_.getMessageOrBuilder();
      } else {
        return clientMessage_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : clientMessage_;
      }
    }
    /**
     * <pre>
     * client message to update the light client
     * </pre>
     *
     * <code>.google.protobuf.Any client_message = 2 [json_name = "clientMessage"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getClientMessageFieldBuilder() {
      if (clientMessageBuilder_ == null) {
        clientMessageBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getClientMessage(),
                getParentForChildren(),
                isClean());
        clientMessage_ = null;
      }
      return clientMessageBuilder_;
    }

    private java.lang.Object signer_ = "";
    /**
     * <pre>
     * signer address
     * </pre>
     *
     * <code>string signer = 3 [json_name = "signer"];</code>
     * @return The signer.
     */
    public java.lang.String getSigner() {
      java.lang.Object ref = signer_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        signer_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * signer address
     * </pre>
     *
     * <code>string signer = 3 [json_name = "signer"];</code>
     * @return The bytes for signer.
     */
    public com.google.protobuf.ByteString
        getSignerBytes() {
      java.lang.Object ref = signer_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        signer_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * signer address
     * </pre>
     *
     * <code>string signer = 3 [json_name = "signer"];</code>
     * @param value The signer to set.
     * @return This builder for chaining.
     */
    public Builder setSigner(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      signer_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * signer address
     * </pre>
     *
     * <code>string signer = 3 [json_name = "signer"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSigner() {
      signer_ = getDefaultInstance().getSigner();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * signer address
     * </pre>
     *
     * <code>string signer = 3 [json_name = "signer"];</code>
     * @param value The bytes for signer to set.
     * @return This builder for chaining.
     */
    public Builder setSignerBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      signer_ = value;
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


    // @@protoc_insertion_point(builder_scope:ibc.core.client.v1.MsgUpdateClient)
  }

  // @@protoc_insertion_point(class_scope:ibc.core.client.v1.MsgUpdateClient)
  private static final com.ibc.core.client.v1.MsgUpdateClient DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ibc.core.client.v1.MsgUpdateClient();
  }

  public static com.ibc.core.client.v1.MsgUpdateClient getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgUpdateClient>
      PARSER = new com.google.protobuf.AbstractParser<MsgUpdateClient>() {
    @java.lang.Override
    public MsgUpdateClient parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgUpdateClient> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgUpdateClient> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ibc.core.client.v1.MsgUpdateClient getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

