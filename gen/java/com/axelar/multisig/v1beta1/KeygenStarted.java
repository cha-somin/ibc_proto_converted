// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/multisig/v1beta1/events.proto

package com.axelar.multisig.v1beta1;

/**
 * Protobuf type {@code axelar.multisig.v1beta1.KeygenStarted}
 */
public final class KeygenStarted extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:axelar.multisig.v1beta1.KeygenStarted)
    KeygenStartedOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeygenStarted.newBuilder() to construct.
  private KeygenStarted(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeygenStarted() {
    module_ = "";
    keyId_ = "";
    participants_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KeygenStarted();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.axelar.multisig.v1beta1.EventsProto.internal_static_axelar_multisig_v1beta1_KeygenStarted_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.axelar.multisig.v1beta1.EventsProto.internal_static_axelar_multisig_v1beta1_KeygenStarted_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.axelar.multisig.v1beta1.KeygenStarted.class, com.axelar.multisig.v1beta1.KeygenStarted.Builder.class);
  }

  public static final int MODULE_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object module_ = "";
  /**
   * <code>string module = 1 [json_name = "module"];</code>
   * @return The module.
   */
  @java.lang.Override
  public java.lang.String getModule() {
    java.lang.Object ref = module_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      module_ = s;
      return s;
    }
  }
  /**
   * <code>string module = 1 [json_name = "module"];</code>
   * @return The bytes for module.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getModuleBytes() {
    java.lang.Object ref = module_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      module_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KEY_ID_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object keyId_ = "";
  /**
   * <code>string key_id = 2 [json_name = "keyId", (.gogoproto.customname) = "KeyID", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyID"];</code>
   * @return The keyId.
   */
  @java.lang.Override
  public java.lang.String getKeyId() {
    java.lang.Object ref = keyId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      keyId_ = s;
      return s;
    }
  }
  /**
   * <code>string key_id = 2 [json_name = "keyId", (.gogoproto.customname) = "KeyID", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyID"];</code>
   * @return The bytes for keyId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getKeyIdBytes() {
    java.lang.Object ref = keyId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      keyId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARTICIPANTS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private java.util.List<com.google.protobuf.ByteString> participants_;
  /**
   * <code>repeated bytes participants = 3 [json_name = "participants", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.ValAddress"];</code>
   * @return A list containing the participants.
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.ByteString>
      getParticipantsList() {
    return participants_;
  }
  /**
   * <code>repeated bytes participants = 3 [json_name = "participants", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.ValAddress"];</code>
   * @return The count of participants.
   */
  public int getParticipantsCount() {
    return participants_.size();
  }
  /**
   * <code>repeated bytes participants = 3 [json_name = "participants", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.ValAddress"];</code>
   * @param index The index of the element to return.
   * @return The participants at the given index.
   */
  public com.google.protobuf.ByteString getParticipants(int index) {
    return participants_.get(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(module_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, module_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keyId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, keyId_);
    }
    for (int i = 0; i < participants_.size(); i++) {
      output.writeBytes(3, participants_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(module_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, module_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keyId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, keyId_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < participants_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(participants_.get(i));
      }
      size += dataSize;
      size += 1 * getParticipantsList().size();
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
    if (!(obj instanceof com.axelar.multisig.v1beta1.KeygenStarted)) {
      return super.equals(obj);
    }
    com.axelar.multisig.v1beta1.KeygenStarted other = (com.axelar.multisig.v1beta1.KeygenStarted) obj;

    if (!getModule()
        .equals(other.getModule())) return false;
    if (!getKeyId()
        .equals(other.getKeyId())) return false;
    if (!getParticipantsList()
        .equals(other.getParticipantsList())) return false;
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
    hash = (37 * hash) + MODULE_FIELD_NUMBER;
    hash = (53 * hash) + getModule().hashCode();
    hash = (37 * hash) + KEY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getKeyId().hashCode();
    if (getParticipantsCount() > 0) {
      hash = (37 * hash) + PARTICIPANTS_FIELD_NUMBER;
      hash = (53 * hash) + getParticipantsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.axelar.multisig.v1beta1.KeygenStarted parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.multisig.v1beta1.KeygenStarted parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.multisig.v1beta1.KeygenStarted parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.multisig.v1beta1.KeygenStarted parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.multisig.v1beta1.KeygenStarted parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.multisig.v1beta1.KeygenStarted parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.multisig.v1beta1.KeygenStarted parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.multisig.v1beta1.KeygenStarted parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.axelar.multisig.v1beta1.KeygenStarted parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.axelar.multisig.v1beta1.KeygenStarted parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.axelar.multisig.v1beta1.KeygenStarted parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.multisig.v1beta1.KeygenStarted parseFrom(
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
  public static Builder newBuilder(com.axelar.multisig.v1beta1.KeygenStarted prototype) {
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
   * Protobuf type {@code axelar.multisig.v1beta1.KeygenStarted}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:axelar.multisig.v1beta1.KeygenStarted)
      com.axelar.multisig.v1beta1.KeygenStartedOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.axelar.multisig.v1beta1.EventsProto.internal_static_axelar_multisig_v1beta1_KeygenStarted_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.axelar.multisig.v1beta1.EventsProto.internal_static_axelar_multisig_v1beta1_KeygenStarted_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.axelar.multisig.v1beta1.KeygenStarted.class, com.axelar.multisig.v1beta1.KeygenStarted.Builder.class);
    }

    // Construct using com.axelar.multisig.v1beta1.KeygenStarted.newBuilder()
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
      module_ = "";
      keyId_ = "";
      participants_ = java.util.Collections.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.axelar.multisig.v1beta1.EventsProto.internal_static_axelar_multisig_v1beta1_KeygenStarted_descriptor;
    }

    @java.lang.Override
    public com.axelar.multisig.v1beta1.KeygenStarted getDefaultInstanceForType() {
      return com.axelar.multisig.v1beta1.KeygenStarted.getDefaultInstance();
    }

    @java.lang.Override
    public com.axelar.multisig.v1beta1.KeygenStarted build() {
      com.axelar.multisig.v1beta1.KeygenStarted result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.axelar.multisig.v1beta1.KeygenStarted buildPartial() {
      com.axelar.multisig.v1beta1.KeygenStarted result = new com.axelar.multisig.v1beta1.KeygenStarted(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.axelar.multisig.v1beta1.KeygenStarted result) {
      if (((bitField0_ & 0x00000004) != 0)) {
        participants_ = java.util.Collections.unmodifiableList(participants_);
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.participants_ = participants_;
    }

    private void buildPartial0(com.axelar.multisig.v1beta1.KeygenStarted result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.module_ = module_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.keyId_ = keyId_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.axelar.multisig.v1beta1.KeygenStarted) {
        return mergeFrom((com.axelar.multisig.v1beta1.KeygenStarted)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.axelar.multisig.v1beta1.KeygenStarted other) {
      if (other == com.axelar.multisig.v1beta1.KeygenStarted.getDefaultInstance()) return this;
      if (!other.getModule().isEmpty()) {
        module_ = other.module_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getKeyId().isEmpty()) {
        keyId_ = other.keyId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.participants_.isEmpty()) {
        if (participants_.isEmpty()) {
          participants_ = other.participants_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensureParticipantsIsMutable();
          participants_.addAll(other.participants_);
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
              module_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              keyId_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              com.google.protobuf.ByteString v = input.readBytes();
              ensureParticipantsIsMutable();
              participants_.add(v);
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

    private java.lang.Object module_ = "";
    /**
     * <code>string module = 1 [json_name = "module"];</code>
     * @return The module.
     */
    public java.lang.String getModule() {
      java.lang.Object ref = module_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        module_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string module = 1 [json_name = "module"];</code>
     * @return The bytes for module.
     */
    public com.google.protobuf.ByteString
        getModuleBytes() {
      java.lang.Object ref = module_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        module_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string module = 1 [json_name = "module"];</code>
     * @param value The module to set.
     * @return This builder for chaining.
     */
    public Builder setModule(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      module_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string module = 1 [json_name = "module"];</code>
     * @return This builder for chaining.
     */
    public Builder clearModule() {
      module_ = getDefaultInstance().getModule();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string module = 1 [json_name = "module"];</code>
     * @param value The bytes for module to set.
     * @return This builder for chaining.
     */
    public Builder setModuleBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      module_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object keyId_ = "";
    /**
     * <code>string key_id = 2 [json_name = "keyId", (.gogoproto.customname) = "KeyID", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyID"];</code>
     * @return The keyId.
     */
    public java.lang.String getKeyId() {
      java.lang.Object ref = keyId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        keyId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string key_id = 2 [json_name = "keyId", (.gogoproto.customname) = "KeyID", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyID"];</code>
     * @return The bytes for keyId.
     */
    public com.google.protobuf.ByteString
        getKeyIdBytes() {
      java.lang.Object ref = keyId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        keyId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string key_id = 2 [json_name = "keyId", (.gogoproto.customname) = "KeyID", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyID"];</code>
     * @param value The keyId to set.
     * @return This builder for chaining.
     */
    public Builder setKeyId(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      keyId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>string key_id = 2 [json_name = "keyId", (.gogoproto.customname) = "KeyID", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyID"];</code>
     * @return This builder for chaining.
     */
    public Builder clearKeyId() {
      keyId_ = getDefaultInstance().getKeyId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <code>string key_id = 2 [json_name = "keyId", (.gogoproto.customname) = "KeyID", (.gogoproto.casttype) = "github.com/axelarnetwork/axelar-core/x/multisig/exported.KeyID"];</code>
     * @param value The bytes for keyId to set.
     * @return This builder for chaining.
     */
    public Builder setKeyIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      keyId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.util.List<com.google.protobuf.ByteString> participants_ = java.util.Collections.emptyList();
    private void ensureParticipantsIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        participants_ = new java.util.ArrayList<com.google.protobuf.ByteString>(participants_);
        bitField0_ |= 0x00000004;
      }
    }
    /**
     * <code>repeated bytes participants = 3 [json_name = "participants", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.ValAddress"];</code>
     * @return A list containing the participants.
     */
    public java.util.List<com.google.protobuf.ByteString>
        getParticipantsList() {
      return ((bitField0_ & 0x00000004) != 0) ?
               java.util.Collections.unmodifiableList(participants_) : participants_;
    }
    /**
     * <code>repeated bytes participants = 3 [json_name = "participants", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.ValAddress"];</code>
     * @return The count of participants.
     */
    public int getParticipantsCount() {
      return participants_.size();
    }
    /**
     * <code>repeated bytes participants = 3 [json_name = "participants", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.ValAddress"];</code>
     * @param index The index of the element to return.
     * @return The participants at the given index.
     */
    public com.google.protobuf.ByteString getParticipants(int index) {
      return participants_.get(index);
    }
    /**
     * <code>repeated bytes participants = 3 [json_name = "participants", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.ValAddress"];</code>
     * @param index The index to set the value at.
     * @param value The participants to set.
     * @return This builder for chaining.
     */
    public Builder setParticipants(
        int index, com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      ensureParticipantsIsMutable();
      participants_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes participants = 3 [json_name = "participants", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.ValAddress"];</code>
     * @param value The participants to add.
     * @return This builder for chaining.
     */
    public Builder addParticipants(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      ensureParticipantsIsMutable();
      participants_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes participants = 3 [json_name = "participants", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.ValAddress"];</code>
     * @param values The participants to add.
     * @return This builder for chaining.
     */
    public Builder addAllParticipants(
        java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
      ensureParticipantsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, participants_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated bytes participants = 3 [json_name = "participants", (.gogoproto.casttype) = "github.com/cosmos/cosmos-sdk/types.ValAddress"];</code>
     * @return This builder for chaining.
     */
    public Builder clearParticipants() {
      participants_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);
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


    // @@protoc_insertion_point(builder_scope:axelar.multisig.v1beta1.KeygenStarted)
  }

  // @@protoc_insertion_point(class_scope:axelar.multisig.v1beta1.KeygenStarted)
  private static final com.axelar.multisig.v1beta1.KeygenStarted DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.axelar.multisig.v1beta1.KeygenStarted();
  }

  public static com.axelar.multisig.v1beta1.KeygenStarted getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeygenStarted>
      PARSER = new com.google.protobuf.AbstractParser<KeygenStarted>() {
    @java.lang.Override
    public KeygenStarted parsePartialFrom(
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

  public static com.google.protobuf.Parser<KeygenStarted> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeygenStarted> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.axelar.multisig.v1beta1.KeygenStarted getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

