// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: assetmantle/metas/queries/meta/query_response.proto

package com.assetmantle.modules.metas.queries.meta;

public final class QueryResponseProto {
  private QueryResponseProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface QueryResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:assetmantle.modules.metas.queries.meta.QueryResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .assetmantle.modules.metas.mappable.Mappable list = 1 [json_name = "list"];</code>
     */
    java.util.List<com.assetmantle.modules.metas.mappable.MappableProto.Mappable> 
        getListList();
    /**
     * <code>repeated .assetmantle.modules.metas.mappable.Mappable list = 1 [json_name = "list"];</code>
     */
    com.assetmantle.modules.metas.mappable.MappableProto.Mappable getList(int index);
    /**
     * <code>repeated .assetmantle.modules.metas.mappable.Mappable list = 1 [json_name = "list"];</code>
     */
    int getListCount();
    /**
     * <code>repeated .assetmantle.modules.metas.mappable.Mappable list = 1 [json_name = "list"];</code>
     */
    java.util.List<? extends com.assetmantle.modules.metas.mappable.MappableProto.MappableOrBuilder> 
        getListOrBuilderList();
    /**
     * <code>repeated .assetmantle.modules.metas.mappable.Mappable list = 1 [json_name = "list"];</code>
     */
    com.assetmantle.modules.metas.mappable.MappableProto.MappableOrBuilder getListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code assetmantle.modules.metas.queries.meta.QueryResponse}
   */
  public static final class QueryResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:assetmantle.modules.metas.queries.meta.QueryResponse)
      QueryResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use QueryResponse.newBuilder() to construct.
    private QueryResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private QueryResponse() {
      list_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new QueryResponse();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.assetmantle.modules.metas.queries.meta.QueryResponseProto.internal_static_assetmantle_modules_metas_queries_meta_QueryResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.assetmantle.modules.metas.queries.meta.QueryResponseProto.internal_static_assetmantle_modules_metas_queries_meta_QueryResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse.class, com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse.Builder.class);
    }

    public static final int LIST_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private java.util.List<com.assetmantle.modules.metas.mappable.MappableProto.Mappable> list_;
    /**
     * <code>repeated .assetmantle.modules.metas.mappable.Mappable list = 1 [json_name = "list"];</code>
     */
    @java.lang.Override
    public java.util.List<com.assetmantle.modules.metas.mappable.MappableProto.Mappable> getListList() {
      return list_;
    }
    /**
     * <code>repeated .assetmantle.modules.metas.mappable.Mappable list = 1 [json_name = "list"];</code>
     */
    @java.lang.Override
    public java.util.List<? extends com.assetmantle.modules.metas.mappable.MappableProto.MappableOrBuilder> 
        getListOrBuilderList() {
      return list_;
    }
    /**
     * <code>repeated .assetmantle.modules.metas.mappable.Mappable list = 1 [json_name = "list"];</code>
     */
    @java.lang.Override
    public int getListCount() {
      return list_.size();
    }
    /**
     * <code>repeated .assetmantle.modules.metas.mappable.Mappable list = 1 [json_name = "list"];</code>
     */
    @java.lang.Override
    public com.assetmantle.modules.metas.mappable.MappableProto.Mappable getList(int index) {
      return list_.get(index);
    }
    /**
     * <code>repeated .assetmantle.modules.metas.mappable.Mappable list = 1 [json_name = "list"];</code>
     */
    @java.lang.Override
    public com.assetmantle.modules.metas.mappable.MappableProto.MappableOrBuilder getListOrBuilder(
        int index) {
      return list_.get(index);
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
      for (int i = 0; i < list_.size(); i++) {
        output.writeMessage(1, list_.get(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < list_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, list_.get(i));
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
      if (!(obj instanceof com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse)) {
        return super.equals(obj);
      }
      com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse other = (com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse) obj;

      if (!getListList()
          .equals(other.getListList())) return false;
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
      if (getListCount() > 0) {
        hash = (37 * hash) + LIST_FIELD_NUMBER;
        hash = (53 * hash) + getListList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse parseFrom(
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
    public static Builder newBuilder(com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse prototype) {
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
     * Protobuf type {@code assetmantle.modules.metas.queries.meta.QueryResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:assetmantle.modules.metas.queries.meta.QueryResponse)
        com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.assetmantle.modules.metas.queries.meta.QueryResponseProto.internal_static_assetmantle_modules_metas_queries_meta_QueryResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.assetmantle.modules.metas.queries.meta.QueryResponseProto.internal_static_assetmantle_modules_metas_queries_meta_QueryResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse.class, com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse.Builder.class);
      }

      // Construct using com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse.newBuilder()
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
        if (listBuilder_ == null) {
          list_ = java.util.Collections.emptyList();
        } else {
          list_ = null;
          listBuilder_.clear();
        }
        bitField0_ = (bitField0_ & ~0x00000001);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.assetmantle.modules.metas.queries.meta.QueryResponseProto.internal_static_assetmantle_modules_metas_queries_meta_QueryResponse_descriptor;
      }

      @java.lang.Override
      public com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse getDefaultInstanceForType() {
        return com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse.getDefaultInstance();
      }

      @java.lang.Override
      public com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse build() {
        com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse buildPartial() {
        com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse result = new com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse(this);
        buildPartialRepeatedFields(result);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartialRepeatedFields(com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse result) {
        if (listBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            list_ = java.util.Collections.unmodifiableList(list_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.list_ = list_;
        } else {
          result.list_ = listBuilder_.build();
        }
      }

      private void buildPartial0(com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse result) {
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
        if (other instanceof com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse) {
          return mergeFrom((com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse other) {
        if (other == com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse.getDefaultInstance()) return this;
        if (listBuilder_ == null) {
          if (!other.list_.isEmpty()) {
            if (list_.isEmpty()) {
              list_ = other.list_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureListIsMutable();
              list_.addAll(other.list_);
            }
            onChanged();
          }
        } else {
          if (!other.list_.isEmpty()) {
            if (listBuilder_.isEmpty()) {
              listBuilder_.dispose();
              listBuilder_ = null;
              list_ = other.list_;
              bitField0_ = (bitField0_ & ~0x00000001);
              listBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getListFieldBuilder() : null;
            } else {
              listBuilder_.addAllMessages(other.list_);
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
                com.assetmantle.modules.metas.mappable.MappableProto.Mappable m =
                    input.readMessage(
                        com.assetmantle.modules.metas.mappable.MappableProto.Mappable.parser(),
                        extensionRegistry);
                if (listBuilder_ == null) {
                  ensureListIsMutable();
                  list_.add(m);
                } else {
                  listBuilder_.addMessage(m);
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

      private java.util.List<com.assetmantle.modules.metas.mappable.MappableProto.Mappable> list_ =
        java.util.Collections.emptyList();
      private void ensureListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          list_ = new java.util.ArrayList<com.assetmantle.modules.metas.mappable.MappableProto.Mappable>(list_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.assetmantle.modules.metas.mappable.MappableProto.Mappable, com.assetmantle.modules.metas.mappable.MappableProto.Mappable.Builder, com.assetmantle.modules.metas.mappable.MappableProto.MappableOrBuilder> listBuilder_;

      /**
       * <code>repeated .assetmantle.modules.metas.mappable.Mappable list = 1 [json_name = "list"];</code>
       */
      public java.util.List<com.assetmantle.modules.metas.mappable.MappableProto.Mappable> getListList() {
        if (listBuilder_ == null) {
          return java.util.Collections.unmodifiableList(list_);
        } else {
          return listBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .assetmantle.modules.metas.mappable.Mappable list = 1 [json_name = "list"];</code>
       */
      public int getListCount() {
        if (listBuilder_ == null) {
          return list_.size();
        } else {
          return listBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .assetmantle.modules.metas.mappable.Mappable list = 1 [json_name = "list"];</code>
       */
      public com.assetmantle.modules.metas.mappable.MappableProto.Mappable getList(int index) {
        if (listBuilder_ == null) {
          return list_.get(index);
        } else {
          return listBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .assetmantle.modules.metas.mappable.Mappable list = 1 [json_name = "list"];</code>
       */
      public Builder setList(
          int index, com.assetmantle.modules.metas.mappable.MappableProto.Mappable value) {
        if (listBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureListIsMutable();
          list_.set(index, value);
          onChanged();
        } else {
          listBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .assetmantle.modules.metas.mappable.Mappable list = 1 [json_name = "list"];</code>
       */
      public Builder setList(
          int index, com.assetmantle.modules.metas.mappable.MappableProto.Mappable.Builder builderForValue) {
        if (listBuilder_ == null) {
          ensureListIsMutable();
          list_.set(index, builderForValue.build());
          onChanged();
        } else {
          listBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .assetmantle.modules.metas.mappable.Mappable list = 1 [json_name = "list"];</code>
       */
      public Builder addList(com.assetmantle.modules.metas.mappable.MappableProto.Mappable value) {
        if (listBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureListIsMutable();
          list_.add(value);
          onChanged();
        } else {
          listBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .assetmantle.modules.metas.mappable.Mappable list = 1 [json_name = "list"];</code>
       */
      public Builder addList(
          int index, com.assetmantle.modules.metas.mappable.MappableProto.Mappable value) {
        if (listBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureListIsMutable();
          list_.add(index, value);
          onChanged();
        } else {
          listBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .assetmantle.modules.metas.mappable.Mappable list = 1 [json_name = "list"];</code>
       */
      public Builder addList(
          com.assetmantle.modules.metas.mappable.MappableProto.Mappable.Builder builderForValue) {
        if (listBuilder_ == null) {
          ensureListIsMutable();
          list_.add(builderForValue.build());
          onChanged();
        } else {
          listBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .assetmantle.modules.metas.mappable.Mappable list = 1 [json_name = "list"];</code>
       */
      public Builder addList(
          int index, com.assetmantle.modules.metas.mappable.MappableProto.Mappable.Builder builderForValue) {
        if (listBuilder_ == null) {
          ensureListIsMutable();
          list_.add(index, builderForValue.build());
          onChanged();
        } else {
          listBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .assetmantle.modules.metas.mappable.Mappable list = 1 [json_name = "list"];</code>
       */
      public Builder addAllList(
          java.lang.Iterable<? extends com.assetmantle.modules.metas.mappable.MappableProto.Mappable> values) {
        if (listBuilder_ == null) {
          ensureListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, list_);
          onChanged();
        } else {
          listBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .assetmantle.modules.metas.mappable.Mappable list = 1 [json_name = "list"];</code>
       */
      public Builder clearList() {
        if (listBuilder_ == null) {
          list_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          listBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .assetmantle.modules.metas.mappable.Mappable list = 1 [json_name = "list"];</code>
       */
      public Builder removeList(int index) {
        if (listBuilder_ == null) {
          ensureListIsMutable();
          list_.remove(index);
          onChanged();
        } else {
          listBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .assetmantle.modules.metas.mappable.Mappable list = 1 [json_name = "list"];</code>
       */
      public com.assetmantle.modules.metas.mappable.MappableProto.Mappable.Builder getListBuilder(
          int index) {
        return getListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .assetmantle.modules.metas.mappable.Mappable list = 1 [json_name = "list"];</code>
       */
      public com.assetmantle.modules.metas.mappable.MappableProto.MappableOrBuilder getListOrBuilder(
          int index) {
        if (listBuilder_ == null) {
          return list_.get(index);  } else {
          return listBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .assetmantle.modules.metas.mappable.Mappable list = 1 [json_name = "list"];</code>
       */
      public java.util.List<? extends com.assetmantle.modules.metas.mappable.MappableProto.MappableOrBuilder> 
           getListOrBuilderList() {
        if (listBuilder_ != null) {
          return listBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(list_);
        }
      }
      /**
       * <code>repeated .assetmantle.modules.metas.mappable.Mappable list = 1 [json_name = "list"];</code>
       */
      public com.assetmantle.modules.metas.mappable.MappableProto.Mappable.Builder addListBuilder() {
        return getListFieldBuilder().addBuilder(
            com.assetmantle.modules.metas.mappable.MappableProto.Mappable.getDefaultInstance());
      }
      /**
       * <code>repeated .assetmantle.modules.metas.mappable.Mappable list = 1 [json_name = "list"];</code>
       */
      public com.assetmantle.modules.metas.mappable.MappableProto.Mappable.Builder addListBuilder(
          int index) {
        return getListFieldBuilder().addBuilder(
            index, com.assetmantle.modules.metas.mappable.MappableProto.Mappable.getDefaultInstance());
      }
      /**
       * <code>repeated .assetmantle.modules.metas.mappable.Mappable list = 1 [json_name = "list"];</code>
       */
      public java.util.List<com.assetmantle.modules.metas.mappable.MappableProto.Mappable.Builder> 
           getListBuilderList() {
        return getListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          com.assetmantle.modules.metas.mappable.MappableProto.Mappable, com.assetmantle.modules.metas.mappable.MappableProto.Mappable.Builder, com.assetmantle.modules.metas.mappable.MappableProto.MappableOrBuilder> 
          getListFieldBuilder() {
        if (listBuilder_ == null) {
          listBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              com.assetmantle.modules.metas.mappable.MappableProto.Mappable, com.assetmantle.modules.metas.mappable.MappableProto.Mappable.Builder, com.assetmantle.modules.metas.mappable.MappableProto.MappableOrBuilder>(
                  list_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          list_ = null;
        }
        return listBuilder_;
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


      // @@protoc_insertion_point(builder_scope:assetmantle.modules.metas.queries.meta.QueryResponse)
    }

    // @@protoc_insertion_point(class_scope:assetmantle.modules.metas.queries.meta.QueryResponse)
    private static final com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse();
    }

    public static com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<QueryResponse>
        PARSER = new com.google.protobuf.AbstractParser<QueryResponse>() {
      @java.lang.Override
      public QueryResponse parsePartialFrom(
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

    public static com.google.protobuf.Parser<QueryResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<QueryResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public com.assetmantle.modules.metas.queries.meta.QueryResponseProto.QueryResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_assetmantle_modules_metas_queries_meta_QueryResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_assetmantle_modules_metas_queries_meta_QueryResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3assetmantle/metas/queries/meta/query_r" +
      "esponse.proto\022&assetmantle.modules.metas" +
      ".queries.meta\032\024gogoproto/gogo.proto\032)ass" +
      "etmantle/metas/mappable/mappable.proto\"W" +
      "\n\rQueryResponse\022@\n\004list\030\001 \003(\0132,.assetman" +
      "tle.modules.metas.mappable.MappableR\004lis" +
      "t:\004\210\240\037\000B\374\001\n*com.assetmantle.modules.meta" +
      "s.queries.metaB\022QueryResponseProto\242\002\005AMM" +
      "QM\252\002&Assetmantle.Modules.Metas.Queries.M" +
      "eta\312\002&Assetmantle\\Modules\\Metas\\Queries\\" +
      "Meta\342\0022Assetmantle\\Modules\\Metas\\Queries" +
      "\\Meta\\GPBMetadata\352\002*Assetmantle::Modules" +
      "::Metas::Queries::Metab\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          com.gogoproto.GogoProto.getDescriptor(),
          com.assetmantle.modules.metas.mappable.MappableProto.getDescriptor(),
        });
    internal_static_assetmantle_modules_metas_queries_meta_QueryResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_assetmantle_modules_metas_queries_meta_QueryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_assetmantle_modules_metas_queries_meta_QueryResponse_descriptor,
        new java.lang.String[] { "List", });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.gogoproto.GogoProto.goprotoGetters);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
    com.gogoproto.GogoProto.getDescriptor();
    com.assetmantle.modules.metas.mappable.MappableProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
