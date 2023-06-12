// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ibc/core/client/v1/tx.proto

package com.ibc.core.client.v1;

/**
 * <pre>
 * MsgSubmitMisbehaviour defines an sdk.Msg type that submits Evidence for
 * light client misbehaviour.
 * Warning: DEPRECATED
 * </pre>
 *
 * Protobuf type {@code ibc.core.client.v1.MsgSubmitMisbehaviour}
 */
public final class MsgSubmitMisbehaviour extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:ibc.core.client.v1.MsgSubmitMisbehaviour)
    MsgSubmitMisbehaviourOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgSubmitMisbehaviour.newBuilder() to construct.
  private MsgSubmitMisbehaviour(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgSubmitMisbehaviour() {
    clientId_ = "";
    signer_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgSubmitMisbehaviour();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.ibc.core.client.v1.TxProto.internal_static_ibc_core_client_v1_MsgSubmitMisbehaviour_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.ibc.core.client.v1.TxProto.internal_static_ibc_core_client_v1_MsgSubmitMisbehaviour_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.ibc.core.client.v1.MsgSubmitMisbehaviour.class, com.ibc.core.client.v1.MsgSubmitMisbehaviour.Builder.class);
  }

  public static final int CLIENT_ID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object clientId_ = "";
  /**
   * <pre>
   * client unique identifier
   * </pre>
   *
   * <code>string client_id = 1 [json_name = "clientId", deprecated = true];</code>
   * @deprecated ibc.core.client.v1.MsgSubmitMisbehaviour.client_id is deprecated.
   *     See ibc/core/client/v1/tx.proto;l=103
   * @return The clientId.
   */
  @java.lang.Override
  @java.lang.Deprecated public java.lang.String getClientId() {
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
   * <code>string client_id = 1 [json_name = "clientId", deprecated = true];</code>
   * @deprecated ibc.core.client.v1.MsgSubmitMisbehaviour.client_id is deprecated.
   *     See ibc/core/client/v1/tx.proto;l=103
   * @return The bytes for clientId.
   */
  @java.lang.Override
  @java.lang.Deprecated public com.google.protobuf.ByteString
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

  public static final int MISBEHAVIOUR_FIELD_NUMBER = 2;
  private com.google.protobuf.Any misbehaviour_;
  /**
   * <pre>
   * misbehaviour used for freezing the light client
   * </pre>
   *
   * <code>.google.protobuf.Any misbehaviour = 2 [json_name = "misbehaviour", deprecated = true];</code>
   * @deprecated ibc.core.client.v1.MsgSubmitMisbehaviour.misbehaviour is deprecated.
   *     See ibc/core/client/v1/tx.proto;l=105
   * @return Whether the misbehaviour field is set.
   */
  @java.lang.Override
  @java.lang.Deprecated public boolean hasMisbehaviour() {
    return misbehaviour_ != null;
  }
  /**
   * <pre>
   * misbehaviour used for freezing the light client
   * </pre>
   *
   * <code>.google.protobuf.Any misbehaviour = 2 [json_name = "misbehaviour", deprecated = true];</code>
   * @deprecated ibc.core.client.v1.MsgSubmitMisbehaviour.misbehaviour is deprecated.
   *     See ibc/core/client/v1/tx.proto;l=105
   * @return The misbehaviour.
   */
  @java.lang.Override
  @java.lang.Deprecated public com.google.protobuf.Any getMisbehaviour() {
    return misbehaviour_ == null ? com.google.protobuf.Any.getDefaultInstance() : misbehaviour_;
  }
  /**
   * <pre>
   * misbehaviour used for freezing the light client
   * </pre>
   *
   * <code>.google.protobuf.Any misbehaviour = 2 [json_name = "misbehaviour", deprecated = true];</code>
   */
  @java.lang.Override
  @java.lang.Deprecated public com.google.protobuf.AnyOrBuilder getMisbehaviourOrBuilder() {
    return misbehaviour_ == null ? com.google.protobuf.Any.getDefaultInstance() : misbehaviour_;
  }

  public static final int SIGNER_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private volatile java.lang.Object signer_ = "";
  /**
   * <pre>
   * signer address
   * </pre>
   *
   * <code>string signer = 3 [json_name = "signer", deprecated = true];</code>
   * @deprecated ibc.core.client.v1.MsgSubmitMisbehaviour.signer is deprecated.
   *     See ibc/core/client/v1/tx.proto;l=107
   * @return The signer.
   */
  @java.lang.Override
  @java.lang.Deprecated public java.lang.String getSigner() {
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
   * <code>string signer = 3 [json_name = "signer", deprecated = true];</code>
   * @deprecated ibc.core.client.v1.MsgSubmitMisbehaviour.signer is deprecated.
   *     See ibc/core/client/v1/tx.proto;l=107
   * @return The bytes for signer.
   */
  @java.lang.Override
  @java.lang.Deprecated public com.google.protobuf.ByteString
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
    if (misbehaviour_ != null) {
      output.writeMessage(2, getMisbehaviour());
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
    if (misbehaviour_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getMisbehaviour());
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
    if (!(obj instanceof com.ibc.core.client.v1.MsgSubmitMisbehaviour)) {
      return super.equals(obj);
    }
    com.ibc.core.client.v1.MsgSubmitMisbehaviour other = (com.ibc.core.client.v1.MsgSubmitMisbehaviour) obj;

    if (!getClientId()
        .equals(other.getClientId())) return false;
    if (hasMisbehaviour() != other.hasMisbehaviour()) return false;
    if (hasMisbehaviour()) {
      if (!getMisbehaviour()
          .equals(other.getMisbehaviour())) return false;
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
    if (hasMisbehaviour()) {
      hash = (37 * hash) + MISBEHAVIOUR_FIELD_NUMBER;
      hash = (53 * hash) + getMisbehaviour().hashCode();
    }
    hash = (37 * hash) + SIGNER_FIELD_NUMBER;
    hash = (53 * hash) + getSigner().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.ibc.core.client.v1.MsgSubmitMisbehaviour parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.client.v1.MsgSubmitMisbehaviour parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.client.v1.MsgSubmitMisbehaviour parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.client.v1.MsgSubmitMisbehaviour parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.client.v1.MsgSubmitMisbehaviour parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.ibc.core.client.v1.MsgSubmitMisbehaviour parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.ibc.core.client.v1.MsgSubmitMisbehaviour parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.core.client.v1.MsgSubmitMisbehaviour parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.ibc.core.client.v1.MsgSubmitMisbehaviour parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.ibc.core.client.v1.MsgSubmitMisbehaviour parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.ibc.core.client.v1.MsgSubmitMisbehaviour parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.ibc.core.client.v1.MsgSubmitMisbehaviour parseFrom(
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
  public static Builder newBuilder(com.ibc.core.client.v1.MsgSubmitMisbehaviour prototype) {
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
   * MsgSubmitMisbehaviour defines an sdk.Msg type that submits Evidence for
   * light client misbehaviour.
   * Warning: DEPRECATED
   * </pre>
   *
   * Protobuf type {@code ibc.core.client.v1.MsgSubmitMisbehaviour}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:ibc.core.client.v1.MsgSubmitMisbehaviour)
      com.ibc.core.client.v1.MsgSubmitMisbehaviourOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.ibc.core.client.v1.TxProto.internal_static_ibc_core_client_v1_MsgSubmitMisbehaviour_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.ibc.core.client.v1.TxProto.internal_static_ibc_core_client_v1_MsgSubmitMisbehaviour_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.ibc.core.client.v1.MsgSubmitMisbehaviour.class, com.ibc.core.client.v1.MsgSubmitMisbehaviour.Builder.class);
    }

    // Construct using com.ibc.core.client.v1.MsgSubmitMisbehaviour.newBuilder()
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
      misbehaviour_ = null;
      if (misbehaviourBuilder_ != null) {
        misbehaviourBuilder_.dispose();
        misbehaviourBuilder_ = null;
      }
      signer_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.ibc.core.client.v1.TxProto.internal_static_ibc_core_client_v1_MsgSubmitMisbehaviour_descriptor;
    }

    @java.lang.Override
    public com.ibc.core.client.v1.MsgSubmitMisbehaviour getDefaultInstanceForType() {
      return com.ibc.core.client.v1.MsgSubmitMisbehaviour.getDefaultInstance();
    }

    @java.lang.Override
    public com.ibc.core.client.v1.MsgSubmitMisbehaviour build() {
      com.ibc.core.client.v1.MsgSubmitMisbehaviour result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.ibc.core.client.v1.MsgSubmitMisbehaviour buildPartial() {
      com.ibc.core.client.v1.MsgSubmitMisbehaviour result = new com.ibc.core.client.v1.MsgSubmitMisbehaviour(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.ibc.core.client.v1.MsgSubmitMisbehaviour result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.clientId_ = clientId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.misbehaviour_ = misbehaviourBuilder_ == null
            ? misbehaviour_
            : misbehaviourBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.signer_ = signer_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.ibc.core.client.v1.MsgSubmitMisbehaviour) {
        return mergeFrom((com.ibc.core.client.v1.MsgSubmitMisbehaviour)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.ibc.core.client.v1.MsgSubmitMisbehaviour other) {
      if (other == com.ibc.core.client.v1.MsgSubmitMisbehaviour.getDefaultInstance()) return this;
      if (!other.getClientId().isEmpty()) {
        clientId_ = other.clientId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasMisbehaviour()) {
        mergeMisbehaviour(other.getMisbehaviour());
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
                  getMisbehaviourFieldBuilder().getBuilder(),
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
     * <code>string client_id = 1 [json_name = "clientId", deprecated = true];</code>
     * @deprecated ibc.core.client.v1.MsgSubmitMisbehaviour.client_id is deprecated.
     *     See ibc/core/client/v1/tx.proto;l=103
     * @return The clientId.
     */
    @java.lang.Deprecated public java.lang.String getClientId() {
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
     * <code>string client_id = 1 [json_name = "clientId", deprecated = true];</code>
     * @deprecated ibc.core.client.v1.MsgSubmitMisbehaviour.client_id is deprecated.
     *     See ibc/core/client/v1/tx.proto;l=103
     * @return The bytes for clientId.
     */
    @java.lang.Deprecated public com.google.protobuf.ByteString
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
     * <code>string client_id = 1 [json_name = "clientId", deprecated = true];</code>
     * @deprecated ibc.core.client.v1.MsgSubmitMisbehaviour.client_id is deprecated.
     *     See ibc/core/client/v1/tx.proto;l=103
     * @param value The clientId to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setClientId(
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
     * <code>string client_id = 1 [json_name = "clientId", deprecated = true];</code>
     * @deprecated ibc.core.client.v1.MsgSubmitMisbehaviour.client_id is deprecated.
     *     See ibc/core/client/v1/tx.proto;l=103
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearClientId() {
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
     * <code>string client_id = 1 [json_name = "clientId", deprecated = true];</code>
     * @deprecated ibc.core.client.v1.MsgSubmitMisbehaviour.client_id is deprecated.
     *     See ibc/core/client/v1/tx.proto;l=103
     * @param value The bytes for clientId to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setClientIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      clientId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Any misbehaviour_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> misbehaviourBuilder_;
    /**
     * <pre>
     * misbehaviour used for freezing the light client
     * </pre>
     *
     * <code>.google.protobuf.Any misbehaviour = 2 [json_name = "misbehaviour", deprecated = true];</code>
     * @deprecated ibc.core.client.v1.MsgSubmitMisbehaviour.misbehaviour is deprecated.
     *     See ibc/core/client/v1/tx.proto;l=105
     * @return Whether the misbehaviour field is set.
     */
    @java.lang.Deprecated public boolean hasMisbehaviour() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * misbehaviour used for freezing the light client
     * </pre>
     *
     * <code>.google.protobuf.Any misbehaviour = 2 [json_name = "misbehaviour", deprecated = true];</code>
     * @deprecated ibc.core.client.v1.MsgSubmitMisbehaviour.misbehaviour is deprecated.
     *     See ibc/core/client/v1/tx.proto;l=105
     * @return The misbehaviour.
     */
    @java.lang.Deprecated public com.google.protobuf.Any getMisbehaviour() {
      if (misbehaviourBuilder_ == null) {
        return misbehaviour_ == null ? com.google.protobuf.Any.getDefaultInstance() : misbehaviour_;
      } else {
        return misbehaviourBuilder_.getMessage();
      }
    }
    /**
     * <pre>
     * misbehaviour used for freezing the light client
     * </pre>
     *
     * <code>.google.protobuf.Any misbehaviour = 2 [json_name = "misbehaviour", deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder setMisbehaviour(com.google.protobuf.Any value) {
      if (misbehaviourBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        misbehaviour_ = value;
      } else {
        misbehaviourBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * misbehaviour used for freezing the light client
     * </pre>
     *
     * <code>.google.protobuf.Any misbehaviour = 2 [json_name = "misbehaviour", deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder setMisbehaviour(
        com.google.protobuf.Any.Builder builderForValue) {
      if (misbehaviourBuilder_ == null) {
        misbehaviour_ = builderForValue.build();
      } else {
        misbehaviourBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * misbehaviour used for freezing the light client
     * </pre>
     *
     * <code>.google.protobuf.Any misbehaviour = 2 [json_name = "misbehaviour", deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder mergeMisbehaviour(com.google.protobuf.Any value) {
      if (misbehaviourBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          misbehaviour_ != null &&
          misbehaviour_ != com.google.protobuf.Any.getDefaultInstance()) {
          getMisbehaviourBuilder().mergeFrom(value);
        } else {
          misbehaviour_ = value;
        }
      } else {
        misbehaviourBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * misbehaviour used for freezing the light client
     * </pre>
     *
     * <code>.google.protobuf.Any misbehaviour = 2 [json_name = "misbehaviour", deprecated = true];</code>
     */
    @java.lang.Deprecated public Builder clearMisbehaviour() {
      bitField0_ = (bitField0_ & ~0x00000002);
      misbehaviour_ = null;
      if (misbehaviourBuilder_ != null) {
        misbehaviourBuilder_.dispose();
        misbehaviourBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <pre>
     * misbehaviour used for freezing the light client
     * </pre>
     *
     * <code>.google.protobuf.Any misbehaviour = 2 [json_name = "misbehaviour", deprecated = true];</code>
     */
    @java.lang.Deprecated public com.google.protobuf.Any.Builder getMisbehaviourBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getMisbehaviourFieldBuilder().getBuilder();
    }
    /**
     * <pre>
     * misbehaviour used for freezing the light client
     * </pre>
     *
     * <code>.google.protobuf.Any misbehaviour = 2 [json_name = "misbehaviour", deprecated = true];</code>
     */
    @java.lang.Deprecated public com.google.protobuf.AnyOrBuilder getMisbehaviourOrBuilder() {
      if (misbehaviourBuilder_ != null) {
        return misbehaviourBuilder_.getMessageOrBuilder();
      } else {
        return misbehaviour_ == null ?
            com.google.protobuf.Any.getDefaultInstance() : misbehaviour_;
      }
    }
    /**
     * <pre>
     * misbehaviour used for freezing the light client
     * </pre>
     *
     * <code>.google.protobuf.Any misbehaviour = 2 [json_name = "misbehaviour", deprecated = true];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder> 
        getMisbehaviourFieldBuilder() {
      if (misbehaviourBuilder_ == null) {
        misbehaviourBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Any, com.google.protobuf.Any.Builder, com.google.protobuf.AnyOrBuilder>(
                getMisbehaviour(),
                getParentForChildren(),
                isClean());
        misbehaviour_ = null;
      }
      return misbehaviourBuilder_;
    }

    private java.lang.Object signer_ = "";
    /**
     * <pre>
     * signer address
     * </pre>
     *
     * <code>string signer = 3 [json_name = "signer", deprecated = true];</code>
     * @deprecated ibc.core.client.v1.MsgSubmitMisbehaviour.signer is deprecated.
     *     See ibc/core/client/v1/tx.proto;l=107
     * @return The signer.
     */
    @java.lang.Deprecated public java.lang.String getSigner() {
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
     * <code>string signer = 3 [json_name = "signer", deprecated = true];</code>
     * @deprecated ibc.core.client.v1.MsgSubmitMisbehaviour.signer is deprecated.
     *     See ibc/core/client/v1/tx.proto;l=107
     * @return The bytes for signer.
     */
    @java.lang.Deprecated public com.google.protobuf.ByteString
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
     * <code>string signer = 3 [json_name = "signer", deprecated = true];</code>
     * @deprecated ibc.core.client.v1.MsgSubmitMisbehaviour.signer is deprecated.
     *     See ibc/core/client/v1/tx.proto;l=107
     * @param value The signer to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setSigner(
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
     * <code>string signer = 3 [json_name = "signer", deprecated = true];</code>
     * @deprecated ibc.core.client.v1.MsgSubmitMisbehaviour.signer is deprecated.
     *     See ibc/core/client/v1/tx.proto;l=107
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearSigner() {
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
     * <code>string signer = 3 [json_name = "signer", deprecated = true];</code>
     * @deprecated ibc.core.client.v1.MsgSubmitMisbehaviour.signer is deprecated.
     *     See ibc/core/client/v1/tx.proto;l=107
     * @param value The bytes for signer to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setSignerBytes(
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


    // @@protoc_insertion_point(builder_scope:ibc.core.client.v1.MsgSubmitMisbehaviour)
  }

  // @@protoc_insertion_point(class_scope:ibc.core.client.v1.MsgSubmitMisbehaviour)
  private static final com.ibc.core.client.v1.MsgSubmitMisbehaviour DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.ibc.core.client.v1.MsgSubmitMisbehaviour();
  }

  public static com.ibc.core.client.v1.MsgSubmitMisbehaviour getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgSubmitMisbehaviour>
      PARSER = new com.google.protobuf.AbstractParser<MsgSubmitMisbehaviour>() {
    @java.lang.Override
    public MsgSubmitMisbehaviour parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgSubmitMisbehaviour> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgSubmitMisbehaviour> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.ibc.core.client.v1.MsgSubmitMisbehaviour getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

