// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetmantle/identities/genesis/genesis.proto

package com.assetmantle.modules.identities.genesis;

/**
 * Protobuf type {@code assetmantle.modules.identities.genesis.Genesis}
 */
public final class Genesis extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:assetmantle.modules.identities.genesis.Genesis)
    GenesisOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Genesis.newBuilder() to construct.
  private Genesis(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Genesis() {
    mappables_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Genesis();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.assetmantle.modules.identities.genesis.GenesisProto.internal_static_assetmantle_modules_identities_genesis_Genesis_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.assetmantle.modules.identities.genesis.GenesisProto.internal_static_assetmantle_modules_identities_genesis_Genesis_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.assetmantle.modules.identities.genesis.Genesis.class, com.assetmantle.modules.identities.genesis.Genesis.Builder.class);
  }

  public static final int MAPPABLES_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<com.assetmantle.modules.identities.mappable.Mappable> mappables_;
  /**
   * <code>repeated .assetmantle.modules.identities.mappable.Mappable mappables = 1 [json_name = "mappables"];</code>
   */
  @java.lang.Override
  public java.util.List<com.assetmantle.modules.identities.mappable.Mappable> getMappablesList() {
    return mappables_;
  }
  /**
   * <code>repeated .assetmantle.modules.identities.mappable.Mappable mappables = 1 [json_name = "mappables"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.assetmantle.modules.identities.mappable.MappableOrBuilder> 
      getMappablesOrBuilderList() {
    return mappables_;
  }
  /**
   * <code>repeated .assetmantle.modules.identities.mappable.Mappable mappables = 1 [json_name = "mappables"];</code>
   */
  @java.lang.Override
  public int getMappablesCount() {
    return mappables_.size();
  }
  /**
   * <code>repeated .assetmantle.modules.identities.mappable.Mappable mappables = 1 [json_name = "mappables"];</code>
   */
  @java.lang.Override
  public com.assetmantle.modules.identities.mappable.Mappable getMappables(int index) {
    return mappables_.get(index);
  }
  /**
   * <code>repeated .assetmantle.modules.identities.mappable.Mappable mappables = 1 [json_name = "mappables"];</code>
   */
  @java.lang.Override
  public com.assetmantle.modules.identities.mappable.MappableOrBuilder getMappablesOrBuilder(
      int index) {
    return mappables_.get(index);
  }

  public static final int PARAMETER_LIST_FIELD_NUMBER = 2;
  private com.assetmantle.schema.parameters.base.ParameterList parameterList_;
  /**
   * <code>.assetmantle.schema.parameters.base.ParameterList parameter_list = 2 [json_name = "parameterList"];</code>
   * @return Whether the parameterList field is set.
   */
  @java.lang.Override
  public boolean hasParameterList() {
    return parameterList_ != null;
  }
  /**
   * <code>.assetmantle.schema.parameters.base.ParameterList parameter_list = 2 [json_name = "parameterList"];</code>
   * @return The parameterList.
   */
  @java.lang.Override
  public com.assetmantle.schema.parameters.base.ParameterList getParameterList() {
    return parameterList_ == null ? com.assetmantle.schema.parameters.base.ParameterList.getDefaultInstance() : parameterList_;
  }
  /**
   * <code>.assetmantle.schema.parameters.base.ParameterList parameter_list = 2 [json_name = "parameterList"];</code>
   */
  @java.lang.Override
  public com.assetmantle.schema.parameters.base.ParameterListOrBuilder getParameterListOrBuilder() {
    return parameterList_ == null ? com.assetmantle.schema.parameters.base.ParameterList.getDefaultInstance() : parameterList_;
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
    for (int i = 0; i < mappables_.size(); i++) {
      output.writeMessage(1, mappables_.get(i));
    }
    if (parameterList_ != null) {
      output.writeMessage(2, getParameterList());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < mappables_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, mappables_.get(i));
    }
    if (parameterList_ != null) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(2, getParameterList());
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
    if (!(obj instanceof com.assetmantle.modules.identities.genesis.Genesis)) {
      return super.equals(obj);
    }
    com.assetmantle.modules.identities.genesis.Genesis other = (com.assetmantle.modules.identities.genesis.Genesis) obj;

    if (!getMappablesList()
        .equals(other.getMappablesList())) return false;
    if (hasParameterList() != other.hasParameterList()) return false;
    if (hasParameterList()) {
      if (!getParameterList()
          .equals(other.getParameterList())) return false;
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
    if (getMappablesCount() > 0) {
      hash = (37 * hash) + MAPPABLES_FIELD_NUMBER;
      hash = (53 * hash) + getMappablesList().hashCode();
    }
    if (hasParameterList()) {
      hash = (37 * hash) + PARAMETER_LIST_FIELD_NUMBER;
      hash = (53 * hash) + getParameterList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.assetmantle.modules.identities.genesis.Genesis parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.assetmantle.modules.identities.genesis.Genesis parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.assetmantle.modules.identities.genesis.Genesis parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.assetmantle.modules.identities.genesis.Genesis parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.assetmantle.modules.identities.genesis.Genesis parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.assetmantle.modules.identities.genesis.Genesis parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.assetmantle.modules.identities.genesis.Genesis parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.assetmantle.modules.identities.genesis.Genesis parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static com.assetmantle.modules.identities.genesis.Genesis parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static com.assetmantle.modules.identities.genesis.Genesis parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.assetmantle.modules.identities.genesis.Genesis parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.assetmantle.modules.identities.genesis.Genesis parseFrom(
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
  public static Builder newBuilder(com.assetmantle.modules.identities.genesis.Genesis prototype) {
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
   * Protobuf type {@code assetmantle.modules.identities.genesis.Genesis}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:assetmantle.modules.identities.genesis.Genesis)
      com.assetmantle.modules.identities.genesis.GenesisOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.assetmantle.modules.identities.genesis.GenesisProto.internal_static_assetmantle_modules_identities_genesis_Genesis_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.assetmantle.modules.identities.genesis.GenesisProto.internal_static_assetmantle_modules_identities_genesis_Genesis_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.assetmantle.modules.identities.genesis.Genesis.class, com.assetmantle.modules.identities.genesis.Genesis.Builder.class);
    }

    // Construct using com.assetmantle.modules.identities.genesis.Genesis.newBuilder()
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
      if (mappablesBuilder_ == null) {
        mappables_ = java.util.Collections.emptyList();
      } else {
        mappables_ = null;
        mappablesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      parameterList_ = null;
      if (parameterListBuilder_ != null) {
        parameterListBuilder_.dispose();
        parameterListBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.assetmantle.modules.identities.genesis.GenesisProto.internal_static_assetmantle_modules_identities_genesis_Genesis_descriptor;
    }

    @java.lang.Override
    public com.assetmantle.modules.identities.genesis.Genesis getDefaultInstanceForType() {
      return com.assetmantle.modules.identities.genesis.Genesis.getDefaultInstance();
    }

    @java.lang.Override
    public com.assetmantle.modules.identities.genesis.Genesis build() {
      com.assetmantle.modules.identities.genesis.Genesis result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.assetmantle.modules.identities.genesis.Genesis buildPartial() {
      com.assetmantle.modules.identities.genesis.Genesis result = new com.assetmantle.modules.identities.genesis.Genesis(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.assetmantle.modules.identities.genesis.Genesis result) {
      if (mappablesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          mappables_ = java.util.Collections.unmodifiableList(mappables_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.mappables_ = mappables_;
      } else {
        result.mappables_ = mappablesBuilder_.build();
      }
    }

    private void buildPartial0(com.assetmantle.modules.identities.genesis.Genesis result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.parameterList_ = parameterListBuilder_ == null
            ? parameterList_
            : parameterListBuilder_.build();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.assetmantle.modules.identities.genesis.Genesis) {
        return mergeFrom((com.assetmantle.modules.identities.genesis.Genesis)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.assetmantle.modules.identities.genesis.Genesis other) {
      if (other == com.assetmantle.modules.identities.genesis.Genesis.getDefaultInstance()) return this;
      if (mappablesBuilder_ == null) {
        if (!other.mappables_.isEmpty()) {
          if (mappables_.isEmpty()) {
            mappables_ = other.mappables_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureMappablesIsMutable();
            mappables_.addAll(other.mappables_);
          }
          onChanged();
        }
      } else {
        if (!other.mappables_.isEmpty()) {
          if (mappablesBuilder_.isEmpty()) {
            mappablesBuilder_.dispose();
            mappablesBuilder_ = null;
            mappables_ = other.mappables_;
            bitField0_ = (bitField0_ & ~0x00000001);
            mappablesBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getMappablesFieldBuilder() : null;
          } else {
            mappablesBuilder_.addAllMessages(other.mappables_);
          }
        }
      }
      if (other.hasParameterList()) {
        mergeParameterList(other.getParameterList());
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
              com.assetmantle.modules.identities.mappable.Mappable m =
                  input.readMessage(
                      com.assetmantle.modules.identities.mappable.Mappable.parser(),
                      extensionRegistry);
              if (mappablesBuilder_ == null) {
                ensureMappablesIsMutable();
                mappables_.add(m);
              } else {
                mappablesBuilder_.addMessage(m);
              }
              break;
            } // case 10
            case 18: {
              input.readMessage(
                  getParameterListFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000002;
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

    private java.util.List<com.assetmantle.modules.identities.mappable.Mappable> mappables_ =
      java.util.Collections.emptyList();
    private void ensureMappablesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        mappables_ = new java.util.ArrayList<com.assetmantle.modules.identities.mappable.Mappable>(mappables_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.assetmantle.modules.identities.mappable.Mappable, com.assetmantle.modules.identities.mappable.Mappable.Builder, com.assetmantle.modules.identities.mappable.MappableOrBuilder> mappablesBuilder_;

    /**
     * <code>repeated .assetmantle.modules.identities.mappable.Mappable mappables = 1 [json_name = "mappables"];</code>
     */
    public java.util.List<com.assetmantle.modules.identities.mappable.Mappable> getMappablesList() {
      if (mappablesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(mappables_);
      } else {
        return mappablesBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .assetmantle.modules.identities.mappable.Mappable mappables = 1 [json_name = "mappables"];</code>
     */
    public int getMappablesCount() {
      if (mappablesBuilder_ == null) {
        return mappables_.size();
      } else {
        return mappablesBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .assetmantle.modules.identities.mappable.Mappable mappables = 1 [json_name = "mappables"];</code>
     */
    public com.assetmantle.modules.identities.mappable.Mappable getMappables(int index) {
      if (mappablesBuilder_ == null) {
        return mappables_.get(index);
      } else {
        return mappablesBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .assetmantle.modules.identities.mappable.Mappable mappables = 1 [json_name = "mappables"];</code>
     */
    public Builder setMappables(
        int index, com.assetmantle.modules.identities.mappable.Mappable value) {
      if (mappablesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMappablesIsMutable();
        mappables_.set(index, value);
        onChanged();
      } else {
        mappablesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .assetmantle.modules.identities.mappable.Mappable mappables = 1 [json_name = "mappables"];</code>
     */
    public Builder setMappables(
        int index, com.assetmantle.modules.identities.mappable.Mappable.Builder builderForValue) {
      if (mappablesBuilder_ == null) {
        ensureMappablesIsMutable();
        mappables_.set(index, builderForValue.build());
        onChanged();
      } else {
        mappablesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .assetmantle.modules.identities.mappable.Mappable mappables = 1 [json_name = "mappables"];</code>
     */
    public Builder addMappables(com.assetmantle.modules.identities.mappable.Mappable value) {
      if (mappablesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMappablesIsMutable();
        mappables_.add(value);
        onChanged();
      } else {
        mappablesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .assetmantle.modules.identities.mappable.Mappable mappables = 1 [json_name = "mappables"];</code>
     */
    public Builder addMappables(
        int index, com.assetmantle.modules.identities.mappable.Mappable value) {
      if (mappablesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureMappablesIsMutable();
        mappables_.add(index, value);
        onChanged();
      } else {
        mappablesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .assetmantle.modules.identities.mappable.Mappable mappables = 1 [json_name = "mappables"];</code>
     */
    public Builder addMappables(
        com.assetmantle.modules.identities.mappable.Mappable.Builder builderForValue) {
      if (mappablesBuilder_ == null) {
        ensureMappablesIsMutable();
        mappables_.add(builderForValue.build());
        onChanged();
      } else {
        mappablesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .assetmantle.modules.identities.mappable.Mappable mappables = 1 [json_name = "mappables"];</code>
     */
    public Builder addMappables(
        int index, com.assetmantle.modules.identities.mappable.Mappable.Builder builderForValue) {
      if (mappablesBuilder_ == null) {
        ensureMappablesIsMutable();
        mappables_.add(index, builderForValue.build());
        onChanged();
      } else {
        mappablesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .assetmantle.modules.identities.mappable.Mappable mappables = 1 [json_name = "mappables"];</code>
     */
    public Builder addAllMappables(
        java.lang.Iterable<? extends com.assetmantle.modules.identities.mappable.Mappable> values) {
      if (mappablesBuilder_ == null) {
        ensureMappablesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, mappables_);
        onChanged();
      } else {
        mappablesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .assetmantle.modules.identities.mappable.Mappable mappables = 1 [json_name = "mappables"];</code>
     */
    public Builder clearMappables() {
      if (mappablesBuilder_ == null) {
        mappables_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        mappablesBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .assetmantle.modules.identities.mappable.Mappable mappables = 1 [json_name = "mappables"];</code>
     */
    public Builder removeMappables(int index) {
      if (mappablesBuilder_ == null) {
        ensureMappablesIsMutable();
        mappables_.remove(index);
        onChanged();
      } else {
        mappablesBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .assetmantle.modules.identities.mappable.Mappable mappables = 1 [json_name = "mappables"];</code>
     */
    public com.assetmantle.modules.identities.mappable.Mappable.Builder getMappablesBuilder(
        int index) {
      return getMappablesFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .assetmantle.modules.identities.mappable.Mappable mappables = 1 [json_name = "mappables"];</code>
     */
    public com.assetmantle.modules.identities.mappable.MappableOrBuilder getMappablesOrBuilder(
        int index) {
      if (mappablesBuilder_ == null) {
        return mappables_.get(index);  } else {
        return mappablesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .assetmantle.modules.identities.mappable.Mappable mappables = 1 [json_name = "mappables"];</code>
     */
    public java.util.List<? extends com.assetmantle.modules.identities.mappable.MappableOrBuilder> 
         getMappablesOrBuilderList() {
      if (mappablesBuilder_ != null) {
        return mappablesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(mappables_);
      }
    }
    /**
     * <code>repeated .assetmantle.modules.identities.mappable.Mappable mappables = 1 [json_name = "mappables"];</code>
     */
    public com.assetmantle.modules.identities.mappable.Mappable.Builder addMappablesBuilder() {
      return getMappablesFieldBuilder().addBuilder(
          com.assetmantle.modules.identities.mappable.Mappable.getDefaultInstance());
    }
    /**
     * <code>repeated .assetmantle.modules.identities.mappable.Mappable mappables = 1 [json_name = "mappables"];</code>
     */
    public com.assetmantle.modules.identities.mappable.Mappable.Builder addMappablesBuilder(
        int index) {
      return getMappablesFieldBuilder().addBuilder(
          index, com.assetmantle.modules.identities.mappable.Mappable.getDefaultInstance());
    }
    /**
     * <code>repeated .assetmantle.modules.identities.mappable.Mappable mappables = 1 [json_name = "mappables"];</code>
     */
    public java.util.List<com.assetmantle.modules.identities.mappable.Mappable.Builder> 
         getMappablesBuilderList() {
      return getMappablesFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        com.assetmantle.modules.identities.mappable.Mappable, com.assetmantle.modules.identities.mappable.Mappable.Builder, com.assetmantle.modules.identities.mappable.MappableOrBuilder> 
        getMappablesFieldBuilder() {
      if (mappablesBuilder_ == null) {
        mappablesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            com.assetmantle.modules.identities.mappable.Mappable, com.assetmantle.modules.identities.mappable.Mappable.Builder, com.assetmantle.modules.identities.mappable.MappableOrBuilder>(
                mappables_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        mappables_ = null;
      }
      return mappablesBuilder_;
    }

    private com.assetmantle.schema.parameters.base.ParameterList parameterList_;
    private com.google.protobuf.SingleFieldBuilderV3<
        com.assetmantle.schema.parameters.base.ParameterList, com.assetmantle.schema.parameters.base.ParameterList.Builder, com.assetmantle.schema.parameters.base.ParameterListOrBuilder> parameterListBuilder_;
    /**
     * <code>.assetmantle.schema.parameters.base.ParameterList parameter_list = 2 [json_name = "parameterList"];</code>
     * @return Whether the parameterList field is set.
     */
    public boolean hasParameterList() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>.assetmantle.schema.parameters.base.ParameterList parameter_list = 2 [json_name = "parameterList"];</code>
     * @return The parameterList.
     */
    public com.assetmantle.schema.parameters.base.ParameterList getParameterList() {
      if (parameterListBuilder_ == null) {
        return parameterList_ == null ? com.assetmantle.schema.parameters.base.ParameterList.getDefaultInstance() : parameterList_;
      } else {
        return parameterListBuilder_.getMessage();
      }
    }
    /**
     * <code>.assetmantle.schema.parameters.base.ParameterList parameter_list = 2 [json_name = "parameterList"];</code>
     */
    public Builder setParameterList(com.assetmantle.schema.parameters.base.ParameterList value) {
      if (parameterListBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        parameterList_ = value;
      } else {
        parameterListBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.assetmantle.schema.parameters.base.ParameterList parameter_list = 2 [json_name = "parameterList"];</code>
     */
    public Builder setParameterList(
        com.assetmantle.schema.parameters.base.ParameterList.Builder builderForValue) {
      if (parameterListBuilder_ == null) {
        parameterList_ = builderForValue.build();
      } else {
        parameterListBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.assetmantle.schema.parameters.base.ParameterList parameter_list = 2 [json_name = "parameterList"];</code>
     */
    public Builder mergeParameterList(com.assetmantle.schema.parameters.base.ParameterList value) {
      if (parameterListBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0) &&
          parameterList_ != null &&
          parameterList_ != com.assetmantle.schema.parameters.base.ParameterList.getDefaultInstance()) {
          getParameterListBuilder().mergeFrom(value);
        } else {
          parameterList_ = value;
        }
      } else {
        parameterListBuilder_.mergeFrom(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>.assetmantle.schema.parameters.base.ParameterList parameter_list = 2 [json_name = "parameterList"];</code>
     */
    public Builder clearParameterList() {
      bitField0_ = (bitField0_ & ~0x00000002);
      parameterList_ = null;
      if (parameterListBuilder_ != null) {
        parameterListBuilder_.dispose();
        parameterListBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.assetmantle.schema.parameters.base.ParameterList parameter_list = 2 [json_name = "parameterList"];</code>
     */
    public com.assetmantle.schema.parameters.base.ParameterList.Builder getParameterListBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getParameterListFieldBuilder().getBuilder();
    }
    /**
     * <code>.assetmantle.schema.parameters.base.ParameterList parameter_list = 2 [json_name = "parameterList"];</code>
     */
    public com.assetmantle.schema.parameters.base.ParameterListOrBuilder getParameterListOrBuilder() {
      if (parameterListBuilder_ != null) {
        return parameterListBuilder_.getMessageOrBuilder();
      } else {
        return parameterList_ == null ?
            com.assetmantle.schema.parameters.base.ParameterList.getDefaultInstance() : parameterList_;
      }
    }
    /**
     * <code>.assetmantle.schema.parameters.base.ParameterList parameter_list = 2 [json_name = "parameterList"];</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
        com.assetmantle.schema.parameters.base.ParameterList, com.assetmantle.schema.parameters.base.ParameterList.Builder, com.assetmantle.schema.parameters.base.ParameterListOrBuilder> 
        getParameterListFieldBuilder() {
      if (parameterListBuilder_ == null) {
        parameterListBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
            com.assetmantle.schema.parameters.base.ParameterList, com.assetmantle.schema.parameters.base.ParameterList.Builder, com.assetmantle.schema.parameters.base.ParameterListOrBuilder>(
                getParameterList(),
                getParentForChildren(),
                isClean());
        parameterList_ = null;
      }
      return parameterListBuilder_;
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


    // @@protoc_insertion_point(builder_scope:assetmantle.modules.identities.genesis.Genesis)
  }

  // @@protoc_insertion_point(class_scope:assetmantle.modules.identities.genesis.Genesis)
  private static final com.assetmantle.modules.identities.genesis.Genesis DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.assetmantle.modules.identities.genesis.Genesis();
  }

  public static com.assetmantle.modules.identities.genesis.Genesis getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Genesis>
      PARSER = new com.google.protobuf.AbstractParser<Genesis>() {
    @java.lang.Override
    public Genesis parsePartialFrom(
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

  public static com.google.protobuf.Parser<Genesis> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Genesis> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.assetmantle.modules.identities.genesis.Genesis getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

