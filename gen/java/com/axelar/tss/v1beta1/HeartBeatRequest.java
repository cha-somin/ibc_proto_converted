// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/tss/v1beta1/tx.proto

package com.axelar.tss.v1beta1;

/**
 * Protobuf type {@code axelar.tss.v1beta1.HeartBeatRequest}
 */
public final class HeartBeatRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:axelar.tss.v1beta1.HeartBeatRequest)
    HeartBeatRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use HeartBeatRequest.newBuilder() to construct.
  private HeartBeatRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private HeartBeatRequest() {
    sender_ = com.google.protobuf.ByteString.EMPTY;
    keyIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new HeartBeatRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.axelar.tss.v1beta1.TxProto.internal_static_axelar_tss_v1beta1_HeartBeatRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.axelar.tss.v1beta1.TxProto.internal_static_axelar_tss_v1beta1_HeartBeatRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.axelar.tss.v1beta1.HeartBeatRequest.class, com.axelar.tss.v1beta1.HeartBeatRequest.Builder.class);
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

  public static final int KEY_IDS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList keyIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string key_ids = 2 [json_name = "keyIds", (.gogoproto.customname) = "KeyIDs", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/tss/exported.KeyID"];</code>
   * @return A list containing the keyIds.
   */
  public com.google.protobuf.ProtocolStringList
      getKeyIdsList() {
    return keyIds_;
  }
  /**
   * <code>repeated string key_ids = 2 [json_name = "keyIds", (.gogoproto.customname) = "KeyIDs", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/tss/exported.KeyID"];</code>
   * @return The count of keyIds.
   */
  public int getKeyIdsCount() {
    return keyIds_.size();
  }
  /**
   * <code>repeated string key_ids = 2 [json_name = "keyIds", (.gogoproto.customname) = "KeyIDs", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/tss/exported.KeyID"];</code>
   * @param index The index of the element to return.
   * @return The keyIds at the given index.
   */
  public java.lang.String getKeyIds(int index) {
    return keyIds_.get(index);
  }
  /**
   * <code>repeated string key_ids = 2 [json_name = "keyIds", (.gogoproto.customname) = "KeyIDs", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/tss/exported.KeyID"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the keyIds at the given index.
   */
  public com.google.protobuf.ByteString
      getKeyIdsBytes(int index) {
    return keyIds_.getByteString(index);
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
    for (int i = 0; i < keyIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, keyIds_.getRaw(i));
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
    {
      int dataSize = 0;
      for (int i = 0; i < keyIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(keyIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getKeyIdsList().size();
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
    if (!(obj instanceof com.axelar.tss.v1beta1.HeartBeatRequest)) {
      return super.equals(obj);
    }
    com.axelar.tss.v1beta1.HeartBeatRequest other = (com.axelar.tss.v1beta1.HeartBeatRequest) obj;

    if (!getSender()
        .equals(other.getSender())) return false;
    if (!getKeyIdsList()
        .equals(other.getKeyIdsList())) return false;
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
    if (getKeyIdsCount() > 0) {
      hash = (37 * hash) + KEY_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getKeyIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.axelar.tss.v1beta1.HeartBeatRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.tss.v1beta1.HeartBeatRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.tss.v1beta1.HeartBeatRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.tss.v1beta1.HeartBeatRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.tss.v1beta1.HeartBeatRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.tss.v1beta1.HeartBeatRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.tss.v1beta1.HeartBeatRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.tss.v1beta1.HeartBeatRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.axelar.tss.v1beta1.HeartBeatRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.axelar.tss.v1beta1.HeartBeatRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.axelar.tss.v1beta1.HeartBeatRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.tss.v1beta1.HeartBeatRequest parseFrom(
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
  public static Builder newBuilder(com.axelar.tss.v1beta1.HeartBeatRequest prototype) {
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
   * Protobuf type {@code axelar.tss.v1beta1.HeartBeatRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:axelar.tss.v1beta1.HeartBeatRequest)
      com.axelar.tss.v1beta1.HeartBeatRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.axelar.tss.v1beta1.TxProto.internal_static_axelar_tss_v1beta1_HeartBeatRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.axelar.tss.v1beta1.TxProto.internal_static_axelar_tss_v1beta1_HeartBeatRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.axelar.tss.v1beta1.HeartBeatRequest.class, com.axelar.tss.v1beta1.HeartBeatRequest.Builder.class);
    }

    // Construct using com.axelar.tss.v1beta1.HeartBeatRequest.newBuilder()
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
      keyIds_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.axelar.tss.v1beta1.TxProto.internal_static_axelar_tss_v1beta1_HeartBeatRequest_descriptor;
    }

    @java.lang.Override
    public com.axelar.tss.v1beta1.HeartBeatRequest getDefaultInstanceForType() {
      return com.axelar.tss.v1beta1.HeartBeatRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.axelar.tss.v1beta1.HeartBeatRequest build() {
      com.axelar.tss.v1beta1.HeartBeatRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.axelar.tss.v1beta1.HeartBeatRequest buildPartial() {
      com.axelar.tss.v1beta1.HeartBeatRequest result = new com.axelar.tss.v1beta1.HeartBeatRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.axelar.tss.v1beta1.HeartBeatRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sender_ = sender_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        keyIds_.makeImmutable();
        result.keyIds_ = keyIds_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.axelar.tss.v1beta1.HeartBeatRequest) {
        return mergeFrom((com.axelar.tss.v1beta1.HeartBeatRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.axelar.tss.v1beta1.HeartBeatRequest other) {
      if (other == com.axelar.tss.v1beta1.HeartBeatRequest.getDefaultInstance()) return this;
      if (other.getSender() != com.google.protobuf.ByteString.EMPTY) {
        setSender(other.getSender());
      }
      if (!other.keyIds_.isEmpty()) {
        if (keyIds_.isEmpty()) {
          keyIds_ = other.keyIds_;
          bitField0_ |= 0x00000002;
        } else {
          ensureKeyIdsIsMutable();
          keyIds_.addAll(other.keyIds_);
        }
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
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureKeyIdsIsMutable();
              keyIds_.add(s);
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

    private com.google.protobuf.LazyStringArrayList keyIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureKeyIdsIsMutable() {
      if (!keyIds_.isModifiable()) {
        keyIds_ = new com.google.protobuf.LazyStringArrayList(keyIds_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <code>repeated string key_ids = 2 [json_name = "keyIds", (.gogoproto.customname) = "KeyIDs", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/tss/exported.KeyID"];</code>
     * @return A list containing the keyIds.
     */
    public com.google.protobuf.ProtocolStringList
        getKeyIdsList() {
      keyIds_.makeImmutable();
      return keyIds_;
    }
    /**
     * <code>repeated string key_ids = 2 [json_name = "keyIds", (.gogoproto.customname) = "KeyIDs", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/tss/exported.KeyID"];</code>
     * @return The count of keyIds.
     */
    public int getKeyIdsCount() {
      return keyIds_.size();
    }
    /**
     * <code>repeated string key_ids = 2 [json_name = "keyIds", (.gogoproto.customname) = "KeyIDs", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/tss/exported.KeyID"];</code>
     * @param index The index of the element to return.
     * @return The keyIds at the given index.
     */
    public java.lang.String getKeyIds(int index) {
      return keyIds_.get(index);
    }
    /**
     * <code>repeated string key_ids = 2 [json_name = "keyIds", (.gogoproto.customname) = "KeyIDs", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/tss/exported.KeyID"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the keyIds at the given index.
     */
    public com.google.protobuf.ByteString
        getKeyIdsBytes(int index) {
      return keyIds_.getByteString(index);
    }
    /**
     * <code>repeated string key_ids = 2 [json_name = "keyIds", (.gogoproto.customname) = "KeyIDs", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/tss/exported.KeyID"];</code>
     * @param index The index to set the value at.
     * @param value The keyIds to set.
     * @return This builder for chaining.
     */
    public Builder setKeyIds(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureKeyIdsIsMutable();
      keyIds_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string key_ids = 2 [json_name = "keyIds", (.gogoproto.customname) = "KeyIDs", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/tss/exported.KeyID"];</code>
     * @param value The keyIds to add.
     * @return This builder for chaining.
     */
    public Builder addKeyIds(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureKeyIdsIsMutable();
      keyIds_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string key_ids = 2 [json_name = "keyIds", (.gogoproto.customname) = "KeyIDs", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/tss/exported.KeyID"];</code>
     * @param values The keyIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllKeyIds(
        java.lang.Iterable<java.lang.String> values) {
      ensureKeyIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, keyIds_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string key_ids = 2 [json_name = "keyIds", (.gogoproto.customname) = "KeyIDs", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/tss/exported.KeyID"];</code>
     * @return This builder for chaining.
     */
    public Builder clearKeyIds() {
      keyIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string key_ids = 2 [json_name = "keyIds", (.gogoproto.customname) = "KeyIDs", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/tss/exported.KeyID"];</code>
     * @param value The bytes of the keyIds to add.
     * @return This builder for chaining.
     */
    public Builder addKeyIdsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureKeyIdsIsMutable();
      keyIds_.add(value);
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


    // @@protoc_insertion_point(builder_scope:axelar.tss.v1beta1.HeartBeatRequest)
  }

  // @@protoc_insertion_point(class_scope:axelar.tss.v1beta1.HeartBeatRequest)
  private static final com.axelar.tss.v1beta1.HeartBeatRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.axelar.tss.v1beta1.HeartBeatRequest();
  }

  public static com.axelar.tss.v1beta1.HeartBeatRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<HeartBeatRequest>
      PARSER = new com.google.protobuf.AbstractParser<HeartBeatRequest>() {
    @java.lang.Override
    public HeartBeatRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<HeartBeatRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<HeartBeatRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.axelar.tss.v1beta1.HeartBeatRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

