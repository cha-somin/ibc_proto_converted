// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/tss/v1beta1/tx.proto

package com.axelar.tss.v1beta1;

/**
 * <pre>
 * StartKeygenRequest indicate the start of keygen
 * </pre>
 *
 * Protobuf type {@code axelar.tss.v1beta1.StartKeygenRequest}
 */
public final class StartKeygenRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:axelar.tss.v1beta1.StartKeygenRequest)
    StartKeygenRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use StartKeygenRequest.newBuilder() to construct.
  private StartKeygenRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private StartKeygenRequest() {
    sender_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new StartKeygenRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.axelar.tss.v1beta1.TxProto.internal_static_axelar_tss_v1beta1_StartKeygenRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.axelar.tss.v1beta1.TxProto.internal_static_axelar_tss_v1beta1_StartKeygenRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.axelar.tss.v1beta1.StartKeygenRequest.class, com.axelar.tss.v1beta1.StartKeygenRequest.Builder.class);
  }

  public static final int SENDER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object sender_ = "";
  /**
   * <code>string sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
   * @return The sender.
   */
  @java.lang.Override
  public java.lang.String getSender() {
    java.lang.Object ref = sender_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sender_ = s;
      return s;
    }
  }
  /**
   * <code>string sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
   * @return The bytes for sender.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getSenderBytes() {
    java.lang.Object ref = sender_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      sender_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KEY_INFO_FIELD_NUMBER = 2;
  private com.axelar.tss.v1beta1.KeyInfo keyInfo_;
  /**
   * <code>.axelar.tss.v1beta1.KeyInfo key_info = 2 [json_name = "keyInfo", (.gogoproto.nullable) = false];</code>
   * @return Whether the keyInfo field is set.
   */
  @java.lang.Override
  public boolean hasKeyInfo() {
    return keyInfo_ != null;
  }
  /**
   * <code>.axelar.tss.v1beta1.KeyInfo key_info = 2 [json_name = "keyInfo", (.gogoproto.nullable) = false];</code>
   * @return The keyInfo.
   */
  @java.lang.Override
  public com.axelar.tss.v1beta1.KeyInfo getKeyInfo() {
    return keyInfo_ == null ? com.axelar.tss.v1beta1.KeyInfo.getDefaultInstance() : keyInfo_;
  }
  /**
   * <code>.axelar.tss.v1beta1.KeyInfo key_info = 2 [json_name = "keyInfo", (.gogoproto.nullable) = false];</code>
   */
  @java.lang.Override
  public com.axelar.tss.v1beta1.KeyInfoOrBuilder getKeyInfoOrBuilder() {
    return keyInfo_ == null ? com.axelar.tss.v1beta1.KeyInfo.getDefaultInstance() : keyInfo_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sender_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sender_);
    }
    if (keyInfo_ != null) {
      output.writeMessage(2, getKeyInfo());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sender_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sender_);
    }
    if (keyInfo_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getKeyInfo());
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
    if (!(obj instanceof com.axelar.tss.v1beta1.StartKeygenRequest)) {
      return super.equals(obj);
    }
    com.axelar.tss.v1beta1.StartKeygenRequest other = (com.axelar.tss.v1beta1.StartKeygenRequest) obj;

    if (!getSender()
        .equals(other.getSender())) return false;
    if (hasKeyInfo() != other.hasKeyInfo()) return false;
    if (hasKeyInfo()) {
      if (!getKeyInfo()
          .equals(other.getKeyInfo())) return false;
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
    hash = (37 * hash) + SENDER_FIELD_NUMBER;
    hash = (53 * hash) + getSender().hashCode();
    if (hasKeyInfo()) {
      hash = (37 * hash) + KEY_INFO_FIELD_NUMBER;
      hash = (53 * hash) + getKeyInfo().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.axelar.tss.v1beta1.StartKeygenRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.tss.v1beta1.StartKeygenRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.tss.v1beta1.StartKeygenRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.tss.v1beta1.StartKeygenRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.tss.v1beta1.StartKeygenRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.tss.v1beta1.StartKeygenRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.tss.v1beta1.StartKeygenRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.tss.v1beta1.StartKeygenRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.axelar.tss.v1beta1.StartKeygenRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.axelar.tss.v1beta1.StartKeygenRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.axelar.tss.v1beta1.StartKeygenRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.tss.v1beta1.StartKeygenRequest parseFrom(
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
  public static Builder newBuilder(com.axelar.tss.v1beta1.StartKeygenRequest prototype) {
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
   * StartKeygenRequest indicate the start of keygen
   * </pre>
   *
   * Protobuf type {@code axelar.tss.v1beta1.StartKeygenRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:axelar.tss.v1beta1.StartKeygenRequest)
      com.axelar.tss.v1beta1.StartKeygenRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.axelar.tss.v1beta1.TxProto.internal_static_axelar_tss_v1beta1_StartKeygenRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.axelar.tss.v1beta1.TxProto.internal_static_axelar_tss_v1beta1_StartKeygenRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.axelar.tss.v1beta1.StartKeygenRequest.class, com.axelar.tss.v1beta1.StartKeygenRequest.Builder.class);
    }

    // Construct using com.axelar.tss.v1beta1.StartKeygenRequest.newBuilder()
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
      sender_ = "";
      keyInfo_ = null;
      if (keyInfoBuilder_ != null) {
        keyInfoBuilder_.dispose();
        keyInfoBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.axelar.tss.v1beta1.TxProto.internal_static_axelar_tss_v1beta1_StartKeygenRequest_descriptor;
    }

    @java.lang.Override
    public com.axelar.tss.v1beta1.StartKeygenRequest getDefaultInstanceForType() {
      return com.axelar.tss.v1beta1.StartKeygenRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.axelar.tss.v1beta1.StartKeygenRequest build() {
      com.axelar.tss.v1beta1.StartKeygenRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.axelar.tss.v1beta1.StartKeygenRequest buildPartial() {
      com.axelar.tss.v1beta1.StartKeygenRequest result = new com.axelar.tss.v1beta1.StartKeygenRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.axelar.tss.v1beta1.StartKeygenRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sender_ = sender_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.keyInfo_ = keyInfoBuilder_ == null
            ? keyInfo_
            : keyInfoBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.axelar.tss.v1beta1.StartKeygenRequest) {
        return mergeFrom((com.axelar.tss.v1beta1.StartKeygenRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.axelar.tss.v1beta1.StartKeygenRequest other) {
      if (other == com.axelar.tss.v1beta1.StartKeygenRequest.getDefaultInstance()) return this;
      if (!other.getSender().isEmpty()) {
        sender_ = other.sender_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasKeyInfo()) {
        mergeKeyInfo(other.getKeyInfo());
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
              sender_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getKeyInfoFieldBuilder().getBuilder(),
                  extensionRegistry);
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

    private java.lang.Object sender_ = "";
    /**
     * <code>string sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
     * @return The sender.
     */
    public java.lang.String getSender() {
      java.lang.Object ref = sender_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sender_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
     * @return The bytes for sender.
     */
    public com.google.protobuf.ByteString
        getSenderBytes() {
      java.lang.Object ref = sender_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        sender_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
     * @param value The sender to set.
     * @return This builder for chaining.
     */
    public Builder setSender(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      sender_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSender() {
      sender_ = getDefaultInstance().getSender();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string sender = 1 [json_name = "sender", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.AccAddress"];</code>
     * @param value The bytes for sender to set.
     * @return This builder for chaining.
     */
    public Builder setSenderBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      sender_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.axelar.tss.v1beta1.KeyInfo keyInfo_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.axelar.tss.v1beta1.KeyInfo, com.axelar.tss.v1beta1.KeyInfo.Builder, com.axelar.tss.v1beta1.KeyInfoOrBuilder> keyInfoBuilder_;
    /**
     * <code>.axelar.tss.v1beta1.KeyInfo key_info = 2 [json_name = "keyInfo", (.gogoproto.nullable) = false];</code>
     * @return Whether the keyInfo field is set.
     */
    public boolean hasKeyInfo() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.axelar.tss.v1beta1.KeyInfo key_info = 2 [json_name = "keyInfo", (.gogoproto.nullable) = false];</code>
     * @return The keyInfo.
     */
    public com.axelar.tss.v1beta1.KeyInfo getKeyInfo() {
      if (keyInfoBuilder_ == null) {
        return keyInfo_ == null ? com.axelar.tss.v1beta1.KeyInfo.getDefaultInstance() : keyInfo_;
      } else {
        return keyInfoBuilder_.getMessage();
      }
    }
    /**
     * <code>.axelar.tss.v1beta1.KeyInfo key_info = 2 [json_name = "keyInfo", (.gogoproto.nullable) = false];</code>
     */
    public Builder setKeyInfo(com.axelar.tss.v1beta1.KeyInfo value) {
      if (keyInfoBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        keyInfo_ = value;
      } else {
        keyInfoBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.axelar.tss.v1beta1.KeyInfo key_info = 2 [json_name = "keyInfo", (.gogoproto.nullable) = false];</code>
     */
    public Builder setKeyInfo(
        com.axelar.tss.v1beta1.KeyInfo.Builder builderForValue) {
      if (keyInfoBuilder_ == null) {
        keyInfo_ = builderForValue.build();
      } else {
        keyInfoBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.axelar.tss.v1beta1.KeyInfo key_info = 2 [json_name = "keyInfo", (.gogoproto.nullable) = false];</code>
     */
    public Builder mergeKeyInfo(com.axelar.tss.v1beta1.KeyInfo value) {
      if (keyInfoBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          keyInfo_ != null &&
          keyInfo_ != com.axelar.tss.v1beta1.KeyInfo.getDefaultInstance()) {
          getKeyInfoBuilder().mergeFrom(value);
        } else {
          keyInfo_ = value;
        }
      } else {
        keyInfoBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.axelar.tss.v1beta1.KeyInfo key_info = 2 [json_name = "keyInfo", (.gogoproto.nullable) = false];</code>
     */
    public Builder clearKeyInfo() {
      bitField0_ = (bitField0_ & ~0x00000002);
      keyInfo_ = null;
      if (keyInfoBuilder_ != null) {
        keyInfoBuilder_.dispose();
        keyInfoBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.axelar.tss.v1beta1.KeyInfo key_info = 2 [json_name = "keyInfo", (.gogoproto.nullable) = false];</code>
     */
    public com.axelar.tss.v1beta1.KeyInfo.Builder getKeyInfoBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getKeyInfoFieldBuilder().getBuilder();
    }
    /**
     * <code>.axelar.tss.v1beta1.KeyInfo key_info = 2 [json_name = "keyInfo", (.gogoproto.nullable) = false];</code>
     */
    public com.axelar.tss.v1beta1.KeyInfoOrBuilder getKeyInfoOrBuilder() {
      if (keyInfoBuilder_ != null) {
        return keyInfoBuilder_.getMessageOrBuilder();
      } else {
        return keyInfo_ == null ?
            com.axelar.tss.v1beta1.KeyInfo.getDefaultInstance() : keyInfo_;
      }
    }
    /**
     * <code>.axelar.tss.v1beta1.KeyInfo key_info = 2 [json_name = "keyInfo", (.gogoproto.nullable) = false];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.axelar.tss.v1beta1.KeyInfo, com.axelar.tss.v1beta1.KeyInfo.Builder, com.axelar.tss.v1beta1.KeyInfoOrBuilder> 
        getKeyInfoFieldBuilder() {
      if (keyInfoBuilder_ == null) {
        keyInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.axelar.tss.v1beta1.KeyInfo, com.axelar.tss.v1beta1.KeyInfo.Builder, com.axelar.tss.v1beta1.KeyInfoOrBuilder>(
                getKeyInfo(),
                getParentForChildren(),
                isClean());
        keyInfo_ = null;
      }
      return keyInfoBuilder_;
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


    // @@protoc_insertion_point(builder_scope:axelar.tss.v1beta1.StartKeygenRequest)
  }

  // @@protoc_insertion_point(class_scope:axelar.tss.v1beta1.StartKeygenRequest)
  private static final com.axelar.tss.v1beta1.StartKeygenRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.axelar.tss.v1beta1.StartKeygenRequest();
  }

  public static com.axelar.tss.v1beta1.StartKeygenRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StartKeygenRequest>
      PARSER = new com.google.protobuf.AbstractParser<StartKeygenRequest>() {
    @java.lang.Override
    public StartKeygenRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<StartKeygenRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StartKeygenRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.axelar.tss.v1beta1.StartKeygenRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

