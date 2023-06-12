// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/audit/v1beta2/audit.proto

package com.akash.audit.v1beta2;

/**
 * <pre>
 * AttributesFilters defines filters used to filter deployments
 * </pre>
 *
 * Protobuf type {@code akash.audit.v1beta2.AttributesFilters}
 */
public final class AttributesFilters extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:akash.audit.v1beta2.AttributesFilters)
    AttributesFiltersOrBuilder {
private static final long serialVersionUID = 0L;
  // Use AttributesFilters.newBuilder() to construct.
  private AttributesFilters(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private AttributesFilters() {
    auditors_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    owners_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new AttributesFilters();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.akash.audit.v1beta2.AuditProto.internal_static_akash_audit_v1beta2_AttributesFilters_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.akash.audit.v1beta2.AuditProto.internal_static_akash_audit_v1beta2_AttributesFilters_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.akash.audit.v1beta2.AttributesFilters.class, com.akash.audit.v1beta2.AttributesFilters.Builder.class);
  }

  public static final int AUDITORS_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList auditors_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string auditors = 1 [json_name = "auditors", (.gogoproto.jsontag) = "auditors", (.gogoproto.moretags) = "yaml:&#92;"auditors&#92;""];</code>
   * @return A list containing the auditors.
   */
  public com.google.protobuf.ProtocolStringList
      getAuditorsList() {
    return auditors_;
  }
  /**
   * <code>repeated string auditors = 1 [json_name = "auditors", (.gogoproto.jsontag) = "auditors", (.gogoproto.moretags) = "yaml:&#92;"auditors&#92;""];</code>
   * @return The count of auditors.
   */
  public int getAuditorsCount() {
    return auditors_.size();
  }
  /**
   * <code>repeated string auditors = 1 [json_name = "auditors", (.gogoproto.jsontag) = "auditors", (.gogoproto.moretags) = "yaml:&#92;"auditors&#92;""];</code>
   * @param index The index of the element to return.
   * @return The auditors at the given index.
   */
  public java.lang.String getAuditors(int index) {
    return auditors_.get(index);
  }
  /**
   * <code>repeated string auditors = 1 [json_name = "auditors", (.gogoproto.jsontag) = "auditors", (.gogoproto.moretags) = "yaml:&#92;"auditors&#92;""];</code>
   * @param index The index of the value to return.
   * @return The bytes of the auditors at the given index.
   */
  public com.google.protobuf.ByteString
      getAuditorsBytes(int index) {
    return auditors_.getByteString(index);
  }

  public static final int OWNERS_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList owners_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <code>repeated string owners = 2 [json_name = "owners", (.gogoproto.jsontag) = "owners", (.gogoproto.moretags) = "yaml:&#92;"owners&#92;""];</code>
   * @return A list containing the owners.
   */
  public com.google.protobuf.ProtocolStringList
      getOwnersList() {
    return owners_;
  }
  /**
   * <code>repeated string owners = 2 [json_name = "owners", (.gogoproto.jsontag) = "owners", (.gogoproto.moretags) = "yaml:&#92;"owners&#92;""];</code>
   * @return The count of owners.
   */
  public int getOwnersCount() {
    return owners_.size();
  }
  /**
   * <code>repeated string owners = 2 [json_name = "owners", (.gogoproto.jsontag) = "owners", (.gogoproto.moretags) = "yaml:&#92;"owners&#92;""];</code>
   * @param index The index of the element to return.
   * @return The owners at the given index.
   */
  public java.lang.String getOwners(int index) {
    return owners_.get(index);
  }
  /**
   * <code>repeated string owners = 2 [json_name = "owners", (.gogoproto.jsontag) = "owners", (.gogoproto.moretags) = "yaml:&#92;"owners&#92;""];</code>
   * @param index The index of the value to return.
   * @return The bytes of the owners at the given index.
   */
  public com.google.protobuf.ByteString
      getOwnersBytes(int index) {
    return owners_.getByteString(index);
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
    for (int i = 0; i < auditors_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, auditors_.getRaw(i));
    }
    for (int i = 0; i < owners_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, owners_.getRaw(i));
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
      for (int i = 0; i < auditors_.size(); i++) {
        dataSize += computeStringSizeNoTag(auditors_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAuditorsList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < owners_.size(); i++) {
        dataSize += computeStringSizeNoTag(owners_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getOwnersList().size();
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
    if (!(obj instanceof com.akash.audit.v1beta2.AttributesFilters)) {
      return super.equals(obj);
    }
    com.akash.audit.v1beta2.AttributesFilters other = (com.akash.audit.v1beta2.AttributesFilters) obj;

    if (!getAuditorsList()
        .equals(other.getAuditorsList())) return false;
    if (!getOwnersList()
        .equals(other.getOwnersList())) return false;
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
    if (getAuditorsCount() > 0) {
      hash = (37 * hash) + AUDITORS_FIELD_NUMBER;
      hash = (53 * hash) + getAuditorsList().hashCode();
    }
    if (getOwnersCount() > 0) {
      hash = (37 * hash) + OWNERS_FIELD_NUMBER;
      hash = (53 * hash) + getOwnersList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.akash.audit.v1beta2.AttributesFilters parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.audit.v1beta2.AttributesFilters parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.audit.v1beta2.AttributesFilters parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.audit.v1beta2.AttributesFilters parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.audit.v1beta2.AttributesFilters parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.audit.v1beta2.AttributesFilters parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.audit.v1beta2.AttributesFilters parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.audit.v1beta2.AttributesFilters parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.akash.audit.v1beta2.AttributesFilters parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.akash.audit.v1beta2.AttributesFilters parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.akash.audit.v1beta2.AttributesFilters parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.audit.v1beta2.AttributesFilters parseFrom(
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
  public static Builder newBuilder(com.akash.audit.v1beta2.AttributesFilters prototype) {
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
   * AttributesFilters defines filters used to filter deployments
   * </pre>
   *
   * Protobuf type {@code akash.audit.v1beta2.AttributesFilters}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:akash.audit.v1beta2.AttributesFilters)
      com.akash.audit.v1beta2.AttributesFiltersOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akash.audit.v1beta2.AuditProto.internal_static_akash_audit_v1beta2_AttributesFilters_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akash.audit.v1beta2.AuditProto.internal_static_akash_audit_v1beta2_AttributesFilters_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akash.audit.v1beta2.AttributesFilters.class, com.akash.audit.v1beta2.AttributesFilters.Builder.class);
    }

    // Construct using com.akash.audit.v1beta2.AttributesFilters.newBuilder()
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
      auditors_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      owners_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.akash.audit.v1beta2.AuditProto.internal_static_akash_audit_v1beta2_AttributesFilters_descriptor;
    }

    @java.lang.Override
    public com.akash.audit.v1beta2.AttributesFilters getDefaultInstanceForType() {
      return com.akash.audit.v1beta2.AttributesFilters.getDefaultInstance();
    }

    @java.lang.Override
    public com.akash.audit.v1beta2.AttributesFilters build() {
      com.akash.audit.v1beta2.AttributesFilters result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.akash.audit.v1beta2.AttributesFilters buildPartial() {
      com.akash.audit.v1beta2.AttributesFilters result = new com.akash.audit.v1beta2.AttributesFilters(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.akash.audit.v1beta2.AttributesFilters result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        auditors_.makeImmutable();
        result.auditors_ = auditors_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        owners_.makeImmutable();
        result.owners_ = owners_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.akash.audit.v1beta2.AttributesFilters) {
        return mergeFrom((com.akash.audit.v1beta2.AttributesFilters)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.akash.audit.v1beta2.AttributesFilters other) {
      if (other == com.akash.audit.v1beta2.AttributesFilters.getDefaultInstance()) return this;
      if (!other.auditors_.isEmpty()) {
        if (auditors_.isEmpty()) {
          auditors_ = other.auditors_;
          bitField0_ |= 0x00000001;
        } else {
          ensureAuditorsIsMutable();
          auditors_.addAll(other.auditors_);
        }
        onChanged();
      }
      if (!other.owners_.isEmpty()) {
        if (owners_.isEmpty()) {
          owners_ = other.owners_;
          bitField0_ |= 0x00000002;
        } else {
          ensureOwnersIsMutable();
          owners_.addAll(other.owners_);
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
              java.lang.String s = input.readStringRequireUtf8();
              ensureAuditorsIsMutable();
              auditors_.add(s);
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureOwnersIsMutable();
              owners_.add(s);
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

    private com.google.protobuf.LazyStringArrayList auditors_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureAuditorsIsMutable() {
      if (!auditors_.isModifiable()) {
        auditors_ = new com.google.protobuf.LazyStringArrayList(auditors_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <code>repeated string auditors = 1 [json_name = "auditors", (.gogoproto.jsontag) = "auditors", (.gogoproto.moretags) = "yaml:&#92;"auditors&#92;""];</code>
     * @return A list containing the auditors.
     */
    public com.google.protobuf.ProtocolStringList
        getAuditorsList() {
      auditors_.makeImmutable();
      return auditors_;
    }
    /**
     * <code>repeated string auditors = 1 [json_name = "auditors", (.gogoproto.jsontag) = "auditors", (.gogoproto.moretags) = "yaml:&#92;"auditors&#92;""];</code>
     * @return The count of auditors.
     */
    public int getAuditorsCount() {
      return auditors_.size();
    }
    /**
     * <code>repeated string auditors = 1 [json_name = "auditors", (.gogoproto.jsontag) = "auditors", (.gogoproto.moretags) = "yaml:&#92;"auditors&#92;""];</code>
     * @param index The index of the element to return.
     * @return The auditors at the given index.
     */
    public java.lang.String getAuditors(int index) {
      return auditors_.get(index);
    }
    /**
     * <code>repeated string auditors = 1 [json_name = "auditors", (.gogoproto.jsontag) = "auditors", (.gogoproto.moretags) = "yaml:&#92;"auditors&#92;""];</code>
     * @param index The index of the value to return.
     * @return The bytes of the auditors at the given index.
     */
    public com.google.protobuf.ByteString
        getAuditorsBytes(int index) {
      return auditors_.getByteString(index);
    }
    /**
     * <code>repeated string auditors = 1 [json_name = "auditors", (.gogoproto.jsontag) = "auditors", (.gogoproto.moretags) = "yaml:&#92;"auditors&#92;""];</code>
     * @param index The index to set the value at.
     * @param value The auditors to set.
     * @return This builder for chaining.
     */
    public Builder setAuditors(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAuditorsIsMutable();
      auditors_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string auditors = 1 [json_name = "auditors", (.gogoproto.jsontag) = "auditors", (.gogoproto.moretags) = "yaml:&#92;"auditors&#92;""];</code>
     * @param value The auditors to add.
     * @return This builder for chaining.
     */
    public Builder addAuditors(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAuditorsIsMutable();
      auditors_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string auditors = 1 [json_name = "auditors", (.gogoproto.jsontag) = "auditors", (.gogoproto.moretags) = "yaml:&#92;"auditors&#92;""];</code>
     * @param values The auditors to add.
     * @return This builder for chaining.
     */
    public Builder addAllAuditors(
        java.lang.Iterable<java.lang.String> values) {
      ensureAuditorsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, auditors_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string auditors = 1 [json_name = "auditors", (.gogoproto.jsontag) = "auditors", (.gogoproto.moretags) = "yaml:&#92;"auditors&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearAuditors() {
      auditors_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string auditors = 1 [json_name = "auditors", (.gogoproto.jsontag) = "auditors", (.gogoproto.moretags) = "yaml:&#92;"auditors&#92;""];</code>
     * @param value The bytes of the auditors to add.
     * @return This builder for chaining.
     */
    public Builder addAuditorsBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureAuditorsIsMutable();
      auditors_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList owners_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureOwnersIsMutable() {
      if (!owners_.isModifiable()) {
        owners_ = new com.google.protobuf.LazyStringArrayList(owners_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <code>repeated string owners = 2 [json_name = "owners", (.gogoproto.jsontag) = "owners", (.gogoproto.moretags) = "yaml:&#92;"owners&#92;""];</code>
     * @return A list containing the owners.
     */
    public com.google.protobuf.ProtocolStringList
        getOwnersList() {
      owners_.makeImmutable();
      return owners_;
    }
    /**
     * <code>repeated string owners = 2 [json_name = "owners", (.gogoproto.jsontag) = "owners", (.gogoproto.moretags) = "yaml:&#92;"owners&#92;""];</code>
     * @return The count of owners.
     */
    public int getOwnersCount() {
      return owners_.size();
    }
    /**
     * <code>repeated string owners = 2 [json_name = "owners", (.gogoproto.jsontag) = "owners", (.gogoproto.moretags) = "yaml:&#92;"owners&#92;""];</code>
     * @param index The index of the element to return.
     * @return The owners at the given index.
     */
    public java.lang.String getOwners(int index) {
      return owners_.get(index);
    }
    /**
     * <code>repeated string owners = 2 [json_name = "owners", (.gogoproto.jsontag) = "owners", (.gogoproto.moretags) = "yaml:&#92;"owners&#92;""];</code>
     * @param index The index of the value to return.
     * @return The bytes of the owners at the given index.
     */
    public com.google.protobuf.ByteString
        getOwnersBytes(int index) {
      return owners_.getByteString(index);
    }
    /**
     * <code>repeated string owners = 2 [json_name = "owners", (.gogoproto.jsontag) = "owners", (.gogoproto.moretags) = "yaml:&#92;"owners&#92;""];</code>
     * @param index The index to set the value at.
     * @param value The owners to set.
     * @return This builder for chaining.
     */
    public Builder setOwners(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureOwnersIsMutable();
      owners_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string owners = 2 [json_name = "owners", (.gogoproto.jsontag) = "owners", (.gogoproto.moretags) = "yaml:&#92;"owners&#92;""];</code>
     * @param value The owners to add.
     * @return This builder for chaining.
     */
    public Builder addOwners(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureOwnersIsMutable();
      owners_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string owners = 2 [json_name = "owners", (.gogoproto.jsontag) = "owners", (.gogoproto.moretags) = "yaml:&#92;"owners&#92;""];</code>
     * @param values The owners to add.
     * @return This builder for chaining.
     */
    public Builder addAllOwners(
        java.lang.Iterable<java.lang.String> values) {
      ensureOwnersIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, owners_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string owners = 2 [json_name = "owners", (.gogoproto.jsontag) = "owners", (.gogoproto.moretags) = "yaml:&#92;"owners&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearOwners() {
      owners_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <code>repeated string owners = 2 [json_name = "owners", (.gogoproto.jsontag) = "owners", (.gogoproto.moretags) = "yaml:&#92;"owners&#92;""];</code>
     * @param value The bytes of the owners to add.
     * @return This builder for chaining.
     */
    public Builder addOwnersBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureOwnersIsMutable();
      owners_.add(value);
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


    // @@protoc_insertion_point(builder_scope:akash.audit.v1beta2.AttributesFilters)
  }

  // @@protoc_insertion_point(class_scope:akash.audit.v1beta2.AttributesFilters)
  private static final com.akash.audit.v1beta2.AttributesFilters DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.akash.audit.v1beta2.AttributesFilters();
  }

  public static com.akash.audit.v1beta2.AttributesFilters getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AttributesFilters>
      PARSER = new com.google.protobuf.AbstractParser<AttributesFilters>() {
    @java.lang.Override
    public AttributesFilters parsePartialFrom(
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

  public static com.google.protobuf.Parser<AttributesFilters> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AttributesFilters> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.akash.audit.v1beta2.AttributesFilters getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

