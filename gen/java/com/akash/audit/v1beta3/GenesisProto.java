// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: akash/audit/v1beta3/genesis.proto

package com.akash.audit.v1beta3;

public final class GenesisProto {
  private GenesisProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface GenesisStateOrBuilder extends
      // @@protoc_insertion_point(interface_extends:akash.audit.v1beta3.GenesisState)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .akash.audit.v1beta3.AuditedAttributes attributes = 1 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;""];</code>
     */
    java.util.List<com.akash.audit.v1beta3.AuditProto.AuditedAttributes> 
        getAttributesList();
    /**
     * <code>repeated .akash.audit.v1beta3.AuditedAttributes attributes = 1 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;""];</code>
     */
    com.akash.audit.v1beta3.AuditProto.AuditedAttributes getAttributes(int index);
    /**
     * <code>repeated .akash.audit.v1beta3.AuditedAttributes attributes = 1 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;""];</code>
     */
    int getAttributesCount();
    /**
     * <code>repeated .akash.audit.v1beta3.AuditedAttributes attributes = 1 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;""];</code>
     */
    java.util.List<? extends com.akash.audit.v1beta3.AuditProto.AuditedAttributesOrBuilder> 
        getAttributesOrBuilderList();
    /**
     * <code>repeated .akash.audit.v1beta3.AuditedAttributes attributes = 1 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;""];</code>
     */
    com.akash.audit.v1beta3.AuditProto.AuditedAttributesOrBuilder getAttributesOrBuilder(
        int index);
  }
  /**
   * <pre>
   * GenesisState defines the basic genesis state used by audit module
   * </pre>
   *
   * Protobuf type {@code akash.audit.v1beta3.GenesisState}
   */
  public static final class GenesisState extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:akash.audit.v1beta3.GenesisState)
      GenesisStateOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use GenesisState.newBuilder() to construct.
    private GenesisState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private GenesisState() {
      attributes_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new GenesisState();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.akash.audit.v1beta3.GenesisProto.internal_static_akash_audit_v1beta3_GenesisState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.akash.audit.v1beta3.GenesisProto.internal_static_akash_audit_v1beta3_GenesisState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.akash.audit.v1beta3.GenesisProto.GenesisState.class, com.akash.audit.v1beta3.GenesisProto.GenesisState.Builder.class);
    }

    public static final int ATTRIBUTES_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private java.util.List<com.akash.audit.v1beta3.AuditProto.AuditedAttributes> attributes_;
    /**
     * <code>repeated .akash.audit.v1beta3.AuditedAttributes attributes = 1 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;""];</code>
     */
    @java.lang.Override
    public java.util.List<com.akash.audit.v1beta3.AuditProto.AuditedAttributes> getAttributesList() {
      return attributes_;
    }
    /**
     * <code>repeated .akash.audit.v1beta3.AuditedAttributes attributes = 1 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;""];</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.akash.audit.v1beta3.AuditProto.AuditedAttributesOrBuilder> 
        getAttributesOrBuilderList() {
      return attributes_;
    }
    /**
     * <code>repeated .akash.audit.v1beta3.AuditedAttributes attributes = 1 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;""];</code>
     */
    @java.lang.Override
    public int getAttributesCount() {
      return attributes_.size();
    }
    /**
     * <code>repeated .akash.audit.v1beta3.AuditedAttributes attributes = 1 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;""];</code>
     */
    @java.lang.Override
    public com.akash.audit.v1beta3.AuditProto.AuditedAttributes getAttributes(int index) {
      return attributes_.get(index);
    }
    /**
     * <code>repeated .akash.audit.v1beta3.AuditedAttributes attributes = 1 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;""];</code>
     */
    @java.lang.Override
    public com.akash.audit.v1beta3.AuditProto.AuditedAttributesOrBuilder getAttributesOrBuilder(
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
      for (int i = 0; i < attributes_.size(); i++) {
        output.writeMessage(1, attributes_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < attributes_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, attributes_.get(i));
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
      if (!(obj instanceof com.akash.audit.v1beta3.GenesisProto.GenesisState)) {
        return super.equals(obj);
      }
      com.akash.audit.v1beta3.GenesisProto.GenesisState other = (com.akash.audit.v1beta3.GenesisProto.GenesisState) obj;

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
      if (getAttributesCount() > 0) {
        hash = (37 * hash) + ATTRIBUTES_FIELD_NUMBER;
        hash = (53 * hash) + getAttributesList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.akash.audit.v1beta3.GenesisProto.GenesisState parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akash.audit.v1beta3.GenesisProto.GenesisState parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akash.audit.v1beta3.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akash.audit.v1beta3.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akash.audit.v1beta3.GenesisProto.GenesisState parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.akash.audit.v1beta3.GenesisProto.GenesisState parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.akash.audit.v1beta3.GenesisProto.GenesisState parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akash.audit.v1beta3.GenesisProto.GenesisState parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.akash.audit.v1beta3.GenesisProto.GenesisState parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.akash.audit.v1beta3.GenesisProto.GenesisState parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.akash.audit.v1beta3.GenesisProto.GenesisState parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.akash.audit.v1beta3.GenesisProto.GenesisState parseFrom(
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
    public static Builder newBuilder(com.akash.audit.v1beta3.GenesisProto.GenesisState prototype) {
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
     * GenesisState defines the basic genesis state used by audit module
     * </pre>
     *
     * Protobuf type {@code akash.audit.v1beta3.GenesisState}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:akash.audit.v1beta3.GenesisState)
        com.akash.audit.v1beta3.GenesisProto.GenesisStateOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.akash.audit.v1beta3.GenesisProto.internal_static_akash_audit_v1beta3_GenesisState_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.akash.audit.v1beta3.GenesisProto.internal_static_akash_audit_v1beta3_GenesisState_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.akash.audit.v1beta3.GenesisProto.GenesisState.class, com.akash.audit.v1beta3.GenesisProto.GenesisState.Builder.class);
      }

      // Construct using com.akash.audit.v1beta3.GenesisProto.GenesisState.newBuilder()
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
        if (attributesBuilder_ == null) {
          attributes_ = java.util.Collections.emptyList();
        } else {
          attributes_ = null;
          attributesBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.akash.audit.v1beta3.GenesisProto.internal_static_akash_audit_v1beta3_GenesisState_descriptor;
      }

      @java.lang.Override
      public com.akash.audit.v1beta3.GenesisProto.GenesisState getDefaultInstanceForType() {
        return com.akash.audit.v1beta3.GenesisProto.GenesisState.getDefaultInstance();
      }

      @java.lang.Override
      public com.akash.audit.v1beta3.GenesisProto.GenesisState build() {
        com.akash.audit.v1beta3.GenesisProto.GenesisState result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.akash.audit.v1beta3.GenesisProto.GenesisState buildPartial() {
        com.akash.audit.v1beta3.GenesisProto.GenesisState result = new com.akash.audit.v1beta3.GenesisProto.GenesisState(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(com.akash.audit.v1beta3.GenesisProto.GenesisState result) {
        if (attributesBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            attributes_ = java.util.Collections.unmodifiableList(attributes_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.attributes_ = attributes_;
        } else {
          result.attributes_ = attributesBuilder_.build();
        }
      }

      private void buildPartial0(com.akash.audit.v1beta3.GenesisProto.GenesisState result) {
        int from_bitField0_ = bitField0_;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.akash.audit.v1beta3.GenesisProto.GenesisState) {
          return mergeFrom((com.akash.audit.v1beta3.GenesisProto.GenesisState)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.akash.audit.v1beta3.GenesisProto.GenesisState other) {
        if (other == com.akash.audit.v1beta3.GenesisProto.GenesisState.getDefaultInstance()) return this;
        if (attributesBuilder_ == null) {
          if (!other.attributes_.isEmpty()) {
            if (attributes_.isEmpty()) {
              attributes_ = other.attributes_;
              bitField0_ = (bitField0_ & ~0x00000001);
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
              bitField0_ = (bitField0_ & ~0x00000001);
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
                com.akash.audit.v1beta3.AuditProto.AuditedAttributes m =
                    input.readMessage(
                        com.akash.audit.v1beta3.AuditProto.AuditedAttributes.parser(),
                        extensionRegistry);
                if (attributesBuilder_ == null) {
                  ensureAttributesIsMutable();
                  attributes_.add(m);
                } else {
                  attributesBuilder_.addMessage(m);
                }
                break;
              } // case 10
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

      private java.util.List<com.akash.audit.v1beta3.AuditProto.AuditedAttributes> attributes_ =
        java.util.Collections.emptyList();
      private void ensureAttributesIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          attributes_ = new java.util.ArrayList<com.akash.audit.v1beta3.AuditProto.AuditedAttributes>(attributes_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.akash.audit.v1beta3.AuditProto.AuditedAttributes, com.akash.audit.v1beta3.AuditProto.AuditedAttributes.Builder, com.akash.audit.v1beta3.AuditProto.AuditedAttributesOrBuilder> attributesBuilder_;

      /**
       * <code>repeated .akash.audit.v1beta3.AuditedAttributes attributes = 1 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;""];</code>
       */
      public java.util.List<com.akash.audit.v1beta3.AuditProto.AuditedAttributes> getAttributesList() {
        if (attributesBuilder_ == null) {
          return java.util.Collections.unmodifiableList(attributes_);
        } else {
          return attributesBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .akash.audit.v1beta3.AuditedAttributes attributes = 1 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;""];</code>
       */
      public int getAttributesCount() {
        if (attributesBuilder_ == null) {
          return attributes_.size();
        } else {
          return attributesBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .akash.audit.v1beta3.AuditedAttributes attributes = 1 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;""];</code>
       */
      public com.akash.audit.v1beta3.AuditProto.AuditedAttributes getAttributes(int index) {
        if (attributesBuilder_ == null) {
          return attributes_.get(index);
        } else {
          return attributesBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .akash.audit.v1beta3.AuditedAttributes attributes = 1 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;""];</code>
       */
      public Builder setAttributes(
          int index, com.akash.audit.v1beta3.AuditProto.AuditedAttributes value) {
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
       * <code>repeated .akash.audit.v1beta3.AuditedAttributes attributes = 1 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;""];</code>
       */
      public Builder setAttributes(
          int index, com.akash.audit.v1beta3.AuditProto.AuditedAttributes.Builder builderForValue) {
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
       * <code>repeated .akash.audit.v1beta3.AuditedAttributes attributes = 1 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;""];</code>
       */
      public Builder addAttributes(com.akash.audit.v1beta3.AuditProto.AuditedAttributes value) {
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
       * <code>repeated .akash.audit.v1beta3.AuditedAttributes attributes = 1 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;""];</code>
       */
      public Builder addAttributes(
          int index, com.akash.audit.v1beta3.AuditProto.AuditedAttributes value) {
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
       * <code>repeated .akash.audit.v1beta3.AuditedAttributes attributes = 1 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;""];</code>
       */
      public Builder addAttributes(
          com.akash.audit.v1beta3.AuditProto.AuditedAttributes.Builder builderForValue) {
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
       * <code>repeated .akash.audit.v1beta3.AuditedAttributes attributes = 1 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;""];</code>
       */
      public Builder addAttributes(
          int index, com.akash.audit.v1beta3.AuditProto.AuditedAttributes.Builder builderForValue) {
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
       * <code>repeated .akash.audit.v1beta3.AuditedAttributes attributes = 1 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;""];</code>
       */
      public Builder addAllAttributes(
          java.lang.Iterable<? extends com.akash.audit.v1beta3.AuditProto.AuditedAttributes> values) {
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
       * <code>repeated .akash.audit.v1beta3.AuditedAttributes attributes = 1 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;""];</code>
       */
      public Builder clearAttributes() {
        if (attributesBuilder_ == null) {
          attributes_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          attributesBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .akash.audit.v1beta3.AuditedAttributes attributes = 1 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;""];</code>
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
       * <code>repeated .akash.audit.v1beta3.AuditedAttributes attributes = 1 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;""];</code>
       */
      public com.akash.audit.v1beta3.AuditProto.AuditedAttributes.Builder getAttributesBuilder(
          int index) {
        return getAttributesFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .akash.audit.v1beta3.AuditedAttributes attributes = 1 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;""];</code>
       */
      public com.akash.audit.v1beta3.AuditProto.AuditedAttributesOrBuilder getAttributesOrBuilder(
          int index) {
        if (attributesBuilder_ == null) {
          return attributes_.get(index);  } else {
          return attributesBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .akash.audit.v1beta3.AuditedAttributes attributes = 1 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;""];</code>
       */
      public java.util.List<? extends com.akash.audit.v1beta3.AuditProto.AuditedAttributesOrBuilder> 
           getAttributesOrBuilderList() {
        if (attributesBuilder_ != null) {
          return attributesBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(attributes_);
        }
      }
      /**
       * <code>repeated .akash.audit.v1beta3.AuditedAttributes attributes = 1 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;""];</code>
       */
      public com.akash.audit.v1beta3.AuditProto.AuditedAttributes.Builder addAttributesBuilder() {
        return getAttributesFieldBuilder().addBuilder(
            com.akash.audit.v1beta3.AuditProto.AuditedAttributes.getDefaultInstance());
      }
      /**
       * <code>repeated .akash.audit.v1beta3.AuditedAttributes attributes = 1 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;""];</code>
       */
      public com.akash.audit.v1beta3.AuditProto.AuditedAttributes.Builder addAttributesBuilder(
          int index) {
        return getAttributesFieldBuilder().addBuilder(
            index, com.akash.audit.v1beta3.AuditProto.AuditedAttributes.getDefaultInstance());
      }
      /**
       * <code>repeated .akash.audit.v1beta3.AuditedAttributes attributes = 1 [json_name = "attributes", (.gogoproto.nullable) = false, (.gogoproto.jsontag) = "attributes", (.gogoproto.moretags) = "yaml:&#92;"attributes&#92;""];</code>
       */
      public java.util.List<com.akash.audit.v1beta3.AuditProto.AuditedAttributes.Builder> 
           getAttributesBuilderList() {
        return getAttributesFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.akash.audit.v1beta3.AuditProto.AuditedAttributes, com.akash.audit.v1beta3.AuditProto.AuditedAttributes.Builder, com.akash.audit.v1beta3.AuditProto.AuditedAttributesOrBuilder> 
          getAttributesFieldBuilder() {
        if (attributesBuilder_ == null) {
          attributesBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.akash.audit.v1beta3.AuditProto.AuditedAttributes, com.akash.audit.v1beta3.AuditProto.AuditedAttributes.Builder, com.akash.audit.v1beta3.AuditProto.AuditedAttributesOrBuilder>(
                  attributes_,
                  ((bitField0_ & 0x00000001) != 0),
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


      // @@protoc_insertion_point(builder_scope:akash.audit.v1beta3.GenesisState)
    }

    // @@protoc_insertion_point(class_scope:akash.audit.v1beta3.GenesisState)
    private static final com.akash.audit.v1beta3.GenesisProto.GenesisState DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.akash.audit.v1beta3.GenesisProto.GenesisState();
    }

    public static com.akash.audit.v1beta3.GenesisProto.GenesisState getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<GenesisState>
        PARSER = new com.google.protobuf.AbstractParser<GenesisState>() {
      @java.lang.Override
      public GenesisState parsePartialFrom(
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

    public static com.google.protobuf.Parser<GenesisState> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<GenesisState> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.akash.audit.v1beta3.GenesisProto.GenesisState getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_akash_audit_v1beta3_GenesisState_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_akash_audit_v1beta3_GenesisState_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n!akash/audit/v1beta3/genesis.proto\022\023aka" +
      "sh.audit.v1beta3\032\024gogoproto/gogo.proto\032\037" +
      "akash/audit/v1beta3/audit.proto\"\177\n\014Genes" +
      "isState\022o\n\nattributes\030\001 \003(\0132&.akash.audi" +
      "t.v1beta3.AuditedAttributesB\'\310\336\037\000\352\336\037\natt" +
      "ributes\362\336\037\021yaml:\"attributes\"R\nattributes" +
      "B\315\001\n\027com.akash.audit.v1beta3B\014GenesisPro" +
      "toZ8github.com/akash-network/akash-api/g" +
      "o/node/audit/v1beta3\242\002\003AAX\252\002\023Akash.Audit" +
      ".V1beta3\312\002\023Akash\\Audit\\V1beta3\342\002\037Akash\\A" +
      "udit\\V1beta3\\GPBMetadata\352\002\025Akash::Audit:" +
      ":V1beta3b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.akash.audit.v1beta3.AuditProto.getDescriptor(),
        });
    internal_static_akash_audit_v1beta3_GenesisState_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_akash_audit_v1beta3_GenesisState_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_akash_audit_v1beta3_GenesisState_descriptor,
        new java.lang.String[] { "Attributes", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.jsontag);
    registry.add(com.gogoproto.GogoProto.moretags);
    registry.add(com.gogoproto.GogoProto.nullable);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.akash.audit.v1beta3.AuditProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}