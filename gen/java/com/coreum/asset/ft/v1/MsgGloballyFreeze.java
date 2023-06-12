// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: coreum/asset/ft/v1/tx.proto

package com.coreum.asset.ft.v1;

/**
 * Protobuf type {@code coreum.asset.ft.v1.MsgGloballyFreeze}
 */
public final class MsgGloballyFreeze extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:coreum.asset.ft.v1.MsgGloballyFreeze)
    MsgGloballyFreezeOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgGloballyFreeze.newBuilder() to construct.
  private MsgGloballyFreeze(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgGloballyFreeze() {
    sender_ = "";
    denom_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgGloballyFreeze();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.coreum.asset.ft.v1.TxProto.internal_static_coreum_asset_ft_v1_MsgGloballyFreeze_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.coreum.asset.ft.v1.TxProto.internal_static_coreum_asset_ft_v1_MsgGloballyFreeze_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.coreum.asset.ft.v1.MsgGloballyFreeze.class, com.coreum.asset.ft.v1.MsgGloballyFreeze.Builder.class);
  }

  public static final int SENDER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object sender_ = "";
  /**
   * <code>string sender = 1 [json_name = "sender"];</code>
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
   * <code>string sender = 1 [json_name = "sender"];</code>
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

  public static final int DENOM_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object denom_ = "";
  /**
   * <code>string denom = 2 [json_name = "denom"];</code>
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
   * <code>string denom = 2 [json_name = "denom"];</code>
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sender_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sender_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, denom_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(denom_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, denom_);
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
    if (!(obj instanceof com.coreum.asset.ft.v1.MsgGloballyFreeze)) {
      return super.equals(obj);
    }
    com.coreum.asset.ft.v1.MsgGloballyFreeze other = (com.coreum.asset.ft.v1.MsgGloballyFreeze) obj;

    if (!getSender()
        .equals(other.getSender())) return false;
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
    hash = (37 * hash) + DENOM_FIELD_NUMBER;
    hash = (53 * hash) + getDenom().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.coreum.asset.ft.v1.MsgGloballyFreeze parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.coreum.asset.ft.v1.MsgGloballyFreeze parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.coreum.asset.ft.v1.MsgGloballyFreeze parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.coreum.asset.ft.v1.MsgGloballyFreeze parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.coreum.asset.ft.v1.MsgGloballyFreeze parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.coreum.asset.ft.v1.MsgGloballyFreeze parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.coreum.asset.ft.v1.MsgGloballyFreeze parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.coreum.asset.ft.v1.MsgGloballyFreeze parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.coreum.asset.ft.v1.MsgGloballyFreeze parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.coreum.asset.ft.v1.MsgGloballyFreeze parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.coreum.asset.ft.v1.MsgGloballyFreeze parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.coreum.asset.ft.v1.MsgGloballyFreeze parseFrom(
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
  public static Builder newBuilder(com.coreum.asset.ft.v1.MsgGloballyFreeze prototype) {
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
   * Protobuf type {@code coreum.asset.ft.v1.MsgGloballyFreeze}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:coreum.asset.ft.v1.MsgGloballyFreeze)
      com.coreum.asset.ft.v1.MsgGloballyFreezeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.coreum.asset.ft.v1.TxProto.internal_static_coreum_asset_ft_v1_MsgGloballyFreeze_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.coreum.asset.ft.v1.TxProto.internal_static_coreum_asset_ft_v1_MsgGloballyFreeze_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.coreum.asset.ft.v1.MsgGloballyFreeze.class, com.coreum.asset.ft.v1.MsgGloballyFreeze.Builder.class);
    }

    // Construct using com.coreum.asset.ft.v1.MsgGloballyFreeze.newBuilder()
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
      denom_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.coreum.asset.ft.v1.TxProto.internal_static_coreum_asset_ft_v1_MsgGloballyFreeze_descriptor;
    }

    @java.lang.Override
    public com.coreum.asset.ft.v1.MsgGloballyFreeze getDefaultInstanceForType() {
      return com.coreum.asset.ft.v1.MsgGloballyFreeze.getDefaultInstance();
    }

    @java.lang.Override
    public com.coreum.asset.ft.v1.MsgGloballyFreeze build() {
      com.coreum.asset.ft.v1.MsgGloballyFreeze result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.coreum.asset.ft.v1.MsgGloballyFreeze buildPartial() {
      com.coreum.asset.ft.v1.MsgGloballyFreeze result = new com.coreum.asset.ft.v1.MsgGloballyFreeze(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.coreum.asset.ft.v1.MsgGloballyFreeze result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sender_ = sender_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.denom_ = denom_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.coreum.asset.ft.v1.MsgGloballyFreeze) {
        return mergeFrom((com.coreum.asset.ft.v1.MsgGloballyFreeze)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.coreum.asset.ft.v1.MsgGloballyFreeze other) {
      if (other == com.coreum.asset.ft.v1.MsgGloballyFreeze.getDefaultInstance()) return this;
      if (!other.getSender().isEmpty()) {
        sender_ = other.sender_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getDenom().isEmpty()) {
        denom_ = other.denom_;
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
            case 10: {
              sender_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              denom_ = input.readStringRequireUtf8();
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
     * <code>string sender = 1 [json_name = "sender"];</code>
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
     * <code>string sender = 1 [json_name = "sender"];</code>
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
     * <code>string sender = 1 [json_name = "sender"];</code>
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
     * <code>string sender = 1 [json_name = "sender"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSender() {
      sender_ = getDefaultInstance().getSender();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string sender = 1 [json_name = "sender"];</code>
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

    private java.lang.Object denom_ = "";
    /**
     * <code>string denom = 2 [json_name = "denom"];</code>
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
     * <code>string denom = 2 [json_name = "denom"];</code>
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
     * <code>string denom = 2 [json_name = "denom"];</code>
     * @param value The denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenom(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      denom_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string denom = 2 [json_name = "denom"];</code>
     * @return This builder for chaining.
     */
    public Builder clearDenom() {
      denom_ = getDefaultInstance().getDenom();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string denom = 2 [json_name = "denom"];</code>
     * @param value The bytes for denom to set.
     * @return This builder for chaining.
     */
    public Builder setDenomBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      denom_ = value;
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


    // @@protoc_insertion_point(builder_scope:coreum.asset.ft.v1.MsgGloballyFreeze)
  }

  // @@protoc_insertion_point(class_scope:coreum.asset.ft.v1.MsgGloballyFreeze)
  private static final com.coreum.asset.ft.v1.MsgGloballyFreeze DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.coreum.asset.ft.v1.MsgGloballyFreeze();
  }

  public static com.coreum.asset.ft.v1.MsgGloballyFreeze getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgGloballyFreeze>
      PARSER = new com.google.protobuf.AbstractParser<MsgGloballyFreeze>() {
    @java.lang.Override
    public MsgGloballyFreeze parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgGloballyFreeze> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgGloballyFreeze> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.coreum.asset.ft.v1.MsgGloballyFreeze getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

