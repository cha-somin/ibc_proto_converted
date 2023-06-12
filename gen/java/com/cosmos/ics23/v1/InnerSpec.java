// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: cosmos/ics23/v1/proofs.proto

package com.cosmos.ics23.v1;

/**
 * <pre>
 *
 *InnerSpec contains all store-specific structure info to determine if two proofs from a
 *given store are neighbors.
 *
 *This enables:
 *
 *isLeftMost(spec: InnerSpec, op: InnerOp)
 *isRightMost(spec: InnerSpec, op: InnerOp)
 *isLeftNeighbor(spec: InnerSpec, left: InnerOp, right: InnerOp)
 * </pre>
 *
 * Protobuf type {@code cosmos.ics23.v1.InnerSpec}
 */
public final class InnerSpec extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:cosmos.ics23.v1.InnerSpec)
    InnerSpecOrBuilder {
private static final long serialVersionUID = 0L;
  // Use InnerSpec.newBuilder() to construct.
  private InnerSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private InnerSpec() {
    childOrder_ = emptyIntList();
    emptyChild_ = com.google.protobuf.ByteString.EMPTY;
    hash_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new InnerSpec();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.cosmos.ics23.v1.ProofsProto.internal_static_cosmos_ics23_v1_InnerSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.cosmos.ics23.v1.ProofsProto.internal_static_cosmos_ics23_v1_InnerSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.cosmos.ics23.v1.InnerSpec.class, com.cosmos.ics23.v1.InnerSpec.Builder.class);
  }

  public static final int CHILD_ORDER_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.IntList childOrder_;
  /**
   * <pre>
   * Child order is the ordering of the children node, must count from 0
   * iavl tree is [0, 1] (left then right)
   * merk is [0, 2, 1] (left, right, here)
   * </pre>
   *
   * <code>repeated int32 child_order = 1 [json_name = "childOrder"];</code>
   * @return A list containing the childOrder.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer>
      getChildOrderList() {
    return childOrder_;
  }
  /**
   * <pre>
   * Child order is the ordering of the children node, must count from 0
   * iavl tree is [0, 1] (left then right)
   * merk is [0, 2, 1] (left, right, here)
   * </pre>
   *
   * <code>repeated int32 child_order = 1 [json_name = "childOrder"];</code>
   * @return The count of childOrder.
   */
  public int getChildOrderCount() {
    return childOrder_.size();
  }
  /**
   * <pre>
   * Child order is the ordering of the children node, must count from 0
   * iavl tree is [0, 1] (left then right)
   * merk is [0, 2, 1] (left, right, here)
   * </pre>
   *
   * <code>repeated int32 child_order = 1 [json_name = "childOrder"];</code>
   * @param index The index of the element to return.
   * @return The childOrder at the given index.
   */
  public int getChildOrder(int index) {
    return childOrder_.getInt(index);
  }
  private int childOrderMemoizedSerializedSize = -1;

  public static final int CHILD_SIZE_FIELD_NUMBER = 2;
  private int childSize_ = 0;
  /**
   * <code>int32 child_size = 2 [json_name = "childSize"];</code>
   * @return The childSize.
   */
  @java.lang.Override
  public int getChildSize() {
    return childSize_;
  }

  public static final int MIN_PREFIX_LENGTH_FIELD_NUMBER = 3;
  private int minPrefixLength_ = 0;
  /**
   * <code>int32 min_prefix_length = 3 [json_name = "minPrefixLength"];</code>
   * @return The minPrefixLength.
   */
  @java.lang.Override
  public int getMinPrefixLength() {
    return minPrefixLength_;
  }

  public static final int MAX_PREFIX_LENGTH_FIELD_NUMBER = 4;
  private int maxPrefixLength_ = 0;
  /**
   * <code>int32 max_prefix_length = 4 [json_name = "maxPrefixLength"];</code>
   * @return The maxPrefixLength.
   */
  @java.lang.Override
  public int getMaxPrefixLength() {
    return maxPrefixLength_;
  }

  public static final int EMPTY_CHILD_FIELD_NUMBER = 5;
  private com.google.protobuf.ByteString emptyChild_ = com.google.protobuf.ByteString.EMPTY;
  /**
   * <pre>
   * empty child is the prehash image that is used when one child is nil (eg. 20 bytes of 0)
   * </pre>
   *
   * <code>bytes empty_child = 5 [json_name = "emptyChild"];</code>
   * @return The emptyChild.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getEmptyChild() {
    return emptyChild_;
  }

  public static final int HASH_FIELD_NUMBER = 6;
  private int hash_ = 0;
  /**
   * <pre>
   * hash is the algorithm that must be used for each InnerOp
   * </pre>
   *
   * <code>.cosmos.ics23.v1.HashOp hash = 6 [json_name = "hash"];</code>
   * @return The enum numeric value on the wire for hash.
   */
  @java.lang.Override public int getHashValue() {
    return hash_;
  }
  /**
   * <pre>
   * hash is the algorithm that must be used for each InnerOp
   * </pre>
   *
   * <code>.cosmos.ics23.v1.HashOp hash = 6 [json_name = "hash"];</code>
   * @return The hash.
   */
  @java.lang.Override public com.cosmos.ics23.v1.HashOp getHash() {
    com.cosmos.ics23.v1.HashOp result = com.cosmos.ics23.v1.HashOp.forNumber(hash_);
    return result == null ? com.cosmos.ics23.v1.HashOp.UNRECOGNIZED : result;
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
    if (getChildOrderList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(childOrderMemoizedSerializedSize);
    }
    for (int i = 0; i < childOrder_.size(); i++) {
      output.writeInt32NoTag(childOrder_.getInt(i));
    }
    if (childSize_ != 0) {
      output.writeInt32(2, childSize_);
    }
    if (minPrefixLength_ != 0) {
      output.writeInt32(3, minPrefixLength_);
    }
    if (maxPrefixLength_ != 0) {
      output.writeInt32(4, maxPrefixLength_);
    }
    if (!emptyChild_.isEmpty()) {
      output.writeBytes(5, emptyChild_);
    }
    if (hash_ != com.cosmos.ics23.v1.HashOp.NO_HASH.getNumber()) {
      output.writeEnum(6, hash_);
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
      for (int i = 0; i < childOrder_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream
          .computeInt32SizeNoTag(childOrder_.getInt(i));
      }
      size += dataSize;
      if (!getChildOrderList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(dataSize);
      }
      childOrderMemoizedSerializedSize = dataSize;
    }
    if (childSize_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, childSize_);
    }
    if (minPrefixLength_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, minPrefixLength_);
    }
    if (maxPrefixLength_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, maxPrefixLength_);
    }
    if (!emptyChild_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream
        .computeBytesSize(5, emptyChild_);
    }
    if (hash_ != com.cosmos.ics23.v1.HashOp.NO_HASH.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(6, hash_);
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
    if (!(obj instanceof com.cosmos.ics23.v1.InnerSpec)) {
      return super.equals(obj);
    }
    com.cosmos.ics23.v1.InnerSpec other = (com.cosmos.ics23.v1.InnerSpec) obj;

    if (!getChildOrderList()
        .equals(other.getChildOrderList())) return false;
    if (getChildSize()
        != other.getChildSize()) return false;
    if (getMinPrefixLength()
        != other.getMinPrefixLength()) return false;
    if (getMaxPrefixLength()
        != other.getMaxPrefixLength()) return false;
    if (!getEmptyChild()
        .equals(other.getEmptyChild())) return false;
    if (hash_ != other.hash_) return false;
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
    if (getChildOrderCount() > 0) {
      hash = (37 * hash) + CHILD_ORDER_FIELD_NUMBER;
      hash = (53 * hash) + getChildOrderList().hashCode();
    }
    hash = (37 * hash) + CHILD_SIZE_FIELD_NUMBER;
    hash = (53 * hash) + getChildSize();
    hash = (37 * hash) + MIN_PREFIX_LENGTH_FIELD_NUMBER;
    hash = (53 * hash) + getMinPrefixLength();
    hash = (37 * hash) + MAX_PREFIX_LENGTH_FIELD_NUMBER;
    hash = (53 * hash) + getMaxPrefixLength();
    hash = (37 * hash) + EMPTY_CHILD_FIELD_NUMBER;
    hash = (53 * hash) + getEmptyChild().hashCode();
    hash = (37 * hash) + HASH_FIELD_NUMBER;
    hash = (53 * hash) + hash_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.cosmos.ics23.v1.InnerSpec parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.ics23.v1.InnerSpec parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.ics23.v1.InnerSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.ics23.v1.InnerSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.ics23.v1.InnerSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.cosmos.ics23.v1.InnerSpec parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.cosmos.ics23.v1.InnerSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.ics23.v1.InnerSpec parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.cosmos.ics23.v1.InnerSpec parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.cosmos.ics23.v1.InnerSpec parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.cosmos.ics23.v1.InnerSpec parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.cosmos.ics23.v1.InnerSpec parseFrom(
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
  public static Builder newBuilder(com.cosmos.ics23.v1.InnerSpec prototype) {
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
   *
   *InnerSpec contains all store-specific structure info to determine if two proofs from a
   *given store are neighbors.
   *
   *This enables:
   *
   *isLeftMost(spec: InnerSpec, op: InnerOp)
   *isRightMost(spec: InnerSpec, op: InnerOp)
   *isLeftNeighbor(spec: InnerSpec, left: InnerOp, right: InnerOp)
   * </pre>
   *
   * Protobuf type {@code cosmos.ics23.v1.InnerSpec}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:cosmos.ics23.v1.InnerSpec)
      com.cosmos.ics23.v1.InnerSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.cosmos.ics23.v1.ProofsProto.internal_static_cosmos_ics23_v1_InnerSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.cosmos.ics23.v1.ProofsProto.internal_static_cosmos_ics23_v1_InnerSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.cosmos.ics23.v1.InnerSpec.class, com.cosmos.ics23.v1.InnerSpec.Builder.class);
    }

    // Construct using com.cosmos.ics23.v1.InnerSpec.newBuilder()
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
      childOrder_ = emptyIntList();
      childSize_ = 0;
      minPrefixLength_ = 0;
      maxPrefixLength_ = 0;
      emptyChild_ = com.google.protobuf.ByteString.EMPTY;
      hash_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.cosmos.ics23.v1.ProofsProto.internal_static_cosmos_ics23_v1_InnerSpec_descriptor;
    }

    @java.lang.Override
    public com.cosmos.ics23.v1.InnerSpec getDefaultInstanceForType() {
      return com.cosmos.ics23.v1.InnerSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.cosmos.ics23.v1.InnerSpec build() {
      com.cosmos.ics23.v1.InnerSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.cosmos.ics23.v1.InnerSpec buildPartial() {
      com.cosmos.ics23.v1.InnerSpec result = new com.cosmos.ics23.v1.InnerSpec(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.cosmos.ics23.v1.InnerSpec result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        childOrder_.makeImmutable();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.childOrder_ = childOrder_;
    }

    private void buildPartial0(com.cosmos.ics23.v1.InnerSpec result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.childSize_ = childSize_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.minPrefixLength_ = minPrefixLength_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.maxPrefixLength_ = maxPrefixLength_;
      }
      if (((from_bitField0_ & 0x00000010) != 0)) {
        result.emptyChild_ = emptyChild_;
      }
      if (((from_bitField0_ & 0x00000020) != 0)) {
        result.hash_ = hash_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.cosmos.ics23.v1.InnerSpec) {
        return mergeFrom((com.cosmos.ics23.v1.InnerSpec)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.cosmos.ics23.v1.InnerSpec other) {
      if (other == com.cosmos.ics23.v1.InnerSpec.getDefaultInstance()) return this;
      if (!other.childOrder_.isEmpty()) {
        if (childOrder_.isEmpty()) {
          childOrder_ = other.childOrder_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureChildOrderIsMutable();
          childOrder_.addAll(other.childOrder_);
        }
        onChanged();
      }
      if (other.getChildSize() != 0) {
        setChildSize(other.getChildSize());
      }
      if (other.getMinPrefixLength() != 0) {
        setMinPrefixLength(other.getMinPrefixLength());
      }
      if (other.getMaxPrefixLength() != 0) {
        setMaxPrefixLength(other.getMaxPrefixLength());
      }
      if (other.getEmptyChild() != com.google.protobuf.ByteString.EMPTY) {
        setEmptyChild(other.getEmptyChild());
      }
      if (other.hash_ != 0) {
        setHashValue(other.getHashValue());
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
            case 8: {
              int v = input.readInt32();
              ensureChildOrderIsMutable();
              childOrder_.addInt(v);
              break;
            } // case 8
            case 10: {
              int length = input.readRawVarint32();
              int limit = input.pushLimit(length);
              ensureChildOrderIsMutable();
              while (input.getBytesUntilLimit() > 0) {
                childOrder_.addInt(input.readInt32());
              }
              input.popLimit(limit);
              break;
            } // case 10
            case 16: {
              childSize_ = input.readInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 24: {
              minPrefixLength_ = input.readInt32();
              bitField0_ |= 0x00000004;
              break;
            } // case 24
            case 32: {
              maxPrefixLength_ = input.readInt32();
              bitField0_ |= 0x00000008;
              break;
            } // case 32
            case 42: {
              emptyChild_ = input.readBytes();
              bitField0_ |= 0x00000010;
              break;
            } // case 42
            case 48: {
              hash_ = input.readEnum();
              bitField0_ |= 0x00000020;
              break;
            } // case 48
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

    private com.google.protobuf.Internal.IntList childOrder_ = emptyIntList();
    private void ensureChildOrderIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        childOrder_ = mutableCopy(childOrder_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     * <pre>
     * Child order is the ordering of the children node, must count from 0
     * iavl tree is [0, 1] (left then right)
     * merk is [0, 2, 1] (left, right, here)
     * </pre>
     *
     * <code>repeated int32 child_order = 1 [json_name = "childOrder"];</code>
     * @return A list containing the childOrder.
     */
    public java.util.List<java.lang.Integer>
        getChildOrderList() {
      return ((bitField0_ & 0x00000001) != 0) ?
               java.util.Collections.unmodifiableList(childOrder_) : childOrder_;
    }
    /**
     * <pre>
     * Child order is the ordering of the children node, must count from 0
     * iavl tree is [0, 1] (left then right)
     * merk is [0, 2, 1] (left, right, here)
     * </pre>
     *
     * <code>repeated int32 child_order = 1 [json_name = "childOrder"];</code>
     * @return The count of childOrder.
     */
    public int getChildOrderCount() {
      return childOrder_.size();
    }
    /**
     * <pre>
     * Child order is the ordering of the children node, must count from 0
     * iavl tree is [0, 1] (left then right)
     * merk is [0, 2, 1] (left, right, here)
     * </pre>
     *
     * <code>repeated int32 child_order = 1 [json_name = "childOrder"];</code>
     * @param index The index of the element to return.
     * @return The childOrder at the given index.
     */
    public int getChildOrder(int index) {
      return childOrder_.getInt(index);
    }
    /**
     * <pre>
     * Child order is the ordering of the children node, must count from 0
     * iavl tree is [0, 1] (left then right)
     * merk is [0, 2, 1] (left, right, here)
     * </pre>
     *
     * <code>repeated int32 child_order = 1 [json_name = "childOrder"];</code>
     * @param index The index to set the value at.
     * @param value The childOrder to set.
     * @return This builder for chaining.
     */
    public Builder setChildOrder(
        int index, int value) {

      ensureChildOrderIsMutable();
      childOrder_.setInt(index, value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Child order is the ordering of the children node, must count from 0
     * iavl tree is [0, 1] (left then right)
     * merk is [0, 2, 1] (left, right, here)
     * </pre>
     *
     * <code>repeated int32 child_order = 1 [json_name = "childOrder"];</code>
     * @param value The childOrder to add.
     * @return This builder for chaining.
     */
    public Builder addChildOrder(int value) {

      ensureChildOrderIsMutable();
      childOrder_.addInt(value);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Child order is the ordering of the children node, must count from 0
     * iavl tree is [0, 1] (left then right)
     * merk is [0, 2, 1] (left, right, here)
     * </pre>
     *
     * <code>repeated int32 child_order = 1 [json_name = "childOrder"];</code>
     * @param values The childOrder to add.
     * @return This builder for chaining.
     */
    public Builder addAllChildOrder(
        java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureChildOrderIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, childOrder_);
      onChanged();
      return this;
    }
    /**
     * <pre>
     * Child order is the ordering of the children node, must count from 0
     * iavl tree is [0, 1] (left then right)
     * merk is [0, 2, 1] (left, right, here)
     * </pre>
     *
     * <code>repeated int32 child_order = 1 [json_name = "childOrder"];</code>
     * @return This builder for chaining.
     */
    public Builder clearChildOrder() {
      childOrder_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private int childSize_ ;
    /**
     * <code>int32 child_size = 2 [json_name = "childSize"];</code>
     * @return The childSize.
     */
    @java.lang.Override
    public int getChildSize() {
      return childSize_;
    }
    /**
     * <code>int32 child_size = 2 [json_name = "childSize"];</code>
     * @param value The childSize to set.
     * @return This builder for chaining.
     */
    public Builder setChildSize(int value) {

      childSize_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>int32 child_size = 2 [json_name = "childSize"];</code>
     * @return This builder for chaining.
     */
    public Builder clearChildSize() {
      bitField0_ = (bitField0_ & ~0x00000002);
      childSize_ = 0;
      onChanged();
      return this;
    }

    private int minPrefixLength_ ;
    /**
     * <code>int32 min_prefix_length = 3 [json_name = "minPrefixLength"];</code>
     * @return The minPrefixLength.
     */
    @java.lang.Override
    public int getMinPrefixLength() {
      return minPrefixLength_;
    }
    /**
     * <code>int32 min_prefix_length = 3 [json_name = "minPrefixLength"];</code>
     * @param value The minPrefixLength to set.
     * @return This builder for chaining.
     */
    public Builder setMinPrefixLength(int value) {

      minPrefixLength_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>int32 min_prefix_length = 3 [json_name = "minPrefixLength"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMinPrefixLength() {
      bitField0_ = (bitField0_ & ~0x00000004);
      minPrefixLength_ = 0;
      onChanged();
      return this;
    }

    private int maxPrefixLength_ ;
    /**
     * <code>int32 max_prefix_length = 4 [json_name = "maxPrefixLength"];</code>
     * @return The maxPrefixLength.
     */
    @java.lang.Override
    public int getMaxPrefixLength() {
      return maxPrefixLength_;
    }
    /**
     * <code>int32 max_prefix_length = 4 [json_name = "maxPrefixLength"];</code>
     * @param value The maxPrefixLength to set.
     * @return This builder for chaining.
     */
    public Builder setMaxPrefixLength(int value) {

      maxPrefixLength_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     * <code>int32 max_prefix_length = 4 [json_name = "maxPrefixLength"];</code>
     * @return This builder for chaining.
     */
    public Builder clearMaxPrefixLength() {
      bitField0_ = (bitField0_ & ~0x00000008);
      maxPrefixLength_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString emptyChild_ = com.google.protobuf.ByteString.EMPTY;
    /**
     * <pre>
     * empty child is the prehash image that is used when one child is nil (eg. 20 bytes of 0)
     * </pre>
     *
     * <code>bytes empty_child = 5 [json_name = "emptyChild"];</code>
     * @return The emptyChild.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getEmptyChild() {
      return emptyChild_;
    }
    /**
     * <pre>
     * empty child is the prehash image that is used when one child is nil (eg. 20 bytes of 0)
     * </pre>
     *
     * <code>bytes empty_child = 5 [json_name = "emptyChild"];</code>
     * @param value The emptyChild to set.
     * @return This builder for chaining.
     */
    public Builder setEmptyChild(com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      emptyChild_ = value;
      bitField0_ |= 0x00000010;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * empty child is the prehash image that is used when one child is nil (eg. 20 bytes of 0)
     * </pre>
     *
     * <code>bytes empty_child = 5 [json_name = "emptyChild"];</code>
     * @return This builder for chaining.
     */
    public Builder clearEmptyChild() {
      bitField0_ = (bitField0_ & ~0x00000010);
      emptyChild_ = getDefaultInstance().getEmptyChild();
      onChanged();
      return this;
    }

    private int hash_ = 0;
    /**
     * <pre>
     * hash is the algorithm that must be used for each InnerOp
     * </pre>
     *
     * <code>.cosmos.ics23.v1.HashOp hash = 6 [json_name = "hash"];</code>
     * @return The enum numeric value on the wire for hash.
     */
    @java.lang.Override public int getHashValue() {
      return hash_;
    }
    /**
     * <pre>
     * hash is the algorithm that must be used for each InnerOp
     * </pre>
     *
     * <code>.cosmos.ics23.v1.HashOp hash = 6 [json_name = "hash"];</code>
     * @param value The enum numeric value on the wire for hash to set.
     * @return This builder for chaining.
     */
    public Builder setHashValue(int value) {
      hash_ = value;
      bitField0_ |= 0x00000020;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * hash is the algorithm that must be used for each InnerOp
     * </pre>
     *
     * <code>.cosmos.ics23.v1.HashOp hash = 6 [json_name = "hash"];</code>
     * @return The hash.
     */
    @java.lang.Override
    public com.cosmos.ics23.v1.HashOp getHash() {
      com.cosmos.ics23.v1.HashOp result = com.cosmos.ics23.v1.HashOp.forNumber(hash_);
      return result == null ? com.cosmos.ics23.v1.HashOp.UNRECOGNIZED : result;
    }
    /**
     * <pre>
     * hash is the algorithm that must be used for each InnerOp
     * </pre>
     *
     * <code>.cosmos.ics23.v1.HashOp hash = 6 [json_name = "hash"];</code>
     * @param value The hash to set.
     * @return This builder for chaining.
     */
    public Builder setHash(com.cosmos.ics23.v1.HashOp value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000020;
      hash_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <pre>
     * hash is the algorithm that must be used for each InnerOp
     * </pre>
     *
     * <code>.cosmos.ics23.v1.HashOp hash = 6 [json_name = "hash"];</code>
     * @return This builder for chaining.
     */
    public Builder clearHash() {
      bitField0_ = (bitField0_ & ~0x00000020);
      hash_ = 0;
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


    // @@protoc_insertion_point(builder_scope:cosmos.ics23.v1.InnerSpec)
  }

  // @@protoc_insertion_point(class_scope:cosmos.ics23.v1.InnerSpec)
  private static final com.cosmos.ics23.v1.InnerSpec DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.cosmos.ics23.v1.InnerSpec();
  }

  public static com.cosmos.ics23.v1.InnerSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InnerSpec>
      PARSER = new com.google.protobuf.AbstractParser<InnerSpec>() {
    @java.lang.Override
    public InnerSpec parsePartialFrom(
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

  public static com.google.protobuf.Parser<InnerSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InnerSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.cosmos.ics23.v1.InnerSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

