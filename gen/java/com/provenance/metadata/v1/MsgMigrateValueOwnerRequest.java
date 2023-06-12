// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: provenance/metadata/v1/tx.proto

package com.provenance.metadata.v1;

/**
 * <pre>
 * MsgMigrateValueOwnerRequest is the request to migrate all scopes with one value owner to another value owner.
 * </pre>
 *
 * Protobuf type {@code provenance.metadata.v1.MsgMigrateValueOwnerRequest}
 */
public final class MsgMigrateValueOwnerRequest extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:provenance.metadata.v1.MsgMigrateValueOwnerRequest)
    MsgMigrateValueOwnerRequestOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MsgMigrateValueOwnerRequest.newBuilder() to construct.
  private MsgMigrateValueOwnerRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MsgMigrateValueOwnerRequest() {
    existing_ = "";
    proposed_ = "";
    signers_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MsgMigrateValueOwnerRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.provenance.metadata.v1.TxProto.internal_static_provenance_metadata_v1_MsgMigrateValueOwnerRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.provenance.metadata.v1.TxProto.internal_static_provenance_metadata_v1_MsgMigrateValueOwnerRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.provenance.metadata.v1.MsgMigrateValueOwnerRequest.class, com.provenance.metadata.v1.MsgMigrateValueOwnerRequest.Builder.class);
  }

  public static final int EXISTING_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private volatile java.lang.Object existing_ = "";
  /**
   * <pre>
   * existing is the value owner address that is being migrated.
   * </pre>
   *
   * <code>string existing = 1 [json_name = "existing"];</code>
   * @return The existing.
   */
  @java.lang.Override
  public java.lang.String getExisting() {
    java.lang.Object ref = existing_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      existing_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * existing is the value owner address that is being migrated.
   * </pre>
   *
   * <code>string existing = 1 [json_name = "existing"];</code>
   * @return The bytes for existing.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getExistingBytes() {
    java.lang.Object ref = existing_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      existing_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int PROPOSED_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private volatile java.lang.Object proposed_ = "";
  /**
   * <pre>
   * proposed is the new value owner address for all of existing's scopes.
   * </pre>
   *
   * <code>string proposed = 2 [json_name = "proposed"];</code>
   * @return The proposed.
   */
  @java.lang.Override
  public java.lang.String getProposed() {
    java.lang.Object ref = proposed_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      proposed_ = s;
      return s;
    }
  }
  /**
   * <pre>
   * proposed is the new value owner address for all of existing's scopes.
   * </pre>
   *
   * <code>string proposed = 2 [json_name = "proposed"];</code>
   * @return The bytes for proposed.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString
      getProposedBytes() {
    java.lang.Object ref = proposed_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      proposed_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(existing_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, existing_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(proposed_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, proposed_);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(existing_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, existing_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(proposed_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, proposed_);
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
    if (!(obj instanceof com.provenance.metadata.v1.MsgMigrateValueOwnerRequest)) {
      return super.equals(obj);
    }
    com.provenance.metadata.v1.MsgMigrateValueOwnerRequest other = (com.provenance.metadata.v1.MsgMigrateValueOwnerRequest) obj;

    if (!getExisting()
        .equals(other.getExisting())) return false;
    if (!getProposed()
        .equals(other.getProposed())) return false;
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
    hash = (37 * hash) + EXISTING_FIELD_NUMBER;
    hash = (53 * hash) + getExisting().hashCode();
    hash = (37 * hash) + PROPOSED_FIELD_NUMBER;
    hash = (53 * hash) + getProposed().hashCode();
    if (getSignersCount() > 0) {
      hash = (37 * hash) + SIGNERS_FIELD_NUMBER;
      hash = (53 * hash) + getSignersList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.provenance.metadata.v1.MsgMigrateValueOwnerRequest parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.metadata.v1.MsgMigrateValueOwnerRequest parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.metadata.v1.MsgMigrateValueOwnerRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.metadata.v1.MsgMigrateValueOwnerRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.metadata.v1.MsgMigrateValueOwnerRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.provenance.metadata.v1.MsgMigrateValueOwnerRequest parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.provenance.metadata.v1.MsgMigrateValueOwnerRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.metadata.v1.MsgMigrateValueOwnerRequest parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.provenance.metadata.v1.MsgMigrateValueOwnerRequest parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.provenance.metadata.v1.MsgMigrateValueOwnerRequest parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.provenance.metadata.v1.MsgMigrateValueOwnerRequest parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.provenance.metadata.v1.MsgMigrateValueOwnerRequest parseFrom(
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
  public static Builder newBuilder(com.provenance.metadata.v1.MsgMigrateValueOwnerRequest prototype) {
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
   * MsgMigrateValueOwnerRequest is the request to migrate all scopes with one value owner to another value owner.
   * </pre>
   *
   * Protobuf type {@code provenance.metadata.v1.MsgMigrateValueOwnerRequest}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:provenance.metadata.v1.MsgMigrateValueOwnerRequest)
      com.provenance.metadata.v1.MsgMigrateValueOwnerRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.provenance.metadata.v1.TxProto.internal_static_provenance_metadata_v1_MsgMigrateValueOwnerRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.provenance.metadata.v1.TxProto.internal_static_provenance_metadata_v1_MsgMigrateValueOwnerRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.provenance.metadata.v1.MsgMigrateValueOwnerRequest.class, com.provenance.metadata.v1.MsgMigrateValueOwnerRequest.Builder.class);
    }

    // Construct using com.provenance.metadata.v1.MsgMigrateValueOwnerRequest.newBuilder()
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
      existing_ = "";
      proposed_ = "";
      signers_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.provenance.metadata.v1.TxProto.internal_static_provenance_metadata_v1_MsgMigrateValueOwnerRequest_descriptor;
    }

    @java.lang.Override
    public com.provenance.metadata.v1.MsgMigrateValueOwnerRequest getDefaultInstanceForType() {
      return com.provenance.metadata.v1.MsgMigrateValueOwnerRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.provenance.metadata.v1.MsgMigrateValueOwnerRequest build() {
      com.provenance.metadata.v1.MsgMigrateValueOwnerRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.provenance.metadata.v1.MsgMigrateValueOwnerRequest buildPartial() {
      com.provenance.metadata.v1.MsgMigrateValueOwnerRequest result = new com.provenance.metadata.v1.MsgMigrateValueOwnerRequest(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.provenance.metadata.v1.MsgMigrateValueOwnerRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.existing_ = existing_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.proposed_ = proposed_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        signers_.makeImmutable();
        result.signers_ = signers_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.provenance.metadata.v1.MsgMigrateValueOwnerRequest) {
        return mergeFrom((com.provenance.metadata.v1.MsgMigrateValueOwnerRequest)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.provenance.metadata.v1.MsgMigrateValueOwnerRequest other) {
      if (other == com.provenance.metadata.v1.MsgMigrateValueOwnerRequest.getDefaultInstance()) return this;
      if (!other.getExisting().isEmpty()) {
        existing_ = other.existing_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getProposed().isEmpty()) {
        proposed_ = other.proposed_;
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
              existing_ = input.readStringRequireUtf8();
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              proposed_ = input.readStringRequireUtf8();
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

    private java.lang.Object existing_ = "";
    /**
     * <pre>
     * existing is the value owner address that is being migrated.
     * </pre>
     *
     * <code>string existing = 1 [json_name = "existing"];</code>
     * @return The existing.
     */
    public java.lang.String getExisting() {
      java.lang.Object ref = existing_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        existing_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * existing is the value owner address that is being migrated.
     * </pre>
     *
     * <code>string existing = 1 [json_name = "existing"];</code>
     * @return The bytes for existing.
     */
    public com.google.protobuf.ByteString
        getExistingBytes() {
      java.lang.Object ref = existing_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        existing_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * existing is the value owner address that is being migrated.
     * </pre>
     *
     * <code>string existing = 1 [json_name = "existing"];</code>
     * @param value The existing to set.
     * @return This builder for chaining.
     */
    public Builder setExisting(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      existing_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * existing is the value owner address that is being migrated.
     * </pre>
     *
     * <code>string existing = 1 [json_name = "existing"];</code>
     * @return This builder for chaining.
     */
    public Builder clearExisting() {
      existing_ = getDefaultInstance().getExisting();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * existing is the value owner address that is being migrated.
     * </pre>
     *
     * <code>string existing = 1 [json_name = "existing"];</code>
     * @param value The bytes for existing to set.
     * @return This builder for chaining.
     */
    public Builder setExistingBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      existing_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object proposed_ = "";
    /**
     * <pre>
     * proposed is the new value owner address for all of existing's scopes.
     * </pre>
     *
     * <code>string proposed = 2 [json_name = "proposed"];</code>
     * @return The proposed.
     */
    public java.lang.String getProposed() {
      java.lang.Object ref = proposed_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        proposed_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <pre>
     * proposed is the new value owner address for all of existing's scopes.
     * </pre>
     *
     * <code>string proposed = 2 [json_name = "proposed"];</code>
     * @return The bytes for proposed.
     */
    public com.google.protobuf.ByteString
        getProposedBytes() {
      java.lang.Object ref = proposed_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        proposed_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <pre>
     * proposed is the new value owner address for all of existing's scopes.
     * </pre>
     *
     * <code>string proposed = 2 [json_name = "proposed"];</code>
     * @param value The proposed to set.
     * @return This builder for chaining.
     */
    public Builder setProposed(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      proposed_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * proposed is the new value owner address for all of existing's scopes.
     * </pre>
     *
     * <code>string proposed = 2 [json_name = "proposed"];</code>
     * @return This builder for chaining.
     */
    public Builder clearProposed() {
      proposed_ = getDefaultInstance().getProposed();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * proposed is the new value owner address for all of existing's scopes.
     * </pre>
     *
     * <code>string proposed = 2 [json_name = "proposed"];</code>
     * @param value The bytes for proposed to set.
     * @return This builder for chaining.
     */
    public Builder setProposedBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      proposed_ = value;
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


    // @@protoc_insertion_point(builder_scope:provenance.metadata.v1.MsgMigrateValueOwnerRequest)
  }

  // @@protoc_insertion_point(class_scope:provenance.metadata.v1.MsgMigrateValueOwnerRequest)
  private static final com.provenance.metadata.v1.MsgMigrateValueOwnerRequest DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.provenance.metadata.v1.MsgMigrateValueOwnerRequest();
  }

  public static com.provenance.metadata.v1.MsgMigrateValueOwnerRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MsgMigrateValueOwnerRequest>
      PARSER = new com.google.protobuf.AbstractParser<MsgMigrateValueOwnerRequest>() {
    @java.lang.Override
    public MsgMigrateValueOwnerRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<MsgMigrateValueOwnerRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MsgMigrateValueOwnerRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.provenance.metadata.v1.MsgMigrateValueOwnerRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

