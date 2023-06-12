// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/base/v1beta2/attribute.proto

package com.akash.base.v1beta2;

/**
 * <pre>
 * SignedBy represents validation accounts that tenant expects signatures for provider attributes
 * AllOf has precedence i.e. if there is at least one entry AnyOf is ignored regardless to how many
 * entries there
 * this behaviour to be discussed
 * </pre>
 *
 * Protobuf type {@code akash.base.v1beta2.SignedBy}
 */
public final class SignedBy extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:akash.base.v1beta2.SignedBy)
    SignedByOrBuilder {
private static final long serialVersionUID = 0L;
  // Use SignedBy.newBuilder() to construct.
  private SignedBy(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private SignedBy() {
    allOf_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    anyOf_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new SignedBy();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.akash.base.v1beta2.AttributeProto.internal_static_akash_base_v1beta2_SignedBy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.akash.base.v1beta2.AttributeProto.internal_static_akash_base_v1beta2_SignedBy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.akash.base.v1beta2.SignedBy.class, com.akash.base.v1beta2.SignedBy.Builder.class);
  }

  public static final int ALL_OF_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList allOf_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * all_of all keys in this list must have signed attributes
   * </pre>
   *
   * <code>repeated string all_of = 1 [json_name = "allOf", (.gogoproto.jsontag) = "all_of", (.gogoproto.moretags) = "yaml:&#92;"allOf&#92;""];</code>
   * @return A list containing the allOf.
   */
  public com.google.protobuf.ProtocolStringList
      getAllOfList() {
    return allOf_;
  }
  /**
   * <pre>
   * all_of all keys in this list must have signed attributes
   * </pre>
   *
   * <code>repeated string all_of = 1 [json_name = "allOf", (.gogoproto.jsontag) = "all_of", (.gogoproto.moretags) = "yaml:&#92;"allOf&#92;""];</code>
   * @return The count of allOf.
   */
  public int getAllOfCount() {
    return allOf_.size();
  }
  /**
   * <pre>
   * all_of all keys in this list must have signed attributes
   * </pre>
   *
   * <code>repeated string all_of = 1 [json_name = "allOf", (.gogoproto.jsontag) = "all_of", (.gogoproto.moretags) = "yaml:&#92;"allOf&#92;""];</code>
   * @param index The index of the element to return.
   * @return The allOf at the given index.
   */
  public java.lang.String getAllOf(int index) {
    return allOf_.get(index);
  }
  /**
   * <pre>
   * all_of all keys in this list must have signed attributes
   * </pre>
   *
   * <code>repeated string all_of = 1 [json_name = "allOf", (.gogoproto.jsontag) = "all_of", (.gogoproto.moretags) = "yaml:&#92;"allOf&#92;""];</code>
   * @param index The index of the value to return.
   * @return The bytes of the allOf at the given index.
   */
  public com.google.protobuf.ByteString
      getAllOfBytes(int index) {
    return allOf_.getByteString(index);
  }

  public static final int ANY_OF_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList anyOf_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * any_of at least of of the keys from the list must have signed attributes
   * </pre>
   *
   * <code>repeated string any_of = 2 [json_name = "anyOf", (.gogoproto.jsontag) = "any_of", (.gogoproto.moretags) = "yaml:&#92;"anyOf&#92;""];</code>
   * @return A list containing the anyOf.
   */
  public com.google.protobuf.ProtocolStringList
      getAnyOfList() {
    return anyOf_;
  }
  /**
   * <pre>
   * any_of at least of of the keys from the list must have signed attributes
   * </pre>
   *
   * <code>repeated string any_of = 2 [json_name = "anyOf", (.gogoproto.jsontag) = "any_of", (.gogoproto.moretags) = "yaml:&#92;"anyOf&#92;""];</code>
   * @return The count of anyOf.
   */
  public int getAnyOfCount() {
    return anyOf_.size();
  }
  /**
   * <pre>
   * any_of at least of of the keys from the list must have signed attributes
   * </pre>
   *
   * <code>repeated string any_of = 2 [json_name = "anyOf", (.gogoproto.jsontag) = "any_of", (.gogoproto.moretags) = "yaml:&#92;"anyOf&#92;""];</code>
   * @param index The index of the element to return.
   * @return The anyOf at the given index.
   */
  public java.lang.String getAnyOf(int index) {
    return anyOf_.get(index);
  }
  /**
   * <pre>
   * any_of at least of of the keys from the list must have signed attributes
   * </pre>
   *
   * <code>repeated string any_of = 2 [json_name = "anyOf", (.gogoproto.jsontag) = "any_of", (.gogoproto.moretags) = "yaml:&#92;"anyOf&#92;""];</code>
   * @param index The index of the value to return.
   * @return The bytes of the anyOf at the given index.
   */
  public com.google.protobuf.ByteString
      getAnyOfBytes(int index) {
    return anyOf_.getByteString(index);
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
    for (int i = 0; i < allOf_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, allOf_.getRaw(i));
    }
    for (int i = 0; i < anyOf_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, anyOf_.getRaw(i));
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
      for (int i = 0; i < allOf_.size(); i++) {
        dataSize += computeStringSizeNoTag(allOf_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAllOfList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < anyOf_.size(); i++) {
        dataSize += computeStringSizeNoTag(anyOf_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAnyOfList().size();
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
    if (!(obj instanceof com.akash.base.v1beta2.SignedBy)) {
      return super.equals(obj);
    }
    com.akash.base.v1beta2.SignedBy other = (com.akash.base.v1beta2.SignedBy) obj;

    if (!getAllOfList()
        .equals(other.getAllOfList())) return false;
    if (!getAnyOfList()
        .equals(other.getAnyOfList())) return false;
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
    if (getAllOfCount() > 0) {
      hash = (37 * hash) + ALL_OF_FIELD_NUMBER;
      hash = (53 * hash) + getAllOfList().hashCode();
    }
    if (getAnyOfCount() > 0) {
      hash = (37 * hash) + ANY_OF_FIELD_NUMBER;
      hash = (53 * hash) + getAnyOfList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.akash.base.v1beta2.SignedBy parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.base.v1beta2.SignedBy parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.base.v1beta2.SignedBy parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.base.v1beta2.SignedBy parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.base.v1beta2.SignedBy parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.base.v1beta2.SignedBy parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.base.v1beta2.SignedBy parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.base.v1beta2.SignedBy parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.akash.base.v1beta2.SignedBy parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.akash.base.v1beta2.SignedBy parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.akash.base.v1beta2.SignedBy parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.base.v1beta2.SignedBy parseFrom(
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
  public static Builder newBuilder(com.akash.base.v1beta2.SignedBy prototype) {
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
   * SignedBy represents validation accounts that tenant expects signatures for provider attributes
   * AllOf has precedence i.e. if there is at least one entry AnyOf is ignored regardless to how many
   * entries there
   * this behaviour to be discussed
   * </pre>
   *
   * Protobuf type {@code akash.base.v1beta2.SignedBy}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:akash.base.v1beta2.SignedBy)
      com.akash.base.v1beta2.SignedByOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akash.base.v1beta2.AttributeProto.internal_static_akash_base_v1beta2_SignedBy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akash.base.v1beta2.AttributeProto.internal_static_akash_base_v1beta2_SignedBy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akash.base.v1beta2.SignedBy.class, com.akash.base.v1beta2.SignedBy.Builder.class);
    }

    // Construct using com.akash.base.v1beta2.SignedBy.newBuilder()
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
      allOf_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      anyOf_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.akash.base.v1beta2.AttributeProto.internal_static_akash_base_v1beta2_SignedBy_descriptor;
    }

    @java.lang.Override
    public com.akash.base.v1beta2.SignedBy getDefaultInstanceForType() {
      return com.akash.base.v1beta2.SignedBy.getDefaultInstance();
    }

    @java.lang.Override
    public com.akash.base.v1beta2.SignedBy build() {
      com.akash.base.v1beta2.SignedBy result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.akash.base.v1beta2.SignedBy buildPartial() {
      com.akash.base.v1beta2.SignedBy result = new com.akash.base.v1beta2.SignedBy(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.akash.base.v1beta2.SignedBy result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        allOf_.makeImmutable();
        result.allOf_ = allOf_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        anyOf_.makeImmutable();
        result.anyOf_ = anyOf_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.akash.base.v1beta2.SignedBy) {
        return mergeFrom((com.akash.base.v1beta2.SignedBy)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.akash.base.v1beta2.SignedBy other) {
      if (other == com.akash.base.v1beta2.SignedBy.getDefaultInstance()) return this;
      if (!other.allOf_.isEmpty()) {
        if (allOf_.isEmpty()) {
          allOf_ = other.allOf_;
          bitField0_ |= 0x00000001;
        } else {
          ensureAllOfIsMutable();
          allOf_.addAll(other.allOf_);
        }
        onChanged();
      }
      if (!other.anyOf_.isEmpty()) {
        if (anyOf_.isEmpty()) {
          anyOf_ = other.anyOf_;
          bitField0_ |= 0x00000002;
        } else {
          ensureAnyOfIsMutable();
          anyOf_.addAll(other.anyOf_);
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
              ensureAllOfIsMutable();
              allOf_.add(s);
              break;
            } // case 10
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureAnyOfIsMutable();
              anyOf_.add(s);
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

    private com.google.protobuf.LazyStringArrayList allOf_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureAllOfIsMutable() {
      if (!allOf_.isModifiable()) {
        allOf_ = new com.google.protobuf.LazyStringArrayList(allOf_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * all_of all keys in this list must have signed attributes
     * </pre>
     *
     * <code>repeated string all_of = 1 [json_name = "allOf", (.gogoproto.jsontag) = "all_of", (.gogoproto.moretags) = "yaml:&#92;"allOf&#92;""];</code>
     * @return A list containing the allOf.
     */
    public com.google.protobuf.ProtocolStringList
        getAllOfList() {
      allOf_.makeImmutable();
      return allOf_;
    }
    /**
     * <pre>
     * all_of all keys in this list must have signed attributes
     * </pre>
     *
     * <code>repeated string all_of = 1 [json_name = "allOf", (.gogoproto.jsontag) = "all_of", (.gogoproto.moretags) = "yaml:&#92;"allOf&#92;""];</code>
     * @return The count of allOf.
     */
    public int getAllOfCount() {
      return allOf_.size();
    }
    /**
     * <pre>
     * all_of all keys in this list must have signed attributes
     * </pre>
     *
     * <code>repeated string all_of = 1 [json_name = "allOf", (.gogoproto.jsontag) = "all_of", (.gogoproto.moretags) = "yaml:&#92;"allOf&#92;""];</code>
     * @param index The index of the element to return.
     * @return The allOf at the given index.
     */
    public java.lang.String getAllOf(int index) {
      return allOf_.get(index);
    }
    /**
     * <pre>
     * all_of all keys in this list must have signed attributes
     * </pre>
     *
     * <code>repeated string all_of = 1 [json_name = "allOf", (.gogoproto.jsontag) = "all_of", (.gogoproto.moretags) = "yaml:&#92;"allOf&#92;""];</code>
     * @param index The index of the value to return.
     * @return The bytes of the allOf at the given index.
     */
    public com.google.protobuf.ByteString
        getAllOfBytes(int index) {
      return allOf_.getByteString(index);
    }
    /**
     * <pre>
     * all_of all keys in this list must have signed attributes
     * </pre>
     *
     * <code>repeated string all_of = 1 [json_name = "allOf", (.gogoproto.jsontag) = "all_of", (.gogoproto.moretags) = "yaml:&#92;"allOf&#92;""];</code>
     * @param index The index to set the value at.
     * @param value The allOf to set.
     * @return This builder for chaining.
     */
    public Builder setAllOf(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAllOfIsMutable();
      allOf_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * all_of all keys in this list must have signed attributes
     * </pre>
     *
     * <code>repeated string all_of = 1 [json_name = "allOf", (.gogoproto.jsontag) = "all_of", (.gogoproto.moretags) = "yaml:&#92;"allOf&#92;""];</code>
     * @param value The allOf to add.
     * @return This builder for chaining.
     */
    public Builder addAllOf(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAllOfIsMutable();
      allOf_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * all_of all keys in this list must have signed attributes
     * </pre>
     *
     * <code>repeated string all_of = 1 [json_name = "allOf", (.gogoproto.jsontag) = "all_of", (.gogoproto.moretags) = "yaml:&#92;"allOf&#92;""];</code>
     * @param values The allOf to add.
     * @return This builder for chaining.
     */
    public Builder addAllAllOf(
        java.lang.Iterable<java.lang.String> values) {
      ensureAllOfIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, allOf_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * all_of all keys in this list must have signed attributes
     * </pre>
     *
     * <code>repeated string all_of = 1 [json_name = "allOf", (.gogoproto.jsontag) = "all_of", (.gogoproto.moretags) = "yaml:&#92;"allOf&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearAllOf() {
      allOf_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * all_of all keys in this list must have signed attributes
     * </pre>
     *
     * <code>repeated string all_of = 1 [json_name = "allOf", (.gogoproto.jsontag) = "all_of", (.gogoproto.moretags) = "yaml:&#92;"allOf&#92;""];</code>
     * @param value The bytes of the allOf to add.
     * @return This builder for chaining.
     */
    public Builder addAllOfBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureAllOfIsMutable();
      allOf_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList anyOf_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureAnyOfIsMutable() {
      if (!anyOf_.isModifiable()) {
        anyOf_ = new com.google.protobuf.LazyStringArrayList(anyOf_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * any_of at least of of the keys from the list must have signed attributes
     * </pre>
     *
     * <code>repeated string any_of = 2 [json_name = "anyOf", (.gogoproto.jsontag) = "any_of", (.gogoproto.moretags) = "yaml:&#92;"anyOf&#92;""];</code>
     * @return A list containing the anyOf.
     */
    public com.google.protobuf.ProtocolStringList
        getAnyOfList() {
      anyOf_.makeImmutable();
      return anyOf_;
    }
    /**
     * <pre>
     * any_of at least of of the keys from the list must have signed attributes
     * </pre>
     *
     * <code>repeated string any_of = 2 [json_name = "anyOf", (.gogoproto.jsontag) = "any_of", (.gogoproto.moretags) = "yaml:&#92;"anyOf&#92;""];</code>
     * @return The count of anyOf.
     */
    public int getAnyOfCount() {
      return anyOf_.size();
    }
    /**
     * <pre>
     * any_of at least of of the keys from the list must have signed attributes
     * </pre>
     *
     * <code>repeated string any_of = 2 [json_name = "anyOf", (.gogoproto.jsontag) = "any_of", (.gogoproto.moretags) = "yaml:&#92;"anyOf&#92;""];</code>
     * @param index The index of the element to return.
     * @return The anyOf at the given index.
     */
    public java.lang.String getAnyOf(int index) {
      return anyOf_.get(index);
    }
    /**
     * <pre>
     * any_of at least of of the keys from the list must have signed attributes
     * </pre>
     *
     * <code>repeated string any_of = 2 [json_name = "anyOf", (.gogoproto.jsontag) = "any_of", (.gogoproto.moretags) = "yaml:&#92;"anyOf&#92;""];</code>
     * @param index The index of the value to return.
     * @return The bytes of the anyOf at the given index.
     */
    public com.google.protobuf.ByteString
        getAnyOfBytes(int index) {
      return anyOf_.getByteString(index);
    }
    /**
     * <pre>
     * any_of at least of of the keys from the list must have signed attributes
     * </pre>
     *
     * <code>repeated string any_of = 2 [json_name = "anyOf", (.gogoproto.jsontag) = "any_of", (.gogoproto.moretags) = "yaml:&#92;"anyOf&#92;""];</code>
     * @param index The index to set the value at.
     * @param value The anyOf to set.
     * @return This builder for chaining.
     */
    public Builder setAnyOf(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAnyOfIsMutable();
      anyOf_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * any_of at least of of the keys from the list must have signed attributes
     * </pre>
     *
     * <code>repeated string any_of = 2 [json_name = "anyOf", (.gogoproto.jsontag) = "any_of", (.gogoproto.moretags) = "yaml:&#92;"anyOf&#92;""];</code>
     * @param value The anyOf to add.
     * @return This builder for chaining.
     */
    public Builder addAnyOf(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureAnyOfIsMutable();
      anyOf_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * any_of at least of of the keys from the list must have signed attributes
     * </pre>
     *
     * <code>repeated string any_of = 2 [json_name = "anyOf", (.gogoproto.jsontag) = "any_of", (.gogoproto.moretags) = "yaml:&#92;"anyOf&#92;""];</code>
     * @param values The anyOf to add.
     * @return This builder for chaining.
     */
    public Builder addAllAnyOf(
        java.lang.Iterable<java.lang.String> values) {
      ensureAnyOfIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, anyOf_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * any_of at least of of the keys from the list must have signed attributes
     * </pre>
     *
     * <code>repeated string any_of = 2 [json_name = "anyOf", (.gogoproto.jsontag) = "any_of", (.gogoproto.moretags) = "yaml:&#92;"anyOf&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearAnyOf() {
      anyOf_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * any_of at least of of the keys from the list must have signed attributes
     * </pre>
     *
     * <code>repeated string any_of = 2 [json_name = "anyOf", (.gogoproto.jsontag) = "any_of", (.gogoproto.moretags) = "yaml:&#92;"anyOf&#92;""];</code>
     * @param value The bytes of the anyOf to add.
     * @return This builder for chaining.
     */
    public Builder addAnyOfBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureAnyOfIsMutable();
      anyOf_.add(value);
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


    // @@protoc_insertion_point(builder_scope:akash.base.v1beta2.SignedBy)
  }

  // @@protoc_insertion_point(class_scope:akash.base.v1beta2.SignedBy)
  private static final com.akash.base.v1beta2.SignedBy DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.akash.base.v1beta2.SignedBy();
  }

  public static com.akash.base.v1beta2.SignedBy getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SignedBy>
      PARSER = new com.google.protobuf.AbstractParser<SignedBy>() {
    @java.lang.Override
    public SignedBy parsePartialFrom(
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

  public static com.google.protobuf.Parser<SignedBy> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SignedBy> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.akash.base.v1beta2.SignedBy getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

