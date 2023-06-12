// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/tx.proto

package com.provenance.metadata.v1;

/**
 * <pre>
 * MsgUpdateValueOwnersRequest is the request to update the value owner addresses in one or more scopes.
 * </pre>
 *
 * Protobuf type {@code provenance.metadata.v1.MsgUpdateValueOwnersRequest}
 */
public final class MsgUpdateValueOwnersRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.metadata.v1.MsgUpdateValueOwnersRequest)
    MsgUpdateValueOwnersRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgUpdateValueOwnersRequest.newBuilder() to construct.
  private MsgUpdateValueOwnersRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgUpdateValueOwnersRequest() {
    scopeIds_ = java.util.Collections.emptyList();
    valueOwnerAddress_ = "";
    signers_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgUpdateValueOwnersRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.provenance.metadata.v1.TxProto.internal_static_provenance_metadata_v1_MsgUpdateValueOwnersRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.provenance.metadata.v1.TxProto.internal_static_provenance_metadata_v1_MsgUpdateValueOwnersRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.provenance.metadata.v1.MsgUpdateValueOwnersRequest.class, com.provenance.metadata.v1.MsgUpdateValueOwnersRequest.Builder.class);
  }

  public static final int SCOPE_IDS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.google.protobuf.ByteString> scopeIds_;
  /**
   * <pre>
   * scope_ids are the scope metadata addresses of all scopes to be updated.
   * </pre>
   *
   * <code>repeated bytes scope_ids = 1 [json_name = "scopeIds", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"scope_ids&#92;""];</code>
   * @return A list containing the scopeIds.
   */
  @java.lang.Override
  public java.util.List<com.google.protobuf.ByteString>
      getScopeIdsList() {
    return scopeIds_;
  }
  /**
   * <pre>
   * scope_ids are the scope metadata addresses of all scopes to be updated.
   * </pre>
   *
   * <code>repeated bytes scope_ids = 1 [json_name = "scopeIds", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"scope_ids&#92;""];</code>
   * @return The count of scopeIds.
   */
  public int getScopeIdsCount() {
    return scopeIds_.size();
  }
  /**
   * <pre>
   * scope_ids are the scope metadata addresses of all scopes to be updated.
   * </pre>
   *
   * <code>repeated bytes scope_ids = 1 [json_name = "scopeIds", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"scope_ids&#92;""];</code>
   * @param index The index of the element to return.
   * @return The scopeIds at the given index.
   */
  public com.google.protobuf.ByteString getScopeIds(int index) {
    return scopeIds_.get(index);
  }

  public static final int VALUE_OWNER_ADDRESS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object valueOwnerAddress_ = "";
  /**
   * <pre>
   * value_owner_address is the address of the new value owner for the provided scopes.
   * </pre>
   *
   * <code>string value_owner_address = 2 [json_name = "valueOwnerAddress", (.gogoproto.moretags) = "yaml:&#92;"value_owner_address&#92;""];</code>
   * @return The valueOwnerAddress.
   */
  @java.lang.Override
  public java.lang.String getValueOwnerAddress() {
    java.lang.Object ref = valueOwnerAddress_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      valueOwnerAddress_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * value_owner_address is the address of the new value owner for the provided scopes.
   * </pre>
   *
   * <code>string value_owner_address = 2 [json_name = "valueOwnerAddress", (.gogoproto.moretags) = "yaml:&#92;"value_owner_address&#92;""];</code>
   * @return The bytes for valueOwnerAddress.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getValueOwnerAddressBytes() {
    java.lang.Object ref = valueOwnerAddress_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      valueOwnerAddress_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SIGNERS_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList signers_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * signers is the list of addresses of those signing this request.
   * </pre>
   *
   * <code>repeated string signers = 3 [json_name = "signers"];</code>
   * @return A list containing the signers.
   */
  public com.google.protobuf.ProtocolStringList
      getSignersList() {
    return signers_;
  }
  /**
   * <pre>
   * signers is the list of addresses of those signing this request.
   * </pre>
   *
   * <code>repeated string signers = 3 [json_name = "signers"];</code>
   * @return The count of signers.
   */
  public int getSignersCount() {
    return signers_.size();
  }
  /**
   * <pre>
   * signers is the list of addresses of those signing this request.
   * </pre>
   *
   * <code>repeated string signers = 3 [json_name = "signers"];</code>
   * @param index The index of the element to return.
   * @return The signers at the given index.
   */
  public java.lang.String getSigners(int index) {
    return signers_.get(index);
  }
  /**
   * <pre>
   * signers is the list of addresses of those signing this request.
   * </pre>
   *
   * <code>repeated string signers = 3 [json_name = "signers"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the signers at the given index.
   */
  public com.google.protobuf.ByteString
      getSignersBytes(int index) {
    return signers_.getByteString(index);
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
    for (int i = 0; i < scopeIds_.size(); i++) {
      output.writeBytes(1, scopeIds_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(valueOwnerAddress_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, valueOwnerAddress_);
    }
    for (int i = 0; i < signers_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, signers_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < scopeIds_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeBytesSizeNoTag(scopeIds_.get(i));
      }
      size += dataSize;
      size += 1 * getScopeIdsList().size();
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(valueOwnerAddress_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, valueOwnerAddress_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < signers_.size(); i++) {
        dataSize += computeStringSizeNoTag(signers_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getSignersList().size();
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
    if (!(obj instanceof com.provenance.metadata.v1.MsgUpdateValueOwnersRequest)) {
      return super.equals(obj);
    }
    com.provenance.metadata.v1.MsgUpdateValueOwnersRequest other = (com.provenance.metadata.v1.MsgUpdateValueOwnersRequest) obj;

    if (!getScopeIdsList()
        .equals(other.getScopeIdsList())) return false;
    if (!getValueOwnerAddress()
        .equals(other.getValueOwnerAddress())) return false;
    if (!getSignersList()
        .equals(other.getSignersList())) return false;
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
    if (getScopeIdsCount() > 0) {
      hash = (37 * hash) + SCOPE_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getScopeIdsList().hashCode();
    }
    hash = (37 * hash) + VALUE_OWNER_ADDRESS_FIELD_NUMBER;
    hash = (53 * hash) + getValueOwnerAddress().hashCode();
    if (getSignersCount() > 0) {
      hash = (37 * hash) + SIGNERS_FIELD_NUMBER;
      hash = (53 * hash) + getSignersList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.provenance.metadata.v1.MsgUpdateValueOwnersRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.metadata.v1.MsgUpdateValueOwnersRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.metadata.v1.MsgUpdateValueOwnersRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.metadata.v1.MsgUpdateValueOwnersRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.metadata.v1.MsgUpdateValueOwnersRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.metadata.v1.MsgUpdateValueOwnersRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.metadata.v1.MsgUpdateValueOwnersRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.metadata.v1.MsgUpdateValueOwnersRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.provenance.metadata.v1.MsgUpdateValueOwnersRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.provenance.metadata.v1.MsgUpdateValueOwnersRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.provenance.metadata.v1.MsgUpdateValueOwnersRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.metadata.v1.MsgUpdateValueOwnersRequest parseFrom(
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
  public static Builder newBuilder(com.provenance.metadata.v1.MsgUpdateValueOwnersRequest prototype) {
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
   * MsgUpdateValueOwnersRequest is the request to update the value owner addresses in one or more scopes.
   * </pre>
   *
   * Protobuf type {@code provenance.metadata.v1.MsgUpdateValueOwnersRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.metadata.v1.MsgUpdateValueOwnersRequest)
      com.provenance.metadata.v1.MsgUpdateValueOwnersRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.provenance.metadata.v1.TxProto.internal_static_provenance_metadata_v1_MsgUpdateValueOwnersRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.provenance.metadata.v1.TxProto.internal_static_provenance_metadata_v1_MsgUpdateValueOwnersRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.provenance.metadata.v1.MsgUpdateValueOwnersRequest.class, com.provenance.metadata.v1.MsgUpdateValueOwnersRequest.Builder.class);
    }

    // Construct using com.provenance.metadata.v1.MsgUpdateValueOwnersRequest.newBuilder()
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
      scopeIds_ = java.util.Collections.emptyList();
      valueOwnerAddress_ = "";
      signers_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.provenance.metadata.v1.TxProto.internal_static_provenance_metadata_v1_MsgUpdateValueOwnersRequest_descriptor;
    }

    @java.lang.Override
    public com.provenance.metadata.v1.MsgUpdateValueOwnersRequest getDefaultInstanceForType() {
      return com.provenance.metadata.v1.MsgUpdateValueOwnersRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.provenance.metadata.v1.MsgUpdateValueOwnersRequest build() {
      com.provenance.metadata.v1.MsgUpdateValueOwnersRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.provenance.metadata.v1.MsgUpdateValueOwnersRequest buildPartial() {
      com.provenance.metadata.v1.MsgUpdateValueOwnersRequest result = new com.provenance.metadata.v1.MsgUpdateValueOwnersRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.provenance.metadata.v1.MsgUpdateValueOwnersRequest result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        scopeIds_ = java.util.Collections.unmodifiableList(scopeIds_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.scopeIds_ = scopeIds_;
    }

    private void buildPartial0(com.provenance.metadata.v1.MsgUpdateValueOwnersRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.valueOwnerAddress_ = valueOwnerAddress_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        signers_.makeImmutable();
        result.signers_ = signers_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.provenance.metadata.v1.MsgUpdateValueOwnersRequest) {
        return mergeFrom((com.provenance.metadata.v1.MsgUpdateValueOwnersRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.provenance.metadata.v1.MsgUpdateValueOwnersRequest other) {
      if (other == com.provenance.metadata.v1.MsgUpdateValueOwnersRequest.getDefaultInstance()) return this;
      if (!other.scopeIds_.isEmpty()) {
        if (scopeIds_.isEmpty()) {
          scopeIds_ = other.scopeIds_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureScopeIdsIsMutable();
          scopeIds_.addAll(other.scopeIds_);
        }
        onChanged();
      }
      if (!other.getValueOwnerAddress().isEmpty()) {
        valueOwnerAddress_ = other.valueOwnerAddress_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.signers_.isEmpty()) {
        if (signers_.isEmpty()) {
          signers_ = other.signers_;
          bitField0_ |= 0x00000004;
        } else {
          ensureSignersIsMutable();
          signers_.addAll(other.signers_);
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
              com.google.protobuf.ByteString v = input.readBytes();
              ensureScopeIdsIsMutable();
              scopeIds_.add(v);
              break;
            } // case 10
            case 18: {
              valueOwnerAddress_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureSignersIsMutable();
              signers_.add(s);
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

    private java.util.List<com.google.protobuf.ByteString> scopeIds_ = java.util.Collections.emptyList();
    private void ensureScopeIdsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        scopeIds_ = new java.util.ArrayList<com.google.protobuf.ByteString>(scopeIds_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <pre>
     * scope_ids are the scope metadata addresses of all scopes to be updated.
     * </pre>
     *
     * <code>repeated bytes scope_ids = 1 [json_name = "scopeIds", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"scope_ids&#92;""];</code>
     * @return A list containing the scopeIds.
     */
    public java.util.List<com.google.protobuf.ByteString>
        getScopeIdsList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(scopeIds_) : scopeIds_;
    }
    /**
     * <pre>
     * scope_ids are the scope metadata addresses of all scopes to be updated.
     * </pre>
     *
     * <code>repeated bytes scope_ids = 1 [json_name = "scopeIds", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"scope_ids&#92;""];</code>
     * @return The count of scopeIds.
     */
    public int getScopeIdsCount() {
      return scopeIds_.size();
    }
    /**
     * <pre>
     * scope_ids are the scope metadata addresses of all scopes to be updated.
     * </pre>
     *
     * <code>repeated bytes scope_ids = 1 [json_name = "scopeIds", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"scope_ids&#92;""];</code>
     * @param index The index of the element to return.
     * @return The scopeIds at the given index.
     */
    public com.google.protobuf.ByteString getScopeIds(int index) {
      return scopeIds_.get(index);
    }
    /**
     * <pre>
     * scope_ids are the scope metadata addresses of all scopes to be updated.
     * </pre>
     *
     * <code>repeated bytes scope_ids = 1 [json_name = "scopeIds", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"scope_ids&#92;""];</code>
     * @param index The index to set the value at.
     * @param value The scopeIds to set.
     * @return This builder for chaining.
     */
    public Builder setScopeIds(
        int index, com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      ensureScopeIdsIsMutable();
      scopeIds_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * scope_ids are the scope metadata addresses of all scopes to be updated.
     * </pre>
     *
     * <code>repeated bytes scope_ids = 1 [json_name = "scopeIds", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"scope_ids&#92;""];</code>
     * @param value The scopeIds to add.
     * @return This builder for chaining.
     */
    public Builder addScopeIds(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      ensureScopeIdsIsMutable();
      scopeIds_.add(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * scope_ids are the scope metadata addresses of all scopes to be updated.
     * </pre>
     *
     * <code>repeated bytes scope_ids = 1 [json_name = "scopeIds", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"scope_ids&#92;""];</code>
     * @param values The scopeIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllScopeIds(
        java.lang.Iterable<? extends com.google.protobuf.ByteString> values) {
      ensureScopeIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, scopeIds_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * scope_ids are the scope metadata addresses of all scopes to be updated.
     * </pre>
     *
     * <code>repeated bytes scope_ids = 1 [json_name = "scopeIds", (.gogoproto.nullable) = false, (.gogoproto.customtype) = "MetadataAddress", (.gogoproto.moretags) = "yaml:&#92;"scope_ids&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearScopeIds() {
      scopeIds_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private java.lang.Object valueOwnerAddress_ = "";
    /**
     * <pre>
     * value_owner_address is the address of the new value owner for the provided scopes.
     * </pre>
     *
     * <code>string value_owner_address = 2 [json_name = "valueOwnerAddress", (.gogoproto.moretags) = "yaml:&#92;"value_owner_address&#92;""];</code>
     * @return The valueOwnerAddress.
     */
    public java.lang.String getValueOwnerAddress() {
      java.lang.Object ref = valueOwnerAddress_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        valueOwnerAddress_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * value_owner_address is the address of the new value owner for the provided scopes.
     * </pre>
     *
     * <code>string value_owner_address = 2 [json_name = "valueOwnerAddress", (.gogoproto.moretags) = "yaml:&#92;"value_owner_address&#92;""];</code>
     * @return The bytes for valueOwnerAddress.
     */
    public com.google.protobuf.ByteString
        getValueOwnerAddressBytes() {
      java.lang.Object ref = valueOwnerAddress_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        valueOwnerAddress_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * value_owner_address is the address of the new value owner for the provided scopes.
     * </pre>
     *
     * <code>string value_owner_address = 2 [json_name = "valueOwnerAddress", (.gogoproto.moretags) = "yaml:&#92;"value_owner_address&#92;""];</code>
     * @param value The valueOwnerAddress to set.
     * @return This builder for chaining.
     */
    public Builder setValueOwnerAddress(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      valueOwnerAddress_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * value_owner_address is the address of the new value owner for the provided scopes.
     * </pre>
     *
     * <code>string value_owner_address = 2 [json_name = "valueOwnerAddress", (.gogoproto.moretags) = "yaml:&#92;"value_owner_address&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearValueOwnerAddress() {
      valueOwnerAddress_ = getDefaultInstance().getValueOwnerAddress();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * value_owner_address is the address of the new value owner for the provided scopes.
     * </pre>
     *
     * <code>string value_owner_address = 2 [json_name = "valueOwnerAddress", (.gogoproto.moretags) = "yaml:&#92;"value_owner_address&#92;""];</code>
     * @param value The bytes for valueOwnerAddress to set.
     * @return This builder for chaining.
     */
    public Builder setValueOwnerAddressBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      valueOwnerAddress_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList signers_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureSignersIsMutable() {
      if (!signers_.isModifiable()) {
        signers_ = new com.google.protobuf.LazyStringArrayList(signers_);
      }
      bitField0_ |= 0x00000004;
    }
    /**
     * <pre>
     * signers is the list of addresses of those signing this request.
     * </pre>
     *
     * <code>repeated string signers = 3 [json_name = "signers"];</code>
     * @return A list containing the signers.
     */
    public com.google.protobuf.ProtocolStringList
        getSignersList() {
      signers_.makeImmutable();
      return signers_;
    }
    /**
     * <pre>
     * signers is the list of addresses of those signing this request.
     * </pre>
     *
     * <code>repeated string signers = 3 [json_name = "signers"];</code>
     * @return The count of signers.
     */
    public int getSignersCount() {
      return signers_.size();
    }
    /**
     * <pre>
     * signers is the list of addresses of those signing this request.
     * </pre>
     *
     * <code>repeated string signers = 3 [json_name = "signers"];</code>
     * @param index The index of the element to return.
     * @return The signers at the given index.
     */
    public java.lang.String getSigners(int index) {
      return signers_.get(index);
    }
    /**
     * <pre>
     * signers is the list of addresses of those signing this request.
     * </pre>
     *
     * <code>repeated string signers = 3 [json_name = "signers"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the signers at the given index.
     */
    public com.google.protobuf.ByteString
        getSignersBytes(int index) {
      return signers_.getByteString(index);
    }
    /**
     * <pre>
     * signers is the list of addresses of those signing this request.
     * </pre>
     *
     * <code>repeated string signers = 3 [json_name = "signers"];</code>
     * @param index The index to set the value at.
     * @param value The signers to set.
     * @return This builder for chaining.
     */
    public Builder setSigners(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureSignersIsMutable();
      signers_.set(index, value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * signers is the list of addresses of those signing this request.
     * </pre>
     *
     * <code>repeated string signers = 3 [json_name = "signers"];</code>
     * @param value The signers to add.
     * @return This builder for chaining.
     */
    public Builder addSigners(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureSignersIsMutable();
      signers_.add(value);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * signers is the list of addresses of those signing this request.
     * </pre>
     *
     * <code>repeated string signers = 3 [json_name = "signers"];</code>
     * @param values The signers to add.
     * @return This builder for chaining.
     */
    public Builder addAllSigners(
        java.lang.Iterable<java.lang.String> values) {
      ensureSignersIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, signers_);
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * signers is the list of addresses of those signing this request.
     * </pre>
     *
     * <code>repeated string signers = 3 [json_name = "signers"];</code>
     * @return This builder for chaining.
     */
    public Builder clearSigners() {
      signers_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000004);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * signers is the list of addresses of those signing this request.
     * </pre>
     *
     * <code>repeated string signers = 3 [json_name = "signers"];</code>
     * @param value The bytes of the signers to add.
     * @return This builder for chaining.
     */
    public Builder addSignersBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureSignersIsMutable();
      signers_.add(value);
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


    // @@protoc_insertion_point(builder_scope:provenance.metadata.v1.MsgUpdateValueOwnersRequest)
  }

  // @@protoc_insertion_point(class_scope:provenance.metadata.v1.MsgUpdateValueOwnersRequest)
  private static final com.provenance.metadata.v1.MsgUpdateValueOwnersRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.provenance.metadata.v1.MsgUpdateValueOwnersRequest();
  }

  public static com.provenance.metadata.v1.MsgUpdateValueOwnersRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgUpdateValueOwnersRequest>
      PARSER = new com.google.protobuf.AbstractParser<MsgUpdateValueOwnersRequest>() {
    @java.lang.Override
    public MsgUpdateValueOwnersRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgUpdateValueOwnersRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgUpdateValueOwnersRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.provenance.metadata.v1.MsgUpdateValueOwnersRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

