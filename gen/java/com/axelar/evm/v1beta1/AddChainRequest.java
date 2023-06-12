// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/evm/v1beta1/tx.proto

package com.axelar.evm.v1beta1;

/**
 * Protobuf type {@code axelar.evm.v1beta1.AddChainRequest}
 */
public final class AddChainRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:axelar.evm.v1beta1.AddChainRequest)
    AddChainRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AddChainRequest.newBuilder() to construct.
  private AddChainRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AddChainRequest() {
    sender_ = com.google.protobuf.ByteString.EMPTY;
    name_ = "";
    keyType_ = 0;
    params_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AddChainRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.axelar.evm.v1beta1.TxProto.internal_static_axelar_evm_v1beta1_AddChainRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.axelar.evm.v1beta1.TxProto.internal_static_axelar_evm_v1beta1_AddChainRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.axelar.evm.v1beta1.AddChainRequest.class, com.axelar.evm.v1beta1.AddChainRequest.Builder.class);
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

  public static final int NAME_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   * <code>string name = 2 [json_name = "name", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   * <code>string name = 2 [json_name = "name", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KEY_TYPE_FIELD_NUMBER = 4;
  private int keyType_ = 0;
  /**
   * <code>.axelar.tss.exported.v1beta1.KeyType key_type = 4 [json_name = "keyType", deprecated = true];</code>
   * @deprecated axelar.evm.v1beta1.AddChainRequest.key_type is deprecated.
   *     See axelar/evm/v1beta1/tx.proto;l=240
   * @return The enum numeric value on the wire for keyType.
   */
  @java.lang.Override @java.lang.Deprecated public int getKeyTypeValue() {
    return keyType_;
  }
  /**
   * <code>.axelar.tss.exported.v1beta1.KeyType key_type = 4 [json_name = "keyType", deprecated = true];</code>
   * @deprecated axelar.evm.v1beta1.AddChainRequest.key_type is deprecated.
   *     See axelar/evm/v1beta1/tx.proto;l=240
   * @return The keyType.
   */
  @java.lang.Override @java.lang.Deprecated public com.axelar.tss.exported.v1beta1.KeyType getKeyType() {
    com.axelar.tss.exported.v1beta1.KeyType result = com.axelar.tss.exported.v1beta1.KeyType.forNumber(keyType_);
    return result == null ? com.axelar.tss.exported.v1beta1.KeyType.UNRECOGNIZED : result;
  }

  public static final int PARAMS_FIELD_NUMBER = 5;
  private com.google.protobuf.ByteString params_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <code>bytes params = 5 [json_name = "params", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Params"];</code>
   * @return The params.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParams() {
    return params_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, name_);
    }
    if (keyType_ != com.axelar.tss.exported.v1beta1.KeyType.KEY_TYPE_UNSPECIFIED.getNumber()) {
      output.writeEnum(4, keyType_);
    }
    if (!params_.isEmpty()) {
      output.writeBytes(5, params_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, name_);
    }
    if (keyType_ != com.axelar.tss.exported.v1beta1.KeyType.KEY_TYPE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, keyType_);
    }
    if (!params_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(5, params_);
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
    if (!(obj instanceof com.axelar.evm.v1beta1.AddChainRequest)) {
      return super.equals(obj);
    }
    com.axelar.evm.v1beta1.AddChainRequest other = (com.axelar.evm.v1beta1.AddChainRequest) obj;

    if (!getSender()
        .equals(other.getSender())) return false;
    if (!getName()
        .equals(other.getName())) return false;
    if (keyType_ != other.keyType_) return false;
    if (!getParams()
        .equals(other.getParams())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    hash = (37 * hash) + KEY_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + keyType_;
    hash = (37 * hash) + PARAMS_FIELD_NUMBER;
    hash = (53 * hash) + getParams().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.axelar.evm.v1beta1.AddChainRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.evm.v1beta1.AddChainRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.evm.v1beta1.AddChainRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.evm.v1beta1.AddChainRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.evm.v1beta1.AddChainRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.evm.v1beta1.AddChainRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.evm.v1beta1.AddChainRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.evm.v1beta1.AddChainRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.axelar.evm.v1beta1.AddChainRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.axelar.evm.v1beta1.AddChainRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.axelar.evm.v1beta1.AddChainRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.evm.v1beta1.AddChainRequest parseFrom(
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
  public static Builder newBuilder(com.axelar.evm.v1beta1.AddChainRequest prototype) {
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
   * Protobuf type {@code axelar.evm.v1beta1.AddChainRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:axelar.evm.v1beta1.AddChainRequest)
      com.axelar.evm.v1beta1.AddChainRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.axelar.evm.v1beta1.TxProto.internal_static_axelar_evm_v1beta1_AddChainRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.axelar.evm.v1beta1.TxProto.internal_static_axelar_evm_v1beta1_AddChainRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.axelar.evm.v1beta1.AddChainRequest.class, com.axelar.evm.v1beta1.AddChainRequest.Builder.class);
    }

    // Construct using com.axelar.evm.v1beta1.AddChainRequest.newBuilder()
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
      name_ = "";
      keyType_ = 0;
      params_ = com.google.protobuf.ByteString.EMPTY;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.axelar.evm.v1beta1.TxProto.internal_static_axelar_evm_v1beta1_AddChainRequest_descriptor;
    }

    @java.lang.Override
    public com.axelar.evm.v1beta1.AddChainRequest getDefaultInstanceForType() {
      return com.axelar.evm.v1beta1.AddChainRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.axelar.evm.v1beta1.AddChainRequest build() {
      com.axelar.evm.v1beta1.AddChainRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.axelar.evm.v1beta1.AddChainRequest buildPartial() {
      com.axelar.evm.v1beta1.AddChainRequest result = new com.axelar.evm.v1beta1.AddChainRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.axelar.evm.v1beta1.AddChainRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sender_ = sender_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.name_ = name_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.keyType_ = keyType_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.params_ = params_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.axelar.evm.v1beta1.AddChainRequest) {
        return mergeFrom((com.axelar.evm.v1beta1.AddChainRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.axelar.evm.v1beta1.AddChainRequest other) {
      if (other == com.axelar.evm.v1beta1.AddChainRequest.getDefaultInstance()) return this;
      if (other.getSender() != com.google.protobuf.ByteString.EMPTY) {
        setSender(other.getSender());
      }
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.keyType_ != 0) {
        setKeyTypeValue(other.getKeyTypeValue());
      }
      if (other.getParams() != com.google.protobuf.ByteString.EMPTY) {
        setParams(other.getParams());
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
            case 18: {
              name_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 32: {
              keyType_ = input.readEnum();
              bitField0_ |= 0x00000004;
              break;
            } // case 32
            case 42: {
              params_ = input.readBytes();
              bitField0_ |= 0x00000008;
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

    private java.lang.Object name_ = "";
    /**
     * <code>string name = 2 [json_name = "name", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string name = 2 [json_name = "name", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString
        getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string name = 2 [json_name = "name", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2 [json_name = "name", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string name = 2 [json_name = "name", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/nexus/exported.ChainName"];</code>
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int keyType_ = 0;
    /**
     * <code>.axelar.tss.exported.v1beta1.KeyType key_type = 4 [json_name = "keyType", deprecated = true];</code>
     * @deprecated axelar.evm.v1beta1.AddChainRequest.key_type is deprecated.
     *     See axelar/evm/v1beta1/tx.proto;l=240
     * @return The enum numeric value on the wire for keyType.
     */
    @java.lang.Override @java.lang.Deprecated public int getKeyTypeValue() {
      return keyType_;
    }
    /**
     * <code>.axelar.tss.exported.v1beta1.KeyType key_type = 4 [json_name = "keyType", deprecated = true];</code>
     * @deprecated axelar.evm.v1beta1.AddChainRequest.key_type is deprecated.
     *     See axelar/evm/v1beta1/tx.proto;l=240
     * @param value The enum numeric value on the wire for keyType to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setKeyTypeValue(int value) {
      keyType_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.axelar.tss.exported.v1beta1.KeyType key_type = 4 [json_name = "keyType", deprecated = true];</code>
     * @deprecated axelar.evm.v1beta1.AddChainRequest.key_type is deprecated.
     *     See axelar/evm/v1beta1/tx.proto;l=240
     * @return The keyType.
     */
    @java.lang.Override
    @java.lang.Deprecated public com.axelar.tss.exported.v1beta1.KeyType getKeyType() {
      com.axelar.tss.exported.v1beta1.KeyType result = com.axelar.tss.exported.v1beta1.KeyType.forNumber(keyType_);
      return result == null ? com.axelar.tss.exported.v1beta1.KeyType.UNRECOGNIZED : result;
    }
    /**
     * <code>.axelar.tss.exported.v1beta1.KeyType key_type = 4 [json_name = "keyType", deprecated = true];</code>
     * @deprecated axelar.evm.v1beta1.AddChainRequest.key_type is deprecated.
     *     See axelar/evm/v1beta1/tx.proto;l=240
     * @param value The keyType to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder setKeyType(com.axelar.tss.exported.v1beta1.KeyType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      keyType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.axelar.tss.exported.v1beta1.KeyType key_type = 4 [json_name = "keyType", deprecated = true];</code>
     * @deprecated axelar.evm.v1beta1.AddChainRequest.key_type is deprecated.
     *     See axelar/evm/v1beta1/tx.proto;l=240
     * @return This builder for chaining.
     */
    @java.lang.Deprecated public Builder clearKeyType() {
      bitField0_ = (bitField0_ & ~0x00000004);
      keyType_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString params_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <code>bytes params = 5 [json_name = "params", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Params"];</code>
     * @return The params.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getParams() {
      return params_;
    }
    /**
     * <code>bytes params = 5 [json_name = "params", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Params"];</code>
     * @param value The params to set.
     * @return This builder for chaining.
     */
    public Builder setParams(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      params_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>bytes params = 5 [json_name = "params", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "Params"];</code>
     * @return This builder for chaining.
     */
    public Builder clearParams() {
      bitField0_ = (bitField0_ & ~0x00000008);
      params_ = getDefaultInstance().getParams();
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


    // @@protoc_insertion_point(builder_scope:axelar.evm.v1beta1.AddChainRequest)
  }

  // @@protoc_insertion_point(class_scope:axelar.evm.v1beta1.AddChainRequest)
  private static final com.axelar.evm.v1beta1.AddChainRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.axelar.evm.v1beta1.AddChainRequest();
  }

  public static com.axelar.evm.v1beta1.AddChainRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AddChainRequest>
      PARSER = new com.google.protobuf.AbstractParser<AddChainRequest>() {
    @java.lang.Override
    public AddChainRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<AddChainRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AddChainRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.axelar.evm.v1beta1.AddChainRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

