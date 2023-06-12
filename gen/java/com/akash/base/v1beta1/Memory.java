// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/base/v1beta1/resource.proto

package com.akash.base.v1beta1;

/**
 * <pre>
 * Memory stores resource quantity and memory attributes
 * </pre>
 *
 * Protobuf type {@code akash.base.v1beta1.Memory}
 */
public final class Memory extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:akash.base.v1beta1.Memory)
    MemoryOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Memory.newBuilder() to construct.
  private Memory(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Memory() {
    attributes_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Memory();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.akash.base.v1beta1.ResourceProto.internal_static_akash_base_v1beta1_Memory_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.akash.base.v1beta1.ResourceProto.internal_static_akash_base_v1beta1_Memory_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.akash.base.v1beta1.Memory.class, com.akash.base.v1beta1.Memory.Builder.class);
  }

  public static final int QUANTITY_FIELD_NUMBER = 1;
  private com.akash.base.v1beta1.ResourceValue quantity_;
  /**
   * <code>.akash.base.v1beta1.ResourceValue quantity = 1 [json_name = "quantity", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "size", (.gogoproto.moretags) = "yaml:&#92;"size&#92;""];</code>
   * @return Whether the quantity field is set.
   */
  @java.lang.Override
  public boolean hasQuantity() {
    return quantity_ != null;
  }
  /**
   * <code>.akash.base.v1beta1.ResourceValue quantity = 1 [json_name = "quantity", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "size", (.gogoproto.moretags) = "yaml:&#92;"size&#92;""];</code>
   * @return The quantity.
   */
  @java.lang.Override
  public com.akash.base.v1beta1.ResourceValue getQuantity() {
    return quantity_ == null ? com.akash.base.v1beta1.ResourceValue.getDefaultInstance() : quantity_;
  }
  /**
   * <code>.akash.base.v1beta1.ResourceValue quantity = 1 [json_name = "quantity", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "size", (.gogoproto.moretags) = "yaml:&#92;"size&#92;""];</code>
   */
  @java.lang.Override
  public com.akash.base.v1beta1.ResourceValueOrBuilder getQuantityOrBuilder() {
    return quantity_ == null ? com.akash.base.v1beta1.ResourceValue.getDefaultInstance() : quantity_;
  }

  public static final int ATTRIBUTES_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private java.util.List<com.akash.base.v1beta1.Attribute> attributes_;
  /**
   * <code>repeated .akash.base.v1beta1.Attribute attributes = 2 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes,omitempty", (.gogoproto.moretags) = "yaml:&#92;"cpu,omitempty&#92;""];</code>
   */
  @java.lang.Override
  public java.util.List<com.akash.base.v1beta1.Attribute> getAttributesList() {
    return attributes_;
  }
  /**
   * <code>repeated .akash.base.v1beta1.Attribute attributes = 2 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes,omitempty", (.gogoproto.moretags) = "yaml:&#92;"cpu,omitempty&#92;""];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.akash.base.v1beta1.AttributeOrBuilder> 
      getAttributesOrBuilderList() {
    return attributes_;
  }
  /**
   * <code>repeated .akash.base.v1beta1.Attribute attributes = 2 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes,omitempty", (.gogoproto.moretags) = "yaml:&#92;"cpu,omitempty&#92;""];</code>
   */
  @java.lang.Override
  public int getAttributesCount() {
    return attributes_.size();
  }
  /**
   * <code>repeated .akash.base.v1beta1.Attribute attributes = 2 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes,omitempty", (.gogoproto.moretags) = "yaml:&#92;"cpu,omitempty&#92;""];</code>
   */
  @java.lang.Override
  public com.akash.base.v1beta1.Attribute getAttributes(int index) {
    return attributes_.get(index);
  }
  /**
   * <code>repeated .akash.base.v1beta1.Attribute attributes = 2 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes,omitempty", (.gogoproto.moretags) = "yaml:&#92;"cpu,omitempty&#92;""];</code>
   */
  @java.lang.Override
  public com.akash.base.v1beta1.AttributeOrBuilder getAttributesOrBuilder(
      int index) {
    return attributes_.get(index);
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
    if (quantity_ != null) {
      output.writeMessage(1, getQuantity());
    }
    for (int i = 0; i < attributes_.size(); i++) {
      output.writeMessage(2, attributes_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (quantity_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getQuantity());
    }
    for (int i = 0; i < attributes_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, attributes_.get(i));
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
    if (!(obj instanceof com.akash.base.v1beta1.Memory)) {
      return super.equals(obj);
    }
    com.akash.base.v1beta1.Memory other = (com.akash.base.v1beta1.Memory) obj;

    if (hasQuantity() != other.hasQuantity()) return false;
    if (hasQuantity()) {
      if (!getQuantity()
          .equals(other.getQuantity())) return false;
    }
    if (!getAttributesList()
        .equals(other.getAttributesList())) return false;
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
    if (hasQuantity()) {
      hash = (37 * hash) + QUANTITY_FIELD_NUMBER;
      hash = (53 * hash) + getQuantity().hashCode();
    }
    if (getAttributesCount() > 0) {
      hash = (37 * hash) + ATTRIBUTES_FIELD_NUMBER;
      hash = (53 * hash) + getAttributesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.akash.base.v1beta1.Memory parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.base.v1beta1.Memory parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.base.v1beta1.Memory parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.base.v1beta1.Memory parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.base.v1beta1.Memory parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.base.v1beta1.Memory parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.base.v1beta1.Memory parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.base.v1beta1.Memory parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.akash.base.v1beta1.Memory parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.akash.base.v1beta1.Memory parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.akash.base.v1beta1.Memory parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.base.v1beta1.Memory parseFrom(
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
  public static Builder newBuilder(com.akash.base.v1beta1.Memory prototype) {
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
   * Memory stores resource quantity and memory attributes
   * </pre>
   *
   * Protobuf type {@code akash.base.v1beta1.Memory}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:akash.base.v1beta1.Memory)
      com.akash.base.v1beta1.MemoryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akash.base.v1beta1.ResourceProto.internal_static_akash_base_v1beta1_Memory_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akash.base.v1beta1.ResourceProto.internal_static_akash_base_v1beta1_Memory_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akash.base.v1beta1.Memory.class, com.akash.base.v1beta1.Memory.Builder.class);
    }

    // Construct using com.akash.base.v1beta1.Memory.newBuilder()
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
      quantity_ = null;
      if (quantityBuilder_ != null) {
        quantityBuilder_.dispose();
        quantityBuilder_ = null;
      }
      if (attributesBuilder_ == null) {
        attributes_ = java.util.Collections.emptyList();
      } else {
        attributes_ = null;
        attributesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000002);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.akash.base.v1beta1.ResourceProto.internal_static_akash_base_v1beta1_Memory_descriptor;
    }

    @java.lang.Override
    public com.akash.base.v1beta1.Memory getDefaultInstanceForType() {
      return com.akash.base.v1beta1.Memory.getDefaultInstance();
    }

    @java.lang.Override
    public com.akash.base.v1beta1.Memory build() {
      com.akash.base.v1beta1.Memory result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.akash.base.v1beta1.Memory buildPartial() {
      com.akash.base.v1beta1.Memory result = new com.akash.base.v1beta1.Memory(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.akash.base.v1beta1.Memory result) {
      if (attributesBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)) {
          attributes_ = java.util.Collections.unmodifiableList(attributes_);
          bitField0_ = (bitField0_ & ~0x00000002);
        }
        result.attributes_ = attributes_;
      } else {
        result.attributes_ = attributesBuilder_.build();
      }
    }

    private void buildPartial0(com.akash.base.v1beta1.Memory result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.quantity_ = quantityBuilder_ == null
            ? quantity_
            : quantityBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.akash.base.v1beta1.Memory) {
        return mergeFrom((com.akash.base.v1beta1.Memory)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.akash.base.v1beta1.Memory other) {
      if (other == com.akash.base.v1beta1.Memory.getDefaultInstance()) return this;
      if (other.hasQuantity()) {
        mergeQuantity(other.getQuantity());
      }
      if (attributesBuilder_ == null) {
        if (!other.attributes_.isEmpty()) {
          if (attributes_.isEmpty()) {
            attributes_ = other.attributes_;
            bitField0_ = (bitField0_ & ~0x00000002);
          } else {
            ensureAttributesIsMutable();
            attributes_.addAll(other.attributes_);
          }
          onChanged();
        }
      } else {
        if (!other.attributes_.isEmpty()) {
          if (attributesBuilder_.isEmpty()) {
            attributesBuilder_.dispose();
            attributesBuilder_ = null;
            attributes_ = other.attributes_;
            bitField0_ = (bitField0_ & ~0x00000002);
            attributesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getAttributesFieldBuilder() : null;
          } else {
            attributesBuilder_.addAllMessages(other.attributes_);
          }
        }
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
              input.readMessage(
                  getQuantityFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.akash.base.v1beta1.Attribute m =
                  input.readMessage(
                      com.akash.base.v1beta1.Attribute.parser(),
                      extensionRegistry);
              if (attributesBuilder_ == null) {
                ensureAttributesIsMutable();
                attributes_.add(m);
              } else {
                attributesBuilder_.addMessage(m);
              }
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

    private com.akash.base.v1beta1.ResourceValue quantity_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.akash.base.v1beta1.ResourceValue, com.akash.base.v1beta1.ResourceValue.Builder, com.akash.base.v1beta1.ResourceValueOrBuilder> quantityBuilder_;
    /**
     * <code>.akash.base.v1beta1.ResourceValue quantity = 1 [json_name = "quantity", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "size", (.gogoproto.moretags) = "yaml:&#92;"size&#92;""];</code>
     * @return Whether the quantity field is set.
     */
    public boolean hasQuantity() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.akash.base.v1beta1.ResourceValue quantity = 1 [json_name = "quantity", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "size", (.gogoproto.moretags) = "yaml:&#92;"size&#92;""];</code>
     * @return The quantity.
     */
    public com.akash.base.v1beta1.ResourceValue getQuantity() {
      if (quantityBuilder_ == null) {
        return quantity_ == null ? com.akash.base.v1beta1.ResourceValue.getDefaultInstance() : quantity_;
      } else {
        return quantityBuilder_.getMessage();
      }
    }
    /**
     * <code>.akash.base.v1beta1.ResourceValue quantity = 1 [json_name = "quantity", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "size", (.gogoproto.moretags) = "yaml:&#92;"size&#92;""];</code>
     */
    public Builder setQuantity(com.akash.base.v1beta1.ResourceValue value) {
      if (quantityBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        quantity_ = value;
      } else {
        quantityBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.base.v1beta1.ResourceValue quantity = 1 [json_name = "quantity", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "size", (.gogoproto.moretags) = "yaml:&#92;"size&#92;""];</code>
     */
    public Builder setQuantity(
        com.akash.base.v1beta1.ResourceValue.Builder builderForValue) {
      if (quantityBuilder_ == null) {
        quantity_ = builderForValue.build();
      } else {
        quantityBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.base.v1beta1.ResourceValue quantity = 1 [json_name = "quantity", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "size", (.gogoproto.moretags) = "yaml:&#92;"size&#92;""];</code>
     */
    public Builder mergeQuantity(com.akash.base.v1beta1.ResourceValue value) {
      if (quantityBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          quantity_ != null &&
          quantity_ != com.akash.base.v1beta1.ResourceValue.getDefaultInstance()) {
          getQuantityBuilder().mergeFrom(value);
        } else {
          quantity_ = value;
        }
      } else {
        quantityBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.base.v1beta1.ResourceValue quantity = 1 [json_name = "quantity", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "size", (.gogoproto.moretags) = "yaml:&#92;"size&#92;""];</code>
     */
    public Builder clearQuantity() {
      bitField0_ = (bitField0_ & ~0x00000001);
      quantity_ = null;
      if (quantityBuilder_ != null) {
        quantityBuilder_.dispose();
        quantityBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.akash.base.v1beta1.ResourceValue quantity = 1 [json_name = "quantity", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "size", (.gogoproto.moretags) = "yaml:&#92;"size&#92;""];</code>
     */
    public com.akash.base.v1beta1.ResourceValue.Builder getQuantityBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getQuantityFieldBuilder().getBuilder();
    }
    /**
     * <code>.akash.base.v1beta1.ResourceValue quantity = 1 [json_name = "quantity", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "size", (.gogoproto.moretags) = "yaml:&#92;"size&#92;""];</code>
     */
    public com.akash.base.v1beta1.ResourceValueOrBuilder getQuantityOrBuilder() {
      if (quantityBuilder_ != null) {
        return quantityBuilder_.getMessageOrBuilder();
      } else {
        return quantity_ == null ?
            com.akash.base.v1beta1.ResourceValue.getDefaultInstance() : quantity_;
      }
    }
    /**
     * <code>.akash.base.v1beta1.ResourceValue quantity = 1 [json_name = "quantity", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "size", (.gogoproto.moretags) = "yaml:&#92;"size&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.akash.base.v1beta1.ResourceValue, com.akash.base.v1beta1.ResourceValue.Builder, com.akash.base.v1beta1.ResourceValueOrBuilder> 
        getQuantityFieldBuilder() {
      if (quantityBuilder_ == null) {
        quantityBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.akash.base.v1beta1.ResourceValue, com.akash.base.v1beta1.ResourceValue.Builder, com.akash.base.v1beta1.ResourceValueOrBuilder>(
                getQuantity(),
                getParentForChildren(),
                isClean());
        quantity_ = null;
      }
      return quantityBuilder_;
    }

    private java.util.List<com.akash.base.v1beta1.Attribute> attributes_ =
      java.util.Collections.emptyList();
    private void ensureAttributesIsMutable() {
      if (!((bitField0_ & 0x00000002) != 0)) {
        attributes_ = new java.util.ArrayList<com.akash.base.v1beta1.Attribute>(attributes_);
        bitField0_ |= 0x00000002;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.akash.base.v1beta1.Attribute, com.akash.base.v1beta1.Attribute.Builder, com.akash.base.v1beta1.AttributeOrBuilder> attributesBuilder_;

    /**
     * <code>repeated .akash.base.v1beta1.Attribute attributes = 2 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes,omitempty", (.gogoproto.moretags) = "yaml:&#92;"cpu,omitempty&#92;""];</code>
     */
    public java.util.List<com.akash.base.v1beta1.Attribute> getAttributesList() {
      if (attributesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(attributes_);
      } else {
        return attributesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .akash.base.v1beta1.Attribute attributes = 2 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes,omitempty", (.gogoproto.moretags) = "yaml:&#92;"cpu,omitempty&#92;""];</code>
     */
    public int getAttributesCount() {
      if (attributesBuilder_ == null) {
        return attributes_.size();
      } else {
        return attributesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .akash.base.v1beta1.Attribute attributes = 2 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes,omitempty", (.gogoproto.moretags) = "yaml:&#92;"cpu,omitempty&#92;""];</code>
     */
    public com.akash.base.v1beta1.Attribute getAttributes(int index) {
      if (attributesBuilder_ == null) {
        return attributes_.get(index);
      } else {
        return attributesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .akash.base.v1beta1.Attribute attributes = 2 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes,omitempty", (.gogoproto.moretags) = "yaml:&#92;"cpu,omitempty&#92;""];</code>
     */
    public Builder setAttributes(
        int index, com.akash.base.v1beta1.Attribute value) {
      if (attributesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAttributesIsMutable();
        attributes_.set(index, value);
        onChanged();
      } else {
        attributesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .akash.base.v1beta1.Attribute attributes = 2 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes,omitempty", (.gogoproto.moretags) = "yaml:&#92;"cpu,omitempty&#92;""];</code>
     */
    public Builder setAttributes(
        int index, com.akash.base.v1beta1.Attribute.Builder builderForValue) {
      if (attributesBuilder_ == null) {
        ensureAttributesIsMutable();
        attributes_.set(index, builderForValue.build());
        onChanged();
      } else {
        attributesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .akash.base.v1beta1.Attribute attributes = 2 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes,omitempty", (.gogoproto.moretags) = "yaml:&#92;"cpu,omitempty&#92;""];</code>
     */
    public Builder addAttributes(com.akash.base.v1beta1.Attribute value) {
      if (attributesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAttributesIsMutable();
        attributes_.add(value);
        onChanged();
      } else {
        attributesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .akash.base.v1beta1.Attribute attributes = 2 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes,omitempty", (.gogoproto.moretags) = "yaml:&#92;"cpu,omitempty&#92;""];</code>
     */
    public Builder addAttributes(
        int index, com.akash.base.v1beta1.Attribute value) {
      if (attributesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureAttributesIsMutable();
        attributes_.add(index, value);
        onChanged();
      } else {
        attributesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .akash.base.v1beta1.Attribute attributes = 2 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes,omitempty", (.gogoproto.moretags) = "yaml:&#92;"cpu,omitempty&#92;""];</code>
     */
    public Builder addAttributes(
        com.akash.base.v1beta1.Attribute.Builder builderForValue) {
      if (attributesBuilder_ == null) {
        ensureAttributesIsMutable();
        attributes_.add(builderForValue.build());
        onChanged();
      } else {
        attributesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .akash.base.v1beta1.Attribute attributes = 2 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes,omitempty", (.gogoproto.moretags) = "yaml:&#92;"cpu,omitempty&#92;""];</code>
     */
    public Builder addAttributes(
        int index, com.akash.base.v1beta1.Attribute.Builder builderForValue) {
      if (attributesBuilder_ == null) {
        ensureAttributesIsMutable();
        attributes_.add(index, builderForValue.build());
        onChanged();
      } else {
        attributesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .akash.base.v1beta1.Attribute attributes = 2 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes,omitempty", (.gogoproto.moretags) = "yaml:&#92;"cpu,omitempty&#92;""];</code>
     */
    public Builder addAllAttributes(
        java.lang.Iterable<? extends com.akash.base.v1beta1.Attribute> values) {
      if (attributesBuilder_ == null) {
        ensureAttributesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, attributes_);
        onChanged();
      } else {
        attributesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .akash.base.v1beta1.Attribute attributes = 2 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes,omitempty", (.gogoproto.moretags) = "yaml:&#92;"cpu,omitempty&#92;""];</code>
     */
    public Builder clearAttributes() {
      if (attributesBuilder_ == null) {
        attributes_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000002);
        onChanged();
      } else {
        attributesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .akash.base.v1beta1.Attribute attributes = 2 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes,omitempty", (.gogoproto.moretags) = "yaml:&#92;"cpu,omitempty&#92;""];</code>
     */
    public Builder removeAttributes(int index) {
      if (attributesBuilder_ == null) {
        ensureAttributesIsMutable();
        attributes_.remove(index);
        onChanged();
      } else {
        attributesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .akash.base.v1beta1.Attribute attributes = 2 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes,omitempty", (.gogoproto.moretags) = "yaml:&#92;"cpu,omitempty&#92;""];</code>
     */
    public com.akash.base.v1beta1.Attribute.Builder getAttributesBuilder(
        int index) {
      return getAttributesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .akash.base.v1beta1.Attribute attributes = 2 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes,omitempty", (.gogoproto.moretags) = "yaml:&#92;"cpu,omitempty&#92;""];</code>
     */
    public com.akash.base.v1beta1.AttributeOrBuilder getAttributesOrBuilder(
        int index) {
      if (attributesBuilder_ == null) {
        return attributes_.get(index);  } else {
        return attributesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .akash.base.v1beta1.Attribute attributes = 2 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes,omitempty", (.gogoproto.moretags) = "yaml:&#92;"cpu,omitempty&#92;""];</code>
     */
    public java.util.List<? extends com.akash.base.v1beta1.AttributeOrBuilder> 
         getAttributesOrBuilderList() {
      if (attributesBuilder_ != null) {
        return attributesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(attributes_);
      }
    }
    /**
     * <code>repeated .akash.base.v1beta1.Attribute attributes = 2 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes,omitempty", (.gogoproto.moretags) = "yaml:&#92;"cpu,omitempty&#92;""];</code>
     */
    public com.akash.base.v1beta1.Attribute.Builder addAttributesBuilder() {
      return getAttributesFieldBuilder().addBuilder(
          com.akash.base.v1beta1.Attribute.getDefaultInstance());
    }
    /**
     * <code>repeated .akash.base.v1beta1.Attribute attributes = 2 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes,omitempty", (.gogoproto.moretags) = "yaml:&#92;"cpu,omitempty&#92;""];</code>
     */
    public com.akash.base.v1beta1.Attribute.Builder addAttributesBuilder(
        int index) {
      return getAttributesFieldBuilder().addBuilder(
          index, com.akash.base.v1beta1.Attribute.getDefaultInstance());
    }
    /**
     * <code>repeated .akash.base.v1beta1.Attribute attributes = 2 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes,omitempty", (.gogoproto.moretags) = "yaml:&#92;"cpu,omitempty&#92;""];</code>
     */
    public java.util.List<com.akash.base.v1beta1.Attribute.Builder> 
         getAttributesBuilderList() {
      return getAttributesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.akash.base.v1beta1.Attribute, com.akash.base.v1beta1.Attribute.Builder, com.akash.base.v1beta1.AttributeOrBuilder> 
        getAttributesFieldBuilder() {
      if (attributesBuilder_ == null) {
        attributesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.akash.base.v1beta1.Attribute, com.akash.base.v1beta1.Attribute.Builder, com.akash.base.v1beta1.AttributeOrBuilder>(
                attributes_,
                ((bitField0_ & 0x00000002) != 0),
                getParentForChildren(),
                isClean());
        attributes_ = null;
      }
      return attributesBuilder_;
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


    // @@protoc_insertion_point(builder_scope:akash.base.v1beta1.Memory)
  }

  // @@protoc_insertion_point(class_scope:akash.base.v1beta1.Memory)
  private static final com.akash.base.v1beta1.Memory DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.akash.base.v1beta1.Memory();
  }

  public static com.akash.base.v1beta1.Memory getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Memory>
      PARSER = new com.google.protobuf.AbstractParser<Memory>() {
    @java.lang.Override
    public Memory parsePartialFrom(
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

  public static com.google.protobuf.Parser<Memory> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Memory> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.akash.base.v1beta1.Memory getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

