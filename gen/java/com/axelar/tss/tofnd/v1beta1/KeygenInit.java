// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: axelar/tss/tofnd/v1beta1/tofnd.proto

package com.axelar.tss.tofnd.v1beta1;

/**
 * Protobuf type {@code axelar.tss.tofnd.v1beta1.KeygenInit}
 */
public final class KeygenInit extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:axelar.tss.tofnd.v1beta1.KeygenInit)
    KeygenInitOrBuilder {
private static final long serialVersionUID = 0L;
  // Use KeygenInit.newBuilder() to construct.
  private KeygenInit(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private KeygenInit() {
    newKeyUid_ = "";
    partyUids_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    partyShareCounts_ = emptyIntList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new KeygenInit();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.axelar.tss.tofnd.v1beta1.TofndProto.internal_static_axelar_tss_tofnd_v1beta1_KeygenInit_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.axelar.tss.tofnd.v1beta1.TofndProto.internal_static_axelar_tss_tofnd_v1beta1_KeygenInit_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.axelar.tss.tofnd.v1beta1.KeygenInit.class, com.axelar.tss.tofnd.v1beta1.KeygenInit.Builder.class);
  }

  public static final int NEW_KEY_UID_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object newKeyUid_ = "";
  /**
   * <code>string new_key_uid = 1 [json_name = "newKeyUid"];</code>
   * @return The newKeyUid.
   */
  @java.lang.Override
  public java.lang.String getNewKeyUid() {
    java.lang.Object ref = newKeyUid_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      newKeyUid_ = s;
      return s;
    }
  }
  /**
   * <code>string new_key_uid = 1 [json_name = "newKeyUid"];</code>
   * @return The bytes for newKeyUid.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getNewKeyUidBytes() {
    java.lang.Object ref = newKeyUid_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      newKeyUid_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PARTY_UIDS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList partyUids_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string party_uids = 2 [json_name = "partyUids"];</code>
   * @return A list containing the partyUids.
   */
  public com.google.protobuf.ProtocolStringList
      getPartyUidsList() {
    return partyUids_;
  }
  /**
   * <code>repeated string party_uids = 2 [json_name = "partyUids"];</code>
   * @return The count of partyUids.
   */
  public int getPartyUidsCount() {
    return partyUids_.size();
  }
  /**
   * <code>repeated string party_uids = 2 [json_name = "partyUids"];</code>
   * @param index The index of the element to return.
   * @return The partyUids at the given index.
   */
  public java.lang.String getPartyUids(int index) {
    return partyUids_.get(index);
  }
  /**
   * <code>repeated string party_uids = 2 [json_name = "partyUids"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the partyUids at the given index.
   */
  public com.google.protobuf.ByteString
      getPartyUidsBytes(int index) {
    return partyUids_.getByteString(index);
  }

  public static final int PARTY_SHARE_COUNTS_FIELD_NUMBER = 5;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.IntList partyShareCounts_;
  /**
   * <code>repeated uint32 party_share_counts = 5 [json_name = "partyShareCounts"];</code>
   * @return A list containing the partyShareCounts.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getPartyShareCountsList() {
    return partyShareCounts_;
  }
  /**
   * <code>repeated uint32 party_share_counts = 5 [json_name = "partyShareCounts"];</code>
   * @return The count of partyShareCounts.
   */
  public int getPartyShareCountsCount() {
    return partyShareCounts_.size();
  }
  /**
   * <code>repeated uint32 party_share_counts = 5 [json_name = "partyShareCounts"];</code>
   * @param index The index of the element to return.
   * @return The partyShareCounts at the given index.
   */
  public int getPartyShareCounts(int index) {
    return partyShareCounts_.getInt(index);
  }
  private int partyShareCountsMemoizedSerializedSize = -1;

  public static final int MY_PARTY_INDEX_FIELD_NUMBER = 3;
  private int myPartyIndex_ = 0;
  /**
   * <pre>
   * parties[my_party_index] belongs to the server
   * </pre>
   *
   * <code>uint32 my_party_index = 3 [json_name = "myPartyIndex"];</code>
   * @return The myPartyIndex.
   */
  @java.lang.Override
  public int getMyPartyIndex() {
    return myPartyIndex_;
  }

  public static final int THRESHOLD_FIELD_NUMBER = 4;
  private int threshold_ = 0;
  /**
   * <code>uint32 threshold = 4 [json_name = "threshold"];</code>
   * @return The threshold.
   */
  @java.lang.Override
  public int getThreshold() {
    return threshold_;
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
    getSerializedSize();
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newKeyUid_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, newKeyUid_);
    }
    for (int i = 0; i < partyUids_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, partyUids_.getRaw(i));
    }
    if (myPartyIndex_ != 0) {
      output.writeUInt32(3, myPartyIndex_);
    }
    if (threshold_ != 0) {
      output.writeUInt32(4, threshold_);
    }
    if (getPartyShareCountsList().size() > 0) {
      output.writeUInt32NoTag(42);
      output.writeUInt32NoTag(partyShareCountsMemoizedSerializedSize);
    }
    for (int i = 0; i < partyShareCounts_.size(); i++) {
      output.writeUInt32NoTag(partyShareCounts_.getInt(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newKeyUid_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, newKeyUid_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < partyUids_.size(); i++) {
        dataSize += computeStringSizeNoTag(partyUids_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getPartyUidsList().size();
    }
    if (myPartyIndex_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(3, myPartyIndex_);
    }
    if (threshold_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(4, threshold_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < partyShareCounts_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeUInt32SizeNoTag(partyShareCounts_.getInt(i));
      }
      size += dataSize;
      if (!getPartyShareCountsList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      partyShareCountsMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.axelar.tss.tofnd.v1beta1.KeygenInit)) {
      return super.equals(obj);
    }
    com.axelar.tss.tofnd.v1beta1.KeygenInit other = (com.axelar.tss.tofnd.v1beta1.KeygenInit) obj;

    if (!getNewKeyUid()
        .equals(other.getNewKeyUid())) return false;
    if (!getPartyUidsList()
        .equals(other.getPartyUidsList())) return false;
    if (!getPartyShareCountsList()
        .equals(other.getPartyShareCountsList())) return false;
    if (getMyPartyIndex()
        != other.getMyPartyIndex()) return false;
    if (getThreshold()
        != other.getThreshold()) return false;
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
    hash = (37 * hash) + NEW_KEY_UID_FIELD_NUMBER;
    hash = (53 * hash) + getNewKeyUid().hashCode();
    if (getPartyUidsCount() > 0) {
      hash = (37 * hash) + PARTY_UIDS_FIELD_NUMBER;
      hash = (53 * hash) + getPartyUidsList().hashCode();
    }
    if (getPartyShareCountsCount() > 0) {
      hash = (37 * hash) + PARTY_SHARE_COUNTS_FIELD_NUMBER;
      hash = (53 * hash) + getPartyShareCountsList().hashCode();
    }
    hash = (37 * hash) + MY_PARTY_INDEX_FIELD_NUMBER;
    hash = (53 * hash) + getMyPartyIndex();
    hash = (37 * hash) + THRESHOLD_FIELD_NUMBER;
    hash = (53 * hash) + getThreshold();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.axelar.tss.tofnd.v1beta1.KeygenInit parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.tss.tofnd.v1beta1.KeygenInit parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.tss.tofnd.v1beta1.KeygenInit parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.tss.tofnd.v1beta1.KeygenInit parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.tss.tofnd.v1beta1.KeygenInit parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.axelar.tss.tofnd.v1beta1.KeygenInit parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.axelar.tss.tofnd.v1beta1.KeygenInit parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.tss.tofnd.v1beta1.KeygenInit parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.axelar.tss.tofnd.v1beta1.KeygenInit parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.axelar.tss.tofnd.v1beta1.KeygenInit parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.axelar.tss.tofnd.v1beta1.KeygenInit parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.axelar.tss.tofnd.v1beta1.KeygenInit parseFrom(
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
  public static Builder newBuilder(com.axelar.tss.tofnd.v1beta1.KeygenInit prototype) {
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
   * Protobuf type {@code axelar.tss.tofnd.v1beta1.KeygenInit}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:axelar.tss.tofnd.v1beta1.KeygenInit)
      com.axelar.tss.tofnd.v1beta1.KeygenInitOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.axelar.tss.tofnd.v1beta1.TofndProto.internal_static_axelar_tss_tofnd_v1beta1_KeygenInit_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.axelar.tss.tofnd.v1beta1.TofndProto.internal_static_axelar_tss_tofnd_v1beta1_KeygenInit_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.axelar.tss.tofnd.v1beta1.KeygenInit.class, com.axelar.tss.tofnd.v1beta1.KeygenInit.Builder.class);
    }

    // Construct using com.axelar.tss.tofnd.v1beta1.KeygenInit.newBuilder()
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
      newKeyUid_ = "";
      partyUids_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      partyShareCounts_ = emptyIntList();
      myPartyIndex_ = 0;
      threshold_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.axelar.tss.tofnd.v1beta1.TofndProto.internal_static_axelar_tss_tofnd_v1beta1_KeygenInit_descriptor;
    }

    @java.lang.Override
    public com.axelar.tss.tofnd.v1beta1.KeygenInit getDefaultInstanceForType() {
      return com.axelar.tss.tofnd.v1beta1.KeygenInit.getDefaultInstance();
    }

    @java.lang.Override
    public com.axelar.tss.tofnd.v1beta1.KeygenInit build() {
      com.axelar.tss.tofnd.v1beta1.KeygenInit result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.axelar.tss.tofnd.v1beta1.KeygenInit buildPartial() {
      com.axelar.tss.tofnd.v1beta1.KeygenInit result = new com.axelar.tss.tofnd.v1beta1.KeygenInit(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.axelar.tss.tofnd.v1beta1.KeygenInit result) {
      if (((bitField0_ & 0x00000004) != 0)) {
        partyShareCounts_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000004);
      }
      result.partyShareCounts_ = partyShareCounts_;
    }

    private void buildPartial0(com.axelar.tss.tofnd.v1beta1.KeygenInit result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.newKeyUid_ = newKeyUid_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        partyUids_.makeImmutable();
        result.partyUids_ = partyUids_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.myPartyIndex_ = myPartyIndex_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.threshold_ = threshold_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.axelar.tss.tofnd.v1beta1.KeygenInit) {
        return mergeFrom((com.axelar.tss.tofnd.v1beta1.KeygenInit)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.axelar.tss.tofnd.v1beta1.KeygenInit other) {
      if (other == com.axelar.tss.tofnd.v1beta1.KeygenInit.getDefaultInstance()) return this;
      if (!other.getNewKeyUid().isEmpty()) {
        newKeyUid_ = other.newKeyUid_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.partyUids_.isEmpty()) {
        if (partyUids_.isEmpty()) {
          partyUids_ = other.partyUids_;
          bitField0_ |= 0x00000002;
        } else {
          ensurePartyUidsIsMutable();
          partyUids_.addAll(other.partyUids_);
        }
        onChanged();
      }
      if (!other.partyShareCounts_.isEmpty()) {
        if (partyShareCounts_.isEmpty()) {
          partyShareCounts_ = other.partyShareCounts_;
          bitField0_ = (bitField0_ & ~0x00000004);
        } else {
          ensurePartyShareCountsIsMutable();
          partyShareCounts_.addAll(other.partyShareCounts_);
        }
        onChanged();
      }
      if (other.getMyPartyIndex() != 0) {
        setMyPartyIndex(other.getMyPartyIndex());
      }
      if (other.getThreshold() != 0) {
        setThreshold(other.getThreshold());
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
              newKeyUid_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensurePartyUidsIsMutable();
              partyUids_.add(s);
              break;
            } // case 18
            case 24: {
              myPartyIndex_ = input.readUInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 24
            case 32: {
              threshold_ = input.readUInt32();
              bitField0_ |= 0x00000010;
              break;
            } // case 32
            case 40: {
              int v = input.readUInt32();
              ensurePartyShareCountsIsMutable();
              partyShareCounts_.addInt(v);
              break;
            } // case 40
            case 42: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensurePartyShareCountsIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                partyShareCounts_.addInt(input.readUInt32());
              }
              input.popLimit(limit);
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

    private java.lang.Object newKeyUid_ = "";
    /**
     * <code>string new_key_uid = 1 [json_name = "newKeyUid"];</code>
     * @return The newKeyUid.
     */
    public java.lang.String getNewKeyUid() {
      java.lang.Object ref = newKeyUid_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        newKeyUid_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string new_key_uid = 1 [json_name = "newKeyUid"];</code>
     * @return The bytes for newKeyUid.
     */
    public com.google.protobuf.ByteString
        getNewKeyUidBytes() {
      java.lang.Object ref = newKeyUid_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        newKeyUid_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string new_key_uid = 1 [json_name = "newKeyUid"];</code>
     * @param value The newKeyUid to set.
     * @return This builder for chaining.
     */
    public Builder setNewKeyUid(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      newKeyUid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string new_key_uid = 1 [json_name = "newKeyUid"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNewKeyUid() {
      newKeyUid_ = getDefaultInstance().getNewKeyUid();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string new_key_uid = 1 [json_name = "newKeyUid"];</code>
     * @param value The bytes for newKeyUid to set.
     * @return This builder for chaining.
     */
    public Builder setNewKeyUidBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      newKeyUid_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList partyUids_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensurePartyUidsIsMutable() {
      if (!partyUids_.isModifiable()) {
        partyUids_ = new com.google.protobuf.LazyStringArrayList(partyUids_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <code>repeated string party_uids = 2 [json_name = "partyUids"];</code>
     * @return A list containing the partyUids.
     */
    public com.google.protobuf.ProtocolStringList
        getPartyUidsList() {
      partyUids_.makeImmutable();
      return partyUids_;
    }
    /**
     * <code>repeated string party_uids = 2 [json_name = "partyUids"];</code>
     * @return The count of partyUids.
     */
    public int getPartyUidsCount() {
      return partyUids_.size();
    }
    /**
     * <code>repeated string party_uids = 2 [json_name = "partyUids"];</code>
     * @param index The index of the element to return.
     * @return The partyUids at the given index.
     */
    public java.lang.String getPartyUids(int index) {
      return partyUids_.get(index);
    }
    /**
     * <code>repeated string party_uids = 2 [json_name = "partyUids"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the partyUids at the given index.
     */
    public com.google.protobuf.ByteString
        getPartyUidsBytes(int index) {
      return partyUids_.getByteString(index);
    }
    /**
     * <code>repeated string party_uids = 2 [json_name = "partyUids"];</code>
     * @param index The index to set the value at.
     * @param value The partyUids to set.
     * @return This builder for chaining.
     */
    public Builder setPartyUids(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensurePartyUidsIsMutable();
      partyUids_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string party_uids = 2 [json_name = "partyUids"];</code>
     * @param value The partyUids to add.
     * @return This builder for chaining.
     */
    public Builder addPartyUids(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensurePartyUidsIsMutable();
      partyUids_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string party_uids = 2 [json_name = "partyUids"];</code>
     * @param values The partyUids to add.
     * @return This builder for chaining.
     */
    public Builder addAllPartyUids(
        java.lang.Iterable<java.lang.String> values) {
      ensurePartyUidsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, partyUids_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string party_uids = 2 [json_name = "partyUids"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPartyUids() {
      partyUids_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string party_uids = 2 [json_name = "partyUids"];</code>
     * @param value The bytes of the partyUids to add.
     * @return This builder for chaining.
     */
    public Builder addPartyUidsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensurePartyUidsIsMutable();
      partyUids_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.IntList partyShareCounts_ = emptyIntList();
    private void ensurePartyShareCountsIsMutable() {
      if (!((bitField0_ & 0x00000004) != 0)) {
        partyShareCounts_ = mutableCopy(partyShareCounts_);
        bitField0_ |= 0x00000004;
      }
    }
    /**
     * <code>repeated uint32 party_share_counts = 5 [json_name = "partyShareCounts"];</code>
     * @return A list containing the partyShareCounts.
     */
    public java.util.List<java.lang.Integer>
        getPartyShareCountsList() {
      return ((bitField0_ & 0x00000004) != 0) ?
               java.util.Collections.unmodifiableList(partyShareCounts_) : partyShareCounts_;
    }
    /**
     * <code>repeated uint32 party_share_counts = 5 [json_name = "partyShareCounts"];</code>
     * @return The count of partyShareCounts.
     */
    public int getPartyShareCountsCount() {
      return partyShareCounts_.size();
    }
    /**
     * <code>repeated uint32 party_share_counts = 5 [json_name = "partyShareCounts"];</code>
     * @param index The index of the element to return.
     * @return The partyShareCounts at the given index.
     */
    public int getPartyShareCounts(int index) {
      return partyShareCounts_.getInt(index);
    }
    /**
     * <code>repeated uint32 party_share_counts = 5 [json_name = "partyShareCounts"];</code>
     * @param index The index to set the value at.
     * @param value The partyShareCounts to set.
     * @return This builder for chaining.
     */
    public Builder setPartyShareCounts(
        int index, int value) {

      ensurePartyShareCountsIsMutable();
      partyShareCounts_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 party_share_counts = 5 [json_name = "partyShareCounts"];</code>
     * @param value The partyShareCounts to add.
     * @return This builder for chaining.
     */
    public Builder addPartyShareCounts(int value) {

      ensurePartyShareCountsIsMutable();
      partyShareCounts_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 party_share_counts = 5 [json_name = "partyShareCounts"];</code>
     * @param values The partyShareCounts to add.
     * @return This builder for chaining.
     */
    public Builder addAllPartyShareCounts(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensurePartyShareCountsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, partyShareCounts_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated uint32 party_share_counts = 5 [json_name = "partyShareCounts"];</code>
     * @return This builder for chaining.
     */
    public Builder clearPartyShareCounts() {
      partyShareCounts_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }

    private int myPartyIndex_ ;
    /**
     * <pre>
     * parties[my_party_index] belongs to the server
     * </pre>
     *
     * <code>uint32 my_party_index = 3 [json_name = "myPartyIndex"];</code>
     * @return The myPartyIndex.
     */
    @java.lang.Override
    public int getMyPartyIndex() {
      return myPartyIndex_;
    }
    /**
     * <pre>
     * parties[my_party_index] belongs to the server
     * </pre>
     *
     * <code>uint32 my_party_index = 3 [json_name = "myPartyIndex"];</code>
     * @param value The myPartyIndex to set.
     * @return This builder for chaining.
     */
    public Builder setMyPartyIndex(int value) {

      myPartyIndex_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * parties[my_party_index] belongs to the server
     * </pre>
     *
     * <code>uint32 my_party_index = 3 [json_name = "myPartyIndex"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMyPartyIndex() {
      bitField0_ = (bitField0_ & ~0x00000008);
      myPartyIndex_ = 0;
      onChanged();
      return this;
    }

    private int threshold_ ;
    /**
     * <code>uint32 threshold = 4 [json_name = "threshold"];</code>
     * @return The threshold.
     */
    @java.lang.Override
    public int getThreshold() {
      return threshold_;
    }
    /**
     * <code>uint32 threshold = 4 [json_name = "threshold"];</code>
     * @param value The threshold to set.
     * @return This builder for chaining.
     */
    public Builder setThreshold(int value) {

      threshold_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 threshold = 4 [json_name = "threshold"];</code>
     * @return This builder for chaining.
     */
    public Builder clearThreshold() {
      bitField0_ = (bitField0_ & ~0x00000010);
      threshold_ = 0;
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


    // @@protoc_insertion_point(builder_scope:axelar.tss.tofnd.v1beta1.KeygenInit)
  }

  // @@protoc_insertion_point(class_scope:axelar.tss.tofnd.v1beta1.KeygenInit)
  private static final com.axelar.tss.tofnd.v1beta1.KeygenInit DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.axelar.tss.tofnd.v1beta1.KeygenInit();
  }

  public static com.axelar.tss.tofnd.v1beta1.KeygenInit getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeygenInit>
      PARSER = new com.google.protobuf.AbstractParser<KeygenInit>() {
    @java.lang.Override
    public KeygenInit parsePartialFrom(
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

  public static com.google.protobuf.Parser<KeygenInit> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeygenInit> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.axelar.tss.tofnd.v1beta1.KeygenInit getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

