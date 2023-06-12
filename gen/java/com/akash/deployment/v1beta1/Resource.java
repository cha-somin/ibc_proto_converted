// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/deployment/v1beta1/group.proto

package com.akash.deployment.v1beta1;

/**
 * <pre>
 * Resource stores unit, total count and price of resource
 * </pre>
 *
 * Protobuf type {@code akash.deployment.v1beta1.Resource}
 */
public final class Resource extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:akash.deployment.v1beta1.Resource)
    ResourceOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Resource.newBuilder() to construct.
  private Resource(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Resource() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Resource();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.akash.deployment.v1beta1.GroupProto.internal_static_akash_deployment_v1beta1_Resource_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.akash.deployment.v1beta1.GroupProto.internal_static_akash_deployment_v1beta1_Resource_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.akash.deployment.v1beta1.Resource.class, com.akash.deployment.v1beta1.Resource.Builder.class);
  }

  public static final int RESOURCES_FIELD_NUMBER = 1;
  private com.akash.base.v1beta1.ResourceUnits resources_;
  /**
   * <code>.akash.base.v1beta1.ResourceUnits resources = 1 [json_name = "resources", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "unit", (.gogoproto.moretags) = "yaml:&#92;"unit&#92;""];</code>
   * @return Whether the resources field is set.
   */
  @java.lang.Override
  public boolean hasResources() {
    return resources_ != null;
  }
  /**
   * <code>.akash.base.v1beta1.ResourceUnits resources = 1 [json_name = "resources", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "unit", (.gogoproto.moretags) = "yaml:&#92;"unit&#92;""];</code>
   * @return The resources.
   */
  @java.lang.Override
  public com.akash.base.v1beta1.ResourceUnits getResources() {
    return resources_ == null ? com.akash.base.v1beta1.ResourceUnits.getDefaultInstance() : resources_;
  }
  /**
   * <code>.akash.base.v1beta1.ResourceUnits resources = 1 [json_name = "resources", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "unit", (.gogoproto.moretags) = "yaml:&#92;"unit&#92;""];</code>
   */
  @java.lang.Override
  public com.akash.base.v1beta1.ResourceUnitsOrBuilder getResourcesOrBuilder() {
    return resources_ == null ? com.akash.base.v1beta1.ResourceUnits.getDefaultInstance() : resources_;
  }

  public static final int COUNT_FIELD_NUMBER = 2;
  private int count_ = 0;
  /**
   * <code>uint32 count = 2 [json_name = "count", (.gogoproto.jsontag) = "count", (.gogoproto.moretags) = "yaml:&#92;"count&#92;""];</code>
   * @return The count.
   */
  @java.lang.Override
  public int getCount() {
    return count_;
  }

  public static final int PRICE_FIELD_NUMBER = 3;
  private com.cosmos.base.v1beta1.Coin price_;
  /**
   * <code>.cosmos.base.v1beta1.Coin price = 3 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
   * @return Whether the price field is set.
   */
  @java.lang.Override
  public boolean hasPrice() {
    return price_ != null;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin price = 3 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
   * @return The price.
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.Coin getPrice() {
    return price_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : price_;
  }
  /**
   * <code>.cosmos.base.v1beta1.Coin price = 3 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
   */
  @java.lang.Override
  public com.cosmos.base.v1beta1.CoinOrBuilder getPriceOrBuilder() {
    return price_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : price_;
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
    if (resources_ != null) {
      output.writeMessage(1, getResources());
    }
    if (count_ != 0) {
      output.writeUInt32(2, count_);
    }
    if (price_ != null) {
      output.writeMessage(3, getPrice());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (resources_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getResources());
    }
    if (count_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt32Size(2, count_);
    }
    if (price_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(3, getPrice());
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
    if (!(obj instanceof com.akash.deployment.v1beta1.Resource)) {
      return super.equals(obj);
    }
    com.akash.deployment.v1beta1.Resource other = (com.akash.deployment.v1beta1.Resource) obj;

    if (hasResources() != other.hasResources()) return false;
    if (hasResources()) {
      if (!getResources()
          .equals(other.getResources())) return false;
    }
    if (getCount()
        != other.getCount()) return false;
    if (hasPrice() != other.hasPrice()) return false;
    if (hasPrice()) {
      if (!getPrice()
          .equals(other.getPrice())) return false;
    }
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
    if (hasResources()) {
      hash = (37 * hash) + RESOURCES_FIELD_NUMBER;
      hash = (53 * hash) + getResources().hashCode();
    }
    hash = (37 * hash) + COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getCount();
    if (hasPrice()) {
      hash = (37 * hash) + PRICE_FIELD_NUMBER;
      hash = (53 * hash) + getPrice().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.akash.deployment.v1beta1.Resource parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.deployment.v1beta1.Resource parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.deployment.v1beta1.Resource parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.deployment.v1beta1.Resource parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.deployment.v1beta1.Resource parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.akash.deployment.v1beta1.Resource parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.akash.deployment.v1beta1.Resource parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.deployment.v1beta1.Resource parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.akash.deployment.v1beta1.Resource parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.akash.deployment.v1beta1.Resource parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.akash.deployment.v1beta1.Resource parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.akash.deployment.v1beta1.Resource parseFrom(
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
  public static Builder newBuilder(com.akash.deployment.v1beta1.Resource prototype) {
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
   * Resource stores unit, total count and price of resource
   * </pre>
   *
   * Protobuf type {@code akash.deployment.v1beta1.Resource}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:akash.deployment.v1beta1.Resource)
      com.akash.deployment.v1beta1.ResourceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akash.deployment.v1beta1.GroupProto.internal_static_akash_deployment_v1beta1_Resource_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akash.deployment.v1beta1.GroupProto.internal_static_akash_deployment_v1beta1_Resource_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akash.deployment.v1beta1.Resource.class, com.akash.deployment.v1beta1.Resource.Builder.class);
    }

    // Construct using com.akash.deployment.v1beta1.Resource.newBuilder()
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
      resources_ = null;
      if (resourcesBuilder_ != null) {
        resourcesBuilder_.dispose();
        resourcesBuilder_ = null;
      }
      count_ = 0;
      price_ = null;
      if (priceBuilder_ != null) {
        priceBuilder_.dispose();
        priceBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.akash.deployment.v1beta1.GroupProto.internal_static_akash_deployment_v1beta1_Resource_descriptor;
    }

    @java.lang.Override
    public com.akash.deployment.v1beta1.Resource getDefaultInstanceForType() {
      return com.akash.deployment.v1beta1.Resource.getDefaultInstance();
    }

    @java.lang.Override
    public com.akash.deployment.v1beta1.Resource build() {
      com.akash.deployment.v1beta1.Resource result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.akash.deployment.v1beta1.Resource buildPartial() {
      com.akash.deployment.v1beta1.Resource result = new com.akash.deployment.v1beta1.Resource(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.akash.deployment.v1beta1.Resource result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resources_ = resourcesBuilder_ == null
            ? resources_
            : resourcesBuilder_.build();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.count_ = count_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.price_ = priceBuilder_ == null
            ? price_
            : priceBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.akash.deployment.v1beta1.Resource) {
        return mergeFrom((com.akash.deployment.v1beta1.Resource)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.akash.deployment.v1beta1.Resource other) {
      if (other == com.akash.deployment.v1beta1.Resource.getDefaultInstance()) return this;
      if (other.hasResources()) {
        mergeResources(other.getResources());
      }
      if (other.getCount() != 0) {
        setCount(other.getCount());
      }
      if (other.hasPrice()) {
        mergePrice(other.getPrice());
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
                  getResourcesFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 16: {
              count_ = input.readUInt32();
              bitField0_ |= 0x00000002;
              break;
            } // case 16
            case 26: {
              input.readMessage(
                  getPriceFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000004;
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

    private com.akash.base.v1beta1.ResourceUnits resources_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.akash.base.v1beta1.ResourceUnits, com.akash.base.v1beta1.ResourceUnits.Builder, com.akash.base.v1beta1.ResourceUnitsOrBuilder> resourcesBuilder_;
    /**
     * <code>.akash.base.v1beta1.ResourceUnits resources = 1 [json_name = "resources", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "unit", (.gogoproto.moretags) = "yaml:&#92;"unit&#92;""];</code>
     * @return Whether the resources field is set.
     */
    public boolean hasResources() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.akash.base.v1beta1.ResourceUnits resources = 1 [json_name = "resources", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "unit", (.gogoproto.moretags) = "yaml:&#92;"unit&#92;""];</code>
     * @return The resources.
     */
    public com.akash.base.v1beta1.ResourceUnits getResources() {
      if (resourcesBuilder_ == null) {
        return resources_ == null ? com.akash.base.v1beta1.ResourceUnits.getDefaultInstance() : resources_;
      } else {
        return resourcesBuilder_.getMessage();
      }
    }
    /**
     * <code>.akash.base.v1beta1.ResourceUnits resources = 1 [json_name = "resources", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "unit", (.gogoproto.moretags) = "yaml:&#92;"unit&#92;""];</code>
     */
    public Builder setResources(com.akash.base.v1beta1.ResourceUnits value) {
      if (resourcesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        resources_ = value;
      } else {
        resourcesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.base.v1beta1.ResourceUnits resources = 1 [json_name = "resources", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "unit", (.gogoproto.moretags) = "yaml:&#92;"unit&#92;""];</code>
     */
    public Builder setResources(
        com.akash.base.v1beta1.ResourceUnits.Builder builderForValue) {
      if (resourcesBuilder_ == null) {
        resources_ = builderForValue.build();
      } else {
        resourcesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.base.v1beta1.ResourceUnits resources = 1 [json_name = "resources", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "unit", (.gogoproto.moretags) = "yaml:&#92;"unit&#92;""];</code>
     */
    public Builder mergeResources(com.akash.base.v1beta1.ResourceUnits value) {
      if (resourcesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          resources_ != null &&
          resources_ != com.akash.base.v1beta1.ResourceUnits.getDefaultInstance()) {
          getResourcesBuilder().mergeFrom(value);
        } else {
          resources_ = value;
        }
      } else {
        resourcesBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.akash.base.v1beta1.ResourceUnits resources = 1 [json_name = "resources", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "unit", (.gogoproto.moretags) = "yaml:&#92;"unit&#92;""];</code>
     */
    public Builder clearResources() {
      bitField0_ = (bitField0_ & ~0x00000001);
      resources_ = null;
      if (resourcesBuilder_ != null) {
        resourcesBuilder_.dispose();
        resourcesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.akash.base.v1beta1.ResourceUnits resources = 1 [json_name = "resources", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "unit", (.gogoproto.moretags) = "yaml:&#92;"unit&#92;""];</code>
     */
    public com.akash.base.v1beta1.ResourceUnits.Builder getResourcesBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getResourcesFieldBuilder().getBuilder();
    }
    /**
     * <code>.akash.base.v1beta1.ResourceUnits resources = 1 [json_name = "resources", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "unit", (.gogoproto.moretags) = "yaml:&#92;"unit&#92;""];</code>
     */
    public com.akash.base.v1beta1.ResourceUnitsOrBuilder getResourcesOrBuilder() {
      if (resourcesBuilder_ != null) {
        return resourcesBuilder_.getMessageOrBuilder();
      } else {
        return resources_ == null ?
            com.akash.base.v1beta1.ResourceUnits.getDefaultInstance() : resources_;
      }
    }
    /**
     * <code>.akash.base.v1beta1.ResourceUnits resources = 1 [json_name = "resources", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "unit", (.gogoproto.moretags) = "yaml:&#92;"unit&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.akash.base.v1beta1.ResourceUnits, com.akash.base.v1beta1.ResourceUnits.Builder, com.akash.base.v1beta1.ResourceUnitsOrBuilder> 
        getResourcesFieldBuilder() {
      if (resourcesBuilder_ == null) {
        resourcesBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.akash.base.v1beta1.ResourceUnits, com.akash.base.v1beta1.ResourceUnits.Builder, com.akash.base.v1beta1.ResourceUnitsOrBuilder>(
                getResources(),
                getParentForChildren(),
                isClean());
        resources_ = null;
      }
      return resourcesBuilder_;
    }

    private int count_ ;
    /**
     * <code>uint32 count = 2 [json_name = "count", (.gogoproto.jsontag) = "count", (.gogoproto.moretags) = "yaml:&#92;"count&#92;""];</code>
     * @return The count.
     */
    @java.lang.Override
    public int getCount() {
      return count_;
    }
    /**
     * <code>uint32 count = 2 [json_name = "count", (.gogoproto.jsontag) = "count", (.gogoproto.moretags) = "yaml:&#92;"count&#92;""];</code>
     * @param value The count to set.
     * @return This builder for chaining.
     */
    public Builder setCount(int value) {

      count_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>uint32 count = 2 [json_name = "count", (.gogoproto.jsontag) = "count", (.gogoproto.moretags) = "yaml:&#92;"count&#92;""];</code>
     * @return This builder for chaining.
     */
    public Builder clearCount() {
      bitField0_ = (bitField0_ & ~0x00000002);
      count_ = 0;
      onChanged();
      return this;
    }

    private com.cosmos.base.v1beta1.Coin price_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> priceBuilder_;
    /**
     * <code>.cosmos.base.v1beta1.Coin price = 3 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
     * @return Whether the price field is set.
     */
    public boolean hasPrice() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin price = 3 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
     * @return The price.
     */
    public com.cosmos.base.v1beta1.Coin getPrice() {
      if (priceBuilder_ == null) {
        return price_ == null ? com.cosmos.base.v1beta1.Coin.getDefaultInstance() : price_;
      } else {
        return priceBuilder_.getMessage();
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin price = 3 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
     */
    public Builder setPrice(com.cosmos.base.v1beta1.Coin value) {
      if (priceBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        price_ = value;
      } else {
        priceBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin price = 3 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
     */
    public Builder setPrice(
        com.cosmos.base.v1beta1.Coin.Builder builderForValue) {
      if (priceBuilder_ == null) {
        price_ = builderForValue.build();
      } else {
        priceBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin price = 3 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
     */
    public Builder mergePrice(com.cosmos.base.v1beta1.Coin value) {
      if (priceBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0) &&
          price_ != null &&
          price_ != com.cosmos.base.v1beta1.Coin.getDefaultInstance()) {
          getPriceBuilder().mergeFrom(value);
        } else {
          price_ = value;
        }
      } else {
        priceBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin price = 3 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
     */
    public Builder clearPrice() {
      bitField0_ = (bitField0_ & ~0x00000004);
      price_ = null;
      if (priceBuilder_ != null) {
        priceBuilder_.dispose();
        priceBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin price = 3 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
     */
    public com.cosmos.base.v1beta1.Coin.Builder getPriceBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getPriceFieldBuilder().getBuilder();
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin price = 3 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
     */
    public com.cosmos.base.v1beta1.CoinOrBuilder getPriceOrBuilder() {
      if (priceBuilder_ != null) {
        return priceBuilder_.getMessageOrBuilder();
      } else {
        return price_ == null ?
            com.cosmos.base.v1beta1.Coin.getDefaultInstance() : price_;
      }
    }
    /**
     * <code>.cosmos.base.v1beta1.Coin price = 3 [json_name = "price", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "price", (.gogoproto.moretags) = "yaml:&#92;"price&#92;""];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder> 
        getPriceFieldBuilder() {
      if (priceBuilder_ == null) {
        priceBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.cosmos.base.v1beta1.Coin, com.cosmos.base.v1beta1.Coin.Builder, com.cosmos.base.v1beta1.CoinOrBuilder>(
                getPrice(),
                getParentForChildren(),
                isClean());
        price_ = null;
      }
      return priceBuilder_;
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


    // @@protoc_insertion_point(builder_scope:akash.deployment.v1beta1.Resource)
  }

  // @@protoc_insertion_point(class_scope:akash.deployment.v1beta1.Resource)
  private static final com.akash.deployment.v1beta1.Resource DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.akash.deployment.v1beta1.Resource();
  }

  public static com.akash.deployment.v1beta1.Resource getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Resource>
      PARSER = new com.google.protobuf.AbstractParser<Resource>() {
    @java.lang.Override
    public Resource parsePartialFrom(
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

  public static com.google.protobuf.Parser<Resource> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Resource> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.akash.deployment.v1beta1.Resource getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

